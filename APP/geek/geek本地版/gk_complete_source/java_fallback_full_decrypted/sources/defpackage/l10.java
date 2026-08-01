package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l10 implements java.util.Map.Entry {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public defpackage.l10 c;
    public defpackage.l10 d;

    public l10(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.l10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l10 r5 = (defpackage.l10) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.b
            java.lang.Object r5 = r5.b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.b
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.a
            int r0 = r0.hashCode()
            java.lang.Object r1 = r2.b
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "An entry modification is not supported"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r1 = r2.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
