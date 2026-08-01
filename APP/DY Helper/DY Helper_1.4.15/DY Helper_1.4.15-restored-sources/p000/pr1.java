package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pr1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f8671 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Map f8672 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Map f8673 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f8674 = null;

    /* JADX INFO: renamed from: ε */
    public static volatile p000.or1 f8675;

    /* JADX INFO: renamed from: ζ */
    public static volatile p000.mr1 f8676;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.pr1.f8671 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.pr1.f8672 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.pr1.f8673 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.pr1.f8674 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m4574(java.lang.Object r17, java.lang.Float r18) {
            r0 = r17
            java.lang.String r1 = "currentPosition"
            java.lang.String r2 = "getDuration"
            java.lang.String r3 = "duration"
            java.lang.String[] r4 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L10e
            zi r5 = new zi     // Catch: java.lang.Throwable -> L10e
            r6 = 8
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L10e
            r4.<init>()     // Catch: java.lang.Throwable -> L10e
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)     // Catch: java.lang.Throwable -> L10e
            r6 = 0
            java.lang.Object r4 = m4578(r4, r5, r0, r6)     // Catch: java.lang.Throwable -> L10e
            long r4 = m4576(r4, r2)     // Catch: java.lang.Throwable -> L10e
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r10 = 1
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r9 <= 0) goto L3e
            if (r9 > 0) goto L33
        L31:
            r4 = r7
            goto L3c
        L33:
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 > 0) goto L3c
            int r3 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r3 >= 0) goto L3c
            long r4 = r4 * r12
        L3c:
            r12 = r4
            goto L66
        L3e:
            nq1 r4 = new nq1     // Catch: java.lang.Throwable -> L10e
            r5 = 23
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L10e
            r5.<init>()     // Catch: java.lang.Throwable -> L10e
            java.util.Set r5 = java.util.Collections.newSetFromMap(r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.Object r4 = m4578(r5, r4, r0, r6)     // Catch: java.lang.Throwable -> L10e
            long r3 = m4576(r4, r3)     // Catch: java.lang.Throwable -> L10e
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L5b
            goto L31
        L5b:
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 > 0) goto L64
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 >= 0) goto L64
            long r3 = r3 * r12
        L64:
            r4 = r3
            goto L3c
        L66:
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r18 != 0) goto La9
            java.lang.String r5 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r5 = p000.jf0.m2957(r5)     // Catch: java.lang.Throwable -> L10e
            yh0 r9 = new yh0     // Catch: java.lang.Throwable -> L10e
            r10 = 17
            r9.<init>(r5, r10)     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L10e
            r5.<init>()     // Catch: java.lang.Throwable -> L10e
            java.util.Set r5 = java.util.Collections.newSetFromMap(r5)     // Catch: java.lang.Throwable -> L10e
            java.lang.Object r5 = m4578(r5, r9, r0, r6)     // Catch: java.lang.Throwable -> L10e
            boolean r9 = r5 instanceof android.widget.ProgressBar     // Catch: java.lang.Throwable -> L10e
            r10 = 0
            if (r9 == 0) goto L8d
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5     // Catch: java.lang.Throwable -> L10e
            goto L8e
        L8d:
            r5 = r10
        L8e:
            if (r5 != 0) goto L91
            goto Lab
        L91:
            int r9 = r5.getMax()     // Catch: java.lang.Throwable -> L10e
            if (r9 > 0) goto L98
            goto Lab
        L98:
            int r5 = r5.getProgress()     // Catch: java.lang.Throwable -> L10e
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L10e
            float r9 = (float) r9     // Catch: java.lang.Throwable -> L10e
            float r5 = r5 / r9
            float r5 = p000.j81.m2905(r5, r4, r3)     // Catch: java.lang.Throwable -> L10e
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Throwable -> L10e
            r10 = r5
            goto Lab
        La9:
            r10 = r18
        Lab:
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 <= 0) goto Lb9
            if (r10 == 0) goto Lb9
            float r1 = (float) r12     // Catch: java.lang.Throwable -> L10e
            float r2 = r10.floatValue()     // Catch: java.lang.Throwable -> L10e
            float r1 = r1 * r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L10e
            goto Ld9
        Lb9:
            if (r5 <= 0) goto Ld8
            java.lang.String[] r2 = new java.lang.String[]{r2, r1}     // Catch: java.lang.Throwable -> L10e
            zi r9 = new zi     // Catch: java.lang.Throwable -> L10e
            r10 = 8
            r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L10e
            r2.<init>()     // Catch: java.lang.Throwable -> L10e
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)     // Catch: java.lang.Throwable -> L10e
            java.lang.Object r2 = m4578(r2, r9, r0, r6)     // Catch: java.lang.Throwable -> L10e
            long r1 = m4576(r2, r1)     // Catch: java.lang.Throwable -> L10e
            goto Ld9
        Ld8:
            r1 = r7
        Ld9:
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 >= 0) goto Lde
            r1 = r7
        Lde:
            if (r5 <= 0) goto L10e
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 >= 0) goto Le5
            goto L10e
        Le5:
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 <= 0) goto Leb
            r10 = r12
            goto Lec
        Leb:
            r10 = r1
        Lec:
            if (r5 <= 0) goto Lf5
            float r1 = (float) r10     // Catch: java.lang.Throwable -> L10e
            float r2 = (float) r12     // Catch: java.lang.Throwable -> L10e
            float r1 = r1 / r2
            float r4 = p000.j81.m2905(r1, r4, r3)     // Catch: java.lang.Throwable -> L10e
        Lf5:
            r14 = r4
            mr1 r9 = new mr1     // Catch: java.lang.Throwable -> L10e
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L10e
            r9.<init>(r10, r12, r14, r15)     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.ConcurrentHashMap r1 = p000.pr1.f8674     // Catch: java.lang.Throwable -> L10e
            int r0 = java.lang.System.identityHashCode(r0)     // Catch: java.lang.Throwable -> L10e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L10e
            r1.put(r0, r9)     // Catch: java.lang.Throwable -> L10e
            p000.pr1.f8676 = r9     // Catch: java.lang.Throwable -> L10e
        L10e:
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.or1 m4575(android.view.View r14, android.widget.ProgressBar r15) {
            int r0 = r15.getProgress()
            if (r0 >= 0) goto L7
            r0 = 0
        L7:
            r6 = r0
            int r7 = r15.getMax()
            r0 = 0
            if (r7 > 0) goto L11
            goto L84
        L11:
            float r1 = (float) r6
            float r2 = (float) r7
            float r1 = r1 / r2
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = p000.j81.m2905(r1, r2, r3)
            mr1 r4 = p000.pr1.f8676
            if (r4 == 0) goto L2d
            long r8 = android.os.SystemClock.uptimeMillis()
            long r10 = r4.f7258
            long r8 = r8 - r10
            r10 = 5000(0x1388, double:2.4703E-320)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 > 0) goto L2d
            goto L2e
        L2d:
            r4 = r0
        L2e:
            if (r4 == 0) goto L84
            long r8 = r4.f7256
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L3d
            goto L3e
        L3d:
            r5 = r0
        L3e:
            if (r5 == 0) goto L84
            long r12 = r5.longValue()
            float r0 = r4.f7257
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            r5 = 1034147594(0x3da3d70a, float:0.08)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L54
            float r1 = r4.f7257
        L54:
            float r0 = p000.j81.m2905(r1, r2, r3)
            double r1 = (double) r12
            double r3 = (double) r0
            double r1 = r1 * r3
            long r8 = (long) r1
            r10 = 0
            long r2 = p000.j81.m2908(r8, r10, r12)
            r4 = r12
            java.lang.String r1 = m4579(r2)
            java.lang.String r8 = m4579(r4)
            java.lang.String r9 = "/"
            java.lang.String r10 = p000.lz1.m3688(r1, r9, r8)
            or1 r1 = new or1
            r8 = 1120403456(0x42c80000, float:100.0)
            float r9 = r0 * r8
            int r11 = r14.hashCode()
            long r12 = android.os.SystemClock.uptimeMillis()
            r8 = r0
            r1.<init>(r2, r4, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L84:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static long m4576(java.lang.Object r3, java.lang.String r4) {
            r0 = 0
            if (r3 != 0) goto L5
            return r0
        L5:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = p000.qe0.m4869(r3, r4, r2)     // Catch: java.lang.Throwable -> L13
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L15
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r3 = move-exception
            goto L23
        L15:
            r3 = 0
        L16:
            if (r3 == 0) goto L1d
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L13
            goto L1e
        L1d:
            r3 = r0
        L1e:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L13
            goto L29
        L23:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L29:
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L32
            r3 = r4
        L32:
            java.lang.Number r3 = (java.lang.Number) r3
            long r3 = r3.longValue()
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.Class m4577(java.lang.ClassLoader r0, java.lang.String r1) {
            java.lang.Class r0 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lc:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L11
            r0 = 0
        L11:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object m4578(java.util.Set r8, p000.a80 r9, java.lang.Object r10, int r11) {
            r0 = 0
            if (r10 == 0) goto L93
            r1 = 3
            if (r11 <= r1) goto L8
            goto L93
        L8:
            int r1 = java.lang.System.identityHashCode(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r8.add(r1)
            if (r1 != 0) goto L18
            goto L93
        L18:
            java.lang.Object r1 = r9.invoke(r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L25
            return r10
        L25:
            boolean r1 = r10 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r10 instanceof java.lang.Number
            if (r1 != 0) goto L93
            boolean r1 = r10 instanceof java.lang.Boolean
            if (r1 != 0) goto L93
            boolean r1 = r10 instanceof java.lang.Class
            if (r1 == 0) goto L36
            return r0
        L36:
            java.lang.Class r1 = r10.getClass()
        L3a:
            if (r1 == 0) goto L93
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L93
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L4d:
            if (r4 >= r3) goto L8e
            r5 = r2[r4]
            r5.getClass()
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            r7 = 1
            if (r6 == 0) goto L61
        L5f:
            r5 = r0
            goto L80
        L61:
            java.lang.Class r6 = r5.getType()
            boolean r6 = r6.isPrimitive()
            if (r6 == 0) goto L6c
            goto L5f
        L6c:
            r5.setAccessible(r7)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L74
            goto L7b
        L74:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L7b:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L80
            goto L5f
        L80:
            if (r5 != 0) goto L83
            goto L8b
        L83:
            int r7 = r7 + r11
            java.lang.Object r5 = m4578(r8, r9, r5, r7)
            if (r5 == 0) goto L8b
            return r5
        L8b:
            int r4 = r4 + 1
            goto L4d
        L8e:
            java.lang.Class r1 = r1.getSuperclass()
            goto L3a
        L93:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m4579(long r8) {
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r8 = r0
        L7:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r2
            r2 = 60
            long r4 = r8 % r2
            long r8 = r8 / r2
            long r6 = r8 / r2
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L34
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            long r8 = r8 % r2
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r8 = new java.lang.Object[]{r1, r8, r9}
            r9 = 3
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "%d:%02d:%02d"
            java.lang.String r8 = java.lang.String.format(r0, r9, r8)
            return r8
        L34:
            java.util.Locale r0 = java.util.Locale.CHINA
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}
            r9 = 2
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            java.lang.String r9 = "%02d:%02d"
            java.lang.String r8 = java.lang.String.format(r0, r9, r8)
            return r8
    }

    /* JADX INFO: renamed from: η */
    public static final p000.or1 m4580() {
            or1 r0 = p000.pr1.f8675     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L5
            goto L13
        L5:
            long r1 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L13
            long r3 = r0.f8188     // Catch: java.lang.Throwable -> L13
            long r1 = r1 - r3
            r3 = 2600(0xa28, double:1.2846E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L13
            return r0
        L13:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static p000.nr1 m4581(android.view.View r10) {
            java.util.Map r0 = p000.pr1.f8672
            java.lang.Object r1 = r0.get(r10)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L11
            java.lang.Object r1 = r1.get()
            nr1 r1 = (p000.nr1) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L15
            return r1
        L15:
            android.content.Context r1 = r10.getContext()
            r1.getClass()
            android.graphics.Paint r2 = new android.graphics.Paint
            r3 = 129(0x81, float:1.81E-43)
            r2.<init>(r3)
            r3 = 2
            r4 = 1088421888(0x40e00000, float:7.0)
            boolean r5 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L59
            if (r5 != 0) goto L39
            android.content.res.Resources r5 = r1.getResources()     // Catch: java.lang.Throwable -> L59
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()     // Catch: java.lang.Throwable -> L59
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r5)     // Catch: java.lang.Throwable -> L59
            goto L65
        L39:
            java.lang.String r5 = "seekbar_time_text_size"
            r6 = 7
            android.content.SharedPreferences r7 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L44
            int r6 = r7.getInt(r5, r6)     // Catch: java.lang.Throwable -> L44
        L44:
            r5 = 4
            r7 = 20
            int r5 = p000.j81.m2906(r6, r5, r7)     // Catch: java.lang.Throwable -> L59
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L59
            android.content.res.Resources r6 = r1.getResources()     // Catch: java.lang.Throwable -> L59
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch: java.lang.Throwable -> L59
            float r3 = android.util.TypedValue.applyDimension(r3, r5, r6)     // Catch: java.lang.Throwable -> L59
            goto L65
        L59:
            android.content.res.Resources r5 = r1.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r3 = android.util.TypedValue.applyDimension(r3, r4, r5)
        L65:
            r2.setTextSize(r3)
            r3 = 0
            r4 = -1711276033(0xffffffff99ffffff, float:-2.6469778E-23)
            boolean r5 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Lc7
            if (r5 != 0) goto L73
            goto Lc7
        L73:
            java.lang.String r5 = "seekbar_time_color"
            java.lang.String r6 = "#99FFFFFF"
            java.lang.String r5 = p000.ui1.m5893(r5, r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = "seekbar_time_alpha"
            r7 = 60
            android.content.SharedPreferences r8 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L87
            int r7 = r8.getInt(r6, r7)     // Catch: java.lang.Throwable -> L87
        L87:
            r6 = 100
            int r7 = p000.j81.m2906(r7, r3, r6)     // Catch: java.lang.Throwable -> Lc7
            int r5 = android.graphics.Color.parseColor(r5)     // Catch: java.lang.Throwable -> L96
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L96
            goto L9d
        L96:
            r5 = move-exception
            eo1 r8 = new eo1     // Catch: java.lang.Throwable -> Lc7
            r8.<init>(r5)     // Catch: java.lang.Throwable -> Lc7
            r5 = r8
        L9d:
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lc7
            boolean r9 = r5 instanceof p000.eo1     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto La9
            r5 = r8
        La9:
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> Lc7
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Lc7
            r8 = 255(0xff, float:3.57E-43)
            int r7 = r7 * r8
            int r7 = r7 / r6
            int r6 = p000.j81.m2906(r7, r3, r8)     // Catch: java.lang.Throwable -> Lc7
            int r7 = android.graphics.Color.red(r5)     // Catch: java.lang.Throwable -> Lc7
            int r8 = android.graphics.Color.green(r5)     // Catch: java.lang.Throwable -> Lc7
            int r5 = android.graphics.Color.blue(r5)     // Catch: java.lang.Throwable -> Lc7
            int r4 = android.graphics.Color.argb(r6, r7, r8, r5)     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r2.setColor(r4)
            android.graphics.Paint$Align r4 = android.graphics.Paint.Align.LEFT
            r2.setTextAlign(r4)
            r2.setFakeBoldText(r3)
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            r4 = 1
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            float r3 = android.util.TypedValue.applyDimension(r4, r5, r3)
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r5 = 1051931443(0x3eb33333, float:0.35)
            float r1 = android.util.TypedValue.applyDimension(r4, r5, r1)
            r4 = 1711276032(0x66000000, float:1.5111573E23)
            r5 = 0
            r2.setShadowLayer(r3, r5, r1, r4)
            nr1 r1 = new nr1
            r1.<init>(r2)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.put(r10, r2)
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m4582(java.lang.Class r5, java.lang.String r6) {
        L0:
            r0 = 0
            if (r5 == 0) goto L35
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L35
            java.lang.reflect.Method[] r1 = r5.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
        L13:
            if (r0 >= r2) goto L30
            r3 = r1[r0]
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L2d
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L2d
            r5 = 1
            return r5
        L2d:
            int r0 = r0 + 1
            goto L13
        L30:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L35:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static void m4583(java.lang.Class r4, java.lang.String r5, p000.m01 r6) {
            java.lang.String r0 = "#"
            java.lang.String r1 = "hook "
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L32
            java.util.Set r6 = r2.m6774(r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L32
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r3.append(r2)     // Catch: java.lang.Throwable -> L32
            r3.append(r0)     // Catch: java.lang.Throwable -> L32
            r3.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = " count="
            r3.append(r2)     // Catch: java.lang.Throwable -> L32
            r3.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L32
            m4584(r6)     // Catch: java.lang.Throwable -> L32
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r6 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r6)
            r6 = r2
        L39:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L57
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = r6.getMessage()
            java.lang.String r2 = " failed: "
            java.lang.StringBuilder r4 = p000.lz1.m3695(r1, r4, r0, r5, r2)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            m4584(r4)
        L57:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m4584(java.lang.String r3) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = "DYHelper: SeekBarTime"
            p000.C0888ux.m5988(r2, r3, r0, r1, r0)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static android.graphics.Rect m4585(android.graphics.drawable.Drawable r4) {
            boolean r0 = r4 instanceof android.graphics.drawable.LayerDrawable
            r1 = 0
            if (r0 == 0) goto L55
            r0 = r4
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            r2 = 16908288(0x1020000, float:2.387723E-38)
            android.graphics.drawable.Drawable r2 = r0.findDrawableByLayerId(r2)
            if (r2 == 0) goto L15
            android.graphics.Rect r3 = r2.getBounds()
            goto L16
        L15:
            r3 = r1
        L16:
            boolean r3 = m4586(r3)
            if (r3 == 0) goto L21
            android.graphics.Rect r4 = r2.getBounds()
            return r4
        L21:
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            android.graphics.drawable.Drawable r2 = r0.findDrawableByLayerId(r2)
            if (r2 == 0) goto L2f
            android.graphics.Rect r3 = r2.getBounds()
            goto L30
        L2f:
            r3 = r1
        L30:
            boolean r3 = m4586(r3)
            if (r3 == 0) goto L3b
            android.graphics.Rect r4 = r2.getBounds()
            return r4
        L3b:
            r2 = 16908303(0x102000f, float:2.387727E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r2)
            if (r0 == 0) goto L49
            android.graphics.Rect r2 = r0.getBounds()
            goto L4a
        L49:
            r2 = r1
        L4a:
            boolean r2 = m4586(r2)
            if (r2 == 0) goto L55
            android.graphics.Rect r4 = r0.getBounds()
            return r4
        L55:
            if (r4 == 0) goto L5c
            android.graphics.Rect r4 = r4.getBounds()
            goto L5d
        L5c:
            r4 = r1
        L5d:
            boolean r0 = m4586(r4)
            if (r0 == 0) goto L64
            return r4
        L64:
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public static final boolean m4586(android.graphics.Rect r1) {
            if (r1 == 0) goto L10
            int r0 = r1.width()
            if (r0 <= 0) goto L10
            int r1 = r1.height()
            if (r1 <= 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }
}
