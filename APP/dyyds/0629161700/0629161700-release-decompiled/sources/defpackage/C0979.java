package defpackage;

/* JADX INFO: renamed from: ᛵᲇᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0979 extends defpackage.C0818 {

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f4389 = 0;
    private volatile /* synthetic */ int _decision$volatile;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛵᲇᛳᲀ> r1 = defpackage.C0979.class
            java.lang.String r2 = "_decision$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C0979.f4389 = r0
            return
    }

    @Override // defpackage.C0818, defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final void mo1433(java.lang.Object r1) {
            r0 = this;
            r0.mo1436(r1)
            return
    }

    @Override // defpackage.C0818, defpackage.AbstractC0624
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public final void mo1436(java.lang.Object r7) {
            r6 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.C0979.f4389
            int r1 = r0.getIntVolatile(r6, r2)
            if (r1 == 0) goto L21
            r0 = 1
            if (r1 != r0) goto L1b
            ᛱᛸᛲᲀ r6 = r6.f3779
            ᛱᛸᛲᲀ r6 = defpackage.AbstractC0397.m1142(r6)
            java.lang.Object r7 = defpackage.AbstractC1849.m3244(r7)
            defpackage.AbstractC1592.m2876(r6, r7)
            return
        L1b:
            java.lang.String r6 = "Already resumed"
            defpackage.C2264.m3676(r6)
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
