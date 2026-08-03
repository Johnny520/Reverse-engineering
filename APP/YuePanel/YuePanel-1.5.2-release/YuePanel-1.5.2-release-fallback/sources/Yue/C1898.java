package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1898<T, K> extends Yue.AbstractC0050<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Iterator<T> f5830;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, K> f5831;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.HashSet<K> f5832;

    public C1898(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends K> r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "keySelector"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f5830 = r2
            r1.f5831 = r3
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.f5832 = r2
            return
    }

    @Override // Yue.AbstractC0050
    /* JADX INFO: renamed from: ۥ */
    public void mo394() {
            r3 = this;
        L0:
            java.util.Iterator<T> r0 = r3.f5830
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L20
            java.util.Iterator<T> r0 = r3.f5830
            java.lang.Object r0 = r0.next()
            Yue.ۥۣ۠ۡ۟<T, K> r1 = r3.f5831
            java.lang.Object r1 = r1.invoke(r0)
            java.util.HashSet<K> r2 = r3.f5832
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L0
            r3.m396(r0)
            return
        L20:
            r3.m395()
            return
    }
}
