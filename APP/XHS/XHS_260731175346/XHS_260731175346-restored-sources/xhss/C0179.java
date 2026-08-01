package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0179 extends xhss.AbstractC0381 {

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f704 = 0;
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0296 f705;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛲᛶᲁᲈ> r1 = xhss.C0179.class
            java.lang.String r2 = "_invoked$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0179.f704 = r0
            return
    }

    public C0179(xhss.C0296 r1) {
            r0 = this;
            r0.<init>()
            r0.f705 = r1
            r1 = 0
            r0._invoked$volatile = r1
            return
    }

    @Override // xhss.AbstractC0381
    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final boolean mo438() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // xhss.AbstractC0381
    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final void mo439(java.lang.Throwable r7) {
            r6 = this;
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0179.f704
            r4 = 0
            r5 = 1
            r1 = r6
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L12
            xhss.ᛳᛸᛱᲇ r6 = r1.f705
            r6.mo112(r7)
        L12:
            return
    }
}
