package defpackage;

/* JADX INFO: renamed from: ᛶᛳᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1050 extends defpackage.AbstractC1683 {

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f4649 = 0;
    private volatile /* synthetic */ java.lang.Object _disposer$volatile;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.InterfaceC0843 f4650;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0457 f4651;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C2260 f4652;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛶᛳᲈᛱ> r1 = defpackage.C1050.class
            java.lang.String r2 = "_disposer$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C1050.f4649 = r0
            return
    }

    public C1050(defpackage.C0457 r1, defpackage.C2260 r2) {
            r0 = this;
            r0.f4651 = r1
            r0.<init>()
            r0.f4652 = r2
            return
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public final boolean mo987() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.AbstractC1683
    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public final void mo988(java.lang.Throwable r5) {
            r4 = this;
            r0 = 0
            ᲈᛶᛳᛷ r1 = r4.f4652
            if (r5 == 0) goto L24
            ᛱᛸᛳᛱ r2 = new ᛱᛸᛳᛱ
            r2.<init>(r5, r0)
            r5 = 0
            ᛳᛴᛵᛱ r5 = r1.m3668(r2, r5)
            if (r5 == 0) goto L48
            r1.mo2003(r5)
            sun.misc.Unsafe r5 = defpackage.AbstractC0051.f569
            long r0 = defpackage.C1050.f4649
            java.lang.Object r4 = r5.getObjectVolatile(r4, r0)
            ᲁᛳᲁᛴ r4 = (defpackage.C1838) r4
            if (r4 == 0) goto L48
            r4.m3232()
            return
        L24:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.C0457.f2268
            ᛳᛴᛶᛳ r4 = r4.f4651
            int r5 = r5.decrementAndGet(r4)
            if (r5 != 0) goto L48
            ᲇᲇᛵᛲ[] r4 = r4.f2269
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r4.length
            r5.<init>(r2)
            int r2 = r4.length
        L37:
            if (r0 >= r2) goto L45
            r3 = r4[r0]
            java.lang.Object r3 = r3.m3558()
            r5.add(r3)
            int r0 = r0 + 1
            goto L37
        L45:
            r1.mo662(r5)
        L48:
            return
    }
}
