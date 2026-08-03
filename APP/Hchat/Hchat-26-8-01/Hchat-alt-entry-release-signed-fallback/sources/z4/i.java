package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends z4.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z4.g f22554i;

    public i(int r2) {
            r1 = this;
            r1.<init>(r2)
            z4.g r0 = new z4.g
            r0.<init>(r2)
            r1.f22554i = r0
            return
    }

    public final int o() {
            r3 = this;
            z4.g r0 = r3.f22554i
            int r1 = r0.f22552i
            int r1 = r1 + (-1)
        L6:
            if (r1 < 0) goto L11
            int r2 = r0.n(r1)
            if (r2 >= 0) goto L11
            int r1 = r1 + (-1)
            goto L6
        L11:
            int r1 = r1 + 1
            r0.r(r1)
            return r1
    }

    public final int p(int r3) {
            r2 = this;
            z4.g r0 = r2.f22554i
            int r1 = r0.f22552i
            if (r3 < r1) goto L8
            r3 = -1
            return r3
        L8:
            int r3 = r0.n(r3)
            return r3
    }

    public final void q(int r6, z4.h r7) {
            r5 = this;
            java.lang.Object[] r0 = r5.f22543h
            r0 = r0[r6]
            z4.h r0 = (z4.h) r0
            r5.m(r6, r7)
            r1 = -1
            z4.g r2 = r5.f22554i
            if (r0 == 0) goto L15
            int r0 = r0.a()
            r2.q(r0, r1)
        L15:
            if (r7 == 0) goto L2b
            int r7 = r7.a()
            int r0 = r2.f22552i
            r3 = 0
        L1e:
            int r4 = r7 - r0
            if (r3 > r4) goto L28
            r2.l(r1)
            int r3 = r3 + 1
            goto L1e
        L28:
            r2.q(r7, r6)
        L2b:
            return
    }
}
