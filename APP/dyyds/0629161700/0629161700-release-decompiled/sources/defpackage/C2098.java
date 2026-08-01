package defpackage;

/* JADX INFO: renamed from: ᲇᛷᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2098 extends defpackage.AbstractC2115 implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Enum[] f8998;

    public C2098(java.lang.Enum[] r1) {
            r0 = this;
            r0.<init>()
            r0.f8998 = r1
            return
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L5
            goto L17
        L5:
            java.lang.Enum r2 = (java.lang.Enum) r2
            java.lang.Enum[] r1 = r1.f8998
            int r0 = r2.ordinal()
            java.lang.Object r1 = defpackage.AbstractC2315.m3767(r0, r1)
            java.lang.Enum r1 = (java.lang.Enum) r1
            if (r1 != r2) goto L17
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            java.lang.Enum[] r3 = r3.f8998
            int r0 = r3.length
            if (r4 < 0) goto La
            if (r4 >= r0) goto La
            r3 = r3[r4]
            return r3
        La:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index: "
            java.lang.String r2 = ", size: "
            java.lang.String r4 = defpackage.AbstractC1124.m2143(r4, r0, r1, r2)
            r3.<init>(r4)
            throw r3
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            java.lang.Enum[] r2 = r2.f8998
            java.lang.Object r2 = defpackage.AbstractC2315.m3767(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L17
            return r0
        L17:
            return r1
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            java.lang.Enum[] r2 = r2.f8998
            java.lang.Object r2 = defpackage.AbstractC2315.m3767(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L17
            return r0
        L17:
            return r1
    }

    @Override // defpackage.AbstractC0050
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo395() {
            r0 = this;
            java.lang.Enum[] r0 = r0.f8998
            int r0 = r0.length
            return r0
    }
}
