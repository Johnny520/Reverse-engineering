package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends vg.i implements qg.d0, qg.o0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qg.y0 f11101j;

    @Override // qg.d0
    public final void a() {
            r5 = this;
            qg.y0 r0 = r5.j()
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = qg.y0.f11124g
            java.lang.Object r2 = r1.get(r0)
            boolean r3 = r2 instanceof qg.u0
            if (r3 == 0) goto L21
            if (r2 == r5) goto L11
            goto L66
        L11:
            qg.f0 r3 = qg.v.f11111j
        L13:
            boolean r4 = r1.compareAndSet(r0, r2, r3)
            if (r4 == 0) goto L1a
            goto L66
        L1a:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r2) goto L13
            goto L4
        L21:
            boolean r0 = r2 instanceof qg.o0
            if (r0 == 0) goto L66
            qg.o0 r2 = (qg.o0) r2
            qg.a1 r0 = r2.d()
            if (r0 == 0) goto L66
        L2d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = vg.i.f14341g
            java.lang.Object r1 = r0.get(r5)
            boolean r2 = r1 instanceof vg.n
            if (r2 == 0) goto L38
            goto L66
        L38:
            if (r1 != r5) goto L3d
            vg.i r1 = (vg.i) r1
            return
        L3d:
            r1.getClass()
            r2 = r1
            vg.i r2 = (vg.i) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = vg.i.f14343i
            java.lang.Object r4 = r3.get(r2)
            vg.n r4 = (vg.n) r4
            if (r4 != 0) goto L55
            vg.n r4 = new vg.n
            r4.<init>(r2)
            r3.set(r2, r4)
        L55:
            boolean r3 = r0.compareAndSet(r5, r1, r4)
            if (r3 == 0) goto L5f
            r2.f()
            return
        L5f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L55
            goto L2d
        L66:
            return
    }

    @Override // qg.o0
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // qg.o0
    public final qg.a1 d() {
            r1 = this;
            r0 = 0
            return r0
    }

    public qg.r0 getParent() {
            r1 = this;
            qg.y0 r0 = r1.j()
            return r0
    }

    public final qg.y0 j() {
            r1 = this;
            qg.y0 r0 = r1.f11101j
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }

    public abstract boolean k();

    public abstract void l(java.lang.Throwable r1);

    @Override // vg.i
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = qg.v.j(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            qg.y0 r1 = r2.j()
            java.lang.String r1 = qg.v.j(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
