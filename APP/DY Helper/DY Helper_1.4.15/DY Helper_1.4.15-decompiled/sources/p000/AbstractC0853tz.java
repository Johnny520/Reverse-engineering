package p000;

/* JADX INFO: renamed from: tz */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0853tz extends kotlinx.coroutines.AbstractC0479 {

    /* JADX INFO: renamed from: κ */
    public static final /* synthetic */ int f10512 = 0;

    /* JADX INFO: renamed from: η */
    public long f10513;

    /* JADX INFO: renamed from: θ */
    public boolean f10514;

    /* JADX INFO: renamed from: ι */
    public p000.C0936w6 f10515;

    public abstract void shutdown();

    /* JADX INFO: renamed from: υ */
    public final void m5764(boolean r5) {
            r4 = this;
            long r0 = r4.f10513
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r0 = r0 - r2
            r4.f10513 = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L16
            goto L1d
        L16:
            boolean r5 = r4.f10514
            if (r5 == 0) goto L1d
            r4.shutdown()
        L1d:
            return
    }

    /* JADX INFO: renamed from: φ */
    public final void m5765(p000.AbstractC0444jt r2) {
            r1 = this;
            w6 r0 = r1.f10515
            if (r0 != 0) goto Lb
            w6 r0 = new w6
            r0.<init>()
            r1.f10515 = r0
        Lb:
            r0.addLast(r2)
            return
    }

    /* JADX INFO: renamed from: χ */
    public final void m5766(boolean r5) {
            r4 = this;
            long r0 = r4.f10513
            if (r5 == 0) goto La
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            goto Lc
        La:
            r2 = 1
        Lc:
            long r2 = r2 + r0
            r4.f10513 = r2
            if (r5 != 0) goto L14
            r5 = 1
            r4.f10514 = r5
        L14:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public abstract long mo3402();

    /* JADX INFO: renamed from: ω */
    public final boolean m5767() {
            r1 = this;
            w6 r1 = r1.f10515
            if (r1 != 0) goto L5
            goto L15
        L5:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            java.lang.Object r1 = r1.removeFirst()
        L11:
            jt r1 = (p000.AbstractC0444jt) r1
            if (r1 != 0) goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1.run()
            r1 = 1
            return r1
    }
}
