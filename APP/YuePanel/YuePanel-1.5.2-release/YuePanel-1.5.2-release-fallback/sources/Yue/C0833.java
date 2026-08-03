package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۣ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0833<E> extends Yue.AbstractC0043<Yue.C6593> implements Yue.InterfaceC4951<E>, Yue.InterfaceC0830<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0830<E> f2342;

    public C0833(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4418 Yue.InterfaceC0830<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4)
            r1.f2342 = r3
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r3 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r2 = r2.get(r3)
            Yue.ۥ۠ۦ۟ۡ r2 = (Yue.InterfaceC3383) r2
            r1.m14112(r2)
            return
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySend' method", replaceWith = @Yue.InterfaceC5313(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // Yue.InterfaceC4951
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC5599<E> mo4787() {
            r0 = this;
            return r0
    }

    @Override // Yue.C3403, Yue.InterfaceC3383, Yue.InterfaceC0830
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final /* synthetic */ boolean mo1960(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            Yue.ۥ۠ۦ۟ۢ r3 = new Yue.ۥ۠ۦ۟ۢ
            java.lang.String r0 = Yue.C3403.m14082(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.mo4788(r3)
            r3 = 1
            return r3
    }

    @Override // Yue.AbstractC0043, Yue.C3403, Yue.InterfaceC3383
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public boolean mo371() {
            r1 = this;
            boolean r0 = super.mo371()
            return r0
    }

    @Override // Yue.C3403, Yue.InterfaceC3383, Yue.InterfaceC0830
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public final void mo1961(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            Yue.ۥ۠ۦ۟ۢ r3 = new Yue.ۥ۠ۦ۟ۢ
            java.lang.String r0 = Yue.C3403.m14082(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.mo4788(r3)
            return
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.Object mo476(E r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            java.lang.Object r2 = r0.mo476(r2, r3)
            return r2
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Yue.InterfaceC5563<E, Yue.InterfaceC5599<E>> mo488() {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            Yue.ۥۡۧۨۨ r0 = r0.mo488()
            return r0
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r2) {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            boolean r2 = r0.mo492(r2)
            r1.start()
            return r2
    }

    @Override // Yue.InterfaceC0830
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public Yue.InterfaceC5242<E> mo1962() {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            Yue.ۥۡۦۡۡ r0 = r0.mo1962()
            return r0
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public java.lang.Object mo495(E r2) {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            java.lang.Object r2 = r0.mo495(r2)
            return r2
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo498(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            r0.mo498(r2)
            return
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public boolean mo499() {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            boolean r0 = r0.mo499()
            return r0
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void mo4788(@Yue.InterfaceC4418 java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.CancellationException r3 = Yue.C3403.m14086(r2, r3, r0, r1, r0)
            Yue.ۥۣ۟ۢۡ<E> r0 = r2.f2342
            r0.mo1961(r3)
            r2.m14093(r3)
            return
    }

    @Override // Yue.AbstractC0043
    /* JADX INFO: renamed from: ۥ۟۠۠ */
    public void mo377(@Yue.InterfaceC4418 java.lang.Throwable r2, boolean r3) {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            boolean r0 = r0.mo492(r2)
            if (r0 != 0) goto L11
            if (r3 != 0) goto L11
            Yue.ۥ۟ۧۦۥ r3 = r1.getContext()
            Yue.C1650.m7933(r3, r2)
        L11:
            return
    }

    @Override // Yue.AbstractC0043
    /* JADX INFO: renamed from: ۥ۟۠۠۟ */
    public /* bridge */ /* synthetic */ void mo378(Yue.C6593 r1) {
            r0 = this;
            Yue.ۥۣۢ۠ۤ r1 = (Yue.C6593) r1
            r0.m4790(r1)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC0830<E> m4789() {
            r1 = this;
            Yue.ۥۣ۟ۢۡ<E> r0 = r1.f2342
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public void m4790(@Yue.InterfaceC4418 Yue.C6593 r3) {
            r2 = this;
            Yue.ۥۣ۟ۢۡ<E> r3 = r2.f2342
            r0 = 0
            r1 = 1
            Yue.InterfaceC5599.C5600.m20959(r3, r0, r1, r0)
            return
    }
}
