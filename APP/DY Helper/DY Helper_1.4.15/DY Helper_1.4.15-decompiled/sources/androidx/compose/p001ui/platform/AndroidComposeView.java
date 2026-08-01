package androidx.compose.p001ui.platform;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends android.view.ViewGroup implements p000.uo1, p000.InterfaceC0332gr, p000.q81, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnTouchModeChangeListener, p000.t40 {

    /* JADX INFO: renamed from: М */
    public static java.lang.Class f872;

    /* JADX INFO: renamed from: Н */
    public static java.lang.reflect.Method f873;

    /* JADX INFO: renamed from: О */
    public static final p000.v11 f874 = null;

    /* JADX INFO: renamed from: П */
    public static p000.RunnableC0781s0 f875;

    /* JADX INFO: renamed from: Α */
    public final p000.yp0 f876;

    /* JADX INFO: renamed from: Β */
    public final p000.n11 f877;

    /* JADX INFO: renamed from: Γ */
    public final p000.ol1 f878;

    /* JADX INFO: renamed from: Δ */
    public final p000.es1 f879;

    /* JADX INFO: renamed from: Ε */
    public final p000.ViewOnAttachStateChangeListenerC0496l1 f880;

    /* JADX INFO: renamed from: Ζ */
    public p000.ViewOnAttachStateChangeListenerC1042z1 f881;

    /* JADX INFO: renamed from: Η */
    public final p000.C0342h0 f882;

    /* JADX INFO: renamed from: Θ */
    public final p000.C0497l2 f883;

    /* JADX INFO: renamed from: Ι */
    public final p000.C1011y7 f884;

    /* JADX INFO: renamed from: Κ */
    public final p000.v11 f885;

    /* JADX INFO: renamed from: Λ */
    public p000.v11 f886;

    /* JADX INFO: renamed from: Μ */
    public boolean f887;

    /* JADX INFO: renamed from: Ν */
    public final p000.b11 f888;

    /* JADX INFO: renamed from: Ξ */
    public final p000.C0796sf f889;

    /* JADX INFO: renamed from: Ο */
    public final p000.x91 f890;

    /* JADX INFO: renamed from: Π */
    public final p000.C0296fs f891;

    /* JADX INFO: renamed from: Ρ */
    public final p000.C0379i0 f892;

    /* JADX INFO: renamed from: Σ */
    public final p000.C0452k0 f893;

    /* JADX INFO: renamed from: Τ */
    public boolean f894;

    /* JADX INFO: renamed from: Υ */
    public final p000.C0670p0 f895;

    /* JADX INFO: renamed from: Φ */
    public final p000.C0606o0 f896;

    /* JADX INFO: renamed from: Χ */
    public final p000.y81 f897;

    /* JADX INFO: renamed from: Ψ */
    public androidx.compose.p001ui.platform.AndroidViewsHandler f898;

    /* JADX INFO: renamed from: Ω */
    public p000.C1028yo f899;

    /* JADX INFO: renamed from: ε */
    public final p000.x91 f900;

    /* JADX INFO: renamed from: ζ */
    public long f901;

    /* JADX INFO: renamed from: η */
    public final boolean f902;

    /* JADX INFO: renamed from: θ */
    public final p000.aq0 f903;

    /* JADX INFO: renamed from: ι */
    public p000.kr0 f904;

    /* JADX INFO: renamed from: κ */
    public p000.lr0 f905;

    /* JADX INFO: renamed from: λ */
    public p000.go1 f906;

    /* JADX INFO: renamed from: μ */
    public final p000.C0936w6 f907;

    /* JADX INFO: renamed from: ν */
    public final p000.RunnableC0707q0 f908;

    /* JADX INFO: renamed from: ξ */
    public final p000.x91 f909;

    /* JADX INFO: renamed from: ο */
    public final android.view.View f910;

    /* JADX INFO: renamed from: π */
    public final p000.y40 f911;

    /* JADX INFO: renamed from: ρ */
    public p000.InterfaceC0880up f912;

    /* JADX INFO: renamed from: σ */
    public final p000.ViewOnDragListenerC0233e2 f913;

    /* JADX INFO: renamed from: τ */
    public final p000.lm0 f914;

    /* JADX INFO: renamed from: υ */
    public final p000.x91 f915;

    /* JADX INFO: renamed from: φ */
    public final p000.C0296fs f916;

    /* JADX INFO: renamed from: χ */
    public final p000.C0319ge f917;

    /* JADX INFO: renamed from: ψ */
    public final p000.C0498l3 f918;

    /* JADX INFO: renamed from: ω */
    public final p000.om0 f919;

    /* JADX INFO: renamed from: А */
    public final p000.RunnableC0196d1 f920;

    /* JADX INFO: renamed from: Б */
    public final p000.RunnableC0707q0 f921;

    /* JADX INFO: renamed from: В */
    public boolean f922;

    /* JADX INFO: renamed from: Г */
    public final p000.ul0 f923;

    /* JADX INFO: renamed from: Д */
    public final p000.C0967x0 f924;

    /* JADX INFO: renamed from: Е */
    public final p000.C0427jd f925;

    /* JADX INFO: renamed from: Ж */
    public boolean f926;

    /* JADX INFO: renamed from: З */
    public boolean f927;

    /* JADX INFO: renamed from: И */
    public final p000.lm0 f928;

    /* JADX INFO: renamed from: К */
    public android.view.View f929;

    /* JADX INFO: renamed from: Л */
    public final p000.xn0 f930;

    /* JADX INFO: renamed from: а */
    public boolean f931;

    /* JADX INFO: renamed from: б */
    public final p000.mx0 f932;

    /* JADX INFO: renamed from: в */
    public long f933;

    /* JADX INFO: renamed from: г */
    public final int[] f934;

    /* JADX INFO: renamed from: д */
    public final float[] f935;

    /* JADX INFO: renamed from: е */
    public final float[] f936;

    /* JADX INFO: renamed from: ж */
    public long f937;

    /* JADX INFO: renamed from: з */
    public boolean f938;

    /* JADX INFO: renamed from: и */
    public long f939;

    /* JADX INFO: renamed from: й */
    public final p000.x91 f940;

    /* JADX INFO: renamed from: к */
    public final p000.C0296fs f941;

    /* JADX INFO: renamed from: л */
    public p000.a80 f942;

    /* JADX INFO: renamed from: м */
    public p000.j32 f943;

    /* JADX INFO: renamed from: н */
    public p000.i32 f944;

    /* JADX INFO: renamed from: о */
    public final java.util.concurrent.atomic.AtomicReference f945;

    /* JADX INFO: renamed from: п */
    public p000.C0381i2 f946;

    /* JADX INFO: renamed from: р */
    public final p000.e50 f947;

    /* JADX INFO: renamed from: с */
    public final p000.g21 f948;

    /* JADX INFO: renamed from: т */
    public final p000.x91 f949;

    /* JADX INFO: renamed from: у */
    public final p000.rc0 f950;

    /* JADX INFO: renamed from: ф */
    public final p000.lm0 f951;

    /* JADX INFO: renamed from: х */
    public final p000.s01 f952;

    /* JADX INFO: renamed from: ц */
    public final p000.C0381i2 f953;

    /* JADX INFO: renamed from: ч */
    public android.view.MotionEvent f954;

    /* JADX INFO: renamed from: ш */
    public long f955;

    /* JADX INFO: renamed from: щ */
    public final p000.cw1 f956;

    /* JADX INFO: renamed from: э */
    public final p000.v11 f957;

    /* JADX INFO: renamed from: ю */
    public float f958;

    /* JADX INFO: renamed from: я */
    public float f959;

    static {
            v11 r0 = new v11
            r0.<init>()
            androidx.compose.p001ui.platform.AndroidComposeView.f874 = r0
            return
    }

    public AndroidComposeView(android.content.Context r16, p000.C0693pn r17) {
            r15 = this;
            r8 = r16
            r9 = r17
            r15.<init>(r16)
            x91 r0 = p000.j81.m2882(r9)
            r15.f900 = r0
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r15.f901 = r0
            r10 = 1
            r15.f902 = r10
            aq0 r0 = r9.f8613
            r15.f903 = r0
            x r0 = p000.C0966x.f11932
            r15.f906 = r0
            w6 r0 = new w6
            r0.<init>()
            r15.f907 = r0
            q0 r0 = new q0
            r11 = 0
            r0.<init>(r15, r11)
            r15.f908 = r0
            as r0 = p000.jx0.m3035(r8)
            xn0 r1 = p000.xn0.f12218
            x91 r3 = new x91
            r3.<init>(r0, r1)
            r15.f909 = r3
            y40 r0 = new y40
            r0.<init>(r15, r15)
            r15.f911 = r0
            un r0 = r9.f8597
            up r0 = r0.mo3324()
            r15.f912 = r0
            e2 r0 = new e2
            z0 r1 = new z0
            r0.<init>()
            r15.f913 = r0
            lm0 r0 = new lm0
            r0.<init>(r10, r11)
            r15.f914 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            x91 r0 = p000.j81.m2882(r0)
            r15.f915 = r0
            x0 r0 = new x0
            r0.<init>(r15, r11)
            m6 r1 = p000.gx1.f4502
            fs r1 = new fs
            r1.<init>(r0)
            r15.f916 = r1
            ge r0 = r9.f8615
            r15.f917 = r0
            l3 r0 = r9.f8612
            r15.f918 = r0
            om0 r0 = new om0
            r0.<init>()
            r15.f919 = r0
            yp0 r0 = new yp0
            r12 = 3
            r0.<init>(r12)
            px0 r1 = r0.f12725
            vo1 r3 = p000.vo1.f11355
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L94
            r0.f12725 = r3
            r0.m6974()
        L94:
            yr r1 = r15.getDensity()
            r0.m6990(r1)
            g92 r1 = r15.getViewConfiguration()
            r0.m7014(r1)
            e1 r1 = new e1
            r1.<init>(r15)
            v40 r3 = r15.getFocusOwner()
            y40 r3 = (p000.y40) r3
            w40 r3 = r3.f12449
            r01 r1 = r1.mo4345(r3)
            e2 r3 = r15.getDragAndDropManager()
            d2 r3 = r3.f3374
            r01 r1 = r1.mo4345(r3)
            r0.m7013(r1)
            r15.f876 = r0
            n11 r0 = p000.tm0.f10413
            n11 r0 = new n11
            r0.<init>()
            r15.f877 = r0
            ol1 r0 = new ol1
            r15.getLayoutNodes()
            r0.<init>(r15)
            r15.f878 = r0
            es1 r0 = new es1
            yp0 r1 = r15.getRoot()
            lz r3 = new lz
            r3.<init>()
            n11 r4 = r15.getLayoutNodes()
            r0.<init>(r1, r3, r4)
            r15.f879 = r0
            l1 r13 = new l1
            r13.<init>(r15)
            r15.f880 = r13
            z1 r14 = new z1
            w0 r0 = new w0
            r6 = 1
            r7 = 0
            r1 = 0
            java.lang.Class<s1> r3 = p000.AbstractC0782s1.class
            java.lang.String r4 = "getContentCaptureSessionCompat"
            java.lang.String r5 = "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;"
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.<init>(r15, r0)
            r15.f881 = r14
            h0 r0 = r9.f8605
            r15.f882 = r0
            l2 r0 = new l2
            r0.<init>(r15)
            r15.f883 = r0
            y7 r0 = new y7
            r0.<init>()
            r15.f884 = r0
            v11 r0 = new v11
            r0.<init>()
            r15.f885 = r0
            b11 r0 = new b11
            r0.<init>()
            r15.f888 = r0
            sf r0 = new sf
            yp0 r1 = r15.getRoot()
            r0.<init>()
            r0.f9880 = r1
            ke0 r3 = new ke0
            k31 r1 = r1.f12733
            gm0 r1 = r1.f5726
            r3.<init>(r1)
            r0.f9881 = r3
            y21 r1 = new y21
            r1.<init>(r12)
            r0.f9882 = r1
            ne0 r1 = new ne0
            r1.<init>()
            r0.f9883 = r1
            r15.f889 = r0
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r1 = r8.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.<init>(r1)
            x91 r0 = p000.j81.m2882(r0)
            r15.f890 = r0
            x0 r0 = new x0
            r0.<init>(r15, r10)
            fs r1 = new fs
            r1.<init>(r0)
            r15.f891 = r1
            i0 r0 = new i0
            y7 r1 = r15.getAutofillTree()
            r0.<init>(r15, r1)
            r15.f892 = r0
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            if (r0 == 0) goto L308
            k0 r1 = new k0
            r3 = r1
            y21 r1 = new y21
            r1.<init>(r0)
            es1 r2 = r15.getSemanticsOwner()
            ol1 r4 = r15.getRectManager()
            java.lang.String r5 = r8.getPackageName()
            r0 = r3
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r15.f893 = r0
            p0 r0 = r9.f8607
            r15.f895 = r0
            o0 r0 = r9.f8608
            r15.f896 = r0
            y81 r0 = new y81
            b1 r1 = new b1
            r1.<init>(r15, r10)
            r0.<init>(r1)
            r15.f897 = r0
            mx0 r0 = new mx0
            yp0 r1 = r15.getRoot()
            r0.<init>(r1)
            r15.f932 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            long r0 = (long) r0
            r3 = 32
            long r3 = r0 << r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r5
            long r0 = r0 | r3
            r15.f933 = r0
            int[] r0 = new int[]{r11, r11}
            r15.f934 = r0
            float[] r0 = p000.AbstractC0073bd.m878()
            r15.f935 = r0
            float[] r0 = p000.AbstractC0073bd.m878()
            r15.f936 = r0
            r0 = -1
            r15.f937 = r0
            r0 = 9187343241974906880(0x7f8000007f800000, double:1.404448428688076E306)
            r15.f939 = r0
            r0 = 0
            x91 r1 = p000.j81.m2882(r0)
            r15.f940 = r1
            x0 r1 = new x0
            r1.<init>(r15, r12)
            fs r3 = new fs
            r3.<init>(r1)
            r15.f941 = r3
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r0)
            r15.f945 = r1
            e50 r1 = r9.f8609
            r15.f947 = r1
            g21 r1 = r9.f8610
            r15.f948 = r1
            android.content.res.Resources r1 = r8.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.getLayoutDirection()
            int[] r3 = p000.r40.f9257
            np0 r3 = p000.np0.f7701
            if (r1 == 0) goto L223
            if (r1 == r10) goto L220
            r1 = r0
            goto L224
        L220:
            np0 r1 = p000.np0.f7702
            goto L224
        L223:
            r1 = r3
        L224:
            if (r1 != 0) goto L227
            goto L228
        L227:
            r3 = r1
        L228:
            x91 r1 = p000.j81.m2882(r3)
            r15.f949 = r1
            rc0 r1 = r9.f8611
            r15.f950 = r1
            lm0 r1 = new lm0
            boolean r3 = r15.isInTouchMode()
            r4 = 2
            if (r3 == 0) goto L23d
            r3 = r10
            goto L23e
        L23d:
            r3 = r4
        L23e:
            r1.<init>(r3)
            r15.f951 = r1
            s01 r1 = new s01
            r1.<init>()
            k21 r3 = new k21
            r5 = 16
            p8[] r6 = new p000.C0678p8[r5]
            r3.<init>(r6)
            k21 r3 = new k21
            h62[] r6 = new p000.h62[r5]
            r3.<init>(r6)
            k21 r3 = new k21
            yp0[] r6 = new p000.yp0[r5]
            r3.<init>(r6)
            k21 r3 = new k21
            h62[] r5 = new p000.h62[r5]
            r3.<init>(r5)
            r15.f952 = r1
            i2 r1 = new i2
            r1.<init>(r4)
            r15.f953 = r1
            cw1 r1 = new cw1
            r3 = 5
            r1.<init>(r3)
            r15.f956 = r1
            v11 r1 = new v11
            r1.<init>()
            r15.f957 = r1
            d1 r1 = new d1
            r1.<init>(r11, r15)
            r15.f920 = r1
            q0 r1 = new q0
            r1.<init>(r15, r10)
            r15.f921 = r1
            ul0 r1 = new ul0
            b1 r3 = new b1
            r3.<init>(r15, r11)
            r1.<init>(r8, r3)
            r15.f923 = r1
            x0 r1 = new x0
            r1.<init>(r15, r4)
            r15.f924 = r1
            jd r1 = new jd
            r1.<init>()
            r15.f925 = r1
            z1 r1 = r15.f881
            r15.addOnAttachStateChangeListener(r1)
            r15.setWillNotDraw(r11)
            r15.setFocusable(r10)
            r1 r1 = p000.C0745r1.f9193
            r1.m5044(r15, r10, r11)
            r15.setFocusableInTouchMode(r10)
            r15.setClipChildren(r11)
            p000.b92.m828(r15, r13)
            e2 r1 = r15.getDragAndDropManager()
            r15.setOnDragListener(r1)
            yp0 r1 = r15.getRoot()
            r1.m6992(r15)
            m1 r1 = p000.C0533m1.f6884
            r1.m3700(r15)
            boolean r1 = m371()
            if (r1 == 0) goto L2f3
            android.view.View r1 = new android.view.View
            r1.<init>(r8)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r10, r10)
            r1.setLayoutParams(r3)
            r3 = 2131296642(0x7f090182, float:1.8211206E38)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r1.setTag(r3, r5)
            r15.f910 = r1
            r3 = -1
            r15.addView(r1, r3)
        L2f3:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r1 < r3) goto L2fe
            lm0 r0 = new lm0
            r0.<init>(r4, r11)
        L2fe:
            r15.f928 = r0
            xn0 r0 = new xn0
            r0.<init>(r15)
            r15.f930 = r0
            return
        L308:
            java.lang.String r0 = "Autofill service could not be located."
            pm r0 = p000.lz1.m3680(r0)
            throw r0
    }

    private final boolean getDerivedIsAttached() {
            r0 = this;
            fs r0 = r0.f916
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    @p000.InterfaceC0088bs
    public static /* synthetic */ void getFontLoader$annotations() {
            return
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
            return
    }

    private final p000.j32 getLegacyTextInputServiceAndroid() {
            r2 = this;
            j32 r0 = r2.f943
            if (r0 != 0) goto Lf
            j32 r0 = new j32
            android.view.View r1 = r2.getView()
            r0.<init>(r1, r2)
            r2.f943 = r0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m7366getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
            return
    }

    public static /* synthetic */ void getRoot$annotations() {
            return
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
            return
    }

    @p000.InterfaceC0088bs
    public static /* synthetic */ void getTextInputService$annotations() {
            return
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
            return
    }

    private final p000.C0693pn get_composeViewContext() {
            r0 = this;
            x91 r0 = r0.f900
            java.lang.Object r0 = r0.getValue()
            pn r0 = (p000.C0693pn) r0
            return r0
    }

    private final p000.AbstractC0892v0 get_viewTreeOwners() {
            r0 = this;
            x91 r0 = r0.f940
            java.lang.Object r0 = r0.getValue()
            p000.lz1.m3698(r0)
            r0 = 0
            return r0
    }

    private final void setAttached(boolean r1) {
            r0 = this;
            x91 r0 = r0.f915
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    private void setDensity(p000.InterfaceC1031yr r1) {
            r0 = this;
            x91 r0 = r0.f909
            r0.setValue(r1)
            return
    }

    private void setFontFamilyResolver(p000.f50 r1) {
            r0 = this;
            g21 r0 = r0.f948
            r0.setValue(r1)
            return
    }

    private void setLayoutDirection(p000.np0 r1) {
            r0 = this;
            x91 r0 = r0.f949
            r0.setValue(r1)
            return
    }

    private final void set_composeViewContext(p000.C0693pn r1) {
            r0 = this;
            x91 r0 = r0.f900
            r0.setValue(r1)
            return
    }

    private final void set_viewTreeOwners(p000.AbstractC0892v0 r1) {
            r0 = this;
            x91 r0 = r0.f940
            r0.setValue(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ boolean m365(android.view.MotionEvent r0, androidx.compose.p001ui.platform.AndroidComposeView r1) {
            boolean r0 = super.dispatchGenericMotionEvent(r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static final /* synthetic */ boolean m366(androidx.compose.p001ui.platform.AndroidComposeView r0, android.view.KeyEvent r1) {
            boolean r0 = super.dispatchKeyEvent(r1)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final /* synthetic */ void m367(androidx.compose.p001ui.platform.AndroidComposeView r0) {
            r0.get_viewTreeOwners()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m368(android.view.ViewGroup r4) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L21
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof androidx.compose.p001ui.platform.AndroidComposeView
            if (r3 == 0) goto L15
            androidx.compose.ui.platform.AndroidComposeView r2 = (androidx.compose.p001ui.platform.AndroidComposeView) r2
            r2.m394()
            goto L1e
        L15:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1e
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            m368(r2)
        L1e:
            int r1 = r1 + 1
            goto L5
        L21:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static long m369(int r4) {
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 32
            r3 = 0
            if (r0 == r1) goto L28
            if (r0 == 0) goto L20
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L1a
            long r0 = (long) r4
            long r2 = r0 << r2
            long r0 = r0 | r2
            return r0
        L1a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        L20:
            long r0 = (long) r3
            long r0 = r0 << r2
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
        L28:
            long r0 = (long) r3
            long r0 = r0 << r2
            long r2 = (long) r4
            long r0 = r0 | r2
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static void m370(p000.yp0 r3) {
            r3.m6973()
            k21 r3 = r3.m7009()
            java.lang.Object[] r0 = r3.f5716
            int r3 = r3.f5718
            r1 = 0
        Lc:
            if (r1 >= r3) goto L18
            r2 = r0[r1]
            yp0 r2 = (p000.yp0) r2
            m370(r2)
            int r1 = r1 + 1
            goto Lc
        L18:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m371() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static boolean m372(android.view.MotionEvent r7) {
            float r0 = r7.getX()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            r2 = 0
            r3 = 1
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r0 >= r4) goto L35
            float r0 = r7.getY()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r0 = r0 & r1
            if (r0 >= r4) goto L35
            float r0 = r7.getRawX()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r0 = r0 & r1
            if (r0 >= r4) goto L35
            float r0 = r7.getRawY()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r0 = r0 & r1
            if (r0 >= r4) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 != 0) goto L66
            int r5 = r7.getPointerCount()
            r6 = r3
        L3d:
            if (r6 >= r5) goto L66
            float r0 = r7.getX(r6)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r0 = r0 & r1
            if (r0 >= r4) goto L60
            float r0 = r7.getY(r6)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            r0 = r0 & r1
            if (r0 >= r4) goto L60
            c11 r0 = p000.c11.f1931
            boolean r0 = r0.m1104(r7, r6)
            if (r0 != 0) goto L5e
            goto L60
        L5e:
            r0 = r2
            goto L61
        L60:
            r0 = r3
        L61:
            if (r0 != 0) goto L66
            int r6 = r6 + 1
            goto L3d
        L66:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList r13, int r14, int r15) {
            r12 = this;
            v40 r0 = r12.getFocusOwner()
            y40 r0 = (p000.y40) r0
            c50 r0 = r0.f12447
            boolean r1 = r0.f8784
            if (r1 != 0) goto Le
            goto L15e
        Le:
            q01 r1 = r0.f8771
            boolean r1 = r1.f8784
            java.lang.String r2 = "visitSubtreeIf called on an unattached node"
            if (r1 != 0) goto L19
            p000.am0.m178(r2)
        L19:
            k21 r1 = new k21
            r3 = 16
            q01[] r4 = new p000.q01[r3]
            r1.<init>(r4)
            q01 r0 = r0.f8771
            q01 r4 = r0.f8776
            if (r4 != 0) goto L2c
            p000.h62.m2386(r1, r0)
            goto L2f
        L2c:
            r1.m3127(r4)
        L2f:
            int r0 = r1.f5718
            if (r0 == 0) goto L15e
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.m3136(r0)
            q01 r0 = (p000.q01) r0
            int r4 = r0.f8774
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L159
            r4 = r0
        L42:
            if (r4 == 0) goto L159
            boolean r5 = r4.f8784
            if (r5 == 0) goto L159
            int r5 = r4.f8773
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L155
            r5 = 0
            r6 = r4
            r7 = r5
        L51:
            if (r6 == 0) goto L155
            boolean r8 = r6 instanceof p000.c50
            r9 = 1
            r10 = 0
            if (r8 == 0) goto L119
            c50 r6 = (p000.c50) r6
            boolean r8 = r6.f8784
            if (r8 == 0) goto L14f
            z40 r6 = r6.m1135()
            boolean r6 = r6.f12958
            if (r6 == 0) goto L14f
            super.addFocusables(r13, r14, r15)
            v40 r14 = r12.getFocusOwner()
            y40 r14 = (p000.y40) r14
            c50 r14 = r14.f12447
            boolean r15 = r14.f8784
            if (r15 != 0) goto L78
            goto L113
        L78:
            q01 r15 = r14.f8771
            boolean r15 = r15.f8784
            if (r15 != 0) goto L81
            p000.am0.m178(r2)
        L81:
            k21 r15 = new k21
            q01[] r0 = new p000.q01[r3]
            r15.<init>(r0)
            q01 r14 = r14.f8771
            q01 r0 = r14.f8776
            if (r0 != 0) goto L92
            p000.h62.m2386(r15, r14)
            goto L95
        L92:
            r15.m3127(r0)
        L95:
            int r14 = r15.f5718
            if (r14 == 0) goto L113
            int r14 = r14 + (-1)
            java.lang.Object r14 = r15.m3136(r14)
            q01 r14 = (p000.q01) r14
            int r0 = r14.f8774
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L10f
            r0 = r14
        La8:
            if (r0 == 0) goto L10f
            boolean r1 = r0.f8784
            if (r1 == 0) goto L10f
            int r1 = r0.f8773
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L10c
            r1 = r0
            r2 = r5
        Lb6:
            if (r1 == 0) goto L10c
            boolean r4 = r1 instanceof p000.c50
            if (r4 == 0) goto Ld1
            c50 r1 = (p000.c50) r1
            boolean r4 = r1.f8784
            if (r4 != 0) goto Lc3
            goto L107
        Lc3:
            z40 r4 = r1.m1135()
            boolean r1 = r1.f8784
            if (r1 == 0) goto L107
            boolean r1 = r4.f12958
            if (r1 == 0) goto L107
            goto L15e
        Ld1:
            int r4 = r1.f8773
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L107
            boolean r4 = r1 instanceof p000.C1014ya
            if (r4 == 0) goto L107
            r4 = r1
            ya r4 = (p000.C1014ya) r4
            q01 r4 = r4.f12512
            r6 = r10
        Le1:
            if (r4 == 0) goto L104
            int r7 = r4.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L101
            int r6 = r6 + 1
            if (r6 != r9) goto Lef
            r1 = r4
            goto L101
        Lef:
            if (r2 != 0) goto Lf8
            k21 r2 = new k21
            q01[] r7 = new p000.q01[r3]
            r2.<init>(r7)
        Lf8:
            if (r1 == 0) goto Lfe
            r2.m3127(r1)
            r1 = r5
        Lfe:
            r2.m3127(r4)
        L101:
            q01 r4 = r4.f8776
            goto Le1
        L104:
            if (r6 != r9) goto L107
            goto Lb6
        L107:
            q01 r1 = p000.h62.m2387(r2)
            goto Lb6
        L10c:
            q01 r0 = r0.f8776
            goto La8
        L10f:
            p000.h62.m2386(r15, r14)
            goto L95
        L113:
            if (r13 == 0) goto L15e
            r13.remove(r12)
            return
        L119:
            int r8 = r6.f8773
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L14f
            boolean r8 = r6 instanceof p000.C1014ya
            if (r8 == 0) goto L14f
            r8 = r6
            ya r8 = (p000.C1014ya) r8
            q01 r8 = r8.f12512
        L128:
            if (r8 == 0) goto L14b
            int r11 = r8.f8773
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L148
            int r10 = r10 + 1
            if (r10 != r9) goto L136
            r6 = r8
            goto L148
        L136:
            if (r7 != 0) goto L13f
            k21 r7 = new k21
            q01[] r11 = new p000.q01[r3]
            r7.<init>(r11)
        L13f:
            if (r6 == 0) goto L145
            r7.m3127(r6)
            r6 = r5
        L145:
            r7.m3127(r8)
        L148:
            q01 r8 = r8.f8776
            goto L128
        L14b:
            if (r10 != r9) goto L14f
            goto L51
        L14f:
            q01 r6 = p000.h62.m2387(r7)
            goto L51
        L155:
            q01 r4 = r4.f8776
            goto L42
        L159:
            p000.h62.m2386(r1, r0)
            goto L2f
        L15e:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.addView(r2, r0)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4) {
            r2 = this;
            r3.getClass()
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            if (r0 != 0) goto Ld
            android.view.ViewGroup$LayoutParams r0 = r2.generateDefaultLayoutParams()
        Ld:
            r1 = 1
            r2.addViewInLayout(r3, r4, r0, r1)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.generateDefaultLayoutParams()
            r0.width = r3
            r0.height = r4
            r3 = 1
            r4 = -1
            r1.addViewInLayout(r2, r4, r0, r3)
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            r0 = 1
            r1.addViewInLayout(r2, r3, r4, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r0 = -1
            r1 = 1
            r2.addViewInLayout(r3, r0, r4, r1)
            return
    }

    @Override // android.view.View
    public final void autofill(android.util.SparseArray r11) {
            r10 = this;
            r0 = 0
            k0 r1 = r10.f893
            if (r1 == 0) goto L73
            int r2 = r11.size()
            r3 = r0
        La:
            if (r3 >= r2) goto L73
            int r4 = r11.keyAt(r3)
            java.lang.Object r5 = r11.get(r4)
            android.view.autofill.AutofillValue r5 = (android.view.autofill.AutofillValue) r5
            es1 r6 = r1.f5682
            sm0 r6 = r6.f3664
            java.lang.Object r4 = r6.m5525(r4)
            yp0 r4 = (p000.yp0) r4
            if (r4 == 0) goto L70
            xr1 r4 = r4.m7007()
            if (r4 == 0) goto L70
            b21 r4 = r4.f12268
            is1 r6 = p000.wr1.f11817
            java.lang.Object r6 = r4.m695(r6)
            r7 = 0
            if (r6 != 0) goto L34
            r6 = r7
        L34:
            м r6 = (p000.C1114) r6
            if (r6 == 0) goto L51
            m80 r6 = r6.f13447
            a80 r6 = (p000.a80) r6
            if (r6 == 0) goto L51
            g4 r8 = new g4
            java.lang.CharSequence r9 = r5.getTextValue()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            java.lang.Object r6 = r6.invoke(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
        L51:
            is1 r6 = p000.wr1.f11818
            java.lang.Object r4 = r4.m695(r6)
            if (r4 != 0) goto L5a
            goto L5b
        L5a:
            r7 = r4
        L5b:
            м r7 = (p000.C1114) r7
            if (r7 == 0) goto L70
            m80 r4 = r7.f13447
            a80 r4 = (p000.a80) r4
            if (r4 == 0) goto L70
            g2 r6 = new g2
            r6.<init>(r5)
            java.lang.Object r4 = r4.invoke(r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L70:
            int r3 = r3 + 1
            goto La
        L73:
            i0 r10 = r10.f892
            if (r10 == 0) goto Ldf
            java.lang.Object r10 = r10.f4858
            y7 r10 = (p000.C1011y7) r10
            java.util.LinkedHashMap r1 = r10.f12476
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L84
            goto Ldf
        L84:
            int r1 = r11.size()
        L88:
            if (r0 >= r1) goto Ldf
            int r2 = r11.keyAt(r0)
            java.lang.Object r3 = r11.get(r2)
            android.view.autofill.AutofillValue r3 = (android.view.autofill.AutofillValue) r3
            boolean r4 = r3.isText()
            if (r4 == 0) goto Lb2
            java.lang.CharSequence r3 = r3.getTextValue()
            r3.toString()
            java.util.LinkedHashMap r3 = r10.f12476
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            if (r2 != 0) goto Lae
            goto Lc4
        Lae:
            p000.C1080.m7264()
            return
        Lb2:
            boolean r2 = r3.isDate()
            if (r2 != 0) goto Ld7
            boolean r2 = r3.isList()
            if (r2 != 0) goto Lcf
            boolean r2 = r3.isToggle()
            if (r2 != 0) goto Lc7
        Lc4:
            int r0 = r0 + 1
            goto L88
        Lc7:
            fq r10 = new fq
            java.lang.String r11 = "An operation is not implemented: b/138604541:  Add onFill() callback for toggle"
            r10.<init>(r11)
            throw r10
        Lcf:
            fq r10 = new fq
            java.lang.String r11 = "An operation is not implemented: b/138604541: Add onFill() callback for list"
            r10.<init>(r11)
            throw r10
        Ld7:
            fq r10 = new fq
            java.lang.String r11 = "An operation is not implemented: b/138604541: Add onFill() callback for date"
            r10.<init>(r11)
            throw r10
        Ldf:
            return
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int r3) {
            r2 = this;
            long r0 = r2.f901
            l1 r2 = r2.f880
            r3 = 0
            r2.m3451(r0, r3)
            return r3
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int r3) {
            r2 = this;
            r3 = 1
            long r0 = r2.f901
            l1 r2 = r2.f880
            r2.m3451(r0, r3)
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r7) {
            r6 = this;
            v11 r0 = r6.f885
            boolean r1 = r6.isAttachedToWindow()
            if (r1 != 0) goto Lf
            yp0 r1 = r6.getRoot()
            m370(r1)
        Lf:
            r1 = 1
            r6.m393(r1)
            tw1 r2 = p000.ax1.m628()
            r2.mo2007()
            r6.f887 = r1
            java.lang.String r1 = "AndroidOwner:draw"
            android.os.Trace.beginSection(r1)
            ge r1 = r6.f917     // Catch: java.lang.Throwable -> L9e
            l0 r2 = r1.f4335     // Catch: java.lang.Throwable -> L9e
            android.graphics.Canvas r3 = r2.f6337     // Catch: java.lang.Throwable -> L9e
            r2.f6337 = r7     // Catch: java.lang.Throwable -> L9e
            yp0 r4 = r6.getRoot()     // Catch: java.lang.Throwable -> L9e
            r5 = 0
            r4.m6997(r2, r5)     // Catch: java.lang.Throwable -> L9e
            l0 r1 = r1.f4335     // Catch: java.lang.Throwable -> L9e
            r1.f6337 = r3     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r0.m6023()     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            if (r1 == 0) goto L4d
            int r1 = r0.f11065     // Catch: java.lang.Throwable -> L9e
            r3 = r2
        L3f:
            if (r3 >= r1) goto L4d
            java.lang.Object r4 = r0.m6020(r3)     // Catch: java.lang.Throwable -> L9e
            w81 r4 = (p000.w81) r4     // Catch: java.lang.Throwable -> L9e
            r4.mo405()     // Catch: java.lang.Throwable -> L9e
            int r3 = r3 + 1
            goto L3f
        L4d:
            boolean r1 = androidx.compose.p001ui.platform.ViewLayer.f968     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L5f
            int r1 = r7.save()     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            r7.clipRect(r3, r3, r3, r3)     // Catch: java.lang.Throwable -> L9e
            super.dispatchDraw(r7)     // Catch: java.lang.Throwable -> L9e
            r7.restoreToCount(r1)     // Catch: java.lang.Throwable -> L9e
        L5f:
            r0.m6018()     // Catch: java.lang.Throwable -> L9e
            r6.f887 = r2     // Catch: java.lang.Throwable -> L9e
            android.os.Trace.endSection()
            v11 r1 = r6.f886
            if (r1 == 0) goto L71
            r0.m6016(r1)
            r1.m6018()
        L71:
            boolean r0 = m371()
            if (r0 == 0) goto L9d
            float r0 = r6.f958
            p000.AbstractC0499l4.m3482(r6, r0)
            android.view.View r0 = r6.f910
            if (r0 == 0) goto L97
            float r1 = r6.f959
            p000.AbstractC0499l4.m3482(r0, r1)
            float r1 = r6.f959
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L97
            r0.invalidate()
            long r1 = r6.getDrawingTime()
            r6.drawChild(r7, r0, r1)
        L97:
            r7 = 2143289344(0x7fc00000, float:NaN)
            r6.f958 = r7
            r6.f959 = r7
        L9d:
            return
        L9e:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r42) {
            r41 = this;
            r0 = r41
            r1 = r42
            boolean r2 = r0.f922
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L1c
            q0 r2 = r0.f921
            r0.removeCallbacks(r2)
            int r5 = r1.getActionMasked()
            if (r5 != r3) goto L19
            r0.f922 = r4
            goto L1c
        L19:
            r2.run()
        L1c:
            boolean r2 = m372(r1)
            if (r2 != 0) goto L5bd
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L2a
            goto L5bd
        L2a:
            int r2 = r1.getActionMasked()
            r5 = -1
            java.lang.String r6 = "visitAncestors called on an unattached node"
            r8 = 16
            r9 = 1
            if (r2 != r3) goto L25d
            r2 = 4194304(0x400000, float:5.877472E-39)
            boolean r2 = r1.isFromSource(r2)
            if (r2 == 0) goto L253
            android.content.Context r2 = r0.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            r3 = 26
            r1.getAxisValue(r3)
            r0.getContext()
            r2.getScaledVerticalScrollFactor()
            r0.getContext()
            r2.getScaledHorizontalScrollFactor()
            r1.getEventTime()
            r1.getDeviceId()
            v40 r2 = r0.getFocusOwner()
            y0 r3 = new y0
            r10 = 1
            r3.<init>(r0, r10, r1)
            y40 r2 = (p000.y40) r2
            s40 r0 = r2.f12448
            boolean r0 = r0.f9710
            if (r0 == 0) goto L77
            java.lang.String r0 = "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            return r4
        L77:
            c50 r0 = r2.f12447
            c50 r0 = p000.ln0.m3641(r0)
            if (r0 == 0) goto Lfc
            q01 r1 = r0.f8771
            boolean r1 = r1.f8784
            if (r1 != 0) goto L88
            p000.am0.m178(r6)
        L88:
            q01 r1 = r0.f8771
            yp0 r0 = p000.h62.m2445(r0)
        L8e:
            if (r0 == 0) goto Lf8
            k31 r2 = r0.f12733
            q01 r2 = r2.f5729
            int r2 = r2.f8774
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto Le9
        L9a:
            if (r1 == 0) goto Le9
            int r2 = r1.f8773
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto Le6
            r2 = r1
            r10 = 0
        La4:
            if (r2 == 0) goto Le6
            boolean r11 = r2 instanceof p000.C0855u0
            if (r11 == 0) goto Lab
            goto Lf9
        Lab:
            int r11 = r2.f8773
            r11 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto Le1
            boolean r11 = r2 instanceof p000.C1014ya
            if (r11 == 0) goto Le1
            r11 = r2
            ya r11 = (p000.C1014ya) r11
            q01 r11 = r11.f12512
            r12 = r4
        Lbb:
            if (r11 == 0) goto Lde
            int r13 = r11.f8773
            r13 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto Ldb
            int r12 = r12 + 1
            if (r12 != r9) goto Lc9
            r2 = r11
            goto Ldb
        Lc9:
            if (r10 != 0) goto Ld2
            k21 r10 = new k21
            q01[] r13 = new p000.q01[r8]
            r10.<init>(r13)
        Ld2:
            if (r2 == 0) goto Ld8
            r10.m3127(r2)
            r2 = 0
        Ld8:
            r10.m3127(r11)
        Ldb:
            q01 r11 = r11.f8776
            goto Lbb
        Lde:
            if (r12 != r9) goto Le1
            goto La4
        Le1:
            q01 r2 = p000.h62.m2387(r10)
            goto La4
        Le6:
            q01 r1 = r1.f8775
            goto L9a
        Le9:
            yp0 r0 = r0.m7005()
            if (r0 == 0) goto Lf6
            k31 r1 = r0.f12733
            if (r1 == 0) goto Lf6
            q22 r1 = r1.f5728
            goto L8e
        Lf6:
            r1 = 0
            goto L8e
        Lf8:
            r2 = 0
        Lf9:
            u0 r2 = (p000.C0855u0) r2
            goto Lfd
        Lfc:
            r2 = 0
        Lfd:
            if (r2 == 0) goto L25c
            q01 r0 = r2.f8771
            boolean r0 = r0.f8784
            if (r0 != 0) goto L108
            p000.am0.m178(r6)
        L108:
            q01 r0 = r2.f8771
            q01 r0 = r0.f8775
            yp0 r1 = p000.h62.m2445(r2)
            r6 = 0
        L111:
            if (r1 == 0) goto L189
            k31 r10 = r1.f12733
            q01 r10 = r10.f5729
            int r10 = r10.f8774
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L17a
        L11d:
            if (r0 == 0) goto L17a
            int r10 = r0.f8773
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L177
            r10 = r0
            r11 = 0
        L127:
            if (r10 == 0) goto L177
            boolean r12 = r10 instanceof p000.C0855u0
            if (r12 == 0) goto L139
            if (r6 != 0) goto L134
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L134:
            r6.add(r10)
            r12 = r4
            goto L13a
        L139:
            r12 = r9
        L13a:
            if (r12 == 0) goto L172
            int r12 = r10.f8773
            r12 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L172
            boolean r12 = r10 instanceof p000.C1014ya
            if (r12 == 0) goto L172
            r12 = r10
            ya r12 = (p000.C1014ya) r12
            q01 r12 = r12.f12512
            r13 = r4
        L14c:
            if (r12 == 0) goto L16f
            int r14 = r12.f8773
            r14 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L16c
            int r13 = r13 + 1
            if (r13 != r9) goto L15a
            r10 = r12
            goto L16c
        L15a:
            if (r11 != 0) goto L163
            k21 r11 = new k21
            q01[] r14 = new p000.q01[r8]
            r11.<init>(r14)
        L163:
            if (r10 == 0) goto L169
            r11.m3127(r10)
            r10 = 0
        L169:
            r11.m3127(r12)
        L16c:
            q01 r12 = r12.f8776
            goto L14c
        L16f:
            if (r13 != r9) goto L172
            goto L127
        L172:
            q01 r10 = p000.h62.m2387(r11)
            goto L127
        L177:
            q01 r0 = r0.f8775
            goto L11d
        L17a:
            yp0 r1 = r1.m7005()
            if (r1 == 0) goto L187
            k31 r0 = r1.f12733
            if (r0 == 0) goto L187
            q22 r0 = r0.f5728
            goto L111
        L187:
            r0 = 0
            goto L111
        L189:
            if (r6 == 0) goto L1a2
            int r0 = r6.size()
            int r0 = r0 + r5
            if (r0 < 0) goto L1a2
        L192:
            int r1 = r0 + (-1)
            java.lang.Object r0 = r6.get(r0)
            u0 r0 = (p000.C0855u0) r0
            r0.getClass()
            if (r1 >= 0) goto L1a0
            goto L1a2
        L1a0:
            r0 = r1
            goto L192
        L1a2:
            q01 r0 = r2.f8771
            r1 = 0
        L1a5:
            if (r0 == 0) goto L1e9
            boolean r5 = r0 instanceof p000.C0855u0
            if (r5 == 0) goto L1ae
            u0 r0 = (p000.C0855u0) r0
            goto L1e4
        L1ae:
            int r5 = r0.f8773
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L1e4
            boolean r5 = r0 instanceof p000.C1014ya
            if (r5 == 0) goto L1e4
            r5 = r0
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r10 = r4
        L1be:
            if (r5 == 0) goto L1e1
            int r11 = r5.f8773
            r11 = r11 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L1de
            int r10 = r10 + 1
            if (r10 != r9) goto L1cc
            r0 = r5
            goto L1de
        L1cc:
            if (r1 != 0) goto L1d5
            k21 r1 = new k21
            q01[] r11 = new p000.q01[r8]
            r1.<init>(r11)
        L1d5:
            if (r0 == 0) goto L1db
            r1.m3127(r0)
            r0 = 0
        L1db:
            r1.m3127(r5)
        L1de:
            q01 r5 = r5.f8776
            goto L1be
        L1e1:
            if (r10 != r9) goto L1e4
            goto L1a5
        L1e4:
            q01 r0 = p000.h62.m2387(r1)
            goto L1a5
        L1e9:
            java.lang.Object r0 = r3.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f7
            goto L25b
        L1f7:
            q01 r0 = r2.f8771
            r1 = 0
        L1fa:
            if (r0 == 0) goto L23e
            boolean r2 = r0 instanceof p000.C0855u0
            if (r2 == 0) goto L203
            u0 r0 = (p000.C0855u0) r0
            goto L239
        L203:
            int r2 = r0.f8773
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L239
            boolean r2 = r0 instanceof p000.C1014ya
            if (r2 == 0) goto L239
            r2 = r0
            ya r2 = (p000.C1014ya) r2
            q01 r2 = r2.f12512
            r3 = r4
        L213:
            if (r2 == 0) goto L236
            int r5 = r2.f8773
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L233
            int r3 = r3 + 1
            if (r3 != r9) goto L221
            r0 = r2
            goto L233
        L221:
            if (r1 != 0) goto L22a
            k21 r1 = new k21
            q01[] r5 = new p000.q01[r8]
            r1.<init>(r5)
        L22a:
            if (r0 == 0) goto L230
            r1.m3127(r0)
            r0 = 0
        L230:
            r1.m3127(r2)
        L233:
            q01 r2 = r2.f8776
            goto L213
        L236:
            if (r3 != r9) goto L239
            goto L1fa
        L239:
            q01 r0 = p000.h62.m2387(r1)
            goto L1fa
        L23e:
            if (r6 == 0) goto L25c
            int r0 = r6.size()
            r1 = r4
        L245:
            if (r1 >= r0) goto L25c
            java.lang.Object r2 = r6.get(r1)
            u0 r2 = (p000.C0855u0) r2
            r2.getClass()
            int r1 = r1 + 1
            goto L245
        L253:
            int r0 = r41.m388(r42)
            r0 = r0 & 4
            if (r0 == 0) goto L25c
        L25b:
            return r9
        L25c:
            return r4
        L25d:
            r2 = 2097152(0x200000, float:2.938736E-39)
            boolean r3 = r1.isFromSource(r2)
            if (r3 == 0) goto L5b8
            b11 r3 = r0.f888
            zv0 r10 = r3.f1413
            android.util.SparseLongArray r11 = r3.f1410
            int r12 = r1.getActionMasked()
            r3.m677(r1)
            r13 = 3
            r14 = 2
            if (r12 != r13) goto L283
            r11.clear()
            android.util.SparseBooleanArray r1 = r3.f1411
            r1.clear()
            r17 = r8
            r3 = 0
            goto L432
        L283:
            r3.m676(r1)
            r13 = 6
            if (r12 == r9) goto L291
            if (r12 == r13) goto L28c
            goto L292
        L28c:
            int r5 = r1.getActionIndex()
            goto L292
        L291:
            r5 = r4
        L292:
            r15 = 5
            if (r12 == 0) goto L29c
            if (r12 == r14) goto L29c
            if (r12 == r15) goto L29c
            r16 = r4
            goto L29e
        L29c:
            r16 = r9
        L29e:
            int r7 = r1.getPointerCount()
            r17 = r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r7)
            r13 = r4
        L2aa:
            if (r13 >= r7) goto L3c7
            int r15 = r1.getPointerId(r13)
            int r14 = r11.indexOfKey(r15)
            r18 = 1
            if (r14 < 0) goto L2c6
            long r14 = r11.valueAt(r14)
            r21 = r5
            r20 = r10
            r39 = r14
            r14 = r9
            r9 = r39
            goto L2d4
        L2c6:
            r14 = r9
            r20 = r10
            long r9 = r3.f1409
            r21 = r5
            long r4 = r9 + r18
            r3.f1409 = r4
            r11.put(r15, r9)
        L2d4:
            float r4 = r1.getX(r13)
            float r5 = r1.getY(r13)
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            r36 = r14
            long r14 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r22 = 32
            long r14 = r14 << r22
            r23 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r23
            long r27 = r14 | r4
            r5 = r21
            if (r13 == r5) goto L2fe
            r29 = r36
        L2fb:
            r4 = r20
            goto L301
        L2fe:
            r29 = 0
            goto L2fb
        L301:
            java.lang.Object r14 = r4.m7234(r9)
            a11 r14 = (p000.a11) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            r25 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r13 != r5) goto L319
            r4.m7237(r9)
        L312:
            r21 = r3
            r30 = r15
        L316:
            r2 = r22
            goto L34f
        L319:
            if (r16 == 0) goto L312
            long r30 = r1.getEventTime()
            long r30 = r30 & r25
            long r30 = r30 << r36
            long r30 = r18 | r30
            r21 = r3
            long r2 = r27 >> r22
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = (int) r2
            short r2 = (short) r2
            r32 = r2
            long r2 = r27 & r23
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r2 = (int) r2
            short r2 = (short) r2
            int r3 = r32 << 16
            r2 = r2 & r15
            r2 = r2 | r3
            long r2 = (long) r2
            long r2 = r2 << r22
            long r2 = r30 | r2
            r30 = r15
            a11 r15 = new a11
            r15.<init>(r2)
            r4.m7236(r9, r15)
            goto L316
        L34f:
            sl0 r22 = new sl0
            r31 = r25
            long r25 = r1.getEventTime()
            r3 = r30
            float r30 = r1.getPressure(r13)
            r15 = r2
            r33 = r3
            if (r14 == 0) goto L36b
            long r2 = r14.f44
            long r2 = r2 >> r36
            long r2 = r2 & r31
        L368:
            r31 = r2
            goto L370
        L36b:
            long r2 = r1.getEventTime()
            goto L368
        L370:
            if (r14 == 0) goto L397
            long r2 = r14.f44
            long r2 = r2 >>> r15
            int r2 = (int) r2
            int r3 = r2 >>> 16
            short r3 = (short) r3
            float r3 = (float) r3
            r2 = r2 & r33
            short r2 = (short) r2
            float r2 = (float) r2
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            r33 = r2
            long r2 = (long) r3
            r34 = r15
            int r15 = java.lang.Float.floatToRawIntBits(r33)
            r37 = r2
            long r2 = (long) r15
            long r33 = r37 << r34
            long r2 = r2 & r23
            long r2 = r33 | r2
            r33 = r2
            goto L399
        L397:
            r33 = r27
        L399:
            if (r14 == 0) goto L3ae
            long r2 = r14.f44
            long r2 = r2 & r18
            r14 = 0
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L3a8
            r14 = r36
            goto L3a9
        L3a8:
            r14 = 0
        L3a9:
            r35 = r14
        L3ab:
            r23 = r9
            goto L3b1
        L3ae:
            r35 = 0
            goto L3ab
        L3b1:
            r22.<init>(r23, r25, r27, r29, r30, r31, r33, r35)
            r2 = r22
            r8.add(r2)
            int r13 = r13 + 1
            r10 = r4
            r3 = r21
            r9 = r36
            r2 = 2097152(0x200000, float:2.938736E-39)
            r4 = 0
            r14 = 2
            r15 = 5
            goto L2aa
        L3c7:
            r2 = r3
            r36 = r9
            r2.m680(r1)
            r2 = 2097152(0x200000, float:2.938736E-39)
            boolean r3 = r1.isFromSource(r2)
            if (r3 == 0) goto L5b1
            android.view.InputDevice r2 = r1.getDevice()
            if (r2 == 0) goto L420
            r3 = 0
            android.view.InputDevice$MotionRange r4 = r2.getMotionRange(r3)
            r14 = r36
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r14)
            if (r4 == 0) goto L3ec
            if (r2 != 0) goto L3ec
        L3ea:
            r2 = 1
            goto L421
        L3ec:
            if (r2 == 0) goto L3f2
            if (r4 != 0) goto L3f2
        L3f0:
            r2 = 2
            goto L421
        L3f2:
            if (r4 == 0) goto L420
            if (r2 == 0) goto L420
            float r3 = r4.getRange()
            float r2 = r2.getRange()
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r5 = 1084227584(0x40a00000, float:5.0)
            r7 = 0
            if (r4 <= 0) goto L411
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L40a
            goto L410
        L40a:
            float r4 = r3 / r2
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L411
        L410:
            goto L3ea
        L411:
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 <= 0) goto L420
            int r4 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r4 != 0) goto L41a
            goto L41f
        L41a:
            float r2 = r2 / r3
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L420
        L41f:
            goto L3f0
        L420:
            r2 = 0
        L421:
            n2 r3 = new n2
            if (r12 == 0) goto L42f
            r14 = 1
            if (r12 == r14) goto L42f
            r4 = 2
            if (r12 == r4) goto L42f
            r4 = 5
            if (r12 == r4) goto L42f
            r4 = 6
        L42f:
            r3.<init>(r8, r2, r1)
        L432:
            ul0 r1 = r0.f923
            if (r3 == 0) goto L510
            v40 r0 = r0.getFocusOwner()
            y40 r0 = (p000.y40) r0
            s40 r2 = r0.f12448
            boolean r2 = r2.f9710
            if (r2 == 0) goto L44b
            java.lang.String r0 = "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated."
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
            goto L4f0
        L44b:
            c50 r0 = r0.m6827()
            if (r0 == 0) goto L4d9
            q01 r2 = r0.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto L45a
            p000.am0.m178(r6)
        L45a:
            q01 r2 = r0.f8771
            yp0 r0 = p000.h62.m2445(r0)
        L460:
            if (r0 == 0) goto L4d9
            k31 r4 = r0.f12733
            q01 r4 = r4.f5729
            int r4 = r4.f8774
            r20 = 2097152(0x200000, float:2.938736E-39)
            r4 = r4 & r20
            if (r4 == 0) goto L4c8
        L46e:
            if (r2 == 0) goto L4c8
            int r4 = r2.f8773
            r4 = r4 & r20
            if (r4 == 0) goto L4c1
            r4 = r2
            r5 = 0
        L478:
            if (r4 == 0) goto L4c1
            int r6 = r4.f8773
            r6 = r6 & r20
            if (r6 == 0) goto L4bc
            boolean r6 = r4 instanceof p000.C1014ya
            if (r6 == 0) goto L4bc
            r6 = r4
            ya r6 = (p000.C1014ya) r6
            q01 r6 = r6.f12512
            r7 = 0
        L48a:
            if (r6 == 0) goto L4b4
            int r8 = r6.f8773
            r8 = r8 & r20
            if (r8 == 0) goto L4ad
            int r7 = r7 + 1
            r14 = 1
            if (r7 != r14) goto L499
            r4 = r6
            goto L4ad
        L499:
            if (r5 != 0) goto L4a4
            k21 r5 = new k21
            r8 = r17
            q01[] r9 = new p000.q01[r8]
            r5.<init>(r9)
        L4a4:
            if (r4 == 0) goto L4aa
            r5.m3127(r4)
            r4 = 0
        L4aa:
            r5.m3127(r6)
        L4ad:
            q01 r6 = r6.f8776
            r17 = 16
            r20 = 2097152(0x200000, float:2.938736E-39)
            goto L48a
        L4b4:
            r14 = 1
            if (r7 != r14) goto L4bc
        L4b7:
            r17 = 16
            r20 = 2097152(0x200000, float:2.938736E-39)
            goto L478
        L4bc:
            q01 r4 = p000.h62.m2387(r5)
            goto L4b7
        L4c1:
            q01 r2 = r2.f8775
            r17 = 16
            r20 = 2097152(0x200000, float:2.938736E-39)
            goto L46e
        L4c8:
            yp0 r0 = r0.m7005()
            if (r0 == 0) goto L4d5
            k31 r2 = r0.f12733
            if (r2 == 0) goto L4d5
            q22 r2 = r2.f5728
            goto L4d6
        L4d5:
            r2 = 0
        L4d6:
            r17 = 16
            goto L460
        L4d9:
            java.lang.Object r0 = r3.f7359
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r4 = 0
        L4e2:
            if (r4 >= r2) goto L4f0
            java.lang.Object r5 = r0.get(r4)
            sl0 r5 = (p000.sl0) r5
            r5.getClass()
            int r4 = r4 + 1
            goto L4e2
        L4f0:
            r1.getClass()
            java.lang.Object r0 = r3.f7360
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            int r2 = r0.getAction()
            if (r2 == 0) goto L502
            r14 = 1
            if (r2 == r14) goto L509
            r4 = 2
            goto L509
        L502:
            int r2 = r3.f7358
            r1.f10908 = r2
            r3 = 0
            r1.f10909 = r3
        L509:
            android.view.GestureDetector r1 = r1.f10910
            r1.onTouchEvent(r0)
            r14 = 1
            return r14
        L510:
            v40 r0 = r0.getFocusOwner()
            y40 r0 = (p000.y40) r0
            c50 r0 = r0.m6827()
            if (r0 == 0) goto L5aa
            q01 r2 = r0.f8771
            boolean r2 = r2.f8784
            if (r2 != 0) goto L525
            p000.am0.m178(r6)
        L525:
            q01 r2 = r0.f8771
            yp0 r0 = p000.h62.m2445(r0)
        L52b:
            if (r0 == 0) goto L5aa
            k31 r3 = r0.f12733
            q01 r3 = r3.f5729
            int r3 = r3.f8774
            r20 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r20
            if (r3 == 0) goto L599
        L539:
            if (r2 == 0) goto L599
            int r3 = r2.f8773
            r3 = r3 & r20
            if (r3 == 0) goto L594
            r3 = r2
            r4 = 0
        L543:
            if (r3 == 0) goto L594
            int r5 = r3.f8773
            r5 = r5 & r20
            if (r5 == 0) goto L58d
            boolean r5 = r3 instanceof p000.C1014ya
            if (r5 == 0) goto L58d
            r5 = r3
            ya r5 = (p000.C1014ya) r5
            q01 r5 = r5.f12512
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = 0
        L558:
            if (r6 == 0) goto L583
            int r7 = r6.f8773
            r7 = r7 & r20
            if (r7 == 0) goto L566
            int r3 = r3 + 1
            r14 = 1
            if (r3 != r14) goto L569
            r4 = r6
        L566:
            r8 = 16
            goto L580
        L569:
            if (r5 != 0) goto L575
            k21 r5 = new k21
            r8 = 16
            q01[] r7 = new p000.q01[r8]
            r5.<init>(r7)
            goto L577
        L575:
            r8 = 16
        L577:
            if (r4 == 0) goto L57d
            r5.m3127(r4)
            r4 = 0
        L57d:
            r5.m3127(r6)
        L580:
            q01 r6 = r6.f8776
            goto L558
        L583:
            r8 = 16
            r14 = 1
            if (r3 != r14) goto L58b
            r3 = r4
            r4 = r5
            goto L543
        L58b:
            r4 = r5
            goto L58f
        L58d:
            r8 = 16
        L58f:
            q01 r3 = p000.h62.m2387(r4)
            goto L543
        L594:
            r8 = 16
            q01 r2 = r2.f8775
            goto L539
        L599:
            r8 = 16
            yp0 r0 = r0.m7005()
            if (r0 == 0) goto L5a8
            k31 r2 = r0.f12733
            if (r2 == 0) goto L5a8
            q22 r2 = r2.f5728
            goto L52b
        L5a8:
            r2 = 0
            goto L52b
        L5aa:
            r3 = 0
            r1.f10908 = r3
            r14 = 1
            r1.f10909 = r14
            return r14
        L5b1:
            java.lang.String r0 = "MotionEvent must be a touch navigation source"
            p000.C1080.m7275(r0)
            r0 = 0
            return r0
        L5b8:
            boolean r0 = super.dispatchGenericMotionEvent(r42)
            return r0
        L5bd:
            boolean r0 = super.dispatchGenericMotionEvent(r42)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r0.f922
            q0 r3 = r0.f921
            if (r2 == 0) goto L10
            r0.removeCallbacks(r3)
            r3.run()
        L10:
            boolean r2 = m372(r1)
            r4 = 0
            if (r2 != 0) goto L15d
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L1f
            goto L15d
        L1f:
            l1 r2 = r0.f880
            androidx.compose.ui.platform.AndroidComposeView r5 = r2.f6358
            android.view.accessibility.AccessibilityManager r6 = r2.f6361
            boolean r7 = r6.isEnabled()
            r8 = 10
            r9 = 7
            r10 = 1
            if (r7 == 0) goto L119
            boolean r6 = r6.isTouchExplorationEnabled()
            if (r6 == 0) goto L119
            int r6 = r1.getAction()
            r7 = 256(0x100, float:3.59E-43)
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r13 = 12
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r9) goto L67
            r15 = 9
            if (r6 == r15) goto L67
            if (r6 == r8) goto L4c
            goto L119
        L4c:
            int r6 = r2.f6359
            if (r6 == r14) goto L5e
            if (r6 != r14) goto L54
            goto L119
        L54:
            r2.f6359 = r14
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r14, r11, r12, r13)
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r6, r7, r12, r13)
            goto L119
        L5e:
            androidx.compose.ui.platform.AndroidViewsHandler r2 = r5.getAndroidViewsHandler$ui()
            r2.dispatchGenericMotionEvent(r1)
            goto L119
        L67:
            float r6 = r1.getX()
            float r15 = r1.getY()
            r5.m393(r10)
            ne0 r20 = new ne0
            r20.<init>()
            yp0 r14 = r5.getRoot()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r8 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r15)
            r16 = r8
            long r7 = (long) r6
            r6 = 32
            long r16 = r16 << r6
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r7 & r18
            long r6 = r16 | r6
            k31 r8 = r14.f12733
            q31 r9 = r8.f5727
            io1 r14 = p000.q31.f8818
            long r18 = r9.m4736(r6)
            q31 r6 = r8.f5727
            rk0 r17 = p000.q31.f8821
            r21 = 1
            r22 = 1
            r16 = r6
            r16.m4742(r17, r18, r20, r21, r22)
            r6 = r20
            v11 r6 = r6.f7580
            int r7 = r6.f11065
            int r7 = r7 - r10
        Lb2:
            r8 = -1
            if (r8 >= r7) goto Ld2
            java.lang.Object r8 = r6.m6020(r7)
            r8.getClass()
            q01 r8 = (p000.q01) r8
            yp0 r8 = p000.h62.m2445(r8)
            androidx.compose.ui.platform.AndroidViewsHandler r9 = r5.getAndroidViewsHandler$ui()
            java.util.HashMap r9 = r9.getLayoutNodeToHolder()
            java.lang.Object r9 = r9.get(r8)
            androidx.compose.ui.viewinterop.AndroidViewHolder r9 = (androidx.compose.p001ui.viewinterop.AndroidViewHolder) r9
            if (r9 == 0) goto Ld5
        Ld2:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L103
        Ld5:
            k31 r9 = r8.f12733
            r14 = 8
            boolean r9 = r9.m3144(r14)
            if (r9 != 0) goto Le0
            goto Lff
        Le0:
            int r9 = r8.f12744
            int r9 = r2.m3461(r9)
            bs1 r8 = p000.p91.m4416(r8, r4)
            boolean r14 = p000.h62.m2432(r8)
            if (r14 != 0) goto Lf1
            goto Lff
        Lf1:
            xr1 r8 = r8.m1015()
            is1 r14 = p000.fs1.f4084
            b21 r8 = r8.f12268
            boolean r8 = r8.m691(r14)
            if (r8 == 0) goto L102
        Lff:
            int r7 = r7 + (-1)
            goto Lb2
        L102:
            r14 = r9
        L103:
            androidx.compose.ui.platform.AndroidViewsHandler r5 = r5.getAndroidViewsHandler$ui()
            r5.dispatchGenericMotionEvent(r1)
            int r5 = r2.f6359
            if (r5 != r14) goto L10f
            goto L119
        L10f:
            r2.f6359 = r14
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r14, r11, r12, r13)
            r15 = 256(0x100, float:3.59E-43)
            p000.ViewOnAttachStateChangeListenerC0496l1.m3434(r2, r5, r15, r12, r13)
        L119:
            int r2 = r1.getActionMasked()
            r5 = 7
            if (r2 == r5) goto L14e
            r5 = 10
            if (r2 == r5) goto L125
            goto L155
        L125:
            boolean r2 = r23.m390(r24)
            if (r2 == 0) goto L155
            int r2 = r1.getToolType(r4)
            r5 = 3
            if (r2 != r5) goto L139
            int r2 = r1.getButtonState()
            if (r2 == 0) goto L139
            goto L15d
        L139:
            android.view.MotionEvent r2 = r0.f954
            if (r2 == 0) goto L140
            r2.recycle()
        L140:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r1)
            r0.f954 = r1
            r0.f922 = r10
            r1 = 8
            r0.postDelayed(r3, r1)
            return r4
        L14e:
            boolean r2 = r23.m391(r24)
            if (r2 != 0) goto L155
            goto L15d
        L155:
            int r0 = r23.m388(r24)
            r0 = r0 & r10
            if (r0 == 0) goto L15d
            return r10
        L15d:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            boolean r0 = r3.isFocused()
            if (r0 == 0) goto L36
            pn r0 = r3.getComposeViewContext()
            lm0 r0 = r0.f8614
            int r1 = r4.getMetaState()
            r0.getClass()
            x91 r0 = p000.vb2.f11225
            fi1 r2 = new fi1
            r2.<init>(r1)
            r0.setValue(r2)
            v40 r0 = r3.getFocusOwner()
            u40 r1 = p000.u40.f10589
            y40 r0 = (p000.y40) r0
            boolean r0 = r0.m6825(r4, r1)
            if (r0 != 0) goto L34
            boolean r3 = super.dispatchKeyEvent(r4)
            if (r3 == 0) goto L32
            goto L34
        L32:
            r3 = 0
            return r3
        L34:
            r3 = 1
            return r3
        L36:
            v40 r0 = r3.getFocusOwner()
            y0 r1 = new y0
            r2 = 0
            r1.<init>(r3, r2, r4)
            y40 r0 = (p000.y40) r0
            boolean r3 = r0.m6825(r4, r1)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent r12) {
            r11 = this;
            boolean r0 = r11.isFocused()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9c
            v40 r0 = r11.getFocusOwner()
            y40 r0 = (p000.y40) r0
            s40 r3 = r0.f12448
            boolean r3 = r3.f9710
            if (r3 == 0) goto L1d
            java.lang.String r0 = "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r0)
            goto L9c
        L1d:
            c50 r0 = r0.f12447
            c50 r0 = p000.ln0.m3641(r0)
            if (r0 == 0) goto L9c
            q01 r3 = r0.f8771
            boolean r3 = r3.f8784
            if (r3 != 0) goto L30
            java.lang.String r3 = "visitAncestors called on an unattached node"
            p000.am0.m178(r3)
        L30:
            q01 r3 = r0.f8771
            yp0 r0 = p000.h62.m2445(r0)
        L36:
            if (r0 == 0) goto L9c
            k31 r4 = r0.f12733
            q01 r4 = r4.f5729
            int r4 = r4.f8774
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            r6 = 0
            if (r4 == 0) goto L8d
        L44:
            if (r3 == 0) goto L8d
            int r4 = r3.f8773
            r4 = r4 & r5
            if (r4 == 0) goto L8a
            r4 = r3
            r7 = r6
        L4d:
            if (r4 == 0) goto L8a
            int r8 = r4.f8773
            r8 = r8 & r5
            if (r8 == 0) goto L85
            boolean r8 = r4 instanceof p000.C1014ya
            if (r8 == 0) goto L85
            r8 = r4
            ya r8 = (p000.C1014ya) r8
            q01 r8 = r8.f12512
            r9 = r1
        L5e:
            if (r8 == 0) goto L82
            int r10 = r8.f8773
            r10 = r10 & r5
            if (r10 == 0) goto L7f
            int r9 = r9 + 1
            if (r9 != r2) goto L6b
            r4 = r8
            goto L7f
        L6b:
            if (r7 != 0) goto L76
            k21 r7 = new k21
            r10 = 16
            q01[] r10 = new p000.q01[r10]
            r7.<init>(r10)
        L76:
            if (r4 == 0) goto L7c
            r7.m3127(r4)
            r4 = r6
        L7c:
            r7.m3127(r8)
        L7f:
            q01 r8 = r8.f8776
            goto L5e
        L82:
            if (r9 != r2) goto L85
            goto L4d
        L85:
            q01 r4 = p000.h62.m2387(r7)
            goto L4d
        L8a:
            q01 r3 = r3.f8775
            goto L44
        L8d:
            yp0 r0 = r0.m7005()
            if (r0 == 0) goto L9a
            k31 r3 = r0.f12733
            if (r3 == 0) goto L9a
            q22 r3 = r3.f5728
            goto L36
        L9a:
            r3 = r6
            goto L36
        L9c:
            boolean r11 = super.dispatchKeyEventPreIme(r12)
            if (r11 == 0) goto La3
            return r2
        La3:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
            r10 = this;
            boolean r0 = r10.f922
            r1 = 0
            if (r0 == 0) goto L30
            q0 r0 = r10.f921
            r10.removeCallbacks(r0)
            android.view.MotionEvent r2 = r10.f954
            r2.getClass()
            int r3 = r11.getActionMasked()
            if (r3 != 0) goto L2d
            int r3 = r2.getSource()
            int r4 = r11.getSource()
            if (r3 != r4) goto L2d
            int r2 = r2.getToolType(r1)
            int r3 = r11.getToolType(r1)
            if (r2 == r3) goto L2a
            goto L2d
        L2a:
            r10.f922 = r1
            goto L30
        L2d:
            r0.run()
        L30:
            boolean r0 = m372(r11)
            if (r0 != 0) goto L128
            boolean r0 = r10.isAttachedToWindow()
            if (r0 != 0) goto L3e
            goto L128
        L3e:
            int r0 = r11.getActionMasked()
            r2 = 2
            if (r0 != r2) goto L4d
            boolean r0 = r10.m391(r11)
            if (r0 != 0) goto L4d
            goto L128
        L4d:
            int r0 = r10.m388(r11)
            r2 = r0 & 2
            r3 = 1
            if (r2 == 0) goto L5d
            android.view.ViewParent r2 = r10.getParent()
            r2.requestDisallowInterceptTouchEvent(r3)
        L5d:
            int r2 = r11.getActionMasked()
            if (r2 == 0) goto L6d
            int r2 = r11.getActionMasked()
            r4 = 5
            if (r2 != r4) goto L6b
            goto L6d
        L6b:
            r2 = r1
            goto L6e
        L6d:
            r2 = r3
        L6e:
            r4 = 8194(0x2002, float:1.1482E-41)
            boolean r4 = r11.isFromSource(r4)
            if (r4 != 0) goto L82
            r4 = 1048584(0x100008, float:1.469379E-39)
            boolean r4 = r11.isFromSource(r4)
            if (r4 == 0) goto L80
            goto L82
        L80:
            r4 = r1
            goto L83
        L82:
            r4 = r3
        L83:
            if (r2 == 0) goto L123
            if (r4 == 0) goto L123
            android.view.ViewParent r2 = r10.getParent()
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L92
            android.view.View r2 = (android.view.View) r2
            goto L93
        L92:
            r2 = 0
        L93:
            if (r2 == 0) goto L9e
            r4 = 2131296324(0x7f090044, float:1.8210561E38)
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 != 0) goto La3
        L9e:
            l7 r2 = new l7
            r2.<init>(r3)
        La3:
            l7 r4 = new l7
            r4.<init>(r3)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L123
            v40 r2 = r10.getFocusOwner()
            y40 r2 = (p000.y40) r2
            c50 r2 = r2.m6827()
            if (r2 == 0) goto L123
            q31 r2 = p000.h62.m2444(r2)
            mp0 r4 = p000.AbstractC0782s1.m5332(r2)
            ml1 r2 = r4.mo2337(r2, r3)
            float r4 = r11.getX()
            float r11 = r11.getY()
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r11
            r11 = 32
            long r4 = r4 << r11
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            long r4 = r4 | r6
            long r6 = r4 >> r11
            int r11 = (int) r6
            float r11 = java.lang.Float.intBitsToFloat(r11)
            long r4 = r4 & r8
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r5 = r2.f7200
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 < 0) goto Lf7
            r5 = r3
            goto Lf8
        Lf7:
            r5 = r1
        Lf8:
            float r6 = r2.f7202
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 >= 0) goto L100
            r11 = r3
            goto L101
        L100:
            r11 = r1
        L101:
            r11 = r11 & r5
            float r5 = r2.f7201
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto L10a
            r5 = r3
            goto L10b
        L10a:
            r5 = r1
        L10b:
            r11 = r11 & r5
            float r2 = r2.f7203
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L114
            r2 = r3
            goto L115
        L114:
            r2 = r1
        L115:
            r11 = r11 & r2
            if (r11 != 0) goto L123
            v40 r10 = r10.getFocusOwner()
            y40 r10 = (p000.y40) r10
            r11 = 8
            r10.m6823(r11, r1, r3)
        L123:
            r10 = r0 & 1
            if (r10 == 0) goto L128
            return r3
        L128:
            return r1
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int r8) {
            r7 = this;
            r0 = 0
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "findViewByAccessibilityIdTraversal"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L27
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L27
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.NoSuchMethodException -> L27
            r2[r6] = r8     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Object r7 = r1.invoke(r7, r2)     // Catch: java.lang.NoSuchMethodException -> L27
            boolean r8 = r7 instanceof android.view.View     // Catch: java.lang.NoSuchMethodException -> L27
            if (r8 == 0) goto L27
            android.view.View r7 = (android.view.View) r7     // Catch: java.lang.NoSuchMethodException -> L27
            return r7
        L27:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View r8, int r9) {
            r7 = this;
            if (r8 == 0) goto L9d
            mx0 r0 = r7.f932
            boolean r0 = r0.f7312
            if (r0 == 0) goto La
            goto L9d
        La:
            android.view.View r0 = r7.getRootView()
            r0.getClass()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r1.findNextFocus(r0, r8, r9)
            r1 = 0
            if (r0 == 0) goto L33
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L25
            goto L33
        L25:
            android.view.ViewParent r2 = r0.getParent()
        L29:
            if (r2 == 0) goto L33
            if (r2 != r7) goto L2e
            goto L34
        L2e:
            android.view.ViewParent r2 = r2.getParent()
            goto L29
        L33:
            r0 = r1
        L34:
            if (r8 != r7) goto L4f
            v40 r2 = r7.getFocusOwner()
            y40 r2 = (p000.y40) r2
            c50 r2 = r2.f12447
            c50 r2 = p000.ln0.m3641(r2)
            if (r2 == 0) goto L48
            ml1 r1 = p000.ln0.m3597(r2)
        L48:
            if (r1 != 0) goto L53
            ml1 r1 = p000.r40.m5061(r8, r7)
            goto L53
        L4f:
            ml1 r1 = p000.r40.m5061(r8, r7)
        L53:
            q40 r2 = p000.r40.m5062(r9)
            if (r2 == 0) goto L5c
            int r2 = r2.f8856
            goto L5d
        L5c:
            r2 = 6
        L5d:
            um1 r3 = new um1
            r3.<init>()
            v40 r4 = r7.getFocusOwner()
            b0 r5 = new b0
            r6 = 3
            r5.<init>(r6, r3)
            y40 r4 = (p000.y40) r4
            java.lang.Boolean r4 = r4.m6826(r2, r1, r5)
            if (r4 != 0) goto L75
            return r8
        L75:
            java.lang.Object r3 = r3.f10912
            if (r3 != 0) goto L80
            if (r0 != 0) goto L9c
            android.view.View r7 = super.focusSearch(r8, r9)
            return r7
        L80:
            if (r0 != 0) goto L83
            goto L9b
        L83:
            r8 = 1
            if (r2 != r8) goto L87
            goto L9b
        L87:
            r8 = 2
            if (r2 != r8) goto L8b
            goto L9b
        L8b:
            c50 r3 = (p000.c50) r3
            ml1 r8 = p000.ln0.m3597(r3)
            ml1 r9 = p000.r40.m5061(r0, r7)
            boolean r8 = p000.j81.m2878(r8, r9, r1, r2)
            if (r8 == 0) goto L9c
        L9b:
            return r7
        L9c:
            return r0
        L9d:
            android.view.View r7 = super.focusSearch(r8, r9)
            return r7
    }

    public p000.C0342h0 getAccessibilityManager() {
            r0 = this;
            h0 r0 = r0.f882
            return r0
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: collision with other method in class */
    public /* bridge */ p000.InterfaceC1122 m7369getAccessibilityManager() {
            r0 = this;
            h0 r0 = r0.getAccessibilityManager()
            return r0
    }

    public final androidx.compose.p001ui.platform.AndroidViewsHandler getAndroidViewsHandler$ui() {
            r2 = this;
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r2.f898
            if (r0 != 0) goto L16
            androidx.compose.ui.platform.AndroidViewsHandler r0 = new androidx.compose.ui.platform.AndroidViewsHandler
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f898 = r0
            r1 = -1
            r2.addView(r0, r1)
            r2.requestLayout()
        L16:
            androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.f898
            r2.getClass()
            return r2
    }

    public p000.InterfaceC0899v7 getAutofill() {
            r0 = this;
            i0 r0 = r0.f892
            return r0
    }

    public p000.AbstractC0974x7 getAutofillManager() {
            r0 = this;
            k0 r0 = r0.f893
            return r0
    }

    public p000.C1011y7 getAutofillTree() {
            r0 = this;
            y7 r0 = r0.f884
            return r0
    }

    public p000.C0606o0 getClipboard() {
            r0 = this;
            o0 r0 = r0.f896
            return r0
    }

    /* JADX INFO: renamed from: getClipboard, reason: collision with other method in class */
    public /* bridge */ p000.InterfaceC0761rh m7370getClipboard() {
            r0 = this;
            o0 r0 = r0.getClipboard()
            return r0
    }

    public p000.C0670p0 getClipboardManager() {
            r0 = this;
            p0 r0 = r0.f895
            return r0
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: collision with other method in class */
    public /* bridge */ p000.InterfaceC0798sh m7371getClipboardManager() {
            r0 = this;
            p0 r0 = r0.getClipboardManager()
            return r0
    }

    public final p000.C0693pn getComposeViewContext() {
            r0 = this;
            pn r0 = r0.get_composeViewContext()
            return r0
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
            r0 = this;
            boolean r0 = r0.f927
            return r0
    }

    public final android.content.res.Configuration getConfiguration() {
            r0 = this;
            x91 r0 = r0.f890
            java.lang.Object r0 = r0.getValue()
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            return r0
    }

    public final p000.ViewOnAttachStateChangeListenerC1042z1 getContentCaptureManager$ui() {
            r0 = this;
            z1 r0 = r0.f881
            return r0
    }

    public p000.InterfaceC0880up getCoroutineContext() {
            r0 = this;
            up r0 = r0.f912
            return r0
    }

    public p000.InterfaceC1031yr getDensity() {
            r0 = this;
            x91 r0 = r0.f909
            java.lang.Object r0 = r0.getValue()
            yr r0 = (p000.InterfaceC1031yr) r0
            return r0
    }

    public p000.ViewOnDragListenerC0233e2 getDragAndDropManager() {
            r0 = this;
            e2 r0 = r0.f913
            return r0
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: collision with other method in class */
    public /* bridge */ p000.InterfaceC0489kv m7372getDragAndDropManager() {
            r0 = this;
            e2 r0 = r0.getDragAndDropManager()
            return r0
    }

    public p000.ml1 getEmbeddedViewFocusRect() {
            r2 = this;
            boolean r0 = r2.isFocused()
            r1 = 0
            if (r0 == 0) goto L1b
            v40 r2 = r2.getFocusOwner()
            y40 r2 = (p000.y40) r2
            c50 r2 = r2.f12447
            c50 r2 = p000.ln0.m3641(r2)
            if (r2 == 0) goto L1a
            ml1 r2 = p000.ln0.m3597(r2)
            return r2
        L1a:
            return r1
        L1b:
            android.view.View r0 = r2.findFocus()
            if (r0 == 0) goto L26
            ml1 r2 = p000.r40.m5061(r0, r2)
            return r2
        L26:
            return r1
    }

    public p000.v40 getFocusOwner() {
            r0 = this;
            y40 r0 = r0.f911
            return r0
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect r5) {
            r4 = this;
            ml1 r0 = r4.getEmbeddedViewFocusRect()
            if (r0 == 0) goto L27
            float r4 = r0.f7200
            int r4 = java.lang.Math.round(r4)
            r5.left = r4
            float r4 = r0.f7201
            int r4 = java.lang.Math.round(r4)
            r5.top = r4
            float r4 = r0.f7202
            int r4 = java.lang.Math.round(r4)
            r5.right = r4
            float r4 = r0.f7203
            int r4 = java.lang.Math.round(r4)
            r5.bottom = r4
            return
        L27:
            v40 r0 = r4.getFocusOwner()
            a1 r1 = p000.C0002a1.f22
            y40 r0 = (p000.y40) r0
            r2 = 6
            r3 = 0
            java.lang.Boolean r0 = r0.m6826(r2, r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L43
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.set(r4, r4, r4, r4)
            return
        L43:
            super.getFocusedRect(r5)
            return
    }

    public p000.f50 getFontFamilyResolver() {
            r0 = this;
            g21 r0 = r0.f948
            java.lang.Object r0 = r0.getValue()
            f50 r0 = (p000.f50) r0
            return r0
    }

    public p000.e50 getFontLoader() {
            r0 = this;
            e50 r0 = r0.f947
            return r0
    }

    public final p000.kr0 getFrameEndScheduler$ui() {
            r0 = this;
            kr0 r0 = r0.f904
            return r0
    }

    public p000.ua0 getGraphicsContext() {
            r0 = this;
            l2 r0 = r0.f883
            return r0
    }

    public p000.rc0 getHapticFeedBack() {
            r0 = this;
            rc0 r0 = r0.f950
            return r0
    }

    public boolean getHasPendingMeasureOrLayout() {
            r1 = this;
            mx0 r0 = r1.f932
            m6 r0 = r0.f7311
            boolean r0 = r0.m3762()
            if (r0 != 0) goto L15
            w6 r1 = r1.f907
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
            r0 = this;
            r0 = 1
            return r0
    }

    public p000.km0 getInputModeManager() {
            r0 = this;
            lm0 r0 = r0.f951
            return r0
    }

    public final p000.om0 getInsetsListener() {
            r0 = this;
            om0 r0 = r0.f919
            return r0
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
            r2 = this;
            long r0 = r2.f937
            return r0
    }

    @Override // android.view.View, android.view.ViewParent
    public p000.np0 getLayoutDirection() {
            r0 = this;
            x91 r0 = r0.f949
            java.lang.Object r0 = r0.getValue()
            np0 r0 = (p000.np0) r0
            return r0
    }

    public p000.n11 getLayoutNodes() {
            r0 = this;
            n11 r0 = r0.f877
            return r0
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ p000.sm0 m7373getLayoutNodes() {
            r0 = this;
            n11 r0 = r0.getLayoutNodes()
            return r0
    }

    public p000.av0 getLocaleList() {
            r0 = this;
            fs r0 = r0.f891
            java.lang.Object r0 = r0.getValue()
            av0 r0 = (p000.av0) r0
            return r0
    }

    public long getMeasureIteration() {
            r2 = this;
            mx0 r2 = r2.f932
            boolean r0 = r2.f7312
            if (r0 != 0) goto Lb
            java.lang.String r0 = "measureIteration should be only used during the measure/layout pass"
            p000.am0.m177(r0)
        Lb:
            long r0 = r2.f7316
            return r0
    }

    public p000.s01 getModifierLocalManager() {
            r0 = this;
            s01 r0 = r0.f952
            return r0
    }

    public androidx.compose.p001ui.platform.AndroidComposeView getOutOfFrameExecutor() {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: collision with other method in class */
    public /* bridge */ p000.q81 m7374getOutOfFrameExecutor() {
            r0 = this;
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.getOutOfFrameExecutor()
            return r0
    }

    public p000.bh1 getPlacementScope() {
            r2 = this;
            int r0 = p000.dh1.f3164
            ew0 r0 = new ew0
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    public p000.zh1 getPointerIconService() {
            r0 = this;
            xn0 r0 = r0.f930
            return r0
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final p000.rl0 m7367getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
            r0 = this;
            r0 = 0
            return r0
    }

    public p000.ol1 getRectManager() {
            r0 = this;
            ol1 r0 = r0.f878
            return r0
    }

    public p000.go1 getRetainedValuesStore() {
            r0 = this;
            go1 r0 = r0.f906
            return r0
    }

    public p000.yp0 getRoot() {
            r0 = this;
            yp0 r0 = r0.f876
            return r0
    }

    public p000.uo1 getRootForTest() {
            r0 = this;
            return r0
    }

    public final boolean getScrollCaptureInProgress$ui() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            lm0 r2 = r2.f928
            if (r2 == 0) goto L17
            x91 r2 = r2.f6712
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L17:
            r2 = 0
            return r2
    }

    public p000.es1 getSemanticsOwner() {
            r0 = this;
            es1 r0 = r0.f879
            return r0
    }

    public p000.aq0 getSharedDrawScope() {
            r0 = this;
            aq0 r0 = r0.f903
            return r0
    }

    public boolean getShowLayoutBounds() {
            r1 = this;
            j4 r0 = p000.C0418j4.f5307
            boolean r1 = r0.m2849(r1)
            return r1
    }

    public p000.y81 getSnapshotObserver() {
            r0 = this;
            y81 r0 = r0.f897
            return r0
    }

    public p000.ox1 getSoftwareKeyboardController() {
            r2 = this;
            i2 r0 = r2.f946
            if (r0 != 0) goto L10
            i2 r0 = new i2
            r2.getTextInputService()
            r1 = 18
            r0.<init>(r1)
            r2.f946 = r0
        L10:
            return r0
    }

    public p000.i32 getTextInputService() {
            r3 = this;
            i32 r0 = r3.f944
            if (r0 != 0) goto L14
            i32 r0 = new i32
            r3.getLegacyTextInputServiceAndroid()
            r0.<init>()
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r1.<init>(r2)
            r3.f944 = r0
        L14:
            return r0
    }

    public p000.x32 getTextToolbar() {
            r0 = this;
            i2 r0 = r0.f953
            return r0
    }

    public final p000.to1 getUncaughtExceptionHandler$ui() {
            r0 = this;
            r0 = 0
            return r0
    }

    public android.view.View getView() {
            r0 = this;
            return r0
    }

    public p000.g92 getViewConfiguration() {
            r0 = this;
            l3 r0 = r0.f918
            return r0
    }

    public final p000.AbstractC0892v0 getViewTreeOwners() {
            r0 = this;
            fs r0 = r0.f941
            java.lang.Object r0 = r0.getValue()
            p000.lz1.m3698(r0)
            r0 = 0
            return r0
    }

    public p000.ub2 getWindowInfo() {
            r0 = this;
            pn r0 = r0.getComposeViewContext()
            lm0 r0 = r0.f8614
            return r0
    }

    public final p000.C0452k0 get_autofillManager$ui() {
            r0 = this;
            k0 r0 = r0.f893
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r9 = this;
            super.onAttachedToWindow()
            r0 = 1
            r9.setAttached(r0)
            om0 r1 = r9.f919
            r1.onViewAttachedToWindow(r9)
            s0 r1 = androidx.compose.p001ui.platform.AndroidComposeView.f875
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L54
            s0 r1 = new s0
            r1.<init>(r3)
            androidx.compose.p001ui.platform.AndroidComposeView.f875 = r1
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            java.lang.Class r5 = androidx.compose.p001ui.platform.AndroidComposeView.f872     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L29
            java.lang.String r5 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L51
            androidx.compose.p001ui.platform.AndroidComposeView.f872 = r5     // Catch: java.lang.Throwable -> L51
        L29:
            java.lang.reflect.Method r5 = androidx.compose.p001ui.platform.AndroidComposeView.f873     // Catch: java.lang.Throwable -> L51
            if (r5 != 0) goto L46
            android.os.StrictMode$VmPolicy r5 = android.os.StrictMode.VmPolicy.LAX     // Catch: java.lang.Throwable -> L51
            android.os.StrictMode.setVmPolicy(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Class r5 = androidx.compose.p001ui.platform.AndroidComposeView.f872     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L43
            java.lang.String r6 = "addChangeCallback"
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L51
            java.lang.Class<java.lang.Runnable> r8 = java.lang.Runnable.class
            r7[r3] = r8     // Catch: java.lang.Throwable -> L51
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch: java.lang.Throwable -> L51
            goto L44
        L43:
            r5 = r2
        L44:
            androidx.compose.p001ui.platform.AndroidComposeView.f873 = r5     // Catch: java.lang.Throwable -> L51
        L46:
            java.lang.reflect.Method r5 = androidx.compose.p001ui.platform.AndroidComposeView.f873     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L51
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L51
            r6[r3] = r1     // Catch: java.lang.Throwable -> L51
            r5.invoke(r2, r6)     // Catch: java.lang.Throwable -> L51
        L51:
            android.os.StrictMode.setVmPolicy(r4)
        L54:
            v11 r1 = androidx.compose.p001ui.platform.AndroidComposeView.f874
            monitor-enter(r1)
            r1.m6015(r9)     // Catch: java.lang.Throwable -> L1bb
            monitor-exit(r1)
            boolean r1 = r9.f927
            if (r1 != 0) goto L66
            pn r1 = r9.getComposeViewContext()
            r1.m4554()
        L66:
            r9.f927 = r3
            yp0 r1 = r9.getRoot()
            r9.m389(r1)
            yp0 r1 = r9.getRoot()
            m370(r1)
            y81 r1 = r9.getSnapshotObserver()
            kx1 r1 = r1.f12491
            cc r4 = r1.f6301
            eu1 r5 = p000.ax1.f1360
            p000.ax1.m623(r5)
            java.lang.Object r5 = p000.ax1.f1362
            monitor-enter(r5)
            java.lang.Object r6 = p000.ax1.f1367     // Catch: java.lang.Throwable -> L1b8
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L1b8
            java.util.ArrayList r6 = p000.AbstractC0984xh.m6650(r4, r6)     // Catch: java.lang.Throwable -> L1b8
            p000.ax1.f1367 = r6     // Catch: java.lang.Throwable -> L1b8
            monitor-exit(r5)
            hi0 r5 = new hi0
            r5.<init>(r4)
            r1.f6305 = r5
            i0 r1 = r9.f892
            if (r1 == 0) goto La8
            w7 r4 = p000.C0937w7.f11591
            r4.getClass()
            java.lang.Object r1 = r1.f4859
            android.view.autofill.AutofillManager r1 = (android.view.autofill.AutofillManager) r1
            r1.registerCallback(r4)
        La8:
            pn r1 = r9.getComposeViewContext()
            hr0 r1 = r1.f8598
            pn r4 = r9.getComposeViewContext()
            r92 r4 = r4.f8600
            kr0 r5 = r9.f904
            if (r1 == 0) goto L13a
            if (r4 == 0) goto L13a
            if (r5 != 0) goto Lbe
            goto L13a
        Lbe:
            q92 r1 = r4.mo191()
            zz1 r4 = new zz1
            r5 = 12
            r4.<init>(r5, r3)
            gq r5 = p000.C0331gq.f4429
            r1.getClass()
            r5.getClass()
            i0 r6 = new i0
            r6.<init>(r1, r4, r5)
            java.lang.Class<mr0> r1 = p000.mr0.class
            wf r1 = p000.vm1.m6272(r1)
            java.lang.String r4 = r1.m6377()
            if (r4 == 0) goto L134
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r4 = r5.concat(r4)
            m92 r1 = r6.m2574(r1, r4)
            mr0 r1 = (p000.mr0) r1
            android.view.ViewParent r4 = r9.getParent()
            r4.getClass()
            android.view.View r4 = (android.view.View) r4
            int r4 = r4.getId()
            n11 r1 = r1.f7254
            java.lang.Object r5 = r1.m5525(r4)
            if (r5 != 0) goto L10b
            v11 r5 = new v11
            r5.<init>(r0)
            r1.m3942(r4, r5)
        L10b:
            v11 r5 = (p000.v11) r5
            java.lang.Object[] r1 = r5.f11064
            int r4 = r5.f11065
        L111:
            if (r3 >= r4) goto L120
            r6 = r1[r3]
            r7 = r6
            lr0 r7 = (p000.lr0) r7
            boolean r7 = r7.f6750
            if (r7 != 0) goto L11d
            goto L121
        L11d:
            int r3 = r3 + 1
            goto L111
        L120:
            r6 = r2
        L121:
            lr0 r6 = (p000.lr0) r6
            if (r6 != 0) goto L12d
            lr0 r6 = new lr0
            r6.<init>()
            r5.m6015(r6)
        L12d:
            r6.f6750 = r0
            r9.f905 = r6
            n r1 = r6.f6749
            goto L13b
        L134:
            java.lang.String r9 = "Local and anonymous classes can not be ViewModels"
            p000.C1080.m7275(r9)
            return
        L13a:
            r1 = r2
        L13b:
            if (r1 != 0) goto L13f
            x r1 = p000.C0966x.f11932
        L13f:
            r9.f906 = r1
            a80 r1 = r9.f942
            if (r1 == 0) goto L14e
            pn r3 = r9.getComposeViewContext()
            r1.invoke(r3)
            r9.f942 = r2
        L14e:
            pn r1 = r9.getComposeViewContext()
            hr0 r1 = r1.f8598
            jr0 r1 = r1.mo192()
            r1.m2980(r9)
            z1 r2 = r9.f881
            r1.m2980(r2)
            lm0 r1 = r9.f951
            boolean r2 = r9.isInTouchMode()
            if (r2 == 0) goto L169
            goto L16a
        L169:
            r0 = 2
        L16a:
            x91 r1 = r1.f6712
            jm0 r2 = new jm0
            r2.<init>(r0)
            r1.setValue(r2)
            android.view.ViewTreeObserver r0 = r9.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r9)
            android.view.ViewTreeObserver r0 = r9.getViewTreeObserver()
            r0.addOnScrollChangedListener(r9)
            android.view.ViewTreeObserver r0 = r9.getViewTreeObserver()
            r0.addOnTouchModeChangeListener(r9)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L194
            q1 r0 = p000.C0708q1.f8785
            r0.m4695(r9)
        L194:
            k0 r0 = r9.f893
            if (r0 == 0) goto L1ac
            v40 r1 = r9.getFocusOwner()
            y40 r1 = (p000.y40) r1
            v11 r1 = r1.f12451
            r1.m6015(r0)
            es1 r1 = r9.getSemanticsOwner()
            v11 r1 = r1.f3665
            r1.m6015(r0)
        L1ac:
            v40 r0 = r9.getFocusOwner()
            y40 r0 = (p000.y40) r0
            v11 r0 = r0.f12451
            r0.m6015(r9)
            return
        L1b8:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L1bb:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f945
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L11
            j32 r1 = r1.getLegacyTextInputServiceAndroid()
            r1.getClass()
        Lf:
            r1 = 0
            return r1
        L11:
            p000.C1080.m7264()
            goto Lf
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0.m381(r1)
            return
    }

    @Override // android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r1) {
            r0 = this;
            java.util.concurrent.atomic.AtomicReference r1 = r0.f945
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L11
            j32 r0 = r0.getLegacyTextInputServiceAndroid()
            r0.getClass()
        Lf:
            r0 = 0
            return r0
        L11:
            p000.C1080.m7264()
            goto Lf
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] r7, int[] r8, java.util.function.Consumer r9) {
            r6 = this;
            z1 r6 = r6.f881
            r6.getClass()
            int r8 = r7.length
            r0 = 0
        L7:
            if (r0 >= r8) goto L5d
            r1 = r7[r0]
            sm0 r3 = r6.m7059()
            int r1 = (int) r1
            java.lang.Object r1 = r3.m5525(r1)
            ds1 r1 = (p000.ds1) r1
            if (r1 == 0) goto L5a
            bs1 r1 = r1.f3268
            if (r1 != 0) goto L1d
            goto L5a
        L1d:
            p000.AbstractC0671p1.m4370()
            androidx.compose.ui.platform.AndroidComposeView r2 = r6.f12924
            android.view.autofill.AutofillId r2 = r2.getAutofillId()
            int r3 = r1.f1826
            long r3 = (long) r3
            android.view.translation.ViewTranslationRequest$Builder r2 = p000.AbstractC0671p1.m4366(r2, r3)
            xr1 r1 = r1.f1824
            is1 r3 = p000.fs1.f4085
            b21 r1 = r1.f12268
            java.lang.Object r1 = r1.m695(r3)
            r3 = 0
            if (r1 != 0) goto L3b
            r1 = r3
        L3b:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L5a
            java.lang.String r4 = "\n"
            r5 = 62
            java.lang.String r1 = p000.hu0.m2541(r1, r4, r3, r5)
            g4 r3 = new g4
            r3.<init>(r1)
            android.view.translation.TranslationRequestValue r1 = p000.AbstractC0671p1.m4364(r3)
            p000.AbstractC0671p1.m4350(r2, r1)
            android.view.translation.ViewTranslationRequest r1 = p000.AbstractC0671p1.m4367(r2)
            r9.accept(r1)
        L5a:
            int r0 = r0 + 1
            goto L7
        L5d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r10 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r10.setAttached(r0)
            om0 r1 = r10.f919
            r1.onViewDetachedFromWindow(r10)
            android.view.View r1 = r10.f910
            boolean r2 = m371()
            if (r2 == 0) goto L19
            if (r1 == 0) goto L19
            r10.removeView(r1)
        L19:
            v11 r1 = androidx.compose.p001ui.platform.AndroidComposeView.f874
            monitor-enter(r1)
            r1.m6024(r10)     // Catch: java.lang.Throwable -> Lfc
            monitor-exit(r1)
            pn r1 = r10.getComposeViewContext()
            r1.m4553()
            y81 r1 = r10.getSnapshotObserver()
            kx1 r2 = r1.f12491
            hi0 r2 = r2.f6305
            if (r2 == 0) goto L34
            r2.m2510()
        L34:
            kx1 r1 = r1.f12491
            java.lang.Object r2 = r1.f6304
            monitor-enter(r2)
            k21 r1 = r1.f6303     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r3 = r1.f5716     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.f5718     // Catch: java.lang.Throwable -> L5d
            r4 = r0
        L40:
            if (r4 >= r1) goto L61
            r5 = r3[r4]     // Catch: java.lang.Throwable -> L5d
            jx1 r5 = (p000.jx1) r5     // Catch: java.lang.Throwable -> L5d
            b21 r6 = r5.f5639     // Catch: java.lang.Throwable -> L5d
            r6.m689()     // Catch: java.lang.Throwable -> L5d
            b21 r6 = r5.f5640     // Catch: java.lang.Throwable -> L5d
            r6.m689()     // Catch: java.lang.Throwable -> L5d
            b21 r6 = r5.f5646     // Catch: java.lang.Throwable -> L5d
            r6.m689()     // Catch: java.lang.Throwable -> L5d
            java.util.HashMap r5 = r5.f5647     // Catch: java.lang.Throwable -> L5d
            r5.clear()     // Catch: java.lang.Throwable -> L5d
            int r4 = r4 + 1
            goto L40
        L5d:
            r0 = move-exception
            r10 = r0
            goto Lfa
        L61:
            monitor-exit(r2)
            pn r1 = r10.getComposeViewContext()
            hr0 r1 = r1.f8598
            jr0 r1 = r1.mo192()
            z1 r2 = r10.f881
            r1.m2985(r2)
            r1.m2985(r10)
            i0 r1 = r10.f892
            if (r1 == 0) goto L84
            w7 r2 = p000.C0937w7.f11591
            r2.getClass()
            java.lang.Object r1 = r1.f4859
            android.view.autofill.AutofillManager r1 = (android.view.autofill.AutofillManager) r1
            r1.unregisterCallback(r2)
        L84:
            android.view.ViewTreeObserver r1 = r10.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r10)
            android.view.ViewTreeObserver r1 = r10.getViewTreeObserver()
            r1.removeOnScrollChangedListener(r10)
            android.view.ViewTreeObserver r1 = r10.getViewTreeObserver()
            r1.removeOnTouchModeChangeListener(r10)
            lr0 r1 = r10.f905
            if (r1 == 0) goto L9f
            r1.f6750 = r0
        L9f:
            r0 = 0
            r10.f905 = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto Lad
            q1 r1 = p000.C0708q1.f8785
            r1.m4694(r10)
        Lad:
            k0 r1 = r10.f893
            if (r1 == 0) goto Lc5
            es1 r2 = r10.getSemanticsOwner()
            v11 r2 = r2.f3665
            r2.m6024(r1)
            v40 r2 = r10.getFocusOwner()
            y40 r2 = (p000.y40) r2
            v11 r2 = r2.f12451
            r2.m6024(r1)
        Lc5:
            ol1 r1 = r10.getRectManager()
            j42 r2 = r1.f8139
            r8 = 0
            r9 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            boolean r2 = r2.m2861(r3, r5, r7, r8, r9)
            r1.f8142 = r2
            ol1 r1 = r10.getRectManager()
            r1.m4249()
            ol1 r1 = r10.getRectManager()
            r0 r2 = r1.f8144
            if (r2 == 0) goto Lee
            androidx.compose.ui.platform.AndroidComposeView r3 = r1.f8137
            r3.removeCallbacks(r2)
            r1.f8144 = r0
        Lee:
            v40 r0 = r10.getFocusOwner()
            y40 r0 = (p000.y40) r0
            v11 r0 = r0.f12451
            r0.m6024(r10)
            return
        Lfa:
            monitor-exit(r2)
            throw r10
        Lfc:
            r0 = move-exception
            r10 = r0
            monitor-exit(r1)
            throw r10
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            super.onFocusChanged(r1, r2, r3)
            if (r1 != 0) goto L2e
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L2e
            v40 r0 = r0.getFocusOwner()
            y40 r0 = (p000.y40) r0
            c50 r1 = r0.f12447
            r2 = 1
            p000.kn0.m3374(r1, r2)
            c50 r1 = r0.m6827()
            if (r1 == 0) goto L2e
            c50 r1 = r0.m6827()
            r2 = 0
            r0.m6829(r2)
            if (r1 == 0) goto L2e
            b50 r0 = p000.b50.f1476
            b50 r2 = p000.b50.f1478
            r1.m1134(r0, r2)
        L2e:
            return
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
            r2 = this;
            r0 = 0
            r2.f937 = r0
            r2.m382()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r1 > r0) goto L1c
            r1 = 34
            if (r0 >= r1) goto L1c
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r2.m381(r0)
        L1c:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r3 = "AndroidOwner:onLayout"
            android.os.Trace.beginSection(r3)
            r0 = 0
            r2.f937 = r0     // Catch: java.lang.Throwable -> L36
            mx0 r3 = r2.f932     // Catch: java.lang.Throwable -> L36
            x0 r0 = r2.f924     // Catch: java.lang.Throwable -> L36
            r3.m3904(r0)     // Catch: java.lang.Throwable -> L36
            r3 = 0
            r2.f899 = r3     // Catch: java.lang.Throwable -> L36
            r2.m382()     // Catch: java.lang.Throwable -> L36
            androidx.compose.ui.platform.AndroidViewsHandler r3 = r2.f898     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L32
            java.lang.String r3 = "AndroidOwner:viewLayout"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.Throwable -> L36
            androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.getAndroidViewsHandler$ui()     // Catch: java.lang.Throwable -> L2d
            int r6 = r6 - r4
            int r7 = r7 - r5
            r3 = 0
            r2.layout(r3, r3, r6, r7)     // Catch: java.lang.Throwable -> L2d
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L36
            goto L32
        L2d:
            r2 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L36
            throw r2     // Catch: java.lang.Throwable -> L36
        L32:
            android.os.Trace.endSection()
            return
        L36:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    @Override // android.view.View
    public final void onMeasure(int r9, int r10) {
            r8 = this;
            mx0 r0 = r8.f932
            java.lang.String r1 = "AndroidOwner:onMeasure"
            android.os.Trace.beginSection(r1)
            boolean r1 = r8.isAttachedToWindow()     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L14
            yp0 r1 = r8.getRoot()     // Catch: java.lang.Throwable -> La3
            r8.m389(r1)     // Catch: java.lang.Throwable -> La3
        L14:
            long r1 = m369(r9)     // Catch: java.lang.Throwable -> La3
            r9 = 32
            long r3 = r1 >>> r9
            int r3 = (int) r3     // Catch: java.lang.Throwable -> La3
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1     // Catch: java.lang.Throwable -> La3
            long r6 = m369(r10)     // Catch: java.lang.Throwable -> La3
            long r9 = r6 >>> r9
            int r9 = (int) r9     // Catch: java.lang.Throwable -> La3
            long r4 = r4 & r6
            int r10 = (int) r4     // Catch: java.lang.Throwable -> La3
            long r9 = p000.AbstractC1021yh.m6852(r3, r1, r9, r10)     // Catch: java.lang.Throwable -> La3
            yo r1 = r8.f899     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L40
            yo r1 = new yo     // Catch: java.lang.Throwable -> La3
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La3
            r8.f899 = r1     // Catch: java.lang.Throwable -> La3
            r1 = 0
            r8.f931 = r1     // Catch: java.lang.Throwable -> La3
            goto L4b
        L40:
            long r1 = r1.f12706     // Catch: java.lang.Throwable -> La3
            boolean r1 = p000.C1028yo.m6947(r1, r9)     // Catch: java.lang.Throwable -> La3
            if (r1 != 0) goto L4b
            r1 = 1
            r8.f931 = r1     // Catch: java.lang.Throwable -> La3
        L4b:
            r0.m3910(r9)     // Catch: java.lang.Throwable -> La3
            r0.m3905()     // Catch: java.lang.Throwable -> La3
            yp0 r9 = r8.getRoot()     // Catch: java.lang.Throwable -> La3
            bq0 r9 = r9.f12734     // Catch: java.lang.Throwable -> La3
            ox0 r9 = r9.f1815     // Catch: java.lang.Throwable -> La3
            int r9 = r9.f2115     // Catch: java.lang.Throwable -> La3
            yp0 r10 = r8.getRoot()     // Catch: java.lang.Throwable -> La3
            bq0 r10 = r10.f12734     // Catch: java.lang.Throwable -> La3
            ox0 r10 = r10.f1815     // Catch: java.lang.Throwable -> La3
            int r10 = r10.f2116     // Catch: java.lang.Throwable -> La3
            r8.setMeasuredDimension(r9, r10)     // Catch: java.lang.Throwable -> La3
            androidx.compose.ui.platform.AndroidViewsHandler r9 = r8.f898     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto L9f
            java.lang.String r9 = "AndroidOwner:androidViewMeasure"
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> La3
            androidx.compose.ui.platform.AndroidViewsHandler r9 = r8.getAndroidViewsHandler$ui()     // Catch: java.lang.Throwable -> L9a
            yp0 r10 = r8.getRoot()     // Catch: java.lang.Throwable -> L9a
            bq0 r10 = r10.f12734     // Catch: java.lang.Throwable -> L9a
            ox0 r10 = r10.f1815     // Catch: java.lang.Throwable -> L9a
            int r10 = r10.f2115     // Catch: java.lang.Throwable -> L9a
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r0)     // Catch: java.lang.Throwable -> L9a
            yp0 r8 = r8.getRoot()     // Catch: java.lang.Throwable -> L9a
            bq0 r8 = r8.f12734     // Catch: java.lang.Throwable -> L9a
            ox0 r8 = r8.f1815     // Catch: java.lang.Throwable -> L9a
            int r8 = r8.f2116     // Catch: java.lang.Throwable -> L9a
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)     // Catch: java.lang.Throwable -> L9a
            r9.measure(r10, r8)     // Catch: java.lang.Throwable -> L9a
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La3
            goto L9f
        L9a:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La3
            throw r8     // Catch: java.lang.Throwable -> La3
        L9f:
            android.os.Trace.endSection()
            return
        La3:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
            r11 = this;
            if (r12 == 0) goto L10a
            r13 = 1
            k0 r0 = r11.f893
            if (r0 == 0) goto La7
            es1 r1 = r0.f5682
            yp0 r1 = r1.f3662
            android.view.autofill.AutofillId r2 = r0.f5686
            java.lang.String r3 = r0.f5685
            ol1 r0 = r0.f5684
            p000.i91.m2686(r12, r1, r2, r3, r0)
            java.lang.Object[] r4 = p000.a41.f64
            v11 r4 = new v11
            r5 = 2
            r4.<init>(r5)
            r4.m6015(r1)
            r4.m6015(r12)
        L22:
            boolean r1 = r4.m6023()
            if (r1 == 0) goto La7
            int r1 = r4.f11065
            int r1 = r1 - r13
            java.lang.Object r1 = r4.m6025(r1)
            r1.getClass()
            android.view.ViewStructure r1 = (android.view.ViewStructure) r1
            int r5 = r4.f11065
            int r5 = r5 - r13
            java.lang.Object r5 = r4.m6025(r5)
            r5.getClass()
            yp0 r5 = (p000.yp0) r5
            java.util.List r5 = r5.m6999()
            h21 r5 = (p000.h21) r5
            k21 r6 = r5.f4540
            int r6 = r6.f5718
            r7 = 0
        L4b:
            if (r7 >= r6) goto L22
            java.lang.Object r8 = r5.get(r7)
            yp0 r8 = (p000.yp0) r8
            boolean r9 = r8.f12742
            if (r9 != 0) goto La4
            boolean r9 = r8.m6977()
            if (r9 == 0) goto La4
            boolean r9 = r8.m6978()
            if (r9 != 0) goto L64
            goto La4
        L64:
            xr1 r9 = r8.m7007()
            if (r9 == 0) goto L9e
            b21 r9 = r9.f12268
            is1 r10 = p000.wr1.f11817
            boolean r10 = r9.m690(r10)
            if (r10 != 0) goto L8c
            is1 r10 = p000.wr1.f11818
            boolean r10 = r9.m690(r10)
            if (r10 != 0) goto L8c
            is1 r10 = p000.fs1.f4114
            boolean r10 = r9.m690(r10)
            if (r10 != 0) goto L8c
            is1 r10 = p000.fs1.f4115
            boolean r9 = r9.m690(r10)
            if (r9 == 0) goto L9e
        L8c:
            int r9 = r1.addChildCount(r13)
            android.view.ViewStructure r9 = r1.newChild(r9)
            p000.i91.m2686(r9, r8, r2, r3, r0)
            r4.m6015(r8)
            r4.m6015(r9)
            goto La4
        L9e:
            r4.m6015(r8)
            r4.m6015(r1)
        La4:
            int r7 = r7 + 1
            goto L4b
        La7:
            i0 r11 = r11.f892
            if (r11 == 0) goto L10a
            java.lang.Object r0 = r11.f4858
            y7 r0 = (p000.C1011y7) r0
            java.util.LinkedHashMap r1 = r0.f12476
            java.util.LinkedHashMap r0 = r0.f12476
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto Lba
            goto L10a
        Lba:
            int r1 = r0.size()
            int r1 = r12.addChildCount(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto Ld1
            goto L10a
        Ld1:
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto Leb
            p000.C1080.m7264()
            return
        Leb:
            android.view.ViewStructure r12 = r12.newChild(r1)
            java.lang.Object r0 = r11.f4860
            android.view.autofill.AutofillId r0 = (android.view.autofill.AutofillId) r0
            r12.setAutofillId(r0, r2)
            java.lang.Object r11 = r11.f4857
            androidx.compose.ui.platform.AndroidComposeView r11 = (androidx.compose.p001ui.platform.AndroidComposeView) r11
            android.content.Context r11 = r11.getContext()
            java.lang.String r11 = r11.getPackageName()
            r0 = 0
            r12.setId(r2, r11, r0, r0)
            r12.setAutofillType(r13)
            throw r0
        L10a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r3, int r4) {
            r2 = this;
            int r0 = r3.getToolType(r4)
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = r3.isFromSource(r1)
            if (r1 != 0) goto L21
            r1 = 16386(0x4002, float:2.2962E-41)
            boolean r1 = r3.isFromSource(r1)
            if (r1 == 0) goto L21
            r1 = 2
            if (r0 == r1) goto L1a
            r1 = 4
            if (r0 != r1) goto L21
        L1a:
            zh1 r0 = r2.getPointerIconService()
            r0.getClass()
        L21:
            android.view.PointerIcon r2 = super.onResolvePointerIcon(r3, r4)
            return r2
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
            r2 = this;
            boolean r0 = r2.f902
            if (r0 == 0) goto L1a
            int[] r0 = p000.r40.f9257
            np0 r0 = p000.np0.f7701
            if (r3 == 0) goto L12
            r1 = 1
            if (r3 == r1) goto Lf
            r3 = 0
            goto L13
        Lf:
            np0 r3 = p000.np0.f7702
            goto L13
        L12:
            r3 = r0
        L13:
            if (r3 != 0) goto L16
            goto L17
        L16:
            r0 = r3
        L17:
            r2.setLayoutDirection(r0)
        L1a:
            return
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect r5, android.graphics.Point r6, java.util.function.Consumer r7) {
            r4 = this;
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 31
            if (r5 < r6) goto La0
            lm0 r5 = r4.f928
            if (r5 == 0) goto La0
            es1 r5 = r4.getSemanticsOwner()
            r4.getCoroutineContext()
            r4 = 16
            xq1[] r6 = new p000.xq1[r4]
            bs1 r5 = r5.m1953()
            k21 r7 = new k21
            bs1[] r4 = new p000.bs1[r4]
            r7.<init>(r4)
            r4 = 0
            java.util.List r5 = r5.m1014(r4, r4)
        L25:
            int r0 = r7.f5718
            r7.m3129(r0, r5)
        L2a:
            int r5 = r7.f5718
            r0 = 1
            if (r5 == 0) goto L8d
            int r5 = r5 + (-1)
            java.lang.Object r5 = r7.m3136(r5)
            bs1 r5 = (p000.bs1) r5
            boolean r1 = p000.h62.m2431(r5)
            xr1 r2 = r5.f1824
            b21 r2 = r2.f12268
            if (r1 != 0) goto L2a
            is1 r1 = p000.fs1.f4107
            boolean r1 = r2.m691(r1)
            if (r1 == 0) goto L4a
            goto L2a
        L4a:
            q31 r1 = r5.m1009()
            if (r1 == 0) goto L86
            ml1 r0 = p000.AbstractC0782s1.m5328(r1, r0)
            ym0 r0 = p000.pd2.m4471(r0)
            int r1 = r0.f12684
            int r3 = r0.f12686
            if (r1 >= r3) goto L2a
            int r1 = r0.f12685
            int r0 = r0.f12687
            if (r1 < r0) goto L65
            goto L2a
        L65:
            is1 r0 = p000.wr1.f11816
            java.lang.Object r0 = r2.m695(r0)
            r1 = 0
            if (r0 != 0) goto L6f
            r0 = r1
        L6f:
            e80 r0 = (p000.e80) r0
            is1 r0 = p000.fs1.f4119
            java.lang.Object r0 = r2.m695(r0)
            if (r0 != 0) goto L7a
            goto L7b
        L7a:
            r1 = r0
        L7b:
            if (r1 != 0) goto L82
            java.util.List r5 = r5.m1014(r4, r4)
            goto L25
        L82:
            p000.C1080.m7264()
            return
        L86:
            java.lang.String r4 = "Expected semantics node to have a coordinator."
            pm r4 = p000.lz1.m3680(r4)
            throw r4
        L8d:
            r5 = 2
            a80[] r5 = new p000.a80[r5]
            a1 r7 = p000.C0002a1.f18
            r5[r4] = r7
            a1 r7 = p000.C0002a1.f19
            r5[r0] = r7
            lm r7 = new lm
            r7.<init>(r4, r5)
            java.util.Arrays.sort(r6, r4, r4, r7)
        La0:
            return
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r0 = this;
            r0.m382()
            return
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 2
        L5:
            lm0 r1 = r1.f951
            x91 r1 = r1.f6712
            jm0 r0 = new jm0
            r0.<init>(r2)
            r1.setValue(r0)
            return
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(android.util.LongSparseArray r4) {
            r3 = this;
            z1 r3 = r3.f881
            r3.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto Lc
            return
        Lc:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L22
            p000.ln0.m3637(r3, r4)
            return
        L22:
            androidx.compose.ui.platform.AndroidComposeView r0 = r3.f12924
            w1 r1 = new w1
            r2 = 0
            r1.<init>(r3, r2, r4)
            r0.post(r1)
            return
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            r0 = 1
            r1.f926 = r0
            super.onWindowFocusChanged(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r8, android.graphics.Rect r9) {
            r7 = this;
            boolean r0 = r7.isFocused()
            r1 = 1
            if (r0 == 0) goto L8
            goto L57
        L8:
            q40 r8 = p000.r40.m5062(r8)
            if (r8 == 0) goto L11
            int r8 = r8.f8856
            goto L12
        L11:
            r8 = 7
        L12:
            v40 r0 = r7.getFocusOwner()
            r2 = 0
            if (r9 == 0) goto L2b
            ml1 r3 = new ml1
            int r4 = r9.left
            float r4 = (float) r4
            int r5 = r9.top
            float r5 = (float) r5
            int r6 = r9.right
            float r6 = (float) r6
            int r9 = r9.bottom
            float r9 = (float) r9
            r3.<init>(r4, r5, r6, r9)
            goto L2c
        L2b:
            r3 = r2
        L2c:
            c1 r9 = new c1
            r4 = 0
            r9.<init>(r8, r4)
            y40 r0 = (p000.y40) r0
            java.lang.Boolean r9 = r0.m6826(r8, r3, r9)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r9 = p000.ln0.m3626(r9, r0)
            if (r9 == 0) goto L41
            goto L57
        L41:
            v40 r9 = r7.getFocusOwner()
            c1 r3 = new c1
            r4 = 1
            r3.<init>(r8, r4)
            y40 r9 = (p000.y40) r9
            java.lang.Boolean r9 = r9.m6826(r8, r2, r3)
            boolean r9 = p000.ln0.m3626(r9, r0)
            if (r9 == 0) goto L58
        L57:
            return r1
        L58:
            boolean r9 = r7.hasFocus()
            if (r9 == 0) goto L6f
            if (r8 != r1) goto L61
            goto L64
        L61:
            r9 = 2
            if (r8 != r9) goto L6f
        L64:
            v40 r7 = r7.getFocusOwner()
            y40 r7 = (p000.y40) r7
            boolean r7 = r7.m6828(r8)
            return r7
        L6f:
            r7 = 0
            return r7
    }

    public void setAccessibilityEventBatchIntervalMillis(long r1) {
            r0 = this;
            l1 r0 = r0.f880
            r0.f6362 = r1
            return
    }

    public final void setComposeViewContext(p000.C0693pn r5) {
            r4 = this;
            up r0 = r4.getCoroutineContext()
            un r1 = r5.f8597
            up r1 = r1.mo3324()
            if (r0 == r1) goto L22
            yp0 r0 = r4.getRoot()
            java.util.List r0 = r0.m6999()
            h21 r0 = (p000.h21) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            goto L22
        L1d:
            java.lang.String r0 = "Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first."
            p000.am0.m177(r0)
        L22:
            tw1 r0 = p000.e81.m1877()
            if (r0 == 0) goto L2d
            a80 r1 = r0.mo2001()
            goto L2e
        L2d:
            r1 = 0
        L2e:
            tw1 r2 = p000.e81.m1880(r0)
            pn r3 = r4.get_composeViewContext()     // Catch: java.lang.Throwable -> L59
            p000.e81.m1885(r0, r2, r1)
            boolean r0 = r5.equals(r3)
            if (r0 == 0) goto L40
            return
        L40:
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L4c
            r3.m4553()
            r5.m4554()
        L4c:
            r4.set_composeViewContext(r5)
            un r5 = r5.f8597
            up r5 = r5.mo3324()
            r4.setCoroutineContext(r5)
            return
        L59:
            r4 = move-exception
            p000.e81.m1885(r0, r2, r1)
            throw r4
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean r1) {
            r0 = this;
            r0.f927 = r1
            return
    }

    public final void setConfiguration(android.content.res.Configuration r1) {
            r0 = this;
            x91 r0 = r0.f890
            r0.setValue(r1)
            return
    }

    public final void setContentCaptureManager$ui(p000.ViewOnAttachStateChangeListenerC1042z1 r1) {
            r0 = this;
            r0.f881 = r1
            return
    }

    public void setCoroutineContext(p000.InterfaceC0880up r1) {
            r0 = this;
            r0.f912 = r1
            return
    }

    public final void setFrameEndScheduler$ui(p000.kr0 r1) {
            r0 = this;
            r0.f904 = r1
            return
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long r1) {
            r0 = this;
            r0.f937 = r1
            return
    }

    public final void setOnReadyForComposition(p000.a80 r2) {
            r1 = this;
            r1.getDerivedIsAttached()
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L11
            boolean r0 = r1.f927
            if (r0 == 0) goto Le
            goto L11
        Le:
            r1.f942 = r2
            return
        L11:
            pn r1 = r1.getComposeViewContext()
            r2.invoke(r1)
            return
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m7368setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(p000.rl0 r1) {
            r0 = this;
            return
    }

    public void setShowLayoutBounds(boolean r1) {
            r0 = this;
            return
    }

    public void setUncaughtExceptionHandler(p000.to1 r1) {
            r0 = this;
            mx0 r0 = r0.f932
            r0.getClass()
            return
    }

    public final void setUncaughtExceptionHandler$ui(p000.to1 r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Α */
    public final void m373() {
            r4 = this;
            l1 r0 = r4.f880
            r1 = 1
            r0.f6342 = r1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f6358
            android.os.Handler r2 = r2.getHandler()
            boolean r3 = r0.m3459()
            if (r3 == 0) goto L1e
            boolean r3 = r0.f6353
            if (r3 != 0) goto L1e
            if (r2 == 0) goto L1e
            r0.f6353 = r1
            ν r0 = r0.f6355
            r2.post(r0)
        L1e:
            z1 r4 = r4.f881
            r4.f12930 = r1
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f12924
            android.os.Handler r0 = r0.getHandler()
            boolean r2 = r4.m7060()
            if (r2 == 0) goto L3b
            boolean r2 = r4.f12936
            if (r2 != 0) goto L3b
            if (r0 == 0) goto L3b
            r4.f12936 = r1
            ν r4 = r4.f12937
            r0.post(r4)
        L3b:
            return
    }

    /* JADX INFO: renamed from: Β */
    public final void m374() {
            r6 = this;
            boolean r0 = r6.f938
            if (r0 != 0) goto L5e
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r6.f937
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L5e
            r6.f937 = r0
            jd r0 = r6.f925
            float[] r1 = r6.f935
            r0.m2954(r6, r1)
            float[] r0 = r6.f936
            p000.AbstractC0073bd.m848(r1, r0)
            android.view.ViewParent r0 = r6.getParent()
            r1 = r6
        L21:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L30
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.ViewParent r0 = r0.getParent()
            goto L21
        L30:
            int[] r0 = r6.f934
            r1.getLocationOnScreen(r0)
            r2 = 0
            r3 = r0[r2]
            float r3 = (float) r3
            r4 = 1
            r5 = r0[r4]
            float r5 = (float) r5
            r1.getLocationInWindow(r0)
            r1 = r0[r2]
            float r1 = (float) r1
            r0 = r0[r4]
            float r0 = (float) r0
            float r3 = r3 - r1
            float r5 = r5 - r0
            int r0 = java.lang.Float.floatToRawIntBits(r3)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r5)
            long r2 = (long) r2
            r4 = 32
            long r0 = r0 << r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            r6.f939 = r0
        L5e:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public final void m375(android.view.MotionEvent r10) {
            r9 = this;
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r9.f937 = r0
            jd r0 = r9.f925
            float[] r1 = r9.f935
            r0.m2954(r9, r1)
            float[] r0 = r9.f936
            p000.AbstractC0073bd.m848(r1, r0)
            float r0 = r10.getX()
            float r2 = r10.getY()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r3 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r5 = (long) r0
            r0 = 32
            long r2 = r3 << r0
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r5 & r7
            long r2 = r2 | r4
            long r1 = p000.AbstractC0073bd.m850(r1, r2)
            float r3 = r10.getRawX()
            long r4 = r1 >> r0
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = r3 - r4
            float r10 = r10.getRawY()
            long r1 = r1 & r7
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r10 = r10 - r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r1 = (long) r1
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r3 = (long) r10
            long r0 = r1 << r0
            long r2 = r3 & r7
            long r0 = r0 | r2
            r9.f939 = r0
            return
    }

    /* JADX INFO: renamed from: Δ */
    public final boolean m376() {
            r2 = this;
            boolean r0 = r2.isFocused()
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            boolean r2 = super.requestFocus(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: Ε */
    public final void m377(p000.yp0 r4) {
            r3 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L58
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L58
            if (r4 == 0) goto L44
        Le:
            if (r4 == 0) goto L3a
            wp0 r0 = r4.m7003()
            wp0 r1 = p000.wp0.f11796
            if (r0 != r1) goto L3a
            boolean r0 = r3.f931
            if (r0 != 0) goto L35
            yp0 r0 = r4.m7005()
            if (r0 == 0) goto L3a
            k31 r0 = r0.f12733
            gm0 r0 = r0.f5726
            long r0 = r0.f2118
            boolean r2 = p000.C1028yo.m6951(r0)
            if (r2 == 0) goto L35
            boolean r0 = p000.C1028yo.m6950(r0)
            if (r0 == 0) goto L35
            goto L3a
        L35:
            yp0 r4 = r4.m7005()
            goto Le
        L3a:
            yp0 r0 = r3.getRoot()
            if (r4 != r0) goto L44
            r3.requestLayout()
            return
        L44:
            int r4 = r3.getWidth()
            if (r4 == 0) goto L55
            int r4 = r3.getHeight()
            if (r4 != 0) goto L51
            goto L55
        L51:
            r3.invalidate()
            return
        L55:
            r3.requestLayout()
        L58:
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public final long m378(long r7) {
            r6 = this;
            r6.m374()
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r6.f939
            long r2 = r2 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r4 = r6.f939
            long r4 = r4 & r2
            int r8 = (int) r4
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r7 = r7 - r8
            int r8 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r7
            long r0 = r4 << r0
            long r7 = r7 & r2
            long r7 = r7 | r0
            float[] r6 = r6.f936
            long r6 = p000.AbstractC0073bd.m850(r6, r7)
            return r6
    }

    /* JADX INFO: renamed from: Η */
    public final int m379(android.view.MotionEvent r11) {
            r10 = this;
            boolean r0 = r10.f926
            r1 = 0
            if (r0 == 0) goto L1e
            r10.f926 = r1
            pn r0 = r10.getComposeViewContext()
            lm0 r0 = r0.f8614
            int r2 = r11.getMetaState()
            r0.getClass()
            x91 r0 = p000.vb2.f11225
            fi1 r3 = new fi1
            r3.<init>(r2)
            r0.setValue(r3)
        L1e:
            b11 r0 = r10.f888
            n5 r2 = r0.m678(r11, r10)
            int r3 = r11.getActionMasked()
            sf r4 = r10.f889
            if (r2 == 0) goto L80
            java.lang.Object r1 = r2.f7387
            java.util.List r1 = (java.util.List) r1
            int r5 = r1.size()
            int r5 = r5 + (-1)
            r6 = 0
            r7 = 5
            if (r5 < 0) goto L51
        L3a:
            int r8 = r5 + (-1)
            java.lang.Object r5 = r1.get(r5)
            r9 = r5
            ci1 r9 = (p000.ci1) r9
            boolean r9 = r9.f2145
            if (r9 == 0) goto L4c
            if (r3 == 0) goto L52
            if (r3 != r7) goto L4c
            goto L52
        L4c:
            if (r8 >= 0) goto L4f
            goto L51
        L4f:
            r5 = r8
            goto L3a
        L51:
            r5 = r6
        L52:
            ci1 r5 = (p000.ci1) r5
            if (r5 == 0) goto L5a
            long r8 = r5.f2144
            r10.f901 = r8
        L5a:
            boolean r1 = r10.m390(r11)
            int r10 = r4.m5493(r2, r10, r1)
            r2.f7388 = r6
            if (r3 == 0) goto L68
            if (r3 != r7) goto L6c
        L68:
            r1 = r10 & 1
            if (r1 == 0) goto L6d
        L6c:
            return r10
        L6d:
            int r1 = r11.getActionIndex()
            int r11 = r11.getPointerId(r1)
            android.util.SparseBooleanArray r1 = r0.f1411
            r1.delete(r11)
            android.util.SparseLongArray r0 = r0.f1410
            r0.delete(r11)
            return r10
        L80:
            boolean r10 = r4.f9879
            if (r10 != 0) goto L96
            java.lang.Object r10 = r4.f9882
            y21 r10 = (p000.y21) r10
            java.lang.Object r10 = r10.f12428
            zv0 r10 = (p000.zv0) r10
            r10.m7233()
            java.lang.Object r10 = r4.f9881
            ke0 r10 = (p000.ke0) r10
            r10.m3208()
        L96:
            return r1
    }

    /* JADX INFO: renamed from: Θ */
    public final void m380(android.view.MotionEvent r18, int r19, long r20, boolean r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            r5 = r19
            int r2 = r1.getActionMasked()
            r3 = -1
            r6 = 1
            if (r2 == r6) goto L17
            r7 = 6
            if (r2 == r7) goto L12
            goto L20
        L12:
            int r3 = r1.getActionIndex()
            goto L20
        L17:
            r2 = 9
            if (r5 == r2) goto L20
            r2 = 10
            if (r5 == r2) goto L20
            r3 = 0
        L20:
            int r2 = r1.getPointerCount()
            if (r3 < 0) goto L28
            r7 = r6
            goto L29
        L28:
            r7 = 0
        L29:
            int r2 = r2 - r7
            if (r2 != 0) goto L2d
            return
        L2d:
            android.view.MotionEvent$PointerProperties[] r7 = new android.view.MotionEvent.PointerProperties[r2]
            r8 = 0
        L30:
            if (r8 >= r2) goto L3c
            android.view.MotionEvent$PointerProperties r9 = new android.view.MotionEvent$PointerProperties
            r9.<init>()
            r7[r8] = r9
            int r8 = r8 + 1
            goto L30
        L3c:
            android.view.MotionEvent$PointerCoords[] r8 = new android.view.MotionEvent.PointerCoords[r2]
            r9 = 0
        L3f:
            if (r9 >= r2) goto L4b
            android.view.MotionEvent$PointerCoords r10 = new android.view.MotionEvent$PointerCoords
            r10.<init>()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L3f
        L4b:
            r9 = 0
        L4c:
            if (r9 >= r2) goto L93
            if (r3 < 0) goto L55
            if (r9 >= r3) goto L53
            goto L55
        L53:
            r10 = r6
            goto L56
        L55:
            r10 = 0
        L56:
            int r10 = r10 + r9
            r11 = r7[r9]
            r1.getPointerProperties(r10, r11)
            r11 = r8[r9]
            r1.getPointerCoords(r10, r11)
            float r10 = r11.x
            float r12 = r11.y
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r13 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r12)
            long r4 = (long) r10
            r10 = 32
            long r13 = r13 << r10
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r15
            long r4 = r4 | r13
            long r4 = r0.m392(r4)
            long r13 = r4 >> r10
            int r10 = (int) r13
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r11.x = r10
            long r4 = r4 & r15
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r11.y = r4
            int r9 = r9 + 1
            r5 = r19
            goto L4c
        L93:
            if (r22 == 0) goto L97
            r10 = 0
            goto L9c
        L97:
            int r4 = r1.getButtonState()
            r10 = r4
        L9c:
            long r3 = r1.getDownTime()
            long r11 = r1.getEventTime()
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 != 0) goto Lab
            r3 = r20
            goto Laf
        Lab:
            long r3 = r1.getDownTime()
        Laf:
            int r9 = r1.getMetaState()
            float r11 = r1.getXPrecision()
            float r12 = r1.getYPrecision()
            int r13 = r1.getDeviceId()
            int r14 = r1.getEdgeFlags()
            int r15 = r1.getSource()
            int r16 = r1.getFlags()
            r5 = r19
            r6 = r2
            r1 = r3
            r3 = r20
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            b11 r2 = r0.f888
            n5 r2 = r2.m678(r1, r0)
            r2.getClass()
            sf r3 = r0.f889
            r4 = 1
            r3.m5493(r2, r0, r4)
            r1.recycle()
            return
    }

    /* JADX INFO: renamed from: Ι */
    public final void m381(android.content.res.Configuration r4) {
            r3 = this;
            android.content.res.Configuration r0 = r3.getConfiguration()
            boolean r1 = p000.ln0.m3626(r0, r4)
            if (r1 != 0) goto L3a
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>(r4)
            r3.setConfiguration(r1)
            float r1 = r0.fontScale
            float r2 = r4.fontScale
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L20
            int r1 = r0.densityDpi
            int r2 = r4.densityDpi
            if (r1 == r2) goto L2b
        L20:
            android.content.Context r1 = r3.getContext()
            as r1 = p000.jx0.m3035(r1)
            r3.setDensity(r1)
        L2b:
            int r4 = r0.diff(r4)
            r0 = -1342235264(0xffffffffafff1d80, float:-4.640519E-10)
            r4 = r4 & r0
            if (r4 == 0) goto L3a
            lm0 r3 = r3.f914
            r3.getClass()
        L3a:
            return
    }

    /* JADX INFO: renamed from: Κ */
    public final void m382() {
            r18 = this;
            r0 = r18
            int[] r1 = r0.f934
            r0.getLocationOnScreen(r1)
            long r2 = r0.f933
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.f937
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L56
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r6 = r6 & r12
            long r6 = r6 | r10
            r0.f933 = r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L56
            if (r2 == r1) goto L56
            yp0 r1 = r0.getRoot()
            k21 r1 = r1.m7009()
            java.lang.Object[] r2 = r1.f5716
            int r1 = r1.f5718
            r4 = r3
        L44:
            if (r4 >= r1) goto L54
            r5 = r2[r4]
            yp0 r5 = (p000.yp0) r5
            bq0 r5 = r5.f12734
            ox0 r5 = r5.f1815
            r5.m4335()
            int r4 = r4 + 1
            goto L44
        L54:
            r1 = r9
            goto L57
        L56:
            r1 = r3
        L57:
            r0.m374()
            android.view.View r2 = r0.f929
            if (r2 != 0) goto L64
            android.view.View r2 = r0.getRootView()
            r0.f929 = r2
        L64:
            ol1 r4 = r0.getRectManager()
            long r11 = r0.f933
            long r5 = r0.f939
            long r13 = p000.h62.m2448(r5)
            int r16 = r2.getWidth()
            int r17 = r2.getHeight()
            r4.getClass()
            float[] r2 = r0.f935
            int r5 = r2.length
            r6 = 16
            r7 = 2
            if (r5 >= r6) goto L86
            r5 = r3
            goto Lf0
        L86:
            r5 = r2[r3]
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r8 = 0
            if (r5 != 0) goto Lca
            r5 = r2[r9]
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = r2[r7]
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = 4
            r5 = r2[r5]
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = 5
            r5 = r2[r5]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = 6
            r5 = r2[r5]
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = 8
            r5 = r2[r5]
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = 9
            r5 = r2[r5]
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = 10
            r5 = r2[r5]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto Lca
            r5 = r9
            goto Lcb
        Lca:
            r5 = r3
        Lcb:
            r10 = 12
            r10 = r2[r10]
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto Led
            r10 = 13
            r10 = r2[r10]
            int r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r10 != 0) goto Led
            r10 = 14
            r10 = r2[r10]
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 != 0) goto Led
            r8 = 15
            r8 = r2[r8]
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto Led
            r6 = r9
            goto Lee
        Led:
            r6 = r3
        Lee:
            int r5 = r5 << r9
            r5 = r5 | r6
        Lf0:
            j42 r10 = r4.f8139
            r5 = r5 & r7
            if (r5 != 0) goto Lf7
        Lf5:
            r15 = r2
            goto Lf9
        Lf7:
            r2 = 0
            goto Lf5
        Lf9:
            boolean r2 = r10.m2861(r11, r13, r15, r16, r17)
            if (r2 != 0) goto L103
            boolean r2 = r4.f8142
            if (r2 == 0) goto L104
        L103:
            r3 = r9
        L104:
            r4.f8142 = r3
            mx0 r2 = r0.f932
            r2.m3900(r1)
            ol1 r0 = r0.getRectManager()
            r0.m4249()
            return
    }

    /* JADX INFO: renamed from: Λ */
    public final void m383(float r3) {
            r2 = this;
            boolean r0 = m371()
            if (r0 == 0) goto L30
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1c
            float r0 = r2.f958
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L19
            float r0 = r2.f958
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
        L19:
            r2.f958 = r3
            return
        L1c:
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
            float r0 = r2.f959
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2e
            float r0 = r2.f959
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
        L2e:
            r2.f959 = r3
        L30:
            return
    }

    @Override // p000.t40
    /* JADX INFO: renamed from: α */
    public final void mo384(p000.c50 r8, p000.c50 r9) {
            r7 = this;
            if (r8 == 0) goto L7a
            q01 r7 = r8.f8771
            boolean r7 = r7.f8784
            if (r7 != 0) goto Ld
            java.lang.String r7 = "visitAncestors called on an unattached node"
            p000.am0.m178(r7)
        Ld:
            q01 r7 = r8.f8771
            yp0 r8 = p000.h62.m2445(r8)
        L13:
            if (r8 == 0) goto L7a
            k31 r9 = r8.f12733
            q01 r9 = r9.f5729
            int r9 = r9.f8774
            r0 = 2097152(0x200000, float:2.938736E-39)
            r9 = r9 & r0
            r1 = 0
            if (r9 == 0) goto L6b
        L21:
            if (r7 == 0) goto L6b
            int r9 = r7.f8773
            r9 = r9 & r0
            if (r9 == 0) goto L68
            r9 = r7
            r2 = r1
        L2a:
            if (r9 == 0) goto L68
            int r3 = r9.f8773
            r3 = r3 & r0
            if (r3 == 0) goto L63
            boolean r3 = r9 instanceof p000.C1014ya
            if (r3 == 0) goto L63
            r3 = r9
            ya r3 = (p000.C1014ya) r3
            q01 r3 = r3.f12512
            r4 = 0
        L3b:
            r5 = 1
            if (r3 == 0) goto L60
            int r6 = r3.f8773
            r6 = r6 & r0
            if (r6 == 0) goto L5d
            int r4 = r4 + 1
            if (r4 != r5) goto L49
            r9 = r3
            goto L5d
        L49:
            if (r2 != 0) goto L54
            k21 r2 = new k21
            r5 = 16
            q01[] r5 = new p000.q01[r5]
            r2.<init>(r5)
        L54:
            if (r9 == 0) goto L5a
            r2.m3127(r9)
            r9 = r1
        L5a:
            r2.m3127(r3)
        L5d:
            q01 r3 = r3.f8776
            goto L3b
        L60:
            if (r4 != r5) goto L63
            goto L2a
        L63:
            q01 r9 = p000.h62.m2387(r2)
            goto L2a
        L68:
            q01 r7 = r7.f8775
            goto L21
        L6b:
            yp0 r8 = r8.m7005()
            if (r8 == 0) goto L78
            k31 r7 = r8.f12733
            if (r7 == 0) goto L78
            q22 r7 = r7.f5728
            goto L13
        L78:
            r7 = r1
            goto L13
        L7a:
            return
    }

    @Override // p000.InterfaceC0332gr
    /* JADX INFO: renamed from: δ */
    public final void mo385(p000.hr0 r2) {
            r1 = this;
            lr0 r1 = r1.f905
            if (r1 == 0) goto L3b
            n r2 = r1.f6748
            java.lang.Object r2 = r2.f7336
            vw0 r2 = (p000.vw0) r2
            boolean r0 = r2.f11451
            if (r0 == 0) goto L1d
            boolean r0 = r2.f11453
            if (r0 != 0) goto L1d
            be r2 = r1.f6751
            if (r2 == 0) goto L19
            r2.cancel()
        L19:
            r2 = 0
            r1.f6751 = r2
            return
        L1d:
            boolean r1 = r2.f11452
            if (r1 == 0) goto L22
            goto L3b
        L22:
            boolean r1 = r2.f11453
            if (r1 != 0) goto L2b
            java.lang.String r1 = "ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?"
            p000.qi1.m4885(r1)
        L2b:
            b21 r1 = r2.f11454
            boolean r1 = r1.m697()
            if (r1 != 0) goto L38
            java.lang.String r1 = "Attempted to start retaining exited values with pending exited values"
            p000.qi1.m4885(r1)
        L38:
            r1 = 0
            r2.f11453 = r1
        L3b:
            return
    }

    @Override // p000.InterfaceC0332gr
    /* JADX INFO: renamed from: θ */
    public final void mo386(p000.hr0 r4) {
            r3 = this;
            lr0 r4 = r3.f905
            if (r4 == 0) goto L48
            kr0 r3 = r3.f904
            r3.getClass()
            n r0 = r4.f6748
            java.lang.Object r1 = r0.f7336
            vw0 r1 = (p000.vw0) r1
            boolean r2 = r1.f11451
            if (r2 == 0) goto L48
            boolean r1 = r1.f11453
            if (r1 != 0) goto L48
            k1 r1 = new k1     // Catch: java.util.concurrent.CancellationException -> L26
            r2 = 6
            r1.<init>(r2, r4)     // Catch: java.util.concurrent.CancellationException -> L26
            id2 r3 = (p000.id2) r3     // Catch: java.util.concurrent.CancellationException -> L26
            un r3 = r3.f5034     // Catch: java.util.concurrent.CancellationException -> L26
            be r3 = r3.mo3330(r1)     // Catch: java.util.concurrent.CancellationException -> L26
            goto L3f
        L26:
            java.lang.Object r3 = r0.f7336
            vw0 r3 = (p000.vw0) r3
            boolean r0 = r3.f11452
            if (r0 == 0) goto L2f
            goto L3e
        L2f:
            boolean r0 = r3.f11453
            if (r0 == 0) goto L38
            java.lang.String r0 = "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"
            p000.qi1.m4885(r0)
        L38:
            r3.m6282()
            r0 = 1
            r3.f11453 = r0
        L3e:
            r3 = 0
        L3f:
            be r0 = r4.f6751
            if (r0 == 0) goto L46
            r0.cancel()
        L46:
            r4.f6751 = r3
        L48:
            return
    }

    /* JADX INFO: renamed from: λ */
    public final void m387(p000.yp0 r1, boolean r2) {
            r0 = this;
            mx0 r0 = r0.f932
            r0.m3902(r1, r2)
            return
    }

    /* JADX INFO: renamed from: μ */
    public final int m388(android.view.MotionEvent r17) {
            r16 = this;
            r1 = r16
            r0 = r17
            d1 r2 = r1.f920
            r1.removeCallbacks(r2)
            r7 = 0
            r16.m375(r17)     // Catch: java.lang.Throwable -> L16c
            r8 = 1
            r1.f938 = r8     // Catch: java.lang.Throwable -> L16c
            r1.m393(r7)     // Catch: java.lang.Throwable -> L16c
            java.lang.String r2 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L16c
            int r9 = r0.getActionMasked()     // Catch: java.lang.Throwable -> L2b
            android.view.MotionEvent r2 = r1.f954     // Catch: java.lang.Throwable -> L2b
            r10 = 3
            if (r2 == 0) goto L29
            int r3 = r2.getToolType(r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 != r10) goto L29
            r11 = r8
            goto L2e
        L29:
            r11 = r7
            goto L2e
        L2b:
            r0 = move-exception
            goto L16e
        L2e:
            r12 = 10
            sf r13 = r1.f889
            if (r2 == 0) goto L7b
            int r3 = r2.getSource()     // Catch: java.lang.Throwable -> L76
            int r4 = r0.getSource()     // Catch: java.lang.Throwable -> L76
            if (r3 != r4) goto L4b
            int r3 = r2.getToolType(r7)     // Catch: java.lang.Throwable -> L76
            int r4 = r0.getToolType(r7)     // Catch: java.lang.Throwable -> L76
            if (r3 == r4) goto L49
            goto L4b
        L49:
            r3 = r7
            goto L4c
        L4b:
            r3 = r8
        L4c:
            if (r3 == 0) goto L7b
            int r3 = r2.getButtonState()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L56
        L54:
            r14 = r2
            goto L7d
        L56:
            int r3 = r2.getActionMasked()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L54
            r4 = 2
            if (r3 == r4) goto L54
            r4 = 6
            if (r3 == r4) goto L54
            int r3 = r2.getActionMasked()     // Catch: java.lang.Throwable -> L76
            if (r3 == r12) goto L7b
            if (r11 == 0) goto L7b
            long r4 = r2.getEventTime()     // Catch: java.lang.Throwable -> L76
            r6 = 1
            r3 = 10
            r1.m380(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L76
            r14 = r2
            goto L93
        L76:
            r0 = move-exception
            r1 = r16
            goto L16e
        L7b:
            r14 = r2
            goto L93
        L7d:
            boolean r1 = r13.f9879     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L93
            java.lang.Object r1 = r13.f9882     // Catch: java.lang.Throwable -> L76
            y21 r1 = (p000.y21) r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.f12428     // Catch: java.lang.Throwable -> L76
            zv0 r1 = (p000.zv0) r1     // Catch: java.lang.Throwable -> L76
            r1.m7233()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r13.f9881     // Catch: java.lang.Throwable -> L76
            ke0 r1 = (p000.ke0) r1     // Catch: java.lang.Throwable -> L76
            r1.m3208()     // Catch: java.lang.Throwable -> L76
        L93:
            int r1 = r0.getToolType(r7)     // Catch: java.lang.Throwable -> L76
            if (r1 != r10) goto L9b
            r1 = r8
            goto L9c
        L9b:
            r1 = r7
        L9c:
            r15 = 9
            if (r11 != 0) goto Lba
            if (r1 == 0) goto Lba
            if (r9 == r10) goto Lba
            if (r9 == r15) goto Lba
            boolean r1 = r16.m390(r17)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto Lba
            long r4 = r0.getEventTime()     // Catch: java.lang.Throwable -> L76
            r6 = 1
            r3 = 9
            r1 = r16
            r2 = r0
            r1.m380(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2b
            goto Lbc
        Lba:
            r1 = r16
        Lbc:
            if (r14 == 0) goto Lc1
            r14.recycle()     // Catch: java.lang.Throwable -> L2b
        Lc1:
            android.view.MotionEvent r0 = r1.f954     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L15c
            int r0 = r0.getAction()     // Catch: java.lang.Throwable -> L2b
            if (r0 != r12) goto L15c
            android.view.MotionEvent r0 = r1.f954     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Ld4
            int r0 = r0.getPointerId(r7)     // Catch: java.lang.Throwable -> L2b
            goto Ld5
        Ld4:
            r0 = -1
        Ld5:
            int r2 = r17.getAction()     // Catch: java.lang.Throwable -> L2b
            b11 r3 = r1.f888
            if (r2 != r15) goto Lf1
            int r2 = r17.getHistorySize()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto Lf1
            if (r0 < 0) goto L15c
            android.util.SparseBooleanArray r2 = r3.f1411     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
            android.util.SparseLongArray r2 = r3.f1410     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
            goto L15c
        Lf1:
            int r2 = r17.getAction()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L15c
            int r2 = r17.getHistorySize()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L15c
            android.view.MotionEvent r2 = r1.f954     // Catch: java.lang.Throwable -> L2b
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r2 == 0) goto L108
            float r2 = r2.getX()     // Catch: java.lang.Throwable -> L2b
            goto L109
        L108:
            r2 = r4
        L109:
            android.view.MotionEvent r5 = r1.f954     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L111
            float r4 = r5.getY()     // Catch: java.lang.Throwable -> L2b
        L111:
            float r5 = r17.getX()     // Catch: java.lang.Throwable -> L2b
            float r6 = r17.getY()     // Catch: java.lang.Throwable -> L2b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L123
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L123
            r2 = r7
            goto L124
        L123:
            r2 = r8
        L124:
            android.view.MotionEvent r4 = r1.f954     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L12d
            long r4 = r4.getEventTime()     // Catch: java.lang.Throwable -> L2b
            goto L12f
        L12d:
            r4 = -1
        L12f:
            long r9 = r17.getEventTime()     // Catch: java.lang.Throwable -> L2b
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 == 0) goto L139
            r4 = r8
            goto L13a
        L139:
            r4 = r7
        L13a:
            if (r2 != 0) goto L13e
            if (r4 == 0) goto L15c
        L13e:
            if (r0 < 0) goto L14a
            android.util.SparseBooleanArray r2 = r3.f1411     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
            android.util.SparseLongArray r2 = r3.f1410     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
        L14a:
            java.lang.Object r0 = r13.f9881     // Catch: java.lang.Throwable -> L2b
            ke0 r0 = (p000.ke0) r0     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r0.f5870     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L155
            r0.f5870 = r8     // Catch: java.lang.Throwable -> L2b
            goto L15c
        L155:
            t31 r0 = r0.f5873     // Catch: java.lang.Throwable -> L2b
            k21 r0 = r0.f10166     // Catch: java.lang.Throwable -> L2b
            r0.m3132()     // Catch: java.lang.Throwable -> L2b
        L15c:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r17)     // Catch: java.lang.Throwable -> L2b
            r1.f954 = r0     // Catch: java.lang.Throwable -> L2b
            int r0 = r16.m379(r17)     // Catch: java.lang.Throwable -> L2b
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L16c
            r1.f938 = r7
            return r0
        L16c:
            r0 = move-exception
            goto L172
        L16e:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L16c
            throw r0     // Catch: java.lang.Throwable -> L16c
        L172:
            r1.f938 = r7
            throw r0
    }

    /* JADX INFO: renamed from: ξ */
    public final void m389(p000.yp0 r4) {
            r3 = this;
            mx0 r0 = r3.f932
            r1 = 0
            r0.m3909(r4, r1)
            k21 r4 = r4.m7009()
            java.lang.Object[] r0 = r4.f5716
            int r4 = r4.f5718
        Le:
            if (r1 >= r4) goto L1a
            r2 = r0[r1]
            yp0 r2 = (p000.yp0) r2
            r3.m389(r2)
            int r1 = r1 + 1
            goto Le
        L1a:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final boolean m390(android.view.MotionEvent r4) {
            r3 = this;
            float r0 = r4.getX()
            float r4 = r4.getY()
            r1 = 0
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 > 0) goto L25
            int r2 = r3.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L25
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L25
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 > 0) goto L25
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: σ */
    public final boolean m391(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getPointerCount()
            r1 = 1
            if (r0 == r1) goto L8
            goto L30
        L8:
            android.view.MotionEvent r3 = r3.f954
            if (r3 == 0) goto L30
            int r0 = r3.getPointerCount()
            int r2 = r4.getPointerCount()
            if (r0 != r2) goto L30
            float r0 = r4.getRawX()
            float r2 = r3.getRawX()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L30
            float r4 = r4.getRawY()
            float r3 = r3.getRawY()
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L30
            r3 = 0
            return r3
        L30:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public final long m392(long r8) {
            r7 = this;
            r7.m374()
            float[] r0 = r7.f935
            long r8 = p000.AbstractC0073bd.m850(r0, r8)
            r0 = 32
            long r1 = r8 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7.f939
            long r2 = r2 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r5 = r7.f939
            long r5 = r5 & r3
            int r7 = (int) r5
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r7 = r7 + r8
            int r8 = java.lang.Float.floatToRawIntBits(r2)
            long r8 = (long) r8
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r1 = (long) r7
            long r7 = r8 << r0
            long r0 = r1 & r3
            long r7 = r7 | r0
            return r7
    }

    /* JADX INFO: renamed from: υ */
    public final void m393(boolean r3) {
            r2 = this;
            mx0 r0 = r2.f932
            m6 r1 = r0.f7311
            boolean r1 = r1.m3762()
            if (r1 != 0) goto L16
            n5 r1 = r0.f7314
            java.lang.Object r1 = r1.f7387
            k21 r1 = (p000.k21) r1
            int r1 = r1.f5718
            if (r1 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            java.lang.String r1 = "AndroidOwner:measureAndLayout"
            android.os.Trace.beginSection(r1)
            if (r3 == 0) goto L20
            x0 r3 = r2.f924     // Catch: java.lang.Throwable -> L39
            goto L21
        L20:
            r3 = 0
        L21:
            boolean r3 = r0.m3904(r3)     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L2a
            r2.requestLayout()     // Catch: java.lang.Throwable -> L39
        L2a:
            r3 = 0
            r0.m3900(r3)     // Catch: java.lang.Throwable -> L39
            ol1 r2 = r2.getRectManager()     // Catch: java.lang.Throwable -> L39
            r2.m4249()     // Catch: java.lang.Throwable -> L39
            android.os.Trace.endSection()
            return
        L39:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    /* JADX INFO: renamed from: φ */
    public final void m394() {
            r10 = this;
            boolean r0 = r10.f894
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L48
            y81 r0 = r10.getSnapshotObserver()
            kx1 r0 = r0.f12491
            java.lang.Object r3 = r0.f6304
            monitor-enter(r3)
            k21 r0 = r0.f6303     // Catch: java.lang.Throwable -> L36
            int r4 = r0.f5718     // Catch: java.lang.Throwable -> L36
            r5 = r2
            r6 = r5
        L15:
            java.lang.Object[] r7 = r0.f5716
            if (r5 >= r4) goto L3b
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L36
            jx1 r7 = (p000.jx1) r7     // Catch: java.lang.Throwable -> L36
            r7.m3070()     // Catch: java.lang.Throwable -> L36
            b21 r7 = r7.f5640     // Catch: java.lang.Throwable -> L36
            boolean r7 = r7.m698()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L2b
            int r6 = r6 + 1
            goto L38
        L2b:
            if (r6 <= 0) goto L38
            java.lang.Object[] r7 = r0.f5716     // Catch: java.lang.Throwable -> L36
            int r8 = r5 - r6
            r9 = r7[r5]     // Catch: java.lang.Throwable -> L36
            r7[r8] = r9     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r10 = move-exception
            goto L46
        L38:
            int r5 = r5 + 1
            goto L15
        L3b:
            int r5 = r4 - r6
            java.util.Arrays.fill(r7, r5, r4, r1)     // Catch: java.lang.Throwable -> L36
            r0.f5718 = r5     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            r10.f894 = r2
            goto L48
        L46:
            monitor-exit(r3)
            throw r10
        L48:
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r10.f898
            if (r0 == 0) goto L4f
            m368(r0)
        L4f:
            k0 r0 = r10.f893
            if (r0 == 0) goto L6f
            o11 r3 = r0.f5687
            int r4 = r3.f7869
            if (r4 != 0) goto L68
            boolean r4 = r0.f5688
            if (r4 == 0) goto L68
            y21 r4 = r0.f5681
            java.lang.Object r4 = r4.f12428
            android.view.autofill.AutofillManager r4 = (android.view.autofill.AutofillManager) r4
            r4.commit()
            r0.f5688 = r2
        L68:
            int r3 = r3.f7869
            if (r3 == 0) goto L6f
            r3 = 1
            r0.f5688 = r3
        L6f:
            v11 r0 = r10.f957
            boolean r0 = r0.m6023()
            if (r0 == 0) goto Lac
            v11 r0 = r10.f957
            java.lang.Object r0 = r0.m6020(r2)
            if (r0 == 0) goto Lac
            v11 r0 = r10.f957
            int r0 = r0.f11065
            r3 = r2
        L84:
            v11 r4 = r10.f957
            if (r3 >= r0) goto La8
            java.lang.Object r4 = r4.m6020(r3)
            p70 r4 = (p000.p70) r4
            v11 r5 = r10.f957
            if (r3 < 0) goto La4
            int r6 = r5.f11065
            if (r3 >= r6) goto La4
            java.lang.Object[] r5 = r5.f11064
            r6 = r5[r3]
            r5[r3] = r1
            if (r4 == 0) goto La1
            r4.invoke()
        La1:
            int r3 = r3 + 1
            goto L84
        La4:
            r5.m6028(r3)
            throw r1
        La8:
            r4.m6026(r2, r0)
            goto L6f
        Lac:
            return
    }

    /* JADX INFO: renamed from: χ */
    public final void m395(p000.yp0 r4) {
            r3 = this;
            l1 r0 = r3.f880
            r1 = 1
            r0.f6342 = r1
            boolean r2 = r0.m3459()
            if (r2 != 0) goto Lc
            goto Lf
        Lc:
            r0.m3460(r4)
        Lf:
            z1 r3 = r3.f881
            r3.f12930 = r1
            boolean r4 = r3.m7060()
            if (r4 == 0) goto L20
            wc r3 = r3.f12931
            s62 r4 = p000.s62.f9751
            r3.mo3385(r4)
        L20:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m396(p000.yp0 r6, boolean r7, boolean r8) {
            r5 = this;
            mx0 r0 = r5.f932
            if (r7 == 0) goto L92
            m6 r7 = r0.f7311
            yp0 r1 = r6.f12750
            bq0 r2 = r6.f12734
            if (r1 == 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"
            p000.am0.m178(r1)
        L12:
            up0 r1 = r2.f1803
            int r1 = r1.ordinal()
            r3 = 1
            if (r1 == 0) goto L87
            if (r1 == r3) goto L9b
            r4 = 2
            if (r1 == r4) goto L87
            r4 = 3
            if (r1 == r4) goto L87
            r4 = 4
            if (r1 != r4) goto L83
            boolean r1 = r2.f1804
            if (r1 == 0) goto L2e
            if (r8 != 0) goto L2e
            goto L9b
        L2e:
            r2.f1804 = r3
            ox0 r8 = r2.f1815
            r8.f8342 = r3
            boolean r8 = r6.f12742
            if (r8 == 0) goto L39
            goto L9b
        L39:
            java.lang.Boolean r8 = r6.m6979()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = p000.ln0.m3626(r8, r1)
            if (r8 != 0) goto L4b
            boolean r8 = p000.mx0.m3897(r6)
            if (r8 == 0) goto L57
        L4b:
            yp0 r8 = r6.m7005()
            if (r8 == 0) goto L76
            bq0 r8 = r8.f12734
            boolean r8 = r8.f1804
            if (r8 != r3) goto L76
        L57:
            boolean r8 = r6.m6978()
            if (r8 != 0) goto L63
            boolean r8 = p000.mx0.m3898(r6)
            if (r8 == 0) goto L7b
        L63:
            yp0 r8 = r6.m7005()
            if (r8 == 0) goto L70
            boolean r8 = r8.m7002()
            if (r8 != r3) goto L70
            goto L7b
        L70:
            qn0 r8 = p000.qn0.f9054
            r7.m3781(r6, r8)
            goto L7b
        L76:
            qn0 r8 = p000.qn0.f9052
            r7.m3781(r6, r8)
        L7b:
            boolean r7 = r0.f7313
            if (r7 != 0) goto L9b
            r5.m377(r6)
            return
        L83:
            p000.C1080.m7272()
            return
        L87:
            k21 r5 = r0.f7317
            lx0 r7 = new lx0
            r7.<init>(r6, r3, r8)
            r5.m3127(r7)
            return
        L92:
            boolean r7 = r0.m3909(r6, r8)
            if (r7 == 0) goto L9b
            r5.m377(r6)
        L9b:
            return
    }

    /* JADX INFO: renamed from: ω */
    public final void m397(p000.yp0 r10, boolean r11, boolean r12) {
            r9 = this;
            bq0 r0 = r10.f12734
            r1 = 0
            qn0 r2 = p000.qn0.f9055
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            mx0 r7 = r9.f932
            if (r11 == 0) goto L8b
            m6 r11 = r7.f7311
            up0 r8 = r0.f1803
            int r8 = r8.ordinal()
            if (r8 == 0) goto L24
            if (r8 == r6) goto L100
            if (r8 == r5) goto L24
            if (r8 == r4) goto L100
            if (r8 != r3) goto L20
            goto L24
        L20:
            p000.C1080.m7272()
            return
        L24:
            boolean r3 = r0.f1804
            if (r3 != 0) goto L2c
            boolean r3 = r0.f1805
            if (r3 == 0) goto L30
        L2c:
            if (r12 != 0) goto L30
            goto L100
        L30:
            r0.f1805 = r6
            r0.f1806 = r6
            ox0 r12 = r0.f1815
            r12.f8343 = r6
            r12.f8315 = r6
            boolean r12 = r10.f12742
            if (r12 == 0) goto L40
            goto L100
        L40:
            yp0 r12 = r10.m7005()
            java.lang.Boolean r0 = r10.m6979()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto L68
            if (r12 == 0) goto L59
            bq0 r0 = r12.f12734
            boolean r0 = r0.f1804
            if (r0 != r6) goto L59
            goto L68
        L59:
            if (r12 == 0) goto L62
            bq0 r0 = r12.f12734
            boolean r0 = r0.f1805
            if (r0 != r6) goto L62
            goto L68
        L62:
            qn0 r12 = p000.qn0.f9053
            r11.m3781(r10, r12)
            goto L83
        L68:
            boolean r0 = r10.m6978()
            if (r0 == 0) goto L83
            if (r12 == 0) goto L77
            boolean r0 = r12.m7001()
            if (r0 != r6) goto L77
            goto L83
        L77:
            if (r12 == 0) goto L80
            boolean r12 = r12.m7002()
            if (r12 != r6) goto L80
            goto L83
        L80:
            r11.m3781(r10, r2)
        L83:
            boolean r10 = r7.f7313
            if (r10 != 0) goto L100
            r9.m377(r1)
            return
        L8b:
            r7.getClass()
            up0 r11 = r0.f1803
            int r11 = r11.ordinal()
            if (r11 == 0) goto L100
            if (r11 == r6) goto L100
            if (r11 == r5) goto L100
            if (r11 == r4) goto L100
            if (r11 != r3) goto Lfd
            yp0 r11 = r10.m7005()
            if (r11 == 0) goto Lad
            boolean r3 = r11.m6978()
            if (r3 == 0) goto Lab
            goto Lad
        Lab:
            r3 = 0
            goto Lae
        Lad:
            r3 = r6
        Lae:
            if (r12 != 0) goto Lcd
            boolean r12 = r10.m7002()
            if (r12 != 0) goto L100
            boolean r12 = r10.m7001()
            if (r12 == 0) goto Lcd
            boolean r12 = r10.m6978()
            if (r12 != r3) goto Lcd
            boolean r12 = r10.m6978()
            ox0 r4 = r0.f1815
            boolean r4 = r4.f8341
            if (r12 != r4) goto Lcd
            goto L100
        Lcd:
            ox0 r12 = r0.f1815
            r12.f8343 = r6
            r12.f8315 = r6
            boolean r0 = r10.f12742
            if (r0 == 0) goto Ld8
            goto L100
        Ld8:
            boolean r12 = r12.f8341
            if (r12 == 0) goto L100
            if (r3 == 0) goto L100
            if (r11 == 0) goto Le7
            boolean r12 = r11.m7001()
            if (r12 != r6) goto Le7
            goto Lf5
        Le7:
            if (r11 == 0) goto Lf0
            boolean r11 = r11.m7002()
            if (r11 != r6) goto Lf0
            goto Lf5
        Lf0:
            m6 r11 = r7.f7311
            r11.m3781(r10, r2)
        Lf5:
            boolean r10 = r7.f7313
            if (r10 != 0) goto L100
            r9.m377(r1)
            return
        Lfd:
            p000.C1080.m7272()
        L100:
            return
    }
}
