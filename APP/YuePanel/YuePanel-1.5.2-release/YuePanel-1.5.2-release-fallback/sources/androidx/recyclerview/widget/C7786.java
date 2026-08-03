package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7786 extends androidx.recyclerview.widget.AbstractC7800 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float f30050 = 1.0f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.AbstractC7791 f30051;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.AbstractC7791 f30052;

    public C7786() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    public int[] calculateDistanceToFinalSnap(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r5, @Yue.InterfaceC4410 android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.canScrollHorizontally()
            r2 = 0
            if (r1 == 0) goto L15
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.m30226(r5)
            int r1 = r4.m30223(r5, r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.canScrollVertically()
            r3 = 1
            if (r1 == 0) goto L29
            androidx.recyclerview.widget.ۥ۟۟۠۠ r1 = r4.m30227(r5)
            int r5 = r4.m30223(r5, r6, r1)
            r0[r3] = r5
            goto L2b
        L29:
            r0[r3] = r2
        L2b:
            return r0
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            boolean r0 = r2.canScrollVertically()
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.m30227(r2)
            android.view.View r2 = r1.m30225(r2, r0)
            return r2
        Lf:
            boolean r0 = r2.canScrollHorizontally()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.m30226(r2)
            android.view.View r2 = r1.m30225(r2, r0)
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // androidx.recyclerview.widget.AbstractC7800
    public int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r9, int r10, int r11) {
            r8 = this;
            boolean r0 = r9 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getItemCount()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            android.view.View r2 = r8.findSnapView(r9)
            if (r2 != 0) goto L14
            return r1
        L14:
            int r2 = r9.getPosition(r2)
            if (r2 != r1) goto L1b
            return r1
        L1b:
            r3 = r9
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ۟ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712) r3
            int r4 = r0 + (-1)
            android.graphics.PointF r3 = r3.computeScrollVectorForPosition(r4)
            if (r3 != 0) goto L27
            return r1
        L27:
            boolean r5 = r9.canScrollHorizontally()
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L3f
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r8.m30226(r9)
            int r10 = r8.m30224(r9, r5, r10, r7)
            float r5 = r3.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L40
            int r10 = -r10
            goto L40
        L3f:
            r10 = r7
        L40:
            boolean r5 = r9.canScrollVertically()
            if (r5 == 0) goto L56
            androidx.recyclerview.widget.ۥ۟۟۠۠ r5 = r8.m30227(r9)
            int r11 = r8.m30224(r9, r5, r7, r11)
            float r3 = r3.y
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L57
            int r11 = -r11
            goto L57
        L56:
            r11 = r7
        L57:
            boolean r9 = r9.canScrollVertically()
            if (r9 == 0) goto L5e
            r10 = r11
        L5e:
            if (r10 != 0) goto L61
            return r1
        L61:
            int r2 = r2 + r10
            if (r2 >= 0) goto L65
            goto L66
        L65:
            r7 = r2
        L66:
            if (r7 < r0) goto L69
            goto L6a
        L69:
            r4 = r7
        L6a:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float m30222(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r11, androidx.recyclerview.widget.AbstractC7791 r12) {
            r10 = this;
            int r0 = r11.getChildCount()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L9
            return r1
        L9:
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
        L14:
            if (r6 >= r0) goto L2d
            android.view.View r7 = r11.getChildAt(r6)
            int r8 = r11.getPosition(r7)
            r9 = -1
            if (r8 != r9) goto L22
            goto L2a
        L22:
            if (r8 >= r4) goto L26
            r2 = r7
            r4 = r8
        L26:
            if (r8 <= r5) goto L2a
            r3 = r7
            r5 = r8
        L2a:
            int r6 = r6 + 1
            goto L14
        L2d:
            if (r2 == 0) goto L56
            if (r3 != 0) goto L32
            goto L56
        L32:
            int r11 = r12.mo30245(r2)
            int r0 = r12.mo30245(r3)
            int r11 = java.lang.Math.min(r11, r0)
            int r0 = r12.mo30242(r2)
            int r12 = r12.mo30242(r3)
            int r12 = java.lang.Math.max(r0, r12)
            int r12 = r12 - r11
            if (r12 != 0) goto L4e
            return r1
        L4e:
            float r11 = (float) r12
            float r11 = r11 * r1
            int r5 = r5 - r4
            int r5 = r5 + 1
            float r12 = (float) r5
            float r11 = r11 / r12
            return r11
        L56:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m30223(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1, @Yue.InterfaceC4410 android.view.View r2, androidx.recyclerview.widget.AbstractC7791 r3) {
            r0 = this;
            int r1 = r3.mo30245(r2)
            int r2 = r3.mo30243(r2)
            int r2 = r2 / 2
            int r1 = r1 + r2
            int r2 = r3.mo30252()
            int r3 = r3.mo30253()
            int r3 = r3 / 2
            int r2 = r2 + r3
            int r1 = r1 - r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m30224(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r3, androidx.recyclerview.widget.AbstractC7791 r4, int r5, int r6) {
            r2 = this;
            int[] r5 = r2.calculateScrollDistance(r5, r6)
            float r3 = r2.m30222(r3, r4)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r6 = 0
            if (r4 > 0) goto Lf
            return r6
        Lf:
            r4 = r5[r6]
            int r4 = java.lang.Math.abs(r4)
            r0 = 1
            r1 = r5[r0]
            int r1 = java.lang.Math.abs(r1)
            if (r4 <= r1) goto L21
            r4 = r5[r6]
            goto L23
        L21:
            r4 = r5[r0]
        L23:
            float r4 = (float) r4
            float r4 = r4 / r3
            int r3 = java.lang.Math.round(r4)
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.view.View m30225(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r9, androidx.recyclerview.widget.AbstractC7791 r10) {
            r8 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r10.mo30252()
            int r3 = r10.mo30253()
            int r3 = r3 / 2
            int r2 = r2 + r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r9.getChildAt(r4)
            int r6 = r10.mo30245(r5)
            int r7 = r10.mo30243(r5)
            int r7 = r7 / 2
            int r6 = r6 + r7
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r6 >= r3) goto L31
            r1 = r5
            r3 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.AbstractC7791 m30226(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f30052
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.f30060
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = androidx.recyclerview.widget.AbstractC7791.m30239(r2)
            r1.f30052 = r2
        Le:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.f30052
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.AbstractC7791 m30227(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠۠ r0 = r1.f30051
            if (r0 == 0) goto L8
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.f30060
            if (r0 == r2) goto Le
        L8:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = androidx.recyclerview.widget.AbstractC7791.m30241(r2)
            r1.f30051 = r2
        Le:
            androidx.recyclerview.widget.ۥ۟۟۠۠ r2 = r1.f30051
            return r2
    }
}
