package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t.f f8186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qg.g f8187b;

    public i(t.f r1, qg.g r2) {
            r0 = this;
            r0.<init>()
            r0.f8186a = r1
            r0.f8187b = r2
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            qg.g r0 = r4.f8187b
            wf.g r1 = r0.f11050k
            qg.q r2 = qg.s.f11093h
            wf.e r1 = r1.s(r2)
            if (r1 != 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Request@"
            r1.<init>(r2)
            int r2 = r4.hashCode()
            r3 = 16
            a.a.w(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            r2.getClass()
            r1.append(r2)
            java.lang.String r2 = "(currentBounds()="
            r1.append(r2)
            t.f r2 = r4.f8186a
            java.lang.Object r2 = r2.invoke()
            r1.append(r2)
            java.lang.String r2 = ", continuation="
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L46:
            ah.a.d()
            r0 = 0
            return r0
    }
}
