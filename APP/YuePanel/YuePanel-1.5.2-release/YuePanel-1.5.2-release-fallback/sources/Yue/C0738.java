package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0738 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f2065;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f2066;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f2067;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.nio.ByteBuffer f2068;

    public C0738() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m4577(int r3) {
            r2 = this;
            int r0 = r2.f2065
            int r1 = r2.f2067
            int r3 = r3 * r1
            int r0 = r0 + r3
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m4578(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.f2068 = r3
            if (r3 == 0) goto L11
            r0.f2065 = r1
            int r1 = r1 + (-4)
            int r1 = r3.getInt(r1)
            r0.f2066 = r1
            r0.f2067 = r2
            goto L18
        L11:
            r1 = 0
            r0.f2065 = r1
            r0.f2066 = r1
            r0.f2067 = r1
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m4579() {
            r1 = this;
            int r0 = r1.f2065
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m4580() {
            r1 = this;
            int r0 = r1.f2066
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m4581() {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.m4578(r0, r0, r1)
            return
    }
}
