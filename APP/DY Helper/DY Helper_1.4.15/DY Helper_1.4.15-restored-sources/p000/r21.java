package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class r21 extends p000.ns1 {

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9237 = null;
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "owner$volatile"
            java.lang.Class<r21> r2 = p000.r21.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            p000.r21.f9237 = r0
            return
    }

    public r21() {
            r1 = this;
            r1.<init>()
            uy r0 = p000.AbstractC0782s1.f9649
            r1.owner$volatile = r0
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Mutex@"
            r0.<init>(r1)
            java.lang.String r1 = p000.AbstractC1021yh.m6855(r3)
            r0.append(r1)
            java.lang.String r1 = "[isLocked="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.ns1.f7731
            int r1 = r1.get(r3)
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            if (r1 != 0) goto L21
            r2 = 1
        L21:
            r0.append(r2)
            java.lang.String r1 = ",owner="
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p000.r21.f9237
            java.lang.Object r3 = r1.get(r3)
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final void m5054(java.lang.Object r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p000.ns1.f7731
            int r0 = r0.get(r4)
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            if (r0 != 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.r21.f9237
            java.lang.Object r1 = r0.get(r4)
            uy r2 = p000.AbstractC0782s1.f9649
            if (r1 == r2) goto L0
            if (r1 == r5) goto L41
            if (r5 != 0) goto L1c
            goto L41
        L1c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "This mutex is locked by "
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r0 = ", but "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = " is expected"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L41:
            boolean r3 = r0.compareAndSet(r4, r1, r2)
            if (r3 == 0) goto L4b
            r4.m4095()
            return
        L4b:
            java.lang.Object r3 = r0.get(r4)
            if (r3 == r1) goto L41
            goto L0
        L52:
            java.lang.String r4 = "This mutex is not locked"
            p000.C1080.m7279(r4)
            return
    }
}
