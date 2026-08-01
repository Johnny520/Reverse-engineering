package defpackage;

/* JADX INFO: renamed from: ᲈᲈᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2372 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f10255 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ long f10256 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f10257 = 0;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᲈᲈᲀᲀ> r1 = defpackage.AbstractC2372.class
            java.lang.String r2 = "_next$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.AbstractC2372.f10257 = r2
            java.lang.String r2 = "_prev$volatile"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)
            long r2 = r0.objectFieldOffset(r2)
            defpackage.AbstractC2372.f10256 = r2
            java.lang.String r2 = "_removedRef$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.AbstractC2372.f10255 = r0
            return
    }

    public AbstractC2372() {
            r0 = this;
            r0.<init>()
            r0._next$volatile = r0
            r0._prev$volatile = r0
            return
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ᲇᲀᲇᛸ r1 = new ᲇᲀᲇᛸ
            java.lang.String r5 = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"
            r6 = 1
            java.lang.Class<ᛴᲁᛳᛲ> r3 = defpackage.AbstractC0762.class
            java.lang.String r4 = "classSimpleName"
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.append(r1)
            r7 = 64
            r0.append(r7)
            java.lang.String r7 = defpackage.AbstractC0762.m1681(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.Object m3879() {
            r3 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC2372.f10257
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public boolean mo1753() {
            r0 = this;
            java.lang.Object r0 = r0.m3879()
            boolean r0 = r0 instanceof defpackage.C0746
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.AbstractC2372 m3880() {
            r1 = this;
            java.lang.Object r1 = r1.m3879()
            boolean r0 = r1 instanceof defpackage.C0746
            if (r0 == 0) goto Lc
            r0 = r1
            ᛴᲀᛶᛲ r0 = (defpackage.C0746) r0
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L12
            ᲈᲈᲀᲀ r1 = r0.f3518
            return r1
        L12:
            ᲈᲈᲀᲀ r1 = (defpackage.AbstractC2372) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean m3881(defpackage.AbstractC2372 r10, int r11) {
            r9 = this;
        L0:
            ᲈᲈᲀᲀ r1 = r9.m3882()
            boolean r0 = r1 instanceof defpackage.C1980
            r6 = 1
            if (r0 == 0) goto L1a
            r9 = r1
            ᲇᛱᛷᛷ r9 = (defpackage.C1980) r9
            int r9 = r9.f8571
            r9 = r9 & r11
            if (r9 != 0) goto L18
            boolean r9 = r1.m3881(r10, r11)
            if (r9 == 0) goto L18
            return r6
        L18:
            r9 = 0
            return r9
        L1a:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC2372.f10256
            r0.putObjectVolatile(r10, r2, r1)
            long r7 = defpackage.AbstractC2372.f10257
            r0.putObjectVolatile(r10, r7, r9)
        L26:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC2372.f10257
            r4 = r9
            r5 = r10
            boolean r9 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r9 == 0) goto L36
            r5.m3884(r4)
            return r6
        L36:
            java.lang.Object r9 = r0.getObjectVolatile(r1, r7)
            if (r9 == r4) goto L3f
            r9 = r4
            r10 = r5
            goto L0
        L3f:
            r9 = r4
            r10 = r5
            goto L26
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.AbstractC2372 m3882() {
            r3 = this;
            ᲈᲈᲀᲀ r0 = r3.m3883()
            if (r0 != 0) goto L20
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC2372.f10256
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            ᲈᲈᲀᲀ r3 = (defpackage.AbstractC2372) r3
        L10:
            boolean r0 = r3.mo1753()
            if (r0 != 0) goto L17
            return r3
        L17:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            ᲈᲈᲀᲀ r3 = (defpackage.AbstractC2372) r3
            goto L10
        L20:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.AbstractC2372 m3883() {
            r15 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC2372.f10256
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            ᲈᲈᲀᲀ r7 = (defpackage.AbstractC2372) r7
            r0 = 0
            r9 = r0
            r8 = r7
        Le:
            if (r8 == 0) goto L78
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC2372.f10257
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L36
            if (r7 != r8) goto L1d
            goto L2a
        L1d:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.AbstractC2372.f10256
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L33
        L31:
            r15 = r7
            goto L0
        L33:
            r15 = r7
            r7 = r14
            goto L1d
        L36:
            r14 = r7
            r7 = r15
            boolean r15 = r7.mo1753()
            if (r15 == 0) goto L3f
            return r0
        L3f:
            boolean r15 = r6 instanceof defpackage.C0746
            if (r15 == 0) goto L72
            if (r9 == 0) goto L62
            ᛴᲀᛶᛲ r6 = (defpackage.C0746) r6
            ᲈᲈᲀᲀ r13 = r6.f3518
        L49:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.AbstractC0051.f569
            long r10 = defpackage.AbstractC2372.f10257
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L5b
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto Le
        L5b:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L49
            goto L31
        L62:
            if (r8 == 0) goto L6e
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            ᲈᲈᲀᲀ r8 = (defpackage.AbstractC2372) r8
        L6b:
            r15 = r7
            r7 = r14
            goto Le
        L6e:
            defpackage.C2264.m3679()
            return r0
        L72:
            r15 = r6
            ᲈᲈᲀᲀ r15 = (defpackage.AbstractC2372) r15
            r9 = r8
            r8 = r15
            goto L6b
        L78:
            defpackage.C2264.m3679()
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m3884(defpackage.AbstractC2372 r10) {
            r9 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC2372.f10256
            java.lang.Object r0 = r0.getObjectVolatile(r10, r1)
            r7 = r0
            ᲈᲈᲀᲀ r7 = (defpackage.AbstractC2372) r7
            java.lang.Object r0 = r9.m3879()
            if (r0 == r10) goto L12
            goto L27
        L12:
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r5 = defpackage.AbstractC2372.f10256
            r8 = r9
            r4 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L28
            boolean r9 = r8.mo1753()
            if (r9 == 0) goto L27
            r4.m3883()
        L27:
            return
        L28:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            r10 = r4
            if (r9 == r7) goto L31
            r9 = r8
            goto L0
        L31:
            r9 = r8
            goto L12
    }
}
