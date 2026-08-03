package androidx.constraintlayout.widget;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7453 extends androidx.constraintlayout.widget.AbstractC7457 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f26051 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f26052 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f26053 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f26054 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f26055 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f26056 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f26057;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int f26058;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C0721 f26059;

    public C7453(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public C7453(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public C7453(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public int getMargin() {
            r1 = this;
            Yue.ۥ۟ۢۤۧ r0 = r1.f26059
            int r0 = r0.m4472()
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f26057
            return r0
    }

    public void setAllowsGoneWidget(boolean r2) {
            r1 = this;
            Yue.ۥ۟ۢۤۧ r0 = r1.f26059
            r0.m4475(r2)
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            Yue.ۥ۟ۢۤۧ r0 = r1.f26059
            r0.m4477(r2)
            return
    }

    public void setMargin(int r2) {
            r1 = this;
            Yue.ۥ۟ۢۤۧ r0 = r1.f26059
            r0.m4477(r2)
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.f26057 = r1
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14491(android.util.AttributeSet r7) {
            r6 = this;
            super.mo14491(r7)
            Yue.ۥ۟ۢۤۧ r0 = new Yue.ۥ۟ۢۤۧ
            r0.<init>()
            r6.f26059 = r0
            if (r7 == 0) goto L50
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.constraintlayout.widget.C7473.C7486.f28216
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L4d
            int r3 = r7.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28232
            if (r3 != r4) goto L2e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L4a
        L2e:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28231
            if (r3 != r4) goto L3d
            Yue.ۥ۟ۢۤۧ r4 = r6.f26059
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.m4475(r3)
            goto L4a
        L3d:
            int r4 = androidx.constraintlayout.widget.C7473.C7486.f28233
            if (r3 != r4) goto L4a
            int r3 = r7.getDimensionPixelSize(r3, r1)
            Yue.ۥ۟ۢۤۧ r4 = r6.f26059
            r4.m4477(r3)
        L4a:
            int r2 = r2 + 1
            goto L1c
        L4d:
            r7.recycle()
        L50:
            Yue.ۥ۟ۢۤۧ r7 = r6.f26059
            r6.f26080 = r7
            r6.m28542()
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo28494(androidx.constraintlayout.widget.C7462.C7463 r1, Yue.C3025 r2, androidx.constraintlayout.widget.ConstraintLayout.C7450 r3, android.util.SparseArray<Yue.C1517> r4) {
            r0 = this;
            super.mo28494(r1, r2, r3, r4)
            boolean r3 = r2 instanceof Yue.C0721
            if (r3 == 0) goto L29
            r3 = r2
            Yue.ۥ۟ۢۤۧ r3 = (Yue.C0721) r3
            Yue.ۥ۟ۧ۟ۢ r2 = r2.m7529()
            Yue.ۥۣ۟ۧ۟ r2 = (Yue.C1520) r2
            boolean r2 = r2.m7651()
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r4 = r1.f26241
            int r4 = r4.f26350
            r0.m28510(r3, r4, r2)
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r2 = r1.f26241
            boolean r2 = r2.f26358
            r3.m4475(r2)
            androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ r1 = r1.f26241
            int r1 = r1.f26351
            r3.m4477(r1)
        L29:
            return
    }

    @Override // androidx.constraintlayout.widget.AbstractC7457
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo28495(Yue.C1517 r2, boolean r3) {
            r1 = this;
            int r0 = r1.f26057
            r1.m28510(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m28509() {
            r1 = this;
            Yue.ۥ۟ۢۤۧ r0 = r1.f26059
            boolean r0 = r0.m4470()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m28510(Yue.C1517 r4, int r5, boolean r6) {
            r3 = this;
            r3.f26058 = r5
            r5 = 0
            r0 = 6
            r1 = 1
            r2 = 5
            if (r6 == 0) goto L14
            int r6 = r3.f26057
            if (r6 != r2) goto Lf
            r3.f26058 = r1
            goto L1f
        Lf:
            if (r6 != r0) goto L1f
            r3.f26058 = r5
            goto L1f
        L14:
            int r6 = r3.f26057
            if (r6 != r2) goto L1b
            r3.f26058 = r5
            goto L1f
        L1b:
            if (r6 != r0) goto L1f
            r3.f26058 = r1
        L1f:
            boolean r5 = r4 instanceof Yue.C0721
            if (r5 == 0) goto L2a
            Yue.ۥ۟ۢۤۧ r4 = (Yue.C0721) r4
            int r5 = r3.f26058
            r4.m4476(r5)
        L2a:
            return
    }
}
