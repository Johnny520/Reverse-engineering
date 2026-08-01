package p000;

/* JADX INFO: renamed from: fb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0279fb {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.CopyOnWriteArrayList f3856 = null;

    /* JADX INFO: renamed from: β */
    public static volatile boolean f3857;

    /* JADX INFO: renamed from: γ */
    public static final java.util.List f3858 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.List f3859 = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.AbstractC0279fb.f3856 = r0
            java.lang.String r0 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134480469C45468AA16A8F6A1C3389074335160687955403BE9F1FF8D9DFF8B0C721F258E0C89091A072226B"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11191155A1E04541A2C6D7589F3BA263618D5C9E9631DAED24084C05EC0FA5AEEE60D19DF7E8BEB7B8F8F59915"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.AbstractC0279fb.f3858 = r0
            java.lang.String r0 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D68E259722F51C3EC086C9236A937084C06950"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "com.p771ss.android.ugc.aweme.feed.p1043ui.bottom.BottomSpace"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.AbstractC0279fb.f3859 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.List m2079(org.luckypray.dexkit.DexKitBridge r6, java.lang.ClassLoader r7, java.lang.String r8, java.lang.String r9, java.util.List r10, java.util.List r11) {
            ab r0 = new ab     // Catch: java.lang.Throwable -> L3d
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3d
            org.luckypray.dexkit.result.MethodDataList r6 = r6.findMethod(r0)     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            r8.<init>()     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L3d
        L17:
            boolean r9 = r6.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L44
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3d
            org.luckypray.dexkit.result.MethodData r9 = (org.luckypray.dexkit.result.MethodData) r9     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r9 = r9.getMethodInstance(r7)     // Catch: java.lang.Throwable -> L28
            goto L30
        L28:
            r0 = move-exception
            r9 = r0
            eo1 r10 = new eo1     // Catch: java.lang.Throwable -> L3d
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L3d
            r9 = r10
        L30:
            boolean r10 = r9 instanceof p000.eo1     // Catch: java.lang.Throwable -> L3d
            if (r10 == 0) goto L35
            r9 = 0
        L35:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L17
            r8.add(r9)     // Catch: java.lang.Throwable -> L3d
            goto L17
        L3d:
            r0 = move-exception
            r6 = r0
            eo1 r8 = new eo1
            r8.<init>(r6)
        L44:
            java.lang.Throwable r6 = p000.fo1.m2190(r8)
            if (r6 == 0) goto L51
            java.lang.String r7 = "ra96c4bde0d98e3d4"
            java.lang.String r9 = "dexFindMethodsCompat failed"
            p000.C0888ux.m5977(r7, r9, r6)
        L51:
            boolean r6 = r8 instanceof p000.eo1
            if (r6 == 0) goto L57
            jz r8 = p000.C0450jz.f5672
        L57:
            java.util.List r8 = (java.util.List) r8
            return r8
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Class m2080(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        Ld:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L12
            r1 = 0
        L12:
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static void m2081(java.lang.ClassLoader r6) {
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.util.List r2 = m2087(r6, r1)
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            eb r4 = new eb
            db r5 = p000.EnumC0206db.f3019
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L11
        L28:
            java.util.List r2 = m2086(r6, r1)
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            eb r4 = new eb
            db r5 = p000.EnumC0206db.f3020
            r4.<init>(r5, r3)
            r0.add(r4)
            goto L30
        L47:
            java.util.List r6 = m2085(r6, r1)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            eb r2 = new eb
            db r3 = p000.EnumC0206db.f3021
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L4f
        L66:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L6e
            goto L102
        L6e:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()
            r3 = r2
            eb r3 = (p000.C0242eb) r3
            db r4 = r3.f3465
            java.lang.reflect.Method r3 = r3.f3466
            java.lang.String r3 = m2084(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ":"
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            boolean r3 = r6.add(r3)
            if (r3 == 0) goto L7c
            r1.add(r2)
            goto L7c
        Laf:
            java.util.Iterator r6 = r1.iterator()
        Lb3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r6.next()
            eb r0 = (p000.C0242eb) r0
            java.lang.reflect.Method r0 = r0.f3466
            r2 = 1
            r0.setAccessible(r2)
            goto Lb3
        Lc6:
            int r6 = r1.size()
            java.lang.String r0 = "resolved methods="
            java.lang.String r6 = p000.a12.m17(r0, r6)
            r0 = 4
            java.lang.String r2 = "ra96c4bde0d98e3d4"
            r3 = 0
            p000.C0888ux.m5988(r2, r6, r3, r0, r3)
            java.util.concurrent.CopyOnWriteArrayList r6 = p000.AbstractC0279fb.f3856
            java.util.Iterator r6 = r6.iterator()
        Ldd:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L102
            java.lang.Object r0 = r6.next()
            a80 r0 = (p000.a80) r0
            r0.invoke(r1)     // Catch: java.lang.Throwable -> Lef
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lef
            goto Lf6
        Lef:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        Lf6:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Ldd
            java.lang.String r3 = "listener failed"
            p000.C0888ux.m5977(r2, r3, r0)
            goto Ldd
        L102:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m2082(java.lang.reflect.Method r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L36
        Lc:
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L36
            int r3 = r0.length
            r2 = 2
            if (r3 != r2) goto L36
            r3 = r0[r1]
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L36
            r3 = 1
            r0 = r0[r3]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L36
            return r3
        L36:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m2083(java.lang.reflect.Method r4) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L3f
        Lc:
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            boolean r4 = p000.ln0.m3626(r4, r2)
            if (r4 == 0) goto L3f
            int r4 = r0.length
            r2 = 3
            if (r4 != r2) goto L3f
            r4 = r0[r1]
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r4 = p000.ln0.m3626(r4, r2)
            if (r4 == 0) goto L3f
            r4 = 1
            r3 = r0[r4]
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L3f
            r2 = 2
            r0 = r0[r2]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L3f
            return r4
        L3f:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m2084(java.lang.reflect.Method r7) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r7.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r7.getParameterTypes()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L2b:
            if (r3 >= r2) goto L43
            r5 = r1[r3]
            int r6 = r4 + 1
            if (r4 <= 0) goto L38
            r4 = 44
            r0.append(r4)
        L38:
            java.lang.String r4 = r5.getName()
            r0.append(r4)
            int r3 = r3 + 1
            r4 = r6
            goto L2b
        L43:
            java.lang.String r1 = "):"
            r0.append(r1)
            java.lang.Class r7 = r7.getReturnType()
            java.lang.String r7 = r7.getName()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: η */
    public static java.util.List m2085(java.lang.ClassLoader r10, boolean r11) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6228
            java.util.List r1 = p000.C0666ox.m4323(r0, r10)
            r2 = 1
            if (r1 == 0) goto L7b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L12
            goto L7b
        L12:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r1.iterator()
        L1b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r11.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m2082(r1)
            if (r1 == 0) goto L1b
            r10.add(r0)
            goto L1b
        L32:
            d50 r11 = new d50
            r0 = 17
            r11.<init>(r0)
            java.util.List r10 = p000.AbstractC0984xh.m6658(r10, r11)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L4b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r10.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2084(r3)
            boolean r3 = r11.add(r3)
            if (r3 == 0) goto L4b
            r0.add(r1)
            goto L4b
        L66:
            java.util.Iterator r10 = r0.iterator()
        L6a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L7a
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.setAccessible(r2)
            goto L6a
        L7a:
            return r0
        L7b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = p000.AbstractC0279fb.f3859
            java.util.Iterator r4 = r4.iterator()
        L8b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La1
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r5 = m2080(r10, r5)
            if (r5 == 0) goto L8b
            r3.add(r5)
            goto L8b
        La1:
            java.util.Iterator r3 = r3.iterator()
        La5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld6
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            r4.getClass()
            int r5 = r4.length
            r6 = 0
        Lba:
            if (r6 >= r5) goto La5
            r7 = r4[r6]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "LIZ"
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto Ld3
            boolean r8 = m2082(r7)
            if (r8 == 0) goto Ld3
            r1.add(r7)
        Ld3:
            int r6 = r6 + 1
            goto Lba
        Ld6:
            d50 r3 = new d50
            r4 = 14
            r3.<init>(r4)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r1, r3)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lef:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L10a
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = m2084(r6)
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto Lef
            r4.add(r5)
            goto Lef
        L10a:
            java.util.Iterator r1 = r4.iterator()
        L10e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L11e
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.setAccessible(r2)
            goto L10e
        L11e:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L12c
            if (r11 == 0) goto L12b
            java.lang.Object r10 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r0, r4)
        L12b:
            return r4
        L12c:
            if (r11 != 0) goto L12f
            goto L139
        L12f:
            java.lang.Object r11 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0666ox.f8305
            boolean r11 = r11.get()
            if (r11 != 0) goto L13c
        L139:
            jz r10 = p000.C0450jz.f5672
            return r10
        L13c:
            bb r11 = new bb
            r11.<init>(r10, r2)
            java.lang.String r1 = "定位底栏占位布局刷新混淆方法"
            java.util.List r10 = p000.C0666ox.m4316(r0, r10, r1, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L150:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L167
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m2082(r1)
            if (r1 == 0) goto L150
            r11.add(r0)
            goto L150
        L167:
            d50 r10 = new d50
            r0 = 18
            r10.<init>(r0)
            java.util.List r10 = p000.AbstractC0984xh.m6658(r11, r10)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L180:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L19b
            java.lang.Object r1 = r10.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2084(r3)
            boolean r3 = r11.add(r3)
            if (r3 == 0) goto L180
            r0.add(r1)
            goto L180
        L19b:
            java.util.Iterator r10 = r0.iterator()
        L19f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1af
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.setAccessible(r2)
            goto L19f
        L1af:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.List m2086(java.lang.ClassLoader r10, boolean r11) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6227
            java.util.List r1 = p000.C0666ox.m4323(r0, r10)
            r2 = 1
            if (r1 == 0) goto L7b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L12
            goto L7b
        L12:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r1.iterator()
        L1b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r11.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m2082(r1)
            if (r1 == 0) goto L1b
            r10.add(r0)
            goto L1b
        L32:
            d50 r11 = new d50
            r0 = 19
            r11.<init>(r0)
            java.util.List r10 = p000.AbstractC0984xh.m6658(r10, r11)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L4b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r10.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2084(r3)
            boolean r3 = r11.add(r3)
            if (r3 == 0) goto L4b
            r0.add(r1)
            goto L4b
        L66:
            java.util.Iterator r10 = r0.iterator()
        L6a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L7a
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.setAccessible(r2)
            goto L6a
        L7a:
            return r0
        L7b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = p000.AbstractC0279fb.f3859
            java.util.Iterator r4 = r4.iterator()
        L8b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La1
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r5 = m2080(r10, r5)
            if (r5 == 0) goto L8b
            r3.add(r5)
            goto L8b
        La1:
            java.util.Iterator r3 = r3.iterator()
        La5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld6
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            r4.getClass()
            int r5 = r4.length
            r6 = 0
        Lba:
            if (r6 >= r5) goto La5
            r7 = r4[r6]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "LIZIZ"
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto Ld3
            boolean r8 = m2082(r7)
            if (r8 == 0) goto Ld3
            r1.add(r7)
        Ld3:
            int r6 = r6 + 1
            goto Lba
        Ld6:
            d50 r3 = new d50
            r4 = 15
            r3.<init>(r4)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r1, r3)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lef:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L10a
            java.lang.Object r5 = r1.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = m2084(r6)
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto Lef
            r4.add(r5)
            goto Lef
        L10a:
            java.util.Iterator r1 = r4.iterator()
        L10e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L11e
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.setAccessible(r2)
            goto L10e
        L11e:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L12c
            if (r11 == 0) goto L12b
            java.lang.Object r10 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r0, r4)
        L12b:
            return r4
        L12c:
            if (r11 != 0) goto L12f
            goto L139
        L12f:
            java.lang.Object r11 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0666ox.f8305
            boolean r11 = r11.get()
            if (r11 != 0) goto L13c
        L139:
            jz r10 = p000.C0450jz.f5672
            return r10
        L13c:
            bb r11 = new bb
            r1 = 2
            r11.<init>(r10, r1)
            java.lang.String r1 = "定位底栏占位可见性混淆方法"
            java.util.List r10 = p000.C0666ox.m4316(r0, r10, r1, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L151:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L168
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m2082(r1)
            if (r1 == 0) goto L151
            r11.add(r0)
            goto L151
        L168:
            d50 r10 = new d50
            r0 = 20
            r10.<init>(r0)
            java.util.List r10 = p000.AbstractC0984xh.m6658(r11, r10)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L181:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L19c
            java.lang.Object r1 = r10.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2084(r3)
            boolean r3 = r11.add(r3)
            if (r3 == 0) goto L181
            r0.add(r1)
            goto L181
        L19c:
            java.util.Iterator r10 = r0.iterator()
        L1a0:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L1b0
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.setAccessible(r2)
            goto L1a0
        L1b0:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m2087(java.lang.ClassLoader r9, boolean r10) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6226
            java.util.List r1 = p000.C0666ox.m4323(r0, r9)
            r2 = 1
            if (r1 == 0) goto L7b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L12
            goto L7b
        L12:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r1.iterator()
        L1b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m2083(r1)
            if (r1 == 0) goto L1b
            r9.add(r0)
            goto L1b
        L32:
            d50 r10 = new d50
            r0 = 21
            r10.<init>(r0)
            java.util.List r9 = p000.AbstractC0984xh.m6658(r9, r10)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r9.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2084(r3)
            boolean r3 = r10.add(r3)
            if (r3 == 0) goto L4b
            r0.add(r1)
            goto L4b
        L66:
            java.util.Iterator r9 = r0.iterator()
        L6a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L7a
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.setAccessible(r2)
            goto L6a
        L7a:
            return r0
        L7b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = p000.AbstractC0279fb.f3858
            java.util.Iterator r4 = r4.iterator()
        L8b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La1
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r5 = m2080(r9, r5)
            if (r5 == 0) goto L8b
            r3.add(r5)
            goto L8b
        La1:
            java.util.Iterator r3 = r3.iterator()
        La5:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            r4.getClass()
            int r6 = r4.length
        Lba:
            if (r5 >= r6) goto La5
            r7 = r4[r5]
            r7.getClass()
            boolean r8 = m2083(r7)
            if (r8 == 0) goto Lca
            r1.add(r7)
        Lca:
            int r5 = r5 + 1
            goto Lba
        Lcd:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        Ld6:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lef
            java.lang.Object r4 = r1.next()
            r6 = r4
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            int r6 = m2089(r6)
            r7 = 1800(0x708, float:2.522E-42)
            if (r6 < r7) goto Ld6
            r3.add(r4)
            goto Ld6
        Lef:
            d50 r1 = new d50
            r4 = 16
            r1.<init>(r4)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r3, r1)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L108:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L123
            java.lang.Object r6 = r1.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r7 = m2084(r7)
            boolean r7 = r3.add(r7)
            if (r7 == 0) goto L108
            r4.add(r6)
            goto L108
        L123:
            java.util.Iterator r1 = r4.iterator()
        L127:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L137
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.setAccessible(r2)
            goto L127
        L137:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L145
            if (r10 == 0) goto L144
            java.lang.Object r9 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r0, r4)
        L144:
            return r4
        L145:
            if (r10 != 0) goto L148
            goto L152
        L148:
            java.lang.Object r10 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.C0666ox.f8305
            boolean r10 = r10.get()
            if (r10 != 0) goto L155
        L152:
            jz r9 = p000.C0450jz.f5672
            return r9
        L155:
            bb r10 = new bb
            r10.<init>(r9, r5)
            java.lang.String r1 = "定位底栏可见性混淆控制方法"
            java.util.List r9 = p000.C0666ox.m4316(r0, r9, r1, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L169:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L180
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m2083(r1)
            if (r1 == 0) goto L169
            r10.add(r0)
            goto L169
        L180:
            d50 r9 = new d50
            r0 = 22
            r9.<init>(r0)
            java.util.List r9 = p000.AbstractC0984xh.m6658(r10, r9)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L199:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = r9.next()
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2084(r3)
            boolean r3 = r10.add(r3)
            if (r3 == 0) goto L199
            r0.add(r1)
            goto L199
        L1b4:
            java.util.Iterator r9 = r0.iterator()
        L1b8:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L1c8
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r10.setAccessible(r2)
            goto L1b8
        L1c8:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static int m2088(java.lang.reflect.Method r4) {
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r1 = r1.getSimpleName()
            boolean r2 = m2082(r4)
            if (r2 == 0) goto L19
            r2 = 800(0x320, float:1.121E-42)
            goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.String r3 = "BottomSpace"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            int r2 = r2 + 1000
        L24:
            java.lang.String r1 = "feed"
            r3 = 1
            boolean r1 = p000.q02.m4654(r0, r1, r3)
            if (r1 == 0) goto L2f
            int r2 = r2 + 200
        L2f:
            java.lang.String r1 = "bottom"
            boolean r0 = p000.q02.m4654(r0, r1, r3)
            if (r0 == 0) goto L39
            int r2 = r2 + 200
        L39:
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "LIZ"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L53
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "LIZIZ"
            boolean r4 = p000.ln0.m3626(r4, r0)
            if (r4 == 0) goto L52
            goto L53
        L52:
            return r2
        L53:
            int r2 = r2 + 100
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public static int m2089(java.lang.reflect.Method r4) {
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r1 = r4.getDeclaringClass()
            java.lang.String r1 = r1.getSimpleName()
            boolean r2 = m2083(r4)
            if (r2 == 0) goto L19
            r2 = 800(0x320, float:1.121E-42)
            goto L1a
        L19:
            r2 = 0
        L1a:
            java.lang.String r3 = "MainBottomTabViewNew"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            int r2 = r2 + 1000
        L24:
            java.lang.String r1 = "homepage"
            r3 = 1
            boolean r1 = p000.q02.m4654(r0, r1, r3)
            if (r1 == 0) goto L2f
            int r2 = r2 + 200
        L2f:
            java.lang.String r1 = "tab"
            boolean r1 = p000.q02.m4654(r0, r1, r3)
            if (r1 == 0) goto L39
            int r2 = r2 + 200
        L39:
            java.lang.String r1 = "bottom"
            boolean r0 = p000.q02.m4654(r0, r1, r3)
            if (r0 == 0) goto L43
            int r2 = r2 + 200
        L43:
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "LJIIJ"
            boolean r4 = p000.ln0.m3626(r4, r0)
            if (r4 == 0) goto L51
            int r2 = r2 + 300
        L51:
            return r2
    }
}
