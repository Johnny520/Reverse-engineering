package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ow1 implements p000.InterfaceC0953wn, java.lang.Iterable, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public int[] f8286;

    /* JADX INFO: renamed from: ζ */
    public int f8287;

    /* JADX INFO: renamed from: η */
    public java.lang.Object[] f8288;

    /* JADX INFO: renamed from: θ */
    public int f8289;

    /* JADX INFO: renamed from: ι */
    public int f8290;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Object f8291;

    /* JADX INFO: renamed from: λ */
    public boolean f8292;

    /* JADX INFO: renamed from: μ */
    public int f8293;

    /* JADX INFO: renamed from: ν */
    public java.util.ArrayList f8294;

    /* JADX INFO: renamed from: ξ */
    public java.util.HashMap f8295;

    /* JADX INFO: renamed from: ο */
    public p000.n11 f8296;

    public ow1() {
            r2 = this;
            r2.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r2.f8286 = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f8288 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f8291 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f8294 = r0
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            lc0 r0 = new lc0
            r1 = 0
            int r2 = r3.f8287
            r0.<init>(r3, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final int m4300(p000.q80 r1) {
            r0 = this;
            boolean r0 = r0.f8292
            if (r0 == 0) goto L9
            java.lang.String r0 = "Use active SlotWriter to determine anchor location instead"
            p000.AbstractC0804sn.m5526(r0)
        L9:
            boolean r0 = r1.m4810()
            if (r0 != 0) goto L14
            java.lang.String r0 = "Anchor refers to a group that was removed"
            p000.pi1.m4544(r0)
        L14:
            int r0 = r1.f8904
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m4301() {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f8295 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public final p000.nw1 m4302() {
            r1 = this;
            boolean r0 = r1.f8292
            if (r0 != 0) goto L10
            int r0 = r1.f8290
            int r0 = r0 + 1
            r1.f8290 = r0
            nw1 r0 = new nw1
            r0.<init>(r1)
            return r0
        L10:
            java.lang.String r1 = "Cannot read while a writer is pending"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final p000.rw1 m4303() {
            r2 = this;
            boolean r0 = r2.f8292
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot start a writer when another writer is pending"
            p000.AbstractC0804sn.m5526(r0)
        L9:
            int r0 = r2.f8290
            if (r0 > 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "Cannot start a writer when a reader is pending"
            p000.AbstractC0804sn.m5526(r0)
        L13:
            r0 = 1
            r2.f8292 = r0
            int r1 = r2.f8293
            int r1 = r1 + r0
            r2.f8293 = r1
            rw1 r0 = new rw1
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m4304(p000.q80 r4) {
            r3 = this;
            boolean r0 = r4.m4810()
            if (r0 == 0) goto L20
            java.util.ArrayList r0 = r3.f8294
            int r1 = r4.f8904
            int r2 = r3.f8287
            int r0 = p000.qw1.m4949(r0, r1, r2)
            if (r0 < 0) goto L20
            java.util.ArrayList r3 = r3.f8294
            java.lang.Object r3 = r3.get(r0)
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.x80 m4305(int r4) {
            r3 = this;
            java.util.HashMap r0 = r3.f8295
            r1 = 0
            if (r0 == 0) goto L2d
            boolean r2 = r3.f8292
            if (r2 == 0) goto Le
            java.lang.String r2 = "use active SlotWriter to crate an anchor for location instead"
            p000.AbstractC0804sn.m5526(r2)
        Le:
            if (r4 < 0) goto L23
            int r2 = r3.f8287
            if (r4 >= r2) goto L23
            java.util.ArrayList r3 = r3.f8294
            int r4 = p000.qw1.m4949(r3, r4, r2)
            if (r4 < 0) goto L23
            java.lang.Object r3 = r3.get(r4)
            q80 r3 = (p000.q80) r3
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.get(r3)
            x80 r3 = (p000.x80) r3
            return r3
        L2d:
            return r1
    }
}
