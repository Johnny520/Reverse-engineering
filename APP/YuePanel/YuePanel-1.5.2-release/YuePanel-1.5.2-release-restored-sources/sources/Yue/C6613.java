package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6613 {

    /* JADX INFO: renamed from: ۥ */
    public final int f2174;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f2175;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final String f16973;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6613(C3787 c3787, String str) {
        this.f2174 = c3787.m10432();
        this.f2175 = c3787.m10433();
        this.f16973 = str;
    }

    public String toString() {
        return "<" + this.f2175 + ">: " + this.f16973;
    }

    /* JADX INFO: renamed from: ۥ */
    public String m3080() {
        return this.f2175;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public String m3081() {
        return this.f16973;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m20986() {
        return this.f2174;
    }

    public C6613(C3787 c3787, String str, Object... objArr) {
        this.f2174 = c3787.m10432();
        this.f2175 = c3787.m10433();
        this.f16973 = String.format(str, objArr);
    }

    public C6613(int i, String str) {
        this.f2174 = i;
        this.f2175 = String.valueOf(i);
        this.f16973 = str;
    }

    public C6613(int i, String str, Object... objArr) {
        this.f2174 = i;
        this.f2175 = String.valueOf(i);
        this.f16973 = String.format(str, objArr);
    }
}
