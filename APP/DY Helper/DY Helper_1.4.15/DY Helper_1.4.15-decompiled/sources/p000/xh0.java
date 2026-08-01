package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xh0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12173;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ org.luckypray.dexkit.DexKitBridge f12174;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.ClassLoader f12175;

    public /* synthetic */ xh0(org.luckypray.dexkit.DexKitBridge r1, java.lang.ClassLoader r2, int r3) {
            r0 = this;
            r0.f12173 = r3
            r0.f12174 = r1
            r0.f12175 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r15 = this;
            int r0 = r15.f12173
            switch(r0) {
                case 0: goto L15e;
                case 1: goto L12f;
                case 2: goto L100;
                case 3: goto Ld1;
                case 4: goto L64;
                default: goto L5;
            }
        L5:
            java.lang.ClassLoader r1 = r15.f12175
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = r2.create()
            java.lang.String r2 = "~7960BFBA1EAA71B0B732B18FE89CA2FF26F0CCD4E71A81346E342129B47B739A3B2D48C3DA9AAF9220E9711072E13CC575B2E01DD4BE17141FE081E0C3"
            java.lang.String r4 = p000.jf0.m2957(r2)
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r9 = org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r3, r4, r5, r6, r7, r8)
            r13 = 6
            r14 = 0
            java.lang.String r10 = "void"
            r11 = 0
            r12 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r9, r10, r11, r12, r13, r14)
            org.luckypray.dexkit.query.FindMethod r0 = r0.matcher(r2)
            org.luckypray.dexkit.DexKitBridge r15 = r15.f12174
            org.luckypray.dexkit.result.MethodDataList r15 = r15.findMethod(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r15 = r15.iterator()
        L3e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r15.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r1)     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L56:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L5b
            r0 = 0
        L5b:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L3e
            r2.add(r0)
            goto L3e
        L63:
            return r2
        L64:
            java.lang.ClassLoader r1 = r15.f12175
            org.luckypray.dexkit.query.FindMethod$Companion r0 = org.luckypray.dexkit.query.FindMethod.Companion
            org.luckypray.dexkit.query.FindMethod r0 = r0.create()
            org.luckypray.dexkit.query.matchers.MethodMatcher$Companion r2 = org.luckypray.dexkit.query.matchers.MethodMatcher.Companion
            org.luckypray.dexkit.query.matchers.MethodMatcher r3 = r2.create()
            java.lang.String r2 = "~7960BFBA1EAA71B0B732B18FE89CA2FF26F0CCD4E71A81346E342129B47B739A3B2D48C3DA9AAF9220E9711072E13CC575B2E01DD4BE17141FE081E0C3"
            java.lang.String r4 = p000.jf0.m2957(r2)
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r9 = org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r3, r4, r5, r6, r7, r8)
            r13 = 6
            r14 = 0
            java.lang.String r10 = "void"
            r11 = 0
            r12 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r9, r10, r11, r12, r13, r14)
            java.lang.String r3 = "java.lang.String"
            java.lang.String r4 = "boolean"
            java.lang.String r5 = "long"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r3, r4}
            org.luckypray.dexkit.query.matchers.MethodMatcher r2 = r2.paramTypes(r3)
            org.luckypray.dexkit.query.FindMethod r0 = r0.matcher(r2)
            org.luckypray.dexkit.DexKitBridge r15 = r15.f12174
            org.luckypray.dexkit.result.MethodDataList r15 = r15.findMethod(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r15 = r15.iterator()
        Lab:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Ld0
            java.lang.Object r0 = r15.next()
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0
            java.lang.reflect.Method r0 = r0.getMethodInstance(r1)     // Catch: java.lang.Throwable -> Lbc
            goto Lc3
        Lbc:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        Lc3:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto Lc8
            r0 = 0
        Lc8:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lab
            r2.add(r0)
            goto Lab
        Ld0:
            return r2
        Ld1:
            sh0 r0 = new sh0
            r1 = 10
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge r1 = r15.f12174
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Le7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lff
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.ClassLoader r3 = r15.f12175
            java.lang.reflect.Method r2 = r2.getMethodInstance(r3)
            if (r2 == 0) goto Le7
            r1.add(r2)
            goto Le7
        Lff:
            return r1
        L100:
            sh0 r0 = new sh0
            r1 = 9
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge r1 = r15.f12174
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L116:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L12e
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.ClassLoader r3 = r15.f12175
            java.lang.reflect.Method r2 = r2.getMethodInstance(r3)
            if (r2 == 0) goto L116
            r1.add(r2)
            goto L116
        L12e:
            return r1
        L12f:
            sh0 r0 = new sh0
            r1 = 8
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge r1 = r15.f12174
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L145:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L15d
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.ClassLoader r3 = r15.f12175
            java.lang.reflect.Method r2 = r2.getMethodInstance(r3)
            if (r2 == 0) goto L145
            r1.add(r2)
            goto L145
        L15d:
            return r1
        L15e:
            sh0 r0 = new sh0
            r1 = 11
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge r1 = r15.f12174
            org.luckypray.dexkit.result.MethodDataList r0 = r1.findMethod(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L174:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L18c
            java.lang.Object r2 = r0.next()
            org.luckypray.dexkit.result.MethodData r2 = (org.luckypray.dexkit.result.MethodData) r2
            java.lang.ClassLoader r3 = r15.f12175
            java.lang.reflect.Method r2 = r2.getMethodInstance(r3)
            if (r2 == 0) goto L174
            r1.add(r2)
            goto L174
        L18c:
            return r1
    }
}
