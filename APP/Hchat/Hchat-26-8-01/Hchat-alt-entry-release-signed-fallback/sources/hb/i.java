package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f5394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f5395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fg.q f5397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5399f;

    public i(java.lang.String r1, java.util.ArrayList r2, int r3, fg.q r4) {
            r0 = this;
            r0.<init>()
            r0.f5394a = r1
            r0.f5395b = r2
            r0.f5396c = r3
            r0.f5397d = r4
            r1 = 0
            r0.f5398e = r1
            r0.f5399f = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L41
        L3:
            boolean r0 = r3 instanceof hb.i
            if (r0 != 0) goto L8
            goto L3f
        L8:
            hb.i r3 = (hb.i) r3
            java.lang.String r0 = r2.f5394a
            java.lang.String r1 = r3.f5394a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3f
        L15:
            java.util.ArrayList r0 = r2.f5395b
            java.util.ArrayList r1 = r3.f5395b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3f
        L20:
            int r0 = r2.f5396c
            int r1 = r3.f5396c
            if (r0 == r1) goto L27
            goto L3f
        L27:
            fg.q r0 = r2.f5397d
            fg.q r1 = r3.f5397d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L32
            goto L3f
        L32:
            int r0 = r2.f5398e
            int r1 = r3.f5398e
            if (r0 == r1) goto L39
            goto L3f
        L39:
            int r0 = r2.f5399f
            int r3 = r3.f5399f
            if (r0 == r3) goto L41
        L3f:
            r3 = 0
            return r3
        L41:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f5394a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.ArrayList r2 = r3.f5395b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.f5396c
            int r0 = eh.a.e(r0, r2, r1)
            fg.q r2 = r3.f5397d
            if (r2 != 0) goto L1d
            r2 = 0
            goto L21
        L1d:
            int r2 = r2.hashCode()
        L21:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f5398e
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f5399f
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f5398e
            int r1 = r4.f5399f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SendBatch(id="
            r2.<init>(r3)
            java.lang.String r3 = r4.f5394a
            r2.append(r3)
            java.lang.String r3 = ", jobs="
            r2.append(r3)
            java.util.ArrayList r3 = r4.f5395b
            r2.append(r3)
            java.lang.String r3 = ", total="
            r2.append(r3)
            int r3 = r4.f5396c
            r2.append(r3)
            java.lang.String r3 = ", onComplete="
            r2.append(r3)
            fg.q r3 = r4.f5397d
            r2.append(r3)
            java.lang.String r3 = ", index="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", success="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
