package p000;

/* JADX INFO: renamed from: kh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0469kh {

    /* JADX INFO: renamed from: α */
    public static final p000.C0469kh f5917 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f5918 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.List f5919 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile boolean f5920;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f5921 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f5922 = null;

    /* JADX INFO: renamed from: η */
    public static volatile p000.C0359hh f5923;

    static {
            kh r0 = new kh
            r0.<init>()
            p000.C0469kh.f5917 = r0
            java.lang.String r7 = "getPlayHost"
            java.lang.String r8 = "setPlayHost"
            java.lang.String r1 = "tryResumePlay"
            java.lang.String r2 = "tryPlay"
            java.lang.String r3 = "tryPlay PlayDataWrapper"
            java.lang.String r4 = "tryPlayWithInitialStart"
            java.lang.String r5 = "tryPrepareNext"
            java.lang.String r6 = "isPrepared = "
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.C0469kh.f5918 = r0
            java.lang.String r5 = "tryPlayWithInitialStart 3"
            java.lang.String r6 = "tryPlayWithInitialStart1"
            java.lang.String r1 = "tryResumePlay"
            java.lang.String r2 = "tryPlay"
            java.lang.String r3 = "tryPlay PlayDataWrapper"
            java.lang.String r4 = "tryPlayWithInitialStart"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.C0469kh.f5919 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.C0469kh.f5921 = r0
            java.util.concurrent.ConcurrentHashMap.newKeySet()
            java.util.concurrent.ConcurrentHashMap.newKeySet()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.C0469kh.f5922 = r0
            java.util.concurrent.ConcurrentHashMap.newKeySet()
            java.util.concurrent.ConcurrentHashMap.newKeySet()
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.reflect.Method m3251(java.lang.Class r2, java.lang.String r3) {
            java.lang.reflect.Method[] r0 = r2.getMethods()
            r0.getClass()
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
            r2.getClass()
            ss1 r2 = p000.AbstractC0312g7.m2232(r2)
            c40 r2 = p000.us1.m5946(r0, r2)
            s9 r0 = new s9
            r1 = 4
            r0.<init>(r3, r1)
            y30 r3 = new y30
            r1 = 1
            r3.<init>(r2, r1, r0)
            gh r2 = new gh
            r0 = 3
            r2.<init>(r0)
            bu r0 = new bu
            java.util.Iterator r3 = r3.iterator()
            r0.<init>(r3, r2)
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 != 0) goto L3d
            goto L47
        L3d:
            java.lang.Object r2 = r0.next()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L48
        L47:
            r2 = r3
        L48:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L50
            r2.setAccessible(r1)
            return r2
        L50:
            return r3
    }

    /* JADX INFO: renamed from: β */
    public static void m3252(java.util.List r6) {
            java.util.Iterator r6 = r6.iterator()
        L4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r6.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r1 = m3261(r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.C0469kh.f5921
            boolean r3 = r2.add(r1)
            if (r3 == 0) goto L4
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L43
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L43
            h r4 = new h     // Catch: java.lang.Throwable -> L43
            r5 = 11
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L43
            r3.m6775(r0, r4)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "r2aa3ccfd32411e22"
            r0.append(r3)     // Catch: java.lang.Throwable -> L43
            r0.append(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L43
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L43
            goto L4a
        L43:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L4a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4
            r2.remove(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "r34c597cd38fc5889"
            p000.AbstractC0602nx.m4121(r2, r1, r0)
            goto L4
        L5d:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.List m3253(p000.EnumC0491kx r2, java.lang.ClassLoader r3) {
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0666ox.f8305
            boolean r0 = r0.get()
            jz r1 = p000.C0450jz.f5672
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.util.List r3 = p000.C0666ox.m4323(r2, r3)     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L1c
            r3 = r1
            goto L1c
        L15:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L1c:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 != 0) goto L24
            r1 = r3
            goto L2f
        L24:
            java.lang.String r2 = r2.f6296
            java.lang.String r3 = r0.getMessage()
            java.lang.String r0 = "rda9cf57d154274ea"
            p000.AbstractC0602nx.m4121(r0, r2, r3)
        L2f:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static p000.C0395ih m3254() {
            hh r0 = p000.C0469kh.f5923
            r1 = 0
            if (r0 != 0) goto L6
            goto L18
        L6:
            java.lang.ref.WeakReference r2 = r0.f4731
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto Lf
            goto L18
        Lf:
            java.lang.reflect.Method r3 = r0.f4733
            if (r3 != 0) goto L14
            goto L18
        L14:
            java.lang.reflect.Method r0 = r0.f4734
            if (r0 != 0) goto L19
        L18:
            return r1
        L19:
            java.lang.Object r3 = r3.invoke(r2, r1)     // Catch: java.lang.Throwable -> L24
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto L52
        L26:
            r3 = r1
        L27:
            if (r3 == 0) goto L50
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L24
            boolean r2 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L38
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L24
            goto L39
        L38:
            r0 = r1
        L39:
            if (r0 == 0) goto L50
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L24
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L50
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L4a
            goto L50
        L4a:
            ih r0 = new ih     // Catch: java.lang.Throwable -> L24
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L24
            goto L58
        L50:
            r0 = r1
            goto L58
        L52:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L58:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 == 0) goto L69
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "r18067f9ea08da666"
            java.lang.String r4 = "rc90e47ff78acb49f"
            p000.AbstractC0602nx.m4143(r3, r2, r4)
        L69:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L6e
            goto L6f
        L6e:
            r1 = r0
        L6f:
            ih r1 = (p000.C0395ih) r1
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static java.util.List m3255(java.lang.ClassLoader r9) {
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB94312851DBF90DE22E29AC5FA85873739BB209E3F8E8F8E"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.Class r9 = p000.qe0.m4877(r9, r0)     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r9 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L14:
            boolean r0 = r9 instanceof p000.eo1
            if (r0 == 0) goto L19
            r9 = 0
        L19:
            java.lang.Class r9 = (java.lang.Class) r9
            jz r0 = p000.C0450jz.f5672
            if (r9 != 0) goto L20
            return r0
        L20:
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L6f
            r9.getClass()     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            int r2 = r9.length     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            r4 = r3
        L2f:
            r5 = 1
            if (r4 >= r2) goto L74
            r6 = r9[r4]     // Catch: java.lang.Throwable -> L6f
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r8 = "post"
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L71
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L6f
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L71
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L6f
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L71
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L6f
            int r7 = r7.length     // Catch: java.lang.Throwable -> L6f
            if (r7 != r5) goto L71
            java.lang.Class[] r5 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L6f
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r5 = p000.ln0.m3626(r5, r7)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L71
            r1.add(r6)     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r9 = move-exception
            goto Lb4
        L71:
            int r4 = r4 + 1
            goto L2f
        L74:
            java.util.Iterator r9 = r1.iterator()     // Catch: java.lang.Throwable -> L6f
        L78:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L88
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L6f
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L6f
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L6f
            goto L78
        L88:
            java.util.HashSet r9 = new java.util.HashSet     // Catch: java.lang.Throwable -> L6f
            r9.<init>()     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r2.<init>()     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6f
        L96:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6f
            if (r3 == 0) goto Lb9
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6f
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L6f
            r4.getClass()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = m3261(r4)     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r9.add(r4)     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L96
            r2.add(r3)     // Catch: java.lang.Throwable -> L6f
            goto L96
        Lb4:
            eo1 r2 = new eo1
            r2.<init>(r9)
        Lb9:
            java.lang.Throwable r9 = p000.fo1.m2190(r2)
            if (r9 != 0) goto Lc1
            r0 = r2
            goto Lca
        Lc1:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r1 = "rd0a8709765132844"
            p000.AbstractC0602nx.m4142(r1, r9)
        Lca:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.ArrayList m3256(java.lang.ClassLoader r8) {
            java.util.ArrayList r8 = m3257(r8)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Ld:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r8.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L69
            r2.getClass()     // Catch: java.lang.Throwable -> L69
            int r3 = r2.length     // Catch: java.lang.Throwable -> L69
            r4 = 0
        L22:
            if (r4 >= r3) goto L89
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L69
            r6.getClass()     // Catch: java.lang.Throwable -> L69
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L69
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> L69
            r6.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.Class[] r7 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L69
            r7.getClass()     // Catch: java.lang.Throwable -> L69
            int r7 = r7.length     // Catch: java.lang.Throwable -> L69
            if (r7 != 0) goto L86
            java.lang.String r7 = "resume"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 != 0) goto L6b
            java.lang.String r7 = "resumeplay"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 != 0) goto L6b
            java.lang.String r7 = "play"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 != 0) goto L6b
            java.lang.String r7 = "startplay"
            boolean r7 = r6.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r7 != 0) goto L6b
            java.lang.String r7 = "restartplay"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L86
            goto L6b
        L69:
            r2 = move-exception
            goto L8c
        L6b:
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L69
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L86
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L69
            boolean r6 = java.lang.reflect.Modifier.isAbstract(r6)     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L86
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L69
            r0.add(r5)     // Catch: java.lang.Throwable -> L69
        L86:
            int r4 = r4 + 1
            goto L22
        L89:
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L69
            goto L92
        L8c:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L92:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto Ld
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r2.getMessage()
            java.lang.String r3 = "rea3e065ae01ffb29"
            p000.AbstractC0602nx.m4121(r3, r1, r2)
            goto Ld
        La7:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m3261(r3)
            boolean r3 = r8.add(r3)
            if (r3 == 0) goto Lb5
            r1.add(r2)
            goto Lb5
        Ld0:
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.ArrayList m3257(java.lang.ClassLoader r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r1 = p000.qe0.m4877(r4, r1)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            boolean r1 = r0.add(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1c
            goto L26
        L1c:
            r1 = move-exception
            goto L20
        L1e:
            r1 = 0
            goto L26
        L20:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L26:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L35
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "r9234c76795e87c7c"
            p000.AbstractC0602nx.m4142(r2, r1)
        L35:
            java.util.List r4 = p000.uh1.m5864(r4)     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4d
        L3d:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L4d
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L4d
            r0.add(r1)     // Catch: java.lang.Throwable -> L4d
            goto L3d
        L4d:
            r4 = move-exception
            goto L52
        L4f:
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4d
            goto L58
        L52:
            eo1 r1 = new eo1
            r1.<init>(r4)
            r4 = r1
        L58:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L67
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "r3d0421893c10d7ed"
            p000.AbstractC0602nx.m4142(r1, r4)
        L67:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L70:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L89
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            int r2 = m3260(r2)
            r3 = 500(0x1f4, float:7.0E-43)
            if (r2 < r3) goto L70
            r4.add(r1)
            goto L70
        L89:
            tf r0 = new tf
            r1 = 3
            r0.<init>(r1)
            java.util.List r4 = p000.AbstractC0984xh.m6658(r4, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        La1:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r4.next()
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto La1
            r1.add(r2)
            goto La1
        Lbc:
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static void m3258(p000.EnumC0491kx r1, java.util.List r2) {
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L2f
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0666ox.f8305
            boolean r0 = r0.get()
            if (r0 != 0) goto L11
            goto L2f
        L11:
            p000.C0666ox.m4327(r1, r2)     // Catch: java.lang.Throwable -> L17
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L1e:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L2f
            java.lang.String r1 = r1.f6296
            java.lang.String r2 = r2.getMessage()
            java.lang.String r0 = "rcf859c7511d447ef"
            p000.AbstractC0602nx.m4121(r0, r1, r2)
        L2f:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static int m3259(java.lang.Class r8) {
            java.lang.String r0 = r8.getName()
            java.lang.String r1 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto L14
            r1 = 2000(0x7d0, float:2.803E-42)
            goto L15
        L14:
            r1 = r2
        L15:
            java.lang.String r3 = ".feed.controller."
            boolean r3 = p000.q02.m4654(r0, r3, r2)
            if (r3 == 0) goto L1f
            int r1 = r1 + 300
        L1f:
            java.lang.String r3 = "FeedPlayerWrapper"
            boolean r0 = p000.q02.m4654(r0, r3, r2)
            if (r0 == 0) goto L29
            int r1 = r1 + 500
        L29:
            java.lang.Class[] r0 = r8.getInterfaces()
            r0.getClass()
            int r3 = r0.length
            r4 = r2
        L32:
            if (r4 >= r3) goto L59
            r5 = r0[r4]
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963AF392C9B2B9E9BAA7A7377F1B689B86E188"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L48
            int r1 = r1 + 1500
        L48:
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r6 = "IPlayerManager"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L56
            int r1 = r1 + 500
        L56:
            int r4 = r4 + 1
            goto L32
        L59:
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L75
            r8.getClass()     // Catch: java.lang.Throwable -> L75
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L75
            int r3 = r8.length     // Catch: java.lang.Throwable -> L75
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L75
            int r3 = r8.length     // Catch: java.lang.Throwable -> L75
        L67:
            if (r2 >= r3) goto L77
            r4 = r8[r2]     // Catch: java.lang.Throwable -> L75
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L75
            r0.add(r4)     // Catch: java.lang.Throwable -> L75
            int r2 = r2 + 1
            goto L67
        L75:
            r8 = move-exception
            goto L7c
        L77:
            java.util.Set r8 = p000.AbstractC0984xh.m6671(r0)     // Catch: java.lang.Throwable -> L75
            goto L82
        L7c:
            eo1 r0 = new eo1
            r0.<init>(r8)
            r8 = r0
        L82:
            boolean r0 = r8 instanceof p000.eo1
            if (r0 == 0) goto L88
            nz r8 = p000.C0604nz.f7825
        L88:
            java.util.Set r8 = (java.util.Set) r8
            java.lang.String r0 = "isPlaying"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L94
            int r1 = r1 + 300
        L94:
            java.lang.String r0 = "resumePlay"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L9e
            int r1 = r1 + 300
        L9e:
            java.lang.String r0 = "stopPlay"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto La8
            int r1 = r1 + 200
        La8:
            java.lang.String r0 = "getCurrentPosition"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto Lb2
            int r1 = r1 + 150
        Lb2:
            java.lang.String r0 = "getDuration"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto Lbc
            int r1 = r1 + 150
        Lbc:
            java.lang.String r0 = "setOnUIPlayListener"
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto Lc6
            int r1 = r1 + 150
        Lc6:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static int m3260(java.lang.Class r2) {
            int r2 = m3259(r2)     // Catch: java.lang.Throwable -> L9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L10:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r2 instanceof p000.eo1
            if (r1 == 0) goto L1a
            r2 = r0
        L1a:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m3261(java.lang.reflect.Method r7) {
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r7.getName()
            java.lang.Class[] r2 = r7.getParameterTypes()
            r2.getClass()
            gh r3 = new gh
            r4 = 0
            r3.<init>(r4)
            r4 = 30
            java.lang.String r5 = ","
            r6 = 0
            java.lang.String r2 = p000.AbstractC0312g7.m2256(r2, r5, r6, r3, r4)
            java.lang.Class r7 = r7.getReturnType()
            java.lang.String r7 = r7.getName()
            java.lang.String r3 = "#"
            java.lang.String r4 = "("
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r3, r1, r4, r2)
            java.lang.String r1 = "):"
            java.lang.String r7 = p000.lz1.m3691(r0, r1, r7)
            return r7
    }

    /* JADX INFO: renamed from: γ */
    public final void m3262(java.lang.reflect.Method r6, boolean r7, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = "r320d77a27e522e3c"
            int r1 = r6.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto Ld
            goto L61
        Ld:
            int r1 = r6.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 == 0) goto L18
            goto L61
        L18:
            java.lang.String r1 = m3261(r6)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.C0469kh.f5921
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto L25
            goto L61
        L25:
            r3 = 1
            r6.setAccessible(r3)     // Catch: java.lang.Throwable -> L48
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L48
            jh r4 = new jh     // Catch: java.lang.Throwable -> L48
            r4.<init>(r5, r7, r8, r1)     // Catch: java.lang.Throwable -> L48
            r3.m6775(r6, r4)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L48
            r5.append(r7)     // Catch: java.lang.Throwable -> L48
            r5.append(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L48
            p000.C0888ux.m5985(r5)     // Catch: java.lang.Throwable -> L48
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L48
            goto L4f
        L48:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L4f:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L61
            r2.remove(r1)
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "r432cb82eaad5bec3"
            p000.AbstractC0602nx.m4121(r6, r1, r5)
        L61:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m3263(java.lang.Class r9) {
            r8 = this;
            s62 r0 = p000.s62.f9751
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.C0469kh.f5922
            java.lang.String r2 = r9.getName()
            r1.add(r2)
            r1 = 0
            java.lang.reflect.Method[] r2 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L30
            r2.getClass()     // Catch: java.lang.Throwable -> L30
            int r3 = r2.length     // Catch: java.lang.Throwable -> L30
            r4 = r1
        L15:
            if (r4 >= r3) goto L51
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "pause"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L32
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L30
            r6.getClass()     // Catch: java.lang.Throwable -> L30
            int r6 = r6.length     // Catch: java.lang.Throwable -> L30
            if (r6 != 0) goto L32
            goto L48
        L30:
            r2 = move-exception
            goto L53
        L32:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "pausePlay"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L4e
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L30
            r6.getClass()     // Catch: java.lang.Throwable -> L30
            int r6 = r6.length     // Catch: java.lang.Throwable -> L30
            if (r6 != 0) goto L4e
        L48:
            java.lang.String r6 = "wrapper-current-known-pause"
            r7 = 1
            r8.m3262(r5, r7, r6)     // Catch: java.lang.Throwable -> L30
        L4e:
            int r4 = r4 + 1
            goto L15
        L51:
            r3 = r0
            goto L58
        L53:
            eo1 r3 = new eo1
            r3.<init>(r2)
        L58:
            java.lang.Throwable r2 = p000.fo1.m2190(r3)
            if (r2 == 0) goto L6b
            java.lang.String r3 = r9.getName()
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = "rbc0beb26e2996b06"
            p000.AbstractC0602nx.m4121(r4, r3, r2)
        L6b:
            java.lang.reflect.Method[] r2 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L94
            r2.getClass()     // Catch: java.lang.Throwable -> L94
            int r3 = r2.length     // Catch: java.lang.Throwable -> L94
            r4 = r1
        L74:
            if (r4 >= r3) goto L9e
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = "resumePlay"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L96
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L94
            r6.getClass()     // Catch: java.lang.Throwable -> L94
            int r6 = r6.length     // Catch: java.lang.Throwable -> L94
            if (r6 != 0) goto L96
            java.lang.String r6 = "wrapper-current-known-play"
            r8.m3262(r5, r1, r6)     // Catch: java.lang.Throwable -> L94
            goto L96
        L94:
            r8 = move-exception
            goto L99
        L96:
            int r4 = r4 + 1
            goto L74
        L99:
            eo1 r0 = new eo1
            r0.<init>(r8)
        L9e:
            java.lang.Throwable r8 = p000.fo1.m2190(r0)
            if (r8 == 0) goto Lb1
            java.lang.String r9 = r9.getName()
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "r7886db979930b2d0"
            p000.AbstractC0602nx.m4121(r0, r9, r8)
        Lb1:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m3264(java.lang.ClassLoader r7) {
            r6 = this;
            r7.getClass()
            r0 = 0
            java.util.List r1 = r6.m3267(r7, r0)     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L90
        Lc:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L90
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L90
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = p000.C0469kh.f5922     // Catch: java.lang.Throwable -> L90
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L90
            r4.add(r5)     // Catch: java.lang.Throwable -> L90
            r6.m3263(r3)     // Catch: java.lang.Throwable -> L90
            goto Lc
        L25:
            java.util.List r2 = r6.m3265(r7, r0)     // Catch: java.lang.Throwable -> L90
            m3252(r2)     // Catch: java.lang.Throwable -> L90
            java.util.List r6 = r6.m3266(r7, r0)     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = "dexkit-play-method"
            java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Throwable -> L90
        L36:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L48
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L90
            kh r5 = p000.C0469kh.f5917     // Catch: java.lang.Throwable -> L90
            r5.m3262(r4, r0, r7)     // Catch: java.lang.Throwable -> L90
            goto L36
        L48:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L90
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r1, r0)     // Catch: java.lang.Throwable -> L90
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L90
        L57:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L90
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L90
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L90
            r7.add(r1)     // Catch: java.lang.Throwable -> L90
            goto L57
        L6b:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L90
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "r10c386e7c649a115"
            r1.append(r2)     // Catch: java.lang.Throwable -> L90
            r1.append(r7)     // Catch: java.lang.Throwable -> L90
            r1.append(r0)     // Catch: java.lang.Throwable -> L90
            r1.append(r6)     // Catch: java.lang.Throwable -> L90
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L90
            p000.C0888ux.m5985(r6)     // Catch: java.lang.Throwable -> L90
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L90
            goto L97
        L90:
            r6 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L97:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto La6
            java.lang.String r6 = r6.getMessage()
            java.lang.String r7 = "r9ea6606899eff01"
            p000.AbstractC0602nx.m4142(r7, r6)
        La6:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final java.util.List m3265(java.lang.ClassLoader r6, boolean r7) {
            r5 = this;
            kx r0 = p000.EnumC0491kx.f6265
            java.util.List r1 = m3253(r0, r6)
            boolean r2 = r1.isEmpty()
            r3 = 1
            if (r2 != 0) goto L4b
            java.util.Iterator r5 = r1.iterator()
        L11:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L21
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r3)
            goto L11
        L21:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = m3261(r1)
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto L2f
            r6.add(r0)
            goto L2f
        L4a:
            return r6
        L4b:
            java.util.List r1 = m3255(r6)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L59
            m3258(r0, r1)
            return r1
        L59:
            jz r1 = p000.C0450jz.f5672
            if (r7 == 0) goto Lce
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L68
            goto Lce
        L68:
            java.lang.String r7 = "定位清爽模式播放暂停事件分发方法"
            bb r2 = new bb     // Catch: java.lang.Throwable -> L76
            r4 = 9
            r2.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L76
            java.util.List r5 = p000.C0666ox.m4316(r0, r6, r7, r2)     // Catch: java.lang.Throwable -> L76
            goto L7d
        L76:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L7d:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto L85
            r1 = r5
            goto L8e
        L85:
            java.lang.String r5 = r6.getMessage()
            java.lang.String r6 = "rb9739b67638cb29f"
            p000.AbstractC0602nx.m4142(r6, r5)
        L8e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r5 = r1.iterator()
        L94:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La4
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r3)
            goto L94
        La4:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        Lb2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcd
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = m3261(r1)
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto Lb2
            r6.add(r0)
            goto Lb2
        Lcd:
            return r6
        Lce:
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public final java.util.List m3266(java.lang.ClassLoader r6, boolean r7) {
            r5 = this;
            kx r0 = p000.EnumC0491kx.f6266
            java.util.List r1 = m3253(r0, r6)
            boolean r2 = r1.isEmpty()
            r3 = 1
            if (r2 != 0) goto L4b
            java.util.Iterator r5 = r1.iterator()
        L11:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L21
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r3)
            goto L11
        L21:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = m3261(r1)
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto L2f
            r6.add(r0)
            goto L2f
        L4a:
            return r6
        L4b:
            java.util.ArrayList r1 = m3256(r6)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L59
            m3258(r0, r1)
            return r1
        L59:
            jz r1 = p000.C0450jz.f5672
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L68
            goto Lcd
        L68:
            java.lang.String r7 = "定位清爽模式播放恢复方法"
            wa r2 = new wa     // Catch: java.lang.Throwable -> L75
            r4 = 4
            r2.<init>(r5, r4, r6)     // Catch: java.lang.Throwable -> L75
            java.util.List r5 = p000.C0666ox.m4316(r0, r6, r7, r2)     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L7c:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto L84
            r1 = r5
            goto L8d
        L84:
            java.lang.String r5 = r6.getMessage()
            java.lang.String r6 = "rd8a83d4d65199fe1"
            p000.AbstractC0602nx.m4142(r6, r5)
        L8d:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r5 = r1.iterator()
        L93:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La3
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r6.setAccessible(r3)
            goto L93
        La3:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        Lb1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = m3261(r1)
            boolean r1 = r5.add(r1)
            if (r1 == 0) goto Lb1
            r6.add(r0)
            goto Lb1
        Lcc:
            return r6
        Lcd:
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public final java.util.List m3267(java.lang.ClassLoader r6, boolean r7) {
            r5 = this;
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0666ox.f8305
            boolean r0 = r0.get()
            kx r1 = p000.EnumC0491kx.f6264
            jz r2 = p000.C0450jz.f5672
            if (r0 != 0) goto L10
            r0 = r2
            goto L32
        L10:
            java.util.List r0 = p000.C0666ox.m4321(r1, r6)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1f
            r0 = r2
            goto L1f
        L18:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L1f:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 != 0) goto L26
            goto L30
        L26:
            java.lang.String r0 = r3.getMessage()
            java.lang.String r3 = "red6fb7ef6039f68clean_mode_feed_player_wrapper_classes"
            p000.AbstractC0602nx.m4142(r3, r0)
            r0 = r2
        L30:
            java.util.List r0 = (java.util.List) r0
        L32:
            boolean r3 = r0.isEmpty()
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 != 0) goto L8e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r0.iterator()
        L43:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            r0 = r7
            java.lang.Class r0 = (java.lang.Class) r0
            int r0 = m3260(r0)
            if (r0 < r4) goto L43
            r5.add(r7)
            goto L43
        L5a:
            tf r6 = new tf
            r7 = 4
            r6.<init>(r7)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r5, r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r6.add(r1)
            if (r1 == 0) goto L72
            r7.add(r0)
            goto L72
        L8d:
            return r7
        L8e:
            java.util.ArrayList r0 = m3257(r6)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lc6
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto Lc5
            java.lang.Object r5 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.C0666ox.f8305
            boolean r5 = r5.get()
            if (r5 != 0) goto La9
            goto Lc5
        La9:
            p000.C0666ox.m4325(r1, r0)     // Catch: java.lang.Throwable -> Laf
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> Laf
            goto Lb6
        Laf:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        Lb6:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto Lc5
            java.lang.String r5 = r5.getMessage()
            java.lang.String r6 = "rc2ebd6802e2b99adclean_mode_feed_player_wrapper_classes"
            p000.AbstractC0602nx.m4142(r6, r5)
        Lc5:
            return r0
        Lc6:
            if (r7 == 0) goto L150
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto Ld4
            goto L150
        Ld4:
            java.lang.String r7 = "定位清爽模式播放控制器"
            bb r0 = new bb     // Catch: java.lang.Throwable -> Le2
            r3 = 10
            r0.<init>(r6, r5, r3)     // Catch: java.lang.Throwable -> Le2
            java.util.List r5 = p000.C0666ox.m4314(r1, r6, r7, r0)     // Catch: java.lang.Throwable -> Le2
            goto Le9
        Le2:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        Le9:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto Lf1
            r2 = r5
            goto Lfa
        Lf1:
            java.lang.String r5 = r6.getMessage()
            java.lang.String r6 = "r89f247f5e3e34ef8"
            p000.AbstractC0602nx.m4142(r6, r5)
        Lfa:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r2.iterator()
        L105:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L11c
            java.lang.Object r7 = r6.next()
            r0 = r7
            java.lang.Class r0 = (java.lang.Class) r0
            int r0 = m3260(r0)
            if (r0 < r4) goto L105
            r5.add(r7)
            goto L105
        L11c:
            tf r6 = new tf
            r7 = 5
            r6.<init>(r7)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r5, r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L134:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L14f
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            boolean r1 = r6.add(r1)
            if (r1 == 0) goto L134
            r7.add(r0)
            goto L134
        L14f:
            return r7
        L150:
            return r2
    }
}
