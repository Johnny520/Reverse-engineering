package p278;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8363 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f23067;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f23068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f23069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f23070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f23071;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f23072;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean f23073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean f23074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public DateTimeFormatter f23075;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f23076;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f23077;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f23078;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f23079;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Locale f23080;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f23081;

    public AbstractC8363(String str, Locale locale) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        str = str != null ? str.replace("aa", "a") : str;
        this.f23071 = str;
        this.f23080 = locale;
        this.f23079 = "yyyyMMddHHmmss".equals(str);
        this.f23081 = "yyyy-MM-dd HH:mm:ss".equals(str);
        this.f23078 = "yyyy-MM-dd HH:mm".equals(str);
        this.f23073 = "yyyy-MM-dd".equals(str);
        this.f23072 = "yyyyMMdd".equals(str);
        this.f23074 = "yyyy-MM-dd'T'HH:mm:ssXXX".equals(str);
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
            this.f23070 = z5;
            this.f23069 = z2;
            this.f23068 = z;
            this.f23067 = z3;
            this.f23077 = z4;
            this.f23076 = "yyyyMMddHHmmssSSSZ".equals(str);
        }
        z = false;
        z2 = false;
        z3 = false;
        z4 = z3;
        this.f23070 = z5;
        this.f23069 = z2;
        this.f23068 = z;
        this.f23067 = z3;
        this.f23077 = z4;
        this.f23076 = "yyyyMMddHHmmssSSSZ".equals(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final DateTimeFormatter m13851() {
        String str = this.f23071;
        if (str == null || this.f23069 || this.f23068 || this.f23070) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = this.f23075;
        Locale locale = this.f23080;
        if (dateTimeFormatter != null && (locale == null || (locale != null && locale.equals(null)))) {
            return this.f23075;
        }
        if (locale == null) {
            DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str);
            this.f23075 = dateTimeFormatterOfPattern;
            return dateTimeFormatterOfPattern;
        }
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(str, locale);
        this.f23075 = dateTimeFormatterOfPattern2;
        return dateTimeFormatterOfPattern2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final DateTimeFormatter m13852() {
        String str;
        if (this.f23075 == null && (str = this.f23071) != null && !this.f23069 && !this.f23068 && !this.f23070) {
            Locale locale = this.f23080;
            if (locale == null) {
                this.f23075 = DateTimeFormatter.ofPattern(str);
            } else {
                this.f23075 = DateTimeFormatter.ofPattern(str, locale);
            }
        }
        return this.f23075;
    }
}
