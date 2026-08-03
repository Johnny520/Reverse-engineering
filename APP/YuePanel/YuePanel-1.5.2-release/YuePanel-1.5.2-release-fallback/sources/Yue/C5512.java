package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5512<T> extends Yue.AbstractC0043<T> implements Yue.InterfaceC1665 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC1598<T> f20408;

    public C5512(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.f20408 = r3
            return
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public final Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f20408
            boolean r1 = r0 instanceof Yue.InterfaceC1665
            if (r1 == 0) goto L9
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public final java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo4680(@Yue.InterfaceC4543 java.lang.Object r4) {
            r3 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r3.f20408
            Yue.ۥ۟ۧۤۢ r0 = Yue.C3332.m13940(r0)
            Yue.ۥ۟ۧۤۢ<T> r1 = r3.f20408
            java.lang.Object r4 = Yue.C1423.m7051(r4, r1)
            r1 = 0
            r2 = 2
            Yue.C1872.m8755(r0, r4, r1, r2, r1)
            return
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥ۟۟ۧ */
    public final boolean mo4681() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC0043
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ */
    public void mo376(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f20408
            java.lang.Object r2 = Yue.C1423.m7051(r2, r0)
            r0.resumeWith(r2)
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC3383 m20745() {
            r1 = this;
            Yue.ۥ۟ۤۥۨ r0 = r1.m14110()
            if (r0 == 0) goto Lb
            Yue.ۥ۠ۦ۟ۡ r0 = r0.getParent()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }
}
