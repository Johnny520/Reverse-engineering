package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class c extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {

    public class a extends android.widget.LinearLayout {
        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int r1, int r2) {
                r0 = this;
                super.onMeasure(r1, r2)
                r1 = 0
                throw r1
        }

        @Override // android.view.View
        public final void setSelected(boolean r2) {
                r1 = this;
                boolean r0 = r1.isSelected()
                if (r0 == r2) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r2)
                if (r0 == 0) goto L14
                if (r2 == 0) goto L14
                r2 = 4
                r1.sendAccessibilityEvent(r2)
            L14:
                return
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            return
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration r6) {
            r5 = this;
            super.onConfigurationChanged(r6)
            android.content.Context r6 = r5.getContext()
            int[] r0 = androidx.appcompat.R.styleable.ActionBar
            int r1 = androidx.appcompat.R.attr.actionBarStyle
            r2 = 0
            r3 = 0
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r2, r0, r1, r3)
            int r1 = androidx.appcompat.R.styleable.ActionBar_height
            int r1 = r0.getLayoutDimension(r1, r3)
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.Resources r3 = r6.getResources()
            int r4 = androidx.appcompat.R.bool.abc_action_bar_embed_tabs
            boolean r3 = r3.getBoolean(r4)
            if (r3 != 0) goto L31
            int r3 = androidx.appcompat.R.dimen.abc_action_bar_stacked_max_height
            int r2 = r2.getDimensionPixelSize(r3)
            int r1 = java.lang.Math.min(r1, r2)
        L31:
            r0.recycle()
            r5.setContentHeight(r1)
            android.content.res.Resources r6 = r6.getResources()
            int r0 = androidx.appcompat.R.dimen.abc_action_bar_stacked_tab_max_width
            r6.getDimensionPixelSize(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.widget.c$a r2 = (androidx.appcompat.widget.c.a) r2
            r1 = 0
            throw r1
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            int r1 = android.view.View.MeasureSpec.getMode(r1)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            r0.setFillViewport(r1)
            r1 = 0
            throw r1
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
