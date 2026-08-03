package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements y0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0.o f21814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0.o f21815b;

    public i(y0.o r1, y0.o r2) {
            r0 = this;
            r0.<init>()
            r0.f21814a = r1
            r0.f21815b = r2
            return
    }

    @Override // y0.o
    public final boolean a(fg.l r2) {
            r1 = this;
            y0.o r0 = r1.f21814a
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L12
            y0.o r0 = r1.f21815b
            boolean r2 = r0.a(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // y0.o
    public final java.lang.Object b(fg.p r2, java.lang.Object r3) {
            r1 = this;
            y0.o r0 = r1.f21814a
            java.lang.Object r3 = r0.b(r2, r3)
            y0.o r0 = r1.f21815b
            java.lang.Object r2 = r0.b(r2, r3)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof y0.i
            if (r0 == 0) goto L1c
            y0.i r3 = (y0.i) r3
            y0.o r0 = r3.f21814a
            y0.o r1 = r2.f21814a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            y0.o r0 = r2.f21815b
            y0.o r3 = r3.f21815b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            y0.o r0 = r2.f21814a
            int r0 = r0.hashCode()
            y0.o r1 = r2.f21815b
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r1 = ""
            y0.h r2 = y0.h.f21813g
            java.lang.Object r1 = r3.b(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 93
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
