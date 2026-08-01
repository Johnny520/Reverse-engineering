package p000;

/* JADX INFO: renamed from: hm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0364hm implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4770;

    public /* synthetic */ C0364hm(int r1) {
            r0 = this;
            r0.f4770 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0364hm(p000.C0436jm r1) {
            r0 = this;
            r1 = 0
            r0.f4770 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r0 = r0.f4770
            java.lang.String r1 = "未扫描到："
            java.lang.String r2 = "db"
            java.lang.String r3 = "cache"
            java.lang.String r4 = "kotlin.jvm.functions.Function1"
            java.lang.String r5 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA97BAC59C5D71B155FA7E48552B876304A031F6E953731E44C09B5A86"
            java.lang.String r6 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA57E5C48FD7B3E094AA60E23CF26DE3BAC25A60400A2726"
            java.lang.String r7 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA97BAC59C5D71B155FA7E485537B953059726D5F9466F197DD5864992"
            r8 = 10
            s62 r9 = p000.s62.f9751
            switch(r0) {
                case 0: goto L270;
                case 1: goto L25d;
                case 2: goto L24c;
                case 3: goto L229;
                case 4: goto L218;
                case 5: goto L20f;
                case 6: goto L202;
                case 7: goto L1f6;
                case 8: goto L1ea;
                case 9: goto L1c5;
                case 10: goto L1b6;
                case 11: goto L18a;
                case 12: goto L168;
                case 13: goto L15b;
                case 14: goto L149;
                case 15: goto L137;
                case 16: goto L127;
                case 17: goto L11e;
                case 18: goto L114;
                case 19: goto L107;
                case 20: goto Lfb;
                case 21: goto Lef;
                case 22: goto Le3;
                case 23: goto Ld9;
                case 24: goto Lb7;
                case 25: goto La5;
                case 26: goto L85;
                case 27: goto L7c;
                case 28: goto L3e;
                default: goto L19;
            }
        L19:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.s00.f9638
            rz r1 = p000.r00.f9189
            r1.getClass()
            τ r2 = new τ
            r2.<init>(r1)
        L2c:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r2.next()
            r00 r1 = (p000.r00) r1
            r3 = 0
            p000.s00.m5315(r1, r0, r3)
            goto L2c
        L3d:
            return r9
        L3e:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            rz r1 = p000.r00.f9189
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = p000.AbstractC1021yh.m6889(r1, r8)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r1.next()
            r00 r3 = (p000.r00) r3
            qx r4 = new qx
            java.lang.Object r5 = p000.C0666ox.f8297
            kx r5 = r3.f9190
            java.lang.String r5 = p000.C0666ox.m4311(r5, r0)
            kx r6 = r3.f9190
            java.lang.String r6 = r6.f6297
            p3 r7 = new p3
            r8 = 6
            r7.<init>(r3, r8, r0)
            r4.<init>(r5, r6, r7)
            r2.add(r4)
            goto L54
        L7b:
            return r2
        L7c:
            r0 = r17
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            return r0
        L85:
            r1 = r17
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r1.getClass()
            r5 = 6
            r6 = 0
            java.lang.String r2 = "boolean"
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r2 = "java.lang.String"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            r1.paramTypes(r0)
            return r9
        La5:
            r0 = r17
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            hm r1 = new hm
            r2 = 26
            r1.<init>(r2)
            r0.matcher(r1)
            return r9
        Lb7:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            qx r1 = new qx
            java.lang.Object r2 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6207
            java.lang.String r2 = p000.C0666ox.m4306(r2, r0)
            cb r3 = new cb
            r4 = 25
            r3.<init>(r0, r4)
            java.lang.String r0 = "定位长按面板广告判断类"
            r1.<init>(r2, r0, r3)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            return r0
        Ld9:
            r0 = r17
            qx r0 = (p000.C0740qx) r0
            r0.getClass()
            java.lang.String r0 = r0.f9152
            return r0
        Le3:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r0 = p000.AbstractC0488ku.m3416(r0)
            return r0
        Lef:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r0 = p000.ln0.m3617(r0)
            return r0
        Lfb:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r0 = p000.ln0.m3617(r0)
            return r0
        L107:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0261eu.f3669
            p000.C0261eu.m1958(r0)
            return r9
        L114:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            jz r0 = p000.C0450jz.f5672
            return r0
        L11e:
            r0 = r17
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            return r0
        L127:
            r0 = r17
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            hm r1 = new hm
            r1.<init>(r8)
            r0.matcher(r1)
            return r9
        L137:
            r0 = r17
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            hm r1 = new hm
            r2 = 9
            r1.<init>(r2)
            r0.matcher(r1)
            return r9
        L149:
            r0 = r17
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            hm r1 = new hm
            r2 = 11
            r1.<init>(r2)
            r0.matcher(r1)
            return r9
        L15b:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            st r1 = p000.C0810st.f10010
            r1.m5569(r0)
            return r9
        L168:
            r0 = r17
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            r0.getClass()
            qx r1 = new qx
            java.lang.Object r2 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6291
            java.lang.String r2 = p000.C0666ox.m4320(r2, r0)
            cb r3 = new cb
            r4 = 24
            r3.<init>(r0, r4)
            java.lang.String r0 = "定位 IM 用户显示名方法"
            r1.<init>(r2, r0, r3)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            return r0
        L18a:
            r10 = r17
            org.luckypray.dexkit.query.matchers.MethodMatcher r10 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r10
            r10.getClass()
            java.lang.String r11 = p000.jf0.m2957(r7)
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r10, r11, r12, r13, r14, r15)
            java.lang.String r11 = p000.jf0.m2957(r6)
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = p000.jf0.m2957(r5)
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            r10.paramTypes(r0)
            java.lang.String[] r0 = new java.lang.String[]{r3, r2}
            r10.usingStrings(r0)
            return r9
        L1b6:
            r0 = r17
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String[] r1 = new java.lang.String[]{r3, r2}
            r0.usingStrings(r1)
            return r9
        L1c5:
            r10 = r17
            org.luckypray.dexkit.query.matchers.MethodMatcher r10 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r10
            r10.getClass()
            java.lang.String r11 = p000.jf0.m2957(r7)
            r14 = 6
            r15 = 0
            r12 = 0
            r13 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r10, r11, r12, r13, r14, r15)
            java.lang.String r11 = p000.jf0.m2957(r6)
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = p000.jf0.m2957(r5)
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            r10.paramTypes(r0)
            return r9
        L1ea:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r0 = r1.concat(r0)
            return r0
        L1f6:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r0 = r1.concat(r0)
            return r0
        L202:
            r0 = r17
            sp r0 = (p000.InterfaceC0806sp) r0
            boolean r1 = r0 instanceof kotlinx.coroutines.AbstractC0479
            if (r1 == 0) goto L20d
            kotlinx.coroutines.α r0 = (kotlinx.coroutines.AbstractC0479) r0
            goto L20e
        L20d:
            r0 = 0
        L20e:
            return r0
        L20f:
            r0 = r17
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class r0 = r0.getType()
            return r0
        L218:
            r0 = r17
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L229:
            r1 = r17
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r1.getClass()
            java.lang.String r0 = "~78EB30D04CD080004957FDC2BBA11C8B895E0C2FF698A046BB51347798C259FB7B1F17A5A14F21E167290B72F04A0A7066529DFB937E71DBC9C4F0D7BE9DE7F277D9B8F87E84143F46CEAA91F5DA9FC73B62C3512CD957AFFFA005833B1204"
            java.lang.String r2 = p000.jf0.m2957(r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "android.view.View"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1.paramTypes(r0)
            return r9
        L24c:
            r0 = r17
            org.luckypray.dexkit.query.FindMethod r0 = (org.luckypray.dexkit.query.FindMethod) r0
            r0.getClass()
            hm r1 = new hm
            r2 = 3
            r1.<init>(r2)
            r0.matcher(r1)
            return r9
        L25d:
            r0 = r17
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class r0 = r0.getType()
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            boolean r0 = p000.ln0.m3626(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L270:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r1 = "*"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L287
            java.lang.String r1 = "hide_comment_search_entry_enabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L290
        L287:
            boolean r0 = p000.C0436jm.m2968()
            if (r0 != 0) goto L290
            p000.C0436jm.m2969()
        L290:
            return r9
    }
}
