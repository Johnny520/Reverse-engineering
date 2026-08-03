package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p extends wf.a implements wf.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qg.o f11087h = null;

    static {
            qg.o r0 = new qg.o
            o9.e r1 = new o9.e
            r2 = 25
            r1.<init>(r2)
            wf.d r2 = wf.d.f20785g
            r0.<init>(r2, r1)
            qg.p.f11087h = r0
            return
    }

    public p() {
            r1 = this;
            wf.d r0 = wf.d.f20785g
            r1.<init>(r0)
            return
    }

    @Override // wf.a, wf.g
    public final wf.e s(wf.f r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof qg.o
            r1 = 0
            if (r0 == 0) goto L1f
            qg.o r4 = (qg.o) r4
            wf.f r0 = r3.f20782g
            if (r0 == r4) goto L14
            wf.f r2 = r4.f11086h
            if (r2 != r0) goto L13
            goto L14
        L13:
            return r1
        L14:
            fg.l r4 = r4.f11085g
            java.lang.Object r4 = r4.invoke(r3)
            wf.e r4 = (wf.e) r4
            if (r4 == 0) goto L24
            return r4
        L1f:
            wf.d r0 = wf.d.f20785g
            if (r0 != r4) goto L24
            return r3
        L24:
            return r1
    }

    @Override // wf.a, wf.g
    public final wf.g t(wf.f r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof qg.o
            if (r0 == 0) goto L1e
            qg.o r3 = (qg.o) r3
            wf.f r0 = r2.f20782g
            if (r0 == r3) goto L13
            wf.f r1 = r3.f11086h
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            fg.l r3 = r3.f11085g
            java.lang.Object r3 = r3.invoke(r2)
            wf.e r3 = (wf.e) r3
            if (r3 == 0) goto L25
            goto L22
        L1e:
            wf.d r0 = wf.d.f20785g
            if (r0 != r3) goto L25
        L22:
            wf.h r3 = wf.h.f20786g
            return r3
        L25:
            return r2
    }

    public java.lang.String toString() {
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
            java.lang.String r0 = r0.toString()
            return r0
    }

    public abstract void w(wf.g r1, java.lang.Runnable r2);

    public boolean x(wf.g r1) {
            r0 = this;
            boolean r1 = r0 instanceof qg.l1
            r1 = r1 ^ 1
            return r1
    }

    public qg.p y(int r2) {
            r1 = this;
            vg.a.a(r2)
            vg.g r0 = new vg.g
            r0.<init>(r1, r2)
            return r0
    }
}
