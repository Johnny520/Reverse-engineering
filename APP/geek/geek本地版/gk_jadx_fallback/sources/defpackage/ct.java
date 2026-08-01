package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ct implements defpackage.ya0 {
    public static long a;
    public static long b;
    public static java.lang.reflect.Method c;

    public ct() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
    }

    public static int d(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static float[] e(float[] r2, int r3) {
            if (r3 < 0) goto L16
            int r0 = r2.length
            if (r0 < 0) goto L10
            int r0 = java.lang.Math.min(r3, r0)
            float[] r3 = new float[r3]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r3, r1, r0)
            return r3
        L10:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }

    public static final defpackage.e10 f(java.lang.Throwable r1) {
            java.lang.String r0 = "exception"
            defpackage.ip.o(r0, r1)
            e10 r0 = new e10
            r0.<init>(r1)
            return r0
    }

    public static defpackage.ox[] j(java.lang.String r17) {
            r0 = r17
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r5 = r2
            r4 = 1
        Le:
            int r6 = r0.length()
            if (r4 >= r6) goto Le6
        L14:
            int r6 = r0.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L38
            char r6 = r0.charAt(r4)
            int r9 = r6 + (-65)
            int r10 = r6 + (-90)
            int r10 = r10 * r9
            if (r10 <= 0) goto L30
            int r9 = r6 + (-97)
            int r10 = r6 + (-122)
            int r10 = r10 * r9
            if (r10 > 0) goto L35
        L30:
            if (r6 == r8) goto L35
            if (r6 == r7) goto L35
            goto L38
        L35:
            int r4 = r4 + 1
            goto L14
        L38:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 <= 0) goto Ldf
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto Lcd
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L58
            goto Lcd
        L58:
            int r6 = r5.length()     // Catch: java.lang.NumberFormatException -> Lae
            float[] r6 = new float[r6]     // Catch: java.lang.NumberFormatException -> Lae
            int r9 = r5.length()     // Catch: java.lang.NumberFormatException -> Lae
            r11 = r2
            r10 = 1
        L64:
            if (r10 >= r9) goto Lb8
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r12 = r10
        L6c:
            int r3 = r5.length()     // Catch: java.lang.NumberFormatException -> Lae
            if (r12 >= r3) goto L9e
            char r3 = r5.charAt(r12)     // Catch: java.lang.NumberFormatException -> Lae
            r2 = 32
            if (r3 == r2) goto L95
            if (r3 == r7) goto L93
            if (r3 == r8) goto L93
            switch(r3) {
                case 44: goto L95;
                case 45: goto L8c;
                case 46: goto L82;
                default: goto L81;
            }     // Catch: java.lang.NumberFormatException -> Lae
        L81:
            goto L91
        L82:
            if (r14 != 0) goto L87
            r13 = 0
            r14 = 1
            goto L97
        L87:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L97
        L8c:
            if (r12 == r10) goto L91
            if (r13 != 0) goto L91
            goto L87
        L91:
            r13 = 0
            goto L97
        L93:
            r13 = 1
            goto L97
        L95:
            r13 = 0
            r15 = 1
        L97:
            if (r15 == 0) goto L9a
            goto L9e
        L9a:
            int r12 = r12 + 1
            r2 = 0
            goto L6c
        L9e:
            if (r10 >= r12) goto Lb0
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch: java.lang.NumberFormatException -> Lae
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> Lae
            r6[r11] = r3     // Catch: java.lang.NumberFormatException -> Lae
            r11 = r2
            goto Lb0
        Lae:
            r0 = move-exception
            goto Lbf
        Lb0:
            if (r16 == 0) goto Lb5
            r10 = r12
        Lb3:
            r2 = 0
            goto L64
        Lb5:
            int r10 = r12 + 1
            goto Lb3
        Lb8:
            float[] r2 = e(r6, r11)     // Catch: java.lang.NumberFormatException -> Lae
            r3 = r2
            r2 = 0
            goto Lcf
        Lbf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = defpackage.z30.j(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        Lcd:
            float[] r3 = new float[r2]
        Lcf:
            char r5 = r5.charAt(r2)
            ox r2 = new ox
            r2.<init>()
            r2.a = r5
            r2.b = r3
            r1.add(r2)
        Ldf:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto Le
        Le6:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L103
            int r2 = r0.length()
            if (r5 >= r2) goto L103
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r2 = new float[r2]
            ox r3 = new ox
            r3.<init>()
            r3.a = r0
            r3.b = r2
            r1.add(r3)
        L103:
            int r0 = r1.size()
            ox[] r0 = new defpackage.ox[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            ox[] r0 = (defpackage.ox[]) r0
            return r0
    }

    public static defpackage.ox[] k(defpackage.ox[] r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            int r0 = r5.length
            ox[] r0 = new defpackage.ox[r0]
            r1 = 0
        L8:
            int r2 = r5.length
            if (r1 >= r2) goto L24
            ox r2 = new ox
            r3 = r5[r1]
            r2.<init>()
            char r4 = r3.a
            r2.a = r4
            float[] r3 = r3.b
            int r4 = r3.length
            float[] r3 = e(r3, r4)
            r2.b = r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L24:
            return r0
    }

    public static android.content.res.ColorStateList m(android.content.Context r2, defpackage.r5 r3, int r4) {
            java.lang.Object r0 = r3.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L18
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r2 = defpackage.ip.v(r2, r0)
            if (r2 == 0) goto L18
            return r2
        L18:
            android.content.res.ColorStateList r2 = r3.l(r4)
            return r2
    }

    public static android.content.res.ColorStateList n(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = defpackage.ip.v(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }

    public static android.graphics.drawable.Drawable o(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r1 = defpackage.ff.r(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
    }

    public static float p(java.lang.String[] r2, int r3) {
            r2 = r2[r3]
            float r2 = java.lang.Float.parseFloat(r2)
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L12
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Motion easing control point value must be between 0 and 1; instead got: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    public static int q(int r3) {
            r0 = 1
            if (r3 == r0) goto L41
            r1 = 2
            if (r3 == r1) goto L40
            r0 = 4
            if (r3 == r0) goto L3f
            r1 = 8
            if (r3 == r1) goto L3d
            r2 = 16
            if (r3 == r2) goto L3c
            r0 = 32
            if (r3 == r0) goto L3a
            r0 = 64
            if (r3 == r0) goto L38
            r0 = 128(0x80, float:1.8E-43)
            if (r3 == r0) goto L36
            r0 = 256(0x100, float:3.59E-43)
            if (r3 != r0) goto L22
            return r1
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "type needs to be >= FIRST and <= LAST, type="
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L36:
            r3 = 7
            return r3
        L38:
            r3 = 6
            return r3
        L3a:
            r3 = 5
            return r3
        L3c:
            return r0
        L3d:
            r3 = 3
            return r3
        L3f:
            return r1
        L40:
            return r0
        L41:
            r3 = 0
            return r3
    }

    public static boolean r() {
            java.lang.reflect.Method r0 = defpackage.ct.c     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = defpackage.f0.s()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            java.lang.Class<android.os.Trace> r0 = android.os.Trace.class
            java.lang.reflect.Method r1 = defpackage.ct.c     // Catch: java.lang.Exception -> L41
            r2 = 0
            if (r1 != 0) goto L2a
            java.lang.String r1 = "TRACE_TAG_APP"
            java.lang.reflect.Field r1 = r0.getField(r1)     // Catch: java.lang.Exception -> L41
            long r3 = r1.getLong(r2)     // Catch: java.lang.Exception -> L41
            defpackage.ct.b = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "isTagEnabled"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L41
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Exception -> L41
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L41
            defpackage.ct.c = r0     // Catch: java.lang.Exception -> L41
        L2a:
            java.lang.reflect.Method r0 = defpackage.ct.c     // Catch: java.lang.Exception -> L41
            long r3 = defpackage.ct.b     // Catch: java.lang.Exception -> L41
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L41
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L41
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L41
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L41
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L41
            goto L5f
        L41:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L57
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L51
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L51:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L57:
            java.lang.String r1 = "Trace"
            java.lang.String r2 = "Unable to call isTagEnabled via reflection"
            android.util.Log.v(r1, r2, r0)
            r0 = 0
        L5f:
            return r0
    }

    public static boolean s(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1067869798(0x3fa66666, float:1.3)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L13
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static boolean t(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "("
            java.lang.String r2 = r2.concat(r0)
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L16
            java.lang.String r2 = ")"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static final int u(defpackage.hp r3) {
            m r0 = defpackage.az.a
            int r0 = r3.a
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L30
            int r3 = r3.b
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r1) goto L1a
            int r3 = r3 + 1
            m r1 = defpackage.az.a
            int r3 = r1.c(r0, r3)
            return r3
        L1a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 <= r1) goto L29
            int r0 = r0 + (-1)
            m r1 = defpackage.az.a
            int r3 = r1.c(r0, r3)
            int r3 = r3 + 1
            return r3
        L29:
            m r3 = defpackage.az.a
            int r3 = r3.b()
            return r3
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot get random in empty range: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int v(android.content.Context r1, int r2, int r3) {
            android.util.TypedValue r1 = defpackage.gt.y(r1, r2)
            if (r1 == 0) goto Lf
            int r2 = r1.type
            r0 = 16
            if (r2 != r0) goto Lf
            int r1 = r1.data
            return r1
        Lf:
            return r3
    }

    public static android.animation.TimeInterpolator w(android.content.Context r5, int r6, android.animation.TimeInterpolator r7) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 1
            boolean r6 = r1.resolveAttribute(r6, r0, r2)
            if (r6 != 0) goto L11
            return r7
        L11:
            int r6 = r0.type
            r7 = 3
            if (r6 != r7) goto Lc1
            java.lang.CharSequence r6 = r0.string
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "cubic-bezier"
            boolean r3 = t(r6, r1)
            java.lang.String r4 = "path"
            if (r3 != 0) goto L34
            boolean r3 = t(r6, r4)
            if (r3 == 0) goto L2d
            goto L34
        L2d:
            int r6 = r0.resourceId
            android.view.animation.Interpolator r5 = android.view.animation.AnimationUtils.loadInterpolator(r5, r6)
            return r5
        L34:
            boolean r5 = t(r6, r1)
            if (r5 == 0) goto L7b
            int r5 = r6.length()
            int r5 = r5 - r2
            r0 = 13
            java.lang.String r5 = r6.substring(r0, r5)
            java.lang.String r6 = ","
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r0 = 4
            if (r6 != r0) goto L66
            r6 = 0
            float r6 = p(r5, r6)
            float r0 = p(r5, r2)
            r1 = 2
            float r1 = p(r5, r1)
            float r5 = p(r5, r7)
            android.view.animation.PathInterpolator r5 = defpackage.nx.b(r6, r0, r1, r5)
            return r5
        L66:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "
            r7.<init>(r0)
            int r5 = r5.length
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L7b:
            boolean r5 = t(r6, r4)
            if (r5 == 0) goto Lb5
            int r5 = r6.length()
            int r5 = r5 - r2
            r7 = 5
            java.lang.String r5 = r6.substring(r7, r5)
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            ox[] r7 = j(r5)
            if (r7 == 0) goto Laf
            defpackage.ox.b(r7, r6)     // Catch: java.lang.RuntimeException -> L9a
            goto Lb0
        L9a:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error in parsing "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5, r6)
            throw r7
        Laf:
            r6 = 0
        Lb0:
            android.view.animation.PathInterpolator r5 = defpackage.nx.c(r6)
            return r5
        Lb5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Invalid motion easing type: "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
        Lc1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes."
            r5.<init>(r6)
            throw r5
    }

    public static final java.lang.Object x(defpackage.w10 r1, defpackage.w10 r2, defpackage.wm r3) {
            r0 = r3
            m50 r0 = (defpackage.m50) r0     // Catch: java.lang.Throwable -> Lb
            defpackage.a80.b(r0)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r3.e(r2, r1)     // Catch: java.lang.Throwable -> Lb
            goto L13
        Lb:
            r2 = move-exception
            nb r3 = new nb
            r0 = 0
            r3.<init>(r2, r0)
            r2 = r3
        L13:
            pe r3 = defpackage.pe.a
            if (r2 != r3) goto L18
            goto L38
        L18:
            java.lang.Object r1 = r1.C(r2)
            l0 r2 = defpackage.ip.g
            if (r1 != r2) goto L21
            goto L38
        L21:
            boolean r2 = r1 instanceof defpackage.nb
            if (r2 != 0) goto L39
            boolean r2 = r1 instanceof defpackage.wo
            if (r2 == 0) goto L2d
            r2 = r1
            wo r2 = (defpackage.wo) r2
            goto L2e
        L2d:
            r2 = 0
        L2e:
            if (r2 == 0) goto L37
            vo r2 = r2.a
            if (r2 != 0) goto L35
            goto L37
        L35:
            r3 = r2
            goto L38
        L37:
            r3 = r1
        L38:
            return r3
        L39:
            nb r1 = (defpackage.nb) r1
            java.lang.Throwable r1 = r1.a
            throw r1
    }

    public static final void y(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.e10
            if (r0 != 0) goto L5
            return
        L5:
            e10 r1 = (defpackage.e10) r1
            java.lang.Throwable r1 = r1.a
            throw r1
    }

    @Override // defpackage.ya0
    public void b(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // defpackage.ya0
    public void c() {
            r0 = this;
            return
    }

    public abstract android.graphics.Typeface g(android.content.Context r1, defpackage.dl r2, android.content.res.Resources r3, int r4);

    public abstract android.graphics.Typeface h(android.content.Context r1, defpackage.gl[] r2, int r3);

    public android.graphics.Typeface i(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            java.io.File r1 = defpackage.gt.k(r1)
            r4 = 0
            if (r1 != 0) goto L8
            return r4
        L8:
            boolean r2 = defpackage.gt.f(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            if (r2 != 0) goto L12
            r1.delete()
            return r4
        L12:
            java.lang.String r2 = r1.getPath()     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            android.graphics.Typeface r2 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1e java.lang.RuntimeException -> L23
            r1.delete()
            return r2
        L1e:
            r2 = move-exception
            r1.delete()
            throw r2
        L23:
            r1.delete()
            return r4
    }

    public defpackage.gl l(int r11, defpackage.gl[] r12) {
            r10 = this;
            iy r0 = new iy
            r1 = 9
            r0.<init>(r1)
            r0 = r11 & 1
            if (r0 != 0) goto Le
            r0 = 400(0x190, float:5.6E-43)
            goto L10
        Le:
            r0 = 700(0x2bc, float:9.81E-43)
        L10:
            r11 = r11 & 2
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L18
            r11 = r2
            goto L19
        L18:
            r11 = r1
        L19:
            int r3 = r12.length
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = r1
        L1f:
            if (r6 >= r3) goto L3d
            r7 = r12[r6]
            int r8 = r7.c
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 * 2
            boolean r9 = r7.d
            if (r9 != r11) goto L32
            r9 = r1
            goto L33
        L32:
            r9 = r2
        L33:
            int r8 = r8 + r9
            if (r4 == 0) goto L38
            if (r5 <= r8) goto L3a
        L38:
            r4 = r7
            r5 = r8
        L3a:
            int r6 = r6 + 1
            goto L1f
        L3d:
            return r4
    }
}
