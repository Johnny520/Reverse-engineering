package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sv0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10050;

    public /* synthetic */ sv0(int r1) {
            r0 = this;
            r0.f10050 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r12 = r12.f10050
            r0 = 500(0x1f4, float:7.0E-43)
            r1 = 10
            r2 = 100
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r12) {
                case 0: goto L408;
                case 1: goto L3f8;
                case 2: goto L3e6;
                case 3: goto L3d3;
                case 4: goto L3bf;
                case 5: goto L3ac;
                case 6: goto L399;
                case 7: goto L389;
                case 8: goto L379;
                case 9: goto L357;
                case 10: goto L34b;
                case 11: goto L31c;
                case 12: goto L2e9;
                case 13: goto L2d7;
                case 14: goto L2c5;
                case 15: goto L2b3;
                case 16: goto L28f;
                case 17: goto L271;
                case 18: goto L24f;
                case 19: goto L22c;
                case 20: goto L1d5;
                case 21: goto L1ca;
                case 22: goto L197;
                case 23: goto L118;
                case 24: goto Lb3;
                case 25: goto L84;
                case 26: goto L57;
                case 27: goto L41;
                case 28: goto L29;
                default: goto Le;
            }
        Le:
            java.lang.Byte r13 = (java.lang.Byte) r13
            byte r12 = r13.byteValue()
            java.lang.String r13 = "%02x"
            r12 = r12 & 255(0xff, float:3.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r5)
            java.lang.String r12 = java.lang.String.format(r13, r12)
            return r12
        L29:
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            r13.getClass()
            java.lang.Object r12 = r13.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r0 = "="
            java.lang.String r12 = p000.lz1.m3688(r12, r0, r13)
            return r12
        L41:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L56
            java.lang.CharSequence r12 = p000.q02.m4660(r13)
            java.lang.String r12 = r12.toString()
            if (r12 == 0) goto L56
            int r13 = r12.length()
            if (r13 <= 0) goto L56
            r3 = r12
        L56:
            return r3
        L57:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            es0 r12 = new es0
            r12.<init>(r13)
            boolean r13 = r12.hasNext()
            if (r13 != 0) goto L69
            r12 = r3
            goto L6d
        L69:
            java.lang.Object r12 = r12.next()
        L6d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L79
            java.lang.CharSequence r12 = p000.q02.m4660(r12)
            java.lang.String r3 = r12.toString()
        L79:
            java.lang.String r12 = "缓存条数"
            boolean r12 = p000.ln0.m3626(r3, r12)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L84:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L8e:
            int r0 = r13.length()
            if (r4 >= r0) goto La4
            char r0 = r13.charAt(r4)
            boolean r1 = p000.jx0.m3020(r0)
            if (r1 != 0) goto La1
            r12.append(r0)
        La1:
            int r4 = r4 + 1
            goto L8e
        La4:
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "200条"
            boolean r12 = r12.equals(r13)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        Lb3:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.util.concurrent.atomic.AtomicReference r12 = p000.m41.f6934
            java.lang.Object r12 = r12.getAndSet(r13)
            boolean r12 = p000.ln0.m3626(r12, r13)
            if (r12 == 0) goto Lc5
            goto L111
        Lc5:
            xn0 r12 = p000.xn0.f12231
            monitor-enter(r12)
            p000.xn0.f12232 = r3     // Catch: java.lang.Throwable -> L114
            p000.xn0.f12233 = r3     // Catch: java.lang.Throwable -> L114
            monitor-exit(r12)
            java.lang.String r12 = "offline_cache_count_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            java.lang.String r3 = "offline_cache_count"
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ldd
            int r2 = r4.getInt(r3, r2)     // Catch: java.lang.Throwable -> Ldd
        Ldd:
            int r0 = p000.j81.m2906(r2, r1, r0)
            p000.jx0.f5633 = r12
            p000.jx0.f5634 = r0
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.m41.f6932
            boolean r12 = p000.q02.m4671(r13)
            r12 = r12 ^ r5
            boolean r13 = p000.jx0.f5633
            int r0 = p000.jx0.f5634
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[config] profile_changed uid_present="
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r12 = " enabled="
            r1.append(r12)
            r1.append(r13)
            java.lang.String r12 = " count="
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            p000.m41.m3727(r12)
        L111:
            s62 r12 = p000.s62.f9751
            return r12
        L114:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L114
            throw r13
        L118:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            int r12 = r13.hashCode()
            r5 = -868350536(0xffffffffcc3e05b8, float:-4.9813216E7)
            if (r12 == r5) goto L142
            r5 = -571414090(0xffffffffddf0e9b6, float:-2.1699508E18)
            if (r12 == r5) goto L139
            r5 = 42
            if (r12 == r5) goto L130
            goto L190
        L130:
            java.lang.String r12 = "*"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L190
            goto L14b
        L139:
            java.lang.String r12 = "offline_cache_count"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L14b
            goto L190
        L142:
            java.lang.String r12 = "offline_cache_count_enabled"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L14b
            goto L190
        L14b:
            java.lang.String r12 = "offline_cache_count_enabled"
            boolean r12 = p000.ui1.m5887(r12, r4)
            java.lang.String r4 = "offline_cache_count"
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L15b
            int r2 = r5.getInt(r4, r2)     // Catch: java.lang.Throwable -> L15b
        L15b:
            int r0 = p000.j81.m2906(r2, r1, r0)
            p000.jx0.f5633 = r12
            p000.jx0.f5634 = r0
            xn0 r12 = p000.xn0.f12231
            monitor-enter(r12)
            p000.xn0.f12233 = r3     // Catch: java.lang.Throwable -> L193
            monitor-exit(r12)
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.m41.f6932
            boolean r12 = p000.jx0.f5633
            int r0 = p000.jx0.f5634
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[config] key="
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = " enabled="
            r1.append(r13)
            r1.append(r12)
            java.lang.String r12 = " count="
            r1.append(r12)
            r1.append(r0)
            java.lang.String r12 = r1.toString()
            p000.m41.m3727(r12)
        L190:
            s62 r12 = p000.s62.f9751
            return r12
        L193:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L193
            throw r13
        L197:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            l41 r12 = p000.l41.f6416
            boolean r12 = p000.l41.m3488(r13)
            if (r12 == 0) goto L1c5
            java.lang.Class r12 = r13.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B670A64ED4873391028A158374B5BB5B7FAFD848057E3FEABDBF8C529E1C2B7769BF5D7377F9A803FFDAE1A9D0E0DFE3B2567"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L1c5
            java.util.Set r12 = p000.l41.f6420
            java.lang.String r13 = r13.getName()
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L1c5
            r4 = r5
        L1c5:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        L1ca:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            p000.m41.m3726(r13)
            s62 r12 = p000.s62.f9751
            return r12
        L1d5:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            l41 r12 = p000.l41.f6416
            kx r12 = p000.EnumC0491kx.f6256
            k41 r0 = new k41
            r0.<init>(r13, r5)
            qx r6 = p000.l41.m3491(r12, r13, r0)
            kx r12 = p000.EnumC0491kx.f6257
            k41 r0 = new k41
            r1 = 2
            r0.<init>(r13, r1)
            qx r7 = p000.l41.m3491(r12, r13, r0)
            kx r12 = p000.EnumC0491kx.f6258
            k41 r0 = new k41
            r1 = 3
            r0.<init>(r13, r1)
            qx r8 = p000.l41.m3491(r12, r13, r0)
            kx r12 = p000.EnumC0491kx.f6259
            k41 r0 = new k41
            r1 = 4
            r0.<init>(r13, r1)
            qx r9 = p000.l41.m3491(r12, r13, r0)
            kx r12 = p000.EnumC0491kx.f6260
            k41 r0 = new k41
            r1 = 5
            r0.<init>(r13, r1)
            qx r10 = p000.l41.m3491(r12, r13, r0)
            kx r12 = p000.EnumC0491kx.f6261
            k41 r0 = new k41
            r1 = 6
            r0.<init>(r13, r1)
            qx r11 = p000.l41.m3491(r12, r13, r0)
            qx[] r12 = new p000.C0740qx[]{r6, r7, r8, r9, r10, r11}
            java.util.List r12 = p000.AbstractC1021yh.m6897(r12)
            return r12
        L22c:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            l41 r12 = p000.l41.f6416
            boolean r12 = p000.l41.m3487(r13)
            if (r12 == 0) goto L24a
            java.lang.Class r12 = r13.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "offlinemode"
            boolean r12 = p000.q02.m4654(r12, r13, r5)
            if (r12 == 0) goto L24a
            r4 = r5
        L24a:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        L24f:
            r0 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r1 = "onViewCreated"
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.name$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r12 = "android.view.View"
            java.lang.String r13 = "android.os.Bundle"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13}
            r0.paramTypes(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L271:
            r0 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r1 = "int"
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            r0.paramTypes()
            java.lang.String r12 = "cache_count"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r0.usingStrings(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L28f:
            r0 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r1 = "void"
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r12 = "int"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r0.paramTypes(r12)
            java.lang.String r12 = "cache_count"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r0.usingStrings(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2b3:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            sv0 r12 = new sv0
            r0 = 17
            r12.<init>(r0)
            r13.matcher(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2c5:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            sv0 r12 = new sv0
            r0 = 18
            r12.<init>(r0)
            r13.matcher(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2d7:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            sv0 r12 = new sv0
            r0 = 16
            r12.<init>(r0)
            r13.matcher(r12)
            s62 r12 = p000.s62.f9751
            return r12
        L2e9:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            l41 r12 = p000.l41.f6416
            boolean r12 = p000.l41.m3488(r13)
            if (r12 == 0) goto L317
            java.lang.Class r12 = r13.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = "~78F7D766E6AD8F2F174318E7D62B7C5A33BB7F4AE8124A81AFC66CE9CAF1612AB0CC190D4DE79087AC9AA6387725E92C44671B8A1F53B7D95FD0FC4A146F6E9C4118321BB624C9457379A394FC87165DFAF1C84EA1F2939C"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L317
            java.util.Set r12 = p000.l41.f6419
            java.lang.String r13 = r13.getName()
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L317
            r4 = r5
        L317:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        L31c:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            r13.getClass()
            l41 r12 = p000.l41.f6416
            boolean r12 = p000.l41.m3488(r13)
            if (r12 == 0) goto L346
            java.util.Set r12 = p000.l41.f6421
            java.lang.String r0 = r13.getName()
            boolean r12 = r12.contains(r0)
            if (r12 == 0) goto L346
            java.lang.Class r12 = r13.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "offlinemode"
            boolean r12 = p000.q02.m4654(r12, r13, r5)
            if (r12 == 0) goto L346
            r4 = r5
        L346:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        L34b:
            g31 r13 = (p000.g31) r13
            k1 r12 = r13.f4223
            if (r12 == 0) goto L354
            r12.invoke()
        L354:
            s62 r12 = p000.s62.f9751
            return r12
        L357:
            m91 r13 = (p000.m91) r13
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "["
            r12.<init>(r0)
            int r0 = r13.f7034
            r12.append(r0)
            java.lang.String r0 = ", "
            r12.append(r0)
            int r13 = r13.f7035
            r12.append(r13)
            r13 = 41
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            return r12
        L379:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.lang.String r12 = "http"
            boolean r12 = p000.x02.m6485(r13, r12, r5)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L389:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.lang.String r12 = "http"
            boolean r12 = p000.x02.m6485(r13, r12, r5)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L399:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            r13.getClass()
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            r12 = r12 ^ r5
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L3ac:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            r13.getClass()
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            r12 = r12 ^ r5
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L3bf:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            r13.getClass()
            java.lang.Class r12 = r13.getType()
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            boolean r12 = p000.ln0.m3626(r12, r13)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L3d3:
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            r13.getClass()
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            r12 = r12 ^ r5
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L3e6:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class[] r12 = r13.getParameterTypes()
            r12.getClass()
            int r12 = r12.length
            if (r12 != 0) goto L3f3
            r4 = r5
        L3f3:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        L3f8:
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            r12 = r12 ^ r5
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        L408:
            java.lang.ClassLoader r13 = (java.lang.ClassLoader) r13
            r13.getClass()
            p000.jx0.m3013(r13)
            s62 r12 = p000.s62.f9751
            return r12
    }
}
