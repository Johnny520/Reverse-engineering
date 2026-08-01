package defpackage;

/* JADX INFO: renamed from: ᛸᛵᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1484 implements java.lang.reflect.ParameterizedType {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.reflect.Type[] f6569;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.reflect.Type f6570;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Type f6571;

    public C1484(java.lang.reflect.Type r3, java.lang.Class r4, java.lang.reflect.Type... r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 != 0) goto L1d
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L1d
            java.lang.Class r1 = r4.getDeclaringClass()
            if (r1 != 0) goto L17
            goto L1d
        L17:
            java.lang.String r2 = "Must specify owner type for "
            defpackage.C2264.m3685(r4, r2)
            throw r0
        L1d:
            if (r3 != 0) goto L20
            goto L24
        L20:
            java.lang.reflect.Type r0 = defpackage.AbstractC0209.m773(r3)
        L24:
            r2.f6571 = r0
            java.lang.reflect.Type r3 = defpackage.AbstractC0209.m773(r4)
            r2.f6570 = r3
            java.lang.Object r3 = r5.clone()
            java.lang.reflect.Type[] r3 = (java.lang.reflect.Type[]) r3
            r2.f6569 = r3
            int r3 = r3.length
            r4 = 0
        L36:
            if (r4 >= r3) goto L4c
            java.lang.reflect.Type[] r5 = r2.f6569
            r5 = r5[r4]
            defpackage.AbstractC0209.m778(r5)
            java.lang.reflect.Type[] r5 = r2.f6569
            r0 = r5[r4]
            java.lang.reflect.Type r0 = defpackage.AbstractC0209.m773(r0)
            r5[r4] = r0
            int r4 = r4 + 1
            goto L36
        L4c:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Le
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            boolean r1 = defpackage.AbstractC0209.m779(r1, r2)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type[] getActualTypeArguments() {
            r0 = this;
            java.lang.reflect.Type[] r0 = r0.f6569
            java.lang.Object r0 = r0.clone()
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getOwnerType() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.f6571
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getRawType() {
            r0 = this;
            java.lang.reflect.Type r0 = r0.f6570
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Type[] r0 = r2.f6569
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.reflect.Type r1 = r2.f6570
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            java.lang.reflect.Type r2 = r2.f6571
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = 0
        L17:
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.reflect.Type[] r0 = r4.f6569
            int r1 = r0.length
            java.lang.reflect.Type r4 = r4.f6570
            if (r1 != 0) goto Lc
            java.lang.String r4 = defpackage.AbstractC0209.m771(r4)
            return r4
        Lc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 + 1
            int r3 = r3 * 30
            r2.<init>(r3)
            java.lang.String r4 = defpackage.AbstractC0209.m771(r4)
            r2.append(r4)
            java.lang.String r4 = "<"
            r2.append(r4)
            r4 = 0
            r4 = r0[r4]
            java.lang.String r4 = defpackage.AbstractC0209.m771(r4)
            r2.append(r4)
            r4 = 1
        L2c:
            if (r4 >= r1) goto L3f
            java.lang.String r3 = ", "
            r2.append(r3)
            r3 = r0[r4]
            java.lang.String r3 = defpackage.AbstractC0209.m771(r3)
            r2.append(r3)
            int r4 = r4 + 1
            goto L2c
        L3f:
            java.lang.String r4 = ">"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
