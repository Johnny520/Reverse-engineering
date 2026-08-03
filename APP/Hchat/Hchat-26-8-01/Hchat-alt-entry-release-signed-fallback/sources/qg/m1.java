package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends vg.p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.ThreadLocal f11080k;
    private volatile boolean threadLocalIsSet;

    public m1(wf.c r3, wf.g r4) {
            r2 = this;
            qg.n1 r0 = qg.n1.f11084g
            wf.e r1 = r4.s(r0)
            if (r1 != 0) goto Ld
            wf.g r0 = r4.e(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f11080k = r0
            wf.g r3 = r3.getContext()
            wf.d r0 = wf.d.f20785g
            wf.e r3 = r3.s(r0)
            boolean r3 = r3 instanceof qg.p
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = vg.a.l(r4, r3)
            vg.a.g(r4, r3)
            r2.e0(r4, r3)
        L31:
            return
    }

    public final boolean d0() {
            r3 = this;
            boolean r0 = r3.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal r0 = r3.f11080k
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal r2 = r3.f11080k
            r2.remove()
            r0 = r0 ^ r1
            return r0
    }

    public final void e0(wf.g r3, java.lang.Object r4) {
            r2 = this;
            r0 = 1
            r2.threadLocalIsSet = r0
            java.lang.ThreadLocal r0 = r2.f11080k
            sf.e r1 = new sf.e
            r1.<init>(r3, r4)
            r0.set(r1)
            return
    }

    @Override // vg.p, qg.y0
    public final void u(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r5.threadLocalIsSet
            if (r0 == 0) goto L1c
            java.lang.ThreadLocal r0 = r5.f11080k
            java.lang.Object r0 = r0.get()
            sf.e r0 = (sf.e) r0
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.f12418g
            wf.g r1 = (wf.g) r1
            java.lang.Object r0 = r0.f12419h
            vg.a.g(r1, r0)
        L17:
            java.lang.ThreadLocal r0 = r5.f11080k
            r0.remove()
        L1c:
            java.lang.Object r6 = qg.v.r(r6)
            wf.c r0 = r5.f14355j
            wf.g r1 = r0.getContext()
            r2 = 0
            java.lang.Object r3 = vg.a.l(r1, r2)
            l3.q r4 = vg.a.f14320d
            if (r3 == r4) goto L33
            qg.m1 r2 = qg.v.w(r0, r1, r3)
        L33:
            wf.c r0 = r5.f14355j     // Catch: java.lang.Throwable -> L46
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L42
            boolean r6 = r2.d0()
            if (r6 == 0) goto L41
            goto L42
        L41:
            return
        L42:
            vg.a.g(r1, r3)
            return
        L46:
            r6 = move-exception
            if (r2 == 0) goto L4f
            boolean r0 = r2.d0()
            if (r0 == 0) goto L52
        L4f:
            vg.a.g(r1, r3)
        L52:
            throw r6
    }
}
