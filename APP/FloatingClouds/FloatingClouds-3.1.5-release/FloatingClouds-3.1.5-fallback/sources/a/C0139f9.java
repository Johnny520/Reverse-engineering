package a;

/* JADX INFO: renamed from: a.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0139f9 extends a.C0103d9 {
    public static final a.C0139f9 d = null;

    static {
            a.f9 r0 = new a.f9
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            a.C0139f9.d = r0
            return
    }

    @Override // a.C0103d9
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof a.C0139f9
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            a.f9 r0 = (a.C0139f9) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            a.f9 r3 = (a.C0139f9) r3
            int r0 = r3.f434a
            int r1 = r2.f434a
            if (r1 != r0) goto L23
            int r3 = r3.b
            int r0 = r2.b
            if (r0 != r3) goto L23
        L21:
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // a.C0103d9
    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.f434a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            return r0
    }

    @Override // a.C0103d9
    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.f434a
            int r1 = r2.b
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // a.C0103d9
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f434a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
