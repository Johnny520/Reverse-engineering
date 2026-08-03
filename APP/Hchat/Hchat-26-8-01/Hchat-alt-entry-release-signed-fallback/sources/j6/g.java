package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.reflect.WildcardType, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Type f6731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Type f6732h;

    public g(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
            r3 = this;
            r3.<init>()
            int r0 = r5.length
            r1 = 1
            if (r0 > r1) goto L4d
            int r0 = r4.length
            if (r0 != r1) goto L46
            int r0 = r5.length
            r2 = 0
            if (r0 != r1) goto L30
            r0 = r5[r2]
            java.util.Objects.requireNonNull(r0)
            r0 = r5[r2]
            j6.h.b(r0)
            r4 = r4[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r4 != r0) goto L29
            r4 = r5[r2]
            java.lang.reflect.Type r4 = j6.h.a(r4)
            r3.f6732h = r4
            r3.f6731g = r0
            return
        L29:
            java.lang.String r4 = "When lower bound is specified, upper bound must be Object"
            j8.o.t(r4)
            r4 = 0
            throw r4
        L30:
            r5 = r4[r2]
            java.util.Objects.requireNonNull(r5)
            r5 = r4[r2]
            j6.h.b(r5)
            r5 = 0
            r3.f6732h = r5
            r4 = r4[r2]
            java.lang.reflect.Type r4 = j6.h.a(r4)
            r3.f6731g = r4
            return
        L46:
            java.lang.String r4 = "Exactly one upper bound must be specified"
            j8.o.t(r4)
            r4 = 0
            throw r4
        L4d:
            java.lang.String r4 = "At most one lower bound is supported"
            j8.o.t(r4)
            r4 = 0
            throw r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Le
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            boolean r2 = j6.h.c(r1, r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getLowerBounds() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.f6732h
            if (r0 == 0) goto Lb
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r0
            return r1
        Lb:
            java.lang.reflect.Type[] r0 = j6.h.f6733a
            return r0
    }

    @Override // java.lang.reflect.WildcardType
    public final java.lang.reflect.Type[] getUpperBounds() {
            r3 = this;
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
            java.lang.reflect.Type r2 = r3.f6731g
            r0[r1] = r2
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.f6732h
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            goto Lc
        Lb:
            r0 = 1
        Lc:
            java.lang.reflect.Type r1 = r2.f6731g
            int r1 = r1.hashCode()
            int r1 = r1 + 31
            r0 = r0 ^ r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.f6732h
            if (r0 == 0) goto L17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "? super "
            r1.<init>(r2)
            java.lang.String r0 = j6.h.i(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L17:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.reflect.Type r1 = r3.f6731g
            if (r1 != r0) goto L20
            java.lang.String r0 = "?"
            return r0
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "? extends "
            r0.<init>(r2)
            java.lang.String r1 = j6.h.i(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
