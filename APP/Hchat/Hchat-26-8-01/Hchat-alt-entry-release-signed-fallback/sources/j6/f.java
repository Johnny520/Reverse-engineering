package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.lang.reflect.ParameterizedType, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Type f6728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Type f6729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Type[] f6730i;

    public f(java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type... r4) {
            r1 = this;
            r1.<init>()
            java.util.Objects.requireNonNull(r3)
            if (r2 != 0) goto L24
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L24
            java.lang.Class r0 = r3.getDeclaringClass()
            if (r0 != 0) goto L19
            goto L24
        L19:
            java.lang.String r2 = "Must specify owner type for "
            java.lang.String r2 = p.a.k(r3, r2)
            j8.o.t(r2)
            r2 = 0
            throw r2
        L24:
            if (r2 != 0) goto L28
            r2 = 0
            goto L2c
        L28:
            java.lang.reflect.Type r2 = j6.h.a(r2)
        L2c:
            r1.f6728g = r2
            java.lang.reflect.Type r2 = j6.h.a(r3)
            r1.f6729h = r2
            java.lang.Object r2 = r4.clone()
            java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
            r1.f6730i = r2
            int r2 = r2.length
            r3 = 0
        L3e:
            if (r3 >= r2) goto L5b
            java.lang.reflect.Type[] r4 = r1.f6730i
            r4 = r4[r3]
            java.util.Objects.requireNonNull(r4)
            java.lang.reflect.Type[] r4 = r1.f6730i
            r4 = r4[r3]
            j6.h.b(r4)
            java.lang.reflect.Type[] r4 = r1.f6730i
            r0 = r4[r3]
            java.lang.reflect.Type r0 = j6.h.a(r0)
            r4[r3] = r0
            int r3 = r3 + 1
            goto L3e
        L5b:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Le
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            boolean r2 = j6.h.c(r1, r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.f6730i
            java.lang.Object r0 = r0.clone()
            java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f6728g
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    public final java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f6729h
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Type[] r0 = r2.f6730i
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.reflect.Type r1 = r2.f6729h
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            java.lang.reflect.Type r1 = r2.f6728g
            if (r1 == 0) goto L16
            int r1 = r1.hashCode()
            goto L17
        L16:
            r1 = 0
        L17:
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.reflect.Type[] r0 = r5.f6730i
            int r1 = r0.length
            java.lang.reflect.Type r2 = r5.f6729h
            if (r1 != 0) goto Lc
            java.lang.String r0 = j6.h.i(r2)
            return r0
        Lc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r1 + 1
            int r4 = r4 * 30
            r3.<init>(r4)
            java.lang.String r2 = j6.h.i(r2)
            r3.append(r2)
            java.lang.String r2 = "<"
            r3.append(r2)
            r2 = 0
            r2 = r0[r2]
            java.lang.String r2 = j6.h.i(r2)
            r3.append(r2)
            r2 = 1
        L2c:
            if (r2 >= r1) goto L3f
            java.lang.String r4 = ", "
            r3.append(r4)
            r4 = r0[r2]
            java.lang.String r4 = j6.h.i(r4)
            r3.append(r4)
            int r2 = r2 + 1
            goto L2c
        L3f:
            java.lang.String r0 = ">"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
