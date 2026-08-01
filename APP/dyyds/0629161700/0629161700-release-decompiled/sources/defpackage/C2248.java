package defpackage;

/* JADX INFO: renamed from: ᲈᛵᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2248 extends defpackage.AbstractC2115 implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int[] f9565;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1128[] f9566;

    public C2248(defpackage.C1128[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.f9566 = r1
            r0.f9565 = r2
            return
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1128
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            ᛶᛸᛸᛶ r2 = (defpackage.C1128) r2
            boolean r1 = super.contains(r2)
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            ᛶᛸᛸᛶ[] r0 = r0.f9566
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1128
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            ᛶᛸᛸᛶ r2 = (defpackage.C1128) r2
            int r1 = super.indexOf(r2)
            return r1
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1128
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            ᛶᛸᛸᛶ r2 = (defpackage.C1128) r2
            int r1 = super.lastIndexOf(r2)
            return r1
    }

    @Override // defpackage.AbstractC0050
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo395() {
            r0 = this;
            ᛶᛸᛸᛶ[] r0 = r0.f9566
            int r0 = r0.length
            return r0
    }
}
