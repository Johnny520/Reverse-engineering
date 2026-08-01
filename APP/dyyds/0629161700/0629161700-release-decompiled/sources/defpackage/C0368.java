package defpackage;

/* JADX INFO: renamed from: ᛲᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0368 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f1911 = 0;
    private volatile /* synthetic */ java.lang.Object _cur$volatile;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛲᲁᲈᲀ> r1 = defpackage.C0368.class
            java.lang.String r2 = "_cur$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.C0368.f1911 = r0
            return
    }

    public C0368() {
            r3 = this;
            r3.<init>()
            ᛲᲇ r0 = new ᛲᲇ
            r1 = 8
            r2 = 0
            r0.<init>(r1, r2)
            r3._cur$volatile = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object m1091() {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0368.f1911
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            ᛲᲇ r7 = (defpackage.C0369) r7
            java.lang.Object r0 = r7.m1095()
            ᛳᛴᛵᛱ r3 = defpackage.C0369.f1912
            if (r0 == r3) goto L14
            return r0
        L14:
            ᛲᲇ r8 = r7.m1096()
        L18:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C0368.f1911
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L24
            goto L2c
        L24:
            sun.misc.Unsafe r9 = defpackage.AbstractC0051.f569
            java.lang.Object r9 = r9.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
        L2c:
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L18
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int m1092() {
            r4 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0368.f1911
            java.lang.Object r4 = r0.getObjectVolatile(r4, r1)
            ᛲᲇ r4 = (defpackage.C0369) r4
            r4.getClass()
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0369.f1914
            long r0 = r0.getLongVolatile(r4, r1)
            r2 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r2 = r2 & r0
            int r4 = (int) r2
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r2
            r2 = 30
            long r0 = r0 >> r2
            int r0 = (int) r0
            int r0 = r0 - r4
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r0
            return r4
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean m1093(java.lang.Runnable r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0368.f1911
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            ᛲᲇ r7 = (defpackage.C0369) r7
            int r0 = r7.m1097(r10)
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L1b
            r1 = 2
            if (r0 == r1) goto L19
            r4 = r9
            goto L31
        L19:
            r9 = 0
            return r9
        L1b:
            ᛲᲇ r8 = r7.m1096()
        L1f:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C0368.f1911
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2b
            goto L31
        L2b:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L33
        L31:
            r9 = r4
            goto L0
        L33:
            r9 = r4
            goto L1f
        L35:
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m1094() {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.C0368.f1911
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            ᛲᲇ r7 = (defpackage.C0369) r7
            boolean r0 = r7.m1098()
            if (r0 == 0) goto L12
            return
        L12:
            ᛲᲇ r8 = r7.m1096()
        L16:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C0368.f1911
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L22
            goto L2a
        L22:
            sun.misc.Unsafe r9 = defpackage.AbstractC0051.f569
            java.lang.Object r9 = r9.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2c
        L2a:
            r9 = r4
            goto L0
        L2c:
            r9 = r4
            goto L16
    }
}
