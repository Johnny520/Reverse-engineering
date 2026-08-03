package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f12418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f12419h;

    public e(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f12418g = r1
            r0.f12419h = r2
            return
    }

    public final java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.f12418g
            return r0
    }

    public final java.lang.Object b() {
            r1 = this;
            java.lang.Object r0 = r1.f12419h
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof sf.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sf.e r5 = (sf.e) r5
            java.lang.Object r1 = r4.f12418g
            java.lang.Object r3 = r5.f12418g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r1 = r4.f12419h
            java.lang.Object r5 = r5.f12419h
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f12418g
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f12419h
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r2.f12418g
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r1 = r2.f12419h
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
