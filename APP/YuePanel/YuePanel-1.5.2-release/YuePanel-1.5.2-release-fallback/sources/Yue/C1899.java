package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1899<T, K> implements Yue.InterfaceC5609<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5609<T> f5833;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, K> f5834;

    public C1899(@Yue.InterfaceC4418 Yue.InterfaceC5609<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends K> r3) {
            r1 = this;
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "keySelector"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f5833 = r2
            r1.f5834 = r3
            return
    }

    @Override // Yue.InterfaceC5609
    @Yue.InterfaceC4418
    public java.util.Iterator<T> iterator() {
            r3 = this;
            Yue.ۥۣ۠۟ۧ r0 = new Yue.ۥۣ۠۟ۧ
            Yue.ۥۡۨۢ<T> r1 = r3.f5833
            java.util.Iterator r1 = r1.iterator()
            Yue.ۥۣ۠ۡ۟<T, K> r2 = r3.f5834
            r0.<init>(r1, r2)
            return r0
    }
}
