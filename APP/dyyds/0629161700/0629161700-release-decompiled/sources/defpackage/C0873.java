package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0873 extends defpackage.AbstractC1109 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f3945;

    @Override // defpackage.AbstractC1109, java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ᛶᛷᛵᛸ r2 = (defpackage.AbstractC1109) r2
            boolean r0 = r2 instanceof defpackage.C0873
            if (r0 == 0) goto L11
            ᛵᛴᛷᛱ r2 = (defpackage.C0873) r2
            int r2 = r2.f3945
            int r1 = r1.f3945
            int r1 = java.lang.Integer.compare(r2, r1)
            return r1
        L11:
            int r1 = super.mo1856(r2)
            return r1
    }

    @Override // defpackage.AbstractC1109
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int mo1856(defpackage.AbstractC1109 r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.AbstractC1109
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo1494() {
            r0 = this;
            int r0 = r0.f3945
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
