package xhss;

/* JADX INFO: renamed from: xhss.ᛲᛶᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0176 extends xhss.AbstractC0709 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0623 f699;

    public C0176(xhss.C0623 r1) {
            r0 = this;
            r0.<init>()
            r0.f699 = r1
            return
    }

    @Override // xhss.AbstractC0652, java.util.Collection, java.util.List
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
            xhss.ᛷᛱᛳᲁ r0 = r0.f699
            java.lang.Object r0 = r0.f2151
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.String r0 = r0.group(r1)
            if (r0 != 0) goto Le
            java.lang.String r0 = ""
        Le:
            return r0
    }

    @Override // xhss.AbstractC0709, java.util.List
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

    @Override // xhss.AbstractC0709, java.util.List
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

    @Override // xhss.AbstractC0652
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int mo426() {
            r0 = this;
            xhss.ᛷᛱᛳᲁ r0 = r0.f699
            java.lang.Object r0 = r0.f2151
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }
}
