package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class f82 {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f3821 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.LinkedHashSet f3822 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile boolean f3823;

    /* JADX INFO: renamed from: δ */
    public static volatile boolean f3824;

    /* JADX INFO: renamed from: ε */
    public static volatile p000.e82 f3825;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.f82.f3821 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            p000.f82.f3822 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m2057(java.lang.Object r6) {
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L7f
            r1 = 0
        L5:
            if (r0 == 0) goto L83
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L83
            r2 = 3
            if (r1 >= r2) goto L83
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L7f
            τ r2 = p000.h62.m2434(r2)     // Catch: java.lang.Throwable -> L7f
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L78
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L7f
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L7f
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> L7f
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L1a
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r4 = r3.get(r6)     // Catch: java.lang.Throwable -> L6d
            if (r4 != 0) goto L3b
            goto L62
        L3b:
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L43
            r4.toString()     // Catch: java.lang.Throwable -> L6d
            goto L62
        L43:
            boolean r5 = r4 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L4d
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L6d
            r4.toString()     // Catch: java.lang.Throwable -> L6d
            goto L62
        L4d:
            boolean r5 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L6d
            if (r5 == 0) goto L5b
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L6d
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L6d
            java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L6d
            goto L62
        L5b:
            int r4 = java.lang.System.identityHashCode(r4)     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer.toHexString(r4)     // Catch: java.lang.Throwable -> L6d
        L62:
            java.lang.Class r4 = r3.getType()     // Catch: java.lang.Throwable -> L6d
            r4.getClass()     // Catch: java.lang.Throwable -> L6d
            r3.getName()     // Catch: java.lang.Throwable -> L6d
            goto L1a
        L6d:
            java.lang.Class r4 = r3.getType()     // Catch: java.lang.Throwable -> L7f
            r4.getClass()     // Catch: java.lang.Throwable -> L7f
            r3.getName()     // Catch: java.lang.Throwable -> L7f
            goto L1a
        L78:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L7f
            int r1 = r1 + 1
            goto L5
        L7f:
            r6 = move-exception
            r6.getMessage()
        L83:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2058() {
            boolean r0 = p000.ui1.m5867()
            if (r0 == 0) goto L7
            goto L18
        L7:
            android.app.Activity r0 = p000.AbstractC0378i.m2546()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L12
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L19
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L18
            p000.ui1.m5896(r0)     // Catch: java.lang.Throwable -> L19
        L18:
            return
        L19:
            r0 = move-exception
            r0.getMessage()
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m2059(java.lang.Object r7) {
            java.lang.String r5 = "itemId"
            java.lang.String r6 = "aweme_id"
            java.lang.String r0 = "aid"
            java.lang.String r1 = "awemeId"
            java.lang.String r2 = "id"
            java.lang.String r3 = "aId"
            java.lang.String r4 = "mAwemeId"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r7, r1)     // Catch: java.lang.Throwable -> L1a
            boolean r4 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L3c
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> L1a
            boolean r4 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L3c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1a
            return r1
        L3c:
            boolean r4 = r1 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1a
            r4 = r1
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L1a
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L1a
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1a
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L1a
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L1a
            return r7
        L56:
            java.lang.String r0 = "getId"
            java.lang.String r1 = "getItemId"
            java.lang.String r4 = "getAid"
            java.lang.String r5 = "getAwemeId"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = p000.qe0.m4869(r7, r1, r4)     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L8d
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> L6a
            boolean r4 = p000.q02.m4671(r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 != 0) goto L8d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6a
            return r1
        L8d:
            boolean r4 = r1 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L6a
            r4 = r1
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L6a
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L6a
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6a
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L6a
            long r4 = r1.longValue()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L6a
            return r7
        La7:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: δ */
    public static long m2060(java.lang.Object r6) {
            java.lang.String r0 = "videoDuration"
            java.lang.String r1 = "totalDuration"
            java.lang.String r2 = "duration"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r6, r1)     // Catch: java.lang.Throwable -> L12
            long r4 = m2071(r1)     // Catch: java.lang.Throwable -> L12
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L12
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L12
            return r4
        L30:
            java.lang.String r0 = "getVideoDuration"
            java.lang.String r1 = "getTotalDuration"
            java.lang.String r4 = "getDuration"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = p000.qe0.m4869(r6, r1, r4)     // Catch: java.lang.Throwable -> L42
            long r4 = m2071(r1)     // Catch: java.lang.Throwable -> L42
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L42
            return r4
        L61:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static long m2061(java.lang.Object r10) {
            boolean r0 = p000.f82.f3824
            r1 = 0
            if (r0 != 0) goto Lc1
            r0 = 1
            p000.f82.f3824 = r0
            java.lang.Class r0 = r10.getClass()
            r2 = r0
            r3 = r1
        Le:
            if (r2 == 0) goto L48
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L48
            r4 = 3
            if (r3 >= r4) goto L48
            java.lang.reflect.Field[] r4 = r2.getDeclaredFields()
            τ r4 = p000.h62.m2434(r4)
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L41
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            int r6 = r5.getModifiers()
            java.lang.reflect.Modifier.toString(r6)
            java.lang.Class r6 = r5.getType()
            r6.getClass()
            r5.getName()
            goto L23
        L41:
            java.lang.Class r2 = r2.getSuperclass()
            int r3 = r3 + 1
            goto Le
        L48:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            τ r0 = p000.h62.m2434(r0)
        L50:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r3 = r2.getName()
            r3.getClass()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.Class[] r4 = r2.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L50
            java.lang.String r4 = "duration"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "dur"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "time"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "length"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "video"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "aid"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "id"
            boolean r4 = p000.q02.m4654(r3, r4, r1)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = "aweme"
            boolean r3 = p000.q02.m4654(r3, r4, r1)
            if (r3 == 0) goto L50
        Lb6:
            java.lang.Class r3 = r2.getReturnType()
            r3.getClass()
            r2.getName()
            goto L50
        Lc1:
            java.lang.String r8 = "mDuration"
            java.lang.String r9 = "dur"
            java.lang.String r4 = "duration"
            java.lang.String r5 = "totalDuration"
            java.lang.String r6 = "_duration"
            java.lang.String r7 = "videoDuration"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        Ld9:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto Lf7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = p000.qe0.m4879(r10, r2)     // Catch: java.lang.Throwable -> Ld9
            long r5 = m2071(r2)     // Catch: java.lang.Throwable -> Ld9
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> Ld9
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto Ld9
            return r5
        Lf7:
            java.lang.String r0 = "getTotalDuration"
            java.lang.String r2 = "getVideoDuration"
            java.lang.String r5 = "getDuration"
            java.lang.String[] r0 = new java.lang.String[]{r5, r0, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L109:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L127
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L109
            java.lang.Object r2 = p000.qe0.m4869(r10, r2, r5)     // Catch: java.lang.Throwable -> L109
            long r5 = m2071(r2)     // Catch: java.lang.Throwable -> L109
            java.util.Objects.toString(r2)     // Catch: java.lang.Throwable -> L109
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L109
            return r5
        L127:
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static long m2062(java.lang.Object r8) {
            r0 = 0
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Throwable -> L56
        L6:
            if (r2 == 0) goto L99
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L56
            if (r3 != 0) goto L99
            java.lang.reflect.Field[] r3 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> L56
            τ r3 = p000.h62.m2434(r3)     // Catch: java.lang.Throwable -> L56
        L18:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L93
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L56
            r5.getClass()     // Catch: java.lang.Throwable -> L56
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch: java.lang.Throwable -> L56
            r5.getClass()     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "duration"
            r7 = 0
            boolean r6 = p000.q02.m4654(r5, r6, r7)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L58
            java.lang.String r6 = "dur"
            boolean r6 = p000.q02.m4654(r5, r6, r7)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L58
            java.lang.String r6 = "length"
            boolean r6 = p000.q02.m4654(r5, r6, r7)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L58
            java.lang.String r6 = "time"
            boolean r5 = p000.q02.m4654(r5, r6, r7)     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L18
            goto L58
        L56:
            r8 = move-exception
            goto L9a
        L58:
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> L56
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L56
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> L56
            if (r5 != 0) goto L7c
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> L56
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L56
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> L56
            if (r5 != 0) goto L7c
            java.lang.Class<java.lang.Number> r5 = java.lang.Number.class
            java.lang.Class r6 = r4.getType()     // Catch: java.lang.Throwable -> L56
            boolean r5 = r5.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L18
        L7c:
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r5 = r4.get(r8)     // Catch: java.lang.Throwable -> L56
            long r6 = m2071(r5)     // Catch: java.lang.Throwable -> L56
            r4.getName()     // Catch: java.lang.Throwable -> L56
            java.util.Objects.toString(r5)     // Catch: java.lang.Throwable -> L56
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L18
            return r6
        L93:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L56
            goto L6
        L99:
            return r0
        L9a:
            r8.getMessage()
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m2063(long r7) {
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 / r0
            r0 = 3600(0xe10, float:5.045E-42)
            long r0 = (long) r0
            long r2 = r7 / r0
            long r0 = r7 % r0
            r4 = 60
            long r4 = (long) r4
            long r0 = r0 / r4
            long r7 = r7 % r4
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            java.lang.String r5 = "秒"
            java.lang.String r6 = "分"
            if (r4 <= 0) goto L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "时"
            r4.append(r2)
            r4.append(r0)
            r4.append(r6)
            r4.append(r7)
            r4.append(r5)
            java.lang.String r7 = r4.toString()
            return r7
        L38:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            r2.append(r7)
            r2.append(r5)
            java.lang.String r7 = r2.toString()
            return r7
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Object m2064(java.lang.Object r3) {
            java.lang.String r0 = "mVideo"
            java.lang.String r1 = "videoModel"
            java.lang.String r2 = "video"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r3, r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            return r1
        L25:
            java.lang.String r0 = "getVideo"
            java.lang.String r1 = "getVideoModel"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L35
            return r1
        L4b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public static void m2065(java.lang.Object r13) {
            r0 = 4
            r1 = 0
            android.app.Activity r2 = p000.AbstractC0378i.m2546()     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto La
            goto L161
        La:
            java.lang.String r3 = m2059(r13)     // Catch: java.lang.Throwable -> L23
            if (r3 == 0) goto L14b
            boolean r4 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L18
            goto L14b
        L18:
            boolean r4 = p000.f82.f3823     // Catch: java.lang.Throwable -> L23
            r5 = 1
            if (r4 != 0) goto L26
            p000.f82.f3823 = r5     // Catch: java.lang.Throwable -> L23
            m2057(r13)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r13 = move-exception
            goto L14f
        L26:
            boolean r4 = m2066(r13)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L2e
            goto L161
        L2e:
            java.lang.Object r4 = m2064(r13)     // Catch: java.lang.Throwable -> L23
            java.util.LinkedHashSet r6 = p000.f82.f3822     // Catch: java.lang.Throwable -> L23
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L23
            boolean r7 = r6.contains(r3)     // Catch: java.lang.Throwable -> L148
            if (r7 == 0) goto L3d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L23
            return
        L3d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L23
            m2067(r13, r4)     // Catch: java.lang.Throwable -> L23
            long r6 = m2060(r13)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L23
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L50
            goto L51
        L50:
            r13 = r1
        L51:
            if (r13 == 0) goto L58
        L53:
            long r6 = r13.longValue()     // Catch: java.lang.Throwable -> L23
            goto L7b
        L58:
            if (r4 == 0) goto L67
            long r6 = m2061(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L23
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L67
            goto L68
        L67:
            r13 = r1
        L68:
            if (r13 == 0) goto L6b
            goto L53
        L6b:
            if (r4 == 0) goto L76
            long r6 = m2062(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.Long r13 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L23
            goto L77
        L76:
            r13 = r1
        L77:
            if (r13 == 0) goto L7a
            goto L53
        L7a:
            r6 = r8
        L7b:
            java.lang.String r13 = m2063(r6)     // Catch: java.lang.Throwable -> L23
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 > 0) goto L89
            if (r4 == 0) goto L161
            m2057(r4)     // Catch: java.lang.Throwable -> L23
            return
        L89:
            java.lang.String r4 = "video_length_alert_minutes"
            r8 = 10
            m2058()     // Catch: java.lang.Throwable -> L9e
            boolean r9 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto L9e
            android.content.SharedPreferences r9 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L9e
            int r8 = r9.getInt(r4, r8)     // Catch: java.lang.Throwable -> L9e
        L9e:
            if (r8 >= r5) goto La1
            r8 = r5
        La1:
            long r9 = (long) r8
            r11 = 60000(0xea60, double:2.9644E-319)
            long r9 = r9 * r11
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 < 0) goto L161
            java.util.LinkedHashSet r4 = p000.f82.f3822     // Catch: java.lang.Throwable -> L23
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L23
            r4.add(r3)     // Catch: java.lang.Throwable -> Ld4
            int r9 = r4.size()     // Catch: java.lang.Throwable -> Ld4
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 <= r10) goto Ld9
            java.util.Iterator r9 = r4.iterator()     // Catch: java.lang.Throwable -> Ld4
            r9.getClass()     // Catch: java.lang.Throwable -> Ld4
            int r11 = r4.size()     // Catch: java.lang.Throwable -> Ld4
            int r11 = r11 - r10
            r10 = 0
        Lc5:
            if (r10 >= r11) goto Ld9
            boolean r12 = r9.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r12 == 0) goto Ld6
            r9.next()     // Catch: java.lang.Throwable -> Ld4
            r9.remove()     // Catch: java.lang.Throwable -> Ld4
            goto Ld6
        Ld4:
            r13 = move-exception
            goto L146
        Ld6:
            int r10 = r10 + 1
            goto Lc5
        Ld9:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "video_length_alert_toast_msg"
            java.lang.String r9 = "当前视频时长超过 %d 分钟"
            m2058()     // Catch: java.lang.Throwable -> Leb
            boolean r10 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Leb
            if (r10 == 0) goto Leb
            java.lang.String r9 = p000.ui1.m5893(r4, r9)     // Catch: java.lang.Throwable -> Leb
        Leb:
            r4 = 1000(0x3e8, float:1.401E-42)
            long r10 = (long) r4
            long r6 = r6 / r10
            r4 = 60
            long r10 = (long) r4     // Catch: java.lang.Throwable -> L23
            long r6 = r6 / r10
            int r4 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L105
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = java.lang.String.format(r9, r6)     // Catch: java.lang.Throwable -> L105
            goto L10f
        L105:
            java.lang.String r6 = "%d"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = p000.x02.m6483(r9, r6, r4)     // Catch: java.lang.Throwable -> L23
        L10f:
            java.lang.String r6 = "video_length_alert_vibrate"
            boolean r5 = m2070(r6, r5)     // Catch: java.lang.Throwable -> L23
            android.os.Handler r6 = p000.f82.f3821     // Catch: java.lang.Throwable -> L23
            au1 r7 = new au1     // Catch: java.lang.Throwable -> L23
            r7.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L23
            r6.post(r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "DYHelper: VideoLengthAlert"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r4.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "视频时长提醒: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L23
            r4.append(r13)     // Catch: java.lang.Throwable -> L23
            java.lang.String r13 = " (阈值"
            r4.append(r13)     // Catch: java.lang.Throwable -> L23
            r4.append(r8)     // Catch: java.lang.Throwable -> L23
            java.lang.String r13 = "分钟) awemeId="
            r4.append(r13)     // Catch: java.lang.Throwable -> L23
            r4.append(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L23
            p000.C0888ux.m5988(r2, r13, r1, r0, r1)     // Catch: java.lang.Throwable -> L23
            goto L161
        L146:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r13     // Catch: java.lang.Throwable -> L23
        L148:
            r13 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L23
            throw r13     // Catch: java.lang.Throwable -> L23
        L14b:
            m2057(r13)     // Catch: java.lang.Throwable -> L23
            return
        L14f:
            r13.getMessage()
            java.lang.String r2 = "DYHelper: VideoLengthAlert"
            java.lang.String r13 = p000.ln0.m3649(r13)
            java.lang.String r3 = "handleCurrentAweme 异常: "
            java.lang.String r13 = r3.concat(r13)
            p000.C0888ux.m5988(r2, r13, r1, r0, r1)
        L161:
            return
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m2066(java.lang.Object r6) {
            java.lang.String r4 = "slides"
            java.lang.String r5 = "imageUrlStruct"
            java.lang.String r0 = "images"
            java.lang.String r1 = "imageInfos"
            java.lang.String r2 = "imagesInfo"
            java.lang.String r3 = "photoModeImages"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r6, r1)     // Catch: java.lang.Throwable -> L18
            boolean r2 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L3b
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r2 != 0) goto L18
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L18
            r1.size()     // Catch: java.lang.Throwable -> L18
            goto L4d
        L3b:
            if (r1 == 0) goto L18
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isArray()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            int r1 = java.lang.reflect.Array.getLength(r1)     // Catch: java.lang.Throwable -> L18
            if (r1 <= 0) goto L18
        L4d:
            r6 = 1
            return r6
        L4f:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: λ */
    public static void m2067(java.lang.Object r8, java.lang.Object r9) {
            java.lang.String r0 = "videoDuration"
            java.lang.String r1 = "totalDuration"
            java.lang.String r2 = "duration"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r8, r1)     // Catch: java.lang.Throwable -> L12
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L12
            goto L12
        L26:
            if (r9 == 0) goto L54
            java.lang.String r6 = "mDuration"
            java.lang.String r7 = "dur"
            java.lang.String r2 = "duration"
            java.lang.String r3 = "totalDuration"
            java.lang.String r4 = "_duration"
            java.lang.String r5 = "videoDuration"
            java.lang.String[] r8 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            java.util.List r8 = p000.AbstractC1021yh.m6897(r8)
            java.util.Iterator r8 = r8.iterator()
        L40:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = p000.qe0.m4879(r9, r0)     // Catch: java.lang.Throwable -> L40
            java.util.Objects.toString(r0)     // Catch: java.lang.Throwable -> L40
            goto L40
        L54:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m2068(java.lang.Long r6) {
            android.app.Activity r0 = p000.AbstractC0378i.m2546()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L7
            goto L1c
        L7:
            m2058()     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "video_length_alert_enabled"
            r1 = 0
            boolean r0 = m2070(r0, r1)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L14
            goto L1c
        L14:
            pq r0 = p000.C0696pq.f8651     // Catch: java.lang.Throwable -> L30
            kq r0 = p000.C0696pq.m4567()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L1d
        L1c:
            return
        L1d:
            java.lang.Object r1 = r0.f6077
            mq r0 = r0.f6079
            long r2 = r0.f7247     // Catch: java.lang.Throwable -> L30
            long r4 = r6.longValue()     // Catch: java.lang.Throwable -> L30
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2c
            return
        L2c:
            m2065(r1)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r6 = move-exception
            r6.getMessage()
            java.lang.String r6 = p000.ln0.m3649(r6)
            java.lang.String r0 = "onFeedMaybeChanged 异常: "
            java.lang.String r6 = r0.concat(r6)
            r0 = 4
            java.lang.String r1 = "DYHelper: VideoLengthAlert"
            r2 = 0
            p000.C0888ux.m5988(r1, r6, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m2069(android.content.Context r6) {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L43
            r1 = 31
            r2 = -1
            r3 = 300(0x12c, double:1.48E-321)
            r5 = 0
            if (r0 < r1) goto L2c
            java.lang.String r0 = "vibrator_manager"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L43
            boolean r0 = p000.AbstractC0671p1.m4351(r6)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1b
            android.os.VibratorManager r6 = p000.AbstractC0671p1.m4360(r6)     // Catch: java.lang.Throwable -> L43
            goto L1c
        L1b:
            r6 = r5
        L1c:
            if (r6 == 0) goto L22
            android.os.Vibrator r5 = p000.AbstractC0671p1.m4359(r6)     // Catch: java.lang.Throwable -> L43
        L22:
            if (r5 == 0) goto L42
            android.os.VibrationEffect r6 = android.os.VibrationEffect.createOneShot(r3, r2)     // Catch: java.lang.Throwable -> L43
            r5.vibrate(r6)     // Catch: java.lang.Throwable -> L43
            return
        L2c:
            java.lang.String r0 = "vibrator"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L43
            boolean r0 = r6 instanceof android.os.Vibrator     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L39
            r5 = r6
            android.os.Vibrator r5 = (android.os.Vibrator) r5     // Catch: java.lang.Throwable -> L43
        L39:
            if (r5 == 0) goto L42
            android.os.VibrationEffect r6 = android.os.VibrationEffect.createOneShot(r3, r2)     // Catch: java.lang.Throwable -> L43
            r5.vibrate(r6)     // Catch: java.lang.Throwable -> L43
        L42:
            return
        L43:
            r6 = move-exception
            r6.getMessage()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m2070(java.lang.String r1, boolean r2) {
            m2058()     // Catch: java.lang.Throwable -> Le
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Le
            boolean r1 = p000.ui1.m5887(r1, r2)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public static long m2071(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto Lb
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L17
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            long r0 = (long) r2
            return r0
        L17:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L22
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
        L22:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L35
            java.lang.String r2 = (java.lang.String) r2
            r0 = 10
            java.lang.Long r2 = p000.x02.m6489(r2, r0)
            if (r2 == 0) goto L35
            long r0 = r2.longValue()
            return r0
        L35:
            r0 = 0
            return r0
    }
}
