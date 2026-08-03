package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1000<E> extends Yue.AbstractC0043<Yue.C6593> implements Yue.InterfaceC0996<E> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC0996<E> f2876;

    public C1000(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, @Yue.InterfaceC4418 Yue.InterfaceC0996<E> r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.f2876 = r2
            return
    }

    @Override // Yue.C3403, Yue.InterfaceC3383, Yue.InterfaceC5242
    public /* synthetic */ void cancel() {
            r3 = this;
            Yue.ۥ۠ۦ۟ۢ r0 = new Yue.ۥ۠ۦ۟ۢ
            java.lang.String r1 = Yue.C3403.m14082(r3)
            r2 = 0
            r0.<init>(r1, r2, r3)
            r3.mo4788(r0)
            return
    }

    @Override // Yue.InterfaceC5242
    public boolean isEmpty() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    public Yue.InterfaceC1018<E> iterator() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            Yue.ۥ۟ۤۡۧ r0 = r0.iterator()
            return r0
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'trySend' method", replaceWith = @Yue.InterfaceC5313(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @Yue.InterfaceC5313(expression = "tryReceive().getOrNull()", imports = {}))
    @Yue.InterfaceC4543
    public E poll() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r0 = r0.poll()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC0996<E> m5530() {
            r0 = this;
            return r0
    }

    @Override // Yue.C3403, Yue.InterfaceC3383, Yue.InterfaceC0830
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5582, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final /* synthetic */ boolean mo1960(java.lang.Throwable r3) {
            r2 = this;
            Yue.ۥ۠ۦ۟ۢ r3 = new Yue.ۥ۠ۦ۟ۢ
            java.lang.String r0 = Yue.C3403.m14082(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
            r2.mo4788(r3)
            r3 = 1
            return r3
    }

    @Override // Yue.C3403, Yue.InterfaceC3383, Yue.InterfaceC0830
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public final void mo1961(@Yue.InterfaceC4543 java.util.concurrent.CancellationException r3) {
            r2 = this;
            boolean r0 = r2.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto L13
            Yue.ۥ۠ۦ۟ۢ r3 = new Yue.ۥ۠ۦ۟ۢ
            java.lang.String r0 = Yue.C3403.m14082(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        L13:
            r2.mo4788(r3)
            return
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.Object mo476(E r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r2 = r0.mo476(r2, r3)
            return r2
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.Object mo312(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r2 = r0.mo312(r2)
            return r2
    }

    @Override // Yue.InterfaceC5242
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo313() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            boolean r0 = r0.mo313()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public Yue.InterfaceC5562<E> mo314() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            Yue.ۥۡۧۨۧ r0 = r0.mo314()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public Yue.InterfaceC5562<Yue.C1024<E>> mo315() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            Yue.ۥۡۧۨۧ r0 = r0.mo315()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Yue.InterfaceC5562<E> mo316() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            Yue.ۥۡۧۨۧ r0 = r0.mo316()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public java.lang.Object mo317() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r0 = r0.mo317()
            return r0
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC3834
    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @Yue.InterfaceC5313(expression = "receiveCatching().getOrNull()", imports = {}))
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public java.lang.Object mo318(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super E> r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r2 = r0.mo318(r2)
            return r2
    }

    @Override // Yue.InterfaceC5242
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public java.lang.Object mo319(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C1024<? extends E>> r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r2 = r0.mo319(r2)
            Yue.C3341.m13947()
            return r2
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Yue.InterfaceC5563<E, Yue.InterfaceC5599<E>> mo488() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            Yue.ۥۡۧۨۨ r0 = r0.mo488()
            return r0
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo492(@Yue.InterfaceC4543 java.lang.Throwable r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            boolean r2 = r0.mo492(r2)
            return r2
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public java.lang.Object mo495(E r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            java.lang.Object r2 = r0.mo495(r2)
            return r2
    }

    @Override // Yue.InterfaceC5599
    @Yue.InterfaceC2302
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo498(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r2) {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            r0.mo498(r2)
            return
    }

    @Override // Yue.InterfaceC5599
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public boolean mo499() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            boolean r0 = r0.mo499()
            return r0
    }

    @Override // Yue.C3403
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo4788(@Yue.InterfaceC4418 java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.CancellationException r3 = Yue.C3403.m14086(r2, r3, r0, r1, r0)
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r2.f2876
            r0.mo311(r3)
            r2.m14093(r3)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final Yue.InterfaceC0996<E> m5531() {
            r1 = this;
            Yue.ۥ۟ۤ۠ۨ<E> r0 = r1.f2876
            return r0
    }
}
