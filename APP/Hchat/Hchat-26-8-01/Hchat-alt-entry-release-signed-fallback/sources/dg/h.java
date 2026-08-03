package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends tf.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayDeque f2248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dg.j f2249j;

    public h(dg.j r3) {
            r2 = this;
            r2.<init>()
            r2.f2249j = r3
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f2248i = r0
            java.lang.Object r3 = r3.f2253c
            java.io.File r3 = (java.io.File) r3
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L1e
            dg.d r3 = r2.c(r3)
            r0.push(r3)
            return
        L1e:
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L30
            dg.f r1 = new dg.f
            r3.getClass()
            r1.<init>(r3)
            r0.push(r1)
            return
        L30:
            r3 = 2
            r2.f13138g = r3
            return
    }

    @Override // tf.b
    public final void a() {
            r4 = this;
        L0:
            java.util.ArrayDeque r0 = r4.f2248i
            java.lang.Object r1 = r0.peek()
            dg.i r1 = (dg.i) r1
            if (r1 != 0) goto Lc
            r0 = 0
            goto L37
        Lc:
            java.io.File r2 = r1.a()
            if (r2 != 0) goto L16
            r0.pop()
            goto L0
        L16:
            java.io.File r1 = r1.f2250a
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L36
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L36
            int r1 = r0.size()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r3) goto L2e
            goto L36
        L2e:
            dg.d r1 = r4.c(r2)
            r0.push(r1)
            goto L0
        L36:
            r0 = r2
        L37:
            if (r0 == 0) goto L3f
            r4.f13139h = r0
            r0 = 1
            r4.f13138g = r0
            return
        L3f:
            r0 = 2
            r4.f13138g = r0
            return
    }

    public final dg.d c(java.io.File r3) {
            r2 = this;
            dg.j r0 = r2.f2249j
            java.lang.Object r0 = r0.f2254d
            dg.k r0 = (dg.k) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L1a
            r1 = 1
            if (r0 != r1) goto L15
            dg.e r0 = new dg.e
            r0.<init>(r2, r3)
            return r0
        L15:
            okio.a.k()
            r3 = 0
            return r3
        L1a:
            dg.g r0 = new dg.g
            r0.<init>(r2, r3)
            return r0
    }
}
