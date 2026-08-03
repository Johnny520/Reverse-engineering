package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f12428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f12429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f12430i;

    public j(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f12428g = r1
            r0.f12429h = r2
            r0.f12430i = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof sf.j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sf.j r5 = (sf.j) r5
            java.lang.Object r1 = r4.f12428g
            java.lang.Object r3 = r5.f12428g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.f12429h
            java.lang.Object r3 = r5.f12429h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Object r1 = r4.f12430i
            java.lang.Object r5 = r5.f12430i
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f12428g
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f12429h
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f12430i
            if (r2 != 0) goto L1f
            goto L23
        L1f:
            int r0 = r2.hashCode()
        L23:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r3.f12428g
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r2 = r3.f12429h
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r1 = r3.f12430i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
