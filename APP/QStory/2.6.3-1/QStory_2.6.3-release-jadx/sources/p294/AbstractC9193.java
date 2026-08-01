package p294;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9193 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23411;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f23412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f23413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f23414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f23415;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f23416;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean f23417;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean f23418;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DateTimeFormatter f23419;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f23420;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23421;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f23422;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f23423;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Locale f23424;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f23425;

    public AbstractC9193(String str, Locale locale) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        str = str != null ? str.replace("aa", "a") : str;
        this.f23415 = str;
        this.f23424 = locale;
        this.f23423 = "yyyyMMddHHmmss".equals(str);
        this.f23425 = "yyyy-MM-dd HH:mm:ss".equals(str);
        this.f23422 = "yyyy-MM-dd HH:mm".equals(str);
        this.f23417 = "yyyy-MM-dd".equals(str);
        this.f23416 = "yyyyMMdd".equals(str);
        this.f23418 = "yyyy-MM-dd'T'HH:mm:ssXXX".equals(str);
        boolean z5 = false;
        if (str != null) {
            z2 = true;
            switch (str) {
                case "millis":
                    z = false;
                    z3 = false;
                    break;
                case "unixtime":
                    z = false;
                    z3 = false;
                    z4 = false;
                    z5 = true;
                    z2 = z4;
                    break;
                case "iso8601":
                    z3 = false;
                    z4 = false;
                    z = true;
                    z2 = z4;
                    break;
                default:
                    boolean z6 = str.indexOf(100) != -1;
                    if (str.indexOf(72) == -1 && str.indexOf(104) == -1 && str.indexOf(75) == -1 && str.indexOf(107) == -1) {
                        z2 = false;
                    }
                    z3 = z6;
                    z4 = z2;
                    z = false;
                    z2 = false;
                    break;
            }
            this.f23414 = z5;
            this.f23413 = z2;
            this.f23412 = z;
            this.f23411 = z3;
            this.f23421 = z4;
            this.f23420 = "yyyyMMddHHmmssSSSZ".equals(str);
        }
        z = false;
        z2 = false;
        z3 = false;
        z4 = z3;
        this.f23414 = z5;
        this.f23413 = z2;
        this.f23412 = z;
        this.f23411 = z3;
        this.f23421 = z4;
        this.f23420 = "yyyyMMddHHmmssSSSZ".equals(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final DateTimeFormatter m14427() {
        String str = this.f23415;
        if (str == null || this.f23413 || this.f23412 || this.f23414) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = this.f23419;
        Locale locale = this.f23424;
        if (dateTimeFormatter != null && (locale == null || (locale != null && locale.equals(null)))) {
            return this.f23419;
        }
        if (locale == null) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str);
            this.f23419 = dateTimeFormatterOfPattern;
            return dateTimeFormatterOfPattern;
        }
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(str, locale);
        this.f23419 = dateTimeFormatterOfPattern2;
        return dateTimeFormatterOfPattern2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final DateTimeFormatter m14428() {
        String str;
        if (this.f23419 == null && (str = this.f23415) != null && !this.f23413 && !this.f23412 && !this.f23414) {
            Locale locale = this.f23424;
            if (locale == null) {
                this.f23419 = DateTimeFormatter.ofPattern(str);
            } else {
                this.f23419 = DateTimeFormatter.ofPattern(str, locale);
            }
        }
        return this.f23419;
    }
}
