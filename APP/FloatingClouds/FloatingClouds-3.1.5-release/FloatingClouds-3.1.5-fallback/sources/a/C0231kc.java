package a;

/* JADX INFO: renamed from: a.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0231kc implements a.InterfaceC0041a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class<?> f548a;

    public C0231kc(java.lang.Class r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.f548a = r2
            return
    }

    @Override // a.InterfaceC0041a3
    public final java.lang.Class<?> a() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f548a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0231kc
            if (r0 == 0) goto L12
            a.kc r2 = (a.C0231kc) r2
            java.lang.Class<?> r2 = r2.f548a
            java.lang.Class<?> r0 = r1.f548a
            boolean r2 = a.C0193i9.a(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f548a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<?> r1 = r2.f548a
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
