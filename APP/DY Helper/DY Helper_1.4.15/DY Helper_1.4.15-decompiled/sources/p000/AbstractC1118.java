package p000;

/* JADX INFO: renamed from: р */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1118 {

    /* JADX INFO: renamed from: α */
    public java.lang.Object f13452;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f13453;

    public AbstractC1118() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.f13453 = r0
            return
    }

    public AbstractC1118(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f13452 = r1
            return
    }

    public AbstractC1118(androidx.appcompat.app.LayoutInflaterFactory2C0026 r1) {
            r0 = this;
            r0.<init>()
            r0.f13453 = r1
            return
    }

    /* JADX INFO: renamed from: ε */
    public static p000.AbstractC1118 m7301(p000.zl1 r1, int r2) {
            if (r2 == 0) goto L13
            r0 = 1
            if (r2 != r0) goto Lc
            l81 r2 = new l81
            r0 = 1
            r2.<init>(r1, r0)
            return r2
        Lc:
            java.lang.String r1 = "invalid orientation"
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
        L13:
            l81 r2 = new l81
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public void m7302() {
            r2 = this;
            java.lang.Object r0 = r2.f13452
            f5 r0 = (p000.C0273f5) r0
            if (r0 == 0) goto L12
            java.lang.Object r1 = r2.f13453     // Catch: java.lang.IllegalArgumentException -> Lf
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1     // Catch: java.lang.IllegalArgumentException -> Lf
            android.content.Context r1 = r1.f398     // Catch: java.lang.IllegalArgumentException -> Lf
            r1.unregisterReceiver(r0)     // Catch: java.lang.IllegalArgumentException -> Lf
        Lf:
            r0 = 0
            r2.f13452 = r0
        L12:
            return
    }

    /* JADX INFO: renamed from: δ */
    public abstract android.content.IntentFilter mo1844();

    /* JADX INFO: renamed from: ζ */
    public abstract int[] mo7303(int r1);

    /* JADX INFO: renamed from: η */
    public abstract int mo1845();

    /* JADX INFO: renamed from: θ */
    public abstract int mo3523(android.view.View r1);

    /* JADX INFO: renamed from: ι */
    public abstract int mo3524(android.view.View r1);

    /* JADX INFO: renamed from: κ */
    public abstract int mo3525();

    /* JADX INFO: renamed from: λ */
    public abstract int mo3526();

    /* JADX INFO: renamed from: μ */
    public abstract int mo3527();

    /* JADX INFO: renamed from: ν */
    public android.view.MenuItem m7304(android.view.MenuItem r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.t12
            if (r0 == 0) goto L31
            t12 r3 = (p000.t12) r3
            java.lang.Object r0 = r2.f13453
            fw1 r0 = (p000.fw1) r0
            if (r0 != 0) goto L14
            fw1 r0 = new fw1
            r1 = 0
            r0.<init>(r1)
            r2.f13453 = r0
        L14:
            java.lang.Object r0 = r2.f13453
            fw1 r0 = (p000.fw1) r0
            java.lang.Object r0 = r0.get(r3)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            if (r0 != 0) goto L30
            androidx.appcompat.view.menu.α r0 = new androidx.appcompat.view.menu.α
            java.lang.Object r1 = r2.f13452
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r3)
            java.lang.Object r2 = r2.f13453
            fw1 r2 = (p000.fw1) r2
            r2.put(r3, r0)
        L30:
            return r0
        L31:
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public abstract int mo3528();

    /* JADX INFO: renamed from: ο */
    public int[] m7305(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L12
            if (r3 < 0) goto L12
            if (r2 != r3) goto L7
            goto L12
        L7:
            java.lang.Object r1 = r1.f13453
            int[] r1 = (int[]) r1
            r0 = 0
            r1[r0] = r2
            r2 = 1
            r1[r2] = r3
            return r1
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: π */
    public abstract int mo3529();

    /* JADX INFO: renamed from: ρ */
    public java.lang.String m7306() {
            r0 = this;
            java.lang.Object r0 = r0.f13452
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.String r0 = "text"
            p000.ln0.m3650(r0)
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: σ */
    public abstract int mo3530();

    /* JADX INFO: renamed from: τ */
    public abstract int mo3531(android.view.View r1);

    /* JADX INFO: renamed from: υ */
    public abstract int mo3532(android.view.View r1);

    /* JADX INFO: renamed from: φ */
    public abstract void mo3533(int r1);

    /* JADX INFO: renamed from: χ */
    public abstract void mo1846();

    /* JADX INFO: renamed from: ψ */
    public abstract int[] mo7307(int r1);

    /* JADX INFO: renamed from: ω */
    public void m7308() {
            r2 = this;
            r2.m7302()
            android.content.IntentFilter r0 = r2.mo1844()
            int r1 = r0.countActions()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.Object r1 = r2.f13452
            f5 r1 = (p000.C0273f5) r1
            if (r1 != 0) goto L1b
            f5 r1 = new f5
            r1.<init>(r2)
            r2.f13452 = r1
        L1b:
            java.lang.Object r1 = r2.f13453
            androidx.appcompat.app.β r1 = (androidx.appcompat.app.LayoutInflaterFactory2C0026) r1
            android.content.Context r1 = r1.f398
            java.lang.Object r2 = r2.f13452
            f5 r2 = (p000.C0273f5) r2
            r1.registerReceiver(r2, r0)
            return
    }
}
