package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.k f12544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2.k f12545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sh.f0 f12548e;

    public d0(u2.k r1, u2.k r2, long r3, long r5, sh.f0 r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r7.getClass()
            r0.<init>()
            r0.f12544a = r1
            r0.f12545b = r2
            r0.f12546c = r3
            r0.f12547d = r5
            r0.f12548e = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof sh.d0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sh.d0 r8 = (sh.d0) r8
            u2.k r1 = r7.f12544a
            u2.k r3 = r8.f12544a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            u2.k r1 = r7.f12545b
            u2.k r3 = r8.f12545b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f12546c
            long r5 = r8.f12546c
            boolean r1 = f1.u0.a(r3, r5)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r7.f12547d
            long r5 = r8.f12547d
            boolean r1 = f1.u0.a(r3, r5)
            if (r1 != 0) goto L38
            return r2
        L38:
            sh.f0 r1 = r7.f12548e
            sh.f0 r8 = r8.f12548e
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            u2.k r0 = r5.f12544a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            u2.k r2 = r5.f12545b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = f1.u0.f3123c
            long r3 = r5.f12546c
            int r0 = eh.a.f(r2, r1, r3)
            long r2 = r5.f12547d
            int r0 = eh.a.f(r0, r1, r2)
            sh.f0 r1 = r5.f12548e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.f12546c
            java.lang.String r0 = f1.u0.b(r0)
            long r1 = r5.f12547d
            java.lang.String r1 = f1.u0.b(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ListPopupLayoutInfo(windowBounds="
            r2.<init>(r3)
            u2.k r3 = r5.f12544a
            r2.append(r3)
            java.lang.String r3 = ", popupMargin="
            r2.append(r3)
            u2.k r3 = r5.f12545b
            r2.append(r3)
            java.lang.String r3 = ", effectiveTransformOrigin="
            r2.append(r3)
            java.lang.String r3 = ", localTransformOrigin="
            java.lang.String r4 = ", popupLayoutPosition="
            j8.b.t(r2, r0, r3, r1, r4)
            sh.f0 r0 = r5.f12548e
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
