package defpackage;

/* JADX INFO: renamed from: ᛷᛸᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1341 implements defpackage.InterfaceC2087 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f5919;

    public /* synthetic */ C1341(int r1) {
            r0 = this;
            r0.f5919 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC2087
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final java.lang.Object mo388(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r3 = r3.f5919
            r0 = 0
            r1 = 0
            r2 = 1
            switch(r3) {
                case 0: goto L108;
                case 1: goto Lf4;
                case 2: goto Lc1;
                case 3: goto Lad;
                case 4: goto L99;
                case 5: goto L85;
                case 6: goto L71;
                case 7: goto L5d;
                case 8: goto L3e;
                case 9: goto L2e;
                default: goto L8;
            }
        L8:
            ᲇᛲᲁᛷ r4 = (defpackage.C2007) r4
            ᛶᲁᛳᲈ r5 = (defpackage.InterfaceC1151) r5
            boolean r3 = r5 instanceof defpackage.C1367
            if (r3 == 0) goto L2d
            ᛷᲁᛳᲀ r5 = (defpackage.C1367) r5
            ᛳᛵᲈᛵ r3 = r4.f8665
            java.lang.ThreadLocal r3 = r5.f5978
            java.lang.Object r0 = r3.get()
            java.lang.Object r1 = r5.f5979
            r3.set(r1)
            java.lang.Object[] r3 = r4.f8666
            int r1 = r4.f8663
            r3[r1] = r0
            ᛷᲁᛳᲀ[] r3 = r4.f8664
            int r0 = r1 + 1
            r4.f8663 = r0
            r3[r1] = r5
        L2d:
            return r4
        L2e:
            ᛷᲁᛳᲀ r4 = (defpackage.C1367) r4
            ᛶᲁᛳᲈ r5 = (defpackage.InterfaceC1151) r5
            if (r4 == 0) goto L36
            r0 = r4
            goto L3d
        L36:
            boolean r3 = r5 instanceof defpackage.C1367
            if (r3 == 0) goto L3d
            r0 = r5
            ᛷᲁᛳᲀ r0 = (defpackage.C1367) r0
        L3d:
            return r0
        L3e:
            ᛶᲁᛳᲈ r5 = (defpackage.InterfaceC1151) r5
            boolean r3 = r5 instanceof defpackage.C1367
            if (r3 == 0) goto L5c
            boolean r3 = r4 instanceof java.lang.Integer
            if (r3 == 0) goto L4b
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0
        L4b:
            if (r0 == 0) goto L52
            int r3 = r0.intValue()
            goto L53
        L52:
            r3 = r2
        L53:
            if (r3 != 0) goto L57
            r4 = r5
            goto L5c
        L57:
            int r3 = r3 + r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L5c:
            return r4
        L5d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            boolean r4 = r5.isEnumConstant()
            if (r4 == r3) goto L6c
            r1 = r2
        L6c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L71:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            boolean r4 = r5.isEnumConstant()
            if (r4 != r3) goto L80
            r1 = r2
        L80:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L85:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r4 = r5.isDefault()
            if (r4 == r3) goto L94
            r1 = r2
        L94:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L99:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r4 = r5.isDefault()
            if (r4 != r3) goto La8
            r1 = r2
        La8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        Lad:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r4 = r5.isBridge()
            if (r4 == r3) goto Lbc
            r1 = r2
        Lbc:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        Lc1:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Member r5 = (java.lang.reflect.Member) r5
            boolean r3 = r5 instanceof java.lang.reflect.Method
            if (r3 == 0) goto Ld0
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r3 = r5.toGenericString()
            goto Le5
        Ld0:
            boolean r3 = r5 instanceof java.lang.reflect.Constructor
            if (r3 == 0) goto Ldb
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.String r3 = r5.toGenericString()
            goto Le5
        Ldb:
            boolean r3 = r5 instanceof java.lang.reflect.Field
            if (r3 == 0) goto Lee
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r3 = r5.toGenericString()
        Le5:
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto Lf3
        Lee:
            java.lang.String r3 = "Unsupported member type: "
            defpackage.C2264.m3681(r5, r3)
        Lf3:
            return r0
        Lf4:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Member r5 = (java.lang.reflect.Member) r5
            boolean r4 = r5.isSynthetic()
            if (r4 == r3) goto L103
            r1 = r2
        L103:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L108:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.reflect.Member r5 = (java.lang.reflect.Member) r5
            boolean r4 = r5.isSynthetic()
            if (r4 != r3) goto L117
            r1 = r2
        L117:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
    }
}
