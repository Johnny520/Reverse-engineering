package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l82 {

    /* JADX INFO: renamed from: α */
    public static final p000.l82 f6483 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f6484 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.ThreadLocal f6485 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f6486 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object f6487 = null;

    /* JADX INFO: renamed from: ζ */
    public static final android.os.Handler f6488 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicLong f6489 = null;

    /* JADX INFO: renamed from: θ */
    public static volatile long f6490;

    /* JADX INFO: renamed from: ι */
    public static volatile long f6491;

    /* JADX INFO: renamed from: κ */
    public static volatile p000.i82 f6492;

    /* JADX INFO: renamed from: λ */
    public static volatile java.lang.ClassLoader f6493;

    static {
            l82 r0 = new l82
            r0.<init>()
            p000.l82.f6483 = r0
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE0AE615CE280772922D63B5F8A7251BD40F9CB4512B8F0072E7"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.l82.f6484 = r0
            b01 r0 = new b01
            r1 = 4
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            p000.l82.f6485 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.l82.f6486 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.l82.f6487 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.l82.f6488 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.l82.f6489 = r0
            r0 = -9223372036854775808
            p000.l82.f6491 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m3534(float r13) {
            java.lang.Object r0 = p000.l82.f6487
            monitor-enter(r0)
            i82 r1 = p000.l82.f6492     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto Lb
            monitor-exit(r0)
        L9:
            r4 = r2
            goto L22
        Lb:
            java.lang.ref.WeakReference r3 = r1.f4959     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L1a
            p000.l82.f6492 = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            goto L9
        L17:
            r13 = move-exception
            goto L20c
        L1a:
            j82 r4 = new j82     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r1 = r1.f4960     // Catch: java.lang.Throwable -> L17
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
        L22:
            if (r4 != 0) goto L18a
            java.lang.String r0 = "r6024182e27de5477"
            java.lang.ClassLoader r1 = p000.l82.f6493
            r3 = 0
            if (r1 != 0) goto L2e
        L2b:
            r4 = r2
            goto L187
        L2e:
            java.util.List r4 = p000.l82.f6484
            java.util.Iterator r4 = r4.iterator()
        L34:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L180
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r5 = p000.qe0.m4877(r1, r5)
            if (r5 != 0) goto L47
            goto L34
        L47:
            java.lang.reflect.Method r6 = m3536(r5)
            if (r6 != 0) goto L4e
            goto L34
        L4e:
            java.lang.reflect.Field[] r7 = r5.getDeclaredFields()
            r7.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r7.length
            r10 = r3
        L5c:
            if (r10 >= r9) goto L70
            r11 = r7[r10]
            int r12 = r11.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 == 0) goto L6d
            r8.add(r11)
        L6d:
            int r10 = r10 + 1
            goto L5c
        L70:
            java.util.Iterator r7 = r8.iterator()
        L74:
            boolean r9 = r7.hasNext()
            r10 = 1
            if (r9 == 0) goto La0
            java.lang.Object r9 = r7.next()
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            r9.setAccessible(r10)     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.get(r2)     // Catch: java.lang.Throwable -> L89
            goto L90
        L89:
            r9 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L90:
            boolean r10 = r9 instanceof p000.eo1
            if (r10 == 0) goto L95
            r9 = r2
        L95:
            if (r9 != 0) goto L98
            goto L74
        L98:
            boolean r10 = r5.isInstance(r9)
            if (r10 == 0) goto L74
            goto L165
        La0:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        La9:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lca
            java.lang.Object r9 = r8.next()
            r11 = r9
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            java.lang.Class r11 = r11.getType()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "kotlin.Lazy"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto La9
            r7.add(r9)
            goto La9
        Lca:
            java.util.Iterator r7 = r7.iterator()
        Lce:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L10f
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            r8.setAccessible(r10)     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r8 = r8.get(r2)     // Catch: java.lang.Throwable -> Le2
            goto Le9
        Le2:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        Le9:
            boolean r9 = r8 instanceof p000.eo1
            if (r9 == 0) goto Lee
            r8 = r2
        Lee:
            if (r8 != 0) goto Lf1
            goto Lce
        Lf1:
            java.lang.String r9 = "getValue"
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lfa
            java.lang.Object r8 = p000.qe0.m4869(r8, r9, r11)     // Catch: java.lang.Throwable -> Lfa
            goto L101
        Lfa:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L101:
            boolean r9 = r8 instanceof p000.eo1
            if (r9 == 0) goto L107
            r9 = r2
            goto L108
        L107:
            r9 = r8
        L108:
            boolean r8 = r5.isInstance(r9)
            if (r8 == 0) goto Lce
            goto L165
        L10f:
            java.lang.reflect.Method[] r7 = r5.getMethods()
            r7.getClass()
            ss1 r7 = p000.AbstractC0312g7.m2232(r7)
            java.lang.reflect.Method[] r8 = r5.getDeclaredMethods()
            r8.getClass()
            ss1 r8 = p000.AbstractC0312g7.m2232(r8)
            c40 r7 = p000.us1.m5946(r7, r8)
            t00 r8 = new t00
            r9 = 10
            r8.<init>(r5, r9)
            y30 r9 = new y30
            r9.<init>(r7, r10, r8)
            j72 r7 = new j72
            r8 = 15
            r7.<init>(r8)
            cu r8 = new cu
            r10 = 0
            r8.<init>(r9, r10, r7)
            j72 r7 = new j72
            r9 = 16
            r7.<init>(r9)
            y30 r7 = p000.us1.m5943(r8, r7)
            x30 r8 = new x30
            r8.<init>(r7)
        L152:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L164
            java.lang.Object r7 = r8.next()
            boolean r9 = r5.isInstance(r7)
            if (r9 == 0) goto L152
            r9 = r7
            goto L165
        L164:
            r9 = r2
        L165:
            if (r9 != 0) goto L169
            goto L34
        L169:
            m3535(r6, r9)
            java.lang.String r1 = r5.getName()
            java.lang.String r4 = "resolved current player from host singleton: "
            java.lang.String r1 = r4.concat(r1)
            p000.C0888ux.m5975(r0, r1)
            j82 r0 = new j82
            r0.<init>(r6, r9)
            r4 = r0
            goto L187
        L180:
            java.lang.String r1 = "host current player singleton unavailable"
            p000.C0888ux.m5975(r0, r1)
            goto L2b
        L187:
            if (r4 != 0) goto L18a
            return r3
        L18a:
            java.lang.ThreadLocal r0 = p000.l82.f6485     // Catch: java.lang.Throwable -> L1a6
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1a6
            r0.set(r1)     // Catch: java.lang.Throwable -> L1a6
            java.lang.reflect.Method r3 = r4.f5362     // Catch: java.lang.Throwable -> L1a8
            java.lang.Object r5 = r4.f5361     // Catch: java.lang.Throwable -> L1a8
            java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch: java.lang.Throwable -> L1a8
            java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L1a8
            r3.invoke(r5, r13)     // Catch: java.lang.Throwable -> L1a8
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1a6
            r0.set(r13)     // Catch: java.lang.Throwable -> L1a6
            goto L1b6
        L1a6:
            r13 = move-exception
            goto L1b1
        L1a8:
            r13 = move-exception
            java.lang.ThreadLocal r0 = p000.l82.f6485     // Catch: java.lang.Throwable -> L1a6
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1a6
            r0.set(r1)     // Catch: java.lang.Throwable -> L1a6
            throw r13     // Catch: java.lang.Throwable -> L1a6
        L1b1:
            eo1 r1 = new eo1
            r1.<init>(r13)
        L1b6:
            java.lang.Throwable r13 = p000.fo1.m2190(r1)
            if (r13 == 0) goto L1fe
            java.lang.Object r0 = p000.l82.f6487
            monitor-enter(r0)
            i82 r3 = p000.l82.f6492     // Catch: java.lang.Throwable -> L1ca
            if (r3 == 0) goto L1cc
            java.lang.ref.WeakReference r5 = r3.f4959     // Catch: java.lang.Throwable -> L1ca
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L1ca
            goto L1cd
        L1ca:
            r13 = move-exception
            goto L1fc
        L1cc:
            r5 = r2
        L1cd:
            java.lang.Object r6 = r4.f5361     // Catch: java.lang.Throwable -> L1ca
            if (r5 != r6) goto L1dd
            java.lang.reflect.Method r3 = r3.f4960     // Catch: java.lang.Throwable -> L1ca
            java.lang.reflect.Method r4 = r4.f5362     // Catch: java.lang.Throwable -> L1ca
            boolean r3 = p000.ln0.m3626(r3, r4)     // Catch: java.lang.Throwable -> L1ca
            if (r3 == 0) goto L1dd
            p000.l82.f6492 = r2     // Catch: java.lang.Throwable -> L1ca
        L1dd:
            monitor-exit(r0)
            java.lang.Throwable r0 = r13.getCause()
            if (r0 != 0) goto L1e5
            goto L1e6
        L1e5:
            r13 = r0
        L1e6:
            java.lang.String r0 = "r6024182e27de5477"
            java.lang.Class r2 = r13.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r13 = r13.getMessage()
            java.lang.String r3 = "set current video speed failed: "
            java.lang.String r4 = ": "
            p000.AbstractC0602nx.m4144(r3, r2, r4, r13, r0)
            goto L1fe
        L1fc:
            monitor-exit(r0)
            throw r13
        L1fe:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            boolean r0 = r1 instanceof p000.eo1
            if (r0 == 0) goto L205
            r1 = r13
        L205:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = r1.booleanValue()
            return r13
        L20c:
            monitor-exit(r0)
            throw r13
    }

    /* JADX INFO: renamed from: β */
    public static void m3535(java.lang.reflect.Method r3, java.lang.Object r4) {
            r4.getClass()
            r3.getClass()
            java.lang.Class r0 = r3.getDeclaringClass()
            boolean r0 = r0.isInstance(r4)
            if (r0 != 0) goto L11
            goto L40
        L11:
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L40
            java.lang.Class[] r0 = r3.getParameterTypes()
            r2 = 0
            r0 = r0[r2]
            java.lang.Class r2 = java.lang.Float.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L29
            goto L40
        L29:
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L2c
        L2c:
            java.lang.Object r0 = p000.l82.f6487
            monitor-enter(r0)
            i82 r1 = new i82     // Catch: java.lang.Throwable -> L3d
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L3d
            p000.l82.f6492 = r1     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)
            return
        L3d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L40:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.reflect.Method m3536(java.lang.Class r3) {
            java.lang.reflect.Method[] r0 = r3.getMethods()
            r0.getClass()
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            r3.getClass()
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            c40 r3 = p000.us1.m5946(r0, r3)
            j72 r0 = new j72
            r1 = 13
            r0.<init>(r1)
            y30 r1 = new y30
            r2 = 1
            r1.<init>(r3, r2, r0)
            j72 r3 = new j72
            r0 = 14
            r3.<init>(r0)
            bu r0 = new bu
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1, r3)
            boolean r3 = r0.hasNext()
            r1 = 0
            if (r3 != 0) goto L3f
            goto L49
        L3f:
            java.lang.Object r3 = r0.next()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4a
        L49:
            r3 = r1
        L4a:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L52
            r3.setAccessible(r2)
            return r3
        L52:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Float m3537() {
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "global_video_speed"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ld
            float r1 = r2.getFloat(r1, r0)     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1a:
            boolean r2 = r1 instanceof p000.eo1
            r3 = 0
            if (r2 == 0) goto L20
            r1 = r3
        L20:
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L3e
            float r2 = r1.floatValue()
            float r4 = java.lang.Math.abs(r2)
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L3e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L3e
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L3e
            r3 = r1
        L3e:
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m3538(java.lang.Object r2, java.lang.String r3) {
            r0 = 0
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Field r3 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L18
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L18
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L18
            goto L22
        L18:
            r2 = move-exception
            goto L1c
        L1a:
            r2 = r0
            goto L22
        L1c:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L22:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m3539(java.lang.ClassLoader r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            r2.getClass()
            p000.l82.f6493 = r2
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = p000.l82.f6486
            int r4 = java.lang.System.identityHashCode(r2)
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E111E5057B4FC455FA29A8C52DD30A87961CC4190963A91D26B00402EEF12A5B8AD70E093D5FE91A1B0FDF2881E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r5 = p000.qe0.m4877(r2, r0)
            java.lang.String r6 = "(float)"
            java.lang.Class r7 = java.lang.Float.TYPE
            java.lang.String r8 = "setSpeed"
            java.lang.String r10 = "r6024182e27de5477"
            java.lang.String r11 = "#"
            java.lang.String r12 = ":"
            if (r5 != 0) goto L2b
            goto L126
        L2b:
            java.lang.reflect.Method[] r0 = r5.getDeclaredMethods()
            r0.getClass()
            int r15 = r0.length
            r9 = 0
        L34:
            if (r9 >= r15) goto L52
            r16 = r0[r9]
            java.lang.String r13 = r16.getName()
            java.lang.String r14 = "LJZ"
            boolean r13 = p000.ln0.m3626(r13, r14)
            if (r13 == 0) goto L4f
            java.lang.Class[] r13 = r16.getParameterTypes()
            int r13 = r13.length
            r14 = 1
            if (r13 != r14) goto L4f
            r0 = r16
            goto L53
        L4f:
            int r9 = r9 + 1
            goto L34
        L52:
            r0 = 0
        L53:
            if (r0 != 0) goto L57
            goto L126
        L57:
            java.lang.Class r9 = r0.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r13 = r0.getName()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r4)
            r14.append(r12)
            r14.append(r9)
            r14.append(r11)
            r14.append(r13)
            java.lang.String r9 = "/play"
            r14.append(r9)
            java.lang.String r9 = r14.toString()
            boolean r13 = r3.add(r9)
            if (r13 != 0) goto L88
            goto L126
        L88:
            r14 = 1
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> L9a
            xq0 r13 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L9a
            py1 r14 = new py1     // Catch: java.lang.Throwable -> L9a
            r15 = 17
            r14.<init>(r15, r1)     // Catch: java.lang.Throwable -> L9a
            l01 r0 = r13.m6775(r0, r14)     // Catch: java.lang.Throwable -> L9a
            goto La1
        L9a:
            r0 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r0)
            r0 = r13
        La1:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Lb3
            r3.remove(r9)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r9 = "play lifecycle hook failed: "
            p000.AbstractC0602nx.m4143(r9, r0, r10)
        Lb3:
            java.lang.Class[] r0 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> Lc0
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r8, r0)     // Catch: java.lang.Throwable -> Lc0
            r14 = 1
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> Lc0
            goto Lc7
        Lc0:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        Lc7:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto Lcc
            r0 = 0
        Lcc:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto Ld1
            goto L126
        Ld1:
            java.lang.Class r5 = r0.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r9 = r0.getName()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r13.append(r12)
            r13.append(r5)
            r13.append(r11)
            r13.append(r9)
            r13.append(r6)
            java.lang.String r4 = r13.toString()
            boolean r5 = r3.add(r4)
            if (r5 != 0) goto Lff
            goto L126
        Lff:
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L10d
            xe r9 = new xe     // Catch: java.lang.Throwable -> L10d
            r13 = 12
            r9.<init>(r13, r1, r0)     // Catch: java.lang.Throwable -> L10d
            l01 r0 = r5.m6775(r0, r9)     // Catch: java.lang.Throwable -> L10d
            goto L114
        L10d:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L114:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L126
            r3.remove(r4)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "play ability speed hook failed: "
            p000.AbstractC0602nx.m4143(r3, r0, r10)
        L126:
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = p000.l82.f6486
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.Object r4 = p000.qe0.f8982
            java.lang.String r4 = "~78D3ECFA63DB52E5A19E9BAEB1F7800A11F1EB5A04E5B7A2213D6E40D73B64D2CFAB2BF3453CD724F602B86EF825744FD99B260256C001FD1011C5B043588EF6C0D4E35AF5B8851CB0E10693FA6B35B142"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.Class r4 = p000.qe0.m4877(r2, r4)
            if (r4 != 0) goto L13c
            goto L1c0
        L13c:
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            r4.getClass()
            int r5 = r4.length
            r9 = 0
        L145:
            if (r9 >= r5) goto L161
            r13 = r4[r9]
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "LJJIJL"
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto L15e
            java.lang.Class[] r14 = r13.getParameterTypes()
            int r14 = r14.length
            r15 = 1
            if (r14 != r15) goto L15e
            goto L162
        L15e:
            int r9 = r9 + 1
            goto L145
        L161:
            r13 = 0
        L162:
            if (r13 != 0) goto L165
            goto L1c0
        L165:
            java.lang.Class r4 = r13.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r13.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r12)
            r9.append(r4)
            r9.append(r11)
            r9.append(r5)
            java.lang.String r0 = "/speed-request"
            r9.append(r0)
            java.lang.String r4 = r9.toString()
            boolean r0 = r3.add(r4)
            if (r0 != 0) goto L195
            goto L1c0
        L195:
            r14 = 1
            r13.setAccessible(r14)     // Catch: java.lang.Throwable -> L1a7
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1a7
            py1 r5 = new py1     // Catch: java.lang.Throwable -> L1a7
            r9 = 19
            r5.<init>(r9, r1)     // Catch: java.lang.Throwable -> L1a7
            l01 r0 = r0.m6775(r13, r5)     // Catch: java.lang.Throwable -> L1a7
            goto L1ae
        L1a7:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L1ae:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L1c0
            r3.remove(r4)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "speed provider hook failed: "
            p000.AbstractC0602nx.m4143(r1, r0, r10)
        L1c0:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.l82.f6486
            int r3 = java.lang.System.identityHashCode(r2)
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~78162BCF42A1422BC9A8F0FB9BD072868F9DD7B58CBAAEB1FF2611FE54EA54BCFFC411896B36A19282EAD587A0F23E9210D7BBB066747F33B2DD9D1BB1BBDEE11EA147D72415A1115C97831A7761059A5EDB3BBE3BF12B01E80A04840272FF71"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r4 = p000.qe0.m4877(r2, r0)
            if (r4 != 0) goto L1d6
            goto L242
        L1d6:
            java.lang.String r0 = "onRenderFirstFrame"
            java.lang.String r5 = "onResumePlay"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5}
            r9 = 0
        L1df:
            r0 = 2
            if (r9 >= r0) goto L242
            r13 = r5[r9]
            java.lang.String r0 = r4.getName()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            r14.append(r12)
            r14.append(r0)
            r14.append(r11)
            r14.append(r13)
            java.lang.String r0 = "/global-speed"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            boolean r0 = r1.add(r14)
            if (r0 == 0) goto L23b
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L21d
            py1 r15 = new py1     // Catch: java.lang.Throwable -> L21d
            r17 = r3
            r3 = 18
            r15.<init>(r3)     // Catch: java.lang.Throwable -> L21b
            java.util.Set r0 = r0.m6774(r4, r13, r15)     // Catch: java.lang.Throwable -> L21b
            goto L226
        L21b:
            r0 = move-exception
            goto L220
        L21d:
            r0 = move-exception
            r17 = r3
        L220:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L226:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L23d
            r1.remove(r14)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "speed listener hook failed: "
            java.lang.String r14 = ": "
            p000.AbstractC0602nx.m4144(r3, r13, r14, r0, r10)
            goto L23d
        L23b:
            r17 = r3
        L23d:
            int r9 = r9 + 1
            r3 = r17
            goto L1df
        L242:
            int r1 = java.lang.System.identityHashCode(r2)
            java.util.List r0 = p000.l82.f6484
            java.util.Iterator r3 = r0.iterator()
        L24c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2ed
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = p000.qe0.m4877(r2, r0)
            if (r0 != 0) goto L260
            r14 = 1
            goto L24c
        L260:
            java.lang.Class[] r4 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L26f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r8, r4)     // Catch: java.lang.Throwable -> L26f
            r14 = 1
            r0.setAccessible(r14)     // Catch: java.lang.Throwable -> L26d
            goto L277
        L26d:
            r0 = move-exception
            goto L271
        L26f:
            r0 = move-exception
            r14 = 1
        L271:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L277:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L27c
            r0 = 0
        L27c:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L281
            goto L24c
        L281:
            java.lang.Class r4 = r0.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r0.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r12)
            r9.append(r4)
            r9.append(r11)
            r9.append(r5)
            r9.append(r6)
            java.lang.String r4 = r9.toString()
            java.util.concurrent.ConcurrentHashMap$KeySetView r5 = p000.l82.f6486
            boolean r5 = r5.add(r4)
            if (r5 == 0) goto L24c
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2be
            xe r9 = new xe     // Catch: java.lang.Throwable -> L2be
            r13 = 11
            r9.<init>(r13, r0)     // Catch: java.lang.Throwable -> L2be
            l01 r0 = r5.m6775(r0, r9)     // Catch: java.lang.Throwable -> L2be
            goto L2c5
        L2be:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L2c5:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 != 0) goto L2d5
            r5 = r0
            l01 r5 = (p000.l01) r5
            java.lang.String r5 = "current player hook installed: "
            java.lang.String r5 = r5.concat(r4)
            p000.C0888ux.m5975(r10, r5)
        L2d5:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L24c
            java.util.concurrent.ConcurrentHashMap$KeySetView r5 = p000.l82.f6486
            r5.remove(r4)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r5 = "current player hook failed: "
            java.lang.String r9 = ", "
            p000.AbstractC0602nx.m4144(r5, r4, r9, r0, r10)
            goto L24c
        L2ed:
            return
    }
}
