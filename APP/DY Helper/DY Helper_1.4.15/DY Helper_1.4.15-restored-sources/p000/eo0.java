package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 implements p000.ml0 {

    /* JADX INFO: renamed from: ζ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3618 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f3619 = null;

    /* JADX INFO: renamed from: θ */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f3620 = null;
    private volatile /* synthetic */ java.lang.Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile;
    private volatile /* synthetic */ java.lang.Object _rootCause$volatile;

    /* JADX INFO: renamed from: ε */
    public final p000.s31 f3621;

    static {
            java.lang.String r0 = "_isCompleting$volatile"
            java.lang.Class<eo0> r1 = p000.eo0.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            p000.eo0.f3618 = r0
            java.lang.String r0 = "_rootCause$volatile"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.eo0.f3619 = r0
            java.lang.String r0 = "_exceptionsHolder$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            p000.eo0.f3620 = r0
            return
    }

    public eo0(p000.s31 r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.f3621 = r1
            r1 = 0
            r0._isCompleting$volatile = r1
            r0._rootCause$volatile = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finishing[cancelling="
            r0.<init>(r1)
            boolean r1 = r2.m1944()
            r0.append(r1)
            java.lang.String r1 = ", completing="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.eo0.f3618
            int r1 = r1.get(r2)
            if (r1 == 0) goto L1d
            r1 = 1
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r0.append(r1)
            java.lang.String r1 = ", rootCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.m1943()
            r0.append(r1)
            java.lang.String r1 = ", exceptions="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.eo0.f3620
            java.lang.Object r1 = r1.get(r2)
            r0.append(r1)
            java.lang.String r1 = ", list="
            r0.append(r1)
            s31 r2 = r2.f3621
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final void m1942(java.lang.Throwable r5) {
            r4 = this;
            java.lang.Throwable r0 = r4.m1943()
            if (r0 != 0) goto Lc
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.eo0.f3619
            r0.set(r4, r5)
            return
        Lc:
            if (r5 != r0) goto Lf
            goto L21
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.eo0.f3620
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L1b
            r0.set(r4, r5)
            return
        L1b:
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L32
            if (r5 != r1) goto L22
        L21:
            return
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 4
            r2.<init>(r3)
            r2.add(r1)
            r2.add(r5)
            r0.set(r4, r2)
            return
        L32:
            boolean r4 = r1 instanceof java.util.ArrayList
            if (r4 == 0) goto L3c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r5)
            return
        L3c:
            java.lang.String r4 = "State is "
            p000.C1080.m7278(r1, r4)
            return
    }

    @Override // p000.ml0
    /* JADX INFO: renamed from: β */
    public final boolean mo1277() {
            r0 = this;
            java.lang.Throwable r0 = r0.m1943()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Throwable m1943() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.eo0.f3619
            java.lang.Object r1 = r0.get(r1)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
    }

    @Override // p000.ml0
    /* JADX INFO: renamed from: δ */
    public final p000.s31 mo1278() {
            r0 = this;
            s31 r0 = r0.f3621
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m1944() {
            r0 = this;
            java.lang.Throwable r0 = r0.m1943()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList m1945(java.lang.Throwable r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.eo0.f3620
            java.lang.Object r1 = r0.get(r4)
            r2 = 4
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            goto L23
        Lf:
            boolean r3 = r1 instanceof java.lang.Throwable
            if (r3 == 0) goto L1d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r3.add(r1)
            r1 = r3
            goto L23
        L1d:
            boolean r2 = r1 instanceof java.util.ArrayList
            if (r2 == 0) goto L3e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
        L23:
            java.lang.Throwable r2 = r4.m1943()
            if (r2 == 0) goto L2d
            r3 = 0
            r1.add(r3, r2)
        L2d:
            if (r5 == 0) goto L38
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r1.add(r5)
        L38:
            uy r5 = p000.AbstractC0978xb.f12105
            r0.set(r4, r5)
            return r1
        L3e:
            java.lang.String r4 = "State is "
            p000.C1080.m7278(r1, r4)
            r4 = 0
            return r4
    }
}
