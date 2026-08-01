package p000;

/* JADX INFO: renamed from: bb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0071bb implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1598;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f1599;

    public /* synthetic */ C0071bb(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f1598 = r2
            r0.f1599 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0071bb(java.lang.ClassLoader r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f1598 = r3
            r0.f1599 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m831(java.lang.Object r8) {
            r7 = this;
            org.luckypray.dexkit.DexKitBridge r8 = (org.luckypray.dexkit.DexKitBridge) r8
            r8.getClass()
            yl r0 = p000.C1025yl.f12669
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String r1 = "~78BF3716A2F49FBB709742322D9206C6AF9F18144C2A2123893F917FD9A67DE75E87F835F5066DD2C20FA2028DA408323F4FAF162C0F9F8650E8E7270A57AFBA395C73DBE2F9D1A4C5B8"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB572EB9CAA062808381972FC64C3DABAEB2071701EBE921AE26D62D7F00E3C85643E31111547B42BE1A7D660631EA17BD042F86CB05D259E1A595"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            java.lang.ClassLoader r3 = r7.f1599
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            s9 r4 = new s9     // Catch: java.lang.Throwable -> L64
            r5 = 15
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L64
            org.luckypray.dexkit.result.MethodDataList r4 = r8.findMethod(r4)     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L64
        L41:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r5 == 0) goto L66
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L64
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5     // Catch: java.lang.Throwable -> L64
            java.lang.reflect.Method r5 = r5.getMethodInstance(r3)     // Catch: java.lang.Throwable -> L52
            goto L59
        L52:
            r5 = move-exception
            eo1 r6 = new eo1     // Catch: java.lang.Throwable -> L64
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L64
            r5 = r6
        L59:
            boolean r6 = r5 instanceof p000.eo1     // Catch: java.lang.Throwable -> L64
            if (r6 == 0) goto L5e
            r5 = 0
        L5e:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L64
            p000.C1025yl.m6924(r0, r5)     // Catch: java.lang.Throwable -> L64
            goto L41
        L64:
            r3 = move-exception
            goto L69
        L66:
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L64
            goto L6f
        L69:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L6f:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L24
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "DexKit query failed for "
            java.lang.String r5 = ": "
            java.lang.String r6 = "r931d7e30ef229d29"
            p000.AbstractC0602nx.m4144(r4, r2, r5, r3, r6)
            goto L24
        L83:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto La1
            java.util.ArrayList r7 = p000.C1025yl.m6931(r3)
            java.util.Iterator r7 = r7.iterator()
        L91:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La1
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            p000.C1025yl.m6924(r0, r8)
            goto L91
        La1:
            java.util.Collection r7 = r0.values()
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = p000.AbstractC0984xh.m6666(r7)
            return r7
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m832(java.lang.Object r26) {
            r25 = this;
            r1 = r26
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            yl r0 = p000.C1025yl.f12669
            r1.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            wj r0 = new wj
            r3 = 29
            r0.<init>(r3)
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.Iterator r3 = r0.iterator()
        L1d:
            boolean r0 = r3.hasNext()
            r4 = r25
            java.lang.ClassLoader r5 = r4.f1599
            java.lang.String r6 = "):"
            java.lang.String r7 = "("
            java.lang.String r8 = "#"
            r11 = 1
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r3.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L3d
            goto L44
        L3d:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L44:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L4a
            r9 = 0
            goto L4b
        L4a:
            r9 = r0
        L4b:
            java.lang.Class r9 = (java.lang.Class) r9
            if (r9 == 0) goto Le0
            java.lang.reflect.Method[] r0 = r9.getDeclaredMethods()
            if (r0 == 0) goto Le0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r9 = r0.length
            r12 = 0
        L5c:
            if (r12 >= r9) goto L6c
            r13 = r0[r12]
            boolean r14 = p000.C1025yl.m6930(r13)
            if (r14 == 0) goto L69
            r5.add(r13)
        L69:
            int r12 = r12 + 1
            goto L5c
        L6c:
            java.util.Iterator r0 = r5.iterator()
        L70:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Le0
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r11)
            java.lang.Class r9 = r5.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r12 = r5.getName()
            java.lang.String r13 = p000.lz1.m3690(r12, r5)
            java.lang.Class[] r14 = r5.getParameterTypes()
            r14.getClass()
            java.util.ArrayList r15 = new java.util.ArrayList
            int r10 = r14.length
            r15.<init>(r10)
            int r10 = r14.length
            r11 = 0
        L9e:
            if (r11 >= r10) goto Lb0
            r23 = r0
            r0 = r14[r11]
            r24 = r3
            r3 = 1
            int r11 = p000.lz1.m3679(r0, r15, r11, r3)
            r0 = r23
            r3 = r24
            goto L9e
        Lb0:
            r23 = r0
            r24 = r3
            int r0 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r20 = 0
            r21 = 62
            java.lang.String r16 = ","
            r17 = 0
            r18 = 0
            r19 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r15, r16, r17, r18, r19, r20, r21)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r9, r8, r12, r7, r0)
            r0.append(r6)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r2.put(r0, r5)
            r0 = r23
            r11 = 1
            goto L70
        Le0:
            r24 = r3
            r3 = r24
            goto L1d
        Le6:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L178
            ul r0 = new ul
            r3 = 0
            r0.<init>(r3)
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.Iterator r1 = r0.iterator()
        Lfa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L178
            java.lang.Object r0 = r1.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r5)     // Catch: java.lang.Throwable -> L10b
            goto L112
        L10b:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L112:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L117
            r0 = 0
        L117:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L176
            boolean r4 = p000.C1025yl.m6930(r0)
            if (r4 == 0) goto L176
            r4 = 1
            r0.setAccessible(r4)
            java.lang.Class r4 = r0.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r10 = r0.getName()
            java.lang.String r11 = p000.lz1.m3690(r10, r0)
            java.lang.Class[] r12 = r0.getParameterTypes()
            r12.getClass()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r12.length
            r13.<init>(r14)
            int r14 = r12.length
            r15 = r3
        L144:
            if (r15 >= r14) goto L14f
            r3 = r12[r15]
            r9 = 1
            int r15 = p000.lz1.m3679(r3, r13, r15, r9)
            r3 = 0
            goto L144
        L14f:
            int r3 = r0.getModifiers()
            java.lang.reflect.Modifier.isStatic(r3)
            r18 = 0
            r19 = 62
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r3 = p000.AbstractC0984xh.m6644(r13, r14, r15, r16, r17, r18, r19)
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4138(r4, r8, r10, r7, r3)
            r3.append(r6)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r2.put(r3, r0)
        L176:
            r3 = 0
            goto Lfa
        L178:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1df
            java.util.List r0 = p000.C1025yl.m6932(r5)
            java.util.Iterator r0 = r0.iterator()
        L186:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1df
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r3 = p000.lz1.m3694(r1)
            java.lang.String r4 = r1.getName()
            java.lang.String r5 = p000.lz1.m3690(r4, r1)
            java.lang.Class[] r9 = r1.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = 0
        L1ad:
            if (r12 >= r11) goto L1b7
            r13 = r9[r12]
            r14 = 1
            int r12 = p000.lz1.m3679(r13, r10, r12, r14)
            goto L1ad
        L1b7:
            r14 = 1
            int r9 = r1.getModifiers()
            java.lang.reflect.Modifier.isStatic(r9)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r22 = r14
            r14 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4138(r3, r8, r4, r7, r9)
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.put(r3, r1)
            goto L186
        L1df:
            java.util.Collection r0 = r2.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    private final java.lang.Object m833(java.lang.Object r5) {
            r4 = this;
            java.lang.ClassLoader r4 = r4.f1599
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            jm r0 = p000.C0436jm.f5518
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            hm r2 = new hm     // Catch: java.lang.Throwable -> L3f
            r3 = 2
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.result.MethodDataList r5 = r5.findMethod(r2)     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3f
        L1c:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L3f
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2     // Catch: java.lang.Throwable -> L3f
            java.lang.reflect.Method r2 = r2.getMethodInstance(r4)     // Catch: java.lang.Throwable -> L2d
            goto L34
        L2d:
            r2 = move-exception
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r2 = r3
        L34:
            boolean r3 = r2 instanceof p000.eo1     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L39
            r2 = 0
        L39:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L3f
            p000.C0436jm.m2964(r1, r2)     // Catch: java.lang.Throwable -> L3f
            goto L1c
        L3f:
            r5 = move-exception
            goto L44
        L41:
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L44:
            eo1 r2 = new eo1
            r2.<init>(r5)
            r5 = r2
        L4a:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L5b
            java.lang.String r5 = r5.getMessage()
            java.lang.String r2 = "DexKit strict query failed: "
            java.lang.String r3 = "rb57159a7dbcb5c6"
            p000.AbstractC0602nx.m4143(r2, r5, r3)
        L5b:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L79
            java.util.List r4 = r0.m2971(r4)
            java.util.Iterator r4 = r4.iterator()
        L69:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            p000.C0436jm.m2964(r1, r5)
            goto L69
        L79:
            java.util.Collection r4 = r1.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            tf r5 = new tf
            jm r0 = p000.C0436jm.f5518
            r0 = 22
            r5.<init>(r0)
            java.util.List r4 = p000.AbstractC0984xh.m6658(r4, r5)
            java.util.ArrayList r4 = p000.C0436jm.m2965(r4)
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    private final java.lang.Object m834(java.lang.Object r4) {
            r3 = this;
            java.lang.ClassLoader r3 = r3.f1599
            org.luckypray.dexkit.DexKitBridge r4 = (org.luckypray.dexkit.DexKitBridge) r4
            r4.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.p00.f8376
            hm r0 = new hm     // Catch: java.lang.Throwable -> Lc0
            r1 = 25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lc0
            org.luckypray.dexkit.result.MethodDataList r4 = r4.findMethod(r0)     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayList r3 = p000.p00.m4343(r4, r3)     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r4.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lc0
        L21:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Lc0
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> Lc0
            int r1 = r1.getModifiers()     // Catch: java.lang.Throwable -> Lc0
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto L21
            r4.add(r0)     // Catch: java.lang.Throwable -> Lc0
            goto L21
        L3c:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r4, r0)     // Catch: java.lang.Throwable -> Lc0
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lc0
        L4b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lc0
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> Lc0
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> Lc0
            r3.add(r0)     // Catch: java.lang.Throwable -> Lc0
            goto L4b
        L5f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r4.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lc0
        L68:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L84
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> Lc0
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> Lc0
            r1.getClass()     // Catch: java.lang.Throwable -> Lc0
            int r1 = p000.p00.m4342(r1)     // Catch: java.lang.Throwable -> Lc0
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L68
            r4.add(r0)     // Catch: java.lang.Throwable -> Lc0
            goto L68
        L84:
            qt r3 = new qt     // Catch: java.lang.Throwable -> Lc0
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.p00.f8376     // Catch: java.lang.Throwable -> Lc0
            r0 = 8
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lc0
            java.util.List r3 = p000.AbstractC0984xh.m6658(r4, r3)     // Catch: java.lang.Throwable -> Lc0
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lc0
            r4.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc0
            r0.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lc0
        L9f:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> Lc0
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> Lc0
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> Lc0
            boolean r2 = r4.add(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L9f
            r0.add(r1)     // Catch: java.lang.Throwable -> Lc0
            goto L9f
        Lba:
            r3 = 4
            java.util.List r3 = p000.AbstractC0984xh.m6662(r0, r3)     // Catch: java.lang.Throwable -> Lc0
            goto Lc7
        Lc0:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        Lc7:
            java.lang.Throwable r4 = p000.fo1.m2190(r3)
            if (r4 == 0) goto Ld4
            java.lang.String r0 = "r4501f4cd04cb7502"
            java.lang.String r1 = "DexKit 按结构定位长按广告判断类失败"
            p000.C0888ux.m5977(r0, r1, r4)
        Ld4:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto Lda
            jz r3 = p000.C0450jz.f5672
        Lda:
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    /* JADX INFO: renamed from: η */
    private final java.lang.Object m835(java.lang.Object r6) {
            r5 = this;
            java.lang.ClassLoader r5 = r5.f1599
            org.luckypray.dexkit.DexKitBridge r6 = (org.luckypray.dexkit.DexKitBridge) r6
            r6.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.u00.f10545
            r0 = 0
            q00 r1 = new q00     // Catch: java.lang.Throwable -> L33
            r2 = 6
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L33
            org.luckypray.dexkit.result.FieldDataList r6 = r6.findField(r1)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L33
        L1d:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L33
            org.luckypray.dexkit.result.FieldData r2 = (org.luckypray.dexkit.result.FieldData) r2     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Field r2 = r2.getFieldInstance(r5)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L1d
            r1.add(r2)     // Catch: java.lang.Throwable -> L33
            goto L1d
        L33:
            r6 = move-exception
            goto L8c
        L35:
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L33
        L39:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L33
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L33
            goto L39
        L4a:
            java.util.Iterator r6 = r1.iterator()     // Catch: java.lang.Throwable -> L33
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L56
            r1 = r0
            goto L7d
        L56:
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L33
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L61
            goto L7d
        L61:
            r2 = r1
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L33
            int r2 = p000.u00.m5772(r2)     // Catch: java.lang.Throwable -> L33
        L68:
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L33
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L33
            int r4 = p000.u00.m5772(r4)     // Catch: java.lang.Throwable -> L33
            if (r2 >= r4) goto L77
            r1 = r3
            r2 = r4
        L77:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r3 != 0) goto L68
        L7d:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L8a
            int r6 = p000.u00.m5772(r1)     // Catch: java.lang.Throwable -> L33
            r2 = 3000(0xbb8, float:4.204E-42)
            if (r6 < r2) goto L8a
            goto L94
        L8a:
            r1 = r0
            goto L94
        L8c:
            java.lang.String r1 = "r2475a9d899053c09"
            java.lang.String r2 = "DexKit 定位 ViewHolder 当前作品字段失败"
            p000.C0888ux.m5977(r1, r2, r6)
            goto L8a
        L94:
            if (r1 != 0) goto L9a
            java.lang.reflect.Field r1 = p000.u00.m5770(r0, r5)
        L9a:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    private final java.lang.Object m836(java.lang.Object r10) {
            r9 = this;
            java.lang.ClassLoader r9 = r9.f1599
            org.luckypray.dexkit.DexKitBridge r10 = (org.luckypray.dexkit.DexKitBridge) r10
            r10.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.n10.f7350
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = r2.create()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC516C0DF08B46AFD681258733F65F56ED85D13872AD5795D57F46"
            java.lang.String r4 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L5e
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.query.FindMethod r0 = r0.matcher(r2)     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.result.MethodDataList r10 = r10.findMethod(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L5e
        L39:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L61
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L5e
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L5e
            java.lang.reflect.Method r0 = r0.getMethodInstance(r9)     // Catch: java.lang.Throwable -> L4a
            goto L51
        L4a:
            r0 = move-exception
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L5e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = r3
        L51:
            boolean r3 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L56
            r0 = 0
        L56:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L39
            r2.add(r0)     // Catch: java.lang.Throwable -> L5e
            goto L39
        L5e:
            r0 = move-exception
            r10 = r0
            goto L67
        L61:
            p000.AbstractC0984xh.m6660(r1, r2)     // Catch: java.lang.Throwable -> L5e
            s62 r10 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5e
            goto L6d
        L67:
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L6d:
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            if (r10 == 0) goto L7c
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "r4739841e849430ff"
            p000.AbstractC0602nx.m4142(r0, r10)
        L7c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r1.iterator()
        L85:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9c
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = p000.n10.m3935(r2)
            if (r2 == 0) goto L85
            r10.add(r1)
            goto L85
        L9c:
            qt r0 = new qt
            r1 = 14
            r0.<init>(r1)
            java.util.List r10 = p000.AbstractC0984xh.m6658(r10, r0)
            java.util.List r9 = p000.n10.m3936(r9)
            java.util.ArrayList r9 = p000.AbstractC0984xh.m6651(r10, r9)
            java.util.ArrayList r9 = p000.n10.m3933(r9)
            return r9
    }

    /* JADX INFO: renamed from: ι */
    private final java.lang.Object m837(java.lang.Object r2) {
            r1 = this;
            java.lang.ClassLoader r1 = r1.f1599
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.String r0 = "gesture_enabled"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "*"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L2b
        L17:
            java.lang.ClassLoader r2 = p000.x10.f11976
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            x10 r2 = p000.x10.f11972
            p000.x10.m6501(r1)
            boolean r0 = p000.x10.m6498()
            if (r0 == 0) goto L2b
            r2.m6502(r1)
        L2b:
            s62 r1 = p000.s62.f9751
            return r1
    }

    /* JADX INFO: renamed from: κ */
    private final java.lang.Object m838(java.lang.Object r8) {
            r7 = this;
            java.lang.ClassLoader r7 = r7.f1599
            org.luckypray.dexkit.DexKitBridge r8 = (org.luckypray.dexkit.DexKitBridge) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.m20.f6907
            s62 r0 = p000.s62.f9751
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            q00 r2 = new q00     // Catch: java.lang.Throwable -> L3a
            r3 = 28
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            org.luckypray.dexkit.result.ClassDataList r2 = r8.findClass(r2)     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r3.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L24:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3a
            org.luckypray.dexkit.result.ClassData r4 = (org.luckypray.dexkit.result.ClassData) r4     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r4 = p000.m20.m3713(r4, r7)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L24
            r3.add(r4)     // Catch: java.lang.Throwable -> L3a
            goto L24
        L3a:
            r2 = move-exception
            goto L52
        L3c:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L3a
        L40:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L50
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L3a
            r1.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto L40
        L50:
            r3 = r0
            goto L57
        L52:
            eo1 r3 = new eo1
            r3.<init>(r2)
        L57:
            java.lang.Throwable r2 = p000.fo1.m2190(r3)
            r3 = 4
            java.lang.String r4 = "rcc14672cf9c445fb"
            r5 = 0
            if (r2 == 0) goto L6e
            java.lang.String r2 = r2.getMessage()
            java.lang.String r6 = "DexKit 按稳定类名定位失败: "
            java.lang.String r2 = p000.lz1.m3687(r6, r2)
            p000.C0888ux.m5988(r4, r2, r5, r3, r5)
        L6e:
            q00 r2 = new q00     // Catch: java.lang.Throwable -> L98
            r6 = 29
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L98
            org.luckypray.dexkit.result.ClassDataList r8 = r8.findClass(r2)     // Catch: java.lang.Throwable -> L98
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L98
        L82:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Throwable -> L98
            org.luckypray.dexkit.result.ClassData r6 = (org.luckypray.dexkit.result.ClassData) r6     // Catch: java.lang.Throwable -> L98
            java.lang.Class r6 = p000.m20.m3713(r6, r7)     // Catch: java.lang.Throwable -> L98
            if (r6 == 0) goto L82
            r2.add(r6)     // Catch: java.lang.Throwable -> L98
            goto L82
        L98:
            r7 = move-exception
            goto Lae
        L9a:
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> L98
        L9e:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto Lb3
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L98
            java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Throwable -> L98
            r1.add(r8)     // Catch: java.lang.Throwable -> L98
            goto L9e
        Lae:
            eo1 r0 = new eo1
            r0.<init>(r7)
        Lb3:
            java.lang.Throwable r7 = p000.fo1.m2190(r0)
            if (r7 == 0) goto Lc6
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "DexKit 按接口结构定位失败: "
            java.lang.String r7 = p000.lz1.m3687(r8, r7)
            p000.C0888ux.m5988(r4, r7, r5, r3, r5)
        Lc6:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r1.iterator()
        Lcf:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Led
            java.lang.Object r0 = r8.next()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r0.getClass()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r0.getClass()
            p000.AbstractC0984xh.m6660(r7, r0)
            goto Lcf
        Led:
            java.util.List r7 = p000.m20.m3717(r7)
            return r7
    }

    /* JADX INFO: renamed from: λ */
    private final java.lang.Object m839(java.lang.Object r5) {
            r4 = this;
            java.lang.ClassLoader r4 = r4.f1599
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l20 r1 = new l20     // Catch: java.lang.Throwable -> L39
            r2 = 14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L39
            org.luckypray.dexkit.result.MethodDataList r1 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L39
        L20:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L36
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L39
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r4)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L20
            r2.add(r3)     // Catch: java.lang.Throwable -> L39
            goto L20
        L36:
            p000.AbstractC0984xh.m6660(r0, r2)     // Catch: java.lang.Throwable -> L39
        L39:
            l20 r1 = new l20     // Catch: java.lang.Throwable -> L66
            r2 = 15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L66
            org.luckypray.dexkit.result.MethodDataList r5 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L66
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L66
        L4d:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L63
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L66
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2     // Catch: java.lang.Throwable -> L66
            java.lang.reflect.Method r2 = p000.pd2.m4503(r2, r4)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L4d
            r1.add(r2)     // Catch: java.lang.Throwable -> L66
            goto L4d
        L63:
            p000.AbstractC0984xh.m6660(r0, r1)     // Catch: java.lang.Throwable -> L66
        L66:
            java.util.ArrayList r4 = p000.pd2.m4493(r0)
            return r4
    }

    /* JADX INFO: renamed from: μ */
    private final java.lang.Object m840(java.lang.Object r5) {
            r4 = this;
            java.lang.ClassLoader r4 = r4.f1599
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l20 r1 = new l20     // Catch: java.lang.Throwable -> L38
            r2 = 7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodDataList r1 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r2.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L38
        L1f:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r4)     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L1f
            r2.add(r3)     // Catch: java.lang.Throwable -> L38
            goto L1f
        L35:
            p000.AbstractC0984xh.m6660(r0, r2)     // Catch: java.lang.Throwable -> L38
        L38:
            l20 r1 = new l20     // Catch: java.lang.Throwable -> L65
            r2 = 8
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L65
            org.luckypray.dexkit.result.MethodDataList r1 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L65
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L65
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L65
        L4c:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L62
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L65
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L65
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r4)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L4c
            r2.add(r3)     // Catch: java.lang.Throwable -> L65
            goto L4c
        L62:
            p000.AbstractC0984xh.m6660(r0, r2)     // Catch: java.lang.Throwable -> L65
        L65:
            l20 r1 = new l20     // Catch: java.lang.Throwable -> L92
            r2 = 9
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L92
            org.luckypray.dexkit.result.MethodDataList r1 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L92
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L92
            r2.<init>()     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L92
        L79:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L92
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r4)     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto L79
            r2.add(r3)     // Catch: java.lang.Throwable -> L92
            goto L79
        L8f:
            p000.AbstractC0984xh.m6660(r0, r2)     // Catch: java.lang.Throwable -> L92
        L92:
            l20 r1 = new l20     // Catch: java.lang.Throwable -> Lbf
            r2 = 10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lbf
            org.luckypray.dexkit.result.MethodDataList r1 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> Lbf
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            r2.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lbf
        La6:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto Lbc
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lbf
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> Lbf
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r4)     // Catch: java.lang.Throwable -> Lbf
            if (r3 == 0) goto La6
            r2.add(r3)     // Catch: java.lang.Throwable -> Lbf
            goto La6
        Lbc:
            p000.AbstractC0984xh.m6660(r0, r2)     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            l20 r1 = new l20     // Catch: java.lang.Throwable -> Lec
            r2 = 11
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lec
            org.luckypray.dexkit.result.MethodDataList r1 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> Lec
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lec
            r2.<init>()     // Catch: java.lang.Throwable -> Lec
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lec
        Ld3:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Le9
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lec
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> Lec
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r4)     // Catch: java.lang.Throwable -> Lec
            if (r3 == 0) goto Ld3
            r2.add(r3)     // Catch: java.lang.Throwable -> Lec
            goto Ld3
        Le9:
            p000.AbstractC0984xh.m6660(r0, r2)     // Catch: java.lang.Throwable -> Lec
        Lec:
            l20 r1 = new l20     // Catch: java.lang.Throwable -> L119
            r2 = 12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L119
            org.luckypray.dexkit.result.MethodDataList r5 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L119
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L119
            r1.<init>()     // Catch: java.lang.Throwable -> L119
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L119
        L100:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L119
            if (r2 == 0) goto L116
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L119
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2     // Catch: java.lang.Throwable -> L119
            java.lang.reflect.Method r2 = p000.pd2.m4503(r2, r4)     // Catch: java.lang.Throwable -> L119
            if (r2 == 0) goto L100
            r1.add(r2)     // Catch: java.lang.Throwable -> L119
            goto L100
        L116:
            p000.AbstractC0984xh.m6660(r0, r1)     // Catch: java.lang.Throwable -> L119
        L119:
            java.util.ArrayList r5 = p000.pd2.m4493(r0)
            java.util.List r4 = p000.pd2.m4467(r4)
            java.util.ArrayList r4 = p000.AbstractC0984xh.m6651(r5, r4)
            return r4
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r32) {
            r31 = this;
            r0 = r31
            int r1 = r0.f1598
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "java.util.List"
            jz r6 = p000.C0450jz.f5672
            r9 = 26
            r10 = 18
            r11 = 17
            r12 = 16
            java.lang.String r13 = "int"
            s62 r14 = p000.s62.f9751
            r15 = 4
            r2 = 0
            r3 = 0
            r7 = 1
            java.lang.ClassLoader r8 = r0.f1599
            switch(r1) {
                case 0: goto Lae5;
                case 1: goto L9cd;
                case 2: goto L8bb;
                case 3: goto L806;
                case 4: goto L7ce;
                case 5: goto L72e;
                case 6: goto L6ae;
                case 7: goto L5b6;
                case 8: goto L517;
                case 9: goto L46c;
                case 10: goto L3a1;
                case 11: goto L229;
                case 12: goto L220;
                case 13: goto L217;
                case 14: goto L20e;
                case 15: goto L205;
                case 16: goto L1f3;
                case 17: goto L14a;
                case 18: goto L145;
                case 19: goto L140;
                case 20: goto L13b;
                case 21: goto L136;
                case 22: goto L131;
                case 23: goto Lca;
                case 24: goto Lc5;
                case 25: goto Lc0;
                case 26: goto Lbb;
                case 27: goto Lb6;
                case 28: goto Lb1;
                default: goto L1f;
            }
        L1f:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            l20 r2 = new l20     // Catch: java.lang.Throwable -> L56
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L56
            org.luckypray.dexkit.result.MethodDataList r2 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> L56
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56
            r3.<init>()     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L56
        L3d:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L53
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L56
            org.luckypray.dexkit.result.MethodData r4 = (org.luckypray.dexkit.result.MethodData) r4     // Catch: java.lang.Throwable -> L56
            java.lang.reflect.Method r4 = p000.pd2.m4503(r4, r8)     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L3d
            r3.add(r4)     // Catch: java.lang.Throwable -> L56
            goto L3d
        L53:
            p000.AbstractC0984xh.m6660(r1, r3)     // Catch: java.lang.Throwable -> L56
        L56:
            l20 r2 = new l20     // Catch: java.lang.Throwable -> L81
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L81
            org.luckypray.dexkit.result.MethodDataList r2 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> L81
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            r3.<init>()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L81
        L68:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L81
            org.luckypray.dexkit.result.MethodData r4 = (org.luckypray.dexkit.result.MethodData) r4     // Catch: java.lang.Throwable -> L81
            java.lang.reflect.Method r4 = p000.pd2.m4503(r4, r8)     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L68
            r3.add(r4)     // Catch: java.lang.Throwable -> L81
            goto L68
        L7e:
            p000.AbstractC0984xh.m6660(r1, r3)     // Catch: java.lang.Throwable -> L81
        L81:
            l20 r2 = new l20     // Catch: java.lang.Throwable -> Lac
            r2.<init>(r10)     // Catch: java.lang.Throwable -> Lac
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r2)     // Catch: java.lang.Throwable -> Lac
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac
            r2.<init>()     // Catch: java.lang.Throwable -> Lac
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lac
        L93:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto La9
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> Lac
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> Lac
            java.lang.reflect.Method r3 = p000.pd2.m4503(r3, r8)     // Catch: java.lang.Throwable -> Lac
            if (r3 == 0) goto L93
            r2.add(r3)     // Catch: java.lang.Throwable -> Lac
            goto L93
        La9:
            p000.AbstractC0984xh.m6660(r1, r2)     // Catch: java.lang.Throwable -> Lac
        Lac:
            java.util.ArrayList r0 = p000.pd2.m4493(r1)
            return r0
        Lb1:
            java.lang.Object r0 = r31.m840(r32)
            return r0
        Lb6:
            java.lang.Object r0 = r31.m839(r32)
            return r0
        Lbb:
            java.lang.Object r0 = r31.m838(r32)
            return r0
        Lc0:
            java.lang.Object r0 = r31.m837(r32)
            return r0
        Lc5:
            java.lang.Object r0 = r31.m836(r32)
            return r0
        Lca:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            c10 r1 = p000.c10.f1928
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            q00 r4 = new q00     // Catch: java.lang.Throwable -> L10a
            r5 = 15
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L10a
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r4)     // Catch: java.lang.Throwable -> L10a
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> L10a
        Le7:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L10a
            if (r0 == 0) goto L110
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L10a
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L10a
            java.lang.reflect.Method r0 = r0.getMethodInstance(r8)     // Catch: java.lang.Throwable -> Lf8
            goto Lff
        Lf8:
            r0 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L10a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L10a
            r0 = r5
        Lff:
            boolean r5 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L10a
            if (r5 == 0) goto L104
            r0 = r3
        L104:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L10a
            p000.c10.m1095(r2, r0)     // Catch: java.lang.Throwable -> L10a
            goto Le7
        L10a:
            r0 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r0)
        L110:
            java.lang.Throwable r0 = p000.fo1.m2190(r14)
            if (r0 == 0) goto L125
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "DexKit 定位双击入口失败: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            java.lang.String r4 = "rc8611bc391e3e31b"
            p000.C0888ux.m5988(r4, r0, r3, r15, r3)
        L125:
            java.util.Collection r0 = r2.values()
            r0.getClass()
            java.util.List r0 = r1.m1103(r0)
            return r0
        L131:
            java.lang.Object r0 = r31.m835(r32)
            return r0
        L136:
            java.lang.Object r0 = r31.m834(r32)
            return r0
        L13b:
            java.lang.Object r0 = r31.m833(r32)
            return r0
        L140:
            java.lang.Object r0 = r31.m832(r32)
            return r0
        L145:
            java.lang.Object r0 = r31.m831(r32)
            return r0
        L14a:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            ql r1 = p000.C0728ql.f9031
            r0.getClass()
            wj r1 = new wj
            r1.<init>(r9)
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L165:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18a
            java.lang.Object r0 = r2.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r8)     // Catch: java.lang.Throwable -> L176
            goto L17d
        L176:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L17d:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L182
            r0 = r3
        L182:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L165
            r1.add(r0)
            goto L165
        L18a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L193:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1aa
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = p000.C0728ql.m4899(r3, r7)
            if (r3 == 0) goto L193
            r0.add(r2)
            goto L193
        L1aa:
            tf r1 = new tf
            r2 = 20
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1c3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1de
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.C0728ql.m4902(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L1c3
            r2.add(r3)
            goto L1c3
        L1de:
            java.util.Iterator r0 = r2.iterator()
        L1e2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f2
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r7)
            goto L1e2
        L1f2:
            return r2
        L1f3:
            r0 = r32
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = p000.AbstractC0093bx.f1879
            java.lang.String r0 = r0.getName()
            java.lang.Class r0 = p000.AbstractC0093bx.m1082(r8, r0)
            return r0
        L205:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            java.util.List r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1342(r8, r0)
            return r0
        L20e:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            java.util.List r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1325(r8, r0)
            return r0
        L217:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            java.util.List r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1341(r8, r0)
            return r0
        L220:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            java.util.List r0 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1332(r8, r0)
            return r0
        L229:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            fj r1 = p000.C0287fj.f3949
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r4 = p000.C0287fj.f3950
            java.util.Iterator r4 = r4.iterator()
        L23d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L252
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            xi r6 = new xi
            r6.<init>(r0, r5, r8, r2)
            p000.C0287fj.m2125(r1, r6)
            goto L23d
        L252:
            java.lang.String r2 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r16 = new java.lang.String[]{r4}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r17 = new java.lang.String[]{r3, r4}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r18 = new java.lang.String[]{r4, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r19 = new java.lang.String[]{r3, r3, r4}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r20 = new java.lang.String[]{r3, r4, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r21 = new java.lang.String[]{r4, r3, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r22 = new java.lang.String[]{r3, r3, r3, r4}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r23 = new java.lang.String[]{r3, r3, r4, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r24 = new java.lang.String[]{r3, r4, r3, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r25 = new java.lang.String[]{r4, r3, r3, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r26 = new java.lang.String[]{r3, r3, r3, r3, r4}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r27 = new java.lang.String[]{r3, r3, r3, r4, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r28 = new java.lang.String[]{r3, r3, r4, r3, r3}
            java.lang.String r4 = p000.jf0.m2957(r2)
            java.lang.String[] r29 = new java.lang.String[]{r3, r4, r3, r3, r3}
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String[] r30 = new java.lang.String[]{r2, r3, r3, r3, r3}
            java.lang.String[][] r2 = new java.lang.String[][]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.Iterator r2 = r2.iterator()
        L2d8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2ee
            java.lang.Object r3 = r2.next()
            java.lang.String[] r3 = (java.lang.String[]) r3
            z7 r4 = new z7
            r5 = 3
            r4.<init>(r0, r3, r8, r5)
            p000.C0287fj.m2125(r1, r4)
            goto L2d8
        L2ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2f7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L310
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.C0287fj.m2115(r3)
            r4 = 2800(0xaf0, float:3.924E-42)
            if (r3 < r4) goto L2f7
            r0.add(r2)
            goto L2f7
        L310:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L31e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L339
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.C0287fj.m2139(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L31e
            r2.add(r3)
            goto L31e
        L339:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L342:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L359
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = p000.C0287fj.m2136(r3)
            if (r3 == 0) goto L342
            r0.add(r2)
            goto L342
        L359:
            tf r1 = new tf
            r2 = 6
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L371:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38c
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.C0287fj.m2139(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L371
            r2.add(r3)
            goto L371
        L38c:
            java.util.Iterator r0 = r2.iterator()
        L390:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a0
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r7)
            goto L390
        L3a0:
            return r2
        L3a1:
            r1 = r32
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            kh r0 = p000.C0469kh.f5917
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.List r0 = p000.C0469kh.f5918
            java.util.Iterator r3 = r0.iterator()
        L3b5:
            boolean r0 = r3.hasNext()
            r4 = 2
            r5 = 500(0x1f4, float:7.0E-43)
            if (r0 == 0) goto L40c
            java.lang.Object r0 = r3.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            s9 r0 = new s9     // Catch: java.lang.Throwable -> L3f3
            r0.<init>(r6, r4)     // Catch: java.lang.Throwable -> L3f3
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L3f3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3f3
        L3d2:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L3f3
            if (r4 == 0) goto L3f5
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L3f3
            org.luckypray.dexkit.result.MethodData r4 = (org.luckypray.dexkit.result.MethodData) r4     // Catch: java.lang.Throwable -> L3f3
            java.lang.reflect.Method r4 = r4.getMethodInstance(r8)     // Catch: java.lang.Throwable -> L3d2
            java.lang.Class r4 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> L3d2
            r4.getClass()     // Catch: java.lang.Throwable -> L3d2
            int r7 = p000.C0469kh.m3260(r4)     // Catch: java.lang.Throwable -> L3d2
            if (r7 < r5) goto L3d2
            r2.add(r4)     // Catch: java.lang.Throwable -> L3d2
            goto L3d2
        L3f3:
            r0 = move-exception
            goto L3f7
        L3f5:
            r4 = r14
            goto L3fc
        L3f7:
            eo1 r4 = new eo1
            r4.<init>(r0)
        L3fc:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto L3b5
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "r69312f33fd204a99"
            p000.AbstractC0602nx.m4121(r4, r6, r0)
            goto L3b5
        L40c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L419
            java.util.ArrayList r0 = p000.C0469kh.m3257(r8)
            r2.addAll(r0)
        L419:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L422:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L439
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            int r3 = p000.C0469kh.m3260(r3)
            if (r3 < r5) goto L422
            r0.add(r2)
            goto L422
        L439:
            tf r1 = new tf
            r1.<init>(r4)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L450:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46b
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L450
            r2.add(r3)
            goto L450
        L46b:
            return r2
        L46c:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            we r3 = new we     // Catch: java.lang.Throwable -> L4c9
            r4 = 29
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4c9
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r3)     // Catch: java.lang.Throwable -> L4c9
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4c9
        L487:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L4c9
            if (r3 == 0) goto L4cf
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L4c9
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L4c9
            java.lang.reflect.Method r3 = r3.getMethodInstance(r8)     // Catch: java.lang.Throwable -> L487
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> L487
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L487
            if (r4 == 0) goto L487
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.Throwable -> L487
            java.lang.Class r5 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L487
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> L487
            if (r4 == 0) goto L487
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L487
            int r4 = r4.length     // Catch: java.lang.Throwable -> L487
            if (r4 != r7) goto L487
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L487
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L487
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> L487
            if (r4 == 0) goto L487
            r3.setAccessible(r7)     // Catch: java.lang.Throwable -> L487
            r1.add(r3)     // Catch: java.lang.Throwable -> L487
            goto L487
        L4c9:
            r0 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r0)
        L4cf:
            java.lang.Throwable r0 = p000.fo1.m2190(r14)
            if (r0 == 0) goto L4de
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "r1a93f9a802935717"
            p000.AbstractC0602nx.m4142(r2, r0)
        L4de:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L4eb
            java.util.List r0 = p000.C0469kh.m3255(r8)
            r1.addAll(r0)
        L4eb:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4f9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L516
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            kh r5 = p000.C0469kh.f5917
            java.lang.String r4 = p000.C0469kh.m3261(r4)
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L4f9
            r2.add(r3)
            goto L4f9
        L516:
            return r2
        L517:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            we r1 = new we     // Catch: java.lang.Throwable -> L548
            r2 = 21
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L548
            org.luckypray.dexkit.result.ClassDataList r0 = r0.findClass(r1)     // Catch: java.lang.Throwable -> L548
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L548
            r1.<init>()     // Catch: java.lang.Throwable -> L548
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L548
        L532:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L548
            if (r2 == 0) goto L54a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L548
            org.luckypray.dexkit.result.ClassData r2 = (org.luckypray.dexkit.result.ClassData) r2     // Catch: java.lang.Throwable -> L548
            java.lang.Class r2 = p000.C0017ag.m104(r2, r8)     // Catch: java.lang.Throwable -> L548
            if (r2 == 0) goto L532
            r1.add(r2)     // Catch: java.lang.Throwable -> L548
            goto L532
        L548:
            r0 = move-exception
            goto L593
        L54a:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L548
            r0.<init>()     // Catch: java.lang.Throwable -> L548
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L548
        L553:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L548
            if (r2 == 0) goto L56a
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L548
            r4 = r2
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L548
            boolean r4 = p000.C0017ag.m105(r4)     // Catch: java.lang.Throwable -> L548
            if (r4 == 0) goto L553
            r0.add(r2)     // Catch: java.lang.Throwable -> L548
            goto L553
        L56a:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L548
            r1.<init>()     // Catch: java.lang.Throwable -> L548
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L548
            r2.<init>()     // Catch: java.lang.Throwable -> L548
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L548
        L578:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L548
            if (r4 == 0) goto L598
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L548
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L548
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L548
            boolean r5 = r1.add(r5)     // Catch: java.lang.Throwable -> L548
            if (r5 == 0) goto L578
            r2.add(r4)     // Catch: java.lang.Throwable -> L548
            goto L578
        L593:
            eo1 r2 = new eo1
            r2.<init>(r0)
        L598:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L5ad
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "DexKit 扫描 Flux 底栏注册器失败: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            java.lang.String r1 = "rb3b4f1f2616781f"
            p000.C0888ux.m5988(r1, r0, r3, r15, r3)
        L5ad:
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L5b2
            goto L5b3
        L5b2:
            r6 = r2
        L5b3:
            java.util.List r6 = (java.util.List) r6
            return r6
        L5b6:
            r1 = r32
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            bf r4 = p000.C0075bf.f1684
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            n7 r0 = new n7     // Catch: java.lang.Throwable -> L5f6
            r6 = 29
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L5f6
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L5f6
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L5f6
        L5d3:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L5f6
            if (r0 == 0) goto L5f8
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L5f6
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L5f6
            java.lang.reflect.Method r0 = r0.getMethodInstance(r8)     // Catch: java.lang.Throwable -> L5e4
            goto L5eb
        L5e4:
            r0 = move-exception
            eo1 r7 = new eo1     // Catch: java.lang.Throwable -> L5f6
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5f6
            r0 = r7
        L5eb:
            boolean r7 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L5f6
            if (r7 == 0) goto L5f0
            r0 = r3
        L5f0:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L5f6
            p000.C0075bf.m947(r5, r0)     // Catch: java.lang.Throwable -> L5f6
            goto L5d3
        L5f6:
            r0 = move-exception
            goto L5fa
        L5f8:
            r6 = r14
            goto L5ff
        L5fa:
            eo1 r6 = new eo1
            r6.<init>(r0)
        L5ff:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 == 0) goto L61a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DexKit strict query failed: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            p000.C0075bf.m950(r0)
        L61a:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L671
            we r0 = new we     // Catch: java.lang.Throwable -> L650
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L650
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)     // Catch: java.lang.Throwable -> L650
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L650
        L62d:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L650
            if (r0 == 0) goto L656
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L650
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L650
            java.lang.reflect.Method r0 = r0.getMethodInstance(r8)     // Catch: java.lang.Throwable -> L63e
            goto L645
        L63e:
            r0 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L650
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L650
            r0 = r2
        L645:
            boolean r2 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L650
            if (r2 == 0) goto L64a
            r0 = r3
        L64a:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L650
            p000.C0075bf.m947(r5, r0)     // Catch: java.lang.Throwable -> L650
            goto L62d
        L650:
            r0 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r0)
        L656:
            java.lang.Throwable r0 = p000.fo1.m2190(r14)
            if (r0 == 0) goto L671
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DexKit signature query failed: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0075bf.m950(r0)
        L671:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L68f
            java.util.List r0 = r4.m952(r8)
            java.util.Iterator r0 = r0.iterator()
        L67f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68f
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            p000.C0075bf.m947(r5, r1)
            goto L67f
        L68f:
            java.util.Collection r0 = r5.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d50 r1 = new d50
            bf r2 = p000.C0075bf.f1684
            r2 = 27
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            java.util.ArrayList r0 = p000.C0075bf.m948(r0)
            return r0
        L6ae:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.List r1 = p000.C0903vb.f11215
            java.util.LinkedHashSet r1 = p000.C0903vb.m6156(r8)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L6c7
            java.lang.String r0 = "data source interface not resolved, skip broad List-return DexKit scan"
            p000.C0903vb.m6153(r0)
            goto L72d
        L6c7:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r1.iterator()
        L6d0:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6e4
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.List r6 = p000.C0903vb.m6147(r0, r8, r6, r5)
            p000.AbstractC0984xh.m6660(r3, r6)
            goto L6d0
        L6e4:
            f7 r0 = new f7
            r0.<init>(r7, r3)
            tb r3 = new tb
            r3.<init>(r1, r2)
            t52 r1 = new t52
            r1.<init>(r0, r3)
            n7 r0 = new n7
            r0.<init>(r12)
            y30 r3 = new y30
            r3.<init>(r1, r7, r0)
            d50 r0 = new d50
            r1 = 24
            r0.<init>(r1)
            cu r1 = new cu
            r5 = 3
            r1.<init>(r3, r5, r0)
            n7 r0 = new n7
            r0.<init>(r11)
            t52 r3 = new t52
            r3.<init>(r1, r0)
            n7 r0 = new n7
            r0.<init>(r10)
            cu r1 = new cu
            r1.<init>(r3, r2, r0)
            n7 r0 = new n7
            r2 = 19
            r0.<init>(r2)
            t52 r0 = p000.us1.m5945(r1, r0)
            java.util.List r6 = p000.us1.m5948(r0)
        L72d:
            return r6
        L72e:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.List r1 = p000.C0903vb.f11215
            java.util.List r1 = p000.C0903vb.m6155(r8, r7)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L744:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L792
            java.lang.Object r3 = r1.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r4 = r3.getName()
            java.util.List r4 = p000.C0903vb.m6147(r0, r8, r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L75c:
            boolean r6 = r4.hasNext()
            r7 = 2200(0x898, float:3.083E-42)
            if (r6 == 0) goto L774
            java.lang.Object r6 = r4.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            int r10 = p000.C0903vb.m6164(r6)
            if (r10 < r7) goto L75c
            p000.C0903vb.m6144(r2, r6)
            goto L75c
        L774:
            java.util.ArrayList r3 = p000.C0903vb.m6145(r3)
            java.util.Iterator r3 = r3.iterator()
        L77c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L744
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r6 = p000.C0903vb.m6164(r4)
            if (r6 < r7) goto L77c
            p000.C0903vb.m6144(r2, r4)
            goto L77c
        L792:
            java.util.Collection r0 = r2.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d50 r1 = new d50
            r1.<init>(r9)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L7b2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L7cd
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.C0903vb.m6154(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L7b2
            r2.add(r3)
            goto L7b2
        L7cd:
            return r2
        L7ce:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.List r1 = p000.C0903vb.f11215
            java.util.List r1 = p000.C0903vb.f11215
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L7e2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L7f6
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r4 = p000.C0903vb.m6147(r0, r8, r4, r3)
            p000.AbstractC0984xh.m6660(r2, r4)
            goto L7e2
        L7f6:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L801
            java.lang.String r0 = "stable data source provider methods not found by DexKit"
            p000.C0903vb.m6153(r0)
        L801:
            java.util.List r0 = p000.C0903vb.m6148(r2)
            return r0
        L806:
            r0 = r32
            org.luckypray.dexkit.DexKitBridge r0 = (org.luckypray.dexkit.DexKitBridge) r0
            r0.getClass()
            java.util.List r0 = p000.C0903vb.f11215
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r1 = p000.C0903vb.f11215
            java.util.Iterator r1 = r1.iterator()
        L81a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L87d
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r3 = p000.AbstractC0093bx.m1082(r8, r3)
            if (r3 == 0) goto L81a
            java.lang.String r4 = r3.getName()
            r0.put(r4, r3)
            java.lang.reflect.Field[] r4 = r3.getDeclaredFields()
            r4.getClass()
            int r5 = r4.length
            r6 = r2
        L83c:
            r7 = 2500(0x9c4, float:3.503E-42)
            if (r6 >= r5) goto L859
            r9 = r4[r6]
            java.lang.Class r9 = r9.getType()
            r9.getClass()
            int r10 = p000.C0903vb.m6163(r9)
            if (r10 < r7) goto L856
            java.lang.String r7 = r9.getName()
            r0.put(r7, r9)
        L856:
            int r6 = r6 + 1
            goto L83c
        L859:
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            r3.getClass()
            int r4 = r3.length
            r5 = r2
        L862:
            if (r5 >= r4) goto L81a
            r6 = r3[r5]
            java.lang.Class r6 = r6.getReturnType()
            r6.getClass()
            int r9 = p000.C0903vb.m6163(r6)
            if (r9 < r7) goto L87a
            java.lang.String r9 = r6.getName()
            r0.put(r9, r6)
        L87a:
            int r5 = r5 + 1
            goto L862
        L87d:
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d50 r1 = new d50
            r2 = 25
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L89f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8ba
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L89f
            r2.add(r3)
            goto L89f
        L8ba:
            return r2
        L8bb:
            r5 = r32
            org.luckypray.dexkit.DexKitBridge r5 = (org.luckypray.dexkit.DexKitBridge) r5
            r5.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.AbstractC0279fb.f3856
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = p000.AbstractC0279fb.f3859
            java.util.Iterator r2 = r2.iterator()
        L8cf:
            boolean r3 = r2.hasNext()
            java.lang.ClassLoader r6 = r0.f1599
            java.lang.String r7 = "cause by"
            java.lang.String r8 = "visibility update from"
            if (r3 == 0) goto L8fc
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String[] r9 = new java.lang.String[]{r13, r4}
            java.util.List r9 = p000.AbstractC1021yh.m6897(r9)
            java.lang.String[] r7 = new java.lang.String[]{r8, r7}
            java.util.List r10 = p000.AbstractC1021yh.m6897(r7)
            java.lang.String r8 = "void"
            r7 = r3
            java.util.List r3 = p000.AbstractC0279fb.m2079(r5, r6, r7, r8, r9, r10)
            r1.addAll(r3)
            goto L8cf
        L8fc:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L958
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L90b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L924
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.AbstractC0279fb.m2088(r3)
            r4 = 1500(0x5dc, float:2.102E-42)
            if (r3 < r4) goto L90b
            r0.add(r2)
            goto L90b
        L924:
            d50 r1 = new d50
            r2 = 10
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L93d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9cc
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.AbstractC0279fb.m2084(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L93d
            r2.add(r3)
            goto L93d
        L958:
            java.lang.String[] r0 = new java.lang.String[]{r13, r4}
            java.util.List r9 = p000.AbstractC1021yh.m6897(r0)
            java.lang.String[] r0 = new java.lang.String[]{r8, r7}
            java.util.List r10 = p000.AbstractC1021yh.m6897(r0)
            r7 = 0
            java.lang.String r8 = "void"
            java.util.List r0 = p000.AbstractC0279fb.m2079(r5, r6, r7, r8, r9, r10)
            r1.addAll(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L97b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L994
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.AbstractC0279fb.m2088(r3)
            r4 = 800(0x320, float:1.121E-42)
            if (r3 < r4) goto L97b
            r0.add(r2)
            goto L97b
        L994:
            d50 r1 = new d50
            r2 = 11
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L9ad:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9c8
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.AbstractC0279fb.m2084(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L9ad
            r2.add(r3)
            goto L9ad
        L9c8:
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r15)
        L9cc:
            return r2
        L9cd:
            r3 = r32
            org.luckypray.dexkit.DexKitBridge r3 = (org.luckypray.dexkit.DexKitBridge) r3
            r3.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.AbstractC0279fb.f3856
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = p000.AbstractC0279fb.f3859
            java.util.Iterator r2 = r2.iterator()
        L9e1:
            boolean r5 = r2.hasNext()
            java.lang.ClassLoader r6 = r0.f1599
            java.lang.String r7 = "height is"
            java.lang.String r8 = "requestLayout from"
            if (r5 == 0) goto La10
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String[] r9 = new java.lang.String[]{r13, r4}
            java.util.List r9 = p000.AbstractC1021yh.m6897(r9)
            java.lang.String[] r7 = new java.lang.String[]{r8, r7}
            java.util.List r10 = p000.AbstractC1021yh.m6897(r7)
            java.lang.String r8 = "void"
            r7 = r5
            r5 = r3
            java.util.List r3 = p000.AbstractC0279fb.m2079(r5, r6, r7, r8, r9, r10)
            r1.addAll(r3)
            r3 = r5
            goto L9e1
        La10:
            r5 = r3
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La6d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        La20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La39
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.AbstractC0279fb.m2088(r3)
            r4 = 1500(0x5dc, float:2.102E-42)
            if (r3 < r4) goto La20
            r0.add(r2)
            goto La20
        La39:
            d50 r1 = new d50
            r2 = 8
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        La52:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae4
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.AbstractC0279fb.m2084(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto La52
            r2.add(r3)
            goto La52
        La6d:
            java.lang.String[] r0 = new java.lang.String[]{r13, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.lang.String[] r2 = new java.lang.String[]{r8, r7}
            java.util.List r8 = p000.AbstractC1021yh.m6897(r2)
            r3 = r5
            r5 = 0
            r4 = r6
            java.lang.String r6 = "void"
            r7 = r0
            java.util.List r0 = p000.AbstractC0279fb.m2079(r3, r4, r5, r6, r7, r8)
            r1.addAll(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        La93:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laac
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.AbstractC0279fb.m2088(r3)
            r4 = 800(0x320, float:1.121E-42)
            if (r3 < r4) goto La93
            r0.add(r2)
            goto La93
        Laac:
            d50 r1 = new d50
            r2 = 9
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lac5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae0
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.AbstractC0279fb.m2084(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto Lac5
            r2.add(r3)
            goto Lac5
        Lae0:
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r15)
        Lae4:
            return r2
        Lae5:
            r3 = r32
            org.luckypray.dexkit.DexKitBridge r3 = (org.luckypray.dexkit.DexKitBridge) r3
            r3.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.AbstractC0279fb.f3856
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = p000.AbstractC0279fb.f3858
            java.util.Iterator r2 = r2.iterator()
        Laf9:
            boolean r4 = r2.hasNext()
            r5 = r4
            java.lang.ClassLoader r4 = r0.f1599
            jz r8 = p000.C0450jz.f5672
            java.lang.String r6 = "boolean"
            if (r5 == 0) goto Lb1e
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String[] r6 = new java.lang.String[]{r13, r13, r6}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r6)
            java.lang.String r6 = "java.lang.Boolean"
            java.util.List r4 = p000.AbstractC0279fb.m2079(r3, r4, r5, r6, r7, r8)
            r1.addAll(r4)
            goto Laf9
        Lb1e:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb7a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lb2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb46
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.AbstractC0279fb.m2089(r3)
            r4 = 1800(0x708, float:2.522E-42)
            if (r3 < r4) goto Lb2d
            r0.add(r2)
            goto Lb2d
        Lb46:
            d50 r1 = new d50
            r2 = 12
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb5f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbe6
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.AbstractC0279fb.m2084(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto Lb5f
            r2.add(r3)
            goto Lb5f
        Lb7a:
            java.lang.String[] r0 = new java.lang.String[]{r13, r13, r6}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r0)
            r5 = 0
            java.lang.String r6 = "java.lang.Boolean"
            java.util.List r0 = p000.AbstractC0279fb.m2079(r3, r4, r5, r6, r7, r8)
            r1.addAll(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lb95:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbae
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r3 = p000.AbstractC0279fb.m2089(r3)
            r4 = 1200(0x4b0, float:1.682E-42)
            if (r3 < r4) goto Lb95
            r0.add(r2)
            goto Lb95
        Lbae:
            d50 r1 = new d50
            r2 = 13
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lbc7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lbe2
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = p000.AbstractC0279fb.m2084(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto Lbc7
            r2.add(r3)
            goto Lbc7
        Lbe2:
            java.util.List r2 = p000.AbstractC0984xh.m6662(r2, r15)
        Lbe6:
            return r2
    }
}
