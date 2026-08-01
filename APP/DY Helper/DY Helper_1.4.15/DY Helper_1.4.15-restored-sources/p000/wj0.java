package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11743;

    public /* synthetic */ wj0(int r1) {
            r0 = this;
            r0.f11743 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r0 = r0.f11743
            java.lang.String r1 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13462F13C8FD278512E981CB013C5C5C9450412A36D5EFF6CF526A8C7D6454A342B959326"
            java.lang.String r2 = "int"
            r3 = 1
            r4 = 0
            s62 r5 = p000.s62.f9751
            switch(r0) {
                case 0: goto L2c7;
                case 1: goto L2b3;
                case 2: goto L29b;
                case 3: goto L25e;
                case 4: goto L250;
                case 5: goto L23e;
                case 6: goto L230;
                case 7: goto L21e;
                case 8: goto L202;
                case 9: goto L1ef;
                case 10: goto L1c8;
                case 11: goto L1b7;
                case 12: goto L18a;
                case 13: goto L178;
                case 14: goto L166;
                case 15: goto L141;
                case 16: goto L11f;
                case 17: goto L114;
                case 18: goto L10b;
                case 19: goto Lf9;
                case 20: goto Lde;
                case 21: goto Ld9;
                case 22: goto Lc8;
                case 23: goto L71;
                case 24: goto L62;
                case 25: goto L40;
                case 26: goto L33;
                case 27: goto L27;
                case 28: goto L1b;
                default: goto Lf;
            }
        Lf:
            r0 = r20
            java.lang.Class r0 = (java.lang.Class) r0
            r0.getClass()
            java.lang.String r0 = r0.getName()
            return r0
        L1b:
            r0 = r20
            java.lang.Class r0 = (java.lang.Class) r0
            r0.getClass()
            java.lang.String r0 = r0.getName()
            return r0
        L27:
            r0 = r20
            java.lang.Class r0 = (java.lang.Class) r0
            r0.getClass()
            java.lang.String r0 = r0.getName()
            return r0
        L33:
            r0 = r20
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            java.util.Set r1 = p000.cp0.f2703
            p000.cp0.m1605(r0, r4)
            return r5
        L40:
            r0 = r20
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            qx r1 = new qx
            java.lang.Object r2 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6293
            java.lang.String r2 = p000.C0666ox.m4306(r2, r0)
            r20 r3 = new r20
            r4 = 23
            r3.<init>(r0, r4)
            java.lang.String r0 = "定位全屏观看入口模块"
            r1.<init>(r2, r0, r3)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            return r0
        L62:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.String r0 = r0.getName()
            r0.getClass()
            return r0
        L71:
            r0 = r20
            java.lang.String r0 = (java.lang.String) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.il0.f5108
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 42
            if (r1 == r2) goto L9f
            r2 = 1645195852(0x620fb24c, float:6.62683E20)
            if (r1 == r2) goto L96
            r2 = 1858479982(0x6ec6276e, float:3.066285E28)
            if (r1 == r2) goto L8d
            goto Lc7
        L8d:
            java.lang.String r1 = "immersive_navigation_bar_enabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La7
            goto Lc7
        L96:
            java.lang.String r1 = "immersive_status_bar_enabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La7
            goto Lc7
        L9f:
            java.lang.String r1 = "*"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc7
        La7:
            java.util.Set r0 = p000.il0.f5109
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lb2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc7
            java.lang.Object r1 = r0.next()
            android.app.Activity r1 = (android.app.Activity) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.il0.f5108
            r1.getClass()     // Catch: java.lang.Throwable -> Lb2
            p000.il0.m2760(r1)     // Catch: java.lang.Throwable -> Lb2
            goto Lb2
        Lc7:
            return r5
        Lc8:
            r0 = r20
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Ld3
            goto Ld4
        Ld3:
            r3 = r4
        Ld4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        Ld9:
            r0 = r20
            bh1 r0 = (p000.bh1) r0
            return r5
        Lde:
            r6 = r20
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r6.getClass()
            r10 = 6
            r11 = 0
            java.lang.String r7 = "long"
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = p000.bk0.f1763
            r1 = 0
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r6.paramTypes(r0)
            return r5
        Lf9:
            r0 = r20
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            wj0 r1 = new wj0
            r2 = 20
            r1.<init>(r2)
            r0.matcher(r1)
            return r5
        L10b:
            r0 = r20
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            return r0
        L114:
            r0 = r20
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            p000.bk0.m968(r0)
            return r5
        L11f:
            r0 = r20
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            qx r1 = new qx
            java.lang.Object r2 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6286
            java.lang.String r2 = p000.C0666ox.m4320(r2, r0)
            r20 r3 = new r20
            r4 = 22
            r3.<init>(r0, r4)
            java.lang.String r0 = "定位私信状态上报发送入口"
            r1.<init>(r2, r0, r3)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            return r0
        L141:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L161
            java.lang.Class r0 = r0.getDeclaringClass()
            r0.getClass()
            boolean r0 = p000.C0966x.m6451(r0)
            if (r0 == 0) goto L160
            goto L161
        L160:
            r3 = r4
        L161:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L166:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            zj0 r1 = p000.zj0.f13118
            boolean r0 = p000.zj0.m7154(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L178:
            r0 = r20
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            wj0 r1 = new wj0
            r2 = 8
            r1.<init>(r2)
            r0.matcher(r1)
            return r5
        L18a:
            r6 = r20
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r6.getClass()
            java.lang.String r0 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"
            java.lang.String r7 = p000.jf0.m2957(r0)
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r6, r7, r8, r9, r10, r11)
            java.lang.String r7 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r6, r7, r8, r9, r10, r11)
            java.lang.String r11 = "long"
            java.lang.String r12 = "boolean"
            java.lang.String r7 = "int"
            java.lang.String r8 = "int"
            java.lang.String r9 = "int"
            java.lang.String r10 = "int"
            java.lang.String[] r0 = new java.lang.String[]{r7, r8, r9, r10, r11, r12}
            r6.paramTypes(r0)
            return r5
        L1b7:
            r7 = r20
            org.luckypray.dexkit.query.matchers.MethodMatcher r7 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r7
            r7.getClass()
            r11 = 6
            r12 = 0
            java.lang.String r8 = "java.util.Map"
            r9 = 0
            r10 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r7, r8, r9, r10, r11, r12)
            return r5
        L1c8:
            r13 = r20
            org.luckypray.dexkit.query.matchers.MethodMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r13
            r13.getClass()
            r17 = 6
            r18 = 0
            java.lang.String r14 = "void"
            r15 = 0
            r16 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r13, r14, r15, r16, r17, r18)
            java.lang.String r10 = "long"
            java.lang.String r11 = "boolean"
            java.lang.String r6 = "int"
            java.lang.String r7 = "int"
            java.lang.String r8 = "int"
            java.lang.String r9 = "int"
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r8, r9, r10, r11}
            r13.paramTypes(r0)
            return r5
        L1ef:
            r6 = r20
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r6.getClass()
            java.lang.String r7 = p000.jf0.m2957(r1)
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r6, r7, r8, r9, r10, r11)
            return r5
        L202:
            r12 = r20
            org.luckypray.dexkit.query.matchers.MethodMatcher r12 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r12
            r12.getClass()
            r16 = 6
            r17 = 0
            java.lang.String r13 = "void"
            r14 = 0
            r15 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = "boolean"
            java.lang.String[] r0 = new java.lang.String[]{r2, r2, r0}
            r12.paramTypes(r0)
            return r5
        L21e:
            r0 = r20
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            fj0 r1 = new fj0
            r2 = 29
            r1.<init>(r2)
            r0.matcher(r1)
            return r5
        L230:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            zj0 r1 = p000.zj0.f13118
            java.lang.String r0 = p000.zj0.m7135(r0)
            return r0
        L23e:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            zj0 r1 = p000.zj0.f13118
            boolean r0 = p000.zj0.m7139(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L250:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            zj0 r1 = p000.zj0.f13118
            java.lang.String r0 = p000.zj0.m7135(r0)
            return r0
        L25e:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.Class r2 = r0.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = p000.jf0.m2957(r1)
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L296
            java.lang.Class r0 = r0.getReturnType()
            r0.getClass()
            java.lang.String r2 = r0.getName()
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L28e
            r0 = r3
            goto L292
        L28e:
            boolean r0 = p000.C0966x.m6451(r0)
        L292:
            if (r0 == 0) goto L295
            goto L296
        L295:
            r3 = r4
        L296:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L29b:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L2ad
            goto L2ae
        L2ad:
            r3 = r4
        L2ae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L2b3:
            r0 = r20
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2c7:
            r0 = r20
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            wj0 r1 = new wj0
            r2 = 9
            r1.<init>(r2)
            r0.matcher(r1)
            return r5
    }
}
