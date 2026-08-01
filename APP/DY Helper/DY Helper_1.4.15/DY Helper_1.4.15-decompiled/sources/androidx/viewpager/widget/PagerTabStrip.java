package androidx.viewpager.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends androidx.viewpager.widget.PagerTitleStrip {

    /* JADX INFO: renamed from: Α */
    public final int f1201;

    /* JADX INFO: renamed from: Β */
    public final android.graphics.Paint f1202;

    /* JADX INFO: renamed from: Γ */
    public final android.graphics.Rect f1203;

    /* JADX INFO: renamed from: Δ */
    public int f1204;

    /* JADX INFO: renamed from: Ε */
    public boolean f1205;

    /* JADX INFO: renamed from: Ζ */
    public boolean f1206;

    /* JADX INFO: renamed from: Η */
    public final int f1207;

    /* JADX INFO: renamed from: Θ */
    public boolean f1208;

    /* JADX INFO: renamed from: Ι */
    public float f1209;

    /* JADX INFO: renamed from: Κ */
    public float f1210;

    /* JADX INFO: renamed from: Λ */
    public final int f1211;

    /* JADX INFO: renamed from: υ */
    public int f1212;

    /* JADX INFO: renamed from: φ */
    public final int f1213;

    /* JADX INFO: renamed from: χ */
    public final int f1214;

    /* JADX INFO: renamed from: ψ */
    public final int f1215;

    /* JADX INFO: renamed from: ω */
    public final int f1216;

    public PagerTabStrip(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PagerTabStrip(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r3.f1202 = r5
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f1203 = r0
            r0 = 255(0xff, float:3.57E-43)
            r3.f1204 = r0
            r0 = 0
            r3.f1205 = r0
            r3.f1206 = r0
            int r1 = r3.f1231
            r3.f1212 = r1
            r5.setColor(r1)
            android.content.res.Resources r5 = r4.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r5
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f1213 = r1
            r1 = 1086324736(0x40c00000, float:6.0)
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f1214 = r1
            r1 = 1115684864(0x42800000, float:64.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            r3.f1215 = r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f1201 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r5
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.f1207 = r1
            r1 = 1107296256(0x42000000, float:32.0)
            float r5 = r5 * r1
            float r5 = r5 + r2
            int r5 = (int) r5
            r3.f1216 = r5
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            r3.f1211 = r4
            int r4 = r3.getPaddingLeft()
            int r5 = r3.getPaddingTop()
            int r1 = r3.getPaddingRight()
            int r2 = r3.getPaddingBottom()
            r3.setPadding(r4, r5, r1, r2)
            int r4 = r3.getTextSpacing()
            r3.setTextSpacing(r4)
            r3.setWillNotDraw(r0)
            android.widget.TextView r4 = r3.f1220
            r5 = 1
            r4.setFocusable(r5)
            android.widget.TextView r4 = r3.f1220
            e91 r0 = new e91
            r1 = 0
            r0.<init>(r3, r1)
            r4.setOnClickListener(r0)
            android.widget.TextView r4 = r3.f1222
            r4.setFocusable(r5)
            android.widget.TextView r4 = r3.f1222
            e91 r0 = new e91
            r1 = 1
            r0.<init>(r3, r1)
            r4.setOnClickListener(r0)
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto La6
            r3.f1205 = r5
        La6:
            return
    }

    public boolean getDrawFullUnderline() {
            r0 = this;
            boolean r0 = r0.f1205
            return r0
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
            r1 = this;
            int r0 = super.getMinHeight()
            int r1 = r1.f1216
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    public int getTabIndicatorColor() {
            r0 = this;
            int r0 = r0.f1212
            return r0
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r14) {
            r13 = this;
            super.onDraw(r14)
            int r0 = r13.getHeight()
            android.widget.TextView r1 = r13.f1221
            int r2 = r1.getLeft()
            int r3 = r13.f1201
            int r2 = r2 - r3
            int r1 = r1.getRight()
            int r1 = r1 + r3
            int r3 = r13.f1213
            int r3 = r0 - r3
            int r4 = r13.f1204
            int r4 = r4 << 24
            int r5 = r13.f1212
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            r4 = r4 | r5
            android.graphics.Paint r12 = r13.f1202
            r12.setColor(r4)
            float r8 = (float) r2
            float r9 = (float) r3
            float r10 = (float) r1
            float r11 = (float) r0
            r7 = r14
            r7.drawRect(r8, r9, r10, r11, r12)
            boolean r14 = r13.f1205
            if (r14 == 0) goto L54
            int r14 = r13.f1212
            r14 = r14 & r6
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14 = r14 | r1
            r12.setColor(r14)
            int r14 = r13.getPaddingLeft()
            float r8 = (float) r14
            int r14 = r13.f1207
            int r0 = r0 - r14
            float r9 = (float) r0
            int r14 = r13.getWidth()
            int r13 = r13.getPaddingRight()
            int r14 = r14 - r13
            float r10 = (float) r14
            r7.drawRect(r8, r9, r10, r11, r12)
        L54:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getAction()
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r2 = r4.f1208
            if (r2 == 0) goto Lc
            return r1
        Lc:
            float r2 = r5.getX()
            float r5 = r5.getY()
            r3 = 1
            if (r0 == 0) goto L67
            if (r0 == r3) goto L39
            r1 = 2
            if (r0 == r1) goto L1d
            goto L66
        L1d:
            float r0 = r4.f1209
            float r2 = r2 - r0
            float r0 = java.lang.Math.abs(r2)
            int r1 = r4.f1211
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L36
            float r0 = r4.f1210
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L66
        L36:
            r4.f1208 = r3
            return r3
        L39:
            android.widget.TextView r5 = r4.f1221
            int r0 = r5.getLeft()
            int r1 = r4.f1201
            int r0 = r0 - r1
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L52
            androidx.viewpager.widget.ViewPager r4 = r4.f1219
            int r5 = r4.getCurrentItem()
            int r5 = r5 - r3
            r4.setCurrentItem(r5)
            return r3
        L52:
            int r5 = r5.getRight()
            int r5 = r5 + r1
            float r5 = (float) r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L66
            androidx.viewpager.widget.ViewPager r4 = r4.f1219
            int r5 = r4.getCurrentItem()
            int r5 = r5 + r3
            r4.setCurrentItem(r5)
        L66:
            return r3
        L67:
            r4.f1209 = r2
            r4.f1210 = r5
            r4.f1208 = r1
            return r3
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            super.setBackgroundColor(r2)
            boolean r0 = r1.f1206
            if (r0 != 0) goto L11
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r0
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            r1.f1205 = r2
        L11:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            boolean r0 = r1.f1206
            if (r0 != 0) goto Le
            if (r2 != 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f1205 = r2
        Le:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            boolean r0 = r1.f1206
            if (r0 != 0) goto Le
            if (r2 != 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.f1205 = r2
        Le:
            return
    }

    public void setDrawFullUnderline(boolean r1) {
            r0 = this;
            r0.f1205 = r1
            r1 = 1
            r0.f1206 = r1
            r0.invalidate()
            return
    }

    @Override // android.view.View
    public final void setPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            int r0 = r1.f1214
            if (r5 >= r0) goto L5
            r5 = r0
        L5:
            super.setPadding(r2, r3, r4, r5)
            return
    }

    public void setTabIndicatorColor(int r2) {
            r1 = this;
            r1.f1212 = r2
            android.graphics.Paint r0 = r1.f1202
            r0.setColor(r2)
            r1.invalidate()
            return
    }

    public void setTabIndicatorColorResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            int r2 = r0.getColor(r2)
            r1.setTabIndicatorColor(r2)
            return
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int r2) {
            r1 = this;
            int r0 = r1.f1215
            if (r2 >= r0) goto L5
            r2 = r0
        L5:
            super.setTextSpacing(r2)
            return
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* JADX INFO: renamed from: γ */
    public final void mo553(int r8, float r9, boolean r10) {
            r7 = this;
            int r0 = r7.getHeight()
            android.widget.TextView r1 = r7.f1221
            int r2 = r1.getLeft()
            int r3 = r7.f1201
            int r2 = r2 - r3
            int r4 = r1.getRight()
            int r4 = r4 + r3
            int r5 = r7.f1213
            int r5 = r0 - r5
            android.graphics.Rect r6 = r7.f1203
            r6.set(r2, r5, r4, r0)
            super.mo553(r8, r9, r10)
            r8 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 - r8
            float r8 = java.lang.Math.abs(r9)
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r9
            r9 = 1132396544(0x437f0000, float:255.0)
            float r8 = r8 * r9
            int r8 = (int) r8
            r7.f1204 = r8
            int r8 = r1.getLeft()
            int r8 = r8 - r3
            int r9 = r1.getRight()
            int r9 = r9 + r3
            r6.union(r8, r5, r9, r0)
            r7.invalidate(r6)
            return
    }
}
