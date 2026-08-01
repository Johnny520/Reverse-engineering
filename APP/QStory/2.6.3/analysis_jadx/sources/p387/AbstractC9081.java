package p387;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰哲子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f25455 = 0;

    static {
        ZoneId.systemDefault().getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14658(String str) {
        str.getClass();
        Instant instant = Instant.parse(str);
        long jBetween = ChronoUnit.SECONDS.between(instant, Instant.now());
        if (jBetween < 60) {
            return jBetween + "秒前";
        }
        if (jBetween < 3600) {
            return (jBetween / 60) + "分钟前";
        }
        if (jBetween < 86400) {
            return (jBetween / 3600) + "小时前";
        }
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        long jBetween2 = ChronoUnit.DAYS.between(localDate, localDateNow);
        if (jBetween2 == 1) {
            return "昨天";
        }
        if (jBetween2 == 2) {
            return "前天";
        }
        return localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth();
    }
}
