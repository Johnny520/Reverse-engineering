package yyds;

import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᲁᛸᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2287 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f11247;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f11248;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f11249;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f11250;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f11251;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f11252;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f11253;

    public C2287(String str, String str2, boolean z, int i, String str3, int i2) {
        this.f11248 = str;
        this.f11249 = str2;
        this.f11251 = z;
        this.f11253 = i;
        this.f11247 = str3;
        this.f11252 = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        this.f11250 = AbstractC0473.m1301(upperCase, "INT", false) ? 3 : (AbstractC0473.m1301(upperCase, "CHAR", false) || AbstractC0473.m1301(upperCase, "CLOB", false) || AbstractC0473.m1301(upperCase, "TEXT", false)) ? 2 : AbstractC0473.m1301(upperCase, "BLOB", false) ? 5 : (AbstractC0473.m1301(upperCase, "REAL", false) || AbstractC0473.m1301(upperCase, "FLOA", false) || AbstractC0473.m1301(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2287) {
                boolean z = this.f11253 > 0;
                C2287 c2287 = (C2287) obj;
                int i = c2287.f11252;
                if (z == (c2287.f11253 > 0) && AbstractC1544.m3188(this.f11248, c2287.f11248) && this.f11251 == c2287.f11251) {
                    String str = c2287.f11247;
                    int i2 = this.f11252;
                    String str2 = this.f11247;
                    if ((i2 != 1 || i != 2 || str2 == null || AbstractC1367.m2788(str2, str)) && ((i2 != 2 || i != 1 || str == null || AbstractC1367.m2788(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : AbstractC1367.m2788(str2, str))) && this.f11250 == c2287.f11250))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f11248.hashCode() * 31) + this.f11250) * 31) + (this.f11251 ? 1231 : 1237)) * 31) + this.f11253;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f11248);
        sb.append("',\n            |   type = '");
        sb.append(this.f11249);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f11250);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f11251);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f11253);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f11247;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return AbstractC0786.m1777(AbstractC0786.m1776(sb.toString()));
    }
}
