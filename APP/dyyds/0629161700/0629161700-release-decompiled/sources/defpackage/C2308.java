package defpackage;

/* JADX INFO: renamed from: ᲈᛸᛶᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2308 extends defpackage.AbstractC1709 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Boolean f9764;

    public C2308(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.toString()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f9764 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.C2308
            if (r0 != 0) goto L8
            goto L14
        L8:
            ᲈᛸᛶᛶ r2 = (defpackage.C2308) r2
            java.lang.Boolean r1 = r1.f9764
            java.lang.Boolean r2 = r2.f9764
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Boolean r0 = r0.f9764
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final defpackage.C2308 mo3102() {
            r0 = this;
            return r0
    }

    @Override // defpackage.AbstractC1709
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final java.lang.Class mo483(defpackage.C1412 r1) {
            r0 = this;
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            return r0
    }
}
