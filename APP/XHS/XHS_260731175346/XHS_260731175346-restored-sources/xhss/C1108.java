package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲈᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1108 implements xhss.InterfaceC0341 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3581;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0230 f3582;

    public /* synthetic */ C1108(xhss.C0230 r1, int r2) {
            r0 = this;
            r0.f3581 = r2
            r0.f3582 = r1
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r10, xhss.C0032 r11) {
            r9 = this;
            int r0 = r9.f3581
            xhss.ᛳᛱᛲᲀ r1 = r9.f3582
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            r4 = 2
            r5 = 0
            switch(r0) {
                case 0: goto L77;
                default: goto Lc;
            }
        Lc:
            java.lang.reflect.Type r0 = r11.f209
            java.lang.Class r6 = r11.f211
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
            java.lang.reflect.Type r0 = xhss.C0915.m1510(r0, r6, r7)
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
            xhss.ᛱᛳᲈᛷ r3 = new xhss.ᛱᛳᲈᛷ
            r3.<init>(r2)
            xhss.ᛲᛱᛶᛴ r3 = r10.m1815(r3)
            goto L59
        L57:
            xhss.ᛴᲈᲁᛱ r3 = xhss.AbstractC0073.f379
        L59:
            xhss.ᲈᛱᛲᛴ r6 = new xhss.ᲈᛱᛲᛴ
            r6.<init>(r10, r3, r2, r4)
            xhss.ᛱᛳᲈᛷ r2 = new xhss.ᛱᛳᲈᛷ
            r2.<init>(r0)
            xhss.ᛲᛱᛶᛴ r2 = r10.m1815(r2)
            xhss.ᲈᛱᛲᛴ r3 = new xhss.ᲈᛱᛲᛴ
            r3.<init>(r10, r2, r0, r4)
            xhss.ᲁᲀᛶᛲ r10 = r1.m532(r11, r5)
            xhss.ᲈᛱᛲᛴ r11 = new xhss.ᲈᛱᛲᛴ
            r11.<init>(r9, r6, r3, r10)
            r3 = r11
        L76:
            return r3
        L77:
            java.lang.reflect.Type r9 = r11.f209
            java.lang.Class r0 = r11.f211
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r7 = r6.isAssignableFrom(r0)
            if (r7 != 0) goto L84
            goto Lab
        L84:
            java.lang.reflect.Type r9 = xhss.C0915.m1510(r9, r0, r6)
            boolean r0 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L94
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            java.lang.reflect.Type[] r9 = r9.getActualTypeArguments()
            r2 = r9[r5]
        L94:
            xhss.ᛱᛳᲈᛷ r9 = new xhss.ᛱᛳᲈᛷ
            r9.<init>(r2)
            xhss.ᛲᛱᛶᛴ r9 = r10.m1815(r9)
            xhss.ᲈᛱᛲᛴ r0 = new xhss.ᲈᛱᛲᛴ
            r0.<init>(r10, r9, r2, r4)
            xhss.ᲁᲀᛶᛲ r9 = r1.m532(r11, r5)
            xhss.ᛸᛴᛴᛳ r3 = new xhss.ᛸᛴᛴᛳ
            r3.<init>(r0, r9, r5)
        Lab:
            return r3
    }
}
