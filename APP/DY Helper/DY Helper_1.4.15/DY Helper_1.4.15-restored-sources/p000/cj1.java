package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cj1 {

    /* JADX INFO: renamed from: α */
    public static final p000.cj1 f2169 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f2170 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ExecutorService f2171 = null;

    static {
            cj1 r0 = new cj1
            r0.<init>()
            p000.cj1.f2169 = r0
            java.lang.String r0 = "/aweme/v1/aweme/favorite/"
            java.lang.String r1 = "/aweme/v1/filter/post/"
            java.lang.String r2 = "/aweme/v1/aweme/post/"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.cj1.f2170 = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            p000.cj1.f2171 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m1216(p000.cj1 r11, java.lang.reflect.Method r12) {
            java.lang.Class r11 = r12.getDeclaringClass()
            java.lang.reflect.Field[] r11 = r11.getDeclaredFields()
            r11.getClass()
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        Lf:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r2 >= r0) goto L24
            r5 = r11[r2]
            java.lang.Class r5 = r5.getType()
            boolean r4 = p000.ln0.m3626(r5, r4)
            if (r4 == 0) goto L21
            int r3 = r3 + 1
        L21:
            int r2 = r2 + 1
            goto Lf
        L24:
            r11 = 3
            if (r3 < r11) goto L2a
            r11 = 200(0xc8, float:2.8E-43)
            goto L2b
        L2a:
            r11 = r1
        L2b:
            java.lang.Class[] r0 = r12.getParameterTypes()
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L88
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()
            if (r0 == 0) goto L88
            int r2 = r0.length
            r3 = r1
        L42:
            if (r3 >= r2) goto L88
            r5 = r0[r3]
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r7 = r6.length
            r8 = r1
            r9 = r8
        L50:
            if (r8 >= r7) goto L5f
            r10 = r6[r8]
            boolean r10 = p000.ln0.m3626(r10, r4)
            if (r10 == 0) goto L5c
            int r9 = r9 + 1
        L5c:
            int r8 = r8 + 1
            goto L50
        L5f:
            r6 = 4
            if (r9 < r6) goto L85
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r6 = r5.length
            r7 = r1
        L6b:
            if (r7 >= r6) goto L85
            r8 = r5[r7]
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"
            java.lang.String r9 = p000.jf0.m2957(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L82
            int r11 = r11 + 300
            goto L88
        L82:
            int r7 = r7 + 1
            goto L6b
        L85:
            int r3 = r3 + 1
            goto L42
        L88:
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            int r2 = r0.length
            r3 = r1
        L95:
            if (r1 >= r2) goto Lae
            r4 = r0[r1]
            r4.getClass()
            java.lang.Class r5 = r12.getReturnType()
            r5.getClass()
            boolean r4 = m1226(r5, r4)
            if (r4 == 0) goto Lab
            int r3 = r3 + 1
        Lab:
            int r1 = r1 + 1
            goto L95
        Lae:
            r12 = 2
            if (r3 < r12) goto Lb3
            int r11 = r11 + 100
        Lb3:
            return r11
    }

    /* JADX INFO: renamed from: β */
    public static p000.bj1 m1217(int r8, int r9, java.lang.Object r10, java.lang.String r11, p000.C0276f8 r12) {
            int r2 = r9 + 1
            java.lang.Class r9 = r10.getClass()
            java.lang.String r3 = r9.getName()
            r9 = 0
            if (r12 == 0) goto L14
            java.lang.String r0 = r12.f3800
            if (r0 != 0) goto L12
            goto L14
        L12:
            r5 = r0
            goto L5c
        L14:
            java.lang.String r0 = "getAid"
            java.lang.Object r0 = m1224(r10, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L21
            java.lang.String r0 = (java.lang.String) r0
            goto L22
        L21:
            r0 = r9
        L22:
            java.lang.String r1 = "getAwemeId"
            java.lang.Object r1 = m1224(r10, r1)
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L2f
            java.lang.String r1 = (java.lang.String) r1
            goto L30
        L2f:
            r1 = r9
        L30:
            java.lang.String r4 = "aid"
            java.lang.Object r4 = m1231(r10, r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L3d
            java.lang.String r4 = (java.lang.String) r4
            goto L3e
        L3d:
            r4 = r9
        L3e:
            java.lang.String r5 = "awemeId"
            java.lang.Object r5 = m1231(r10, r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L4b
            java.lang.String r5 = (java.lang.String) r5
            goto L4c
        L4b:
            r5 = r9
        L4c:
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r4, r5}
            java.lang.String r0 = m1222(r0)
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L5b
            goto L12
        L5b:
            r5 = r9
        L5c:
            if (r12 == 0) goto L77
            java.lang.String r0 = r12.f3794
            if (r0 == 0) goto L77
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L71
            java.lang.String r1 = "无描述"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L71
            goto L72
        L71:
            r0 = r9
        L72:
            if (r0 != 0) goto L75
            goto L77
        L75:
            r6 = r0
            goto L95
        L77:
            java.lang.String r0 = "getDesc"
            java.lang.Object r0 = m1224(r10, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L84
            java.lang.String r0 = (java.lang.String) r0
            goto L85
        L84:
            r0 = r9
        L85:
            if (r0 != 0) goto L75
            java.lang.String r0 = "desc"
            java.lang.Object r0 = m1231(r10, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L94
            java.lang.String r0 = (java.lang.String) r0
            goto L75
        L94:
            r6 = r9
        L95:
            if (r12 == 0) goto La4
            h8 r12 = r12.f3798
            if (r12 == 0) goto La4
            java.lang.String r12 = r12.name()
            if (r12 != 0) goto La2
            goto La4
        La2:
            r7 = r12
            goto Lb3
        La4:
            java.lang.String r12 = "getAwemeType"
            java.lang.String r0 = "awemeType"
            java.lang.Long r10 = m1233(r10, r12, r0)
            if (r10 == 0) goto Lb2
            java.lang.String r9 = r10.toString()
        Lb2:
            r7 = r9
        Lb3:
            bj1 r0 = new bj1
            r1 = r8
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Object m1218(java.lang.Class r30, java.lang.Class r31, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r32, long r33, int r35) {
            r0 = -1
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.Class<java.lang.String> r24 = java.lang.String.class
            java.lang.Class<java.lang.String> r25 = java.lang.String.class
            java.lang.Class r15 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Class r18 = java.lang.Long.TYPE
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            java.lang.Class r23 = java.lang.Boolean.TYPE
            r19 = r15
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r15
            r20 = r31
            java.lang.Class[] r0 = new java.lang.Class[]{r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            r1 = r30
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)
            r1 = 1
            r0.setAccessible(r1)
            r17 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            java.lang.String r3 = r32.getUid()
            java.lang.String r4 = r32.getSecUid()
            r5 = 0
            int r7 = (r33 > r5 ? 1 : (r33 == r5 ? 0 : -1))
            if (r7 >= 0) goto L48
            r7 = r5
            goto L4a
        L48:
            r7 = r33
        L4a:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r8 = 50
            r9 = 20
            int r8 = p000.j81.m2906(r9, r1, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r12 = 0
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            r5 = r7
            r7 = 0
            r6 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r15 = r14
            r16 = r2
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.lang.Object r2 = r0.newInstance(r2)
            r2.getClass()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            r0.getClass()
            int r3 = r0.length
            r4 = r17
        L83:
            if (r4 >= r3) goto La1
            r5 = r0[r4]
            java.lang.Class r6 = r5.getType()
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L9e
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isFinal(r6)
            if (r6 != 0) goto L9e
            goto La2
        L9e:
            int r4 = r4 + 1
            goto L83
        La1:
            r5 = 0
        La2:
            if (r5 != 0) goto La5
            goto Lc7
        La5:
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> Lb5
            r0 = r35
            r5.setInt(r2, r0)     // Catch: java.lang.Throwable -> Lb5
            r5.getName()     // Catch: java.lang.Throwable -> Lb5
            int r0 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> Lb5
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lb5
            goto Lbc
        Lb5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lbc:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Lc7
            r0.getMessage()
            int r0 = com.example.dyhelper.MainHook.f2222
        Lc7:
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static int m1219(android.content.Context r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.ArrayList m1220(java.lang.Object r5) {
            java.lang.String r0 = "getItemsP"
            java.lang.Object r0 = m1224(r5, r0)
            java.lang.String r1 = "getItems"
            java.lang.Object r1 = m1224(r5, r1)
            java.lang.String r2 = "items"
            java.lang.Object r2 = m1231(r5, r2)
            java.lang.String r3 = "preloadAwemes"
            java.lang.Object r5 = m1231(r5, r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r2, r5}
            java.util.ArrayList r5 = p000.AbstractC0312g7.m2248(r5)
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r5.next()
            boolean r3 = r2 instanceof java.lang.Iterable
            if (r3 == 0) goto L47
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r2 = p000.AbstractC0984xh.m6637(r2)
            goto L54
        L47:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L52
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.ArrayList r2 = p000.AbstractC0312g7.m2248(r2)
            goto L54
        L52:
            jz r2 = p000.C0450jz.f5672
        L54:
            p000.AbstractC0984xh.m6660(r1, r2)
            goto L32
        L58:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r1.next()
            boolean r3 = r0.add(r2)
            if (r3 == 0) goto L61
            r5.add(r2)
            goto L61
        L75:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L7e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r5.next()
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lad
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "Aweme"
            r4 = 0
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L7e
        Lad:
            r0.add(r1)
            goto L7e
        Lb1:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m1221(java.lang.Iterable r1) {
            if (r1 == 0) goto L19
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = m1223(r0)
            if (r0 == 0) goto L6
            return r0
        L19:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m1222(java.lang.String... r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            java.lang.String r2 = ""
            if (r1 >= r0) goto L2a
            r3 = r4[r1]
            if (r3 == 0) goto L13
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 != 0) goto L17
            goto L18
        L17:
            r2 = r3
        L18:
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto L27
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L27
            return r2
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m1223(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto Lc
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r3 != 0) goto L11
            java.lang.String r3 = ""
        L11:
            java.lang.String r1 = "http"
            r2 = 1
            boolean r1 = p000.x02.m6485(r3, r1, r2)
            if (r1 == 0) goto L1b
            return r3
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.Object m1224(java.lang.Object r7, java.lang.String r8) {
            r0 = 0
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L31
        L5:
            if (r1 == 0) goto L47
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L47
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L31
            r2.getClass()     // Catch: java.lang.Throwable -> L31
            int r3 = r2.length     // Catch: java.lang.Throwable -> L31
            r4 = 0
        L18:
            if (r4 >= r3) goto L36
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L31
            boolean r6 = p000.ln0.m3626(r6, r8)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L33
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L31
            r6.getClass()     // Catch: java.lang.Throwable -> L31
            int r6 = r6.length     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L33
            goto L37
        L31:
            r7 = move-exception
            goto L49
        L33:
            int r4 = r4 + 1
            goto L18
        L36:
            r5 = r0
        L37:
            if (r5 == 0) goto L42
            r8 = 1
            r5.setAccessible(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r5.invoke(r7, r0)     // Catch: java.lang.Throwable -> L31
            return r7
        L42:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L31
            goto L5
        L47:
            r8 = r0
            goto L4e
        L49:
            eo1 r8 = new eo1
            r8.<init>(r7)
        L4e:
            if (r8 == 0) goto L51
            goto L52
        L51:
            r0 = r8
        L52:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Object m1225(java.lang.Object r4, java.util.List r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Object[] r3 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L22 java.lang.reflect.InvocationTargetException -> L24
            java.lang.Object r3 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L22 java.lang.reflect.InvocationTargetException -> L24
            if (r3 == 0) goto L6
            r2.getName()
            int r4 = com.example.dyhelper.MainHook.f2222
            return r3
        L22:
            r1 = move-exception
            goto L26
        L24:
            r1 = move-exception
            goto L2f
        L26:
            r2.getName()
            r1.getMessage()
            int r2 = com.example.dyhelper.MainHook.f2222
            goto L6
        L2f:
            java.lang.Throwable r3 = r1.getTargetException()
            if (r3 != 0) goto L36
            goto L37
        L36:
            r1 = r3
        L37:
            r2.getName()
            r1.getMessage()
            int r2 = com.example.dyhelper.MainHook.f2222
            goto L6
        L40:
            if (r1 != 0) goto L43
            return r0
        L43:
            throw r1
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m1226(java.lang.Class r4, java.lang.reflect.Method r5) {
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L2c
            java.lang.Class[] r0 = r5.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L2c
            java.lang.Class r5 = r5.getReturnType()
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L2c
            return r2
        L2c:
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m1227(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r5) {
            java.lang.String r0 = r5.getUid()
            boolean r0 = p000.q02.m4671(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L26
            java.lang.String r0 = r5.getUid()
            r3 = r2
        L11:
            int r4 = r0.length()
            if (r3 >= r4) goto L26
            char r4 = r0.charAt(r3)
            boolean r4 = java.lang.Character.isDigit(r4)
            if (r4 != 0) goto L23
            r0 = r2
            goto L27
        L23:
            int r3 = r3 + 1
            goto L11
        L26:
            r0 = r1
        L27:
            java.lang.String r3 = r5.getSecUid()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L64
            java.lang.String r3 = r5.getSecUid()
            java.lang.String r4 = "-1"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L62
            java.lang.String r3 = r5.getSecUid()
            java.lang.String r4 = "true"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L62
            java.lang.String r3 = r5.getSecUid()
            java.lang.String r4 = "false"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L62
            java.lang.String r3 = r5.getSecUid()
            int r3 = r3.length()
            r4 = 8
            if (r3 < r4) goto L62
            goto L64
        L62:
            r3 = r2
            goto L65
        L64:
            r3 = r1
        L65:
            if (r0 == 0) goto L7e
            if (r3 == 0) goto L7e
            java.lang.String r0 = r5.getUid()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L7d
            java.lang.String r5 = r5.getSecUid()
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto L7e
        L7d:
            return r1
        L7e:
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public static com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.ProfileAwemeListResult m1228(java.lang.ClassLoader r10, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r11, long r12, int r14) {
            r0 = 1
            if (r14 != r0) goto L5
        L3:
            r7 = r0
            goto L7
        L5:
            r0 = 4
            goto L3
        L7:
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient r1 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.INSTANCE
            java.lang.String r8 = "locate_host"
            java.lang.String r9 = "locate"
            r4 = 20
            r2 = r10
            r3 = r11
            r5 = r12
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r10 = r1.loadProfileAwemeList(r2, r3, r4, r5, r7, r8, r9)
            if (r10 == 0) goto L27
            java.lang.Object r11 = r10.getRawResponse()
            if (r11 == 0) goto L27
            java.util.ArrayList r11 = m1220(r11)
            int r11 = r11.size()
            goto L28
        L27:
            r11 = 0
        L28:
            if (r11 <= 0) goto L2d
            int r11 = com.example.dyhelper.MainHook.f2222
            return r10
        L2d:
            int r10 = com.example.dyhelper.MainHook.f2222
            java.lang.String r8 = "profile_tab"
            java.lang.String r9 = "public"
            r4 = 20
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r10 = r1.loadProfileAwemeList(r2, r3, r4, r5, r7, r8, r9)
            return r10
    }

    /* JADX INFO: renamed from: π */
    public static java.util.ArrayList m1229(java.util.ArrayList r8, int r9, java.util.ArrayList r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        La:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r8.next()
            int r3 = r1 + 1
            r4 = 0
            if (r1 < 0) goto L7c
            java.util.concurrent.atomic.AtomicReference r5 = p000.b10.f1403     // Catch: java.lang.Throwable -> L20
            f8 r5 = p000.b10.m673(r2)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L27:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 == 0) goto L48
            java.lang.String r7 = r6.getMessage()
            if (r7 != 0) goto L3b
            java.lang.Class r6 = r6.getClass()
            java.lang.String r7 = r6.getName()
        L3b:
            java.lang.String r6 = "parse_failed:"
            java.lang.String r6 = r6.concat(r7)
            bj1 r6 = m1217(r9, r1, r2, r6, r4)
            r10.add(r6)
        L48:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L4d
            r5 = r4
        L4d:
            f8 r5 = (p000.C0276f8) r5
            if (r5 != 0) goto L52
            goto L75
        L52:
            h8 r6 = r5.f3798
            h8 r7 = p000.EnumC0350h8.f4619
            if (r6 != r7) goto L5b
            java.lang.String r6 = "unknown_type"
            goto L6a
        L5b:
            java.lang.String r6 = r5.f3800
            if (r6 == 0) goto L68
            boolean r6 = p000.q02.m4671(r6)
            if (r6 == 0) goto L66
            goto L68
        L66:
            r6 = r4
            goto L6a
        L68:
            java.lang.String r6 = "missing_aweme_id"
        L6a:
            if (r6 == 0) goto L74
            bj1 r1 = m1217(r9, r1, r2, r6, r5)
            r10.add(r1)
            goto L75
        L74:
            r4 = r5
        L75:
            if (r4 == 0) goto L7a
            r0.add(r4)
        L7a:
            r1 = r3
            goto La
        L7c:
            p000.AbstractC1021yh.m6917()
            throw r4
        L80:
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m1230(p000.C0276f8 r3) {
            java.lang.String r0 = r3.f3797
            java.lang.String r0 = m1223(r0)
            if (r0 != 0) goto L4a
            java.util.List r0 = r3.f3796
            java.lang.String r0 = m1221(r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = r3.m2045()
            if (r0 != 0) goto L4a
            java.lang.String r0 = r3.f3783
            java.lang.String r0 = m1223(r0)
            if (r0 != 0) goto L4a
            java.lang.String r0 = r3.f3782
            java.lang.String r0 = m1223(r0)
            if (r0 != 0) goto L4a
            java.util.List r0 = r3.f3786
            if (r0 != 0) goto L2c
            jz r0 = p000.C0450jz.f5672
        L2c:
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r0)
            li1 r0 = new li1
            r0.<init>(r2)
            y30 r0 = p000.us1.m5943(r1, r0)
            java.lang.Object r0 = p000.us1.m5953(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4a
            java.util.List r3 = r3.f3778
            java.lang.String r3 = m1221(r3)
            return r3
        L4a:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.Object m1231(java.lang.Object r7, java.lang.String r8) {
            r0 = 0
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L2a
        L5:
            if (r1 == 0) goto L3d
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L3d
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> L2a
            r2.getClass()     // Catch: java.lang.Throwable -> L2a
            int r3 = r2.length     // Catch: java.lang.Throwable -> L2a
            r4 = 0
        L18:
            if (r4 >= r3) goto L2c
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L2a
            boolean r6 = p000.ln0.m3626(r6, r8)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L27
            goto L2d
        L27:
            int r4 = r4 + 1
            goto L18
        L2a:
            r7 = move-exception
            goto L3f
        L2c:
            r5 = r0
        L2d:
            if (r5 == 0) goto L38
            r8 = 1
            r5.setAccessible(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r5.get(r7)     // Catch: java.lang.Throwable -> L2a
            return r7
        L38:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L2a
            goto L5
        L3d:
            r8 = r0
            goto L44
        L3f:
            eo1 r8 = new eo1
            r8.<init>(r7)
        L44:
            if (r8 == 0) goto L47
            goto L48
        L47:
            r0 = r8
        L48:
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static boolean m1232(java.lang.Object r4) {
            java.lang.String r0 = "isHasMore"
            java.lang.Object r0 = m1224(r4, r0)
            if (r0 == 0) goto L17
            boolean r4 = r0 instanceof java.lang.Boolean
            if (r4 == 0) goto Lf
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L2d
            boolean r4 = r0.booleanValue()
            return r4
        L17:
            java.lang.String r0 = "getHasMore"
            java.lang.String r1 = "hasMore"
            java.lang.Long r4 = m1233(r4, r0, r1)
            if (r4 == 0) goto L2d
            long r0 = r4.longValue()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2d
            r4 = 1
            return r4
        L2d:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.Long m1233(java.lang.Object r0, java.lang.String r1, java.lang.String r2) {
            java.lang.Object r1 = m1224(r0, r1)
            if (r1 != 0) goto La
            java.lang.Object r1 = m1231(r0, r2)
        La:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L19
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L19:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L26
            java.lang.String r1 = (java.lang.String) r1
            r0 = 10
            java.lang.Long r0 = p000.x02.m6489(r1, r0)
            return r0
        L26:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord m1234() {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r0.getLastProfileRecord()
            r1 = 0
            if (r0 == 0) goto L14
            boolean r2 = m1227(r0)
            if (r2 == 0) goto L10
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L14
            return r0
        L14:
            java.util.concurrent.atomic.AtomicReference r0 = p000.b10.f1403
            java.lang.String r0 = p000.b10.f1405
            java.lang.String r2 = p000.b10.f1407
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.lang.String r3 = m1222(r0)
            java.lang.String r0 = p000.b10.f1408
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r4 = m1222(r0)
            boolean r0 = p000.q02.m4671(r3)
            if (r0 == 0) goto L39
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L39
            goto L60
        L39:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            r21 = 65528(0xfff8, float:9.1824E-41)
            r22 = 0
            java.lang.String r5 = ""
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = m1227(r2)
            if (r0 == 0) goto L60
            return r2
        L60:
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public static java.lang.String m1235(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            li1 r2 = new li1
            r3 = 2
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: ν */
    public final java.util.List m1236(android.app.Activity r37) {
            r36 = this;
            r1 = r37
            java.lang.Class r0 = r1.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2 = 0
            if (r0 != 0) goto L17
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 == 0) goto L19
        L17:
            r3 = r0
            goto L1f
        L19:
            java.lang.String r0 = "host classLoader is null"
            p000.C1080.m7279(r0)
            return r2
        L1f:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6 = m1234()
            if (r6 == 0) goto L413
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"
            java.lang.String r4 = p000.jf0.m2957(r0)
            java.lang.Class r5 = p000.qe0.m4877(r3, r4)
            if (r5 == 0) goto L409
            r4 = r36
            java.util.List r7 = r4.m1238(r5, r3)
            boolean r0 = r7.isEmpty()
            h8 r14 = p000.EnumC0350h8.f4619
            java.lang.String r4 = " 页完成 · 已获取 "
            r10 = -1
            java.lang.String r11 = " 页 · 已获取 "
            r12 = 31
            r16 = -9223372036854775808
            java.lang.String r13 = "主动获取主页作品"
            r18 = r2
            java.lang.String r2 = "第 "
            java.lang.String r15 = " 个"
            r19 = 0
            r21 = 0
            if (r0 == 0) goto L20a
            int r0 = com.example.dyhelper.MainHook.f2222
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r8 = r19
            r25 = r21
            r26 = r25
            r7 = 1
        L64:
            if (r7 >= r12) goto L79
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            int r0 = r5.size()
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r2, r7, r11, r0, r15)
            com.example.dyhelper.p002ui.C0182.m1598(r10, r1, r13, r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r27 = m1228(r3, r6, r8, r7)
            if (r27 != 0) goto L7d
        L79:
            r22 = r5
            goto L1f7
        L7d:
            java.lang.Object r0 = r27.getRawResponse()
            if (r0 != 0) goto L84
            goto L79
        L84:
            java.util.ArrayList r0 = m1220(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r28 = r0.iterator()
        L91:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r28.next()
            java.util.concurrent.atomic.AtomicReference r29 = p000.b10.f1403     // Catch: java.lang.Throwable -> La2
            f8 r0 = p000.b10.m673(r0)     // Catch: java.lang.Throwable -> La2
            goto La9
        La2:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
            r0 = r12
        La9:
            java.lang.Throwable r12 = p000.fo1.m2190(r0)
            if (r12 == 0) goto Lb4
            r12.getMessage()
            int r12 = com.example.dyhelper.MainHook.f2222
        Lb4:
            boolean r12 = r0 instanceof p000.eo1
            if (r12 == 0) goto Lba
            r0 = r18
        Lba:
            f8 r0 = (p000.C0276f8) r0
            if (r0 == 0) goto Lc1
            r10.add(r0)
        Lc1:
            r12 = 31
            goto L91
        Lc4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        Lcd:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lf5
            java.lang.Object r12 = r10.next()
            r28 = r3
            r3 = r12
            f8 r3 = (p000.C0276f8) r3
            r30 = r6
            h8 r6 = r3.f3798
            if (r6 == r14) goto Lf0
            java.lang.String r3 = r3.f3800
            if (r3 == 0) goto Lf0
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto Led
            goto Lf0
        Led:
            r0.add(r12)
        Lf0:
            r3 = r28
            r6 = r30
            goto Lcd
        Lf5:
            r28 = r3
            r30 = r6
            java.util.Iterator r3 = r0.iterator()
        Lfd:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L118
            java.lang.Object r6 = r3.next()
            f8 r6 = (p000.C0276f8) r6
            java.lang.String r10 = r6.f3800
            if (r10 == 0) goto Lfd
            boolean r12 = p000.q02.m4671(r10)
            if (r12 == 0) goto L114
            goto Lfd
        L114:
            r5.put(r10, r6)
            goto Lfd
        L118:
            java.util.Iterator r3 = r0.iterator()
            boolean r6 = r3.hasNext()
            if (r6 != 0) goto L125
            r6 = r18
            goto L14b
        L125:
            java.lang.Object r6 = r3.next()
            f8 r6 = (p000.C0276f8) r6
            int r6 = r6.f3806
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L131:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L14b
            java.lang.Object r10 = r3.next()
            f8 r10 = (p000.C0276f8) r10
            int r10 = r10.f3806
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r12 = r6.compareTo(r10)
            if (r12 >= 0) goto L131
            r6 = r10
            goto L131
        L14b:
            if (r6 == 0) goto L154
            int r3 = r6.intValue()
        L151:
            r6 = r25
            goto L157
        L154:
            r3 = r21
            goto L151
        L157:
            int r3 = java.lang.Math.max(r6, r3)
            long r31 = r27.getMaxCursor()
            int r6 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r6 <= 0) goto L16d
            int r6 = (r31 > r16 ? 1 : (r31 == r16 ? 0 : -1))
            if (r6 == 0) goto L16d
            int r6 = (r31 > r8 ? 1 : (r31 == r8 ? 0 : -1))
            if (r6 == 0) goto L16d
            r6 = 1
            goto L16f
        L16d:
            r6 = r21
        L16f:
            boolean r10 = r27.getHasMore()
            if (r10 == 0) goto L17b
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L17f
        L17b:
            r10 = r26
            r12 = 3
            goto L182
        L17f:
            r10 = r26
            goto L190
        L182:
            if (r10 >= r12) goto L190
            if (r6 == 0) goto L190
            if (r3 <= 0) goto L18e
            int r12 = r5.size()
            if (r3 <= r12) goto L190
        L18e:
            r12 = 1
            goto L192
        L190:
            r12 = r21
        L192:
            r0.size()
            r5.size()
            r27.getHasMore()
            int r16 = com.example.dyhelper.MainHook.f2222
            int r16 = r7 * 100
            r17 = r0
            int r0 = r16 / 30
            r16 = r3
            r22 = r5
            r3 = 99
            r5 = 1
            int r0 = p000.j81.m2906(r0, r5, r3)
            android.os.Handler r24 = com.example.dyhelper.p002ui.C0182.f2694
            int r3 = r22.size()
            java.lang.String r3 = p000.AbstractC0602nx.m4128(r2, r7, r4, r3, r15)
            com.example.dyhelper.p002ui.C0182.m1598(r0, r1, r13, r3)
            int r0 = r22.size()
            r3 = 9999(0x270f, float:1.4012E-41)
            if (r0 >= r3) goto L1f7
            boolean r0 = r27.getHasMore()
            if (r0 != 0) goto L1cb
            if (r12 == 0) goto L1f7
        L1cb:
            boolean r0 = r17.isEmpty()
            if (r0 == 0) goto L1d3
            if (r12 == 0) goto L1f7
        L1d3:
            if (r6 == 0) goto L1f7
            if (r12 == 0) goto L1dd
            int r26 = r10 + 1
            r22.size()
            goto L1df
        L1dd:
            r26 = r10
        L1df:
            r33 = 120(0x78, double:5.93E-322)
            java.lang.Thread.sleep(r33)     // Catch: java.lang.Throwable -> L1e4
        L1e4:
            int r7 = r7 + 1
            r25 = r16
            r5 = r22
            r3 = r28
            r6 = r30
            r10 = -1
            r12 = 31
            r16 = r8
            r8 = r31
            goto L64
        L1f7:
            java.util.Collection r0 = r22.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            r0.size()
            int r1 = com.example.dyhelper.MainHook.f2222
            return r0
        L20a:
            r30 = r6
            r3 = 1
            java.lang.Object r0 = p000.AbstractC0984xh.m6638(r7)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r0 = r0.getParameterTypes()
            r6 = r0[r21]
            java.lang.Object r0 = p000.AbstractC0984xh.m6638(r7)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r0 = r0.getDeclaringClass()
            r0.getClass()
            r6.getClass()
            li1 r12 = new li1
            r8 = 3
            r12.<init>(r8)
            r9 = r13
            r13 = 31
            r23 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r22 = r10
            r10 = 0
            r25 = r11
            r11 = 0
            r35 = r22
            r3 = r25
            r22 = r14
            r14 = 31
            p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            r10 = r7
            int r0 = com.example.dyhelper.MainHook.f2222
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r7 = r19
            r9 = r21
            r13 = r9
            r12 = 1
        L256:
            if (r12 >= r14) goto L3fb
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            int r0 = r11.size()
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r2, r12, r3, r0, r15)
            r25 = r3
            r3 = r35
            r14 = -1
            com.example.dyhelper.p002ui.C0182.m1598(r14, r1, r3, r0)
            r14 = 1
            if (r12 != r14) goto L274
            r14 = r9
            r9 = 1
        L26f:
            r1 = r4
            r4 = r6
            r6 = r30
            goto L278
        L274:
            r0 = 4
            r14 = r9
            r9 = r0
            goto L26f
        L278:
            java.lang.Object r0 = m1218(r4, r5, r6, r7, r9)
            r30 = r6
            r30.getUid()
            r30.getSecUid()
            int r6 = com.example.dyhelper.MainHook.f2222
            java.lang.Object r6 = m1225(r0, r10)
            if (r6 != 0) goto L28e
            goto L3fb
        L28e:
            java.util.ArrayList r0 = m1220(r6)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r23 = r0.iterator()
        L29b:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L2c7
            java.lang.Object r0 = r23.next()
            java.util.concurrent.atomic.AtomicReference r26 = p000.b10.f1403     // Catch: java.lang.Throwable -> L2ae
            f8 r0 = p000.b10.m673(r0)     // Catch: java.lang.Throwable -> L2ae
            r26 = r4
            goto L2b7
        L2ae:
            r0 = move-exception
            r26 = r4
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L2b7:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L2bd
            r0 = r18
        L2bd:
            f8 r0 = (p000.C0276f8) r0
            if (r0 == 0) goto L2c4
            r9.add(r0)
        L2c4:
            r4 = r26
            goto L29b
        L2c7:
            r26 = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r9.iterator()
        L2d2:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L302
            java.lang.Object r9 = r4.next()
            r23 = r4
            r4 = r9
            f8 r4 = (p000.C0276f8) r4
            r27 = r5
            h8 r5 = r4.f3798
            r31 = r7
            r7 = r22
            if (r5 == r7) goto L2f9
            java.lang.String r4 = r4.f3800
            if (r4 == 0) goto L2f9
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto L2f6
            goto L2f9
        L2f6:
            r0.add(r9)
        L2f9:
            r22 = r7
            r4 = r23
            r5 = r27
            r7 = r31
            goto L2d2
        L302:
            r27 = r5
            r31 = r7
            r7 = r22
            java.util.Iterator r4 = r0.iterator()
        L30c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L327
            java.lang.Object r5 = r4.next()
            f8 r5 = (p000.C0276f8) r5
            java.lang.String r8 = r5.f3800
            if (r8 == 0) goto L30c
            boolean r9 = p000.q02.m4671(r8)
            if (r9 == 0) goto L323
            goto L30c
        L323:
            r11.put(r8, r5)
            goto L30c
        L327:
            java.util.Iterator r4 = r0.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L334
            r5 = r18
            goto L35a
        L334:
            java.lang.Object r5 = r4.next()
            f8 r5 = (p000.C0276f8) r5
            int r5 = r5.f3806
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L340:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L35a
            java.lang.Object r8 = r4.next()
            f8 r8 = (p000.C0276f8) r8
            int r8 = r8.f3806
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r5.compareTo(r8)
            if (r9 >= 0) goto L340
            r5 = r8
            goto L340
        L35a:
            if (r5 == 0) goto L361
            int r4 = r5.intValue()
            goto L363
        L361:
            r4 = r21
        L363:
            int r13 = java.lang.Math.max(r13, r4)
            boolean r4 = m1232(r6)
            java.lang.String r5 = "getMaxCursor"
            java.lang.String r8 = "maxCursor"
            java.lang.Long r5 = m1233(r6, r5, r8)
            if (r5 == 0) goto L37a
            long r5 = r5.longValue()
            goto L37c
        L37a:
            r5 = r19
        L37c:
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 <= 0) goto L38a
            int r8 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r8 == 0) goto L38a
            int r8 = (r5 > r31 ? 1 : (r5 == r31 ? 0 : -1))
            if (r8 == 0) goto L38a
            r8 = 1
            goto L38c
        L38a:
            r8 = r21
        L38c:
            if (r4 != 0) goto L39c
            int r9 = r11.size()
            if (r13 <= r9) goto L39c
            r9 = 3
            if (r14 >= r9) goto L39d
            if (r8 == 0) goto L39d
            r16 = 1
            goto L39f
        L39c:
            r9 = 3
        L39d:
            r16 = r21
        L39f:
            r0.size()
            r11.size()
            int r17 = com.example.dyhelper.MainHook.f2222
            int r17 = r12 * 100
            int r9 = r17 / 30
            r17 = r4
            r33 = r5
            r4 = 99
            r5 = 1
            int r6 = p000.j81.m2906(r9, r5, r4)
            android.os.Handler r9 = com.example.dyhelper.p002ui.C0182.f2694
            int r9 = r11.size()
            java.lang.String r9 = p000.AbstractC0602nx.m4128(r2, r12, r1, r9, r15)
            r4 = r37
            com.example.dyhelper.p002ui.C0182.m1598(r6, r4, r3, r9)
            int r6 = r11.size()
            r9 = 9999(0x270f, float:1.4012E-41)
            if (r6 >= r9) goto L3fb
            if (r17 != 0) goto L3d1
            if (r16 == 0) goto L3fb
        L3d1:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3d9
            if (r16 == 0) goto L3fb
        L3d9:
            if (r8 == 0) goto L3fb
            if (r16 == 0) goto L3e3
            int r0 = r14 + 1
            r11.size()
            r14 = r0
        L3e3:
            int r12 = r12 + 1
            r5 = r4
            r4 = r1
            r1 = r5
            r35 = r3
            r22 = r7
            r9 = r14
            r3 = r25
            r6 = r26
            r5 = r27
            r16 = r31
            r7 = r33
            r14 = 31
            goto L256
        L3fb:
            java.util.Collection r0 = r11.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            return r0
        L409:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1.<init>(r0)
            throw r1
        L413:
            r18 = r2
            java.lang.String r0 = "profile uid/secUid is empty"
            p000.C1080.m7279(r0)
            return r18
    }

    /* JADX INFO: renamed from: ξ */
    public final p000.zi1 m1237(android.app.Activity r45) {
            r44 = this;
            r0 = r45
            java.lang.Class r1 = r0.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r2 = 0
            if (r1 != 0) goto L1e
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r1.getContextClassLoader()
            if (r1 == 0) goto L18
            goto L1e
        L18:
            java.lang.String r0 = "host classLoader is null"
            p000.C1080.m7279(r0)
            return r2
        L1e:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = m1234()
            if (r4 == 0) goto L3c5
            java.lang.Object r3 = p000.qe0.f8982
            java.lang.String r3 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"
            java.lang.String r5 = p000.jf0.m2957(r3)
            java.lang.Class r5 = p000.qe0.m4877(r1, r5)
            if (r5 == 0) goto L3bb
            r6 = r44
            java.util.List r9 = r6.m1238(r5, r1)
            boolean r3 = r9.isEmpty()
            java.lang.String r11 = " 个 · 未识别 "
            java.lang.String r12 = " 页完成 · 已识别 "
            java.lang.String r6 = " 页 · 已识别 "
            r7 = 31
            r16 = -9223372036854775808
            java.lang.String r8 = "调试获取主页作品"
            r18 = r2
            java.lang.String r2 = "第 "
            java.lang.String r10 = " 个"
            r19 = 0
            r21 = 0
            if (r3 == 0) goto L1f1
            int r3 = com.example.dyhelper.MainHook.f2222
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r34 = r11
            r35 = r12
            r13 = r19
            r11 = r21
            r12 = r11
            r15 = 1
        L6f:
            if (r15 >= r7) goto L1d4
            android.os.Handler r22 = com.example.dyhelper.p002ui.C0182.f2694
            int r7 = r3.size()
            java.lang.String r7 = p000.AbstractC0602nx.m4128(r2, r15, r6, r7, r10)
            r37 = r6
            r6 = -1
            com.example.dyhelper.p002ui.C0182.m1598(r6, r0, r8, r7)
            com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient$ProfileAwemeListResult r6 = m1228(r1, r4, r13, r15)
            if (r6 != 0) goto L8c
        L87:
            r0 = r3
            r40 = r4
            goto L1d7
        L8c:
            java.lang.Object r7 = r6.getRawResponse()
            if (r7 != 0) goto L93
            goto L87
        L93:
            java.util.ArrayList r7 = m1220(r7)
            java.util.ArrayList r38 = m1229(r7, r15, r5)
            java.util.Iterator r22 = r38.iterator()
        L9f:
            boolean r23 = r22.hasNext()
            if (r23 == 0) goto Lc4
            java.lang.Object r23 = r22.next()
            r39 = r1
            r1 = r23
            f8 r1 = (p000.C0276f8) r1
            r40 = r4
            java.lang.String r4 = r1.f3800
            if (r4 == 0) goto Lbf
            boolean r23 = p000.q02.m4671(r4)
            if (r23 == 0) goto Lbc
            goto Lbf
        Lbc:
            r3.put(r4, r1)
        Lbf:
            r1 = r39
            r4 = r40
            goto L9f
        Lc4:
            r39 = r1
            r40 = r4
            java.util.Iterator r1 = r38.iterator()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto Ld5
            r4 = r18
            goto L101
        Ld5:
            java.lang.Object r4 = r1.next()
            f8 r4 = (p000.C0276f8) r4
            int r4 = r4.f3806
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        Le1:
            boolean r22 = r1.hasNext()
            if (r22 == 0) goto L101
            java.lang.Object r22 = r1.next()
            r23 = r1
            r1 = r22
            f8 r1 = (p000.C0276f8) r1
            int r1 = r1.f3806
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r22 = r4.compareTo(r1)
            if (r22 >= 0) goto Lfe
            r4 = r1
        Lfe:
            r1 = r23
            goto Le1
        L101:
            if (r4 == 0) goto L108
            int r1 = r4.intValue()
            goto L10a
        L108:
            r1 = r21
        L10a:
            int r11 = java.lang.Math.max(r11, r1)
            long r29 = r6.getMaxCursor()
            int r1 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r1 <= 0) goto L120
            int r1 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r1 == 0) goto L120
            int r1 = (r29 > r13 ? 1 : (r29 == r13 ? 0 : -1))
            if (r1 == 0) goto L120
            r1 = 1
            goto L122
        L120:
            r1 = r21
        L122:
            boolean r4 = r6.getHasMore()
            if (r4 == 0) goto L12e
            boolean r4 = r38.isEmpty()
            if (r4 == 0) goto L13e
        L12e:
            r4 = 3
            if (r12 >= r4) goto L13e
            if (r1 == 0) goto L13e
            if (r11 <= 0) goto L13b
            int r4 = r3.size()
            if (r11 <= r4) goto L13e
        L13b:
            r31 = 1
            goto L140
        L13e:
            r31 = r21
        L140:
            aj1 r22 = new aj1
            int r24 = r7.size()
            int r25 = r38.size()
            int r4 = r7.size()
            int r7 = r38.size()
            int r26 = r4 - r7
            int r27 = r3.size()
            boolean r28 = r6.getHasMore()
            java.lang.String r32 = "coroutine"
            r23 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r31, r32)
            r7 = r22
            r4 = r23
            r9.add(r7)
            int r15 = r4 * 100
            int r15 = r15 / 30
            r16 = r1
            r1 = 1
            r7 = 99
            int r15 = p000.j81.m2906(r15, r1, r7)
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            int r1 = r3.size()
            int r7 = r5.size()
            r17 = r11
            r22 = r12
            r11 = r34
            r12 = r35
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4136(r2, r4, r12, r1, r11)
            java.lang.String r1 = p000.AbstractC0602nx.m4131(r1, r7, r10)
            com.example.dyhelper.p002ui.C0182.m1598(r15, r0, r8, r1)
            int r1 = r3.size()
            r7 = 9999(0x270f, float:1.4012E-41)
            if (r1 >= r7) goto L1a5
            boolean r1 = r6.getHasMore()
            if (r1 != 0) goto L1a7
            if (r31 == 0) goto L1a5
            goto L1a7
        L1a5:
            r0 = r3
            goto L1d7
        L1a7:
            boolean r1 = r38.isEmpty()
            if (r1 == 0) goto L1af
            if (r31 == 0) goto L1a5
        L1af:
            if (r16 == 0) goto L1a5
            if (r31 == 0) goto L1b6
            int r1 = r22 + 1
            goto L1b8
        L1b6:
            r1 = r22
        L1b8:
            r6 = 120(0x78, double:5.93E-322)
            java.lang.Thread.sleep(r6)     // Catch: java.lang.Throwable -> L1bd
        L1bd:
            int r15 = r4 + 1
            r34 = r11
            r35 = r12
            r11 = r17
            r6 = r37
            r4 = r40
            r7 = 31
            r12 = r1
            r16 = r13
            r13 = r29
            r1 = r39
            goto L6f
        L1d4:
            r40 = r4
            goto L1a5
        L1d7:
            zi1 r3 = new zi1
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r6 = p000.AbstractC0984xh.m6666(r0)
            r8 = r9
            r9 = 0
            r7 = r5
            java.lang.String r5 = "coroutine"
            r4 = r40
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L1f1:
            r37 = r6
            java.lang.Object r1 = p000.AbstractC0984xh.m6638(r9)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r1 = r1.getParameterTypes()
            r3 = r1[r21]
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r22 = r3
            r34 = r11
            r35 = r12
            r6 = r19
            r11 = r21
            r12 = r11
            r3 = 31
            r15 = 1
        L21c:
            if (r15 >= r3) goto L260
            android.os.Handler r23 = com.example.dyhelper.p002ui.C0182.f2694
            int r3 = r1.size()
            r40 = r4
            r4 = r37
            java.lang.String r3 = p000.AbstractC0602nx.m4128(r2, r15, r4, r3, r10)
            r37 = r10
            r10 = -1
            com.example.dyhelper.p002ui.C0182.m1598(r10, r0, r8, r3)
            r22.getClass()
            r3 = 1
            if (r15 != r3) goto L244
            r10 = r8
            r8 = 1
            r33 = r4
            r4 = r5
            r3 = r22
            r5 = r40
            r36 = 31
            goto L250
        L244:
            r3 = 4
            r10 = r8
            r8 = r3
            r33 = r4
            r4 = r5
            r5 = r40
            r36 = 31
            r3 = r22
        L250:
            java.lang.Object r8 = m1218(r3, r4, r5, r6, r8)
            r43 = r5
            r5 = r3
            r3 = r4
            r4 = r43
            java.lang.Object r8 = m1225(r8, r9)
            if (r8 != 0) goto L266
        L260:
            r42 = r1
            r41 = r4
            goto L3a1
        L266:
            r39 = r3
            java.util.ArrayList r3 = m1220(r8)
            java.util.ArrayList r40 = m1229(r3, r15, r13)
            java.util.Iterator r22 = r40.iterator()
        L274:
            boolean r23 = r22.hasNext()
            if (r23 == 0) goto L299
            java.lang.Object r23 = r22.next()
            r24 = r3
            r3 = r23
            f8 r3 = (p000.C0276f8) r3
            r41 = r4
            java.lang.String r4 = r3.f3800
            if (r4 == 0) goto L294
            boolean r23 = p000.q02.m4671(r4)
            if (r23 == 0) goto L291
            goto L294
        L291:
            r1.put(r4, r3)
        L294:
            r3 = r24
            r4 = r41
            goto L274
        L299:
            r24 = r3
            r41 = r4
            java.util.Iterator r3 = r40.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L2ac
            r4 = r18
        L2a9:
            r42 = r1
            goto L2d8
        L2ac:
            java.lang.Object r4 = r3.next()
            f8 r4 = (p000.C0276f8) r4
            int r4 = r4.f3806
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2b8:
            boolean r22 = r3.hasNext()
            if (r22 == 0) goto L2a9
            java.lang.Object r22 = r3.next()
            r42 = r1
            r1 = r22
            f8 r1 = (p000.C0276f8) r1
            int r1 = r1.f3806
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r22 = r4.compareTo(r1)
            if (r22 >= 0) goto L2d5
            r4 = r1
        L2d5:
            r1 = r42
            goto L2b8
        L2d8:
            if (r4 == 0) goto L2df
            int r1 = r4.intValue()
            goto L2e1
        L2df:
            r1 = r21
        L2e1:
            int r11 = java.lang.Math.max(r11, r1)
            boolean r28 = m1232(r8)
            java.lang.String r1 = "getMaxCursor"
            java.lang.String r3 = "maxCursor"
            java.lang.Long r1 = m1233(r8, r1, r3)
            if (r1 == 0) goto L2fa
            long r3 = r1.longValue()
            r29 = r3
            goto L2fc
        L2fa:
            r29 = r19
        L2fc:
            int r1 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r1 <= 0) goto L30a
            int r1 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r1 == 0) goto L30a
            int r1 = (r29 > r6 ? 1 : (r29 == r6 ? 0 : -1))
            if (r1 == 0) goto L30a
            r1 = 1
            goto L30c
        L30a:
            r1 = r21
        L30c:
            if (r28 != 0) goto L31c
            int r3 = r42.size()
            if (r11 <= r3) goto L31c
            r4 = 3
            if (r12 >= r4) goto L31d
            if (r1 == 0) goto L31d
            r31 = 1
            goto L31f
        L31c:
            r4 = 3
        L31d:
            r31 = r21
        L31f:
            aj1 r22 = new aj1
            r3 = r24
            int r24 = r3.size()
            int r25 = r40.size()
            int r3 = r3.size()
            int r8 = r40.size()
            int r26 = r3 - r8
            int r27 = r42.size()
            java.lang.String r32 = "static"
            r23 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r31, r32)
            r8 = r22
            r3 = r23
            r14.add(r8)
            int r15 = r3 * 100
            int r15 = r15 / 30
            r4 = 1
            r8 = 99
            int r15 = p000.j81.m2906(r15, r4, r8)
            android.os.Handler r16 = com.example.dyhelper.p002ui.C0182.f2694
            int r4 = r42.size()
            int r8 = r13.size()
            r16 = r1
            r22 = r5
            r1 = r34
            r5 = r35
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r2, r3, r5, r4, r1)
            r1 = r37
            java.lang.String r4 = p000.AbstractC0602nx.m4131(r4, r8, r1)
            com.example.dyhelper.p002ui.C0182.m1598(r15, r0, r10, r4)
            int r4 = r42.size()
            r8 = 9999(0x270f, float:1.4012E-41)
            if (r4 >= r8) goto L3a1
            if (r28 != 0) goto L37d
            if (r31 == 0) goto L3a1
        L37d:
            boolean r4 = r40.isEmpty()
            if (r4 == 0) goto L385
            if (r31 == 0) goto L3a1
        L385:
            if (r16 == 0) goto L3a1
            if (r31 == 0) goto L38b
            int r12 = r12 + 1
        L38b:
            int r15 = r3 + 1
            r35 = r5
            r16 = r6
            r8 = r10
            r6 = r29
            r37 = r33
            r3 = r36
            r5 = r39
            r4 = r41
            r10 = r1
            r1 = r42
            goto L21c
        L3a1:
            zi1 r3 = new zi1
            java.util.Collection r0 = r42.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r6 = p000.AbstractC0984xh.m6666(r0)
            r9 = 0
            java.lang.String r5 = "static"
            r7 = r13
            r8 = r14
            r4 = r41
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L3bb:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            java.lang.String r1 = p000.jf0.m2957(r3)
            r0.<init>(r1)
            throw r0
        L3c5:
            r18 = r2
            java.lang.String r0 = "profile uid/secUid is empty"
            p000.C1080.m7279(r0)
            return r18
    }

    /* JADX INFO: renamed from: φ */
    public final java.util.List m1238(java.lang.Class r7, java.lang.ClassLoader r8) {
            r6 = this;
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6230
            java.util.List r1 = p000.C0666ox.m4323(r0, r8)
            r2 = 1
            if (r1 == 0) goto L51
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = m1226(r7, r5)
            if (r5 == 0) goto L14
            r3.add(r4)
            goto L14
        L2b:
            ib1 r1 = new ib1
            r4 = 23
            r1.<init>(r4)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r3, r1)
            java.util.Iterator r3 = r1.iterator()
        L3a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.setAccessible(r2)
            goto L3a
        L4a:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L51
            return r1
        L51:
            java.lang.Object r1 = p000.C0666ox.f8297
            rj0 r1 = new rj0
            r1.<init>(r8, r7, r2)
            java.lang.String r3 = "定位主页作品主动获取接口"
            java.util.List r8 = p000.C0666ox.m4316(r0, r8, r3, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L67:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r8.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = m1226(r7, r3)
            if (r3 == 0) goto L67
            r0.add(r1)
            goto L67
        L7e:
            jd1 r7 = new jd1
            r7.<init>(r2, r6)
            java.util.List r6 = p000.AbstractC0984xh.m6658(r0, r7)
            java.util.Iterator r7 = r6.iterator()
        L8b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r8.setAccessible(r2)
            goto L8b
        L9b:
            return r6
    }
}
