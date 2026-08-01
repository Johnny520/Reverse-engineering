package defpackage;

/* JADX INFO: renamed from: ᛲᲁᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0361 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f1855;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public java.util.List f1856;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f1857;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f1858;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f1859;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f1860;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f1861;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f1862;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f1863;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f1864;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f1865;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f1866;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1088(android.view.View r8) {
            r7 = this;
            java.util.List r0 = r7.f1856
            int r0 = r0.size()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
        Lb:
            if (r3 >= r0) goto L41
            java.util.List r4 = r7.f1856
            java.lang.Object r4 = r4.get(r3)
            ᲈᛸᲈᛷ r4 = (defpackage.AbstractC2316) r4
            android.view.View r4 = r4.f9791
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            ᛵᛲᲁᛴ r5 = (defpackage.C0840) r5
            if (r4 == r8) goto L3e
            ᲈᛸᲈᛷ r6 = r5.f3863
            boolean r6 = r6.m3785()
            if (r6 == 0) goto L28
            goto L3e
        L28:
            ᲈᛸᲈᛷ r5 = r5.f3863
            int r5 = r5.m3782()
            int r6 = r7.f1860
            int r5 = r5 - r6
            int r6 = r7.f1859
            int r5 = r5 * r6
            if (r5 >= 0) goto L37
            goto L3e
        L37:
            if (r5 >= r2) goto L3e
            r1 = r4
            if (r5 != 0) goto L3d
            goto L41
        L3d:
            r2 = r5
        L3e:
            int r3 = r3 + 1
            goto Lb
        L41:
            if (r1 != 0) goto L47
            r8 = -1
            r7.f1860 = r8
            return
        L47:
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r8 = (defpackage.C0840) r8
            ᲈᛸᲈᛷ r8 = r8.f3863
            int r8 = r8.m3782()
            r7.f1860 = r8
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.view.View m1089(defpackage.C1633 r5) {
            r4 = this;
            java.util.List r0 = r4.f1856
            if (r0 == 0) goto L37
            int r5 = r0.size()
            r0 = 0
        L9:
            if (r0 >= r5) goto L35
            java.util.List r1 = r4.f1856
            java.lang.Object r1 = r1.get(r0)
            ᲈᛸᲈᛷ r1 = (defpackage.AbstractC2316) r1
            android.view.View r1 = r1.f9791
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            ᛵᛲᲁᛴ r2 = (defpackage.C0840) r2
            ᲈᛸᲈᛷ r3 = r2.f3863
            boolean r3 = r3.m3785()
            if (r3 == 0) goto L24
            goto L32
        L24:
            int r3 = r4.f1860
            ᲈᛸᲈᛷ r2 = r2.f3863
            int r2 = r2.m3782()
            if (r3 != r2) goto L32
            r4.m1088(r1)
            return r1
        L32:
            int r0 = r0 + 1
            goto L9
        L35:
            r4 = 0
            return r4
        L37:
            int r0 = r4.f1860
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            ᲈᛸᲈᛷ r5 = r5.m3000(r1, r0)
            android.view.View r5 = r5.f9791
            int r0 = r4.f1860
            int r1 = r4.f1859
            int r0 = r0 + r1
            r4.f1860 = r0
            return r5
    }
}
