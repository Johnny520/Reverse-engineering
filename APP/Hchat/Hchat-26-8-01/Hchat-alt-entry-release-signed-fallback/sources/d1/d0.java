package d1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d1.d0 f1911g = null;

    static {
            d1.d0 r0 = new d1.d0
            r0.<init>()
            d1.d0.f1911g = r0
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            d1.b0 r9 = (d1.b0) r9
            d1.b0 r10 = (d1.b0) r10
            boolean r0 = d1.d.r(r9)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lab
            boolean r0 = d1.d.r(r10)
            if (r0 != 0) goto L14
            goto Lab
        L14:
            x1.f0 r9 = x1.k.w(r9)
            x1.f0 r10 = x1.k.w(r10)
            boolean r0 = gg.l.a(r9, r10)
            if (r0 == 0) goto L24
            goto Lba
        L24:
            r0 = 16
            x1.f0[] r3 = new x1.f0[r0]
            r4 = r1
        L29:
            if (r9 == 0) goto L4f
            int r5 = r4 + 1
            int r6 = r3.length
            if (r6 >= r5) goto L3d
            int r6 = r3.length
            int r7 = r6 * 2
            int r5 = java.lang.Math.max(r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r6)
            r3 = r5
        L3d:
            if (r4 == 0) goto L46
            r5 = 0
            int r5 = r5 + r2
            int r6 = r4 + 0
            java.lang.System.arraycopy(r3, r1, r3, r5, r6)
        L46:
            r3[r1] = r9
            int r4 = r4 + 1
            x1.f0 r9 = r9.u()
            goto L29
        L4f:
            x1.f0[] r9 = new x1.f0[r0]
            r0 = r1
        L52:
            if (r10 == 0) goto L78
            int r5 = r0 + 1
            int r6 = r9.length
            if (r6 >= r5) goto L66
            int r6 = r9.length
            int r7 = r6 * 2
            int r5 = java.lang.Math.max(r5, r7)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.System.arraycopy(r9, r1, r5, r1, r6)
            r9 = r5
        L66:
            if (r0 == 0) goto L6f
            r5 = 0
            int r5 = r5 + r2
            int r6 = r0 + 0
            java.lang.System.arraycopy(r9, r1, r9, r5, r6)
        L6f:
            r9[r1] = r10
            int r0 = r0 + 1
            x1.f0 r10 = r10.u()
            goto L52
        L78:
            int r4 = r4 - r2
            int r0 = r0 - r2
            int r10 = java.lang.Math.min(r4, r0)
            if (r10 < 0) goto La4
        L80:
            r0 = r3[r1]
            r2 = r9[r1]
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L9f
            r10 = r3[r1]
            x1.f0 r10 = (x1.f0) r10
            int r10 = r10.v()
            r9 = r9[r1]
            x1.f0 r9 = (x1.f0) r9
            int r9 = r9.v()
            int r9 = gg.l.c(r10, r9)
            return r9
        L9f:
            if (r1 == r10) goto La4
            int r1 = r1 + 1
            goto L80
        La4:
            java.lang.String r9 = "Could not find a common ancestor between the two FocusModifiers."
            j8.o.A(r9)
            r9 = 0
            return r9
        Lab:
            boolean r9 = d1.d.r(r9)
            if (r9 == 0) goto Lb3
            r9 = -1
            return r9
        Lb3:
            boolean r9 = d1.d.r(r10)
            if (r9 == 0) goto Lba
            return r2
        Lba:
            return r1
    }
}
