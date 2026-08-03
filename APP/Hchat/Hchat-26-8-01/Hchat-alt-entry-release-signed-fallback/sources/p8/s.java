package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f10415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f10416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p8.s f10417f;

    public s(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5, p8.s r6) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f10412a = r1
            r0.f10413b = r2
            r0.f10414c = r3
            r0.f10415d = r4
            r0.f10416e = r5
            r0.f10417f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p8.s
            if (r0 != 0) goto L8
            goto L47
        L8:
            p8.s r3 = (p8.s) r3
            java.lang.String r0 = r2.f10412a
            java.lang.String r1 = r3.f10412a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            int r0 = r2.f10413b
            int r1 = r3.f10413b
            if (r0 == r1) goto L1c
            goto L47
        L1c:
            java.lang.String r0 = r2.f10414c
            java.lang.String r1 = r3.f10414c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L47
        L27:
            java.lang.String r0 = r2.f10415d
            java.lang.String r1 = r3.f10415d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L47
        L32:
            java.lang.Object r0 = r2.f10416e
            java.lang.Object r1 = r3.f10416e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            p8.s r0 = r2.f10417f
            p8.s r3 = r3.f10417f
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L49
        L47:
            r3 = 0
            return r3
        L49:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10412a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f10413b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r3.f10414c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f10415d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.Object r2 = r3.f10416e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            p8.s r0 = r3.f10417f
            if (r0 != 0) goto L29
            r0 = 0
            goto L2d
        L29:
            int r0 = r0.hashCode()
        L2d:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", type="
            java.lang.String r1 = ", url="
            int r2 = r5.f10413b
            java.lang.String r3 = "SnsForwardMedia(id="
            java.lang.String r4 = r5.f10412a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = ", thumbUrl="
            java.lang.String r2 = ", nativeObject="
            java.lang.String r3 = r5.f10414c
            java.lang.String r4 = r5.f10415d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.Object r1 = r5.f10416e
            r0.append(r1)
            java.lang.String r1 = ", livePhotoVideo="
            r0.append(r1)
            p8.s r1 = r5.f10417f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
