package p000;

/* JADX INFO: renamed from: u */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0854u {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f10520;

    /* JADX INFO: renamed from: β */
    public final p000.DialogInterfaceC0929w f10521;

    /* JADX INFO: renamed from: γ */
    public final android.view.Window f10522;

    /* JADX INFO: renamed from: δ */
    public java.lang.CharSequence f10523;

    /* JADX INFO: renamed from: ε */
    public androidx.appcompat.app.AlertController$RecycleListView f10524;

    /* JADX INFO: renamed from: ζ */
    public android.widget.Button f10525;

    /* JADX INFO: renamed from: η */
    public android.widget.Button f10526;

    /* JADX INFO: renamed from: θ */
    public android.widget.Button f10527;

    /* JADX INFO: renamed from: ι */
    public androidx.core.widget.NestedScrollView f10528;

    /* JADX INFO: renamed from: κ */
    public android.graphics.drawable.Drawable f10529;

    /* JADX INFO: renamed from: λ */
    public android.widget.ImageView f10530;

    /* JADX INFO: renamed from: μ */
    public android.widget.TextView f10531;

    /* JADX INFO: renamed from: ν */
    public android.widget.TextView f10532;

    /* JADX INFO: renamed from: ξ */
    public android.view.View f10533;

    /* JADX INFO: renamed from: ο */
    public android.widget.ListAdapter f10534;

    /* JADX INFO: renamed from: π */
    public int f10535;

    /* JADX INFO: renamed from: ρ */
    public final int f10536;

    /* JADX INFO: renamed from: σ */
    public final int f10537;

    /* JADX INFO: renamed from: τ */
    public final int f10538;

    /* JADX INFO: renamed from: υ */
    public final int f10539;

    /* JADX INFO: renamed from: φ */
    public final boolean f10540;

    /* JADX INFO: renamed from: χ */
    public final p000.HandlerC0780s f10541;

    /* JADX INFO: renamed from: ψ */
    public final p000.ViewOnClickListenerC1138 f10542;

    public C0854u(android.content.Context r5, p000.DialogInterfaceC0929w r6, android.view.Window r7) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.f10535 = r0
            ｈ r0 = new ｈ
            r1 = 1
            r0.<init>(r1, r4)
            r4.f10542 = r0
            r4.f10520 = r5
            r4.f10521 = r6
            r4.f10522 = r7
            s r7 = new s
            r7.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            r7.f9636 = r0
            r4.f10541 = r7
            int[] r7 = p000.kk1.f5972
            r0 = 2130968616(0x7f040028, float:1.754589E38)
            r2 = 0
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r2, r7, r0, r3)
            int r7 = r5.getResourceId(r3, r3)
            r4.f10536 = r7
            r7 = 2
            r5.getResourceId(r7, r3)
            r7 = 4
            int r7 = r5.getResourceId(r7, r3)
            r4.f10537 = r7
            r7 = 5
            r5.getResourceId(r7, r3)
            r7 = 7
            int r7 = r5.getResourceId(r7, r3)
            r4.f10538 = r7
            r7 = 3
            int r7 = r5.getResourceId(r7, r3)
            r4.f10539 = r7
            r7 = 6
            boolean r7 = r5.getBoolean(r7, r1)
            r4.f10540 = r7
            r5.getDimensionPixelSize(r1, r3)
            r5.recycle()
            androidx.appcompat.app.α r4 = r6.m6294()
            r4.mo203(r1)
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.view.ViewGroup m5768(android.view.View r2, android.view.View r3) {
            if (r2 != 0) goto Lf
            boolean r2 = r3 instanceof android.view.ViewStub
            if (r2 == 0) goto Lc
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        Lc:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        Lf:
            if (r3 == 0) goto L1e
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L1e:
            boolean r3 = r2 instanceof android.view.ViewStub
            if (r3 == 0) goto L28
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L28:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
    }
}
