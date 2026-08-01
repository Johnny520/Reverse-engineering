package p000;

/* JADX INFO: renamed from: lx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0528lx implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6829;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f6830;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.C0448jx f6831;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.EnumC0491kx f6832;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.String f6833;

    public /* synthetic */ C0528lx(p000.a80 r1, p000.C0448jx r2, p000.EnumC0491kx r3, java.lang.String r4, int r5) {
            r0 = this;
            r0.f6829 = r5
            r0.f6830 = r1
            r0.f6831 = r2
            r0.f6832 = r3
            r0.f6833 = r4
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r24) {
            r23 = this;
            r0 = r23
            int r1 = r0.f6829
            java.lang.String r2 = ", count="
            java.lang.String r4 = "#"
            java.lang.String r6 = r0.f6833
            kx r7 = r0.f6832
            jx r8 = r0.f6831
            a80 r0 = r0.f6830
            switch(r1) {
                case 0: goto L19e;
                case 1: goto L118;
                default: goto L13;
            }
        L13:
            r1 = r24
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.lang.Object r0 = r0.invoke(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L97
            java.lang.Object r10 = r0.next()
            r12 = r10
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.String r13 = p000.lz1.m3694(r12)
            java.lang.String r14 = r12.getName()
            java.lang.String r15 = p000.lz1.m3690(r14, r12)
            java.lang.Class[] r11 = r12.getParameterTypes()
            r11.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r11.length
            r3.<init>(r5)
            int r5 = r11.length
            r24 = r0
            r0 = 0
        L58:
            if (r0 >= r5) goto L6a
            r16 = r5
            r5 = r11[r0]
            r17 = r11
            r11 = 1
            int r0 = p000.lz1.m3679(r5, r3, r0, r11)
            r5 = r16
            r11 = r17
            goto L58
        L6a:
            int r0 = r12.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r21 = 0
            r22 = 62
            java.lang.String r17 = ","
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r3
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = "("
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r13, r4, r14, r3, r0)
            java.lang.String r3 = "):"
            boolean r0 = p000.lz1.m3673(r0, r3, r15, r1)
            if (r0 == 0) goto L94
            r9.add(r10)
        L94:
            r0 = r24
            goto L2e
        L97:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r9.iterator()
        La6:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lf0
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r11 = p000.lz1.m3694(r3)
            java.lang.String r12 = r3.getName()
            java.lang.String r13 = p000.lz1.m3690(r12, r3)
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            int r5 = r4.length
            r14.<init>(r5)
            int r5 = r4.length
            r10 = 0
        Lcd:
            if (r10 >= r5) goto Ldb
            r15 = r4[r10]
            r24 = r1
            r1 = 1
            int r10 = p000.lz1.m3679(r15, r14, r10, r1)
            r1 = r24
            goto Lcd
        Ldb:
            r24 = r1
            int r1 = r3.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r1)
            sx r10 = new sx
            r10.<init>(r11, r12, r13, r14, r15)
            r0.add(r10)
            r1 = r24
            goto La6
        Lf0:
            r8.m3009(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0666ox.f8306
            r0.put(r6, r9)
            java.lang.Object r0 = p000.C0666ox.f8297
            java.lang.String r0 = r7.f6296
            int r1 = r9.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DexKit query methods done, key="
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            p000.C0666ox.m4319(r0)
            return r9
        L118:
            java.lang.String r1 = r7.f6296
            r2 = r24
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2
            java.lang.Object r3 = p000.C0666ox.f8297
            r2.getClass()
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L194
            r11 = 1
            r0.setAccessible(r11)
            java.lang.Class r2 = r0.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r0.getName()
            r3.getClass()
            java.lang.Class r5 = r0.getType()
            java.lang.String r5 = r5.getName()
            r8.getClass()
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r9 = "className"
            org.json.JSONObject r2 = r7.put(r9, r2)
            java.lang.String r7 = "fieldName"
            org.json.JSONObject r2 = r2.put(r7, r3)
            java.lang.String r3 = "fieldType"
            org.json.JSONObject r2 = r2.put(r3, r5)
            java.lang.String r3 = "data_"
            java.lang.String r3 = r3.concat(r1)
            java.lang.String r2 = r2.toString()
            r2.getClass()
            r8.m3010(r3, r2)
            java.util.concurrent.ConcurrentHashMap r2 = p000.C0666ox.f8308
            r2.put(r6, r0)
            java.lang.Class r2 = r0.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = r0.getName()
            java.lang.String r5 = "DexKit query field done, key="
            java.lang.String r6 = ", field="
            java.lang.StringBuilder r1 = p000.lz1.m3695(r5, r1, r6, r2, r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            p000.C0666ox.m4319(r1)
            goto L19d
        L194:
            java.lang.String r2 = "DexKit query field empty, key="
            java.lang.String r1 = r2.concat(r1)
            p000.C0666ox.m4319(r1)
        L19d:
            return r0
        L19e:
            r1 = r24
            org.luckypray.dexkit.DexKitBridge r1 = (org.luckypray.dexkit.DexKitBridge) r1
            r1.getClass()
            java.lang.Object r0 = r0.invoke(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1d4
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L1b9
            r3.add(r4)
            goto L1b9
        L1d4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r3.iterator()
        L1e3:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1ff
            java.lang.Object r4 = r1.next()
            java.lang.Class r4 = (java.lang.Class) r4
            r4.getClass()
            cx r5 = new cx
            java.lang.String r4 = r4.getName()
            r5.<init>(r4)
            r0.add(r5)
            goto L1e3
        L1ff:
            r8.m3008(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0666ox.f8307
            r0.put(r6, r3)
            java.lang.Object r0 = p000.C0666ox.f8297
            java.lang.String r0 = r7.f6296
            int r1 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DexKit query classes done, key="
            r4.<init>(r5)
            r4.append(r0)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            p000.C0666ox.m4319(r0)
            return r3
    }
}
