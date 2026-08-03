package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3240<T> implements java.lang.Iterable<Yue.C3239<? extends T>>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2823<java.util.Iterator<T>> f10599;

    public C3240(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends java.util.Iterator<? extends T>> r2) {
            r1 = this;
            java.lang.String r0 = "iteratorFactory"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f10599 = r2
            return
    }

    @Override // java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C3239<T>> iterator() {
            r2 = this;
            Yue.ۥ۠ۥۡۦ r0 = new Yue.ۥ۠ۥۡۦ
            Yue.ۥۣ۠۠ۨ<java.util.Iterator<T>> r1 = r2.f10599
            java.lang.Object r1 = r1.invoke()
            java.util.Iterator r1 = (java.util.Iterator) r1
            r0.<init>(r1)
            return r0
    }
}
