package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o5.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.u f9508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9509c;

    public d(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9508b = r1
            r0.f9509c = r2
            return
    }

    @Override // o5.e
    public final java.util.Set b() {
            r3 = this;
            k5.u r0 = r3.f9508b
            androidx.lifecycle.x r1 = r0.f7264b
            int r2 = r3.f9509c
            int r1 = r1.N(r2)
            java.util.Set r0 = o5.e.a(r0, r1)
            return r0
    }

    @Override // o5.e
    public final o5.c c() {
            r3 = this;
            k5.u r0 = r3.f9508b
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r3.f9509c
            int r2 = r1 + 4
            int r0 = r0.N(r2)
            if (r0 != 0) goto L11
            l3.w r0 = o5.c.f9507c
            return r0
        L11:
            k5.n r2 = new k5.n
            int r1 = r1 + 16
            r2.<init>(r3, r1, r0)
            return r2
    }

    @Override // o5.e
    public final o5.c d() {
            r4 = this;
            k5.u r0 = r4.f9508b
            androidx.lifecycle.x r1 = r0.f7264b
            int r2 = r4.f9509c
            int r3 = r2 + 8
            int r1 = r1.N(r3)
            if (r1 != 0) goto L11
            l3.w r0 = o5.c.f9507c
            return r0
        L11:
            androidx.lifecycle.x r0 = r0.f7264b
            int r3 = r2 + 4
            int r0 = r0.N(r3)
            int r2 = r2 + 16
            int r0 = r0 * 8
            int r0 = r0 + r2
            k5.n r2 = new k5.n
            r2.<init>(r4, r0, r1)
            return r2
    }

    @Override // o5.e
    public final o5.c e() {
            r5 = this;
            k5.u r0 = r5.f9508b
            androidx.lifecycle.x r1 = r0.f7264b
            int r2 = r5.f9509c
            int r3 = r2 + 12
            int r1 = r1.N(r3)
            if (r1 != 0) goto L11
            l3.w r0 = o5.c.f9507c
            return r0
        L11:
            androidx.lifecycle.x r3 = r0.f7264b
            int r4 = r2 + 4
            int r3 = r3.N(r4)
            androidx.lifecycle.x r0 = r0.f7264b
            int r4 = r2 + 8
            int r0 = r0.N(r4)
            int r2 = r2 + 16
            int r3 = r3 * 8
            int r3 = r3 + r2
            int r0 = r0 * 8
            int r0 = r0 + r3
            k5.n r2 = new k5.n
            r2.<init>(r5, r0, r1)
            return r2
    }
}
