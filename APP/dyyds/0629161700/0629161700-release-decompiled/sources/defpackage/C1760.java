package defpackage;

/* JADX INFO: renamed from: ᲀᲁᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1760 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.time.OffsetDateTime f7777;

    public C1760(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.time.OffsetDateTime r1 = java.time.OffsetDateTime.parse(r1)
            r0.f7777 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C1760
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r4 instanceof defpackage.C2074
            if (r1 != 0) goto Le
            return r2
        Le:
            ᲀᛷᛶ r4 = (defpackage.AbstractC1709) r4
            ᲀᲁᲁᛱ r4 = r4.mo3100()
            java.time.OffsetDateTime r3 = r3.f7777
            java.time.OffsetDateTime r4 = r4.f7777
            int r3 = r3.compareTo(r4)
            if (r3 != 0) goto L1f
            return r0
        L1f:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.time.OffsetDateTime r0 = r0.f7777
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final defpackage.C2074 mo3099() {
            r2 = this;
            ᲇᛶᲀᲇ r0 = new ᲇᛶᲀᲇ
            java.time.OffsetDateTime r2 = r2.f7777
            java.lang.String r2 = r2.toString()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final defpackage.C1760 mo3100() {
            r0 = this;
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class<ᲀᲁᲁᛱ> r0 = defpackage.C1760.class
            return r0
    }
}
