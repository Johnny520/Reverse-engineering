package p000;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class y00 {

    /* JADX INFO: renamed from: k */
    public static final Pattern f13251k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f13252l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f13253m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n */
    public static final Pattern f13254n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f13255a;

    /* JADX INFO: renamed from: b */
    public final String f13256b;

    /* JADX INFO: renamed from: c */
    public final long f13257c;

    /* JADX INFO: renamed from: d */
    public final String f13258d;

    /* JADX INFO: renamed from: e */
    public final String f13259e;

    /* JADX INFO: renamed from: f */
    public final boolean f13260f;

    /* JADX INFO: renamed from: g */
    public final boolean f13261g;

    /* JADX INFO: renamed from: h */
    public final boolean f13262h;

    /* JADX INFO: renamed from: i */
    public final boolean f13263i;

    /* JADX INFO: renamed from: j */
    public final String f13264j;

    public y00(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f13255a = str;
        this.f13256b = str2;
        this.f13257c = j;
        this.f13258d = str3;
        this.f13259e = str4;
        this.f13260f = z;
        this.f13261g = z2;
        this.f13262h = z3;
        this.f13263i = z4;
        this.f13264j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return y00Var.f13255a.equals(this.f13255a) && y00Var.f13256b.equals(this.f13256b) && y00Var.f13257c == this.f13257c && y00Var.f13258d.equals(this.f13258d) && y00Var.f13259e.equals(this.f13259e) && y00Var.f13260f == this.f13260f && y00Var.f13261g == this.f13261g && y00Var.f13262h == this.f13262h && y00Var.f13263i == this.f13263i && t11.m5086l(y00Var.f13264j, this.f13264j);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(hk1.m2205d(hk1.m2205d(hk1.m2205d(hk1.m2207f(this.f13259e, hk1.m2207f(this.f13258d, hk1.m2204c(hk1.m2207f(this.f13256b, hk1.m2207f(this.f13255a, 527, 31), 31), 31, this.f13257c), 31), 31), 31, this.f13260f), 31, this.f13261g), 31, this.f13262h), 31, this.f13263i);
        String str = this.f13264j;
        return iM2205d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13255a);
        sb.append('=');
        sb.append(this.f13256b);
        if (this.f13262h) {
            long j = this.f13257c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) m40.f6468a.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.f13263i) {
            sb.append("; domain=");
            sb.append(this.f13258d);
        }
        sb.append("; path=");
        sb.append(this.f13259e);
        if (this.f13260f) {
            sb.append("; secure");
        }
        if (this.f13261g) {
            sb.append("; httponly");
        }
        String str2 = this.f13264j;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
