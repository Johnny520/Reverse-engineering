package defpackage;

/* JADX INFO: renamed from: ᛴᛸᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0726 extends defpackage.AbstractC2115 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1326 f3446;

    public C0726(defpackage.C1326 r1) {
            r0 = this;
            r0.<init>()
            r0.f3446 = r1
            return
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = super.contains(r2)
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            ᛷᛸᛱᛸ r0 = r0.f3446
            java.lang.Object r0 = r0.f5856
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.String r0 = r0.group(r1)
            if (r0 != 0) goto Le
            java.lang.String r0 = ""
        Le:
            return r0
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = super.indexOf(r2)
            return r1
    }

    @Override // defpackage.AbstractC2115, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = super.lastIndexOf(r2)
            return r1
    }

    @Override // defpackage.AbstractC0050
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo395() {
            r0 = this;
            ᛷᛸᛱᛸ r0 = r0.f3446
            java.lang.Object r0 = r0.f5856
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }
}
