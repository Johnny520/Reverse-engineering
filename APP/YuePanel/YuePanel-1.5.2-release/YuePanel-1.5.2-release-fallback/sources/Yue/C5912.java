package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5912 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f21572 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.String f21573 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f21574 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f21575 = null;

    static {
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> Ld
            java.lang.Class<Yue.ۥ۟ۢۥۢ> r0 = Yue.AbstractC0730.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r0 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> Ld
            goto L18
        Ld:
            r0 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r0 = Yue.C5391.m20390(r0)
            java.lang.Object r0 = Yue.C5388.m20377(r0)
        L18:
            java.lang.Throwable r1 = Yue.C5388.m20380(r0)
            if (r1 != 0) goto L1f
            goto L21
        L1f:
            java.lang.String r0 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
        L21:
            java.lang.String r0 = (java.lang.String) r0
            Yue.C5912.f21574 = r0
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L32
            java.lang.Class<Yue.ۥۢ۟ۧۦ> r0 = Yue.C5912.class
            java.lang.String r0 = r0.getCanonicalName()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = Yue.C5388.m20377(r0)     // Catch: java.lang.Throwable -> L32
            goto L3d
        L32:
            r0 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r0 = Yue.C5391.m20390(r0)
            java.lang.Object r0 = Yue.C5388.m20377(r0)
        L3d:
            java.lang.Throwable r1 = Yue.C5388.m20380(r0)
            if (r1 != 0) goto L44
            goto L46
        L44:
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
        L46:
            java.lang.String r0 = (java.lang.String) r0
            Yue.C5912.f21575 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m21944() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m21945() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Throwable m21946(java.lang.Throwable r0, Yue.InterfaceC1665 r1) {
            java.lang.Throwable r0 = m21958(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3324
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.StackTraceElement m21947(@Yue.InterfaceC4418 java.lang.String r3) {
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\b\b\b("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "\b"
            r2 = -1
            r0.<init>(r3, r1, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> Yue.C4677<E, java.lang.StackTraceElement[]> m21948(E r6) {
            java.lang.Throwable r0 = r6.getCause()
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r6.getClass()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L34
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()
            int r3 = r2.length
            r4 = r1
        L1b:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]
            boolean r5 = m21954(r5)
            if (r5 == 0) goto L2a
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r0, r2)
            goto L3a
        L2a:
            int r4 = r4 + 1
            goto L1b
        L2d:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r6, r0)
            goto L3a
        L34:
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r1]
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r6, r0)
        L3a:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21949(E r5, E r6, java.util.ArrayDeque<java.lang.StackTraceElement> r7) {
            java.lang.String r0 = "Coroutine boundary"
            java.lang.StackTraceElement r0 = m21947(r0)
            r7.addFirst(r0)
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            java.lang.String r0 = Yue.C5912.f21574
            int r0 = m21952(r5, r0)
            r1 = -1
            r2 = 0
            if (r0 != r1) goto L2d
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r2]
            java.lang.Object[] r5 = r7.toArray(r5)
            if (r5 == 0) goto L25
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            r6.setStackTrace(r5)
            return r6
        L25:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r5.<init>(r6)
            throw r5
        L2d:
            int r1 = r7.size()
            int r1 = r1 + r0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            r3 = r2
        L35:
            if (r3 >= r0) goto L3e
            r4 = r5[r3]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L35
        L3e:
            java.util.Iterator r5 = r7.iterator()
        L42:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L55
            int r7 = r2 + 1
            java.lang.Object r3 = r5.next()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            int r2 = r2 + r0
            r1[r2] = r3
            r2 = r7
            goto L42
        L55:
            r6.setStackTrace(r1)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.util.ArrayDeque<java.lang.StackTraceElement> m21950(Yue.InterfaceC1665 r2) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto Le
            r0.add(r1)
        Le:
            Yue.ۥ۟ۧۧۨ r2 = r2.getCallerFrame()
            if (r2 != 0) goto L15
            return r0
        L15:
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto Le
            r0.add(r1)
            goto Le
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m21951(java.lang.StackTraceElement r2, java.lang.StackTraceElement r3) {
            int r0 = r2.getLineNumber()
            int r1 = r3.getLineNumber()
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.getMethodName()
            java.lang.String r1 = r3.getMethodName()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getFileName()
            java.lang.String r1 = r3.getFileName()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r2 = r2.getClassName()
            java.lang.String r3 = r3.getClassName()
            boolean r2 = Yue.C3329.m13897(r2, r3)
            if (r2 == 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m21952(java.lang.StackTraceElement[] r3, java.lang.String r4) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r3[r1]
            java.lang.String r2 = r2.getClassName()
            boolean r2 = Yue.C3329.m13897(r4, r2)
            if (r2 == 0) goto L11
            goto L15
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            r1 = -1
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m21953(@Yue.InterfaceC4418 java.lang.Throwable r0, @Yue.InterfaceC4418 java.lang.Throwable r1) {
            r0.initCause(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m21954(@Yue.InterfaceC4418 java.lang.StackTraceElement r4) {
            java.lang.String r4 = r4.getClassName()
            r0 = 2
            r1 = 0
            java.lang.String r2 = "\b\b\b"
            r3 = 0
            boolean r4 = Yue.C5988.m22315(r4, r2, r3, r0, r1)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m21955(java.lang.StackTraceElement[] r4, java.util.ArrayDeque<java.lang.StackTraceElement> r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            boolean r2 = m21954(r2)
            if (r2 == 0) goto Ld
            goto L11
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r1 = -1
        L11:
            int r1 = r1 + 1
            int r0 = r4.length
            int r0 = r0 + (-1)
            if (r1 > r0) goto L33
        L18:
            r2 = r4[r0]
            java.lang.Object r3 = r5.getLast()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            boolean r2 = m21951(r2, r3)
            if (r2 == 0) goto L29
            r5.removeLast()
        L29:
            r2 = r4[r0]
            r5.addFirst(r2)
            if (r0 == r1) goto L33
            int r0 = r0 + (-1)
            goto L18
        L33:
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.Object m21956(@Yue.InterfaceC4418 java.lang.Throwable r0, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r1) {
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final java.lang.Object m21957(java.lang.Throwable r0, Yue.InterfaceC1598<?> r1) {
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21958(E r4, Yue.InterfaceC1665 r5) {
            Yue.ۥۣۡۦ۠ r0 = m21948(r4)
            java.lang.Object r1 = r0.m18537()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.m18538()
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            java.lang.Throwable r2 = m21962(r1)
            if (r2 != 0) goto L17
            return r4
        L17:
            java.util.ArrayDeque r5 = m21950(r5)
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L22
            return r4
        L22:
            if (r1 == r4) goto L27
            m21955(r0, r5)
        L27:
            java.lang.Throwable r4 = m21949(r1, r2, r5)
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21959(@Yue.InterfaceC4418 E r0) {
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21960(@Yue.InterfaceC4418 E r0, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r1) {
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21961(E r7) {
            java.lang.StackTraceElement[] r0 = r7.getStackTrace()
            int r1 = r0.length
            java.lang.String r2 = Yue.C5912.f21575
            int r2 = m21952(r0, r2)
            int r3 = r2 + 1
            java.lang.String r4 = Yue.C5912.f21574
            int r4 = m21952(r0, r4)
            r5 = -1
            r6 = 0
            if (r4 != r5) goto L19
            r4 = r6
            goto L1b
        L19:
            int r4 = r1 - r4
        L1b:
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r1]
        L1f:
            if (r6 >= r1) goto L35
            if (r6 != 0) goto L2a
            java.lang.String r4 = "Coroutine boundary"
            java.lang.StackTraceElement r4 = m21947(r4)
            goto L30
        L2a:
            int r4 = r3 + r6
            int r4 = r4 + (-1)
            r4 = r0[r4]
        L30:
            r2[r6] = r4
            int r6 = r6 + 1
            goto L1f
        L35:
            r7.setStackTrace(r2)
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21962(E r3) {
            java.lang.Throwable r0 = Yue.C2257.m10457(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r3 instanceof Yue.InterfaceC1631
            if (r2 != 0) goto L1b
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = r3.getMessage()
            boolean r3 = Yue.C3329.m13897(r2, r3)
            if (r3 != 0) goto L1b
            return r1
        L1b:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21963(@Yue.InterfaceC4418 E r0) {
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <E extends java.lang.Throwable> E m21964(@Yue.InterfaceC4418 E r5) {
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L29
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = r5.getClass()
            boolean r1 = Yue.C3329.m13897(r1, r2)
            if (r1 != 0) goto L15
            goto L29
        L15:
            java.lang.StackTraceElement[] r1 = r5.getStackTrace()
            int r2 = r1.length
            r3 = 0
        L1b:
            if (r3 >= r2) goto L29
            r4 = r1[r3]
            boolean r4 = m21954(r4)
            if (r4 == 0) goto L26
            return r0
        L26:
            int r3 = r3 + 1
            goto L1b
        L29:
            return r5
    }
}
