package defpackage;

/* JADX INFO: renamed from: ᛸᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1578 implements defpackage.InterfaceC1405 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0682 f6992;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6993;

    public /* synthetic */ C1578(defpackage.C0682 r1, int r2) {
            r0 = this;
            r0.f6993 = r2
            r0.f6992 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC1405
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.AbstractC0758 mo690(defpackage.C1950 r10, defpackage.C1949 r11) {
            r9 = this;
            int r0 = r9.f6993
            ᛴᛵᲇᲇ r1 = r9.f6992
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L77;
                default: goto Lc;
            }
        Lc:
            java.lang.reflect.Type r0 = r11.f8477
            java.lang.Class r6 = r11.f8476
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r8 = r7.isAssignableFrom(r6)
            if (r8 != 0) goto L19
            goto L76
        L19:
            java.lang.Class<java.util.Properties> r3 = java.util.Properties.class
            boolean r3 = r3.isAssignableFrom(r6)
            r8 = 1
            if (r3 == 0) goto L2b
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r4]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r5] = r2
            r0[r8] = r2
            goto L40
        L2b:
            java.lang.reflect.Type r0 = defpackage.AbstractC0209.m761(r0, r6, r7)
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L3a
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            goto L40
        L3a:
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r4]
            r0[r5] = r2
            r0[r8] = r2
        L40:
            r2 = r0[r5]
            r0 = r0[r8]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 == r3) goto L57
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L4d
            goto L57
        L4d:
            ᲁᲇᛸᲈ r3 = new ᲁᲇᛸᲈ
            r3.<init>(r2)
            ᛴᲀᲈᛴ r3 = r10.m3367(r3)
            goto L59
        L57:
            ᛷᛴᛳᛷ r3 = defpackage.AbstractC1108.f4960
        L59:
            ᲈᛲᲈ r6 = new ᲈᛲᲈ
            r6.<init>(r10, r3, r2, r4)
            ᲁᲇᛸᲈ r2 = new ᲁᲇᛸᲈ
            r2.<init>(r0)
            ᛴᲀᲈᛴ r2 = r10.m3367(r2)
            ᲈᛲᲈ r3 = new ᲈᛲᲈ
            r3.<init>(r10, r2, r0, r4)
            ᛳᛴᲁᛸ r10 = r1.m1557(r11, r5)
            ᲈᛲᲈ r11 = new ᲈᛲᲈ
            r11.<init>(r9, r6, r3, r10)
            r3 = r11
        L76:
            return r3
        L77:
            java.lang.reflect.Type r9 = r11.f8477
            java.lang.Class r0 = r11.f8476
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r7 = r6.isAssignableFrom(r0)
            if (r7 != 0) goto L84
            goto Lab
        L84:
            java.lang.reflect.Type r9 = defpackage.AbstractC0209.m761(r9, r0, r6)
            boolean r0 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L94
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            java.lang.reflect.Type[] r9 = r9.getActualTypeArguments()
            r2 = r9[r5]
        L94:
            ᲁᲇᛸᲈ r9 = new ᲁᲇᛸᲈ
            r9.<init>(r2)
            ᛴᲀᲈᛴ r9 = r10.m3367(r9)
            ᲈᛲᲈ r0 = new ᲈᛲᲈ
            r0.<init>(r10, r9, r2, r4)
            ᛳᛴᲁᛸ r9 = r1.m1557(r11, r5)
            ᲁᛵᲁᛴ r3 = new ᲁᛵᲁᛴ
            r3.<init>(r0, r9, r5)
        Lab:
            return r3
    }
}
