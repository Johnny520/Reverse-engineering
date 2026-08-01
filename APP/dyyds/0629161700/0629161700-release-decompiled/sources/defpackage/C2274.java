package defpackage;

/* JADX INFO: renamed from: ᲈᛶᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274 extends defpackage.AbstractC1683 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final /* synthetic */ long f9622 = 0;
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1823 f9623;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᲈᛶᲁᲈ> r1 = defpackage.C2274.class
            java.lang.String r2 = "_invoked$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C2274.f9622 = r0
            return
    }

    public native C2274(defpackage.C1823 r1);

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final boolean mo987() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo988(java.lang.Throwable r7) {
            r6 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C2274.f9622
            r4 = 0
            r5 = 1
            r1 = r6
            boolean r6 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r6 == 0) goto L12
            ᲁᛲᲇᛲ r6 = r1.f9623
            r6.mo617(r7)
        L12:
            return
    }
}
