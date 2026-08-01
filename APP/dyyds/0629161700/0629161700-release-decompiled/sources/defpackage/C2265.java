package defpackage;

/* JADX INFO: renamed from: ᲈᛶᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2265 extends defpackage.AbstractC0050 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1326 f9604;

    public C2265(defpackage.C1326 r1) {
            r0 = this;
            r0.<init>()
            r0.f9604 = r1
            return
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r2 instanceof defpackage.C0216
        L6:
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            ᛱᲈᛴᛳ r2 = (defpackage.C0216) r2
            boolean r1 = super.contains(r2)
            return r1
    }

    @Override // defpackage.AbstractC0050, java.util.Collection
    public final boolean isEmpty() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            ᛱᛵᲇᲇ r0 = new ᛱᛵᲇᲇ
            int r1 = r4.size()
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r0.<init>(r3, r1, r2)
            ᛵᲀᛱᲈ r1 = new ᛵᲀᛱᲈ
            r2 = 0
            r1.<init>(r2, r0)
            ᲈᲈᛸᲁ r0 = new ᲈᲈᛸᲁ
            r2 = 5
            r0.<init>(r2, r4)
            ᛱᛷᛷᛲ r4 = new ᛱᛷᛷᛲ
            r2 = 2
            r4.<init>(r1, r0, r2)
            ᲇᛳᲀᲈ r0 = new ᲇᛳᲀᲈ
            r0.<init>(r4)
            return r0
    }

    @Override // defpackage.AbstractC0050
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final int mo395() {
            r0 = this;
            ᛷᛸᛱᛸ r0 = r0.f9604
            java.lang.Object r0 = r0.f5856
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r0 = r0.groupCount()
            int r0 = r0 + 1
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0216 m3687(int r3) {
            r2 = this;
            ᛷᛸᛱᛸ r2 = r2.f9604
            java.lang.Object r2 = r2.f5856
            java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
            int r0 = r2.start(r3)
            int r1 = r2.end(r3)
            ᛱᛵᲇᲇ r0 = defpackage.AbstractC1754.m3143(r0, r1)
            int r1 = r0.f9424
            if (r1 < 0) goto L20
            ᛱᲈᛴᛳ r1 = new ᛱᲈᛴᛳ
            java.lang.String r2 = r2.group(r3)
            r1.<init>(r2, r0)
            return r1
        L20:
            r2 = 0
            return r2
    }
}
