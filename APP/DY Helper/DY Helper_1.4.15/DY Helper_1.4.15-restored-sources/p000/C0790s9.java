package p000;

/* JADX INFO: renamed from: s9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0790s9 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9765;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f9766;

    public /* synthetic */ C0790s9(java.lang.String r1, int r2) {
            r0 = this;
            r0.f9765 = r2
            r0.f9766 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f9765
            switch(r0) {
                case 0: goto L282;
                case 1: goto L271;
                case 2: goto L25e;
                case 3: goto L24d;
                case 4: goto L215;
                case 5: goto L202;
                case 6: goto L1dd;
                case 7: goto L1d4;
                case 8: goto L1cb;
                case 9: goto L1c2;
                case 10: goto L1b9;
                case 11: goto L1b0;
                case 12: goto L1a7;
                case 13: goto L19e;
                case 14: goto L195;
                case 15: goto L181;
                case 16: goto L15f;
                case 17: goto L14b;
                case 18: goto L130;
                case 19: goto L11c;
                case 20: goto L106;
                case 21: goto Lf2;
                case 22: goto Le0;
                case 23: goto Lc2;
                case 24: goto L70;
                case 25: goto L5c;
                case 26: goto L4a;
                case 27: goto L37;
                case 28: goto L23;
                default: goto L5;
            }
        L5:
            r1 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r1 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r1
            r1.getClass()
            r5 = 6
            r6 = 0
            java.lang.String r2 = r7.f9766
            r3 = 0
            r4 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r1, r2, r3, r4, r5, r6)
            java.lang.String r7 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            java.lang.String r2 = p000.jf0.m2957(r7)
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r1, r2, r3, r4, r5, r6)
            r1.paramTypes()
            s62 r7 = p000.s62.f9751
            return r7
        L23:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 29
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L37:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            yh0 r0 = new yh0
            r1 = 0
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L4a:
            xd0 r8 = (p000.xd0) r8
            r8.getClass()
            java.lang.String r8 = r8.f12133
            java.lang.String r7 = r7.f9766
            boolean r7 = p000.ln0.m3626(r8, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L5c:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 23
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L70:
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            r8.getClass()
            java.lang.Class r0 = r8.getType()
            java.lang.String r0 = r0.getName()
            java.lang.String r7 = r7.f9766
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "java.util.List"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L99
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Class r1 = r8.getType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto Lbc
        L99:
            java.lang.String r0 = "boolean"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lba
            java.lang.Class r7 = r8.getType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r7 = p000.ln0.m3626(r7, r0)
            if (r7 != 0) goto Lbc
            java.lang.Class r7 = r8.getType()
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto Lba
            goto Lbc
        Lba:
            r7 = 0
            goto Lbd
        Lbc:
            r7 = 1
        Lbd:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        Lc2:
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            java.lang.String r8 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B718B9AE6B1"
            java.lang.String r1 = p000.jf0.m2957(r8)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r7.f9766
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            r0.paramTypes()
            s62 r7 = p000.s62.f9751
            return r7
        Le0:
            r0 = r8
            org.luckypray.dexkit.query.matchers.ClassMatcher r0 = (org.luckypray.dexkit.query.matchers.ClassMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = r7.f9766
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.ClassMatcher.className$default(r0, r1, r2, r3, r4, r5)
            s62 r7 = p000.s62.f9751
            return r7
        Lf2:
            org.luckypray.dexkit.query.FindClass r8 = (org.luckypray.dexkit.query.FindClass) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 22
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L106:
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            r8.getClass()
            java.lang.String r0 = "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r8.setDeclaredClass(r0)
            java.lang.String r7 = r7.f9766
            r8.setName(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L11c:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 20
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L130:
            r0 = r8
            org.luckypray.dexkit.query.matchers.FieldMatcher r0 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r0
            r0.getClass()
            java.lang.String r8 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r1 = p000.jf0.m2957(r8)
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = r7.f9766
            org.luckypray.dexkit.query.matchers.FieldMatcher.type$default(r0, r1, r2, r3, r4, r5)
            s62 r7 = p000.s62.f9751
            return r7
        L14b:
            org.luckypray.dexkit.query.FindField r8 = (org.luckypray.dexkit.query.FindField) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 18
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L15f:
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = r7.f9766
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "void"
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "android.view.View"
            java.lang.String r8 = "android.os.Bundle"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            r0.paramTypes(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L181:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 16
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L195:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1331(r7, r8)
            return r7
        L19e:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1323(r7, r8)
            return r7
        L1a7:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1329(r7, r8)
            return r7
        L1b0:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1335(r7, r8)
            return r7
        L1b9:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1337(r7, r8)
            return r7
        L1c2:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1322(r7, r8)
            return r7
        L1cb:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1339(r7, r8)
            return r7
        L1d4:
            java.lang.String r7 = r7.f9766
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            s62 r7 = com.example.dyhelper.dexkit.hook.CommentBookmarkDexKitResolver.m1340(r7, r8)
            return r7
        L1dd:
            r0 = r8
            org.luckypray.dexkit.query.matchers.MethodMatcher r0 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r0
            r0.getClass()
            r4 = 6
            r5 = 0
            java.lang.String r1 = r7.f9766
            r2 = 0
            r3 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.declaredClass$default(r0, r1, r2, r3, r4, r5)
            java.lang.String r7 = "void"
            r0.setReturnType(r7)
            java.lang.String r7 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C9F429AC0783D12F128B686"
            java.lang.String r7 = p000.jf0.m2957(r7)
            r8 = 0
            java.lang.String[] r7 = new java.lang.String[]{r8, r8, r8, r8, r7}
            r0.paramTypes(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L202:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 6
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L215:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r0 = r8.getName()
            java.lang.String r7 = r7.f9766
            boolean r7 = p000.ln0.m3626(r0, r7)
            if (r7 == 0) goto L247
            java.lang.Class[] r7 = r8.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L247
            java.lang.Class r7 = r8.getReturnType()
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r7 = p000.ln0.m3626(r7, r0)
            if (r7 != 0) goto L245
            java.lang.Class r7 = r8.getReturnType()
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L247
        L245:
            r7 = 1
            goto L248
        L247:
            r7 = 0
        L248:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L24d:
            org.luckypray.dexkit.query.matchers.MethodMatcher r8 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r8
            r8.getClass()
            java.lang.String r7 = r7.f9766
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8.usingStrings(r7)
            s62 r7 = p000.s62.f9751
            return r7
        L25e:
            org.luckypray.dexkit.query.FindMethod r8 = (org.luckypray.dexkit.query.FindMethod) r8
            r8.getClass()
            s9 r0 = new s9
            r1 = 3
            java.lang.String r7 = r7.f9766
            r0.<init>(r7, r1)
            r8.matcher(r0)
            s62 r7 = p000.s62.f9751
            return r7
        L271:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.f9766
            boolean r7 = p000.ln0.m3626(r8, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L282:
            v9 r8 = (p000.C0901v9) r8
            r8.getClass()
            boolean r0 = r8.f11181
            java.lang.String r8 = r8.f11182
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "online beta refresh uid="
            r1.<init>(r2)
            java.lang.String r7 = r7.f9766
            r1.append(r7)
            java.lang.String r7 = " found="
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = " msg="
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = r1.toString()
            r8 = 0
            r0 = 4
            java.lang.String r1 = "r267d1c3d8cdbcdb7"
            p000.C0888ux.m5988(r1, r7, r8, r0, r8)
            s62 r7 = p000.s62.f9751
            return r7
    }
}
