package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7695 {

    /* JADX INFO: renamed from: ۥ */
    public String f3026;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f3027;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f23198;

    public C7695(String str, String str2, int i) {
        this.f3026 = str;
        this.f3027 = str2;
        this.f23198 = i;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(this.f23198);
        stringBuffer.append("][");
        stringBuffer.append(this.f3026);
        stringBuffer.append("][");
        stringBuffer.append(this.f3027);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ۥ */
    public int m3794() {
        return this.f23198;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m3795() {
        return this.f3026;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m24479() {
        return this.f3027;
    }
}
