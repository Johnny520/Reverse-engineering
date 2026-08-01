package defpackage;

/* JADX INFO: renamed from: ᛷᛶᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1305 extends defpackage.AbstractC0761 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final java.util.HashMap f5770 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.HashMap f5771;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object[] f5772;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Constructor f5773;

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
            defpackage.C1305.f5770 = r0
            return
    }

    public C1305(java.lang.Class r5, defpackage.C2191 r6) {
            r4 = this;
            r4.<init>(r6)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r4.f5771 = r6
            ᛲᲈᲀᲈ r6 = defpackage.AbstractC2026.f8732
            java.lang.reflect.Constructor r0 = r6.mo1139(r5)
            r4.f5773 = r0
            defpackage.AbstractC2026.m3417(r0)
            java.lang.String[] r5 = r6.mo1141(r5)
            r6 = 0
            r0 = r6
        L1b:
            int r1 = r5.length
            if (r0 >= r1) goto L2c
            java.util.HashMap r1 = r4.f5771
            r2 = r5[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L1b
        L2c:
            java.lang.reflect.Constructor r5 = r4.f5773
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r0 = r5.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r4.f5772 = r0
        L37:
            int r0 = r5.length
            if (r6 >= r0) goto L49
            java.lang.Object[] r0 = r4.f5772
            java.util.HashMap r1 = defpackage.C1305.f5770
            r2 = r5[r6]
            java.lang.Object r1 = r1.get(r2)
            r0[r6] = r1
            int r6 = r6 + 1
            goto L37
        L49:
            return
    }

    @Override // defpackage.AbstractC0761
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final java.lang.Object mo990(java.lang.Object r6) {
            r5 = this;
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.String r0 = "' with args "
            java.lang.String r1 = "Failed to invoke constructor '"
            java.lang.reflect.Constructor r5 = r5.f5773
            r2 = 0
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.Throwable -> L31 java.lang.IllegalAccessException -> L52
            return r5
        Le:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = defpackage.AbstractC2026.m3416(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = java.util.Arrays.toString(r6)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r6 = r3.getCause()
            defpackage.C0086.m548(r5, r6)
            return r2
        L31:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r5 = defpackage.AbstractC2026.m3416(r5)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
        L52:
            r5 = move-exception
            ᛲᲈᲀᲈ r6 = defpackage.AbstractC2026.f8732
            java.lang.String r6 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.C0086.m548(r6, r5)
            return r2
    }

    @Override // defpackage.AbstractC0761
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final java.lang.Object mo991() {
            r0 = this;
            java.lang.Object[] r0 = r0.f5772
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    @Override // defpackage.AbstractC0761
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public final void mo992(java.lang.Object r3, defpackage.C1103 r4, defpackage.C2185 r5) {
            r2 = this;
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.String r0 = r5.f9274
            java.util.HashMap r1 = r2.f5771
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L43
            int r2 = r1.intValue()
            ᛴᲀᲈᛴ r1 = r5.f9277
            java.lang.Object r1 = r1.mo562(r4)
            if (r1 != 0) goto L40
            boolean r5 = r5.f9278
            if (r5 != 0) goto L1f
            goto L40
        L1f:
            ᛸᛵᛳᲀ r2 = new ᛸᛵᛳᲀ
            r3 = 0
            java.lang.String r3 = r4.m2106(r3)
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
            java.lang.reflect.Constructor r2 = r2.f5773
            java.lang.String r2 = defpackage.AbstractC2026.m3416(r2)
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
