package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements k.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.r0 f1769a;

    public o0(i.r0 r1) {
            r0 = this;
            r0.<init>()
            r0.f1769a = r1
            return
    }

    @Override // k.y0
    public final x1.i a(n.k r3) {
            r2 = this;
            r3.getClass()
            ci.n0 r0 = new ci.n0
            i.r0 r1 = r2.f1769a
            r0.<init>(r3, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L20
        L3:
            boolean r0 = r2 instanceof ci.o0
            if (r0 != 0) goto L8
            goto L1e
        L8:
            ci.o0 r2 = (ci.o0) r2
            r0 = 1062836634(0x3f59999a, float:0.85)
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L14
            goto L1e
        L14:
            i.r0 r0 = r1.f1769a
            i.r0 r2 = r2.f1769a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L20
        L1e:
            r2 = 0
            return r2
        L20:
            r2 = 1
            return r2
    }

    @Override // k.y0
    public final int hashCode() {
            r2 = this;
            r0 = 1062836634(0x3f59999a, float:0.85)
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            i.r0 r1 = r2.f1769a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SinkFeedback(sinkAmount=0.85, animationSpec="
            r0.<init>(r1)
            i.r0 r1 = r2.f1769a
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
