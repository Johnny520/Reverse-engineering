package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp extends defpackage.fp {
    public static final defpackage.hp d = null;

    static {
            hp r0 = new hp
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            defpackage.hp.d = r0
            return
    }

    @Override // defpackage.fp
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.hp
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            hp r0 = (defpackage.hp) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            hp r3 = (defpackage.hp) r3
            int r0 = r3.a
            int r1 = r2.a
            if (r1 != r0) goto L23
            int r0 = r2.b
            int r3 = r3.b
            if (r0 != r3) goto L23
        L21:
            r3 = 1
            return r3
        L23:
            r3 = 0
            return r3
    }

    @Override // defpackage.fp
    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.fp
    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.a
            int r1 = r2.b
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // defpackage.fp
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
