package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class co0 extends kotlinx.coroutines.internal.C0478 implements p000.InterfaceC0922vt, p000.ml0 {

    /* JADX INFO: renamed from: θ */
    public p000.fo0 f2220;

    public p000.fo0 getParent() {
            r0 = this;
            fo0 r0 = r0.m1279()
            return r0
    }

    @Override // kotlinx.coroutines.internal.C0478
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = p000.AbstractC1021yh.m6855(r2)
            r0.append(r1)
            java.lang.String r1 = "[job@"
            r0.append(r1)
            fo0 r2 = r2.m1279()
            java.lang.String r2 = p000.AbstractC1021yh.m6855(r2)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.InterfaceC0922vt
    /* JADX INFO: renamed from: α */
    public final void mo1276() {
            r5 = this;
            fo0 r0 = r5.m1279()
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.fo0.f4052
            java.lang.Object r2 = r1.get(r0)
            boolean r3 = r2 instanceof p000.co0
            if (r3 == 0) goto L21
            if (r2 == r5) goto L11
            goto L66
        L11:
            ez r3 = p000.AbstractC0978xb.f12107
        L13:
            boolean r4 = r1.compareAndSet(r0, r2, r3)
            if (r4 == 0) goto L1a
            goto L66
        L1a:
            java.lang.Object r4 = r1.get(r0)
            if (r4 == r2) goto L13
            goto L4
        L21:
            boolean r0 = r2 instanceof p000.ml0
            if (r0 == 0) goto L66
            ml0 r2 = (p000.ml0) r2
            s31 r0 = r2.mo1278()
            if (r0 == 0) goto L66
        L2d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.C0478.f6063
            java.lang.Object r1 = r0.get(r5)
            boolean r2 = r1 instanceof p000.gn1
            if (r2 == 0) goto L38
            goto L66
        L38:
            if (r1 != r5) goto L3d
            kotlinx.coroutines.internal.α r1 = (kotlinx.coroutines.internal.C0478) r1
            return
        L3d:
            r1.getClass()
            r2 = r1
            kotlinx.coroutines.internal.α r2 = (kotlinx.coroutines.internal.C0478) r2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.C0478.f6065
            java.lang.Object r4 = r3.get(r2)
            gn1 r4 = (p000.gn1) r4
            if (r4 != 0) goto L55
            gn1 r4 = new gn1
            r4.<init>(r2)
            r3.set(r2, r4)
        L55:
            boolean r3 = r0.compareAndSet(r5, r1, r4)
            if (r3 == 0) goto L5f
            r2.m3388()
            return
        L5f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L55
            goto L2d
        L66:
            return
    }

    @Override // p000.ml0
    /* JADX INFO: renamed from: β */
    public final boolean mo1277() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.ml0
    /* JADX INFO: renamed from: δ */
    public final p000.s31 mo1278() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final p000.fo0 m1279() {
            r0 = this;
            fo0 r0 = r0.f2220
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            p000.ln0.m3650(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public abstract boolean mo1280();

    /* JADX INFO: renamed from: μ */
    public abstract void mo1281(java.lang.Throwable r1);
}
