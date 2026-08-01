package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements p000.InterfaceC0631op, p000.InterfaceC0220dq {

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8649 = null;
    private volatile java.lang.Object result;

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0631op f8650;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "result"
            java.lang.Class<pp1> r2 = p000.pp1.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.pp1.f8649 = r0
            return
    }

    public pp1(p000.InterfaceC0631op r2) {
            r1 = this;
            cq r0 = p000.EnumC0184cq.f2716
            r1.<init>()
            r1.f8650 = r2
            r1.result = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SafeContinuation for "
            r0.<init>(r1)
            op r2 = r2.f8650
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC0220dq
    /* JADX INFO: renamed from: β */
    public final p000.InterfaceC0220dq mo71() {
            r1 = this;
            op r1 = r1.f8650
            boolean r0 = r1 instanceof p000.InterfaceC0220dq
            if (r0 == 0) goto L9
            dq r1 = (p000.InterfaceC0220dq) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: γ */
    public final p000.InterfaceC0880up mo72() {
            r0 = this;
            op r0 = r0.f8650
            up r0 = r0.mo72()
            return r0
    }

    @Override // p000.InterfaceC0631op
    /* JADX INFO: renamed from: ζ */
    public final void mo75(java.lang.Object r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.result
            cq r1 = p000.EnumC0184cq.f2717
            if (r0 != r1) goto L16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.pp1.f8649
        L8:
            boolean r0 = r2.compareAndSet(r4, r1, r5)
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r1) goto L8
            goto L0
        L16:
            cq r1 = p000.EnumC0184cq.f2716
            if (r0 != r1) goto L31
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.pp1.f8649
            cq r2 = p000.EnumC0184cq.f2718
        L1e:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L2a
            op r4 = r4.f8650
            r4.mo75(r5)
            return
        L2a:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L1e
            goto L0
        L31:
            java.lang.String r4 = "Already resumed"
            p000.C1080.m7279(r4)
            return
    }
}
