package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.lang.reflect.GenericArrayType, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Type f6727g;

    public e(java.lang.reflect.Type r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            java.lang.reflect.Type r1 = j6.h.a(r1)
            r0.f6727g = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Le
            java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
            boolean r2 = j6.h.c(r1, r2)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // java.lang.reflect.GenericArrayType
    public final java.lang.reflect.Type getGenericComponentType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f6727g
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f6727g
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r1 = r2.f6727g
            java.lang.String r1 = j6.h.i(r1)
            r0.append(r1)
            java.lang.String r1 = "[]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
