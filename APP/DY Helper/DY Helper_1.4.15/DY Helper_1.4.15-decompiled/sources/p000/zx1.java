package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zx1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13348;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f13349;

    public /* synthetic */ zx1(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f13348 = r2
            r0.f13349 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ zx1(p000.m82 r1, java.lang.ClassLoader r2) {
            r0 = this;
            r1 = 16
            r0.f13348 = r1
            r0.<init>()
            r0.f13349 = r2
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f13348
            r1 = 12
            r2 = 10
            r3 = 9
            r4 = 8
            r5 = 6
            r6 = 5
            r7 = 0
            jz r8 = p000.C0450jz.f5672
            r9 = 0
            java.lang.ClassLoader r12 = r12.f13349
            switch(r0) {
                case 0: goto L52b;
                case 1: goto L51b;
                case 2: goto L3c3;
                case 3: goto L3b3;
                case 4: goto L170;
                case 5: goto L160;
                case 6: goto L150;
                case 7: goto L140;
                case 8: goto L130;
                case 9: goto L120;
                case 10: goto L110;
                case 11: goto L100;
                case 12: goto Lf0;
                case 13: goto Le0;
                case 14: goto Ld0;
                case 15: goto Lb7;
                default: goto L15;
            }
        L15:
            org.luckypray.dexkit.DexKitBridge r13 = (org.luckypray.dexkit.DexKitBridge) r13
            r13.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            j72 r1 = new j72
            r2 = 19
            r1.<init>(r2)
            org.luckypray.dexkit.result.MethodDataList r13 = r13.findMethod(r1)
            java.util.Iterator r13 = r13.iterator()
        L2e:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r13.next()
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1
            p000.m82.m3792(r0, r12, r1)
            org.luckypray.dexkit.result.MethodDataList r1 = r1.getInvokes()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r1.next()
            r4 = r3
            org.luckypray.dexkit.result.MethodData r4 = (org.luckypray.dexkit.result.MethodData) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L62
            goto L4a
        L62:
            int r5 = r4.getParamCount()
            if (r5 != 0) goto L4a
            java.lang.String r5 = r4.getReturnTypeName()
            java.lang.String r6 = "java.util.List"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 != 0) goto L75
            goto L4a
        L75:
            java.lang.String r5 = r4.getDeclaredClassName()
            java.lang.String r6 = "java."
            boolean r5 = p000.x02.m6485(r5, r6, r7)
            if (r5 != 0) goto L4a
            java.lang.String r4 = r4.getDeclaredClassName()
            java.lang.String r5 = "kotlin."
            boolean r4 = p000.x02.m6485(r4, r5, r7)
            if (r4 != 0) goto L4a
            r2.add(r3)
            goto L4a
        L91:
            java.util.Iterator r1 = r2.iterator()
        L95:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            p000.m82.m3792(r0, r12, r2)
            goto L95
        La5:
            java.util.Collection r12 = r0.values()
            r12.getClass()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r12 = p000.AbstractC0984xh.m6666(r12)
            java.util.ArrayList r12 = p000.m82.m3793(r12)
            return r12
        Lb7:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            ry1 r0 = p000.ry1.f9602
            java.lang.Class r0 = r13.getReturnType()
            r0.getClass()
            int r12 = p000.ry1.m5282(r0, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            l91 r0 = new l91
            r0.<init>(r13, r12)
            return r0
        Ld0:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            ry1 r0 = p000.ry1.f9602
            r13.getClass()
            boolean r12 = p000.ry1.m5272(r12, r13)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        Le0:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5280(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        Lf0:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5279(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L100:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5281(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L110:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5280(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L120:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5280(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L130:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5281(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L140:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5281(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L150:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5279(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L160:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5279(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L170:
            org.luckypray.dexkit.DexKitBridge r13 = (org.luckypray.dexkit.DexKitBridge) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            ay1 r1 = new ay1     // Catch: java.lang.Throwable -> L1a5
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1a5
            org.luckypray.dexkit.result.MethodDataList r1 = r13.findMethod(r1)     // Catch: java.lang.Throwable -> L1a5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a5
            r2.<init>()     // Catch: java.lang.Throwable -> L1a5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a5
        L18f:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a5
            if (r3 == 0) goto L1ab
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1a5
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L1a5
            java.lang.reflect.Method r3 = r3.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L1a5
            if (r3 == 0) goto L18f
            r2.add(r3)     // Catch: java.lang.Throwable -> L1a5
            goto L18f
        L1a5:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
        L1ab:
            boolean r1 = r2 instanceof p000.eo1
            if (r1 == 0) goto L1b0
            r2 = r8
        L1b0:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r1 = r2.iterator()
        L1b6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1ca
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r2 = r2.getDeclaringClass()
            p000.ry1.m5225(r12, r0, r2)
            goto L1b6
        L1ca:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L22e
            ay1 r1 = new ay1     // Catch: java.lang.Throwable -> L1f9
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f9
            org.luckypray.dexkit.result.MethodDataList r1 = r13.findMethod(r1)     // Catch: java.lang.Throwable -> L1f9
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f9
            r2.<init>()     // Catch: java.lang.Throwable -> L1f9
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f9
        L1e3:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f9
            if (r3 == 0) goto L1ff
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1f9
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L1f9
            java.lang.reflect.Method r3 = r3.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L1f9
            if (r3 == 0) goto L1e3
            r2.add(r3)     // Catch: java.lang.Throwable -> L1f9
            goto L1e3
        L1f9:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
        L1ff:
            boolean r1 = r2 instanceof p000.eo1
            if (r1 == 0) goto L204
            r2 = r8
        L204:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r1 = r2.iterator()
        L20a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22e
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r3 = r2.getReturnType()
            java.lang.String r3 = r3.getName()
            java.lang.String r10 = p000.ry1.f9616
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L20a
            java.lang.Class r2 = r2.getDeclaringClass()
            p000.ry1.m5225(r12, r0, r2)
            goto L20a
        L22e:
            boolean r1 = r0.isEmpty()
            r2 = 2000(0x7d0, float:2.803E-42)
            if (r1 == 0) goto L297
            ay1 r1 = new ay1     // Catch: java.lang.Throwable -> L25f
            r3 = 4
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L25f
            org.luckypray.dexkit.result.MethodDataList r1 = r13.findMethod(r1)     // Catch: java.lang.Throwable -> L25f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25f
            r3.<init>()     // Catch: java.lang.Throwable -> L25f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25f
        L249:
            boolean r10 = r1.hasNext()     // Catch: java.lang.Throwable -> L25f
            if (r10 == 0) goto L265
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L25f
            org.luckypray.dexkit.result.MethodData r10 = (org.luckypray.dexkit.result.MethodData) r10     // Catch: java.lang.Throwable -> L25f
            java.lang.reflect.Method r10 = r10.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L25f
            if (r10 == 0) goto L249
            r3.add(r10)     // Catch: java.lang.Throwable -> L25f
            goto L249
        L25f:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
        L265:
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L26a
            r3 = r8
        L26a:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r1 = r3.iterator()
        L270:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L297
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L27f
            goto L270
        L27f:
            boolean r10 = p000.ry1.m5272(r12, r3)
            if (r10 != 0) goto L286
            goto L270
        L286:
            java.lang.Class r3 = r3.getDeclaringClass()
            r3.getClass()
            int r10 = p000.ry1.m5281(r3, r12)
            if (r10 < r2) goto L270
            r0.add(r3)
            goto L270
        L297:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L317
            ay1 r1 = new ay1     // Catch: java.lang.Throwable -> L2c6
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2c6
            org.luckypray.dexkit.result.MethodDataList r1 = r13.findMethod(r1)     // Catch: java.lang.Throwable -> L2c6
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c6
            r3.<init>()     // Catch: java.lang.Throwable -> L2c6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2c6
        L2af:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L2c6
            if (r6 == 0) goto L2d4
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L2c6
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L2c6
            java.lang.reflect.Method r6 = r6.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L2c6
            if (r6 == 0) goto L2c8
            java.lang.Class r6 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L2c6
            goto L2c9
        L2c6:
            r1 = move-exception
            goto L2cf
        L2c8:
            r6 = r9
        L2c9:
            if (r6 == 0) goto L2af
            r3.add(r6)     // Catch: java.lang.Throwable -> L2c6
            goto L2af
        L2cf:
            eo1 r3 = new eo1
            r3.<init>(r1)
        L2d4:
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L2d9
            r3 = r8
        L2d9:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r1 = r3.iterator()
        L2df:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L317
            java.lang.Object r3 = r1.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.reflect.Constructor[] r3 = r3.getDeclaredConstructors()
            r3.getClass()
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            ay1 r6 = new ay1
            r6.<init>(r5)
            c40 r10 = new c40
            vs1 r11 = p000.vs1.f11382
            r10.<init>(r3, r6, r11)
            x30 r3 = new x30
            r3.<init>(r10)
        L307:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L2df
            java.lang.Object r6 = r3.next()
            java.lang.Class r6 = (java.lang.Class) r6
            p000.ry1.m5225(r12, r0, r6)
            goto L307
        L317:
            boolean r1 = r0.isEmpty()
            r3 = 7
            if (r1 == 0) goto L385
            ay1 r1 = new ay1     // Catch: java.lang.Throwable -> L347
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L347
            org.luckypray.dexkit.result.MethodDataList r13 = r13.findMethod(r1)     // Catch: java.lang.Throwable -> L347
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L347
            r1.<init>()     // Catch: java.lang.Throwable -> L347
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L347
        L330:
            boolean r5 = r13.hasNext()     // Catch: java.lang.Throwable -> L347
            if (r5 == 0) goto L355
            java.lang.Object r5 = r13.next()     // Catch: java.lang.Throwable -> L347
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5     // Catch: java.lang.Throwable -> L347
            java.lang.reflect.Method r5 = r5.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L347
            if (r5 == 0) goto L349
            java.lang.Class r5 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L347
            goto L34a
        L347:
            r13 = move-exception
            goto L350
        L349:
            r5 = r9
        L34a:
            if (r5 == 0) goto L330
            r1.add(r5)     // Catch: java.lang.Throwable -> L347
            goto L330
        L350:
            eo1 r1 = new eo1
            r1.<init>(r13)
        L355:
            boolean r13 = r1 instanceof p000.eo1
            if (r13 == 0) goto L35a
            goto L35b
        L35a:
            r8 = r1
        L35b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r13 = r8.iterator()
        L361:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L385
            java.lang.Object r1 = r13.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r1.getEnclosingClass()
            if (r1 == 0) goto L361
            java.lang.Class[] r1 = r1.getDeclaredClasses()
            if (r1 == 0) goto L361
            int r5 = r1.length
            r6 = r7
        L37b:
            if (r6 >= r5) goto L361
            r8 = r1[r6]
            p000.ry1.m5225(r12, r0, r8)
            int r6 = r6 + 1
            goto L37b
        L385:
            zx1 r13 = new zx1
            r1 = 11
            r13.<init>(r12, r1)
            java.util.List r13 = p000.ry1.m5234(r0, r2, r13)
            zx1 r0 = new zx1
            r0.<init>(r12, r3)
            java.util.List r13 = p000.ry1.m5234(r13, r2, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L3b2
            java.lang.String[] r13 = p000.ry1.f9613
            java.lang.Class r13 = p000.ry1.m5273(r12, r13)
            java.util.List r13 = p000.AbstractC1021yh.m6898(r13)
            zx1 r0 = new zx1
            r0.<init>(r12, r4)
            java.util.List r13 = p000.ry1.m5234(r13, r2, r0)
        L3b2:
            return r13
        L3b3:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5281(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L3c3:
            org.luckypray.dexkit.DexKitBridge r13 = (org.luckypray.dexkit.DexKitBridge) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            ay1 r7 = new ay1     // Catch: java.lang.Throwable -> L3f8
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L3f8
            org.luckypray.dexkit.result.MethodDataList r4 = r13.findMethod(r7)     // Catch: java.lang.Throwable -> L3f8
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f8
            r7.<init>()     // Catch: java.lang.Throwable -> L3f8
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3f8
        L3e1:
            boolean r10 = r4.hasNext()     // Catch: java.lang.Throwable -> L3f8
            if (r10 == 0) goto L406
            java.lang.Object r10 = r4.next()     // Catch: java.lang.Throwable -> L3f8
            org.luckypray.dexkit.result.MethodData r10 = (org.luckypray.dexkit.result.MethodData) r10     // Catch: java.lang.Throwable -> L3f8
            java.lang.reflect.Method r10 = r10.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L3f8
            if (r10 == 0) goto L3fa
            java.lang.Class r10 = r10.getDeclaringClass()     // Catch: java.lang.Throwable -> L3f8
            goto L3fb
        L3f8:
            r4 = move-exception
            goto L401
        L3fa:
            r10 = r9
        L3fb:
            if (r10 == 0) goto L3e1
            r7.add(r10)     // Catch: java.lang.Throwable -> L3f8
            goto L3e1
        L401:
            eo1 r7 = new eo1
            r7.<init>(r4)
        L406:
            boolean r4 = r7 instanceof p000.eo1
            if (r4 == 0) goto L40b
            r7 = r8
        L40b:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r4 = r7.iterator()
        L411:
            boolean r7 = r4.hasNext()
            r10 = 1800(0x708, float:2.522E-42)
            if (r7 == 0) goto L42c
            java.lang.Object r7 = r4.next()
            java.lang.Class r7 = (java.lang.Class) r7
            if (r7 != 0) goto L422
            goto L411
        L422:
            int r11 = p000.ry1.m5279(r7, r12)
            if (r11 < r10) goto L411
            r0.add(r7)
            goto L411
        L42c:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L48d
            ay1 r4 = new ay1     // Catch: java.lang.Throwable -> L45b
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L45b
            org.luckypray.dexkit.result.MethodDataList r3 = r13.findMethod(r4)     // Catch: java.lang.Throwable -> L45b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L45b
            r4.<init>()     // Catch: java.lang.Throwable -> L45b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L45b
        L444:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L45b
            if (r7 == 0) goto L469
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L45b
            org.luckypray.dexkit.result.MethodData r7 = (org.luckypray.dexkit.result.MethodData) r7     // Catch: java.lang.Throwable -> L45b
            java.lang.reflect.Method r7 = r7.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L45b
            if (r7 == 0) goto L45d
            java.lang.Class r7 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L45b
            goto L45e
        L45b:
            r3 = move-exception
            goto L464
        L45d:
            r7 = r9
        L45e:
            if (r7 == 0) goto L444
            r4.add(r7)     // Catch: java.lang.Throwable -> L45b
            goto L444
        L464:
            eo1 r4 = new eo1
            r4.<init>(r3)
        L469:
            boolean r3 = r4 instanceof p000.eo1
            if (r3 == 0) goto L46e
            r4 = r8
        L46e:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r3 = r4.iterator()
        L474:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L48d
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 != 0) goto L483
            goto L474
        L483:
            int r7 = p000.ry1.m5279(r4, r12)
            if (r7 < r10) goto L474
            r0.add(r4)
            goto L474
        L48d:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L4ef
            ay1 r3 = new ay1     // Catch: java.lang.Throwable -> L4bc
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4bc
            org.luckypray.dexkit.result.MethodDataList r13 = r13.findMethod(r3)     // Catch: java.lang.Throwable -> L4bc
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4bc
            r2.<init>()     // Catch: java.lang.Throwable -> L4bc
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L4bc
        L4a5:
            boolean r3 = r13.hasNext()     // Catch: java.lang.Throwable -> L4bc
            if (r3 == 0) goto L4ca
            java.lang.Object r3 = r13.next()     // Catch: java.lang.Throwable -> L4bc
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3     // Catch: java.lang.Throwable -> L4bc
            java.lang.reflect.Method r3 = r3.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L4bc
            if (r3 == 0) goto L4be
            java.lang.Class r3 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> L4bc
            goto L4bf
        L4bc:
            r13 = move-exception
            goto L4c5
        L4be:
            r3 = r9
        L4bf:
            if (r3 == 0) goto L4a5
            r2.add(r3)     // Catch: java.lang.Throwable -> L4bc
            goto L4a5
        L4c5:
            eo1 r2 = new eo1
            r2.<init>(r13)
        L4ca:
            boolean r13 = r2 instanceof p000.eo1
            if (r13 == 0) goto L4cf
            goto L4d0
        L4cf:
            r8 = r2
        L4d0:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r13 = r8.iterator()
        L4d6:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L4ef
            java.lang.Object r2 = r13.next()
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L4e5
            goto L4d6
        L4e5:
            int r3 = p000.ry1.m5279(r2, r12)
            if (r3 < r10) goto L4d6
            r0.add(r2)
            goto L4d6
        L4ef:
            zx1 r13 = new zx1
            r13.<init>(r12, r1)
            java.util.List r13 = p000.ry1.m5234(r0, r10, r13)
            zx1 r0 = new zx1
            r0.<init>(r12, r6)
            java.util.List r13 = p000.ry1.m5234(r13, r10, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L51a
            java.lang.String[] r13 = p000.ry1.f9615
            java.lang.Class r13 = p000.ry1.m5273(r12, r13)
            java.util.List r13 = p000.AbstractC1021yh.m6898(r13)
            zx1 r0 = new zx1
            r0.<init>(r12, r5)
            java.util.List r13 = p000.ry1.m5234(r13, r10, r0)
        L51a:
            return r13
        L51b:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            int r12 = p000.ry1.m5279(r13, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
        L52b:
            org.luckypray.dexkit.DexKitBridge r13 = (org.luckypray.dexkit.DexKitBridge) r13
            r13.getClass()
            ry1 r0 = p000.ry1.f9602
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            ay1 r4 = new ay1     // Catch: java.lang.Throwable -> L560
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L560
            org.luckypray.dexkit.result.MethodDataList r1 = r13.findMethod(r4)     // Catch: java.lang.Throwable -> L560
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L560
            r4.<init>()     // Catch: java.lang.Throwable -> L560
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L560
        L549:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L560
            if (r5 == 0) goto L56e
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L560
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5     // Catch: java.lang.Throwable -> L560
            java.lang.reflect.Method r5 = r5.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L560
            if (r5 == 0) goto L562
            java.lang.Class r5 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L560
            goto L563
        L560:
            r1 = move-exception
            goto L569
        L562:
            r5 = r9
        L563:
            if (r5 == 0) goto L549
            r4.add(r5)     // Catch: java.lang.Throwable -> L560
            goto L549
        L569:
            eo1 r4 = new eo1
            r4.<init>(r1)
        L56e:
            boolean r1 = r4 instanceof p000.eo1
            if (r1 == 0) goto L573
            r4 = r8
        L573:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r1 = r4.iterator()
        L579:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L589
            java.lang.Object r4 = r1.next()
            java.lang.Class r4 = (java.lang.Class) r4
            p000.ry1.m5224(r12, r0, r4)
            goto L579
        L589:
            r1 = 13
            ay1 r4 = new ay1     // Catch: java.lang.Throwable -> L5b4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5b4
            org.luckypray.dexkit.result.MethodDataList r4 = r13.findMethod(r4)     // Catch: java.lang.Throwable -> L5b4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b4
            r5.<init>()     // Catch: java.lang.Throwable -> L5b4
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L5b4
        L59d:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L5b4
            if (r6 == 0) goto L5c2
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L5b4
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L5b4
            java.lang.reflect.Method r6 = r6.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L5b4
            if (r6 == 0) goto L5b6
            java.lang.Class r6 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L5b4
            goto L5b7
        L5b4:
            r4 = move-exception
            goto L5bd
        L5b6:
            r6 = r9
        L5b7:
            if (r6 == 0) goto L59d
            r5.add(r6)     // Catch: java.lang.Throwable -> L5b4
            goto L59d
        L5bd:
            eo1 r5 = new eo1
            r5.<init>(r4)
        L5c2:
            boolean r4 = r5 instanceof p000.eo1
            if (r4 == 0) goto L5c7
            r5 = r8
        L5c7:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L5cd:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5dd
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            p000.ry1.m5224(r12, r0, r5)
            goto L5cd
        L5dd:
            ay1 r4 = new ay1     // Catch: java.lang.Throwable -> L608
            r5 = 14
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L608
            org.luckypray.dexkit.result.MethodDataList r4 = r13.findMethod(r4)     // Catch: java.lang.Throwable -> L608
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L608
            r5.<init>()     // Catch: java.lang.Throwable -> L608
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L608
        L5f1:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L608
            if (r6 == 0) goto L616
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L608
            org.luckypray.dexkit.result.MethodData r6 = (org.luckypray.dexkit.result.MethodData) r6     // Catch: java.lang.Throwable -> L608
            java.lang.reflect.Method r6 = r6.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L608
            if (r6 == 0) goto L60a
            java.lang.Class r6 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L608
            goto L60b
        L608:
            r4 = move-exception
            goto L611
        L60a:
            r6 = r9
        L60b:
            if (r6 == 0) goto L5f1
            r5.add(r6)     // Catch: java.lang.Throwable -> L608
            goto L5f1
        L611:
            eo1 r5 = new eo1
            r5.<init>(r4)
        L616:
            boolean r4 = r5 instanceof p000.eo1
            if (r4 == 0) goto L61b
            r5 = r8
        L61b:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r4 = r5.iterator()
        L621:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L631
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            p000.ry1.m5224(r12, r0, r5)
            goto L621
        L631:
            ay1 r4 = new ay1     // Catch: java.lang.Throwable -> L65c
            r5 = 15
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L65c
            org.luckypray.dexkit.result.MethodDataList r13 = r13.findMethod(r4)     // Catch: java.lang.Throwable -> L65c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L65c
            r4.<init>()     // Catch: java.lang.Throwable -> L65c
            java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> L65c
        L645:
            boolean r5 = r13.hasNext()     // Catch: java.lang.Throwable -> L65c
            if (r5 == 0) goto L66a
            java.lang.Object r5 = r13.next()     // Catch: java.lang.Throwable -> L65c
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5     // Catch: java.lang.Throwable -> L65c
            java.lang.reflect.Method r5 = r5.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L65c
            if (r5 == 0) goto L65e
            java.lang.Class r5 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L65c
            goto L65f
        L65c:
            r13 = move-exception
            goto L665
        L65e:
            r5 = r9
        L65f:
            if (r5 == 0) goto L645
            r4.add(r5)     // Catch: java.lang.Throwable -> L65c
            goto L645
        L665:
            eo1 r4 = new eo1
            r4.<init>(r13)
        L66a:
            boolean r13 = r4 instanceof p000.eo1
            if (r13 == 0) goto L66f
            goto L670
        L66f:
            r8 = r4
        L670:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r13 = r8.iterator()
        L676:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L6b8
            java.lang.Object r4 = r13.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.util.ArrayList r4 = p000.ry1.m5205(r4)
            f7 r5 = new f7
            r6 = 1
            r5.<init>(r6, r4)
            ay1 r4 = new ay1
            r7 = 16
            r4.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r5, r6, r4)
            ay1 r4 = new ay1
            r5 = 17
            r4.<init>(r5)
            y30 r4 = p000.us1.m5943(r7, r4)
            x30 r5 = new x30
            r5.<init>(r4)
        L6a8:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L676
            java.lang.Object r4 = r5.next()
            java.lang.Class r4 = (java.lang.Class) r4
            p000.ry1.m5224(r12, r0, r4)
            goto L6a8
        L6b8:
            zx1 r13 = new zx1
            r13.<init>(r12, r1)
            r1 = 1500(0x5dc, float:2.102E-42)
            java.util.List r13 = p000.ry1.m5234(r0, r1, r13)
            zx1 r0 = new zx1
            r0.<init>(r12, r3)
            java.util.List r13 = p000.ry1.m5234(r13, r1, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L6e5
            java.lang.String[] r13 = p000.ry1.f9614
            java.lang.Class r13 = p000.ry1.m5273(r12, r13)
            java.util.List r13 = p000.AbstractC1021yh.m6898(r13)
            zx1 r0 = new zx1
            r0.<init>(r12, r2)
            java.util.List r13 = p000.ry1.m5234(r13, r1, r0)
        L6e5:
            return r13
    }
}
