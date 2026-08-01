package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class p11 {

    /* JADX INFO: renamed from: κ */
    public static final java.lang.Object f8383 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f8384;

    /* JADX INFO: renamed from: β */
    public final p000.up1 f8385;

    /* JADX INFO: renamed from: γ */
    public int f8386;

    /* JADX INFO: renamed from: δ */
    public boolean f8387;

    /* JADX INFO: renamed from: ε */
    public volatile java.lang.Object f8388;

    /* JADX INFO: renamed from: ζ */
    public volatile java.lang.Object f8389;

    /* JADX INFO: renamed from: η */
    public int f8390;

    /* JADX INFO: renamed from: θ */
    public boolean f8391;

    /* JADX INFO: renamed from: ι */
    public boolean f8392;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.p11.f8383 = r0
            return
    }

    public p11() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f8384 = r0
            up1 r0 = new up1
            r0.<init>()
            r1.f8385 = r0
            r0 = 0
            r1.f8386 = r0
            java.lang.Object r0 = p000.p11.f8383
            r1.f8389 = r0
            r1.f8388 = r0
            r0 = -1
            r1.f8390 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4377(java.lang.String r2) {
            q6 r0 = p000.C0713q6.m4766()
            java.lang.Object r0 = r0.f8884
            q6 r0 = (p000.C0713q6) r0
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L1a
            return
        L1a:
            java.lang.String r0 = "Cannot invoke "
            java.lang.String r1 = " on a background thread"
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            p000.C1080.m7279(r2)
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m4378(p000.ju0 r3) {
            r2 = this;
            boolean r0 = r3.f5584
            if (r0 != 0) goto L5
            goto L3e
        L5:
            int r0 = r3.f5585
            int r1 = r2.f8390
            if (r0 < r1) goto Lc
            goto L3e
        Lc:
            r3.f5585 = r1
            n r3 = r3.f5583
            java.lang.Object r2 = r2.f8388
            r3.getClass()
            hr0 r2 = (p000.hr0) r2
            java.lang.Object r3 = r3.f7336
            ws r3 = (p000.DialogInterfaceOnCancelListenerC0958ws) r3
            if (r2 == 0) goto L3e
            boolean r2 = r3.f11841
            if (r2 != 0) goto L22
            goto L3e
        L22:
            r3.getClass()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " did not return a View from onCreateView() or this was called before onCreateView()."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L3e:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m4379(p000.ju0 r5) {
            r4 = this;
            boolean r0 = r4.f8391
            r1 = 1
            if (r0 == 0) goto L8
            r4.f8392 = r1
            return
        L8:
            r4.f8391 = r1
        La:
            r0 = 0
            r4.f8392 = r0
            if (r5 == 0) goto L14
            r4.m4378(r5)
            r5 = 0
            goto L3e
        L14:
            up1 r1 = r4.f8385
            r1.getClass()
            sp1 r2 = new sp1
            r2.<init>(r1)
            java.util.WeakHashMap r1 = r1.f10927
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r1.put(r2, r3)
        L25:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            ju0 r1 = (p000.ju0) r1
            r4.m4378(r1)
            boolean r1 = r4.f8392
            if (r1 == 0) goto L25
        L3e:
            boolean r1 = r4.f8392
            if (r1 != 0) goto La
            r4.f8391 = r0
            return
    }
}
