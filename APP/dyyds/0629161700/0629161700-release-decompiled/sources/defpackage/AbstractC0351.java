package defpackage;

/* JADX INFO: renamed from: ᛲᲀᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0351 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final /* synthetic */ long f1815 = 0;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f1816 = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛲᲀᛵᲈ> r1 = defpackage.AbstractC0351.class
            java.lang.String r2 = "_next$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.AbstractC0351.f1815 = r2
            java.lang.String r2 = "_prev$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.AbstractC0351.f1816 = r0
            return
    }

    public AbstractC0351(defpackage.C2053 r1) {
            r0 = this;
            r0.<init>()
            r0._prev$volatile = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1061() {
            r14 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0351.f1815
            java.lang.Object r0 = r0.getObjectVolatile(r14, r1)
            ᛳᛴᛵᛱ r3 = defpackage.AbstractC2279.f9634
            r4 = 0
            if (r0 != r3) goto Lf
            r0 = r4
            goto L11
        Lf:
            ᛲᲀᛵᲈ r0 = (defpackage.AbstractC0351) r0
        L11:
            if (r0 != 0) goto L14
            return
        L14:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r5 = defpackage.AbstractC0351.f1816
            java.lang.Object r0 = r0.getObjectVolatile(r14, r5)
            ᛲᲀᛵᲈ r0 = (defpackage.AbstractC0351) r0
        L1e:
            if (r0 == 0) goto L2f
            boolean r7 = r0.mo1062()
            if (r7 == 0) goto L2f
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569
            java.lang.Object r0 = r7.getObjectVolatile(r0, r5)
            ᛲᲀᛵᲈ r0 = (defpackage.AbstractC0351) r0
            goto L1e
        L2f:
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569
            java.lang.Object r7 = r7.getObjectVolatile(r14, r1)
            if (r7 != r3) goto L39
            r7 = r4
            goto L3b
        L39:
            ᛲᲀᛵᲈ r7 = (defpackage.AbstractC0351) r7
        L3b:
            r9 = r7
            boolean r7 = r9.mo1062()
            if (r7 == 0) goto L50
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569
            java.lang.Object r7 = r7.getObjectVolatile(r9, r1)
            if (r7 != r3) goto L4c
            r7 = r4
            goto L4e
        L4c:
            ᛲᲀᛵᲈ r7 = (defpackage.AbstractC0351) r7
        L4e:
            if (r7 != 0) goto L3b
        L50:
            sun.misc.Unsafe r7 = defpackage.AbstractC0051.f569
            java.lang.Object r12 = r7.getObjectVolatile(r9, r5)
            r7 = r12
            ᛲᲀᛵᲈ r7 = (defpackage.AbstractC0351) r7
            if (r7 != 0) goto L5d
            r13 = r4
            goto L5e
        L5d:
            r13 = r0
        L5e:
            sun.misc.Unsafe r8 = defpackage.AbstractC0051.f569
            long r10 = defpackage.AbstractC0351.f1816
            boolean r7 = r8.compareAndSwapObject(r9, r10, r12, r13)
            if (r7 == 0) goto L88
            if (r0 == 0) goto L6d
            r8.putObjectVolatile(r0, r1, r9)
        L6d:
            boolean r5 = r9.mo1062()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r8.getObjectVolatile(r9, r1)
            if (r5 != r3) goto L7b
            r5 = r4
            goto L7d
        L7b:
            ᛲᲀᛵᲈ r5 = (defpackage.AbstractC0351) r5
        L7d:
            if (r5 != 0) goto L14
        L7f:
            if (r0 == 0) goto L87
            boolean r0 = r0.mo1062()
            if (r0 != 0) goto L14
        L87:
            return
        L88:
            java.lang.Object r7 = r8.getObjectVolatile(r9, r5)
            if (r7 == r12) goto L5e
            goto L50
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public abstract boolean mo1062();
}
