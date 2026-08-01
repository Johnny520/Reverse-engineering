package p387;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/* JADX INFO: renamed from: 飘花落叶言苏楪兰哲世子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f25417 = 0;

    static {
        ZoneId.systemDefault().getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m14604(String str) {
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
