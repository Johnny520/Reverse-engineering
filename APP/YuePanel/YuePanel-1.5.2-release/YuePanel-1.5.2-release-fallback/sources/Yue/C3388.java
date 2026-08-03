package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
public class C3388 extends Yue.C3403 implements Yue.InterfaceC1413 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f10827;

    public C3388(@Yue.InterfaceC4543 Yue.InterfaceC3383 r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.m14112(r2)
            boolean r2 = r1.m13998()
            r1.f10827 = r2
            return
    }

    @Override // Yue.InterfaceC1413
    public boolean complete() {
            r1 = this;
            Yue.ۥۣۢ۠ۤ r0 = Yue.C6593.f23016
            boolean r0 = r1.m14119(r0)
            return r0
    }

    @Override // Yue.InterfaceC1413
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo7025(@Yue.InterfaceC4418 java.lang.Throwable r5) {
            r4 = this;
            Yue.ۥ۟ۦۣۢ r0 = new Yue.ۥ۟ۦۣۢ
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            boolean r5 = r4.m14119(r0)
            return r5
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public boolean mo13997() {
            r1 = this;
            boolean r0 = r1.f10827
            return r0
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠ */
    public boolean mo7020() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final boolean m13998() {
            r4 = this;
            Yue.ۥ۟ۤۥۨ r0 = r4.m14110()
            boolean r1 = r0 instanceof Yue.C1128
            r2 = 0
            if (r1 == 0) goto Lc
            Yue.ۥ۟ۤۦ r0 = (Yue.C1128) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L33
            Yue.ۥ۠ۦ۠۟ r0 = r0.m14079()
            if (r0 != 0) goto L17
            goto L33
        L17:
            boolean r3 = r0.mo13997()
            if (r3 == 0) goto L1f
            r0 = 1
            return r0
        L1f:
            Yue.ۥ۟ۤۥۨ r0 = r0.m14110()
            boolean r3 = r0 instanceof Yue.C1128
            if (r3 == 0) goto L2a
            Yue.ۥ۟ۤۦ r0 = (Yue.C1128) r0
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L33
            Yue.ۥ۠ۦ۠۟ r0 = r0.m14079()
            if (r0 != 0) goto L17
        L33:
            return r1
    }
}
