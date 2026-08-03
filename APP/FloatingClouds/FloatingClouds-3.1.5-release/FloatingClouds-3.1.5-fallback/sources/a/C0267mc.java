package a;

/* JADX INFO: renamed from: a.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0267mc<A, B> implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f578a;
    public final B b;

    public C0267mc(A r1, B r2) {
            r0 = this;
            r0.<init>()
            r0.f578a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a.C0267mc
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.mc r5 = (a.C0267mc) r5
            A r1 = r5.f578a
            A r3 = r4.f578a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            B r1 = r4.b
            B r5 = r5.b
            boolean r5 = a.C0193i9.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            A r1 = r3.f578a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            B r2 = r3.b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            A r1 = r2.f578a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            B r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
