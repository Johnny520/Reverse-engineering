package a;

/* JADX INFO: renamed from: a.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0143fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f473a;
    public final java.lang.ClassLoader b;

    public C0143fd(int r2, java.lang.ClassLoader r3) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r3, r0)
            r1.<init>()
            r1.f473a = r2
            r1.b = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof a.C0143fd
            if (r1 != 0) goto L9
            goto L1c
        L9:
            a.fd r4 = (a.C0143fd) r4
            int r1 = r4.f473a
            int r2 = r3.f473a
            if (r2 == r1) goto L12
            goto L1c
        L12:
            java.lang.ClassLoader r1 = r3.b
            java.lang.ClassLoader r4 = r4.b
            boolean r4 = a.C0193i9.a(r1, r4)
            if (r4 != 0) goto L1e
        L1c:
            r4 = 0
            return r4
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f473a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.lang.ClassLoader r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            a.B2 r0 = a.B2.f22a
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResolveContext(versionCode="
            r0.<init>(r1)
            int r1 = r2.f473a
            r0.append(r1)
            java.lang.String r1 = ", classLoader="
            r0.append(r1)
            java.lang.ClassLoader r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", cacheMode="
            r0.append(r1)
            a.B2 r1 = a.B2.f22a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
