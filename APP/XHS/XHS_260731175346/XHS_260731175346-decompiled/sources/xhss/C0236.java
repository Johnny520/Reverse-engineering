package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0236 extends xhss.C0333 {

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f901 = 0;
    private volatile /* synthetic */ int _decision$volatile;

    static {
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            java.lang.Class<xhss.ᛳᛱᲈ> r1 = xhss.C0236.class
            java.lang.String r2 = "_decision$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            xhss.C0236.f901 = r0
            return
    }

    @Override // xhss.C0333, xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void mo541(java.lang.Object r1) {
            r0 = this;
            r0.mo542(r1)
            return
    }

    @Override // xhss.C0333, xhss.AbstractC0784
    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final void mo542(java.lang.Object r7) {
            r6 = this;
        L0:
            sun.misc.Unsafe r0 = xhss.AbstractC1067.f3442
            long r2 = xhss.C0236.f901
            int r1 = r0.getIntVolatile(r6, r2)
            if (r1 == 0) goto L21
            r0 = 1
            if (r1 != r0) goto L1b
            xhss.ᛸᛴᛳᛷ r6 = r6.f1247
            xhss.ᛱᛴᛶᛴ r6 = xhss.AbstractC0561.m1021(r6)
            java.lang.Object r7 = xhss.AbstractC1178.m1886(r7)
            xhss.AbstractC1178.m1869(r7, r6)
            return
        L1b:
            java.lang.String r6 = "Already resumed"
            xhss.C0532.m950(r6)
            return
        L21:
            r4 = 0
            r5 = 2
            r1 = r6
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L2b
            return
        L2b:
            r6 = r1
            goto L0
    }
}
