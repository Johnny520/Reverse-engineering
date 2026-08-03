package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends z4.e implements java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p4.e f10108i = null;

    static {
            p4.e r0 = new p4.e
            r1 = 0
            r0.<init>(r1)
            p4.e.f10108i = r0
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r8) {
            r7 = this;
            p4.e r8 = (p4.e) r8
            r0 = 0
            if (r7 != r8) goto L6
            goto L31
        L6:
            java.lang.Object[] r1 = r7.f22543h
            int r1 = r1.length
            java.lang.Object[] r2 = r8.f22543h
            int r2 = r2.length
            int r3 = java.lang.Math.min(r1, r2)
            r4 = r0
        L11:
            if (r4 >= r3) goto L29
            java.lang.Object r5 = r7.l(r4)
            p4.d r5 = (p4.d) r5
            java.lang.Object r6 = r8.l(r4)
            p4.d r6 = (p4.d) r6
            int r5 = r5.a(r6)
            if (r5 == 0) goto L26
            return r5
        L26:
            int r4 = r4 + 1
            goto L11
        L29:
            if (r1 >= r2) goto L2d
            r8 = -1
            return r8
        L2d:
            if (r1 <= r2) goto L31
            r8 = 1
            return r8
        L31:
            return r0
    }
}
