package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0128 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f1058;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int[] f1059;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f1060;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f1061;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m642(int r6, int r7) {
            r5 = this;
            if (r6 < 0) goto L38
            if (r7 < 0) goto L32
            int r0 = r5.f1058
            int r1 = r0 * 2
            int[] r2 = r5.f1059
            r3 = 4
            if (r2 != 0) goto L16
            int[] r0 = new int[r3]
            r5.f1059 = r0
            r2 = -1
            java.util.Arrays.fill(r0, r2)
            goto L23
        L16:
            int r4 = r2.length
            if (r1 < r4) goto L23
            int r0 = r0 * r3
            int[] r0 = new int[r0]
            r5.f1059 = r0
            int r3 = r2.length
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r0, r4, r3)
        L23:
            int[] r0 = r5.f1059
            r0[r1] = r6
            int r1 = r1 + 1
            r0[r1] = r7
            int r6 = r5.f1058
            int r6 = r6 + 1
            r5.f1058 = r6
            return
        L32:
            java.lang.String r5 = "Pixel distance must be non-negative"
            defpackage.C2264.m3684(r5)
            return
        L38:
            java.lang.String r5 = "Layout positions must be non-negative"
            defpackage.C2264.m3684(r5)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m643(defpackage.C0055 r5, boolean r6) {
            r4 = this;
            r0 = 0
            r4.f1058 = r0
            int[] r0 = r4.f1059
            if (r0 == 0) goto Lb
            r1 = -1
            java.util.Arrays.fill(r0, r1)
        Lb:
            ᛷᛵᛱᲀ r0 = r5.f682
            ᛶᲈᲀᲇ r1 = r5.f633
            if (r1 == 0) goto L49
            if (r0 == 0) goto L49
            boolean r1 = r0.f5682
            if (r1 == 0) goto L49
            if (r6 == 0) goto L2b
            ᛵᛴᛴᛳ r1 = r5.f686
            boolean r1 = r1.m1837()
            if (r1 != 0) goto L3a
            ᛶᲈᲀᲇ r1 = r5.f633
            int r1 = r1.getItemCount()
            r0.mo161(r1, r4)
            goto L3a
        L2b:
            boolean r1 = r5.m445()
            if (r1 != 0) goto L3a
            int r1 = r4.f1060
            int r2 = r4.f1061
            ᛵᲈᲁᲀ r3 = r5.f623
            r0.mo159(r1, r2, r3, r4)
        L3a:
            int r4 = r4.f1058
            int r1 = r0.f5689
            if (r4 <= r1) goto L49
            r0.f5689 = r4
            r0.f5680 = r6
            ᲀᛲᲁᛳ r4 = r5.f637
            r4.m3004()
        L49:
            return
    }
}
