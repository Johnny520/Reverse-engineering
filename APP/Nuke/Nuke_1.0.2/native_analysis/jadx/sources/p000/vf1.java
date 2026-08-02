package p000;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vf1 {

    /* JADX INFO: renamed from: d */
    public static final o72 f11926d = new o72("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: e */
    public static final o72 f11927e = new o72(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f11928a;

    /* JADX INFO: renamed from: b */
    public final String f11929b;

    /* JADX INFO: renamed from: c */
    public final String[] f11930c;

    public vf1(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f11928a = str;
        this.f11929b = str2;
        this.f11930c = strArr;
    }

    /* JADX INFO: renamed from: a */
    public static Charset m5671a(vf1 vf1Var) {
        String str;
        String[] strArr = vf1Var.f11930c;
        int i = 0;
        int iM3693C = p40.m3693C(0, strArr.length - 1, 2);
        if (iM3693C < 0) {
            str = null;
            break;
        }
        while (!wv2.m6006X(strArr[i], "charset", true)) {
            if (i == iM3693C) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vf1) && t11.m5086l(((vf1) obj).f11928a, this.f11928a);
    }

    public final int hashCode() {
        return this.f11928a.hashCode();
    }

    public final String toString() {
        return this.f11928a;
    }
}
