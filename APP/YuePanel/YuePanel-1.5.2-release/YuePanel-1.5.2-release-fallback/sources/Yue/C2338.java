package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2338 extends Yue.AbstractC2753 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<java.io.IOException, Yue.C6593> f7604;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f7605;

    public C2338(@Yue.InterfaceC4418 Yue.InterfaceC5794 r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.io.IOException, Yue.C6593> r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "onException"
            Yue.C3329.m13906(r3, r0)
            r1.<init>(r2)
            r1.f7604 = r3
            return
    }

    @Override // Yue.AbstractC2753, Yue.InterfaceC5794, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            boolean r0 = r2.f7605
            if (r0 == 0) goto L5
            return
        L5:
            super.close()     // Catch: java.io.IOException -> L9
            goto L12
        L9:
            r0 = move-exception
            r1 = 1
            r2.f7605 = r1
            Yue.ۥۣ۠ۡ۟<java.io.IOException, Yue.ۥۣۢ۠ۤ> r1 = r2.f7604
            r1.invoke(r0)
        L12:
            return
    }

    @Override // Yue.AbstractC2753, Yue.InterfaceC5794, java.io.Flushable
    public void flush() {
            r2 = this;
            boolean r0 = r2.f7605
            if (r0 == 0) goto L5
            return
        L5:
            super.flush()     // Catch: java.io.IOException -> L9
            goto L12
        L9:
            r0 = move-exception
            r1 = 1
            r2.f7605 = r1
            Yue.ۥۣ۠ۡ۟<java.io.IOException, Yue.ۥۣۢ۠ۤ> r1 = r2.f7604
            r1.invoke(r0)
        L12:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.InterfaceC2825<java.io.IOException, Yue.C6593> m10723() {
            r1 = this;
            Yue.ۥۣ۠ۡ۟<java.io.IOException, Yue.ۥۣۢ۠ۤ> r0 = r1.f7604
            return r0
    }

    @Override // Yue.AbstractC2753, Yue.InterfaceC5794
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo4176(@Yue.InterfaceC4418 Yue.C0843 r2, long r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            boolean r0 = r1.f7605
            if (r0 == 0) goto Ld
            r2.skip(r3)
            return
        Ld:
            super.mo4176(r2, r3)     // Catch: java.io.IOException -> L11
            goto L1a
        L11:
            r2 = move-exception
            r3 = 1
            r1.f7605 = r3
            Yue.ۥۣ۠ۡ۟<java.io.IOException, Yue.ۥۣۢ۠ۤ> r3 = r1.f7604
            r3.invoke(r2)
        L1a:
            return
    }
}
