package defpackage;

/* JADX INFO: renamed from: ᛵᛲᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0828 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C1128 f3826 = null;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final defpackage.C1128 f3827 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C1128 f3828 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C1128 f3829 = null;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C1128 f3830 = null;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final defpackage.C1128 f3831 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f3832;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1128 f3833;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1128 f3834;

    static {
            java.lang.String r0 = ":"
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0762.m1688(r0)
            defpackage.C0828.f3829 = r0
            java.lang.String r0 = ":status"
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0762.m1688(r0)
            defpackage.C0828.f3828 = r0
            java.lang.String r0 = ":method"
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0762.m1688(r0)
            defpackage.C0828.f3830 = r0
            java.lang.String r0 = ":path"
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0762.m1688(r0)
            defpackage.C0828.f3831 = r0
            java.lang.String r0 = ":scheme"
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0762.m1688(r0)
            defpackage.C0828.f3826 = r0
            java.lang.String r0 = ":authority"
            ᛶᛸᛸᛶ r0 = defpackage.AbstractC0762.m1688(r0)
            defpackage.C0828.f3827 = r0
            return
    }

    public C0828(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            byte[] r2 = r4.getBytes(r1)
            r0.<init>(r2)
            r0.f5018 = r4
            ᛶᛸᛸᛶ r4 = new ᛶᛸᛸᛶ
            byte[] r1 = r5.getBytes(r1)
            r4.<init>(r1)
            r4.f5018 = r5
            r3.<init>(r0, r4)
            return
    }

    public C0828(defpackage.C1128 r3, java.lang.String r4) {
            r2 = this;
            ᛶᛸᛸᛶ r0 = new ᛶᛸᛸᛶ
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.f5018 = r4
            r2.<init>(r3, r0)
            return
    }

    public C0828(defpackage.C1128 r1, defpackage.C1128 r2) {
            r0 = this;
            r0.<init>()
            r0.f3833 = r1
            r0.f3834 = r2
            int r1 = r1.mo2165()
            int r1 = r1 + 32
            int r2 = r2.mo2165()
            int r2 = r2 + r1
            r0.f3832 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.C0828
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ᛵᛲᛵᲁ r5 = (defpackage.C0828) r5
            ᛶᛸᛸᛶ r1 = r4.f3833
            ᛶᛸᛸᛶ r3 = r5.f3833
            boolean r1 = defpackage.AbstractC0498.m1280(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ᛶᛸᛸᛶ r4 = r4.f3834
            ᛶᛸᛸᛶ r5 = r5.f3834
            boolean r4 = defpackage.AbstractC0498.m1280(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            ᛶᛸᛸᛶ r0 = r1.f3833
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ᛶᛸᛸᛶ r1 = r1.f3834
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            ᛶᛸᛸᛶ r1 = r2.f3833
            java.lang.String r1 = r1.m2157()
            r0.<init>(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            ᛶᛸᛸᛶ r2 = r2.f3834
            java.lang.String r2 = r2.m2157()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
