package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9902;

    public /* synthetic */ sh0(int r1) {
            r0 = this;
            r0.f9902 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r11 = r11.f9902
            java.lang.String r0 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            r1 = 0
            r2 = 1
            s62 r3 = p000.s62.f9751
            switch(r11) {
                case 0: goto L27b;
                case 1: goto L266;
                case 2: goto L254;
                case 3: goto L23d;
                case 4: goto L236;
                case 5: goto L22a;
                case 6: goto L221;
                case 7: goto L207;
                case 8: goto L1f8;
                case 9: goto L1e8;
                case 10: goto L1d9;
                case 11: goto L1c9;
                case 12: goto L1af;
                case 13: goto L19a;
                case 14: goto L168;
                case 15: goto L15d;
                case 16: goto L141;
                case 17: goto L137;
                case 18: goto L12b;
                case 19: goto L121;
                case 20: goto L117;
                case 21: goto L110;
                case 22: goto Lf1;
                case 23: goto Le7;
                case 24: goto Lde;
                case 25: goto L57;
                case 26: goto L40;
                case 27: goto L36;
                case 28: goto L16;
                default: goto Lb;
            }
        Lb:
            java.lang.ClassLoader r12 = (java.lang.ClassLoader) r12
            r12.getClass()
            wi0 r11 = p000.wi0.f11726
            r11.m6392(r12)
            return r3
        L16:
            java.lang.ClassLoader r12 = (java.lang.ClassLoader) r12
            r12.getClass()
            qx r11 = new qx
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6191
            java.lang.String r0 = p000.C0666ox.m4320(r0, r12)
            r20 r1 = new r20
            r2 = 16
            r1.<init>(r12, r2)
            java.lang.String r12 = "定位 IM 陌生人会话模型工厂"
            r11.<init>(r0, r12, r1)
            java.util.List r11 = p000.AbstractC1021yh.m6896(r11)
            return r11
        L36:
            l91 r12 = (p000.l91) r12
            r12.getClass()
            java.lang.Object r11 = r12.f6502
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            return r11
        L40:
            l91 r12 = (p000.l91) r12
            r12.getClass()
            java.lang.Object r11 = r12.f6503
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r12 = 5000(0x1388, float:7.006E-42)
            if (r11 < r12) goto L52
            r1 = r2
        L52:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            return r11
        L57:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            java.lang.String r11 = r12.getName()
            java.lang.String r3 = "deleteConversation"
            boolean r11 = p000.ln0.m3626(r11, r3)
            if (r11 == 0) goto L6b
            r11 = 10000(0x2710, float:1.4013E-41)
            goto L6c
        L6b:
            r11 = r1
        L6c:
            java.lang.reflect.Type[] r3 = r12.getGenericParameterTypes()
            r3.getClass()
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r2, r3)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto Lc0
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            r2.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
        L8d:
            if (r1 >= r4) goto L9b
            r5 = r2[r1]
            java.lang.String r5 = r5.getTypeName()
            r3.add(r5)
            int r1 = r1 + 1
            goto L8d
        L9b:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La2
            goto Lc0
        La2:
            java.util.Iterator r1 = r3.iterator()
        La6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r3 = r3.getName()
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto La6
            int r11 = r11 + 5000
        Lc0:
            java.lang.Class r1 = r12.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld4
            int r11 = r11 + 1000
        Ld4:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            l91 r0 = new l91
            r0.<init>(r12, r11)
            return r0
        Lde:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            r12.setAccessible(r2)
            return r3
        Le7:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            java.lang.Class r11 = r12.getReturnType()
            return r11
        Lf1:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            java.lang.Class[] r11 = r12.getParameterTypes()
            r11.getClass()
            int r11 = r11.length
            if (r11 != 0) goto L10b
            java.lang.Class r11 = r12.getReturnType()
            boolean r11 = r11.isInterface()
            if (r11 == 0) goto L10b
            r1 = r2
        L10b:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            return r11
        L110:
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.String r11 = r12.getName()
            return r11
        L117:
            java.lang.Class r12 = (java.lang.Class) r12
            r12.getClass()
            java.lang.Class r11 = r12.getSuperclass()
            return r11
        L121:
            java.lang.Class r12 = (java.lang.Class) r12
            r12.getClass()
            java.lang.Class r11 = r12.getSuperclass()
            return r11
        L12b:
            hj0 r12 = (p000.hj0) r12
            r12.getClass()
            xi0 r11 = r12.f4747
            java.lang.String r11 = r11.m6674()
            return r11
        L137:
            xi0 r12 = (p000.xi0) r12
            r12.getClass()
            java.lang.String r11 = r12.m6674()
            return r11
        L141:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            r12.getClass()
            java.lang.Object r11 = r12.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.String r0 = " "
            java.lang.String r11 = p000.AbstractC0602nx.m4130(r11, r0, r12)
            return r11
        L15d:
            java.lang.ClassLoader r12 = (java.lang.ClassLoader) r12
            r12.getClass()
            ci0 r11 = p000.ci0.f2128
            r11.m1213(r12)
            return r3
        L168:
            java.lang.ClassLoader r12 = (java.lang.ClassLoader) r12
            r12.getClass()
            bi0[] r11 = p000.bi0.values()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r11.length
            r0.<init>(r2)
            int r2 = r11.length
            r3 = r1
        L179:
            if (r3 >= r2) goto L199
            r4 = r11[r3]
            qx r5 = new qx
            java.lang.Object r6 = p000.C0666ox.f8297
            kx r6 = r4.f1726
            java.lang.String r6 = p000.C0666ox.m4320(r6, r12)
            kx r7 = r4.f1726
            java.lang.String r7 = r7.f6297
            wh0 r8 = new wh0
            r8.<init>(r12, r4, r1)
            r5.<init>(r6, r7, r8)
            r0.add(r5)
            int r3 = r3 + 1
            goto L179
        L199:
            return r0
        L19a:
            r4 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
            r4.getClass()
            java.lang.String r5 = p000.jf0.m2957(r0)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r4, r5, r6, r7, r8, r9)
            r4.paramTypes()
            return r3
        L1af:
            r5 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r5 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r5
            r5.getClass()
            java.lang.String r6 = p000.jf0.m2957(r0)
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r5, r6, r7, r8, r9, r10)
            java.lang.String r6 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r5, r6, r7, r8, r9, r10)
            r5.paramTypes()
            return r3
        L1c9:
            org.luckypray.dexkit.query.FindMethod r12 = (org.luckypray.dexkit.query.FindMethod) r12
            r12.getClass()
            sh0 r11 = new sh0
            r0 = 13
            r11.<init>(r0)
            r12.matcher(r11)
            return r3
        L1d9:
            org.luckypray.dexkit.query.FindMethod r12 = (org.luckypray.dexkit.query.FindMethod) r12
            r12.getClass()
            sh0 r11 = new sh0
            r0 = 3
            r11.<init>(r0)
            r12.matcher(r11)
            return r3
        L1e8:
            org.luckypray.dexkit.query.FindMethod r12 = (org.luckypray.dexkit.query.FindMethod) r12
            r12.getClass()
            sh0 r11 = new sh0
            r0 = 12
            r11.<init>(r0)
            r12.matcher(r11)
            return r3
        L1f8:
            org.luckypray.dexkit.query.FindMethod r12 = (org.luckypray.dexkit.query.FindMethod) r12
            r12.getClass()
            sh0 r11 = new sh0
            r0 = 7
            r11.<init>(r0)
            r12.matcher(r11)
            return r3
        L207:
            r4 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
            r4.getClass()
            java.lang.String r5 = p000.jf0.m2957(r0)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "java.util.List"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r4, r5, r6, r7, r8, r9)
            r4.paramTypes()
            return r3
        L221:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            r12.setAccessible(r2)
            return r3
        L22a:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            ci0 r11 = p000.ci0.f2128
            java.lang.String r11 = p000.ci0.m1208(r12)
            return r11
        L236:
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.String r11 = r12.getName()
            return r11
        L23d:
            r4 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r4 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r4
            r4.getClass()
            java.lang.String r11 = "~794484268AD6F67E0BEA2ECA830A11B407AB19CC18A67D1BB8C2259BBDE977201B783674DB4FAB0B5E357371E1DCA895D457DE8F"
            java.lang.String r5 = p000.jf0.m2957(r11)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r4, r5, r6, r7, r8, r9)
            r4.paramTypes()
            return r3
        L254:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            r3 = 0
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 <= 0) goto L261
            r1 = r2
        L261:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            return r11
        L266:
            ix0 r12 = (p000.ix0) r12
            r12.getClass()
            vh0 r11 = p000.vh0.f11270
            java.util.regex.Matcher r11 = r12.f5234
            java.lang.String r11 = r11.group()
            r11.getClass()
            java.lang.Long r11 = p000.vh0.m6240(r11)
            return r11
        L27b:
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.String r11 = r12.getName()
            return r11
    }
}
