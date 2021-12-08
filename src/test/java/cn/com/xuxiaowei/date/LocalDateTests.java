package cn.com.xuxiaowei.date;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;

/**
 * 时间 测试类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
class LocalDateTests {

    @Test
    void format() {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse("2021-02-20", dateTimeFormatter);
            log.info(String.valueOf(localDate));
        } catch (Exception e) {
            log.error("日期不合规", e);
        }
    }

    @Test
    void format2() {
        try {
            // 严格模式
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse("2021-02-30", dateTimeFormatter);
            log.info(String.valueOf(localDate));
        } catch (Exception e) {
            log.error("日期不合规", e);
        }
    }

    @Test
    void format3() {
        try {
            // 严格模式
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd").withResolverStyle(ResolverStyle.STRICT);
            LocalDate localDate = LocalDate.parse("2021-02-30", dateTimeFormatter);
            log.info(String.valueOf(localDate));
        } catch (Exception e) {
            log.error("日期不合规", e);
        }
    }

}
