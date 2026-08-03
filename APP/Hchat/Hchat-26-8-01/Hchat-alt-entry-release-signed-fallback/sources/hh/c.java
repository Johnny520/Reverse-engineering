package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f5528h;

    public c(org.luckypray.dexkit.DexKitBridge r2, java.util.ArrayList r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r0)
            r1.f5528h = r3
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{"
            r0.<init>(r1)
            java.util.ArrayList r1 = r5.f5528h
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        Le:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L2a
            hh.d r3 = (hh.d) r3
            if (r2 == 0) goto L25
            java.lang.String r2 = ", "
            r0.append(r2)
        L25:
            r0.append(r3)
            r2 = r4
            goto Le
        L2a:
            a.a.Q0()
            r0 = 0
            throw r0
        L2f:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
