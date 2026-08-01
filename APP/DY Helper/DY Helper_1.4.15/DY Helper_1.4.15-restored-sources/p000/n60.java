package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class n60 implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, p000.hr0, p000.r92, p000.sc0, p000.kq1 {

    /* JADX INFO: renamed from: Ψ */
    public static final java.lang.Object f7399 = null;

    /* JADX INFO: renamed from: Α */
    public p000.n60 f7400;

    /* JADX INFO: renamed from: Β */
    public int f7401;

    /* JADX INFO: renamed from: Γ */
    public int f7402;

    /* JADX INFO: renamed from: Δ */
    public java.lang.String f7403;

    /* JADX INFO: renamed from: Ε */
    public boolean f7404;

    /* JADX INFO: renamed from: Ζ */
    public boolean f7405;

    /* JADX INFO: renamed from: Η */
    public boolean f7406;

    /* JADX INFO: renamed from: Θ */
    public final boolean f7407;

    /* JADX INFO: renamed from: Ι */
    public boolean f7408;

    /* JADX INFO: renamed from: Κ */
    public android.view.ViewGroup f7409;

    /* JADX INFO: renamed from: Λ */
    public boolean f7410;

    /* JADX INFO: renamed from: Μ */
    public boolean f7411;

    /* JADX INFO: renamed from: Ν */
    public p000.m60 f7412;

    /* JADX INFO: renamed from: Ξ */
    public boolean f7413;

    /* JADX INFO: renamed from: Ο */
    public boolean f7414;

    /* JADX INFO: renamed from: Π */
    public java.lang.String f7415;

    /* JADX INFO: renamed from: Ρ */
    public p000.cr0 f7416;

    /* JADX INFO: renamed from: Σ */
    public p000.jr0 f7417;

    /* JADX INFO: renamed from: Τ */
    public final p000.p11 f7418;

    /* JADX INFO: renamed from: Υ */
    public p000.C0574n5 f7419;

    /* JADX INFO: renamed from: Φ */
    public final java.util.ArrayList f7420;

    /* JADX INFO: renamed from: Χ */
    public final p000.k60 f7421;

    /* JADX INFO: renamed from: ε */
    public int f7422;

    /* JADX INFO: renamed from: ζ */
    public android.os.Bundle f7423;

    /* JADX INFO: renamed from: η */
    public android.util.SparseArray f7424;

    /* JADX INFO: renamed from: θ */
    public android.os.Bundle f7425;

    /* JADX INFO: renamed from: ι */
    public java.lang.String f7426;

    /* JADX INFO: renamed from: κ */
    public android.os.Bundle f7427;

    /* JADX INFO: renamed from: λ */
    public p000.n60 f7428;

    /* JADX INFO: renamed from: μ */
    public java.lang.String f7429;

    /* JADX INFO: renamed from: ν */
    public int f7430;

    /* JADX INFO: renamed from: ξ */
    public java.lang.Boolean f7431;

    /* JADX INFO: renamed from: ο */
    public boolean f7432;

    /* JADX INFO: renamed from: π */
    public boolean f7433;

    /* JADX INFO: renamed from: ρ */
    public boolean f7434;

    /* JADX INFO: renamed from: σ */
    public boolean f7435;

    /* JADX INFO: renamed from: τ */
    public boolean f7436;

    /* JADX INFO: renamed from: υ */
    public boolean f7437;

    /* JADX INFO: renamed from: φ */
    public int f7438;

    /* JADX INFO: renamed from: χ */
    public p000.b70 f7439;

    /* JADX INFO: renamed from: ψ */
    public p000.p60 f7440;

    /* JADX INFO: renamed from: ω */
    public p000.b70 f7441;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.n60.f7399 = r0
            return
    }

    public n60() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f7422 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.f7426 = r0
            r0 = 0
            r3.f7429 = r0
            r3.f7431 = r0
            b70 r0 = new b70
            r0.<init>()
            r3.f7441 = r0
            r0 = 1
            r3.f7407 = r0
            r3.f7411 = r0
            ss r0 = new ss
            r1 = r3
            ws r1 = (p000.DialogInterfaceOnCancelListenerC0958ws) r1
            r2 = 1
            r0.<init>(r1, r2)
            cr0 r0 = p000.cr0.f2728
            r3.f7416 = r0
            p11 r0 = new p11
            r0.<init>()
            r3.f7418 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f7420 = r0
            k60 r0 = new k60
            r0.<init>(r1)
            r3.f7421 = r0
            r3.m4000()
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.f7408 = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            p60 r0 = r1.f7440
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            androidx.fragment.app.FragmentActivity r0 = r0.f8430
        L8:
            if (r0 == 0) goto Le
            r0.onCreateContextMenu(r2, r3, r4)
            return
        Le:
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " not attached to an activity."
            p000.C1080.m7270(r2, r1, r3)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.f7408 = r0
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ("
            r0.append(r1)
            java.lang.String r1 = r2.f7426
            r0.append(r1)
            int r1 = r2.f7401
            if (r1 == 0) goto L3e
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.f7401
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3e:
            java.lang.String r1 = r2.f7403
            if (r1 == 0) goto L4c
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r2 = r2.f7403
            r0.append(r2)
        L4c:
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.kq1
    /* JADX INFO: renamed from: α */
    public final p000.C0574n5 mo189() {
            r0 = this;
            n5 r0 = r0.f7419
            java.lang.Object r0 = r0.f7388
            n5 r0 = (p000.C0574n5) r0
            return r0
    }

    @Override // p000.sc0
    /* JADX INFO: renamed from: β */
    public final p000.k11 mo190() {
            r4 = this;
            android.content.Context r0 = r4.m4007()
            android.content.Context r0 = r0.getApplicationContext()
        L8:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L13
            android.app.Application r0 = (android.app.Application) r0
            goto L1b
        L13:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L8
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L44
            r1 = 3
            boolean r1 = p000.b70.m751(r1)
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find Application instance from Context "
            r1.<init>(r2)
            android.content.Context r2 = r4.m4007()
            android.content.Context r2 = r2.getApplicationContext()
            r1.append(r2)
            java.lang.String r2 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L44:
            k11 r1 = new k11
            r1.<init>()
            java.util.LinkedHashMap r2 = r1.f4786
            if (r0 == 0) goto L52
            zz1 r3 = p000.o92.f7999
            r2.put(r3, r0)
        L52:
            rk0 r0 = p000.ln0.f6719
            r2.put(r0, r4)
            rk0 r0 = p000.ln0.f6720
            r2.put(r0, r4)
            android.os.Bundle r4 = r4.f7427
            if (r4 == 0) goto L65
            rk0 r0 = p000.ln0.f6721
            r2.put(r0, r4)
        L65:
            return r1
    }

    @Override // p000.r92
    /* JADX INFO: renamed from: γ */
    public final p000.q92 mo191() {
            r2 = this;
            b70 r0 = r2.f7439
            if (r0 == 0) goto L2d
            int r0 = r2.m3998()
            r1 = 1
            if (r0 == r1) goto L26
            b70 r0 = r2.f7439
            e70 r0 = r0.f1516
            java.util.HashMap r0 = r0.f3431
            java.lang.String r1 = r2.f7426
            java.lang.Object r1 = r0.get(r1)
            q92 r1 = (p000.q92) r1
            if (r1 != 0) goto L25
            q92 r1 = new q92
            r1.<init>()
            java.lang.String r2 = r2.f7426
            r0.put(r2, r1)
        L25:
            return r1
        L26:
            java.lang.String r2 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            p000.C1080.m7279(r2)
        L2b:
            r2 = 0
            return r2
        L2d:
            java.lang.String r2 = "Can't access ViewModels from detached fragment"
            p000.C1080.m7279(r2)
            goto L2b
    }

    @Override // p000.hr0
    /* JADX INFO: renamed from: δ */
    public final p000.jr0 mo192() {
            r0 = this;
            jr0 r0 = r0.f7417
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final p000.m60 m3996() {
            r2 = this;
            m60 r0 = r2.f7412
            if (r0 != 0) goto L16
            m60 r0 = new m60
            r0.<init>()
            java.lang.Object r1 = p000.n60.f7399
            r0.f6976 = r1
            r0.f6977 = r1
            r0.f6978 = r1
            r1 = 0
            r0.f6979 = r1
            r2.f7412 = r0
        L16:
            m60 r2 = r2.f7412
            return r2
    }

    /* JADX INFO: renamed from: ζ */
    public final p000.b70 m3997() {
            r2 = this;
            p60 r0 = r2.f7440
            if (r0 == 0) goto L7
            b70 r2 = r2.f7441
            return r2
        L7:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " has not been attached yet."
            p000.C1080.m7270(r0, r2, r1)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: η */
    public final int m3998() {
            r2 = this;
            cr0 r0 = r2.f7416
            cr0 r1 = p000.cr0.f2725
            if (r0 == r1) goto L1a
            n60 r1 = r2.f7400
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            n60 r2 = r2.f7400
            int r2 = r2.m3998()
            int r2 = java.lang.Math.min(r0, r2)
            return r2
        L1a:
            int r2 = r0.ordinal()
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public final p000.b70 m3999() {
            r2 = this;
            b70 r0 = r2.f7439
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " not associated with a fragment manager."
            p000.C1080.m7270(r0, r2, r1)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final void m4000() {
            r3 = this;
            jr0 r0 = new jr0
            r0.<init>(r3)
            r3.f7417 = r0
            jq1 r0 = new jq1
            η r1 = new η
            r2 = 14
            r1.<init>(r2, r3)
            r0.<init>(r3, r1)
            n5 r1 = new n5
            r1.<init>(r0)
            r3.f7419 = r1
            java.util.ArrayList r0 = r3.f7420
            k60 r1 = r3.f7421
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L4b
            int r3 = r3.f7422
            if (r3 < 0) goto L48
            ws r3 = r1.f5773
            n5 r0 = r3.f7419
            java.lang.Object r0 = r0.f7387
            jq1 r0 = (p000.jq1) r0
            r0.m2979()
            p000.ln0.m3639(r3)
            android.os.Bundle r0 = r3.f7423
            if (r0 == 0) goto L41
            java.lang.String r1 = "registryState"
            android.os.Bundle r0 = r0.getBundle(r1)
            goto L42
        L41:
            r0 = 0
        L42:
            n5 r3 = r3.f7419
            r3.m3972(r0)
            return
        L48:
            r0.add(r1)
        L4b:
            return
    }

    /* JADX INFO: renamed from: κ */
    public final void m4001() {
            r3 = this;
            r3.m4000()
            java.lang.String r0 = r3.f7426
            r3.f7415 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.f7426 = r0
            r0 = 0
            r3.f7432 = r0
            r3.f7433 = r0
            r3.f7434 = r0
            r3.f7435 = r0
            r3.f7436 = r0
            r3.f7438 = r0
            r1 = 0
            r3.f7439 = r1
            b70 r2 = new b70
            r2.<init>()
            r3.f7441 = r2
            r3.f7440 = r1
            r3.f7401 = r0
            r3.f7402 = r0
            r3.f7403 = r1
            r3.f7404 = r0
            r3.f7405 = r0
            return
    }

    /* JADX INFO: renamed from: λ */
    public final boolean m4002() {
            r2 = this;
            boolean r0 = r2.f7404
            if (r0 != 0) goto L1a
            b70 r0 = r2.f7439
            r1 = 0
            if (r0 == 0) goto L19
            n60 r2 = r2.f7400
            r0.getClass()
            if (r2 != 0) goto L12
            r2 = r1
            goto L16
        L12:
            boolean r2 = r2.m4002()
        L16:
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: μ */
    public final boolean m4003() {
            r0 = this;
            int r0 = r0.f7438
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public final void m4004(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = p000.b70.m751(r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " received the following in onActivityResult(): requestCode: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " resultCode: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = " data: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L32:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public abstract void mo4005(android.os.Bundle r1);

    /* JADX INFO: renamed from: ο */
    public final android.view.LayoutInflater m4006() {
            r9 = this;
            ws r9 = (p000.DialogInterfaceOnCancelListenerC0958ws) r9
            p60 r0 = r9.f7440
            if (r0 == 0) goto Lf7
            androidx.fragment.app.FragmentActivity r0 = r0.f8429
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            android.view.LayoutInflater r0 = r1.cloneInContext(r0)
            b70 r1 = r9.f7441
            r60 r1 = r1.f1523
            r0.setFactory2(r1)
            boolean r1 = r9.f11841
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto Lcb
            boolean r4 = r9.f11843
            if (r4 == 0) goto L24
            goto Lcb
        L24:
            if (r1 != 0) goto L28
            goto La2
        L28:
            boolean r1 = r9.f11848
            if (r1 != 0) goto La2
            r1 = 0
            r4 = 1
            r9.f11843 = r4     // Catch: java.lang.Throwable -> L80
            r5 = 3
            boolean r6 = p000.b70.m751(r5)     // Catch: java.lang.Throwable -> L80
            if (r6 == 0) goto L48
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L80
            java.lang.String r7 = "onCreateDialog called for DialogFragment "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L80
            r6.append(r9)     // Catch: java.lang.Throwable -> L80
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L80
            android.util.Log.d(r3, r6)     // Catch: java.lang.Throwable -> L80
        L48:
            xm r6 = new xm     // Catch: java.lang.Throwable -> L80
            android.content.Context r7 = r9.m4007()     // Catch: java.lang.Throwable -> L80
            int r8 = r9.f11839     // Catch: java.lang.Throwable -> L80
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L80
            r9.f11845 = r6     // Catch: java.lang.Throwable -> L80
            boolean r7 = r9.f11841     // Catch: java.lang.Throwable -> L80
            r8 = 0
            if (r7 == 0) goto L9a
            int r7 = r9.f11838     // Catch: java.lang.Throwable -> L80
            if (r7 == r4) goto L6e
            if (r7 == r2) goto L6e
            if (r7 == r5) goto L63
            goto L71
        L63:
            android.view.Window r5 = r6.getWindow()     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L6e
            r7 = 24
            r5.addFlags(r7)     // Catch: java.lang.Throwable -> L80
        L6e:
            r6.requestWindowFeature(r4)     // Catch: java.lang.Throwable -> L80
        L71:
            p60 r5 = r9.f7440     // Catch: java.lang.Throwable -> L80
            if (r5 != 0) goto L76
            goto L78
        L76:
            androidx.fragment.app.FragmentActivity r8 = r5.f8431     // Catch: java.lang.Throwable -> L80
        L78:
            if (r8 == 0) goto L82
            xm r5 = r9.f11845     // Catch: java.lang.Throwable -> L80
            r5.setOwnerActivity(r8)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r0 = move-exception
            goto L9f
        L82:
            xm r5 = r9.f11845     // Catch: java.lang.Throwable -> L80
            boolean r6 = r9.f11840     // Catch: java.lang.Throwable -> L80
            r5.setCancelable(r6)     // Catch: java.lang.Throwable -> L80
            xm r5 = r9.f11845     // Catch: java.lang.Throwable -> L80
            ts r6 = r9.f11836     // Catch: java.lang.Throwable -> L80
            r5.setOnCancelListener(r6)     // Catch: java.lang.Throwable -> L80
            xm r5 = r9.f11845     // Catch: java.lang.Throwable -> L80
            us r6 = r9.f11837     // Catch: java.lang.Throwable -> L80
            r5.setOnDismissListener(r6)     // Catch: java.lang.Throwable -> L80
            r9.f11848 = r4     // Catch: java.lang.Throwable -> L80
            goto L9c
        L9a:
            r9.f11845 = r8     // Catch: java.lang.Throwable -> L80
        L9c:
            r9.f11843 = r1
            goto La2
        L9f:
            r9.f11843 = r1
            throw r0
        La2:
            boolean r1 = p000.b70.m751(r2)
            if (r1 == 0) goto Lbe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r2 = " from dialog context"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
        Lbe:
            xm r9 = r9.f11845
            if (r9 == 0) goto Lf6
            android.content.Context r9 = r9.getContext()
            android.view.LayoutInflater r9 = r0.cloneInContext(r9)
            return r9
        Lcb:
            boolean r1 = p000.b70.m751(r2)
            if (r1 == 0) goto Lf6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            boolean r9 = r9.f11841
            if (r9 != 0) goto Led
            java.lang.String r9 = "mShowsDialog = false: "
            java.lang.String r9 = r9.concat(r1)
            android.util.Log.d(r3, r9)
            return r0
        Led:
            java.lang.String r9 = "mCreatingDialog = true: "
            java.lang.String r9 = r9.concat(r1)
            android.util.Log.d(r3, r9)
        Lf6:
            return r0
        Lf7:
            java.lang.String r9 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            p000.C1080.m7279(r9)
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: π */
    public final android.content.Context m4007() {
            r2 = this;
            p60 r0 = r2.f7440
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            androidx.fragment.app.FragmentActivity r0 = r0.f8431
        L8:
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "Fragment "
            java.lang.String r1 = " not attached to a context."
            p000.C1080.m7270(r0, r2, r1)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public final void m4008(int r2, int r3, int r4, int r5) {
            r1 = this;
            m60 r0 = r1.f7412
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            m60 r0 = r1.m3996()
            r0.f6971 = r2
            m60 r2 = r1.m3996()
            r2.f6972 = r3
            m60 r2 = r1.m3996()
            r2.f6973 = r4
            m60 r1 = r1.m3996()
            r1.f6974 = r5
            return
    }
}
