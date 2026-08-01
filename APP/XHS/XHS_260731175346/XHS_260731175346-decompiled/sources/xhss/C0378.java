package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛶᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0378 extends xhss.AbstractC0562 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final java.util.HashMap f1365 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Constructor f1366;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object[] f1367;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.util.HashMap f1368;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            java.lang.Class r3 = java.lang.Byte.TYPE
            r0.put(r3, r2)
            java.lang.Class r2 = java.lang.Short.TYPE
            java.lang.Short r3 = java.lang.Short.valueOf(r1)
            r0.put(r2, r3)
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r3)
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Class r3 = java.lang.Long.TYPE
            r0.put(r3, r2)
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Class r3 = java.lang.Float.TYPE
            r0.put(r3, r2)
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Class r3 = java.lang.Double.TYPE
            r0.put(r3, r2)
            java.lang.Class r2 = java.lang.Character.TYPE
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r0.put(r2, r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.put(r1, r2)
            xhss.C0378.f1365 = r0
            return
    }

    public C0378(java.lang.Class r5, xhss.C0199 r6) {
            r4 = this;
            r4.<init>(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r4.f1368 = r6
            xhss.ᲈᲀᲀᛱ r6 = xhss.AbstractC1031.f3335
            java.lang.reflect.Constructor r0 = r6.mo798(r5)
            r4.f1366 = r0
            xhss.AbstractC1031.m1681(r0)
            java.lang.String[] r5 = r6.mo797(r5)
            r6 = 0
            r0 = r6
        L1b:
            int r1 = r5.length
            if (r0 >= r1) goto L2c
            java.util.HashMap r1 = r4.f1368
            r2 = r5[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L1b
        L2c:
            java.lang.reflect.Constructor r5 = r4.f1366
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r0 = r5.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.f1367 = r0
        L37:
            int r0 = r5.length
            if (r6 >= r0) goto L49
            java.lang.Object[] r0 = r4.f1367
            java.util.HashMap r1 = xhss.C0378.f1365
            r2 = r5[r6]
            java.lang.Object r1 = r1.get(r2)
            r0[r6] = r1
            int r6 = r6 + 1
            goto L37
        L49:
            return
    }

    @Override // xhss.AbstractC0562
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final java.lang.Object mo288(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.String r0 = "' with args "
            java.lang.String r1 = "Failed to invoke constructor '"
            java.lang.reflect.Constructor r5 = r5.f1366
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Ld java.lang.Throwable -> L32 java.lang.IllegalAccessException -> L53
            return r5
        Ld:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = xhss.AbstractC1031.m1676(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = java.util.Arrays.toString(r6)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r6 = r2.getCause()
            r3.<init>(r5, r6)
            throw r3
        L32:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = xhss.AbstractC1031.m1676(r5)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
        L53:
            r5 = move-exception
            xhss.ᲈᲀᲀᛱ r6 = xhss.AbstractC1031.f3335
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            r6.<init>(r0, r5)
            throw r6
    }

    @Override // xhss.AbstractC0562
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ */
    public final java.lang.Object mo289() {
            r0 = this;
            java.lang.Object[] r0 = r0.f1367
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    @Override // xhss.AbstractC0562
    /* JADX INFO: renamed from: ᲇᛶᛴᲀ */
    public final void mo290(java.lang.Object r3, xhss.C0385 r4, xhss.C0981 r5) {
            r2 = this;
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.String r0 = r5.f3185
            java.util.HashMap r1 = r2.f1368
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L43
            int r2 = r1.intValue()
            xhss.ᛲᛱᛶᛴ r1 = r5.f3191
            java.lang.Object r1 = r1.mo119(r4)
            if (r1 != 0) goto L40
            boolean r5 = r5.f3189
            if (r5 != 0) goto L1f
            goto L40
        L1f:
            xhss.ᛵᛲᛲᲇ r2 = new xhss.ᛵᛲᛲᲇ
            r3 = 0
            java.lang.String r3 = r4.m764(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "null is not allowed as value for record component '"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = "' of primitive type; at path "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L40:
            r3[r2] = r1
            return
        L43:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.reflect.Constructor r2 = r2.f1366
            java.lang.String r2 = xhss.AbstractC1031.m1676(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Could not find the index in the constructor '"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = "' for field with name '"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r2 = "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }
}
