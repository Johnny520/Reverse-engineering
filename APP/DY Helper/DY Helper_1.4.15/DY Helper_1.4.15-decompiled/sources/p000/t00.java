package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t00 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10098;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Class f10099;

    public /* synthetic */ t00(java.lang.Class r1, int r2) {
            r0 = this;
            r0.f10098 = r2
            r0.f10099 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f10098
            r1 = 2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r3 = java.lang.Void.TYPE
            s62 r4 = p000.s62.f9751
            r5 = 0
            r6 = 1
            java.lang.Class r11 = r11.f10099
            switch(r0) {
                case 0: goto L105;
                case 1: goto Lf0;
                case 2: goto Lde;
                case 3: goto Laa;
                case 4: goto L9c;
                case 5: goto L8d;
                case 6: goto L7b;
                case 7: goto L51;
                case 8: goto L45;
                case 9: goto L36;
                default: goto L10;
            }
        L10:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            int r0 = r12.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L31
            java.lang.Class[] r0 = r12.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L31
            java.lang.Class r12 = r12.getReturnType()
            boolean r11 = r11.isAssignableFrom(r12)
            if (r11 == 0) goto L31
            r5 = r6
        L31:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        L36:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.Class r12 = r12.getReturnType()
            boolean r11 = r11.isAssignableFrom(r12)
        L40:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L45:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            ry1 r0 = p000.ry1.f9602
            boolean r11 = p000.ry1.m5264(r11, r12)
            goto L40
        L51:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            int r0 = r12.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L76
            java.lang.Class r0 = r12.getReturnType()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto L76
            java.lang.Class[] r12 = r12.getParameterTypes()
            java.lang.Class[] r11 = new java.lang.Class[]{r2, r11}
            boolean r11 = java.util.Arrays.equals(r12, r11)
            if (r11 == 0) goto L76
            r5 = r6
        L76:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        L7b:
            r5 = r12
            org.luckypray.dexkit.query.matchers.FieldMatcher r5 = (org.luckypray.dexkit.query.matchers.FieldMatcher) r5
            r5.getClass()
            java.lang.String r6 = r11.getName()
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            org.luckypray.dexkit.query.matchers.FieldMatcher.type$default(r5, r6, r7, r8, r9, r10)
            return r4
        L8d:
            org.luckypray.dexkit.query.FindField r12 = (org.luckypray.dexkit.query.FindField) r12
            r12.getClass()
            t00 r0 = new t00
            r1 = 6
            r0.<init>(r11, r1)
            r12.matcher(r0)
            return r4
        L9c:
            org.luckypray.dexkit.query.FindMethod r12 = (org.luckypray.dexkit.query.FindMethod) r12
            r12.getClass()
            t00 r0 = new t00
            r0.<init>(r11, r1)
            r12.matcher(r0)
            return r4
        Laa:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            java.lang.Class r0 = r12.getReturnType()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto Ld9
            java.lang.Class[] r0 = r12.getParameterTypes()
            int r0 = r0.length
            if (r0 != r1) goto Ld9
            java.lang.Class[] r0 = r12.getParameterTypes()
            r0 = r0[r5]
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto Ld9
            java.lang.Class[] r12 = r12.getParameterTypes()
            r12 = r12[r6]
            boolean r11 = r11.isAssignableFrom(r12)
            if (r11 == 0) goto Ld9
            r5 = r6
        Ld9:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        Lde:
            r5 = r12
            org.luckypray.dexkit.query.matchers.MethodMatcher r5 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r5
            r5.getClass()
            java.lang.String r6 = r11.getName()
            r9 = 6
            r10 = 0
            r7 = 0
            r8 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r5, r6, r7, r8, r9, r10)
            return r4
        Lf0:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r12.getClass()
            wi0 r0 = p000.wi0.f11726
            int r11 = p000.wi0.m6391(r11, r12)
            r12 = 5000(0x1388, float:7.006E-42)
            if (r11 < r12) goto L100
            r5 = r6
        L100:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        L105:
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            r12.getClass()
            java.lang.Class r0 = r12.getType()
            boolean r0 = r11.isAssignableFrom(r0)
            if (r0 != 0) goto L11e
            java.lang.Class r12 = r12.getType()
            boolean r11 = r12.isAssignableFrom(r11)
            if (r11 == 0) goto L11f
        L11e:
            r5 = r6
        L11f:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
    }
}
