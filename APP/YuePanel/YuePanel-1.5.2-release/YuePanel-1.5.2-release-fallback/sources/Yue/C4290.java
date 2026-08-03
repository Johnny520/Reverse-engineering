package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4290<E> extends Yue.AbstractC0052<E> implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<E> f13564;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f13565;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f13566;

    public C4290(@Yue.InterfaceC4418 java.util.List<? extends E> r2) {
            r1 = this;
            java.lang.String r0 = "list"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f13564 = r2
            return
    }

    @Override // Yue.AbstractC0052, java.util.List
    public E get(int r3) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            int r1 = r2.f13566
            r0.m399(r3, r1)
            java.util.List<E> r0 = r2.f13564
            int r1 = r2.f13565
            int r1 = r1 + r3
            java.lang.Object r3 = r0.get(r1)
            return r3
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041
    /* JADX INFO: renamed from: ۥ */
    public int mo368() {
            r1 = this;
            int r0 = r1.f13566
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m16865(int r3, int r4) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            java.util.List<E> r1 = r2.f13564
            int r1 = r1.size()
            r0.m401(r3, r4, r1)
            r2.f13565 = r3
            int r4 = r4 - r3
            r2.f13566 = r4
            return
    }
}
