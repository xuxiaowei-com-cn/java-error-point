package cn.com.xuxiaowei.date;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间 测试类
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Slf4j
class DateTests {

    @Test
    void format() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = format.parse("2021-02-20");
            log.info(String.valueOf(parse));
        } catch (ParseException e) {
            log.error("日期不合规", e);
        }
    }

    @Test
    void format2() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = format.parse("2021-02-30");
            log.info(String.valueOf(parse));
        } catch (ParseException e) {
            log.error("日期不合规", e);
        }
    }

    @Test
    void format3() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            format.setLenient(false);
            Date parse = format.parse("2021-02-30");
            log.info(String.valueOf(parse));
        } catch (ParseException e) {
            log.error("日期不合规", e);
        }
    }

}
