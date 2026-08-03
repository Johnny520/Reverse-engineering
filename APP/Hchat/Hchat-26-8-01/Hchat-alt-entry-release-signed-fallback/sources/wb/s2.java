package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends wb.x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb.a f18981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb.c3 f18982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18983c;

    public /* synthetic */ s2(vb.a r1, wb.c3 r2, int r3) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public s2(vb.a r1, wb.c3 r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f18981a = r1
            r0.f18982b = r2
            r0.f18983c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.s2
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.s2 r3 = (wb.s2) r3
            vb.a r0 = r2.f18981a
            vb.a r1 = r3.f18981a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            wb.c3 r0 = r2.f18982b
            wb.c3 r1 = r3.f18982b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f18983c
            boolean r3 = r3.f18983c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            vb.a r0 = r2.f18981a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb.c3 r1 = r2.f18982b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.f18983c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Feature(provider="
            r0.<init>(r1)
            vb.a r1 = r3.f18981a
            r0.append(r1)
            java.lang.String r1 = ", sourceGroup="
            r0.append(r1)
            wb.c3 r1 = r3.f18982b
            r0.append(r1)
            java.lang.String r1 = ", returnToSearch="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f18983c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
