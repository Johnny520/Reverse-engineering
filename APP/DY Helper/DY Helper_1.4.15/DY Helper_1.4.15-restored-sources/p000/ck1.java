package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ck1 {

    /* JADX INFO: renamed from: α */
    public static final p000.ck1 f2177 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f2178 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f2179 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.CopyOnWriteArrayList f2180 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Set f2181 = null;

    static {
            ck1 r0 = new ck1
            r0.<init>()
            p000.ck1.f2177 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.ck1.f2178 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.ck1.f2179 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.ck1.f2180 = r0
            java.lang.String r0 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C71358804495460988BC309E79107C904005381417879B5B03919102E2F4DDA294DD2ECA50F1F6BB81A3482872"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "com.p771ss.android.ugc.aweme.tools.external.hometab.bottom.PublishButton"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.ck1.f2181 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1246(java.util.LinkedHashSet r10, org.luckypray.dexkit.result.ClassDataList r11, java.lang.ClassLoader r12) {
            java.util.Iterator r11 = r11.iterator()
        L4:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r11.next()
            r1 = 0
            if (r0 != 0) goto L13
            goto L7c
        L13:
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L1c
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            goto L7c
        L1c:
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L51
            r2.getClass()     // Catch: java.lang.Throwable -> L51
            int r3 = r2.length     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r5 = r4
        L2a:
            r6 = 1
            if (r5 >= r3) goto L56
            r7 = r2[r5]     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L51
            java.lang.String r9 = "getInstance"
            boolean r8 = p000.ln0.m3626(r8, r9)     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L53
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L51
            int r8 = r8.length     // Catch: java.lang.Throwable -> L51
            if (r8 != r6) goto L53
            java.lang.Class<java.lang.ClassLoader> r8 = java.lang.ClassLoader.class
            java.lang.Class[] r9 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L51
            r9 = r9[r4]     // Catch: java.lang.Throwable -> L51
            boolean r8 = r8.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L53
            goto L57
        L51:
            r0 = move-exception
            goto L6e
        L53:
            int r5 = r5 + 1
            goto L2a
        L56:
            r7 = r1
        L57:
            if (r7 != 0) goto L5a
            goto L7c
        L5a:
            r7.setAccessible(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r2 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r7.invoke(r0, r2)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r0 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L6c
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L51
            goto L74
        L6c:
            r0 = r1
            goto L74
        L6e:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L74:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L79
            goto L7a
        L79:
            r1 = r0
        L7a:
            java.lang.Class r1 = (java.lang.Class) r1
        L7c:
            if (r1 == 0) goto L4
            r10.add(r1)
            goto L4
        L82:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1247(java.util.LinkedHashSet r13, org.luckypray.dexkit.result.MethodDataList r14, java.lang.ClassLoader r15) {
            java.util.Iterator r14 = r14.iterator()
        L4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r14.next()
            r1 = 0
            if (r0 != 0) goto L14
        L11:
            r0 = r1
            goto L98
        L14:
            boolean r2 = r0 instanceof java.lang.reflect.Method
            if (r2 == 0) goto L1c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L98
        L1c:
            java.lang.String r2 = "getMethodInstance"
            java.lang.String r3 = "getInstance"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            r3 = 0
            r4 = r3
        L26:
            r5 = 2
            if (r4 >= r5) goto L11
            r5 = r2[r4]
            r6 = 1
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.reflect.Method[] r7 = r7.getMethods()     // Catch: java.lang.Throwable -> L5d
            r7.getClass()     // Catch: java.lang.Throwable -> L5d
            int r8 = r7.length     // Catch: java.lang.Throwable -> L5d
            r9 = r3
        L39:
            if (r9 >= r8) goto L62
            r10 = r7[r9]     // Catch: java.lang.Throwable -> L5d
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> L5d
            boolean r11 = p000.ln0.m3626(r11, r5)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L5f
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L5d
            int r11 = r11.length     // Catch: java.lang.Throwable -> L5d
            if (r11 != r6) goto L5f
            java.lang.Class<java.lang.ClassLoader> r11 = java.lang.ClassLoader.class
            java.lang.Class[] r12 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L5d
            r12 = r12[r3]     // Catch: java.lang.Throwable -> L5d
            boolean r11 = r11.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L5d
            if (r11 == 0) goto L5f
            goto L69
        L5d:
            r5 = move-exception
            goto L64
        L5f:
            int r9 = r9 + 1
            goto L39
        L62:
            r10 = r1
            goto L69
        L64:
            eo1 r10 = new eo1
            r10.<init>(r5)
        L69:
            boolean r5 = r10 instanceof p000.eo1
            if (r5 == 0) goto L6e
            r10 = r1
        L6e:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 == 0) goto L95
            r10.setAccessible(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object[] r5 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r5 = r10.invoke(r0, r5)     // Catch: java.lang.Throwable -> L7e
            goto L85
        L7e:
            r5 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r5)
            r5 = r7
        L85:
            boolean r7 = r5 instanceof p000.eo1
            if (r7 == 0) goto L8a
            r5 = r1
        L8a:
            boolean r7 = r5 instanceof java.lang.reflect.Method
            if (r7 == 0) goto L95
            r0 = r5
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r6)
            goto L98
        L95:
            int r4 = r4 + 1
            goto L26
        L98:
            if (r0 == 0) goto L9e
            java.lang.Class r1 = r0.getDeclaringClass()
        L9e:
            if (r1 == 0) goto L4
            r13.add(r1)
            goto L4
        La5:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m1248(java.lang.Class r7) {
            r0 = 0
            r1 = 1
            java.lang.reflect.Method[] r2 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> L1f
            r2.getClass()     // Catch: java.lang.Throwable -> L1f
            int r3 = r2.length     // Catch: java.lang.Throwable -> L1f
            r4 = r0
        Lb:
            if (r4 >= r3) goto L1f
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L1f
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L1f
            boolean r6 = java.lang.reflect.Modifier.isAbstract(r6)     // Catch: java.lang.Throwable -> L1f
            if (r6 != 0) goto L1c
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L1f
        L1c:
            int r4 = r4 + 1
            goto Lb
        L1f:
            java.lang.reflect.Constructor[] r2 = r7.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L32
            r2.getClass()     // Catch: java.lang.Throwable -> L32
            int r3 = r2.length     // Catch: java.lang.Throwable -> L32
            r4 = r0
        L28:
            if (r4 >= r3) goto L32
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L32
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            int r4 = r4 + 1
            goto L28
        L32:
            java.lang.reflect.Field[] r7 = r7.getDeclaredFields()     // Catch: java.lang.Throwable -> L44
            r7.getClass()     // Catch: java.lang.Throwable -> L44
            int r2 = r7.length     // Catch: java.lang.Throwable -> L44
        L3a:
            if (r0 >= r2) goto L44
            r3 = r7[r0]     // Catch: java.lang.Throwable -> L44
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L44
            int r0 = r0 + 1
            goto L3a
        L44:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1249(java.lang.Class r1) {
            int r1 = m1251(r1)
            r0 = 3500(0xdac, float:4.905E-42)
            if (r1 < r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static void m1250(java.lang.String r11, java.util.ArrayList r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L9:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r12.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = m1249(r2)
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L20:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r12.add(r3)
            if (r3 == 0) goto L2e
            r1.add(r2)
            goto L2e
        L49:
            boolean r12 = r1.isEmpty()
            if (r12 == 0) goto L50
            goto L9b
        L50:
            java.lang.Object r12 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L5a
            kx r12 = p000.EnumC0491kx.f6242     // Catch: java.lang.Throwable -> L5a
            p000.C0666ox.m4325(r12, r1)     // Catch: java.lang.Throwable -> L5a
            s62 r12 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5a
            goto L62
        L5a:
            r0 = move-exception
            r12 = r0
            eo1 r0 = new eo1
            r0.<init>(r12)
            r12 = r0
        L62:
            java.lang.Throwable r0 = p000.fo1.m2190(r12)
            r8 = 4
            java.lang.String r9 = "recea7c01f66b9d4e"
            r10 = 0
            if (r0 == 0) goto L79
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "保存 PublishButton 缓存失败: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            p000.C0888ux.m5988(r9, r0, r10, r8, r10)
        L79:
            boolean r0 = r12 instanceof p000.eo1
            if (r0 != 0) goto L9b
            s62 r12 = (p000.s62) r12
            li1 r6 = new li1
            r12 = 11
            r6.<init>(r12)
            r7 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r12 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "保存 PublishButton 缓存成功 reason="
            java.lang.String r1 = " classes="
            java.lang.String r11 = p000.a12.m18(r0, r11, r1, r12)
            p000.C0888ux.m5988(r9, r11, r10, r8, r10)
        L9b:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static int m1251(java.lang.Class r10) {
            java.lang.String r0 = r10.getName()
            java.lang.String r1 = r10.getSimpleName()
            java.util.Set r2 = p000.ck1.f2181
            boolean r2 = r2.contains(r0)
            r3 = 0
            if (r2 == 0) goto L14
            r2 = 10000(0x2710, float:1.4013E-41)
            goto L15
        L14:
            r2 = r3
        L15:
            java.lang.String r4 = ".tools.external.hometab.bottom.PublishButton"
            boolean r4 = p000.x02.m6479(r0, r4, r3)
            if (r4 == 0) goto L1f
            int r2 = r2 + 8000
        L1f:
            java.lang.String r4 = "PublishButton"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L29
            int r2 = r2 + 6000
        L29:
            java.lang.String r1 = "hometab.bottom"
            r4 = 1
            boolean r0 = p000.q02.m4654(r0, r1, r4)
            if (r0 == 0) goto L34
            int r2 = r2 + 2000
        L34:
            java.lang.Class<android.view.View> r0 = android.view.View.class
            boolean r1 = r0.isAssignableFrom(r10)
            if (r1 == 0) goto L3e
            int r2 = r2 + 3000
        L3e:
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            boolean r1 = r1.isAssignableFrom(r10)
            if (r1 == 0) goto L48
            int r2 = r2 + 800
        L48:
            java.lang.reflect.Field[] r1 = r10.getDeclaredFields()     // Catch: java.lang.Throwable -> L90
            r1.getClass()     // Catch: java.lang.Throwable -> L90
            int r5 = r1.length     // Catch: java.lang.Throwable -> L90
            r6 = r3
        L51:
            if (r6 >= r5) goto L90
            r7 = r1[r6]     // Catch: java.lang.Throwable -> L90
            java.lang.Class r7 = r7.getType()     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = "~79380C0D9D92A341B10DD9D9D717B3F6D9BECA2C1FC1CA5E3D5453A5C175BACF5588D47D8EC6D23A9B847F"
            java.lang.String r8 = p000.jf0.m2957(r8)     // Catch: java.lang.Throwable -> L90
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Throwable -> L90
            if (r8 == 0) goto L6b
            int r2 = r2 + 1200
        L6b:
            java.lang.String r8 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA5CE999999CB4FFD39B60A13EE96CCFBB8D744843102723"
            java.lang.String r8 = p000.jf0.m2957(r8)     // Catch: java.lang.Throwable -> L90
            boolean r8 = r7.equals(r8)     // Catch: java.lang.Throwable -> L90
            if (r8 == 0) goto L79
            int r2 = r2 + 1200
        L79:
            java.lang.String r8 = "SmartImageView"
            boolean r8 = p000.q02.m4654(r7, r8, r3)     // Catch: java.lang.Throwable -> L90
            if (r8 == 0) goto L83
            int r2 = r2 + 600
        L83:
            java.lang.String r8 = "RemoteImageView"
            boolean r7 = p000.q02.m4654(r7, r8, r3)     // Catch: java.lang.Throwable -> L90
            if (r7 == 0) goto L8d
            int r2 = r2 + 600
        L8d:
            int r6 = r6 + 1
            goto L51
        L90:
            java.lang.reflect.Method[] r1 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> Ld9
            r1.getClass()     // Catch: java.lang.Throwable -> Ld9
            int r5 = r1.length     // Catch: java.lang.Throwable -> Ld9
            r6 = r3
        L99:
            if (r6 >= r5) goto Ld9
            r7 = r1[r6]     // Catch: java.lang.Throwable -> Ld9
            java.lang.Class r8 = r7.getReturnType()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> Ld9
            java.lang.Class r9 = r7.getReturnType()     // Catch: java.lang.Throwable -> Ld9
            boolean r9 = r0.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> Ld9
            if (r9 == 0) goto Lb1
            int r2 = r2 + 300
        Lb1:
            java.lang.String r9 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56E23528BEF6A6D8F4365635F06E153F85F13F9DE7EF43D63D4510CB1F3C75A3"
            java.lang.String r9 = p000.jf0.m2957(r9)     // Catch: java.lang.Throwable -> Ld9
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> Ld9
            if (r8 == 0) goto Lbf
            int r2 = r2 + 800
        Lbf:
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> Ld9
            int r8 = r8.length     // Catch: java.lang.Throwable -> Ld9
            if (r8 != r4) goto Ld6
            java.lang.Class[] r7 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> Ld9
            r7 = r7[r3]     // Catch: java.lang.Throwable -> Ld9
            java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> Ld9
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> Ld9
            if (r7 == 0) goto Ld6
            int r2 = r2 + 200
        Ld6:
            int r6 = r6 + 1
            goto L99
        Ld9:
            java.lang.reflect.Constructor[] r10 = r10.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L108
            r10.getClass()     // Catch: java.lang.Throwable -> L108
            int r0 = r10.length     // Catch: java.lang.Throwable -> L108
            r1 = r3
        Le2:
            if (r1 >= r0) goto L108
            r4 = r10[r1]     // Catch: java.lang.Throwable -> L108
            java.lang.Class[] r4 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L108
            r4.getClass()     // Catch: java.lang.Throwable -> L108
            int r5 = r4.length     // Catch: java.lang.Throwable -> L108
            r6 = r3
        Lef:
            if (r6 >= r5) goto L105
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L108
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L108
            java.lang.String r8 = "android.content.Context"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L108
            if (r7 == 0) goto L102
            int r2 = r2 + 500
            goto L105
        L102:
            int r6 = r6 + 1
            goto Lef
        L105:
            int r1 = r1 + 1
            goto Le2
        L108:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m1252(java.lang.ClassLoader r6) {
            r5 = this;
            r6.getClass()
            r0 = 0
            java.util.ArrayList r5 = r5.m1253(r6, r0)
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = p000.ck1.f2179
            java.lang.String r1 = r6.getName()
            r0.add(r1)
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.ck1.f2180
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r6)     // Catch: java.lang.Throwable -> L39
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L39
            goto L40
        L39:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L40:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L27
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "notifyResolved failed: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 4
            java.lang.String r3 = "recea7c01f66b9d4e"
            r4 = 0
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)
            goto L27
        L58:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList m1253(java.lang.ClassLoader r16, boolean r17) {
            r15 = this;
            r1 = r16
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6242
            java.util.List r0 = p000.C0666ox.m4321(r2, r1)
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = p000.ck1.f2179
            if (r0 == 0) goto L7a
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L15
            goto L7a
        L15:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = m1249(r2)
            if (r2 == 0) goto L1e
            r15.add(r1)
            goto L1e
        L35:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r15 = r15.iterator()
        L43:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r15.next()
            r4 = r2
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L43
            r1.add(r2)
            goto L43
        L5e:
            java.util.Iterator r15 = r1.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r15.next()
            java.lang.Class r0 = (java.lang.Class) r0
            m1248(r0)
            java.lang.String r0 = r0.getName()
            r3.add(r0)
            goto L62
        L79:
            return r1
        L7a:
            java.util.Set r0 = p000.ck1.f2181
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L87:
            boolean r0 = r5.hasNext()
            r6 = 0
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r7, r1)     // Catch: java.lang.Throwable -> L9a
            goto La1
        L9a:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        La1:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto La6
            goto La7
        La6:
            r6 = r0
        La7:
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto L87
            r4.add(r6)
            goto L87
        Laf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lb8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lcf
            java.lang.Object r5 = r4.next()
            r7 = r5
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r7 = m1249(r7)
            if (r7 == 0) goto Lb8
            r0.add(r5)
            goto Lb8
        Lcf:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ldd:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto Lf8
            java.lang.Object r7 = r0.next()
            r8 = r7
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.String r8 = r8.getName()
            boolean r8 = r4.add(r8)
            if (r8 == 0) goto Ldd
            r5.add(r7)
            goto Ldd
        Lf8:
            java.util.Iterator r0 = r5.iterator()
        Lfc:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L113
            java.lang.Object r4 = r0.next()
            java.lang.Class r4 = (java.lang.Class) r4
            m1248(r4)
            java.lang.String r4 = r4.getName()
            r3.add(r4)
            goto Lfc
        L113:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L11e
            java.lang.String r0 = "reflection_fallback"
            m1250(r0, r5)
        L11e:
            if (r17 != 0) goto L121
            goto L129
        L121:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0666ox.f8305
            boolean r0 = r0.get()
            if (r0 != 0) goto L12a
        L129:
            return r5
        L12a:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r4)
            r4 = 4
            java.lang.String r7 = "recea7c01f66b9d4e"
            if (r0 == 0) goto L141
            java.lang.String r15 = "主线程不执行 DexKit 扫描，使用 reflection fallback"
            p000.C0888ux.m5988(r7, r15, r6, r4, r6)
            return r5
        L141:
            m3 r0 = new m3     // Catch: java.lang.Throwable -> L14f
            r8 = 8
            r0.<init>(r5, r15, r1, r8)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r15 = "定位底栏发布按钮"
            java.util.List r15 = p000.C0666ox.m4314(r2, r1, r15, r0)     // Catch: java.lang.Throwable -> L14f
            goto L157
        L14f:
            r0 = move-exception
            r15 = r0
            eo1 r0 = new eo1
            r0.<init>(r15)
            r15 = r0
        L157:
            java.lang.Throwable r0 = p000.fo1.m2190(r15)
            if (r0 == 0) goto L16a
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "DexKit resolve PublishButton failed: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            p000.C0888ux.m5988(r7, r0, r6, r4, r6)
        L16a:
            boolean r0 = r15 instanceof p000.eo1
            if (r0 == 0) goto L16f
            r15 = r6
        L16f:
            java.util.List r15 = (java.util.List) r15
            if (r15 != 0) goto L175
            jz r15 = p000.C0450jz.f5672
        L175:
            java.util.ArrayList r15 = p000.AbstractC0984xh.m6651(r15, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r15 = r15.iterator()
        L182:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L199
            java.lang.Object r1 = r15.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = m1249(r2)
            if (r2 == 0) goto L182
            r0.add(r1)
            goto L182
        L199:
            ib1 r15 = new ib1
            r1 = 24
            r15.<init>(r1)
            java.util.List r15 = p000.AbstractC0984xh.m6658(r0, r15)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r15 = r15.iterator()
        L1b2:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L1cd
            java.lang.Object r1 = r15.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = r0.add(r2)
            if (r2 == 0) goto L1b2
            r8.add(r1)
            goto L1b2
        L1cd:
            java.util.Iterator r15 = r8.iterator()
        L1d1:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L1e8
            java.lang.Object r0 = r15.next()
            java.lang.Class r0 = (java.lang.Class) r0
            m1248(r0)
            java.lang.String r0 = r0.getName()
            r3.add(r0)
            goto L1d1
        L1e8:
            boolean r15 = r8.isEmpty()
            if (r15 == 0) goto L1f4
            java.lang.String r15 = "PublishButton 未定位"
            p000.C0888ux.m5988(r7, r15, r6, r4, r6)
            goto L213
        L1f4:
            java.lang.String r15 = "final_result"
            m1250(r15, r8)
            li1 r13 = new li1
            r15 = 10
            r13.<init>(r15)
            r14 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r15 = p000.AbstractC0984xh.m6644(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = "PublishButton 定位成功: "
            java.lang.String r15 = r0.concat(r15)
            p000.C0888ux.m5988(r7, r15, r6, r4, r6)
        L213:
            return r8
    }
}
