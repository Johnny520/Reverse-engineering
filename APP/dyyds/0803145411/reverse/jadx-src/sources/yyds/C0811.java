package yyds;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: yyds.ᛴᛲᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0811 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0051 f3734 = new C0051("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0051 f3735 = new C0051(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f3736;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String[] f3737;

    public C0811(String[] strArr, String str) {
        this.f3736 = str;
        this.f3737 = strArr;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Charset m1865(C0811 c0811) {
        String str;
        String[] strArr = c0811.f3737;
        int i = 0;
        int iM3792 = AbstractC1960.m3792(0, strArr.length - 1, 2);
        if (iM3792 < 0) {
            str = null;
            break;
        }
        while (!AbstractC0692.m1597(strArr[i], "charset")) {
            if (i == iM3792) {
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
        return (obj instanceof C0811) && AbstractC1544.m3188(((C0811) obj).f3736, this.f3736);
    }

    public final int hashCode() {
        return this.f3736.hashCode();
    }

    public final String toString() {
        return this.f3736;
    }
}
