package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ButtonBarLayout extends android.widget.LinearLayout {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f25643 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f25644;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f25645;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f25646;

    public ButtonBarLayout(@Yue.InterfaceC4410 android.content.Context r9, @Yue.InterfaceC4544 android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = -1
            r8.f25646 = r0
            int[] r0 = Yue.C5058.C5071.f17813
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0)
            int[] r3 = Yue.C5058.C5071.f17813
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r0
            Yue.C6794.m26221(r1, r2, r3, r4, r5, r6, r7)
            int r9 = Yue.C5058.C5071.f17814
            r10 = 1
            boolean r9 = r0.getBoolean(r9, r10)
            r8.f25644 = r9
            r0.recycle()
            int r9 = r8.getOrientation()
            if (r9 != r10) goto L2e
            boolean r9 = r8.f25644
            r8.setStacked(r9)
        L2e:
            return
    }

    private void setStacked(boolean r2) {
            r1 = this;
            boolean r0 = r1.f25645
            if (r0 == r2) goto L3d
            if (r2 == 0) goto La
            boolean r0 = r1.f25644
            if (r0 == 0) goto L3d
        La:
            r1.f25645 = r2
            r1.setOrientation(r2)
            if (r2 == 0) goto L15
            r0 = 8388613(0x800005, float:1.175495E-38)
            goto L17
        L15:
            r0 = 80
        L17:
            r1.setGravity(r0)
            int r0 = Yue.C5058.C5065.f17157
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L2b
            if (r2 == 0) goto L27
            r2 = 8
            goto L28
        L27:
            r2 = 4
        L28:
            r0.setVisibility(r2)
        L2b:
            int r2 = r1.getChildCount()
            int r2 = r2 + (-2)
        L31:
            if (r2 < 0) goto L3d
            android.view.View r0 = r1.getChildAt(r2)
            r1.bringChildToFront(r0)
            int r2 = r2 + (-1)
            goto L31
        L3d:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.f25644
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.f25646
            if (r0 <= r1) goto L16
            boolean r1 = r5.m28318()
            if (r1 == 0) goto L16
            r5.setStacked(r2)
        L16:
            r5.f25646 = r0
        L18:
            boolean r1 = r5.m28318()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = r3
            goto L31
        L2f:
            r0 = r6
            r1 = r2
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.f25644
            if (r0 == 0) goto L4d
            boolean r0 = r5.m28318()
            if (r0 != 0) goto L4d
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4d
            r5.setStacked(r3)
            r1 = r3
        L4d:
            if (r1 == 0) goto L52
            super.onMeasure(r6, r7)
        L52:
            int r0 = r5.m28317(r2)
            if (r0 < 0) goto L9e
            android.view.View r1 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r4 = r5.getPaddingTop()
            int r1 = r1.getMeasuredHeight()
            int r4 = r4 + r1
            int r1 = r2.topMargin
            int r4 = r4 + r1
            int r1 = r2.bottomMargin
            int r4 = r4 + r1
            boolean r1 = r5.m28318()
            if (r1 == 0) goto L98
            int r0 = r0 + r3
            int r0 = r5.m28317(r0)
            if (r0 < 0) goto L96
            android.view.View r0 = r5.getChildAt(r0)
            int r0 = r0.getPaddingTop()
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r0 = r0 + r1
            int r4 = r4 + r0
        L96:
            r2 = r4
            goto L9e
        L98:
            int r0 = r5.getPaddingBottom()
            int r2 = r4 + r0
        L9e:
            int r0 = Yue.C6794.m26145(r5)
            if (r0 == r2) goto Lac
            r5.setMinimumHeight(r2)
            if (r7 != 0) goto Lac
            super.onMeasure(r6, r7)
        Lac:
            return
    }

    public void setAllowStacking(boolean r2) {
            r1 = this;
            boolean r0 = r1.f25644
            if (r0 == r2) goto L15
            r1.f25644 = r2
            if (r2 != 0) goto L12
            boolean r2 = r1.m28318()
            if (r2 == 0) goto L12
            r2 = 0
            r1.setStacked(r2)
        L12:
            r1.requestLayout()
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m28317(int r3) {
            r2 = this;
            int r0 = r2.getChildCount()
        L4:
            if (r3 >= r0) goto L14
            android.view.View r1 = r2.getChildAt(r3)
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + 1
            goto L4
        L14:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m28318() {
            r1 = this;
            boolean r0 = r1.f25645
            return r0
    }
}
