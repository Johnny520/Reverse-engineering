package wf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements wf.g, java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.g f20783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wf.e f20784h;

    public b(wf.e r1, wf.g r2) {
            r0 = this;
            r2.getClass()
            r1.getClass()
            r0.<init>()
            r0.f20783g = r2
            r0.f20784h = r1
            return
    }

    @Override // wf.g
    public final wf.g e(wf.g r3) {
            r2 = this;
            r3.getClass()
            wf.h r0 = wf.h.f20786g
            if (r3 != r0) goto L8
            return r2
        L8:
            wb.m0 r0 = new wb.m0
            r1 = 10
            r0.<init>(r1)
            java.lang.Object r3 = r3.k(r0, r2)
            wf.g r3 = (wf.g) r3
            return r3
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 == r7) goto L5f
            boolean r0 = r7 instanceof wf.b
            r1 = 0
            if (r0 == 0) goto L5e
            wf.b r7 = (wf.b) r7
            r0 = 2
            r2 = r7
            r3 = r0
        Lc:
            wf.g r2 = r2.f20783g
            boolean r4 = r2 instanceof wf.b
            r5 = 0
            if (r4 == 0) goto L16
            wf.b r2 = (wf.b) r2
            goto L17
        L16:
            r2 = r5
        L17:
            if (r2 != 0) goto L5b
            r2 = r6
        L1a:
            wf.g r2 = r2.f20783g
            boolean r4 = r2 instanceof wf.b
            if (r4 == 0) goto L23
            wf.b r2 = (wf.b) r2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 != 0) goto L58
            if (r3 != r0) goto L5e
            r0 = r6
        L29:
            wf.e r2 = r0.f20784h
            wf.f r3 = r2.getKey()
            wf.e r3 = r7.s(r3)
            boolean r2 = gg.l.a(r3, r2)
            if (r2 != 0) goto L3b
            r7 = r1
            goto L55
        L3b:
            wf.g r0 = r0.f20783g
            boolean r2 = r0 instanceof wf.b
            if (r2 == 0) goto L44
            wf.b r0 = (wf.b) r0
            goto L29
        L44:
            r0.getClass()
            wf.e r0 = (wf.e) r0
            wf.f r2 = r0.getKey()
            wf.e r7 = r7.s(r2)
            boolean r7 = gg.l.a(r7, r0)
        L55:
            if (r7 == 0) goto L5e
            goto L5f
        L58:
            int r0 = r0 + 1
            goto L1a
        L5b:
            int r3 = r3 + 1
            goto Lc
        L5e:
            return r1
        L5f:
            r7 = 1
            return r7
    }

    public final int hashCode() {
            r2 = this;
            wf.g r0 = r2.f20783g
            int r0 = r0.hashCode()
            wf.e r1 = r2.f20784h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r2, java.lang.Object r3) {
            r1 = this;
            wf.g r0 = r1.f20783g
            java.lang.Object r3 = r0.k(r2, r3)
            wf.e r0 = r1.f20784h
            java.lang.Object r2 = r2.invoke(r3, r0)
            return r2
    }

    @Override // wf.g
    public final wf.e s(wf.f r3) {
            r2 = this;
            r3.getClass()
            r0 = r2
        L4:
            wf.e r1 = r0.f20784h
            wf.e r1 = r1.s(r3)
            if (r1 == 0) goto Ld
            return r1
        Ld:
            wf.g r0 = r0.f20783g
            boolean r1 = r0 instanceof wf.b
            if (r1 == 0) goto L16
            wf.b r0 = (wf.b) r0
            goto L4
        L16:
            wf.e r3 = r0.s(r3)
            return r3
    }

    @Override // wf.g
    public final wf.g t(wf.f r4) {
            r3 = this;
            r4.getClass()
            wf.e r0 = r3.f20784h
            wf.e r1 = r0.s(r4)
            wf.g r2 = r3.f20783g
            if (r1 == 0) goto Le
            return r2
        Le:
            wf.g r4 = r2.t(r4)
            if (r4 != r2) goto L15
            return r3
        L15:
            wf.h r1 = wf.h.f20786g
            if (r4 != r1) goto L1a
            return r0
        L1a:
            wf.b r1 = new wf.b
            r1.<init>(r0, r4)
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            wb.m0 r1 = new wb.m0
            r2 = 9
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.Object r1 = r3.k(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 93
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
