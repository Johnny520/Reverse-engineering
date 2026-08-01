package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9386;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f9387;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Class f9388;

    public /* synthetic */ rj0(java.lang.Class r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 2
            r1.f9386 = r0
            r1.<init>()
            r1.f9388 = r2
            r1.f9387 = r3
            return
    }

    public /* synthetic */ rj0(java.lang.ClassLoader r1, java.lang.Class r2, int r3) {
            r0 = this;
            r0.f9386 = r3
            r0.f9387 = r1
            r0.f9388 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f9386
            r1 = 0
            java.lang.ClassLoader r2 = r8.f9387
            java.lang.Class r8 = r8.f9388
            switch(r0) {
                case 0: goto Lae;
                case 1: goto L1a;
                default: goto La;
            }
        La:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.getClass()
            ry1 r0 = p000.ry1.f9602
            boolean r8 = p000.ry1.m5268(r9, r8, r2)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L1a:
            org.luckypray.dexkit.DexKitBridge r9 = (org.luckypray.dexkit.DexKitBridge) r9
            r9.getClass()
            cj1 r0 = p000.cj1.f2169
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r3 = p000.cj1.f2170
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            yh0 r5 = new yh0     // Catch: java.lang.Throwable -> L7b
            r6 = 13
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L7b
            org.luckypray.dexkit.result.MethodDataList r4 = r9.findMethod(r5)     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L7b
        L47:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L7b
            org.luckypray.dexkit.result.MethodData r5 = (org.luckypray.dexkit.result.MethodData) r5     // Catch: java.lang.Throwable -> L7b
            java.lang.reflect.Method r5 = r5.getMethodInstance(r2)     // Catch: java.lang.Throwable -> L58
            goto L5f
        L58:
            r5 = move-exception
            eo1 r6 = new eo1     // Catch: java.lang.Throwable -> L7b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L7b
            r5 = r6
        L5f:
            boolean r6 = r5 instanceof p000.eo1     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L64
            r5 = r1
        L64:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto L69
            goto L47
        L69:
            boolean r6 = p000.cj1.m1226(r8, r5)     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L47
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = p000.cj1.m1235(r5)     // Catch: java.lang.Throwable -> L7b
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L7b
            goto L47
        L7b:
            r4 = move-exception
            goto L80
        L7d:
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L7b
            goto L86
        L80:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L86:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L2c
            r4.getMessage()
            int r4 = com.example.dyhelper.MainHook.f2222
            goto L2c
        L92:
            java.util.Collection r8 = r0.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            ib1 r9 = new ib1
            cj1 r0 = p000.cj1.f2169
            r0 = 22
            r9.<init>(r0)
            java.util.List r8 = p000.AbstractC0984xh.m6658(r8, r9)
            r9 = 3
            java.util.List r8 = p000.AbstractC0984xh.m6662(r8, r9)
            return r8
        Lae:
            org.luckypray.dexkit.DexKitBridge r9 = (org.luckypray.dexkit.DexKitBridge) r9
            r9.getClass()
            vj0 r0 = p000.vj0.f11310
            t00 r0 = new t00     // Catch: java.lang.Throwable -> Led
            r3 = 5
            r0.<init>(r8, r3)     // Catch: java.lang.Throwable -> Led
            org.luckypray.dexkit.result.FieldDataList r9 = r9.findField(r0)     // Catch: java.lang.Throwable -> Led
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Led
            r0.<init>()     // Catch: java.lang.Throwable -> Led
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Led
        Lc8:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r3 == 0) goto Lf0
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> Led
            org.luckypray.dexkit.result.FieldData r3 = (org.luckypray.dexkit.result.FieldData) r3     // Catch: java.lang.Throwable -> Led
            java.lang.reflect.Field r3 = r3.getFieldInstance(r2)     // Catch: java.lang.Throwable -> Ld9
            goto Le0
        Ld9:
            r3 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> Led
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Led
            r3 = r4
        Le0:
            boolean r4 = r3 instanceof p000.eo1     // Catch: java.lang.Throwable -> Led
            if (r4 == 0) goto Le5
            r3 = r1
        Le5:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> Led
            if (r3 == 0) goto Lc8
            r0.add(r3)     // Catch: java.lang.Throwable -> Led
            goto Lc8
        Led:
            r8 = move-exception
            goto L1a5
        Lf0:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Led
            r9.<init>()     // Catch: java.lang.Throwable -> Led
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Led
        Lf9:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r2 == 0) goto L11a
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Led
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> Led
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> Led
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> Led
            if (r4 == 0) goto Lf9
            java.lang.Object r3 = p000.vj0.m6257(r3, r8)     // Catch: java.lang.Throwable -> Led
            if (r3 == 0) goto Lf9
            r9.add(r2)     // Catch: java.lang.Throwable -> Led
            goto Lf9
        L11a:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> Led
            r0.<init>()     // Catch: java.lang.Throwable -> Led
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Led
            r2.<init>()     // Catch: java.lang.Throwable -> Led
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Led
        L128:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r3 == 0) goto L16f
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> Led
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> Led
            java.lang.Class r5 = r4.getDeclaringClass()     // Catch: java.lang.Throwable -> Led
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Led
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> Led
            java.lang.Class r4 = r4.getType()     // Catch: java.lang.Throwable -> Led
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> Led
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r7.<init>()     // Catch: java.lang.Throwable -> Led
            r7.append(r5)     // Catch: java.lang.Throwable -> Led
            java.lang.String r5 = "#"
            r7.append(r5)     // Catch: java.lang.Throwable -> Led
            r7.append(r6)     // Catch: java.lang.Throwable -> Led
            java.lang.String r5 = ":"
            r7.append(r5)     // Catch: java.lang.Throwable -> Led
            r7.append(r4)     // Catch: java.lang.Throwable -> Led
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> Led
            boolean r4 = r0.add(r4)     // Catch: java.lang.Throwable -> Led
            if (r4 == 0) goto L128
            r2.add(r3)     // Catch: java.lang.Throwable -> Led
            goto L128
        L16f:
            java.util.Iterator r9 = r2.iterator()     // Catch: java.lang.Throwable -> Led
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L17b
            r0 = r1
            goto L1a2
        L17b:
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> Led
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto L186
            goto L1a2
        L186:
            r2 = r0
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> Led
            int r2 = p000.vj0.m6263(r2, r8)     // Catch: java.lang.Throwable -> Led
        L18d:
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> Led
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> Led
            int r4 = p000.vj0.m6263(r4, r8)     // Catch: java.lang.Throwable -> Led
            if (r2 >= r4) goto L19c
            r0 = r3
            r2 = r4
        L19c:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r3 != 0) goto L18d
        L1a2:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> Led
            goto L1aa
        L1a5:
            eo1 r0 = new eo1
            r0.<init>(r8)
        L1aa:
            java.lang.Throwable r8 = p000.fo1.m2190(r0)
            if (r8 == 0) goto L1c3
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r9 = "DexKit 定位通知 API 字段失败 type="
            java.lang.String r8 = r9.concat(r8)
            java.lang.String r9 = "r52bdfd08354d522"
            p000.C0888ux.m5975(r9, r8)
        L1c3:
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L1c8
            goto L1c9
        L1c8:
            r1 = r0
        L1c9:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            return r1
    }
}
