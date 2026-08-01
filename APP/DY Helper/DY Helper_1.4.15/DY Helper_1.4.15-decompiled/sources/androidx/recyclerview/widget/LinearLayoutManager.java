package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends p000.zl1 implements p000.jm1 {

    /* JADX INFO: renamed from: λ */
    public final int f1110;

    /* JADX INFO: renamed from: μ */
    public p000.bs0 f1111;

    /* JADX INFO: renamed from: ν */
    public final p000.AbstractC1118 f1112;

    /* JADX INFO: renamed from: ξ */
    public final boolean f1113;

    /* JADX INFO: renamed from: ο */
    public final boolean f1114;

    /* JADX INFO: renamed from: π */
    public boolean f1115;

    /* JADX INFO: renamed from: ρ */
    public final boolean f1116;

    /* JADX INFO: renamed from: σ */
    public final int[] f1117;

    public LinearLayoutManager(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.f1110 = r0
            r1 = 0
            r3.f1113 = r1
            r3.f1114 = r1
            r3.f1115 = r1
            r3.f1116 = r0
            as0 r1 = new as0
            r2 = 0
            r1.<init>(r2)
            r2 = -1
            r1.f1293 = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f1294 = r2
            r2 = 0
            r1.f1295 = r2
            r1.f1296 = r2
            r1 = 2
            int[] r1 = new int[r1]
            r3.f1117 = r1
            as0 r4 = p000.zl1.m7164(r4, r5, r6, r7)
            int r5 = r4.f1293
            if (r5 == 0) goto L3c
            if (r5 != r0) goto L31
            goto L3c
        L31:
            java.lang.String r3 = "invalid orientation:"
            java.lang.String r3 = p000.a12.m17(r3, r5)
            p000.C1080.m7275(r3)
            r3 = 0
            throw r3
        L3c:
            r6 = 0
            r3.mo491(r6)
            int r7 = r3.f1110
            if (r5 != r7) goto L48
            р r7 = r3.f1112
            if (r7 != 0) goto L53
        L48:
            р r7 = p000.AbstractC1118.m7301(r3, r5)
            r3.f1112 = r7
            r3.f1110 = r5
            r3.m7171()
        L53:
            boolean r5 = r4.f1295
            r3.mo491(r6)
            boolean r6 = r3.f1113
            if (r5 != r6) goto L5d
            goto L62
        L5d:
            r3.f1113 = r5
            r3.m7171()
        L62:
            boolean r4 = r4.f1296
            r3.mo479(r4)
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Δ */
    public final boolean mo483() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ε */
    public final boolean mo484() {
            r0 = this;
            boolean r0 = r0.f1113
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ι */
    public final void mo485(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Κ */
    public final void mo486(android.view.accessibility.AccessibilityEvent r5) {
            r4 = this;
            super.mo486(r5)
            int r0 = r4.m7175()
            if (r0 <= 0) goto L3d
            int r0 = r4.m7175()
            r1 = 0
            android.view.View r0 = r4.m503(r1, r0, r1)
            r2 = 0
            if (r0 != 0) goto L33
            r0 = -1
            r5.setFromIndex(r0)
            int r3 = r4.m7175()
            int r3 = r3 + (-1)
            android.view.View r4 = r4.m503(r3, r0, r1)
            if (r4 != 0) goto L29
            r5.setToIndex(r0)
            return
        L29:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            am1 r4 = (p000.am1) r4
            r4.getClass()
            throw r2
        L33:
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            am1 r4 = (p000.am1) r4
            r4.getClass()
            throw r2
        L3d:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Λ */
    public void mo466(p000.fm1 r1, p000.km1 r2, p000.C1128 r3) {
            r0 = this;
            super.mo466(r1, r2, r3)
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            r0.getClass()
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Μ */
    public final android.os.Parcelable mo487() {
            r4 = this;
            cs0 r0 = new cs0
            r0.<init>()
            int r1 = r4.m7175()
            if (r1 <= 0) goto L46
            r4.m500()
            boolean r1 = r4.f1114
            r0.f2736 = r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L36
            if (r1 == 0) goto L19
            goto L1f
        L19:
            int r1 = r4.m7175()
            int r3 = r1 + (-1)
        L1f:
            android.view.View r1 = r4.m7174(r3)
            р r3 = r4.f1112
            int r3 = r3.mo3526()
            р r4 = r4.f1112
            int r4 = r4.mo3523(r1)
            int r3 = r3 - r4
            r0.f2735 = r3
            p000.zl1.m7166(r1)
            throw r2
        L36:
            if (r1 == 0) goto L3e
            int r0 = r4.m7175()
            int r3 = r0 + (-1)
        L3e:
            android.view.View r4 = r4.m7174(r3)
            p000.zl1.m7166(r4)
            throw r2
        L46:
            r4 = -1
            r0.f2734 = r4
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ξ */
    public boolean mo467(int r3, android.os.Bundle r4) {
            r2 = this;
            boolean r0 = super.mo467(r3, r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 16908343(0x1020037, float:2.3877383E-38)
            if (r3 != r0) goto L4b
            if (r4 == 0) goto L4b
            int r3 = r2.f1110
            r0 = -1
            if (r3 != r1) goto L2d
            java.lang.String r3 = "android.view.accessibility.action.ARGUMENT_ROW_INT"
            int r3 = r4.getInt(r3, r0)
            if (r3 >= 0) goto L1d
            goto L4b
        L1d:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f13153
            fm1 r0 = r4.f1151
            km1 r4 = r4.f1174
            int r4 = r2.mo465(r0, r4)
            int r4 = r4 - r1
            int r3 = java.lang.Math.min(r3, r4)
            goto L45
        L2d:
            java.lang.String r3 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT"
            int r3 = r4.getInt(r3, r0)
            if (r3 >= 0) goto L36
            goto L4b
        L36:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f13153
            fm1 r0 = r4.f1151
            km1 r4 = r4.f1174
            int r4 = r2.mo478(r0, r4)
            int r4 = r4 - r1
            int r3 = java.lang.Math.min(r3, r4)
        L45:
            if (r3 < 0) goto L4b
            r2.m7171()
            return r1
        L4b:
            r2 = 0
            return r2
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Τ */
    public int mo468(int r4, p000.fm1 r5, p000.km1 r6) {
            r3 = this;
            int r0 = r3.f1110
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            r3.m504(r4, r5, r6)
            return r2
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Υ */
    public final void mo488(int r1) {
            r0 = this;
            r0.m7171()
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Φ */
    public int mo469(int r3, p000.fm1 r4, p000.km1 r5) {
            r2 = this;
            int r0 = r2.f1110
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2.m504(r3, r4, r5)
            return r1
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ψ */
    public final void mo489(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            ds0 r0 = new ds0
            android.content.Context r2 = r2.getContext()
            r0.<init>(r2)
            r2 = 0
            r0.f3252 = r2
            r1.m7173(r0)
            return
    }

    @Override // p000.jm1
    /* JADX INFO: renamed from: α */
    public final android.graphics.PointF mo490(int r2) {
            r1 = this;
            int r2 = r1.m7175()
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            r2 = 0
            android.view.View r1 = r1.m7174(r2)
            p000.zl1.m7166(r1)
            throw r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: β */
    public final void mo491(java.lang.String r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.f13153
            if (r0 == 0) goto L7
            r0.m518(r1)
        L7:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: γ */
    public final boolean mo492() {
            r0 = this;
            int r0 = r0.f1110
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: δ */
    public final boolean mo493() {
            r1 = this;
            int r1 = r1.f1110
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: η */
    public final int mo494(p000.km1 r1) {
            r0 = this;
            int r0 = r0.m497(r1)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: θ */
    public void mo471(p000.km1 r1) {
            r0 = this;
            r0.m498(r1)
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ι */
    public int mo472(p000.km1 r1) {
            r0 = this;
            int r0 = r0.m499(r1)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: κ */
    public final int mo495(p000.km1 r1) {
            r0 = this;
            int r0 = r0.m497(r1)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: λ */
    public void mo473(p000.km1 r1) {
            r0 = this;
            r0.m498(r1)
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: μ */
    public int mo474(p000.km1 r1) {
            r0 = this;
            int r0 = r0.m499(r1)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ν */
    public final void mo496() {
            r1 = this;
            int r0 = r1.m7175()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            android.view.View r1 = r1.m7174(r0)
            p000.zl1.m7166(r1)
            r1 = 0
            throw r1
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ξ */
    public p000.am1 mo475() {
            r1 = this;
            am1 r1 = new am1
            r0 = -2
            r1.<init>(r0, r0)
            return r1
    }

    /* JADX INFO: renamed from: а */
    public final int m497(p000.km1 r8) {
            r7 = this;
            int r0 = r7.m7175()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r7.m500()
            boolean r0 = r7.f1116
            r0 = r0 ^ 1
            android.view.View r3 = r7.m502(r0)
            android.view.View r4 = r7.m501(r0)
            boolean r6 = r7.f1116
            р r2 = r7.f1112
            r5 = r7
            r1 = r8
            int r7 = p000.j81.m2910(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: б */
    public final void m498(p000.km1 r3) {
            r2 = this;
            int r0 = r2.m7175()
            if (r0 != 0) goto L7
            goto L32
        L7:
            r2.m500()
            boolean r0 = r2.f1116
            r0 = r0 ^ 1
            android.view.View r1 = r2.m502(r0)
            android.view.View r0 = r2.m501(r0)
            int r2 = r2.m7175()
            if (r2 == 0) goto L32
            int r2 = r3.m3336()
            if (r2 == 0) goto L32
            if (r1 == 0) goto L32
            if (r0 != 0) goto L27
            goto L32
        L27:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            am1 r2 = (p000.am1) r2
            r2.getClass()
            r2 = 0
            throw r2
        L32:
            return
    }

    /* JADX INFO: renamed from: в */
    public final int m499(p000.km1 r8) {
            r7 = this;
            int r0 = r7.m7175()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r7.m500()
            boolean r0 = r7.f1116
            r0 = r0 ^ 1
            android.view.View r3 = r7.m502(r0)
            android.view.View r4 = r7.m501(r0)
            boolean r6 = r7.f1116
            р r2 = r7.f1112
            r5 = r7
            r1 = r8
            int r7 = p000.j81.m2911(r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: г */
    public final void m500() {
            r1 = this;
            bs0 r0 = r1.f1111
            if (r0 != 0) goto Lb
            bs0 r0 = new bs0
            r0.<init>()
            r1.f1111 = r0
        Lb:
            return
    }

    /* JADX INFO: renamed from: д */
    public final android.view.View m501(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1114
            if (r0 == 0) goto Le
            r0 = 0
            int r1 = r2.m7175()
            android.view.View r2 = r2.m503(r0, r1, r3)
            return r2
        Le:
            int r0 = r2.m7175()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r2 = r2.m503(r0, r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: е */
    public final android.view.View m502(boolean r3) {
            r2 = this;
            boolean r0 = r2.f1114
            if (r0 == 0) goto L10
            int r0 = r2.m7175()
            int r0 = r0 + (-1)
            r1 = -1
            android.view.View r2 = r2.m503(r0, r1, r3)
            return r2
        L10:
            r0 = 0
            int r1 = r2.m7175()
            android.view.View r2 = r2.m503(r0, r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: ж */
    public final android.view.View m503(int r3, int r4, boolean r5) {
            r2 = this;
            r2.m500()
            r0 = 320(0x140, float:4.48E-43)
            if (r5 == 0) goto La
            r5 = 24579(0x6003, float:3.4443E-41)
            goto Lb
        La:
            r5 = r0
        Lb:
            int r1 = r2.f1110
            if (r1 != 0) goto L16
            cw1 r2 = r2.f13154
            android.view.View r2 = r2.m1630(r3, r4, r5, r0)
            return r2
        L16:
            cw1 r2 = r2.f13155
            android.view.View r2 = r2.m1630(r3, r4, r5, r0)
            return r2
    }

    /* JADX INFO: renamed from: з */
    public final int m504(int r5, p000.fm1 r6, p000.km1 r7) {
            r4 = this;
            int r6 = r4.m7175()
            r0 = 0
            if (r6 == 0) goto La7
            if (r5 != 0) goto Lb
            goto La7
        Lb:
            r4.m500()
            bs0 r6 = r4.f1111
            r6.getClass()
            r6 = -1
            r1 = 1
            if (r5 <= 0) goto L19
            r2 = r1
            goto L1a
        L19:
            r2 = r6
        L1a:
            java.lang.Math.abs(r5)
            bs0 r5 = r4.f1111
            р r3 = r4.f1112
            int r3 = r3.mo3528()
            if (r3 != 0) goto L2d
            р r3 = r4.f1112
            int r3 = r3.mo3525()
        L2d:
            r5.getClass()
            bs0 r5 = r4.f1111
            r5.f1820 = r2
            int[] r5 = r4.f1117
            r5[r0] = r0
            r5[r1] = r0
            int r7 = r7.f6027
            if (r7 == r6) goto L45
            р r7 = r4.f1112
            int r7 = r7.mo3530()
            goto L46
        L45:
            r7 = r0
        L46:
            bs0 r3 = r4.f1111
            int r3 = r3.f1820
            if (r3 != r6) goto L4e
            r6 = r0
            goto L50
        L4e:
            r6 = r7
            r7 = r0
        L50:
            r5[r0] = r7
            r5[r1] = r6
            java.lang.Math.max(r0, r7)
            r5 = r5[r1]
            java.lang.Math.max(r0, r5)
            if (r2 != r1) goto L60
            r5 = r1
            goto L61
        L60:
            r5 = r0
        L61:
            bs0 r6 = r4.f1111
            r6.getClass()
            r6 = 0
            if (r5 == 0) goto L86
            р r5 = r4.f1112
            r5.mo3527()
            boolean r5 = r4.f1114
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = r4.m7175()
            int r0 = r5 + (-1)
        L79:
            android.view.View r5 = r4.m7174(r0)
            bs0 r4 = r4.f1111
            r4.getClass()
            p000.zl1.m7166(r5)
            throw r6
        L86:
            boolean r5 = r4.f1114
            if (r5 == 0) goto L90
            int r5 = r4.m7175()
            int r0 = r5 + (-1)
        L90:
            android.view.View r5 = r4.m7174(r0)
            bs0 r7 = r4.f1111
            r7.getClass()
            р r7 = r4.f1112
            r7.mo3529()
            bs0 r4 = r4.f1111
            r4.getClass()
            p000.zl1.m7166(r5)
            throw r6
        La7:
            return r0
    }

    /* JADX INFO: renamed from: и */
    public void mo479(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mo491(r0)
            boolean r0 = r1.f1115
            if (r0 != r2) goto L9
            return
        L9:
            r1.f1115 = r2
            r1.m7171()
            return
    }
}
