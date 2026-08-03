package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3241<T> implements java.util.Iterator<Yue.C3239<? extends T>>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Iterator<T> f10600;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f10601;

    public C3241(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "iterator"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f10600 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<T> r0 = r1.f10600
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            Yue.ۥ۠ۥۡۤ r0 = r1.m13664()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C3239<T> m13664() {
            r3 = this;
            Yue.ۥ۠ۥۡۤ r0 = new Yue.ۥ۠ۥۡۤ
            int r1 = r3.f10601
            int r2 = r1 + 1
            r3.f10601 = r2
            if (r1 >= 0) goto Ld
            Yue.C1208.m6228()
        Ld:
            java.util.Iterator<T> r2 = r3.f10600
            java.lang.Object r2 = r2.next()
            r0.<init>(r1, r2)
            return r0
    }
}
