package yyds;

import java.io.Serializable;

/* JADX INFO: renamed from: yyds.ᛲᛵᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0356 implements Serializable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f1863;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f1864;

    public C0356(String str, String str2, String str3) {
        if (str2 == null) {
            C0188.m798("Local part not allowed to be null");
            throw null;
        }
        this.f1863 = str == null ? "" : str;
        this.f1864 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0356)) {
            return false;
        }
        C0356 c0356 = (C0356) obj;
        return this.f1864.equals(c0356.f1864) && this.f1863.equals(c0356.f1863);
    }

    public final int hashCode() {
        return this.f1864.hashCode() ^ this.f1863.hashCode();
    }

    public final String toString() {
        String str = this.f1863;
        boolean zEquals = str.equals("");
        String str2 = this.f1864;
        if (zEquals) {
            return str2;
        }
        StringBuffer stringBuffer = new StringBuffer("{");
        stringBuffer.append(str);
        stringBuffer.append("}");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }
}
