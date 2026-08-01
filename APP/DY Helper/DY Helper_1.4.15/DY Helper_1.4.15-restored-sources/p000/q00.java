package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q00 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8770;

    public /* synthetic */ q00(int r1) {
            r0 = this;
            r0.f8770 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r7 = r7.f8770
            r1 = 0
            r0 = 1
            r2 = 0
            switch(r7) {
                case 0: goto L3a1;
                case 1: goto L381;
                case 2: goto L376;
                case 3: goto L357;
                case 4: goto L344;
                case 5: goto L339;
                case 6: goto L328;
                case 7: goto L309;
                case 8: goto L302;
                case 9: goto L2ce;
                case 10: goto L27e;
                case 11: goto L22a;
                case 12: goto L223;
                case 13: goto L203;
                case 14: goto L1bb;
                case 15: goto L1a9;
                case 16: goto L181;
                case 17: goto L131;
                case 18: goto L114;
                case 19: goto L107;
                case 20: goto Le7;
                case 21: goto Lda;
                case 22: goto Lce;
                case 23: goto Lbc;
                case 24: goto L68;
                case 25: goto L53;
                case 26: goto L33;
                case 27: goto L28;
                case 28: goto L18;
                default: goto L8;
            }
        L8:
            org.luckypray.dexkit.query.FindClass r8 = (org.luckypray.dexkit.query.FindClass) r8
            r8.getClass()
            l20 r7 = new l20
            r7.<init>(r2)
            r8.matcher(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L18:
            org.luckypray.dexkit.query.FindClass r8 = (org.luckypray.dexkit.query.FindClass) r8
            r8.getClass()
            l20 r7 = new l20
            r7.<init>(r0)
            r8.matcher(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L28:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            p000.m20.m3715(r8)
            s62 r7 = p000.s62.f9751
            return r7
        L33:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            qx r7 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6250
            java.lang.String r0 = p000.C0666ox.m4320(r0, r8)
            java.lang.String r1 = "定位 Feed 左右侧长按倍速提供方法"
            cb r2 = new cb
            r3 = 29
            r2.<init>(r8, r3)
            r7.<init>(r0, r1, r2)
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            return r7
        L53:
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r1 = "float"
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            r0.paramTypes()
            s62 r7 = p000.s62.f9751
            return r7
        L68:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            int r7 = r8.hashCode()
            switch(r7) {
                case -1647856287: goto Lab;
                case -535121706: goto La2;
                case 42: goto L99;
                case 576485678: goto L90;
                case 641735157: goto L87;
                case 665786628: goto L7e;
                case 777250700: goto L75;
                default: goto L74;
            }
        L74:
            goto Lb9
        L75:
            java.lang.String r7 = "info_bar_text_format"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto Lb9
            goto Lb4
        L7e:
            java.lang.String r7 = "info_bar_enabled"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto Lb9
        L87:
            java.lang.String r7 = "info_bar_neon_enabled"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto Lb9
        L90:
            java.lang.String r7 = "info_bar_text_color"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto Lb9
        L99:
            java.lang.String r7 = "*"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto Lb9
        La2:
            java.lang.String r7 = "info_bar_text_size"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto Lb9
        Lab:
            java.lang.String r7 = "info_bar_neon_solid_enabled"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Lb4
            goto Lb9
        Lb4:
            com.example.dyhelper.hook.γ r7 = com.example.dyhelper.hook.C0157.f2411
            com.example.dyhelper.hook.C0157.m1499()
        Lb9:
            s62 r7 = p000.s62.f9751
            return r7
        Lbc:
            mq r8 = (p000.C0558mq) r8
            com.example.dyhelper.hook.γ r7 = com.example.dyhelper.hook.C0157.f2411
            if (r8 == 0) goto Lc8
            long r7 = r8.f7247
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
        Lc8:
            com.example.dyhelper.hook.C0157.m1500(r1)
            s62 r7 = p000.s62.f9751
            return r7
        Lce:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            r7 = 46
            java.lang.String r7 = p000.q02.m4687(r8, r7, r8)
            return r7
        Lda:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.n10.f7350
            p000.n10.m3934(r8)
            s62 r7 = p000.s62.f9751
            return r7
        Le7:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            qx r7 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6262
            java.lang.String r0 = p000.C0666ox.m4320(r0, r8)
            java.lang.String r1 = "定位 Feed 关注提交入口"
            cb r2 = new cb
            r3 = 28
            r2.<init>(r8, r3)
            r7.<init>(r0, r1, r2)
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            return r7
        L107:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            i10 r7 = p000.i10.f4867
            r7.m2580()
            s62 r7 = p000.s62.f9751
            return r7
        L114:
            java.lang.String r8 = (java.lang.String) r8
            r8.getClass()
            java.lang.String r7 = "*"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L129
            java.lang.String r7 = "feed_double_tap_like_block_enabled"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L12e
        L129:
            i10 r7 = p000.i10.f4867
            r7.m2580()
        L12e:
            s62 r7 = p000.s62.f9751
            return r7
        L131:
            java.util.List r8 = (java.util.List) r8
            r8.getClass()
            java.lang.Object r7 = p000.g10.f4195
            monitor-enter(r7)
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.g10.f4192     // Catch: java.lang.Throwable -> L178
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L178
            if (r0 != 0) goto L17b
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.g10.f4192     // Catch: java.lang.Throwable -> L178
            p000.g10.m2224(r8)     // Catch: java.lang.Throwable -> L178
            java.lang.Object r8 = p000.AbstractC0984xh.m6640(r8)     // Catch: java.lang.Throwable -> L178
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L178
            if (r8 == 0) goto L17b
            java.lang.Class r8 = r8.getDeclaringClass()     // Catch: java.lang.Throwable -> L178
            if (r8 == 0) goto L17b
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Throwable -> L178
            if (r8 == 0) goto L17b
            c10 r0 = p000.c10.f1928     // Catch: java.lang.Throwable -> L161
            java.util.List r8 = p000.c10.m1100(r8)     // Catch: java.lang.Throwable -> L161
            goto L169
        L161:
            r0 = move-exception
            r8 = r0
            eo1 r0 = new eo1     // Catch: java.lang.Throwable -> L178
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L178
            r8 = r0
        L169:
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L178
            boolean r1 = r8 instanceof p000.eo1     // Catch: java.lang.Throwable -> L178
            if (r1 == 0) goto L170
            r8 = r0
        L170:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L178
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.g10.f4192     // Catch: java.lang.Throwable -> L178
            p000.g10.m2225(r8)     // Catch: java.lang.Throwable -> L178
            goto L17b
        L178:
            r0 = move-exception
            r8 = r0
            goto L17f
        L17b:
            monitor-exit(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L17f:
            monitor-exit(r7)
            throw r8
        L181:
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r7 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"
            java.lang.String r1 = p000.jf0.m2957(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.Class<android.view.MotionEvent> r7 = android.view.MotionEvent.class
            java.lang.String r7 = r7.getName()
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r0.paramTypes(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L1a9:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            q00 r7 = new q00
            r0 = 16
            r7.<init>(r0)
            r8.matcher(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L1bb:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            s62 r7 = p000.s62.f9751
            r8.getClass()
            c10 r0 = p000.c10.f1928
            java.util.List r8 = r0.m1102(r8, r2)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L202
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.c10.f1930
            java.util.Iterator r2 = r0.iterator()
        L1d4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L202
            java.lang.Object r0 = r2.next()
            a80 r0 = (p000.a80) r0
            r0.invoke(r8)     // Catch: java.lang.Throwable -> L1e5
            r3 = r7
            goto L1eb
        L1e5:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
        L1eb:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 == 0) goto L1d4
            java.lang.String r3 = "rc8611bc391e3e31b"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "通知双击入口解析结果失败: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            r4 = 4
            p000.C0888ux.m5988(r3, r0, r1, r4, r1)
            goto L1d4
        L202:
            return r7
        L203:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            qx r7 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6194
            java.lang.String r0 = p000.C0666ox.m4320(r0, r8)
            java.lang.String r1 = "定位 Feed 原生双击点赞入口"
            cb r2 = new cb
            r3 = 27
            r2.<init>(r8, r3)
            r7.<init>(r0, r1, r2)
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            return r7
        L223:
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.String r7 = r8.getSimpleName()
            return r7
        L22a:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            s62 r7 = p000.s62.f9751
            r8.getClass()
            x00 r1 = p000.x00.f11959
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L267
            java.lang.String r1 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L267
            java.lang.Class r1 = p000.qe0.m4876(r8, r1)     // Catch: java.lang.Throwable -> L267
            java.lang.String r3 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r3 = p000.jf0.m2957(r3)     // Catch: java.lang.Throwable -> L267
            java.lang.Class r3 = p000.qe0.m4876(r8, r3)     // Catch: java.lang.Throwable -> L267
            java.lang.reflect.Method r4 = p000.x00.m6470(r1, r0)     // Catch: java.lang.Throwable -> L267
            if (r4 != 0) goto L250
            goto L27d
        L250:
            java.lang.reflect.Method r1 = p000.x00.m6470(r1, r2)     // Catch: java.lang.Throwable -> L267
            if (r1 != 0) goto L257
            goto L27d
        L257:
            java.util.List r5 = p000.x00.m6469(r8, r0, r2)     // Catch: java.lang.Throwable -> L267
            p000.x00.m6463(r5, r4, r0, r3)     // Catch: java.lang.Throwable -> L267
            java.util.List r8 = p000.x00.m6469(r8, r2, r2)     // Catch: java.lang.Throwable -> L267
            p000.x00.m6463(r8, r1, r2, r3)     // Catch: java.lang.Throwable -> L267
            r0 = r7
            goto L26e
        L267:
            r0 = move-exception
            r8 = r0
            eo1 r0 = new eo1
            r0.<init>(r8)
        L26e:
            java.lang.Throwable r8 = p000.fo1.m2190(r0)
            if (r8 == 0) goto L27d
            java.lang.String r8 = r8.getMessage()
            java.lang.String r0 = "r3785f68dc0e82f54"
            p000.AbstractC0602nx.m4142(r0, r8)
        L27d:
            return r7
        L27e:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Boolean[] r7 = new java.lang.Boolean[]{r7, r0}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L29e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L2cd
            java.lang.Object r1 = r7.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            x00 r3 = p000.x00.f11959
            if (r1 == 0) goto L2b5
            kx r3 = p000.EnumC0491kx.f6169
            goto L2b7
        L2b5:
            kx r3 = p000.EnumC0491kx.f6170
        L2b7:
            qx r4 = new qx
            java.lang.Object r5 = p000.C0666ox.f8297
            java.lang.String r5 = p000.C0666ox.m4320(r3, r8)
            java.lang.String r3 = r3.f6297
            v00 r6 = new v00
            r6.<init>(r8, r1, r2)
            r4.<init>(r5, r3, r6)
            r0.add(r4)
            goto L29e
        L2cd:
            return r0
        L2ce:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r7 = r8.getName()
            java.lang.Class[] r8 = r8.getParameterTypes()
            r8.getClass()
            q00 r0 = new q00
            r2 = 12
            r0.<init>(r2)
            r2 = 31
            java.lang.String r8 = p000.AbstractC0312g7.m2256(r8, r1, r1, r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "("
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
        L302:
            java.lang.Class r8 = (java.lang.Class) r8
            java.lang.String r7 = r8.getName()
            return r7
        L309:
            r0 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r0.getClass()
            java.lang.String r7 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950A26F12973BD1F55377227BCD8D5E99"
            java.lang.String r1 = p000.jf0.m2957(r7)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r1 = p000.jf0.m2957(r7)
            org.luckypray.dexkit.query.matchers.FieldMatcher.type$default(r0, r1, r2, r3, r4, r5)
            s62 r7 = p000.s62.f9751
            return r7
        L328:
            org.luckypray.dexkit.query.FindField r8 = (org.luckypray.dexkit.query.FindField) r8
            r8.getClass()
            q00 r7 = new q00
            r0 = 7
            r7.<init>(r0)
            r8.matcher(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L339:
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            r8.getClass()
            r8.setAccessible(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L344:
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            r8.getClass()
            int r7 = r8.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            r7 = r7 ^ r0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L357:
            java.lang.Class r8 = (java.lang.Class) r8
            r8.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L361:
            if (r8 == 0) goto L370
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L370
            java.lang.Class r8 = p000.lz1.m3684(r8, r7)
            goto L361
        L370:
            f7 r8 = new f7
            r8.<init>(r0, r7)
            return r8
        L376:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            p000.u00.m5771(r8, r2)
            s62 r7 = p000.s62.f9751
            return r7
        L381:
            java.lang.ClassLoader r8 = (java.lang.ClassLoader) r8
            r8.getClass()
            qx r7 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6204
            java.lang.String r0 = p000.C0666ox.m4311(r0, r8)
            java.lang.String r1 = "定位 Feed ViewHolder 当前作品字段"
            cb r2 = new cb
            r3 = 26
            r2.<init>(r8, r3)
            r7.<init>(r0, r1, r2)
            java.util.List r7 = p000.AbstractC1021yh.m6896(r7)
            return r7
        L3a1:
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            r8.getClass()
            int r7 = r8.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L3c0
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.s00.f9638
            java.lang.Class r7 = r8.getType()
            r7.getClass()
            boolean r7 = p000.s00.m5312(r7)
            if (r7 == 0) goto L3c0
            goto L3c1
        L3c0:
            r0 = r2
        L3c1:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
    }
}
