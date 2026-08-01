package defpackage;

/* JADX INFO: renamed from: ᲇᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2156 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C2156 f9174 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.math.BigDecimal f9175;

    static {
            ᲇᲇᲈᲀ r0 = new ᲇᲇᲈᲀ
            r1 = 0
            r0.<init>(r1)
            defpackage.C2156.f9174 = r0
            return
    }

    public C2156(java.lang.CharSequence r2) {
            r1 = this;
            r1.<init>()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r1.f9175 = r0
            return
    }

    public C2156(java.math.BigDecimal r1) {
            r0 = this;
            r0.<init>()
            r0.f9175 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.C2156
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r4 instanceof defpackage.C2074
            if (r1 != 0) goto Le
            return r2
        Le:
            ᲀᛷᛶ r4 = (defpackage.AbstractC1709) r4
            ᲇᲇᲈᲀ r4 = r4.mo3101()
            ᲇᲇᲈᲀ r1 = defpackage.C2156.f9174
            if (r4 != r1) goto L19
            return r2
        L19:
            java.math.BigDecimal r3 = r3.f9175
            java.math.BigDecimal r4 = r4.f9175
            int r3 = r3.compareTo(r4)
            if (r3 != 0) goto L24
            return r0
        L24:
            return r2
    }

    public final java.lang.String toString() {
            r0 = this;
            java.math.BigDecimal r0 = r0.f9175
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public final defpackage.C2074 mo3099() {
            r2 = this;
            ᲇᛶᲀᲇ r0 = new ᲇᛶᲀᲇ
            java.math.BigDecimal r2 = r2.f9175
            java.lang.String r2 = r2.toString()
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C2156 mo3101() {
            r0 = this;
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            return r0
    }
}
