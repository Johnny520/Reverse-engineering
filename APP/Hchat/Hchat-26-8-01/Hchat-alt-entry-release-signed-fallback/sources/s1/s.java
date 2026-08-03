package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1.a f12287a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1.a f12288b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1.a f12289c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.StackTraceElement[] f12290d = null;

    static {
            s1.a r0 = new s1.a
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1)
            s1.s.f12287a = r0
            s1.a r0 = new s1.a
            r1 = 1007(0x3ef, float:1.411E-42)
            r0.<init>(r1)
            s1.a r0 = new s1.a
            r1 = 1008(0x3f0, float:1.413E-42)
            r0.<init>(r1)
            s1.s.f12288b = r0
            s1.a r0 = new s1.a
            r1 = 1002(0x3ea, float:1.404E-42)
            r0.<init>(r1)
            s1.s.f12289c = r0
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            s1.s.f12290d = r0
            return
    }

    public static final boolean a(s1.t r1) {
            boolean r0 = r1.b()
            if (r0 != 0) goto L10
            boolean r0 = r1.f12298h
            if (r0 != 0) goto L10
            boolean r1 = r1.f12294d
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final boolean b(s1.t r1) {
            boolean r0 = r1.f12298h
            if (r0 != 0) goto La
            boolean r1 = r1.f12294d
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final boolean c(s1.t r1) {
            boolean r0 = r1.b()
            if (r0 != 0) goto L10
            boolean r0 = r1.f12298h
            if (r0 == 0) goto L10
            boolean r1 = r1.f12294d
            if (r1 != 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final boolean d(s1.t r1) {
            boolean r0 = r1.f12298h
            if (r0 == 0) goto La
            boolean r1 = r1.f12294d
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final boolean e(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final boolean f(s1.t r10, long r11, long r13) {
            int r0 = r10.f12299i
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            long r3 = r10.f12293c
            r10 = 32
            long r5 = r3 >> r10
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r8 = r13 >> r10
            int r4 = (int) r8
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r0 = (float) r0
            float r4 = r4 * r0
            long r8 = r11 >> r10
            int r10 = (int) r8
            float r10 = (float) r10
            float r10 = r10 + r4
            long r13 = r13 & r6
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r13 = r13 * r0
            long r11 = r11 & r6
            int r11 = (int) r11
            float r11 = (float) r11
            float r11 = r11 + r13
            float r12 = -r4
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 >= 0) goto L3f
            r12 = r2
            goto L40
        L3f:
            r12 = r1
        L40:
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 <= 0) goto L46
            r10 = r2
            goto L47
        L46:
            r10 = r1
        L47:
            r10 = r10 | r12
            float r12 = -r13
            int r12 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r12 >= 0) goto L4f
            r12 = r2
            goto L50
        L4f:
            r12 = r1
        L50:
            r10 = r10 | r12
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 <= 0) goto L56
            r1 = r2
        L56:
            r10 = r10 | r1
            return r10
    }

    public static y0.o g(y0.o r1, s1.a r2) {
            s1.n r0 = new s1.n
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final long h(s1.t r4, boolean r5) {
            long r0 = r4.f12297g
            long r2 = r4.f12293c
            long r0 = e1.b.d(r2, r0)
            if (r5 != 0) goto L13
            boolean r4 = r4.b()
            if (r4 == 0) goto L13
            r4 = 0
            return r4
        L13:
            return r0
    }

    public static final void i(s1.k r4, long r5, fg.l r7, boolean r8) {
            android.view.MotionEvent r4 = r4.a()
            if (r4 == 0) goto L3b
            int r0 = r4.getAction()
            if (r8 == 0) goto L10
            r8 = 3
            r4.setAction(r8)
        L10:
            r8 = 32
            long r1 = r5 >> r8
            int r8 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r8)
            float r1 = -r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r2
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            float r6 = -r6
            r4.offsetLocation(r1, r6)
            r7.invoke(r4)
            float r6 = java.lang.Float.intBitsToFloat(r8)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r4.offsetLocation(r6, r5)
            r4.setAction(r0)
            return
        L3b:
            java.lang.String r4 = "The PointerEvent receiver cannot have a null MotionEvent."
            j8.o.t(r4)
            return
    }

    public static java.lang.String j(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerId(value="
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
