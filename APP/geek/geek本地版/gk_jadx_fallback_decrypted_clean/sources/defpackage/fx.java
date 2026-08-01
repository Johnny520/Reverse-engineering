package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx implements defpackage.la {
    public final java.lang.Class a;

    public fx(java.lang.Class r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.la
    public final java.lang.Class a() {
            r1 = this;
            java.lang.Class r0 = r1.a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.fx
            if (r0 == 0) goto L12
            fx r2 = (defpackage.fx) r2
            java.lang.Class r2 = r2.a
            java.lang.Class r0 = r1.a
            boolean r2 = defpackage.ip.i(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Class r0 = r1.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
