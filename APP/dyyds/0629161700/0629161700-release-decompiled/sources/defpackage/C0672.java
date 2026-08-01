package defpackage;

/* JADX INFO: renamed from: ᛴᛵᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0672 implements java.util.Map.Entry {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0672 f3253;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f3254;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f3255;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0672 f3256;

    public C0672(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f3255 = r1
            r0.f3254 = r2
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r3 instanceof defpackage.C0672
            if (r0 != 0) goto L8
            goto L20
        L8:
            ᛴᛵᛳ r3 = (defpackage.C0672) r3
            java.lang.Object r0 = r2.f3255
            java.lang.Object r1 = r3.f3255
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            java.lang.Object r2 = r2.f3254
            java.lang.Object r3 = r3.f3254
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L20
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.f3255
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.f3254
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f3255
            int r0 = r0.hashCode()
            java.lang.Object r1 = r1.f3254
            int r1 = r1.hashCode()
            r1 = r1 ^ r0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "An entry modification is not supported"
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f3255
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.f3254
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
