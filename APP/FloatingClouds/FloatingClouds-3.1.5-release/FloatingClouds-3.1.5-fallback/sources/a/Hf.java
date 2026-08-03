package a;

/* JADX INFO: loaded from: classes.dex */
public final class Hf<A, B, C> implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.Serializable f116a;
    public final java.io.Serializable b;
    public final java.io.Serializable c;

    public Hf(java.io.Serializable r1, java.io.Serializable r2, java.io.Serializable r3) {
            r0 = this;
            r0.<init>()
            r0.f116a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof a.Hf
            if (r0 != 0) goto L8
            goto L2a
        L8:
            a.Hf r3 = (a.Hf) r3
            java.io.Serializable r0 = r3.f116a
            java.io.Serializable r1 = r2.f116a
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.io.Serializable r0 = r2.b
            java.io.Serializable r1 = r3.b
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.io.Serializable r0 = r2.c
            java.io.Serializable r3 = r3.c
            boolean r3 = a.C0193i9.a(r0, r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.io.Serializable r1 = r3.f116a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.io.Serializable r2 = r3.b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.io.Serializable r2 = r3.c
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r0 = r2.hashCode()
        L23:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.io.Serializable r1 = r3.f116a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.io.Serializable r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            java.io.Serializable r1 = r3.c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
