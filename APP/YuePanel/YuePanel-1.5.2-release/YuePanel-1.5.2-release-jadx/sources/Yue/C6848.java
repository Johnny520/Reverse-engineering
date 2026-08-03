package Yue;

import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥۡۥۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6848 implements Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f17744;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public String f17745;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public String f17746;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6848(String str) {
        this("", str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C6848 m21587(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("invalid QName literal");
        }
        if (str.charAt(0) != '{') {
            return new C6848(str);
        }
        int iIndexOf = str.indexOf(125);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("invalid QName literal");
        }
        if (iIndexOf != str.length() - 1) {
            return new C6848(str.substring(1, iIndexOf), str.substring(iIndexOf + 1));
        }
        throw new IllegalArgumentException("invalid QName literal");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6848)) {
            return false;
        }
        C6848 c6848 = (C6848) obj;
        return this.f17745.equals(c6848.f17745) && this.f17744.equals(c6848.f17744);
    }

    public final int hashCode() {
        return this.f17744.hashCode() ^ this.f17745.hashCode();
    }

    public String toString() {
        if (this.f17744.equals("")) {
            return this.f17745;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append(this.f17744);
        stringBuffer.append("}");
        stringBuffer.append(this.f17745);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public String m3294() {
        return this.f17745;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m3295() {
        return this.f17744;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m21588() {
        return this.f17746;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6848(String str, String str2) {
        this(str, str2, "");
    }

    public C6848(String str, String str2, String str3) {
        if (str2 != null) {
            str = str == null ? "" : str;
            str3 = str3 == null ? "" : str3;
            this.f17744 = str;
            this.f17745 = str2;
            this.f17746 = str3;
            return;
        }
        throw new IllegalArgumentException("Local part not allowed to be null");
    }
}
