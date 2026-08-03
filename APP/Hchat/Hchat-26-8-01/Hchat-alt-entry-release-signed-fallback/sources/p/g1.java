package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class g1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9904e;

    public /* synthetic */ g1(float r9, float r10, float r11, float r12, int r13) {
            r8 = this;
            r0 = r13 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r9
        L9:
            r9 = r13 & 2
            if (r9 == 0) goto Lf
            r4 = r1
            goto L10
        Lf:
            r4 = r10
        L10:
            r9 = r13 & 4
            if (r9 == 0) goto L16
            r5 = r1
            goto L17
        L16:
            r5 = r11
        L17:
            r9 = r13 & 8
            if (r9 == 0) goto L1d
            r6 = r1
            goto L1e
        L1d:
            r6 = r12
        L1e:
            r7 = 1
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public g1(float r1, float r2, float r3, float r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f9900a = r1
            r0.f9901b = r2
            r0.f9902c = r3
            r0.f9903d = r4
            r0.f9904e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof p.g1
            if (r0 != 0) goto L8
            goto L3c
        L8:
            p.g1 r3 = (p.g1) r3
            float r0 = r3.f9900a
            float r1 = r2.f9900a
            boolean r0 = u2.f.b(r1, r0)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            float r0 = r2.f9901b
            float r1 = r3.f9901b
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            float r0 = r2.f9902c
            float r1 = r3.f9902c
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            float r0 = r2.f9903d
            float r1 = r3.f9903d
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r0 = r2.f9904e
            boolean r3 = r3.f9904e
            if (r0 == r3) goto L3e
        L3c:
            r3 = 0
            return r3
        L3e:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            p.i1 r0 = new p.i1
            r0.<init>()
            float r1 = r2.f9900a
            r0.f9919u = r1
            float r1 = r2.f9901b
            r0.f9920v = r1
            float r1 = r2.f9902c
            r0.f9921w = r1
            float r1 = r2.f9903d
            r0.f9922x = r1
            boolean r1 = r2.f9904e
            r0.f9923y = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r2) {
            r1 = this;
            p.i1 r2 = (p.i1) r2
            float r0 = r1.f9900a
            r2.f9919u = r0
            float r0 = r1.f9901b
            r2.f9920v = r0
            float r0 = r1.f9902c
            r2.f9921w = r0
            float r0 = r1.f9903d
            r2.f9922x = r0
            boolean r0 = r1.f9904e
            r2.f9923y = r0
            return
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f9900a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f9901b
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f9902c
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f9903d
            int r0 = eh.a.d(r2, r0, r1)
            boolean r1 = r3.f9904e
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
