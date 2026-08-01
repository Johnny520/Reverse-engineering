package p000;

/* JADX INFO: renamed from: we */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0944we implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11687;

    public /* synthetic */ C0944we(int r1) {
            r0 = this;
            r0.f11687 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0944we(p000.C0467kf r1, int r2) {
            r0 = this;
            r0.f11687 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r15) {
            r14 = this;
            int r14 = r14.f11687
            java.lang.String r0 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"
            java.lang.String r1 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            r2 = 3
            r3 = 0
            r4 = 1
            s62 r5 = p000.s62.f9751
            switch(r14) {
                case 0: goto L2f3;
                case 1: goto L2d8;
                case 2: goto L2b0;
                case 3: goto L290;
                case 4: goto L285;
                case 5: goto L276;
                case 6: goto L25a;
                case 7: goto L24c;
                case 8: goto L232;
                case 9: goto L1ee;
                case 10: goto L1cb;
                case 11: goto L1aa;
                case 12: goto L19a;
                case 13: goto L162;
                case 14: goto L144;
                case 15: goto L13a;
                case 16: goto L12a;
                case 17: goto L11c;
                case 18: goto Lfc;
                case 19: goto Lf1;
                case 20: goto Lcb;
                case 21: goto Lbb;
                case 22: goto L90;
                case 23: goto L7f;
                case 24: goto L78;
                case 25: goto L66;
                case 26: goto L59;
                case 27: goto L52;
                case 28: goto L1c;
                default: goto Le;
            }
        Le:
            org.luckypray.dexkit.query.FindMethod r15 = (org.luckypray.dexkit.query.FindMethod) r15
            r15.getClass()
            gh r14 = new gh
            r14.<init>(r4)
            r15.matcher(r14)
            return r5
        L1c:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.String r14 = r15.getName()
            java.lang.String r0 = "isPlaying"
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 == 0) goto L4d
            java.lang.Class[] r14 = r15.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto L4d
            java.lang.Class r14 = r15.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 != 0) goto L4c
            java.lang.Class r14 = r15.getReturnType()
            java.lang.Class<java.lang.Boolean> r15 = java.lang.Boolean.class
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto L4d
        L4c:
            r3 = r4
        L4d:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L52:
            java.lang.Class r15 = (java.lang.Class) r15
            java.lang.String r14 = r15.getName()
            return r14
        L59:
            java.lang.String r15 = (java.lang.String) r15
            r15.getClass()
            tg r14 = p000.AbstractC0871ug.f10771
            java.lang.String r14 = "PrefsManager"
            p000.C0834tg.m5649(r15, r14)
            return r5
        L66:
            java.lang.String r15 = (java.lang.String) r15
            r15.getClass()
            tg r14 = p000.AbstractC0871ug.f10771
            android.os.Handler r14 = p000.AbstractC0871ug.f10780
            s0 r15 = new s0
            r15.<init>(r2)
            r14.post(r15)
            return r5
        L78:
            java.lang.Class r15 = (java.lang.Class) r15
            java.lang.String r14 = r15.getName()
            return r14
        L7f:
            java.lang.ref.WeakReference r15 = (java.lang.ref.WeakReference) r15
            r15.getClass()
            java.lang.Object r14 = r15.get()
            if (r14 != 0) goto L8b
            r3 = r4
        L8b:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L90:
            mq r15 = (p000.C0558mq) r15
            if (r15 == 0) goto La0
            long r14 = r15.f7247
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            java.lang.String r14 = r14.toString()
            if (r14 != 0) goto La2
        La0:
            java.lang.String r14 = "none"
        La2:
            ea r15 = new ea
            r15.<init>(r14, r4)
            android.os.Looper r14 = android.os.Looper.myLooper()
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            android.os.Looper r1 = r0.getLooper()
            if (r14 != r1) goto Lb7
            r15.run()
            goto Lba
        Lb7:
            r0.post(r15)
        Lba:
            return r5
        Lbb:
            org.luckypray.dexkit.query.FindClass r15 = (org.luckypray.dexkit.query.FindClass) r15
            r15.getClass()
            we r14 = new we
            r0 = 14
            r14.<init>(r0)
            r15.matcher(r14)
            return r5
        Lcb:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            int r14 = r15.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 != 0) goto Lec
            java.lang.Class[] r14 = r15.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto Lec
            java.lang.Class r14 = r15.getReturnType()
            boolean r14 = r14.isEnum()
            if (r14 == 0) goto Lec
            r3 = r4
        Lec:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        Lf1:
            java.lang.ClassLoader r15 = (java.lang.ClassLoader) r15
            r15.getClass()
            tg r14 = p000.AbstractC0871ug.f10771
            p000.C0834tg.m5638(r15)
            return r5
        Lfc:
            java.lang.ClassLoader r15 = (java.lang.ClassLoader) r15
            r15.getClass()
            qx r14 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6263
            java.lang.String r0 = p000.C0666ox.m4306(r0, r15)
            cb r1 = new cb
            r2 = 9
            r1.<init>(r15, r2)
            java.lang.String r15 = "定位清爽模式底栏杂项注册器"
            r14.<init>(r0, r15, r1)
            java.util.List r14 = p000.AbstractC1021yh.m6896(r14)
            return r14
        L11c:
            org.luckypray.dexkit.query.matchers.MethodMatcher r15 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r15
            r15.getClass()
            java.lang.Class<android.view.View> r14 = android.view.View.class
            r15.returnType(r14)
            r15.paramCount(r2)
            return r5
        L12a:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r15 = (org.luckypray.dexkit.query.matchers.MethodsMatcher) r15
            r15.getClass()
            we r14 = new we
            r0 = 17
            r14.<init>(r0)
            r15.add(r14)
            return r5
        L13a:
            java.lang.Class r15 = (java.lang.Class) r15
            r15.getClass()
            java.lang.String r14 = r15.getName()
            return r14
        L144:
            r6 = r15
            org.luckypray.dexkit.query.matchers.ClassMatcher r6 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r6
            r6.getClass()
            java.lang.String r14 = "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314028F5A6C96A968724110CE5DD878D6654DCD64D754A5F498DF2F177829ACF900101545BD428"
            java.lang.String r7 = p000.jf0.m2957(r14)
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher.addInterface$default(r6, r7, r8, r9, r10, r11)
            we r14 = new we
            r15 = 16
            r14.<init>(r15)
            r6.methods(r14)
            return r5
        L162:
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            java.lang.Class r14 = r15.getType()
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 != 0) goto L194
            java.lang.Class r14 = r15.getType()
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 != 0) goto L194
            java.lang.Class r14 = r15.getType()
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 != 0) goto L194
            java.lang.Class r14 = r15.getType()
            java.lang.Class<java.lang.Long> r15 = java.lang.Long.class
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto L195
        L194:
            r3 = r4
        L195:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L19a:
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            int r14 = r15.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            r14 = r14 ^ r4
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L1aa:
            r15.getClass()
            java.lang.Class r14 = r15.getClass()
            java.lang.String r0 = "duration"
            boolean r14 = p000.C0467kf.m3223(r14, r0)
            if (r14 == 0) goto L1c6
            java.lang.Class r14 = r15.getClass()
            java.lang.String r15 = "LJIIIIZZ"
            boolean r14 = p000.C0467kf.m3223(r14, r15)
            if (r14 == 0) goto L1c6
            r3 = r4
        L1c6:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L1cb:
            r15.getClass()
            java.lang.Class r14 = r15.getClass()
            java.lang.reflect.Method r15 = p000.C0467kf.m3221(r14)
            if (r15 == 0) goto L1e9
            java.lang.String r15 = "getDuration"
            java.lang.reflect.Method r15 = p000.C0467kf.m3217(r14, r15)
            if (r15 == 0) goto L1e9
            java.lang.String r15 = "currentPosition"
            java.lang.reflect.Method r14 = p000.C0467kf.m3217(r14, r15)
            if (r14 == 0) goto L1e9
            r3 = r4
        L1e9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L1ee:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r15.getClass()
            int r14 = r15.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 != 0) goto L22d
            java.lang.Class r14 = r15.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 == 0) goto L22d
            java.lang.Class[] r14 = r15.getParameterTypes()
            int r14 = r14.length
            if (r14 != r4) goto L22d
            java.lang.Class[] r14 = r15.getParameterTypes()
            r14 = r14[r3]
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r14 = p000.ln0.m3626(r14, r0)
            if (r14 != 0) goto L22c
            java.lang.Class[] r14 = r15.getParameterTypes()
            r14 = r14[r3]
            java.lang.Class<java.lang.Float> r15 = java.lang.Float.class
            boolean r14 = p000.ln0.m3626(r14, r15)
            if (r14 == 0) goto L22d
        L22c:
            r3 = r4
        L22d:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            return r14
        L232:
            r15.getClass()
            java.lang.Class r14 = r15.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = "~78E784A121CC4D4A76A82A6412191AC853CB05E0BEF16A4FCD52E9EDE594B1EB7A26029BA8545F3C7E30A101FAD966DF810DCD83CF069660D5377A43BED0508D947414BCADFE80D1D63722F51F5BE5BECF12C2F147A77F50B5412A90"
            java.lang.String r15 = p000.jf0.m2957(r15)
            boolean r14 = r14.equals(r15)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L24c:
            r15.getClass()
            kf r14 = p000.C0467kf.f5879
            boolean r14 = p000.C0467kf.m3225(r15)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L25a:
            org.luckypray.dexkit.query.matchers.MethodMatcher r15 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r15
            r15.getClass()
            java.lang.String r6 = p000.jf0.m2957(r1)
            java.lang.String r11 = "int"
            r12 = 0
            java.lang.String r7 = "long"
            java.lang.String r8 = "boolean"
            java.lang.String r9 = "boolean"
            java.lang.String r10 = "boolean"
            java.lang.String[] r14 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            r15.paramTypes(r14)
            return r5
        L276:
            org.luckypray.dexkit.query.FindMethod r15 = (org.luckypray.dexkit.query.FindMethod) r15
            r15.getClass()
            we r14 = new we
            r0 = 6
            r14.<init>(r0)
            r15.matcher(r14)
            return r5
        L285:
            java.lang.ClassLoader r15 = (java.lang.ClassLoader) r15
            r15.getClass()
            af r14 = p000.C0016af.f205
            r14.m102(r15)
            return r5
        L290:
            java.lang.ClassLoader r15 = (java.lang.ClassLoader) r15
            r15.getClass()
            qx r14 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6248
            java.lang.String r0 = p000.C0666ox.m4320(r0, r15)
            cb r1 = new cb
            r2 = 8
            r1.<init>(r15, r2)
            java.lang.String r15 = "定位 39.3 及以上视频章节广告自动跳过逻辑"
            r14.<init>(r0, r15, r1)
            java.util.List r14 = p000.AbstractC1021yh.m6896(r14)
            return r14
        L2b0:
            r6 = r15
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r6.getClass()
            java.lang.String r7 = p000.jf0.m2957(r0)
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r6, r7, r8, r9, r10, r11)
            java.lang.String r7 = p000.jf0.m2957(r1)
            java.lang.String r12 = "int"
            r13 = 0
            java.lang.String r8 = "long"
            java.lang.String r9 = "boolean"
            java.lang.String r10 = "boolean"
            java.lang.String r11 = "boolean"
            java.lang.String[] r14 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13}
            r6.paramTypes(r14)
            return r5
        L2d8:
            r7 = r15
            org.luckypray.dexkit.query.matchers.MethodMatcher r7 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r7
            r7.getClass()
            java.lang.String r8 = p000.jf0.m2957(r0)
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = "enter_auto_skip_marketing_chapter"
            java.lang.String[] r14 = new java.lang.String[]{r14}
            r7.usingStrings(r14)
            return r5
        L2f3:
            org.luckypray.dexkit.query.FindMethod r15 = (org.luckypray.dexkit.query.FindMethod) r15
            r15.getClass()
            we r14 = new we
            r0 = 2
            r14.<init>(r0)
            r15.matcher(r14)
            return r5
    }
}
