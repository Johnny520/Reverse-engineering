package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class uh1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f10811 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f10812 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.List f10813 = null;

    static {
            java.lang.String r0 = "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A2213D6E40D73B64D2CFAB2BF3453CD724F602BB72FC397513878027005AD60AEE524CF1864F51F0DEF2DDE34DD2898511ABD01797C56C3FB142"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572BB3C2A9299E9BCE8825914D3DB8B9F8590905F4E937A431C60F7208EEC85640FA1107547F45B41D607111278821B9052396C905CB55FFAC8A"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620FEAAB3DBAA5CCFF1590144F37A6DE6F2EAA8DBD42A1363F91426A14D158A14EDA2BF"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String r3 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11011259BDF55608B48CC91FD029A4395A8C64B5A72F95D909085133E615B4B3A770D599D5F2BCB790FCEB9014"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.uh1.f10811 = r0
            java.lang.String r0 = "X.C15Z0"
            java.lang.String r1 = "X.15Z0"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.uh1.f10812 = r0
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            p000.uh1.f10813 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5856(java.util.LinkedHashMap r6, java.lang.reflect.Method r7) {
            r0 = 1
            r7.setAccessible(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r7.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r7.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r1 = r7.getParameterTypes()
            r1.getClass()
            cf1 r2 = new cf1
            r3 = 21
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r0 = p000.lz1.m3692(r0, r1, r2, r7)
            r6.put(r0, r7)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m5857(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1e
            java.lang.reflect.Method[] r1 = r2.getDeclaredMethods()
            r1.getClass()
            p000.AbstractC0984xh.m6659(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m5858(java.lang.Class r5, java.lang.String r6) {
        L0:
            r0 = 0
            if (r5 == 0) goto L32
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L32
            java.lang.Class[] r1 = r5.getInterfaces()
            r1.getClass()
            int r2 = r1.length
        L13:
            if (r0 >= r2) goto L2d
            r3 = r1[r0]
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L22
            goto L28
        L22:
            boolean r3 = m5858(r3, r6)
            if (r3 == 0) goto L2a
        L28:
            r5 = 1
            return r5
        L2a:
            int r0 = r0 + 1
            goto L13
        L2d:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L32:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m5859(java.lang.Class r2, java.lang.String r3) {
            java.util.ArrayList r2 = m5857(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            goto L3b
        Lb:
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto Lf
            java.lang.String r1 = r0.getName()
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto Lf
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto Lf
            r2 = 1
            return r2
        L3b:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m5860(java.lang.reflect.Method r13) {
            r13.getClass()
            java.lang.Class r0 = r13.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 0
            if (r0 != 0) goto L12
            goto L1b3
        L12:
            int r0 = r13.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L1e
            goto L1b3
        L1e:
            java.lang.String r0 = r13.getName()
            r0.getClass()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = p000.AbstractC0602nx.m4134(r2, r0, r2)
            java.lang.Class r4 = r13.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = r4.toLowerCase(r2)
            r2.getClass()
            java.lang.Class[] r5 = r13.getParameterTypes()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.length
            r6.<init>(r7)
            int r7 = r5.length
            r8 = r1
        L49:
            r9 = 1
            if (r8 >= r7) goto L53
            r10 = r5[r8]
            int r8 = p000.lz1.m3679(r10, r6, r8, r9)
            goto L49
        L53:
            java.lang.String r7 = "onPlayCompleted"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L8e
            java.lang.String r7 = "beforeNotifyCompletedPlay"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L8e
            java.lang.String r7 = "onPlayCompletedFirst"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L8e
            java.lang.String r7 = "onPlayCompletedFirstTime"
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L8e
            java.lang.String r7 = "onplaycompleted"
            boolean r7 = p000.q02.m4654(r3, r7, r1)
            if (r7 != 0) goto L8e
            java.lang.String r7 = "completedfirst"
            boolean r7 = p000.q02.m4654(r3, r7, r1)
            if (r7 != 0) goto L8e
            java.lang.String r7 = "beforenotifycompletedplay"
            boolean r3 = p000.q02.m4654(r3, r7, r1)
            if (r3 == 0) goto L8c
            goto L8e
        L8c:
            r3 = r1
            goto L8f
        L8e:
            r3 = r9
        L8f:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L97
        L95:
            r6 = r1
            goto Lc7
        L97:
            java.util.Iterator r6 = r6.iterator()
        L9b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L95
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444045E5F45F7E1B2B50D5955DD465C390D2E76F87756154E0D31183F4"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r8 = p000.ln0.m3626(r7, r8)
            if (r8 != 0) goto Lc6
            r7.getClass()
            java.lang.String r8 = "FeedPlayCompletedParam"
            boolean r8 = p000.q02.m4654(r7, r8, r1)
            if (r8 != 0) goto Lc6
            java.lang.String r8 = "PlayCompleted"
            boolean r7 = p000.q02.m4654(r7, r8, r1)
            if (r7 == 0) goto L9b
        Lc6:
            r6 = r9
        Lc7:
            int r7 = r5.length
            r8 = r1
        Lc9:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r8 >= r7) goto Lda
            r11 = r5[r8]
            boolean r11 = p000.ln0.m3626(r11, r10)
            if (r11 == 0) goto Ld7
            r7 = r9
            goto Ldb
        Ld7:
            int r8 = r8 + 1
            goto Lc9
        Lda:
            r7 = r1
        Ldb:
            java.lang.String r8 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572BB3C2A9299E9BCE8825914D3DB8B9F8590905F4E937A431C60F7208EEC85640FA1107547F45B41D607111278821B9052396C905CB55FFAC8A"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L102
            java.lang.String r8 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620FEAAB3DBAA5CCFF1590144F37A6DE6F2EAA8DBD42A1363F91426A14D158A14EDA2BF"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L102
            java.lang.String r8 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11011259BDF55608B48CC91FD029A4395A8C64B5A72F95D909085133E615B4B3A770D599D5F2BCB790FCEB9014"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L100
            goto L102
        L100:
            r8 = r1
            goto L103
        L102:
            r8 = r9
        L103:
            java.lang.String r11 = "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A2213D6E40D73B64D2CFAB2BF3453CD724F602BB72FC397513878027005AD60AEE524CF1864F51F0DEF2DDE34DD2898511ABD01797C56C3FB142"
            java.lang.String r11 = p000.jf0.m2957(r11)
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L167
            java.lang.String r4 = "LJIIJJI"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L122
            int r4 = r5.length
            if (r4 != r9) goto L122
            r4 = r5[r1]
            boolean r4 = p000.ln0.m3626(r4, r10)
            if (r4 != 0) goto L1b2
        L122:
            java.lang.String r4 = "LLILII"
            boolean r4 = r0.equals(r4)
            r11 = 2
            if (r4 == 0) goto L140
            int r4 = r5.length
            if (r4 != r11) goto L140
            r4 = r5[r1]
            java.lang.Class r12 = java.lang.Integer.TYPE
            boolean r4 = p000.ln0.m3626(r4, r12)
            if (r4 == 0) goto L140
            r4 = r5[r9]
            boolean r4 = p000.ln0.m3626(r4, r10)
            if (r4 != 0) goto L1b2
        L140:
            java.lang.String r4 = "LJJIIJZLJL"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L153
            int r4 = r5.length
            if (r4 != r9) goto L153
            r4 = r5[r1]
            boolean r4 = p000.ln0.m3626(r4, r10)
            if (r4 != 0) goto L1b2
        L153:
            java.lang.String r4 = "h5"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L167
            int r0 = r5.length
            if (r0 != r11) goto L167
            r0 = r5[r1]
            boolean r0 = p000.ln0.m3626(r0, r10)
            if (r0 == 0) goto L167
            goto L1b2
        L167:
            java.lang.String r0 = "feedplay"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L18a
            java.lang.String r0 = "onui"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L18a
            java.lang.String r0 = "player"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L18a
            java.lang.String r0 = "playlistener"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 == 0) goto L188
            goto L18a
        L188:
            r0 = r1
            goto L18b
        L18a:
            r0 = r9
        L18b:
            java.lang.Class r13 = r13.getDeclaringClass()
            r13.getClass()
            java.lang.String r2 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56E13C3BB1FAB793F47C4E6BF47D1570A6EF06A1C4AD72C3045F30CB1B2665A2"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r13 = m5858(r13, r2)
            if (r8 == 0) goto L1a3
            if (r3 != 0) goto L1b2
            if (r6 == 0) goto L1a3
            goto L1b2
        L1a3:
            if (r6 == 0) goto L1aa
            if (r0 != 0) goto L1b2
            if (r3 == 0) goto L1aa
            goto L1b2
        L1aa:
            if (r3 == 0) goto L1b3
            if (r7 == 0) goto L1b3
            if (r0 != 0) goto L1b2
            if (r13 == 0) goto L1b3
        L1b2:
            return r9
        L1b3:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m5861(java.lang.Object r7) {
            r0 = 0
            if (r7 != 0) goto L4
            goto L5b
        L4:
            java.lang.Class r7 = r7.getClass()
            java.lang.String r1 = "pause"
            boolean r1 = m5859(r7, r1)
            java.lang.String r2 = "resume"
            boolean r2 = m5859(r7, r2)
            java.lang.String r3 = "stop"
            boolean r3 = m5859(r7, r3)
            r4 = 1
            if (r3 != 0) goto L28
            java.lang.String r3 = "stopPlay"
            boolean r3 = m5859(r7, r3)
            if (r3 == 0) goto L26
            goto L28
        L26:
            r3 = r0
            goto L29
        L28:
            r3 = r4
        L29:
            java.util.ArrayList r7 = m5857(r7)
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L35
        L33:
            r7 = r0
            goto L52
        L35:
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto L33
            java.lang.Object r5 = r7.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "seek"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L39
            r7 = r4
        L52:
            if (r1 == 0) goto L5b
            if (r2 != 0) goto L5a
            if (r3 != 0) goto L5a
            if (r7 == 0) goto L5b
        L5a:
            return r4
        L5b:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static void m5862(org.luckypray.dexkit.DexKitBridge r3, java.lang.ClassLoader r4, java.util.LinkedHashMap r5, java.lang.String r6, java.lang.String... r7) {
            r0 = 0
            th1 r1 = new th1     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r1.<init>(r6, r7, r2)     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.result.MethodDataList r3 = r3.findMethod(r1)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3b
        Lf:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L3d
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L3b
            org.luckypray.dexkit.result.MethodData r7 = (org.luckypray.dexkit.result.MethodData) r7     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Method r7 = r7.getMethodInstance(r4)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r7 = move-exception
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L3b
            r7 = r1
        L27:
            boolean r1 = r7 instanceof p000.eo1     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L2c
            r7 = r0
        L2c:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L3b
            if (r7 != 0) goto L31
            goto Lf
        L31:
            boolean r1 = m5860(r7)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lf
            m5856(r5, r7)     // Catch: java.lang.Throwable -> L3b
            goto Lf
        L3b:
            r3 = move-exception
            goto L40
        L3d:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3b
            goto L46
        L40:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L46:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "query named completed method failed: "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = ", err="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "r5fd016b85524a7fd"
            r5 = 4
            p000.C0888ux.m5988(r4, r3, r0, r5, r0)     // Catch: java.lang.Throwable -> L68
        L68:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.reflect.Method m5863(p000.EnumC0491kx r8, java.lang.Object r9, java.lang.ClassLoader r10, java.util.List r11, java.util.List r12) {
            java.lang.Class r9 = r9.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.List r10 = p000.C0666ox.m4323(r8, r10)
            java.lang.Class r0 = java.lang.Void.TYPE
            r1 = 0
            if (r10 == 0) goto L4d
            java.util.Iterator r10 = r10.iterator()
        L13:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r10.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class r4 = r3.getDeclaringClass()
            boolean r4 = r4.isAssignableFrom(r9)
            if (r4 == 0) goto L13
            java.lang.Class r4 = r3.getReturnType()
            boolean r4 = p000.ln0.m3626(r4, r0)
            if (r4 == 0) goto L13
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L13
            int r3 = r3.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L13
            goto L4a
        L49:
            r2 = r1
        L4a:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            goto L4e
        L4d:
            r2 = r1
        L4e:
            r10 = 1
            if (r2 == 0) goto L55
            r2.setAccessible(r10)
            return r2
        L55:
            java.util.ArrayList r9 = m5857(r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r9.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L62
            java.lang.Class r5 = r4.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r0)
            if (r5 == 0) goto L62
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L62
            r2.add(r3)
            goto L62
        L91:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r2.iterator()
        L9a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L10b
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r3 = r2.getName()
            r3.getClass()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = p000.AbstractC0602nx.m4134(r4, r3, r4)
            boolean r4 = r11.isEmpty()
            r5 = 0
            if (r4 == 0) goto Lbb
            goto Ld8
        Lbb:
            java.util.Iterator r4 = r11.iterator()
        Lbf:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Ld8
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r2.getName()
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto Lbf
            r4 = 120(0x78, float:1.68E-43)
            goto Ld9
        Ld8:
            r4 = r5
        Ld9:
            boolean r6 = r12.isEmpty()
            if (r6 == 0) goto Le0
            goto Lf8
        Le0:
            java.util.Iterator r6 = r12.iterator()
        Le4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lf8
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = p000.q02.m4654(r3, r7, r5)
            if (r7 == 0) goto Le4
            int r4 = r4 + 60
        Lf8:
            if (r4 <= 0) goto L104
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            l91 r4 = new l91
            r4.<init>(r2, r3)
            goto L105
        L104:
            r4 = r1
        L105:
            if (r4 == 0) goto L9a
            r9.add(r4)
            goto L9a
        L10b:
            ib1 r11 = new ib1
            r12 = 18
            r11.<init>(r12)
            java.util.List r9 = p000.AbstractC0984xh.m6658(r9, r11)
            java.lang.Object r9 = p000.AbstractC0984xh.m6640(r9)
            l91 r9 = (p000.l91) r9
            if (r9 == 0) goto L132
            java.lang.Object r9 = r9.f6502
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 != 0) goto L125
            goto L132
        L125:
            r9.setAccessible(r10)
            java.lang.Object r10 = p000.C0666ox.f8297
            java.util.List r10 = p000.AbstractC1021yh.m6896(r9)
            p000.C0666ox.m4327(r8, r10)
            return r9
        L132:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m5864(java.lang.ClassLoader r4) {
            r4.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6210
            java.util.List r1 = p000.C0666ox.m4321(r1, r4)
            if (r1 != 0) goto L14
            jz r1 = p000.C0450jz.f5672
        L14:
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.String r3 = r2.getName()
            r0.put(r3, r2)
            goto L18
        L2c:
            java.util.List r1 = p000.uh1.f10813
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = p000.AbstractC0093bx.m1082(r4, r2)
            if (r2 != 0) goto L45
            goto L32
        L45:
            java.lang.String r3 = r2.getName()
            r0.put(r3, r2)
            goto L32
        L4d:
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m5865(java.lang.ClassLoader r7) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r1 = p000.uh1.f10811
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = p000.AbstractC0093bx.m1082(r7, r2)
            if (r2 != 0) goto L1e
            goto Lb
        L1e:
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L27:
            if (r4 >= r3) goto Lb
            r5 = r2[r4]
            r5.getClass()
            boolean r6 = m5860(r5)
            if (r6 == 0) goto L37
            m5856(r0, r5)
        L37:
            int r4 = r4 + 1
            goto L27
        L3a:
            java.util.Collection r7 = r0.values()
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6666(r7)
            return r7
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.List m5866(java.lang.ClassLoader r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6208
            java.util.List r2 = p000.C0666ox.m4323(r1, r4)
            if (r2 != 0) goto L11
            jz r2 = p000.C0450jz.f5672
        L11:
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            m5856(r0, r3)
            goto L15
        L25:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L39
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
        L39:
            java.util.List r2 = m5865(r4)
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            m5856(r0, r3)
            goto L41
        L51:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L77
            java.lang.Object r4 = p000.C0666ox.f8297
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            p000.C0666ox.m4327(r1, r4)
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
        L77:
            java.lang.Object r2 = p000.C0666ox.f8297
            t20 r2 = new t20
            r3 = 24
            r2.<init>(r4, r3)
            java.lang.String r3 = "扫描播放完成回调方法"
            java.util.List r4 = p000.C0666ox.m4316(r1, r4, r3, r2)
            java.util.Iterator r4 = r4.iterator()
        L8a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            m5856(r0, r1)
            goto L8a
        L9a:
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
    }
}
