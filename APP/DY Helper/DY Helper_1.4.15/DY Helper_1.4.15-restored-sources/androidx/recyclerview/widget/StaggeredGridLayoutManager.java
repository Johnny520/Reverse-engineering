package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends p000.zl1 implements p000.jm1 {

    /* JADX INFO: renamed from: λ */
    public final int f1186;

    /* JADX INFO: renamed from: μ */
    public final p000.vz1[] f1187;

    /* JADX INFO: renamed from: ν */
    public final p000.AbstractC1118 f1188;

    /* JADX INFO: renamed from: ξ */
    public final p000.AbstractC1118 f1189;

    /* JADX INFO: renamed from: ο */
    public final int f1190;

    /* JADX INFO: renamed from: π */
    public final p000.lq0 f1191;

    /* JADX INFO: renamed from: ρ */
    public final boolean f1192;

    /* JADX INFO: renamed from: σ */
    public final boolean f1193;

    /* JADX INFO: renamed from: τ */
    public final java.util.BitSet f1194;

    /* JADX INFO: renamed from: υ */
    public final p000.uc0 f1195;

    /* JADX INFO: renamed from: φ */
    public final int f1196;

    /* JADX INFO: renamed from: χ */
    public boolean f1197;

    /* JADX INFO: renamed from: ψ */
    public final boolean f1198;

    /* JADX INFO: renamed from: ω */
    public final p000.RunnableC0196d1 f1199;

    public StaggeredGridLayoutManager(android.content.Context r6, android.util.AttributeSet r7, int r8, int r9) {
            r5 = this;
            r5.<init>()
            r0 = -1
            r5.f1186 = r0
            r0 = 0
            r5.f1192 = r0
            r5.f1193 = r0
            uc0 r1 = new uc0
            r1.<init>()
            r5.f1195 = r1
            r2 = 2
            r5.f1196 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            rk0 r2 = new rk0
            r3 = 28
            r2.<init>(r3, r5)
            r2 = 1
            r5.f1198 = r2
            d1 r3 = new d1
            r4 = 9
            r3.<init>(r4, r5)
            r5.f1199 = r3
            as0 r6 = p000.zl1.m7164(r6, r7, r8, r9)
            int r7 = r6.f1293
            if (r7 == 0) goto L3f
            if (r7 != r2) goto L38
            goto L3f
        L38:
            java.lang.String r5 = "invalid orientation."
            p000.C1080.m7275(r5)
            r5 = 0
            throw r5
        L3f:
            r8 = 0
            r5.mo491(r8)
            int r9 = r5.f1190
            if (r7 != r9) goto L48
            goto L55
        L48:
            r5.f1190 = r7
            р r7 = r5.f1188
            р r9 = r5.f1189
            r5.f1188 = r9
            r5.f1189 = r7
            r5.m7171()
        L55:
            int r7 = r6.f1294
            r5.mo491(r8)
            int r9 = r5.f1186
            if (r7 == r9) goto L89
            r1.m5840()
            r5.m7171()
            r5.f1186 = r7
            java.util.BitSet r7 = new java.util.BitSet
            int r9 = r5.f1186
            r7.<init>(r9)
            r5.f1194 = r7
            int r7 = r5.f1186
            vz1[] r7 = new p000.vz1[r7]
            r5.f1187 = r7
            r7 = r0
        L76:
            int r9 = r5.f1186
            if (r7 >= r9) goto L86
            vz1[] r9 = r5.f1187
            vz1 r1 = new vz1
            r1.<init>(r5, r7)
            r9[r7] = r1
            int r7 = r7 + 1
            goto L76
        L86:
            r5.m7171()
        L89:
            boolean r6 = r6.f1295
            r5.mo491(r8)
            r5.f1192 = r6
            r5.m7171()
            lq0 r6 = new lq0
            r7 = 0
            r6.<init>(r7)
            r6.f6743 = r2
            r6.f6741 = r0
            r6.f6742 = r0
            r5.f1191 = r6
            int r6 = r5.f1190
            р r6 = p000.AbstractC1118.m7301(r5, r6)
            r5.f1188 = r6
            int r6 = r5.f1190
            int r2 = r2 - r6
            р r6 = p000.AbstractC1118.m7301(r5, r2)
            r5.f1189 = r6
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Β */
    public final int mo465(p000.fm1 r1, p000.km1 r2) {
            r0 = this;
            int r1 = r0.f1190
            if (r1 != 0) goto Lf
            int r0 = r0.f1186
            int r1 = r2.m3336()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        Lf:
            r0 = -1
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Δ */
    public final boolean mo483() {
            r0 = this;
            int r0 = r0.f1196
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ε */
    public final boolean mo484() {
            r0 = this;
            boolean r0 = r0.f1192
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ζ */
    public final void mo539(int r5) {
            r4 = this;
            super.mo539(r5)
            r0 = 0
        L4:
            int r1 = r4.f1186
            if (r0 >= r1) goto L1f
            vz1[] r1 = r4.f1187
            r1 = r1[r0]
            int r2 = r1.f11495
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.f11495 = r2
        L15:
            int r2 = r1.f11496
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.f11496 = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Η */
    public final void mo540(int r5) {
            r4 = this;
            super.mo540(r5)
            r0 = 0
        L4:
            int r1 = r4.f1186
            if (r0 >= r1) goto L1f
            vz1[] r1 = r4.f1187
            r1 = r1[r0]
            int r2 = r1.f11495
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L15
            int r2 = r2 + r5
            r1.f11495 = r2
        L15:
            int r2 = r1.f11496
            if (r2 == r3) goto L1c
            int r2 = r2 + r5
            r1.f11496 = r2
        L1c:
            int r0 = r0 + 1
            goto L4
        L1f:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Θ */
    public final void mo541() {
            r2 = this;
            uc0 r0 = r2.f1195
            r0.m5840()
            r0 = 0
        L6:
            int r1 = r2.f1186
            if (r0 >= r1) goto L14
            vz1[] r1 = r2.f1187
            r1 = r1[r0]
            r1.m6290()
            int r0 = r0 + 1
            goto L6
        L14:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ι */
    public final void mo485(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f13153
            if (r0 == 0) goto L9
            d1 r1 = r2.f1199
            r0.removeCallbacks(r1)
        L9:
            r0 = 0
        La:
            int r1 = r2.f1186
            if (r0 >= r1) goto L18
            vz1[] r1 = r2.f1187
            r1 = r1[r0]
            r1.m6290()
            int r0 = r0 + 1
            goto La
        L18:
            r3.requestLayout()
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Κ */
    public final void mo486(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.mo486(r2)
            int r2 = r1.m7175()
            if (r2 <= 0) goto L22
            r2 = 0
            android.view.View r0 = r1.m546(r2)
            android.view.View r1 = r1.m545(r2)
            if (r0 == 0) goto L22
            if (r1 != 0) goto L17
            goto L22
        L17:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            am1 r1 = (p000.am1) r1
            r1.getClass()
            r1 = 0
            throw r1
        L22:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Λ */
    public final void mo466(p000.fm1 r1, p000.km1 r2, p000.C1128 r3) {
            r0 = this;
            super.mo466(r1, r2, r3)
            java.lang.String r0 = "androidx.recyclerview.widget.StaggeredGridLayoutManager"
            r3.m7358(r0)
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Μ */
    public final android.os.Parcelable mo487() {
            r5 = this;
            uz1 r0 = new uz1
            r0.<init>()
            boolean r1 = r5.f1192
            r0.f11041 = r1
            boolean r1 = r5.f1197
            r0.f11042 = r1
            r1 = 0
            r0.f11043 = r1
            r0.f11038 = r1
            int r2 = r5.m7175()
            r3 = -1
            if (r2 <= 0) goto L7e
            boolean r2 = r5.f1197
            if (r2 == 0) goto L21
            r5.m548()
            goto L24
        L21:
            r5.m547()
        L24:
            r0.f11034 = r1
            boolean r2 = r5.f1193
            r4 = 1
            if (r2 == 0) goto L30
            android.view.View r2 = r5.m545(r4)
            goto L34
        L30:
            android.view.View r2 = r5.m546(r4)
        L34:
            if (r2 != 0) goto L73
            r0.f11035 = r3
            int r2 = r5.f1186
            r0.f11036 = r2
            int[] r2 = new int[r2]
            r0.f11037 = r2
        L40:
            int r2 = r5.f1186
            if (r1 >= r2) goto L72
            boolean r2 = r5.f1197
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            vz1[] r4 = r5.f1187
            if (r2 == 0) goto L5c
            r2 = r4[r1]
            int r2 = r2.m6291(r3)
            if (r2 == r3) goto L6b
            р r3 = r5.f1188
            int r3 = r3.mo3526()
        L5a:
            int r2 = r2 - r3
            goto L6b
        L5c:
            r2 = r4[r1]
            int r2 = r2.m6292(r3)
            if (r2 == r3) goto L6b
            р r3 = r5.f1188
            int r3 = r3.mo3529()
            goto L5a
        L6b:
            int[] r3 = r0.f11037
            r3[r1] = r2
            int r1 = r1 + 1
            goto L40
        L72:
            return r0
        L73:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            am1 r5 = (p000.am1) r5
            r5.getClass()
            r5 = 0
            throw r5
        L7e:
            r0.f11034 = r3
            r0.f11035 = r3
            r0.f11036 = r1
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Ν */
    public final void mo542(int r1) {
            r0 = this;
            if (r1 != 0) goto L5
            r0.m543()
        L5:
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: Τ */
    public final int mo468(int r1, p000.fm1 r2, p000.km1 r3) {
            r0 = this;
            int r0 = r0.m552(r1, r2, r3)
            return r0
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
    public final int mo469(int r1, p000.fm1 r2, p000.km1 r3) {
            r0 = this;
            int r0 = r0.m552(r1, r2, r3)
            return r0
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
    public final android.graphics.PointF mo490(int r3) {
            r2 = this;
            int r0 = r2.m7175()
            r1 = 1
            if (r0 != 0) goto Lc
            boolean r3 = r2.f1193
            if (r3 == 0) goto L18
            goto L19
        Lc:
            r2.m547()
            if (r3 >= 0) goto L13
            r3 = r1
            goto L14
        L13:
            r3 = 0
        L14:
            boolean r0 = r2.f1193
            if (r3 == r0) goto L19
        L18:
            r1 = -1
        L19:
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            if (r1 != 0) goto L22
            r2 = 0
            return r2
        L22:
            int r2 = r2.f1190
            r0 = 0
            if (r2 != 0) goto L2d
            float r2 = (float) r1
            r3.x = r2
            r3.y = r0
            return r3
        L2d:
            r3.x = r0
            float r2 = (float) r1
            r3.y = r2
            return r3
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
            int r0 = r0.f1190
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
            int r1 = r1.f1190
            r0 = 1
            if (r1 != r0) goto L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ε */
    public final boolean mo470(p000.am1 r1) {
            r0 = this;
            boolean r0 = r1 instanceof p000.sz1
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: η */
    public final int mo494(p000.km1 r8) {
            r7 = this;
            int r0 = r7.m7175()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f1198
            r0 = r0 ^ 1
            android.view.View r3 = r7.m546(r0)
            android.view.View r4 = r7.m545(r0)
            boolean r6 = r7.f1198
            р r2 = r7.f1188
            r5 = r7
            r1 = r8
            int r7 = p000.j81.m2910(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: θ */
    public final void mo471(p000.km1 r1) {
            r0 = this;
            r0.m544(r1)
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ι */
    public final int mo472(p000.km1 r8) {
            r7 = this;
            int r0 = r7.m7175()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f1198
            r0 = r0 ^ 1
            android.view.View r3 = r7.m546(r0)
            android.view.View r4 = r7.m545(r0)
            boolean r6 = r7.f1198
            р r2 = r7.f1188
            r5 = r7
            r1 = r8
            int r7 = p000.j81.m2911(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: κ */
    public final int mo495(p000.km1 r8) {
            r7 = this;
            int r0 = r7.m7175()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f1198
            r0 = r0 ^ 1
            android.view.View r3 = r7.m546(r0)
            android.view.View r4 = r7.m545(r0)
            boolean r6 = r7.f1198
            р r2 = r7.f1188
            r5 = r7
            r1 = r8
            int r7 = p000.j81.m2910(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: λ */
    public final void mo473(p000.km1 r1) {
            r0 = this;
            r0.m544(r1)
            return
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: μ */
    public final int mo474(p000.km1 r8) {
            r7 = this;
            int r0 = r7.m7175()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r7.f1198
            r0 = r0 ^ 1
            android.view.View r3 = r7.m546(r0)
            android.view.View r4 = r7.m545(r0)
            boolean r6 = r7.f1198
            р r2 = r7.f1188
            r5 = r7
            r1 = r8
            int r7 = p000.j81.m2911(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ξ */
    public final p000.am1 mo475() {
            r2 = this;
            int r2 = r2.f1190
            r0 = -1
            r1 = -2
            if (r2 != 0) goto Lc
            sz1 r2 = new sz1
            r2.<init>(r1, r0)
            return r2
        Lc:
            sz1 r2 = new sz1
            r2.<init>(r0, r1)
            return r2
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: ο */
    public final p000.am1 mo476(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            sz1 r0 = new sz1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: π */
    public final p000.am1 mo477(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lc
            sz1 r0 = new sz1
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        Lc:
            sz1 r0 = new sz1
            r0.<init>(r1)
            return r0
    }

    @Override // p000.zl1
    /* JADX INFO: renamed from: τ */
    public final int mo478(p000.fm1 r2, p000.km1 r3) {
            r1 = this;
            int r2 = r1.f1190
            r0 = 1
            if (r2 != r0) goto L10
            int r1 = r1.f1186
            int r2 = r3.m3336()
            int r1 = java.lang.Math.min(r1, r2)
            return r1
        L10:
            r1 = -1
            return r1
    }

    /* JADX INFO: renamed from: а */
    public final boolean m543() {
            r14 = this;
            int r0 = r14.m7175()
            r1 = 0
            if (r0 == 0) goto L131
            int r0 = r14.f1196
            if (r0 == 0) goto L131
            boolean r0 = r14.f13157
            if (r0 != 0) goto L11
            goto L131
        L11:
            boolean r0 = r14.f1193
            if (r0 == 0) goto L1c
            r14.m548()
            r14.m547()
            goto L22
        L1c:
            r14.m547()
            r14.m548()
        L22:
            int r0 = r14.m7175()
            int r2 = r0 + (-1)
            java.util.BitSet r3 = new java.util.BitSet
            int r4 = r14.f1186
            r3.<init>(r4)
            int r4 = r14.f1186
            r5 = 1
            r3.set(r1, r4, r5)
            int r4 = r14.f1190
            r6 = -1
            if (r4 != r5) goto L49
            androidx.recyclerview.widget.RecyclerView r4 = r14.f13153
            int r4 = r4.getLayoutDirection()
            r7 = 1
            if (r4 != r7) goto L44
            goto L45
        L44:
            r7 = 0
        L45:
            if (r7 == 0) goto L49
            r4 = r5
            goto L4a
        L49:
            r4 = r6
        L4a:
            boolean r7 = r14.f1193
            if (r7 == 0) goto L50
            r0 = r6
            goto L51
        L50:
            r2 = r1
        L51:
            if (r2 >= r0) goto L54
            r6 = r5
        L54:
            if (r2 == r0) goto L125
            android.view.View r7 = r14.m7174(r2)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            sz1 r8 = (p000.sz1) r8
            vz1 r9 = r8.f10095
            int r9 = r9.f11497
            boolean r9 = r3.get(r9)
            if (r9 == 0) goto Ldd
            vz1 r9 = r8.f10095
            boolean r10 = r14.f1193
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L9c
            int r10 = r9.f11496
            if (r10 == r11) goto L77
            goto L7c
        L77:
            r9.m6289()
            int r10 = r9.f11496
        L7c:
            р r11 = r14.f1188
            int r11 = r11.mo3526()
            if (r10 >= r11) goto Ld6
            java.util.ArrayList r0 = r9.f11494
            int r2 = r0.size()
            int r2 = r2 - r5
            java.lang.Object r0 = r0.get(r2)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            sz1 r0 = (p000.sz1) r0
            r0.getClass()
            goto L126
        L9c:
            int r10 = r9.f11495
            java.util.ArrayList r12 = r9.f11494
            if (r10 == r11) goto La3
            goto Lbe
        La3:
            java.lang.Object r10 = r12.get(r1)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            sz1 r11 = (p000.sz1) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = r9.f11498
            р r13 = r13.f1188
            int r10 = r13.mo3524(r10)
            r9.f11495 = r10
            r11.getClass()
            int r10 = r9.f11495
        Lbe:
            р r9 = r14.f1188
            int r9 = r9.mo3529()
            if (r10 <= r9) goto Ld6
            java.lang.Object r0 = r12.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            sz1 r0 = (p000.sz1) r0
            r0.getClass()
            goto L126
        Ld6:
            vz1 r9 = r8.f10095
            int r9 = r9.f11497
            r3.clear(r9)
        Ldd:
            int r2 = r2 + r6
            if (r2 == r0) goto L54
            android.view.View r9 = r14.m7174(r2)
            boolean r10 = r14.f1193
            р r11 = r14.f1188
            if (r10 == 0) goto Lfa
            int r10 = r11.mo3523(r7)
            р r11 = r14.f1188
            int r11 = r11.mo3523(r9)
            if (r10 >= r11) goto Lf7
            goto L126
        Lf7:
            if (r10 != r11) goto L54
            goto L109
        Lfa:
            int r10 = r11.mo3524(r7)
            р r11 = r14.f1188
            int r11 = r11.mo3524(r9)
            if (r10 <= r11) goto L107
            goto L126
        L107:
            if (r10 != r11) goto L54
        L109:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            sz1 r9 = (p000.sz1) r9
            vz1 r8 = r8.f10095
            int r8 = r8.f11497
            vz1 r9 = r9.f10095
            int r9 = r9.f11497
            int r8 = r8 - r9
            if (r8 >= 0) goto L11c
            r8 = r5
            goto L11d
        L11c:
            r8 = r1
        L11d:
            if (r4 >= 0) goto L121
            r9 = r5
            goto L122
        L121:
            r9 = r1
        L122:
            if (r8 == r9) goto L54
            goto L126
        L125:
            r7 = 0
        L126:
            if (r7 == 0) goto L131
            uc0 r0 = r14.f1195
            r0.m5840()
            r14.m7171()
            return r5
        L131:
            return r1
    }

    /* JADX INFO: renamed from: б */
    public final void m544(p000.km1 r3) {
            r2 = this;
            int r0 = r2.m7175()
            if (r0 != 0) goto L7
            goto L2f
        L7:
            boolean r0 = r2.f1198
            r0 = r0 ^ 1
            android.view.View r1 = r2.m546(r0)
            android.view.View r0 = r2.m545(r0)
            int r2 = r2.m7175()
            if (r2 == 0) goto L2f
            int r2 = r3.m3336()
            if (r2 == 0) goto L2f
            if (r1 == 0) goto L2f
            if (r0 != 0) goto L24
            goto L2f
        L24:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            am1 r2 = (p000.am1) r2
            r2.getClass()
            r2 = 0
            throw r2
        L2f:
            return
    }

    /* JADX INFO: renamed from: в */
    public final android.view.View m545(boolean r8) {
            r7 = this;
            р r0 = r7.f1188
            int r0 = r0.mo3529()
            р r1 = r7.f1188
            int r1 = r1.mo3526()
            int r2 = r7.m7175()
            int r2 = r2 + (-1)
            r3 = 0
        L13:
            if (r2 < 0) goto L37
            android.view.View r4 = r7.m7174(r2)
            р r5 = r7.f1188
            int r5 = r5.mo3524(r4)
            р r6 = r7.f1188
            int r6 = r6.mo3523(r4)
            if (r6 <= r0) goto L34
            if (r5 < r1) goto L2a
            goto L34
        L2a:
            if (r6 <= r1) goto L33
            if (r8 != 0) goto L2f
            goto L33
        L2f:
            if (r3 != 0) goto L34
            r3 = r4
            goto L34
        L33:
            return r4
        L34:
            int r2 = r2 + (-1)
            goto L13
        L37:
            return r3
    }

    /* JADX INFO: renamed from: г */
    public final android.view.View m546(boolean r9) {
            r8 = this;
            р r0 = r8.f1188
            int r0 = r0.mo3529()
            р r1 = r8.f1188
            int r1 = r1.mo3526()
            int r2 = r8.m7175()
            r3 = 0
            r4 = 0
        L12:
            if (r4 >= r2) goto L36
            android.view.View r5 = r8.m7174(r4)
            р r6 = r8.f1188
            int r6 = r6.mo3524(r5)
            р r7 = r8.f1188
            int r7 = r7.mo3523(r5)
            if (r7 <= r0) goto L33
            if (r6 < r1) goto L29
            goto L33
        L29:
            if (r6 >= r0) goto L32
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            if (r3 != 0) goto L33
            r3 = r5
            goto L33
        L32:
            return r5
        L33:
            int r4 = r4 + 1
            goto L12
        L36:
            return r3
    }

    /* JADX INFO: renamed from: д */
    public final void m547() {
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

    /* JADX INFO: renamed from: е */
    public final void m548() {
            r1 = this;
            int r0 = r1.m7175()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r0 + (-1)
            android.view.View r1 = r1.m7174(r0)
            p000.zl1.m7166(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ж */
    public final void m549(p000.lq0 r5) {
            r4 = this;
            boolean r0 = r5.f6743
            if (r0 == 0) goto L7e
            boolean r0 = r5.f6744
            if (r0 == 0) goto La
            goto L7e
        La:
            int r0 = r5.f6737
            int r1 = r5.f6740
            r2 = -1
            if (r0 != 0) goto L1f
            if (r1 != r2) goto L19
            int r5 = r5.f6742
            r4.m550(r5)
            return
        L19:
            int r5 = r5.f6741
            r4.m551(r5)
            return
        L1f:
            r0 = 1
            r3 = 0
            if (r1 != r2) goto L50
            int r1 = r5.f6741
            vz1[] r2 = r4.f1187
            r2 = r2[r3]
            int r2 = r2.m6292(r1)
        L2d:
            int r3 = r4.f1186
            if (r0 >= r3) goto L3f
            vz1[] r3 = r4.f1187
            r3 = r3[r0]
            int r3 = r3.m6292(r1)
            if (r3 <= r2) goto L3c
            r2 = r3
        L3c:
            int r0 = r0 + 1
            goto L2d
        L3f:
            int r1 = r1 - r2
            int r0 = r5.f6742
            if (r1 >= 0) goto L45
            goto L4c
        L45:
            int r5 = r5.f6737
            int r5 = java.lang.Math.min(r1, r5)
            int r0 = r0 - r5
        L4c:
            r4.m550(r0)
            return
        L50:
            int r1 = r5.f6742
            vz1[] r2 = r4.f1187
            r2 = r2[r3]
            int r2 = r2.m6291(r1)
        L5a:
            int r3 = r4.f1186
            if (r0 >= r3) goto L6c
            vz1[] r3 = r4.f1187
            r3 = r3[r0]
            int r3 = r3.m6291(r1)
            if (r3 >= r2) goto L69
            r2 = r3
        L69:
            int r0 = r0 + 1
            goto L5a
        L6c:
            int r0 = r5.f6742
            int r2 = r2 - r0
            int r0 = r5.f6741
            if (r2 >= 0) goto L74
            goto L7b
        L74:
            int r5 = r5.f6737
            int r5 = java.lang.Math.min(r2, r5)
            int r0 = r0 + r5
        L7b:
            r4.m551(r0)
        L7e:
            return
    }

    /* JADX INFO: renamed from: з */
    public final void m550(int r4) {
            r3 = this;
            int r0 = r3.m7175()
            r1 = 1
            int r0 = r0 - r1
            if (r0 < 0) goto L49
            android.view.View r0 = r3.m7174(r0)
            р r2 = r3.f1188
            int r2 = r2.mo3524(r0)
            if (r2 < r4) goto L49
            р r3 = r3.f1188
            int r3 = r3.mo3532(r0)
            if (r3 < r4) goto L49
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            sz1 r3 = (p000.sz1) r3
            r3.getClass()
            vz1 r4 = r3.f10095
            java.util.ArrayList r4 = r4.f11494
            int r4 = r4.size()
            if (r4 != r1) goto L30
            goto L49
        L30:
            vz1 r3 = r3.f10095
            java.util.ArrayList r3 = r3.f11494
            int r4 = r3.size()
            int r4 = r4 - r1
            java.lang.Object r3 = r3.remove(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            sz1 r3 = (p000.sz1) r3
            r4 = 0
            r3.f10095 = r4
            throw r4
        L49:
            return
    }

    /* JADX INFO: renamed from: и */
    public final void m551(int r4) {
            r3 = this;
            int r0 = r3.m7175()
            if (r0 <= 0) goto L4e
            r0 = 0
            android.view.View r1 = r3.m7174(r0)
            р r2 = r3.f1188
            int r2 = r2.mo3523(r1)
            if (r2 > r4) goto L4e
            р r3 = r3.f1188
            int r3 = r3.mo3531(r1)
            if (r3 > r4) goto L4e
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            sz1 r3 = (p000.sz1) r3
            r3.getClass()
            vz1 r4 = r3.f10095
            java.util.ArrayList r4 = r4.f11494
            int r4 = r4.size()
            r1 = 1
            if (r4 != r1) goto L30
            goto L4e
        L30:
            vz1 r3 = r3.f10095
            java.util.ArrayList r4 = r3.f11494
            java.lang.Object r0 = r4.remove(r0)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            sz1 r0 = (p000.sz1) r0
            r1 = 0
            r0.f10095 = r1
            int r4 = r4.size()
            if (r4 != 0) goto L4d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.f11496 = r4
        L4d:
            throw r1
        L4e:
            return
    }

    /* JADX INFO: renamed from: й */
    public final int m552(int r15, p000.fm1 r16, p000.km1 r17) {
            r14 = this;
            int r0 = r14.m7175()
            r1 = 0
            if (r0 == 0) goto L1c8
            if (r15 != 0) goto Lb
            goto L1c8
        Lb:
            r0 = 1
            r2 = -1
            if (r15 <= 0) goto L14
            r14.m548()
            r3 = r0
            goto L18
        L14:
            r14.m547()
            r3 = r2
        L18:
            lq0 r4 = r14.f1191
            r4.f6743 = r0
            r4.f6737 = r1
            r4.f6738 = r1
            ds0 r5 = r14.f13156
            if (r5 == 0) goto L46
            boolean r5 = r5.f3256
            if (r5 == 0) goto L46
            r5 = r17
            int r6 = r5.f6027
            if (r6 == r2) goto L48
            if (r6 >= 0) goto L32
            r6 = r0
            goto L33
        L32:
            r6 = r1
        L33:
            boolean r7 = r14.f1193
            р r8 = r14.f1188
            if (r7 != r6) goto L3f
            int r6 = r8.mo3530()
            r7 = r1
            goto L4a
        L3f:
            int r6 = r8.mo3530()
            r7 = r6
            r6 = r1
            goto L4a
        L46:
            r5 = r17
        L48:
            r6 = r1
            r7 = r6
        L4a:
            androidx.recyclerview.widget.RecyclerView r8 = r14.f13153
            if (r8 == 0) goto L65
            boolean r8 = r8.f1156
            if (r8 == 0) goto L65
            р r8 = r14.f1188
            int r8 = r8.mo3529()
            int r8 = r8 - r7
            r4.f6741 = r8
            р r7 = r14.f1188
            int r7 = r7.mo3526()
            int r7 = r7 + r6
            r4.f6742 = r7
            goto L71
        L65:
            р r8 = r14.f1188
            int r8 = r8.mo3525()
            int r8 = r8 + r6
            r4.f6742 = r8
            int r6 = -r7
            r4.f6741 = r6
        L71:
            r4.f6743 = r0
            р r6 = r14.f1188
            int r6 = r6.mo3528()
            if (r6 != 0) goto L85
            р r6 = r14.f1188
            int r6 = r6.mo3525()
            if (r6 != 0) goto L85
            r6 = r0
            goto L86
        L85:
            r6 = r1
        L86:
            r4.f6744 = r6
            r4.f6740 = r3
            if (r3 != r2) goto L8e
            r3 = r0
            goto L8f
        L8e:
            r3 = r1
        L8f:
            boolean r6 = r14.f1193
            if (r6 != r3) goto L95
            r3 = r0
            goto L96
        L95:
            r3 = r2
        L96:
            r4.f6739 = r3
            r4.f6738 = r3
            int r3 = java.lang.Math.abs(r15)
            r4.f6737 = r3
            java.util.BitSet r3 = r14.f1194
            int r6 = r14.f1186
            r3.set(r1, r6, r0)
            boolean r3 = r4.f6744
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto Lb7
            int r3 = r4.f6740
            if (r3 != r0) goto Lb5
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto Lc6
        Lb5:
            r3 = r6
            goto Lc6
        Lb7:
            int r3 = r4.f6740
            if (r3 != r0) goto Lc1
            int r3 = r4.f6742
            int r7 = r4.f6737
            int r3 = r3 + r7
            goto Lc6
        Lc1:
            int r3 = r4.f6741
            int r7 = r4.f6737
            int r3 = r3 - r7
        Lc6:
            int r7 = r4.f6740
            r8 = r1
        Lc9:
            int r9 = r14.f1186
            if (r8 >= r9) goto L123
            vz1[] r9 = r14.f1187
            r9 = r9[r8]
            java.util.ArrayList r9 = r9.f11494
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lda
            goto L120
        Lda:
            vz1[] r9 = r14.f1187
            r9 = r9[r8]
            r9.getClass()
            int r10 = r9.f11497
            if (r7 != r2) goto L10f
            int r11 = r9.f11495
            if (r11 == r6) goto Lea
            goto L107
        Lea:
            java.util.ArrayList r11 = r9.f11494
            java.lang.Object r11 = r11.get(r1)
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
            sz1 r12 = (p000.sz1) r12
            androidx.recyclerview.widget.StaggeredGridLayoutManager r13 = r9.f11498
            р r13 = r13.f1188
            int r11 = r13.mo3524(r11)
            r9.f11495 = r11
            r12.getClass()
            int r11 = r9.f11495
        L107:
            if (r11 > r3) goto L120
            java.util.BitSet r9 = r14.f1194
            r9.set(r10, r1)
            goto L120
        L10f:
            int r11 = r9.f11496
            if (r11 == r6) goto L114
            goto L119
        L114:
            r9.m6289()
            int r11 = r9.f11496
        L119:
            if (r11 < r3) goto L120
            java.util.BitSet r9 = r14.f1194
            r9.set(r10, r1)
        L120:
            int r8 = r8 + 1
            goto Lc9
        L123:
            boolean r3 = r14.f1193
            р r6 = r14.f1188
            if (r3 == 0) goto L12d
            r6.mo3526()
            goto L130
        L12d:
            r6.mo3529()
        L130:
            int r3 = r4.f6738
            if (r3 < 0) goto L150
            int r5 = r5.m3336()
            if (r3 >= r5) goto L150
            boolean r3 = r4.f6744
            if (r3 != 0) goto L147
            java.util.BitSet r3 = r14.f1194
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L147
            goto L150
        L147:
            int r14 = r4.f6738
            r0 = r16
            r0.m2152(r14)
            r14 = 0
            throw r14
        L150:
            r14.m549(r4)
            int r3 = r4.f6740
            р r5 = r14.f1188
            if (r3 != r2) goto L17f
            int r2 = r5.mo3529()
            vz1[] r3 = r14.f1187
            r3 = r3[r1]
            int r3 = r3.m6292(r2)
        L165:
            int r5 = r14.f1186
            if (r0 >= r5) goto L177
            vz1[] r5 = r14.f1187
            r5 = r5[r0]
            int r5 = r5.m6292(r2)
            if (r5 >= r3) goto L174
            r3 = r5
        L174:
            int r0 = r0 + 1
            goto L165
        L177:
            р r0 = r14.f1188
            int r0 = r0.mo3529()
            int r0 = r0 - r3
            goto L1a5
        L17f:
            int r2 = r5.mo3526()
            vz1[] r3 = r14.f1187
            r3 = r3[r1]
            int r3 = r3.m6291(r2)
        L18b:
            int r5 = r14.f1186
            if (r0 >= r5) goto L19d
            vz1[] r5 = r14.f1187
            r5 = r5[r0]
            int r5 = r5.m6291(r2)
            if (r5 <= r3) goto L19a
            r3 = r5
        L19a:
            int r0 = r0 + 1
            goto L18b
        L19d:
            р r0 = r14.f1188
            int r0 = r0.mo3526()
            int r0 = r3 - r0
        L1a5:
            if (r0 <= 0) goto L1ae
            int r2 = r4.f6737
            int r0 = java.lang.Math.min(r2, r0)
            goto L1af
        L1ae:
            r0 = r1
        L1af:
            int r2 = r4.f6737
            if (r2 >= r0) goto L1b5
            r0 = r15
            goto L1b8
        L1b5:
            if (r15 >= 0) goto L1b8
            int r0 = -r0
        L1b8:
            р r2 = r14.f1188
            int r3 = -r0
            r2.mo3533(r3)
            boolean r2 = r14.f1193
            r14.f1197 = r2
            r4.f6737 = r1
            r14.m549(r4)
            return r0
        L1c8:
            return r1
    }
}
