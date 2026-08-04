package yyds;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᲈᛳᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2627 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean f12919;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f12920;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f12921;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f12922;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f12923;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f12924;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final String f12925;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final long f12926;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f12927;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f12928;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Pattern f12917 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final Pattern f12918 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final Pattern f12916 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final Pattern f12915 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C2627(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f12922 = str;
        this.f12923 = str2;
        this.f12926 = j;
        this.f12928 = str3;
        this.f12921 = str4;
        this.f12927 = z;
        this.f12924 = z2;
        this.f12919 = z3;
        this.f12920 = z4;
        this.f12925 = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2627)) {
            return false;
        }
        C2627 c2627 = (C2627) obj;
        return c2627.f12922.equals(this.f12922) && c2627.f12923.equals(this.f12923) && c2627.f12926 == this.f12926 && c2627.f12928.equals(this.f12928) && c2627.f12921.equals(this.f12921) && c2627.f12927 == this.f12927 && c2627.f12924 == this.f12924 && c2627.f12919 == this.f12919 && c2627.f12920 == this.f12920 && AbstractC1544.m3188(c2627.f12925, this.f12925);
    }

    public final int hashCode() {
        int iM4021 = AbstractC2104.m4021(AbstractC2104.m4021(AbstractC2104.m4021(AbstractC2104.m4021(AbstractC0897.m1997(this.f12921, AbstractC0897.m1997(this.f12928, (Long.hashCode(this.f12926) + AbstractC0897.m1997(this.f12923, AbstractC0897.m1997(this.f12922, 527, 31), 31)) * 31, 31), 31), 31, this.f12927), 31, this.f12924), 31, this.f12919), 31, this.f12920);
        String str = this.f12925;
        return iM4021 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.f12922);
        sb.append('=');
        sb.append(this.f12923);
        if (this.f12919) {
            long j = this.f12926;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) AbstractC0865.f3968.get()).format(new Date(j)));
            }
        }
        if (!this.f12920) {
            sb.append("; domain=");
            sb.append(this.f12928);
        }
        sb.append("; path=");
        sb.append(this.f12921);
        if (this.f12927) {
            sb.append("; secure");
        }
        if (this.f12924) {
            sb.append("; httponly");
        }
        String str = this.f12925;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}
