package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s20 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9687;

    public /* synthetic */ s20(int r1) {
            r0 = this;
            r0.f9687 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r12 = r12.f9687
            r0 = 8
            r1 = 7
            r2 = 0
            r3 = 1
            switch(r12) {
                case 0: goto L368;
                case 1: goto L345;
                case 2: goto L33e;
                case 3: goto L32d;
                case 4: goto L308;
                case 5: goto L2f7;
                case 6: goto L2d9;
                case 7: goto L2c9;
                case 8: goto L2b8;
                case 9: goto L284;
                case 10: goto L279;
                case 11: goto L26f;
                case 12: goto L268;
                case 13: goto L255;
                case 14: goto L24a;
                case 15: goto L237;
                case 16: goto L1f0;
                case 17: goto L1ac;
                case 18: goto L1a4;
                case 19: goto L15d;
                case 20: goto L152;
                case 21: goto L107;
                case 22: goto Lea;
                case 23: goto La3;
                case 24: goto L83;
                case 25: goto L5f;
                case 26: goto L2a;
                case 27: goto L23;
                case 28: goto L1c;
                default: goto La;
            }
        La:
            java.lang.Long r13 = (java.lang.Long) r13
            long r12 = r13.longValue()
            r0 = 0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L17
            r2 = r3
        L17:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L1c:
            java.lang.Class r13 = (java.lang.Class) r13
            java.lang.String r12 = r13.getName()
            return r12
        L23:
            java.lang.Class r13 = (java.lang.Class) r13
            java.lang.String r12 = r13.getName()
            return r12
        L2a:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto L5a
            java.lang.Class[] r12 = r13.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto L5a
            java.lang.Class r12 = r13.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r12 = p000.ln0.m3626(r12, r0)
            if (r12 != 0) goto L5a
            java.lang.Class r12 = r13.getReturnType()
            boolean r12 = r12.isPrimitive()
            if (r12 != 0) goto L5a
            r2 = r3
        L5a:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L5f:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.lang.String r12 = "*"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L74
            java.util.Set r12 = p000.jb0.f5410
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L80
        L74:
            java.util.concurrent.ScheduledExecutorService r12 = p000.jb0.f5403
            s0 r13 = new s0
            r0 = 27
            r13.<init>(r0)
            r12.execute(r13)
        L80:
            s62 r12 = p000.s62.f9751
            return r12
        L83:
            java.lang.Object r12 = p000.ax1.f1362
            monitor-enter(r12)
            java.lang.Object r0 = p000.ax1.f1368     // Catch: java.lang.Throwable -> L9a
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L9a
        L8c:
            if (r2 >= r1) goto L9d
            java.lang.Object r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L9a
            a80 r3 = (p000.a80) r3     // Catch: java.lang.Throwable -> L9a
            r3.invoke(r13)     // Catch: java.lang.Throwable -> L9a
            int r2 = r2 + 1
            goto L8c
        L9a:
            r0 = move-exception
            r13 = r0
            goto La1
        L9d:
            monitor-exit(r12)
            s62 r12 = p000.s62.f9751
            return r12
        La1:
            monitor-exit(r12)
            throw r13
        La3:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            java.lang.Class[] r12 = r13.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto Le5
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto Le5
            java.lang.Class r12 = r13.getReturnType()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Le4
            java.lang.Class r12 = r13.getReturnType()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r13 = p000.jf0.m2957(r13)
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto Le5
        Le4:
            r2 = r3
        Le5:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        Lea:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.h30.f4556
            g30[] r12 = p000.g30.values()
            int r0 = r12.length
            r1 = r2
        Lf7:
            if (r1 >= r0) goto L101
            r3 = r12[r1]
            p000.h30.m2348(r3, r13, r2)
            int r1 = r1 + 1
            goto Lf7
        L101:
            p000.h30.m2349(r13, r2)
            s62 r12 = p000.s62.f9751
            return r12
        L107:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            g30[] r12 = p000.g30.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
        L117:
            r3 = 9
            if (r2 >= r1) goto L139
            r4 = r12[r2]
            qx r5 = new qx
            java.lang.Object r6 = p000.C0666ox.f8297
            kx r6 = r4.f4220
            java.lang.String r6 = p000.C0666ox.m4311(r6, r13)
            kx r7 = r4.f4220
            java.lang.String r7 = r7.f6297
            p3 r8 = new p3
            r8.<init>(r4, r3, r13)
            r5.<init>(r6, r7, r8)
            r0.add(r5)
            int r2 = r2 + 1
            goto L117
        L139:
            qx r12 = new qx
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6203
            java.lang.String r1 = p000.C0666ox.m4320(r1, r13)
            java.lang.String r2 = "定位视频播放地址模型 Getter 方法"
            r20 r4 = new r20
            r4.<init>(r13, r3)
            r12.<init>(r1, r2, r4)
            java.util.ArrayList r12 = p000.AbstractC0984xh.m6650(r12, r0)
            return r12
        L152:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            r13.getClass()
            r13.setAccessible(r3)
            s62 r12 = p000.s62.f9751
            return r12
        L15d:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.String r12 = p000.lz1.m3694(r13)
            java.lang.String r0 = r13.getName()
            java.lang.String r1 = p000.lz1.m3690(r0, r13)
            java.lang.Class[] r4 = r13.getParameterTypes()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
        L179:
            if (r2 >= r6) goto L182
            r7 = r4[r2]
            int r2 = p000.lz1.m3679(r7, r5, r2, r3)
            goto L179
        L182:
            int r13 = r13.getModifiers()
            java.lang.reflect.Modifier.isStatic(r13)
            java.lang.String r6 = ","
            r10 = 0
            r11 = 62
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r13 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "#"
            java.lang.String r3 = "("
            java.lang.StringBuilder r12 = p000.AbstractC0602nx.m4138(r12, r2, r0, r3, r13)
            java.lang.String r13 = "):"
            java.lang.String r12 = p000.lz1.m3691(r12, r13, r1)
            return r12
        L1a4:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.setAccessible(r3)
            s62 r12 = p000.s62.f9751
            return r12
        L1ac:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class[] r12 = r13.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto L1eb
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto L1eb
            java.lang.Class r12 = r13.getReturnType()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD8057C9CA539AF329A0030D8C8B05C9AC10C29CF5CAFEBBC86"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L1ea
            java.lang.Class r12 = r13.getReturnType()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"
            java.lang.String r13 = p000.jf0.m2957(r13)
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L1eb
        L1ea:
            r2 = r3
        L1eb:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L1f0:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.String r12 = p000.lz1.m3694(r13)
            java.lang.String r0 = r13.getName()
            java.lang.String r1 = p000.lz1.m3690(r0, r13)
            java.lang.Class[] r4 = r13.getParameterTypes()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
        L20c:
            if (r2 >= r6) goto L215
            r7 = r4[r2]
            int r2 = p000.lz1.m3679(r7, r5, r2, r3)
            goto L20c
        L215:
            int r13 = r13.getModifiers()
            java.lang.reflect.Modifier.isStatic(r13)
            java.lang.String r6 = ","
            r10 = 0
            r11 = 62
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r13 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "#"
            java.lang.String r3 = "("
            java.lang.StringBuilder r12 = p000.AbstractC0602nx.m4138(r12, r2, r0, r3, r13)
            java.lang.String r13 = "):"
            java.lang.String r12 = p000.lz1.m3691(r12, r13, r1)
            return r12
        L237:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            int r12 = p000.h30.m2351(r13)
            r13 = 1800(0x708, float:2.522E-42)
            if (r12 < r13) goto L245
            r2 = r3
        L245:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r2)
            return r12
        L24a:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            r13.setAccessible(r3)
            s62 r12 = p000.s62.f9751
            return r12
        L255:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            r13.getClass()
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            r12 = r12 ^ r3
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L268:
            java.lang.Class r13 = (java.lang.Class) r13
            java.lang.String r12 = r13.getName()
            return r12
        L26f:
            java.lang.Class r13 = (java.lang.Class) r13
            r13.getClass()
            java.lang.String r12 = r13.getName()
            return r12
        L279:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            p000.c30.m1127(r13)
            s62 r12 = p000.s62.f9751
            return r12
        L284:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            qx r12 = new qx
            java.lang.Object r2 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6243
            java.lang.String r2 = p000.C0666ox.m4306(r2, r13)
            java.lang.String r3 = "定位 Feed 右侧控件模块类"
            r20 r4 = new r20
            r4.<init>(r13, r1)
            r12.<init>(r2, r3, r4)
            qx r1 = new qx
            kx r2 = p000.EnumC0491kx.f6187
            java.lang.String r2 = p000.C0666ox.m4306(r2, r13)
            java.lang.String r3 = "定位 Feed 头像扩展 PresenterGroup 类"
            r20 r4 = new r20
            r4.<init>(r13, r0)
            r1.<init>(r2, r3, r4)
            qx[] r12 = new p000.C0740qx[]{r12, r1}
            java.util.List r12 = p000.AbstractC1021yh.m6897(r12)
            return r12
        L2b8:
            org.luckypray.dexkit.query.matchers.MethodMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r13
            r13.getClass()
            java.lang.Class<android.view.View> r12 = android.view.View.class
            r13.returnType(r12)
            r12 = 3
            r13.paramCount(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2c9:
            org.luckypray.dexkit.query.matchers.MethodsMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodsMatcher) r13
            r13.getClass()
            s20 r12 = new s20
            r12.<init>(r0)
            r13.add(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2d9:
            r2 = r13
            org.luckypray.dexkit.query.matchers.ClassMatcher r2 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r2
            r2.getClass()
            java.lang.String r12 = "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314028F5A6C96A968724110CE5DD878D6654DCD64D754A5F498DF2F177829ACF900101545BD428"
            java.lang.String r3 = p000.jf0.m2957(r12)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher.addInterface$default(r2, r3, r4, r5, r6, r7)
            s20 r12 = new s20
            r12.<init>(r1)
            r2.methods(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2f7:
            org.luckypray.dexkit.query.FindClass r13 = (org.luckypray.dexkit.query.FindClass) r13
            r13.getClass()
            s20 r12 = new s20
            r0 = 6
            r12.<init>(r0)
            r13.matcher(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L308:
            android.content.Context r13 = (android.content.Context) r13
            r13.getClass()
            z20 r12 = p000.z20.f12945
            java.lang.String r12 = "auto_scroll_next_enabled"
            boolean r12 = p000.ui1.m5887(r12, r2)
            if (r12 == 0) goto L322
            java.lang.String r12 = "#2F8CFF"
            int r12 = android.graphics.Color.parseColor(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L32c
        L322:
            java.lang.String r12 = "#FFFFFFFF"
            int r12 = android.graphics.Color.parseColor(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L32c:
            return r12
        L32d:
            android.content.Context r13 = (android.content.Context) r13
            r13.getClass()
            z20 r12 = p000.z20.f12945
            r12 = 2131230903(0x7f0800b7, float:1.8077872E38)
            java.lang.String r0 = "play"
            android.graphics.drawable.Drawable r12 = p000.z20.m7082(r12, r13, r0)
            return r12
        L33e:
            android.content.Context r13 = (android.content.Context) r13
            r13.getClass()
            r12 = 0
            return r12
        L345:
            org.luckypray.dexkit.query.matchers.MethodMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r13
            r13.getClass()
            java.lang.String r12 = "~7900D027A3932BB549D3B8B2DD00267041103759ADD6D0A1A70C488FC6B59198F6388B3274"
            java.lang.String r12 = p000.jf0.m2957(r12)
            r13.setDeclaredClass(r12)
            java.lang.String r12 = "void"
            r13.setReturnType(r12)
            java.lang.String r12 = "~7924EBBB26E5F67FFF0E3BFBBADCDA20635AA34941353E9324DD0F29CE2AB2598E4CEDA96265666F373BCC67"
            java.lang.String r12 = p000.jf0.m2957(r12)
            java.util.List r12 = p000.AbstractC1021yh.m6896(r12)
            r13.setParamTypes(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L368:
            org.luckypray.dexkit.query.matchers.MethodMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r13
            r13.getClass()
            java.lang.String r12 = "~7900D027A3932BB549D3B8B2DD00267041103759ADD6D0A1A70C488FC6B59198F6388B3274"
            java.lang.String r12 = p000.jf0.m2957(r12)
            r13.setDeclaredClass(r12)
            java.lang.String r12 = "void"
            r13.setReturnType(r12)
            java.lang.String r12 = "java.lang.String[]"
            java.lang.String r0 = "java.lang.String"
            java.lang.String r1 = "long"
            java.lang.String[] r12 = new java.lang.String[]{r12, r0, r1, r0}
            java.util.List r12 = p000.AbstractC1021yh.m6897(r12)
            r13.setParamTypes(r12)
            s62 r12 = p000.s62.f9751
            return r12
    }
}
