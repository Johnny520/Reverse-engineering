package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends k7.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k7.a[] f9567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9568l;

    public d(int r1) {
            r0 = this;
            r0.<init>()
            k7.a[] r1 = new k7.a[r1]
            r0.f9567k = r1
            return
    }

    @Override // k7.c
    public final k7.a[] L() {
            r1 = this;
            k7.a[] r0 = r1.f9567k
            return r0
    }

    @Override // k7.c
    public void N() {
            r0 = this;
            return
    }

    public final void P(k7.a r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f9568l
            int r1 = r0 + 1
            k7.a[] r2 = r5.f9567k
            int r3 = r2.length
            if (r1 > r3) goto Ld
            goto L1e
        Ld:
            k7.a[] r1 = new k7.a[r1]
            r5.f9567k = r1
            r1 = 0
        L12:
            int r3 = r2.length
            if (r1 >= r3) goto L1e
            k7.a[] r3 = r5.f9567k
            r4 = r2[r1]
            r3[r1] = r4
            int r1 = r1 + 1
            goto L12
        L1e:
            k7.a[] r1 = r5.f9567k
            r1[r0] = r6
            r6.H(r0)
            r6.J(r5)
            int r6 = r5.f9568l
            int r6 = r6 + 1
            r5.f9568l = r6
            return
    }
}
