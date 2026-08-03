package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@java.lang.Deprecated
public class C3803 extends java.io.Writer {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.String f12047;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.StringBuilder f12048;

    public C3803(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f12048 = r0
            r2.f12047 = r3
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.m15240()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
            r0 = this;
            r0.m15240()
            return
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L17
            int r1 = r5 + r0
            char r1 = r4[r1]
            r2 = 10
            if (r1 != r2) goto Lf
            r3.m15240()
            goto L14
        Lf:
            java.lang.StringBuilder r2 = r3.f12048
            r2.append(r1)
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m15240() {
            r3 = this;
            java.lang.StringBuilder r0 = r3.f12048
            int r0 = r0.length()
            if (r0 <= 0) goto L1d
            java.lang.String r0 = r3.f12047
            java.lang.StringBuilder r1 = r3.f12048
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.StringBuilder r0 = r3.f12048
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
        L1d:
            return
    }
}
