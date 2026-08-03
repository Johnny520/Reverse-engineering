package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f5522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f5524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sf.i f5525k;

    public a(org.luckypray.dexkit.DexKitBridge r2, java.lang.String r3, int r4, java.util.ArrayList r5) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r0)
            r1.f5522h = r3
            r1.f5523i = r4
            r1.f5524j = r5
            d1.c0 r2 = new d1.c0
            r3 = 3
            r2.<init>(r1, r3)
            sf.i r3 = new sf.i
            r3.<init>(r2)
            r1.f5525k = r3
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f5522h
            java.lang.String r1 = kh.b.e(r1)
            java.lang.String r2 = "@"
            java.lang.String r1 = r2.concat(r1)
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.util.ArrayList r1 = r5.f5524j
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L3c
            hh.b r3 = (hh.b) r3
            if (r2 == 0) goto L37
            java.lang.String r2 = ", "
            r0.append(r2)
        L37:
            r0.append(r3)
            r2 = r4
            goto L20
        L3c:
            a.a.Q0()
            r0 = 0
            throw r0
        L41:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
