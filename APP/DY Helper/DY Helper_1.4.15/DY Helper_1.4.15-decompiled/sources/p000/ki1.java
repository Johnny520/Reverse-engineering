package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ki1 {

    /* JADX INFO: renamed from: α */
    public static final p000.ki1 f5936 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f5937 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.List f5938 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.List f5939 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.List f5940 = null;

    static {
            ki1 r0 = new ki1
            r0.<init>()
            p000.ki1.f5936 = r0
            java.lang.String r0 = "boolean"
            java.lang.String r1 = "int"
            java.lang.String r2 = "long"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.ki1.f5937 = r0
            java.lang.String r0 = "分钟前"
            java.lang.String r1 = "昨天"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.lang.String r2 = "小时前"
            java.lang.String r3 = "前天"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.lang.String r3 = "刚刚"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            r3 = 3
            java.util.List[] r3 = new java.util.List[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r2
            r0 = 2
            r3[r0] = r1
            java.util.List r0 = p000.AbstractC1021yh.m6897(r3)
            p000.ki1.f5938 = r0
            java.lang.String r0 = "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF2007F7B3F696BB5BBDB70EE0021542970A1D72967D4593CA07A83C5A1278394E0A339A3C7437CBF6E8FA8E3D8359057E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78D771E8EDF777FCD63305F705F385C32437F8A58A06E57B236CBE51F7976814870139C7967DE2479FB7E0FFF489B2827A18698B730A54FA797BD776534AE4E8F8672E8B8356616B53488FCB0DC36819"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "~78A3D0A0088990942E83A71740186617157A6B7152A0CBE49DBDC9E59DD84E79934DE7D505A5D9BB4FA107515898CA2321792C61BC5D49F1F2FFE795BDCF2BDA0780FA3817451580D805E43777"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.ki1.f5939 = r0
            java.lang.String r0 = "X.C879000Ydi"
            java.lang.String r1 = "X.C879010Ydj"
            java.lang.String r2 = "X.C879100Ydj"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.ki1.f5940 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m3268(java.lang.Class r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r6 == 0) goto L2b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.reflect.Field[] r1 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            r3 = 0
        L18:
            if (r3 >= r2) goto L26
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L26
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L26
            r0.add(r4)     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            goto L18
        L26:
            java.lang.Class r6 = r6.getSuperclass()
            goto L5
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m3269(java.lang.Class r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r6 == 0) goto L2b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.reflect.Method[] r1 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            r3 = 0
        L18:
            if (r3 >= r2) goto L26
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L26
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L26
            r0.add(r4)     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            goto L18
        L26:
            java.lang.Class r6 = r6.getSuperclass()
            goto L5
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static p000.ji1 m3270(java.lang.ClassLoader r9, java.lang.reflect.Method r10) {
            java.lang.Class r0 = r10.getDeclaringClass()
            r0.getClass()
            boolean r1 = m3274(r0)
            r2 = 0
            if (r1 != 0) goto L10
            goto Lea
        L10:
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6224
            java.lang.reflect.Field r9 = p000.C0666ox.m4322(r1, r9)
            r3 = 1
            java.lang.Class<android.widget.TextView> r4 = android.widget.TextView.class
            if (r9 == 0) goto L37
            java.lang.Class r5 = r9.getType()
            boolean r5 = r4.isAssignableFrom(r5)
            if (r5 == 0) goto L32
            java.lang.Class r5 = r9.getDeclaringClass()
            boolean r5 = r5.isAssignableFrom(r0)
            if (r5 == 0) goto L32
            goto L33
        L32:
            r9 = r2
        L33:
            if (r9 == 0) goto L37
            goto Le8
        L37:
            java.util.ArrayList r9 = m3268(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L44:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L5f
            java.lang.Object r5 = r9.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            int r6 = r6.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L44
            r0.add(r5)
            goto L44
        L5f:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L68:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r6 = r6.getType()
            boolean r6 = r4.isAssignableFrom(r6)
            if (r6 == 0) goto L68
            r9.add(r5)
            goto L68
        L83:
            java.util.Iterator r0 = r9.iterator()
        L87:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r6 = "timeView"
            java.lang.String r7 = "commentTimeView"
            java.lang.String r8 = "LJFF"
            java.lang.String[] r6 = new java.lang.String[]{r8, r6, r7}
            java.util.Set r6 = p000.AbstractC0312g7.m2263(r6)
            java.lang.String r5 = r5.getName()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L87
            goto Lae
        Lad:
            r4 = r2
        Lae:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 != 0) goto Lb9
            java.lang.Object r9 = p000.AbstractC0984xh.m6656(r9)
            r4 = r9
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
        Lb9:
            if (r4 == 0) goto Lc0
            r4.setAccessible(r3)
            r9 = r4
            goto Lc1
        Lc0:
            r9 = r2
        Lc1:
            if (r9 == 0) goto Le8
            java.lang.Object r0 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> Lcb
            p000.C0666ox.m4326(r1, r9)     // Catch: java.lang.Throwable -> Lcb
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lcb
            goto Ld2
        Lcb:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Ld2:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Le8
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "模板时间 TextView 字段缓存失败: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r1 = 4
            java.lang.String r4 = "r99b7e71b74d4ef6d"
            p000.C0888ux.m5988(r4, r0, r2, r1, r2)
        Le8:
            if (r9 != 0) goto Leb
        Lea:
            return r2
        Leb:
            r10.setAccessible(r3)
            ji1 r0 = new ji1
            r0.<init>(r9, r10)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final void m3271(java.lang.ClassLoader r4, java.util.LinkedHashMap r5, p000.p70 r6) {
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L47
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L47
        La:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L44
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L47
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "getMethodInstance"
            java.lang.Class<java.lang.ClassLoader> r3 = java.lang.ClassLoader.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L47
            boolean r1 = r0 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L33
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L47
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto La
            boolean r1 = m3272(r0)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto La
            java.lang.String r1 = m3278(r0)     // Catch: java.lang.Throwable -> L47
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L47
            goto La
        L44:
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L4e:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L5f
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "Compose 时间格式化器 DexKit 查询失败: "
            java.lang.String r6 = "r99b7e71b74d4ef6d"
            p000.AbstractC0602nx.m4143(r5, r4, r6)
        L5f:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m3272(java.lang.reflect.Method r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L2c
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2c
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0, r1}
            boolean r3 = java.util.Arrays.equals(r3, r0)
            if (r3 == 0) goto L2c
            r3 = 1
            return r3
        L2c:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m3273(java.lang.reflect.Method r5) {
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L67
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L67
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 == r2) goto L20
            goto L67
        L20:
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5 = r5[r1]
            r5.getClass()
            java.util.ArrayList r5 = m3268(r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L34
            goto L67
        L34:
            java.util.Iterator r5 = r5.iterator()
        L38:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r3 = r0.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L38
            java.lang.Class r3 = r0.getType()
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L66
            java.lang.Class r0 = r0.getType()
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto L38
        L66:
            return r2
        L67:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static boolean m3274(java.lang.Class r4) {
            java.lang.String r0 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943128700B29BC878899AC8BAA78D0125812290219B8488"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r1 = r4.getSuperclass()
        La:
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L6d
            java.lang.String r3 = r1.getName()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L68
            java.util.ArrayList r0 = m3268(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2a
            goto L6d
        L2a:
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r3 = r1.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L2e
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            java.lang.Class r1 = r1.getType()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L2e
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            r4.getClass()
            int r0 = r4.length
            r1 = r2
        L59:
            if (r1 >= r0) goto L6d
            r3 = r4[r1]
            boolean r3 = m3273(r3)
            if (r3 == 0) goto L65
            r4 = 1
            return r4
        L65:
            int r1 = r1 + 1
            goto L59
        L68:
            java.lang.Class r1 = r1.getSuperclass()
            goto La
        L6d:
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static void m3275(java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L2f
        L7:
            java.lang.Object r0 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L11
            kx r0 = p000.EnumC0491kx.f6225     // Catch: java.lang.Throwable -> L11
            p000.C0666ox.m4327(r0, r3)     // Catch: java.lang.Throwable -> L11
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L18:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "Compose 时间格式化方法缓存失败: "
            java.lang.String r3 = p000.lz1.m3687(r0, r3)
            r0 = 4
            java.lang.String r1 = "r99b7e71b74d4ef6d"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
        L2f:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m3276(java.util.ArrayList r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L2f
        L7:
            java.lang.Object r0 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L11
            kx r0 = p000.EnumC0491kx.f6222     // Catch: java.lang.Throwable -> L11
            p000.C0666ox.m4325(r0, r3)     // Catch: java.lang.Throwable -> L11
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L18:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L2f
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "模板时间组件类缓存失败: "
            java.lang.String r3 = p000.lz1.m3687(r0, r3)
            r0 = 4
            java.lang.String r1 = "r99b7e71b74d4ef6d"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
        L2f:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static int m3277(java.lang.reflect.Method r7) {
            java.lang.Class r7 = r7.getDeclaringClass()
            java.util.List r0 = p000.ki1.f5940
            java.lang.String r1 = r7.getName()
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 == 0) goto L14
            r0 = 5000(0x1388, float:7.006E-42)
            goto L15
        L14:
            r0 = r1
        L15:
            java.lang.String r2 = r7.getName()
            java.lang.String r3 = "X."
            boolean r2 = p000.x02.m6485(r2, r3, r1)
            if (r2 == 0) goto L23
            int r0 = r0 + 500
        L23:
            java.lang.String r2 = r7.getName()
            java.lang.String r3 = "comment"
            r4 = 1
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L32
            int r0 = r0 + 300
        L32:
            java.util.ArrayList r2 = m3268(r7)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            int r6 = r6.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L3f
            r3.add(r5)
            goto L3f
        L5a:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L61
            goto L7f
        L61:
            java.util.Iterator r2 = r3.iterator()
        L65:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r2.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r5 = r5.getType()
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L65
            int r0 = r0 + 300
        L7f:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L86
            goto La4
        L86:
            java.util.Iterator r2 = r3.iterator()
        L8a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L8a
            int r0 = r0 + 300
        La4:
            java.util.ArrayList r7 = m3269(r7)
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto Laf
            goto Lcf
        Laf:
            java.util.Iterator r7 = r7.iterator()
        Lb3:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r7.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = m3272(r2)
            if (r2 == 0) goto Lb3
            int r1 = r1 + 1
            if (r1 < 0) goto Lca
            goto Lb3
        Lca:
            p000.AbstractC1021yh.m6916()
            r7 = 0
            throw r7
        Lcf:
            if (r1 != r4) goto Ld3
            int r0 = r0 + 200
        Ld3:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m3278(java.lang.reflect.Method r6) {
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
            cf1 r2 = new cf1
            r3 = 25
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: θ */
    public final java.util.List m3279(java.lang.ClassLoader r9, boolean r10) {
            r8 = this;
            r9.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6225
            java.util.List r1 = p000.C0666ox.m4323(r0, r9)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = m3272(r5)
            if (r5 == 0) goto L19
            r3.add(r4)
            goto L19
        L30:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3b
            java.util.List r8 = r8.m3281(r3)
            return r8
        L3b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r3 = p000.ki1.f5940
            java.util.Iterator r3 = r3.iterator()
        L46:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class r4 = p000.AbstractC0093bx.m1082(r9, r4)
            if (r4 == 0) goto L46
            r1.add(r4)
            goto L46
        L5c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L65:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r1.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.util.ArrayList r4 = m3269(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L7e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L95
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = m3272(r7)
            if (r7 == 0) goto L7e
            r5.add(r6)
            goto L7e
        L95:
            p000.AbstractC0984xh.m6660(r3, r5)
            goto L65
        L99:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto La7
            java.util.List r8 = r8.m3281(r3)
            m3275(r8)
            return r8
        La7:
            if (r10 == 0) goto L118
            java.lang.Object r10 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.C0666ox.f8305
            boolean r10 = r10.get()
            if (r10 != 0) goto Lb4
            goto L118
        Lb4:
            java.lang.String r10 = "定位 Compose 评论时间格式化方法"
            qh1 r1 = new qh1     // Catch: java.lang.Throwable -> Lc1
            r3 = 1
            r1.<init>(r8, r3, r9)     // Catch: java.lang.Throwable -> Lc1
            java.util.List r9 = p000.C0666ox.m4316(r0, r9, r10, r1)     // Catch: java.lang.Throwable -> Lc1
            goto Lc8
        Lc1:
            r9 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        Lc8:
            java.lang.Throwable r10 = p000.fo1.m2190(r9)
            r0 = 0
            if (r10 == 0) goto Ldf
            java.lang.String r10 = r10.getMessage()
            java.lang.String r1 = "Compose 时间格式化方法定位失败: "
            java.lang.String r10 = p000.lz1.m3687(r1, r10)
            r1 = 4
            java.lang.String r3 = "r99b7e71b74d4ef6d"
            p000.C0888ux.m5988(r3, r10, r0, r1, r0)
        Ldf:
            boolean r10 = r9 instanceof p000.eo1
            if (r10 == 0) goto Le4
            r9 = r0
        Le4:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto Le9
            goto Lea
        Le9:
            r2 = r9
        Lea:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r2.iterator()
        Lf3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L10a
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m3272(r1)
            if (r1 == 0) goto Lf3
            r9.add(r0)
            goto Lf3
        L10a:
            java.util.List r8 = r8.m3281(r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L117
            m3275(r8)
        L117:
            return r8
        L118:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final java.util.ArrayList m3280(java.lang.ClassLoader r27, boolean r28) {
            r26 = this;
            r1 = r27
            r1.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6223
            java.util.List r0 = p000.C0666ox.m4323(r2, r1)
            jz r3 = p000.C0450jz.f5672
            if (r0 != 0) goto L12
            r0 = r3
        L12:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L31
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            ji1 r5 = m3270(r1, r5)
            if (r5 == 0) goto L1b
            r4.add(r5)
            goto L1b
        L31:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r4.next()
            r7 = r6
            ji1 r7 = (p000.ji1) r7
            java.lang.reflect.Method r7 = r7.f5478
            java.lang.String r7 = m3278(r7)
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L3f
            r5.add(r6)
            goto L3f
        L5c:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L63
            return r5
        L63:
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6222
            java.util.List r4 = p000.C0666ox.m4321(r0, r1)
            if (r4 != 0) goto L6e
            r4 = r3
        L6e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L8e
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r7 = m3274(r7)
            if (r7 == 0) goto L77
            r5.add(r6)
            goto L77
        L8e:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lb7
            java.lang.Object r7 = r5.next()
            r8 = r7
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.String r8 = r8.getName()
            boolean r8 = r4.add(r8)
            if (r8 == 0) goto L9c
            r6.add(r7)
            goto L9c
        Lb7:
            boolean r4 = r6.isEmpty()
            r5 = 4
            java.lang.String r7 = "r99b7e71b74d4ef6d"
            r8 = 0
            if (r4 != 0) goto Lc3
            goto L1cf
        Lc3:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r6 = p000.ki1.f5939
            java.util.Iterator r6 = r6.iterator()
        Lce:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto Le4
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Class r9 = p000.AbstractC0093bx.m1082(r1, r9)
            if (r9 == 0) goto Lce
            r4.add(r9)
            goto Lce
        Le4:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        Led:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L104
            java.lang.Object r9 = r4.next()
            r10 = r9
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r10 = m3274(r10)
            if (r10 == 0) goto Led
            r6.add(r9)
            goto Led
        L104:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L112:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L12d
            java.lang.Object r10 = r6.next()
            r11 = r10
            java.lang.Class r11 = (java.lang.Class) r11
            java.lang.String r11 = r11.getName()
            boolean r11 = r4.add(r11)
            if (r11 == 0) goto L112
            r9.add(r10)
            goto L112
        L12d:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L139
            m3276(r9)
            r6 = r9
            goto L1cf
        L139:
            if (r28 == 0) goto L1ce
            java.lang.Object r4 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 != 0) goto L147
            goto L1ce
        L147:
            java.lang.String r4 = "定位模板评论时间组件类"
            t20 r6 = new t20     // Catch: java.lang.Throwable -> L157
            r9 = 25
            r10 = r26
            r6.<init>(r1, r10, r9)     // Catch: java.lang.Throwable -> L157
            java.util.List r0 = p000.C0666ox.m4314(r0, r1, r4, r6)     // Catch: java.lang.Throwable -> L157
            goto L15e
        L157:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L15e:
            java.lang.Throwable r4 = p000.fo1.m2190(r0)
            if (r4 == 0) goto L171
            java.lang.String r4 = r4.getMessage()
            java.lang.String r6 = "模板时间组件定位失败: "
            java.lang.String r4 = p000.lz1.m3687(r6, r4)
            p000.C0888ux.m5988(r7, r4, r8, r5, r8)
        L171:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L176
            r0 = r8
        L176:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L17b
            r0 = r3
        L17b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L184:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L19b
            java.lang.Object r6 = r0.next()
            r9 = r6
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r9 = m3274(r9)
            if (r9 == 0) goto L184
            r4.add(r6)
            goto L184
        L19b:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1a9:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L1c4
            java.lang.Object r9 = r4.next()
            r10 = r9
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.String r10 = r10.getName()
            boolean r10 = r0.add(r10)
            if (r10 == 0) goto L1a9
            r6.add(r9)
            goto L1a9
        L1c4:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L1cf
            m3276(r6)
            goto L1cf
        L1ce:
            r6 = r3
        L1cf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r6.iterator()
        L1d8:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2ee
            java.lang.Object r6 = r4.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Class r9 = r6.getSuperclass()
            cf1 r10 = new cf1
            r11 = 26
            r10.<init>(r11)
            ss1 r9 = p000.us1.m5954(r9, r10)
            java.util.Iterator r9 = r9.iterator()
        L1f7:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L215
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.Class r11 = (java.lang.Class) r11
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943128700B29BC878899AC8BAA78D0125812290219B8488"
            java.lang.String r12 = p000.jf0.m2957(r12)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L1f7
            goto L216
        L215:
            r10 = r8
        L216:
            java.lang.Class r10 = (java.lang.Class) r10
            r9 = 1
            if (r10 == 0) goto L252
            java.lang.reflect.Method[] r11 = r10.getDeclaredMethods()
            if (r11 == 0) goto L252
            int r12 = r11.length
            r13 = 0
            r15 = r8
            r14 = r13
        L225:
            if (r13 >= r12) goto L25c
            r16 = r11[r13]
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isAbstract(r17)
            if (r17 == 0) goto L257
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 != 0) goto L257
            java.lang.Class r5 = r16.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r5 = p000.ln0.m3626(r5, r8)
            if (r5 == 0) goto L257
            java.lang.Class[] r5 = r16.getParameterTypes()
            int r5 = r5.length
            if (r5 != r9) goto L257
            if (r14 == 0) goto L254
        L252:
            r15 = 0
            goto L25f
        L254:
            r14 = r9
            r15 = r16
        L257:
            int r13 = r13 + 1
            r5 = 4
            r8 = 0
            goto L225
        L25c:
            if (r14 != 0) goto L25f
            goto L252
        L25f:
            if (r10 == 0) goto L266
            if (r15 != 0) goto L266
        L263:
            r5 = 0
            goto L2dd
        L266:
            java.lang.reflect.Method[] r5 = r6.getDeclaredMethods()
            r5.getClass()
            ss1 r5 = p000.AbstractC0312g7.m2232(r5)
            ny0 r18 = new ny0
            r24 = 0
            r25 = 19
            r19 = 1
            ki1 r20 = p000.ki1.f5936
            java.lang.Class<ki1> r21 = p000.ki1.class
            java.lang.String r22 = "isTemplateRenderMethod"
            java.lang.String r23 = "isTemplateRenderMethod(Ljava/lang/reflect/Method;)Z"
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r6 = r18
            y30 r8 = new y30
            r8.<init>(r5, r9, r6)
            nb r5 = new nb
            r6 = 3
            r5.<init>(r6, r15)
            y30 r6 = new y30
            r6.<init>(r8, r9, r5)
            ib1 r5 = new ib1
            r8 = 19
            r5.<init>(r8)
            java.util.List r6 = p000.us1.m5949(r6)
            p000.AbstractC0019ai.m168(r6, r5)
            java.util.Iterator r5 = r6.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L2b0
            r5 = r3
            goto L2d2
        L2b0:
            java.lang.Object r6 = r5.next()
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L2bf
            java.util.List r5 = p000.AbstractC1021yh.m6896(r6)
            goto L2d2
        L2bf:
            java.util.ArrayList r6 = p000.lz1.m3696(r6)
        L2c3:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L2d1
            java.lang.Object r8 = r5.next()
            r6.add(r8)
            goto L2c3
        L2d1:
            r5 = r6
        L2d2:
            java.lang.Object r5 = p000.AbstractC0984xh.m6640(r5)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L263
            r5.setAccessible(r9)
        L2dd:
            if (r5 == 0) goto L2e4
            ji1 r5 = m3270(r1, r5)
            goto L2e5
        L2e4:
            r5 = 0
        L2e5:
            if (r5 == 0) goto L2ea
            r0.add(r5)
        L2ea:
            r5 = 4
            r8 = 0
            goto L1d8
        L2ee:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2fc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L319
            java.lang.Object r4 = r0.next()
            r5 = r4
            ji1 r5 = (p000.ji1) r5
            java.lang.reflect.Method r5 = r5.f5478
            java.lang.String r5 = m3278(r5)
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L2fc
            r3.add(r4)
            goto L2fc
        L319:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L37f
            java.lang.Object r0 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L342
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L342
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)     // Catch: java.lang.Throwable -> L342
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L342
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Throwable -> L342
        L330:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L342
            if (r4 == 0) goto L344
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L342
            ji1 r4 = (p000.ji1) r4     // Catch: java.lang.Throwable -> L342
            java.lang.reflect.Method r4 = r4.f5478     // Catch: java.lang.Throwable -> L342
            r0.add(r4)     // Catch: java.lang.Throwable -> L342
            goto L330
        L342:
            r0 = move-exception
            goto L364
        L344:
            p000.C0666ox.m4327(r2, r0)     // Catch: java.lang.Throwable -> L342
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L342
        L34b:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L342
            if (r1 == 0) goto L361
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L342
            ji1 r1 = (p000.ji1) r1     // Catch: java.lang.Throwable -> L342
            java.lang.Object r2 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L342
            kx r2 = p000.EnumC0491kx.f6224     // Catch: java.lang.Throwable -> L342
            java.lang.reflect.Field r1 = r1.f5479     // Catch: java.lang.Throwable -> L342
            p000.C0666ox.m4326(r2, r1)     // Catch: java.lang.Throwable -> L342
            goto L34b
        L361:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L342
            goto L36a
        L364:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L36a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L37f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "模板时间目标缓存失败: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            r1 = 4
            r2 = 0
            p000.C0888ux.m5988(r7, r0, r2, r1, r2)
        L37f:
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public final java.util.List m3281(java.util.List r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r5.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m3278(r3)
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto Le
            r1.add(r2)
            goto Le
        L29:
            ib1 r5 = new ib1
            r0 = 20
            r5.<init>(r0, r4)
            java.util.List r4 = p000.AbstractC0984xh.m6658(r1, r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            r0 = r5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            int r0 = m3277(r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto L38
            goto L4f
        L4e:
            r5 = 0
        L4f:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 != 0) goto L56
            jz r4 = p000.C0450jz.f5672
            return r4
        L56:
            r4 = 1
            r5.setAccessible(r4)
            java.util.List r4 = p000.AbstractC1021yh.m6896(r5)
            return r4
    }
}
