package com.google.android.material.search;

/* JADX INFO: loaded from: classes.dex */
public final class SearchBar extends androidx.appcompat.widget.Toolbar {
    public android.graphics.drawable.Drawable U;
    public int V;
    public boolean W;

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior {
        public boolean g;

        public ScrollingViewBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.g = r0
                return
        }

        public ScrollingViewBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.g = r1
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                super.d(r1, r2, r3)
                boolean r1 = r0.g
                r2 = 0
                if (r1 != 0) goto L18
                boolean r1 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r1 == 0) goto L18
                r1 = 1
                r0.g = r1
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r3.setBackgroundColor(r2)
                r1 = 0
                r3.setTargetElevation(r1)
            L18:
                return r2
        }
    }

    public static class a extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchBar.a> CREATOR = null;
        public java.lang.String c;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        public class C0034a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.search.SearchBar.a> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.search.SearchBar$a r0 = new com.google.android.material.search.SearchBar$a
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.search.SearchBar.a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.search.SearchBar$a r0 = new com.google.android.material.search.SearchBar$a
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.search.SearchBar$a[] r1 = new com.google.android.material.search.SearchBar.a[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.search.SearchBar$a$a r0 = new com.google.android.material.search.SearchBar$a$a
                r0.<init>()
                com.google.android.material.search.SearchBar.a.CREATOR = r0
                return
        }

        public a(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r1 = r1.readString()
                r0.c = r1
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.c
                r1.writeString(r2)
                return
        }
    }

    private void setNavigationIconDecorative(boolean r3) {
            r2 = this;
            android.widget.ImageButton r0 = a.C0431vf.a(r2)
            if (r0 != 0) goto L7
            return
        L7:
            r1 = r3 ^ 1
            r0.setClickable(r1)
            r0.setFocusable(r1)
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L17
            r2.U = r1
        L17:
            if (r3 == 0) goto L1b
            r3 = 0
            goto L1d
        L1b:
            android.graphics.drawable.Drawable r3 = r2.U
        L1d:
            r0.setBackgroundDrawable(r3)
            r2.w()
            return
    }

    public android.view.View getCenterView() {
            r1 = this;
            r0 = 0
            return r0
    }

    public float getCompatElevation() {
            r1 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            float r0 = a.C0414ug.d.i(r1)
            return r0
    }

    public float getCornerSize() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public int getDefaultMarginVerticalResource() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.m3_searchbar_margin_vertical
            return r0
    }

    public int getDefaultNavigationIconResource() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.ic_search_black_24
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public int getMenuResId() {
            r1 = this;
            int r0 = r1.V
            return r0
    }

    public int getStrokeColor() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public float getStrokeWidth() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public java.lang.CharSequence getText() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public android.widget.TextView getTextView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int r4) {
            r3 = this;
            android.view.Menu r0 = r3.getMenu()
            boolean r1 = r0 instanceof androidx.appcompat.view.menu.f
            if (r1 == 0) goto Le
            r2 = r0
            androidx.appcompat.view.menu.f r2 = (androidx.appcompat.view.menu.f) r2
            r2.w()
        Le:
            super.m(r4)
            r3.V = r4
            if (r1 == 0) goto L1a
            androidx.appcompat.view.menu.f r0 = (androidx.appcompat.view.menu.f) r0
            r0.v()
        L1a:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            a.C0282n9.A(r1, r0)
            throw r0
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            java.lang.Class<android.widget.EditText> r0 = android.widget.EditText.class
            java.lang.String r0 = r0.getCanonicalName()
            r4.setClassName(r0)
            boolean r0 = r3.isEnabled()
            r4.setEditable(r0)
            java.lang.CharSequence r0 = r3.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.CharSequence r2 = r3.getHint()
            r4.setHintText(r2)
            r4.setShowingHintText(r1)
            if (r1 == 0) goto L2b
            java.lang.CharSequence r0 = r3.getHint()
        L2b:
            r4.setText(r0)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r0.w()
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchBar.a
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchBar$a r2 = (com.google.android.material.search.SearchBar.a) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.c
            r1.setText(r2)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.search.SearchBar$a r0 = new com.google.android.material.search.SearchBar$a
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.getText()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            java.lang.String r1 = r1.toString()
        L15:
            r0.c = r1
            return r0
    }

    public void setCenterView(android.view.View r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.addView(r1)
        L5:
            return
    }

    public void setDefaultScrollFlagsEnabled(boolean r3) {
            r2 = this;
            r2.W = r3
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r3 = r3 instanceof com.google.android.material.appbar.AppBarLayout.c
            if (r3 == 0) goto L24
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r3 = (com.google.android.material.appbar.AppBarLayout.c) r3
            boolean r0 = r2.W
            r1 = 53
            if (r0 == 0) goto L1d
            int r0 = r3.f1041a
            if (r0 != 0) goto L24
            r3.f1041a = r1
            return
        L1d:
            int r0 = r3.f1041a
            if (r0 != r1) goto L24
            r0 = 0
            r3.f1041a = r0
        L24:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            return
    }

    public void setHint(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setHint(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setNavigationIcon(r1)
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            super.setNavigationOnClickListener(r1)
            if (r1 != 0) goto L7
            r1 = 1
            goto L8
        L7:
            r1 = 0
        L8:
            r0.setNavigationIconDecorative(r1)
            return
    }

    public void setOnLoadAnimationFadeInEnabled(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setStrokeColor(int r2) {
            r1 = this;
            int r0 = r1.getStrokeColor()
            if (r0 != r2) goto L7
            return
        L7:
            android.content.res.ColorStateList.valueOf(r2)
            r2 = 0
            throw r2
    }

    public void setStrokeWidth(float r2) {
            r1 = this;
            float r0 = r1.getStrokeWidth()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L9
            return
        L9:
            r2 = 0
            throw r2
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public void setText(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public final void w() {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L7
            return
        L7:
            int r0 = r6.getLayoutDirection()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            android.widget.ImageButton r0 = a.C0431vf.a(r6)
            if (r0 == 0) goto L2e
            boolean r3 = r0.isClickable()
            if (r3 == 0) goto L2e
            if (r1 == 0) goto L29
            int r3 = r6.getWidth()
            int r0 = r0.getLeft()
            int r3 = r3 - r0
            goto L2f
        L29:
            int r3 = r0.getRight()
            goto L2f
        L2e:
            r3 = r2
        L2f:
            r0 = r2
        L30:
            int r4 = r6.getChildCount()
            if (r0 >= r4) goto L44
            android.view.View r4 = r6.getChildAt(r0)
            boolean r5 = r4 instanceof androidx.appcompat.widget.ActionMenuView
            if (r5 == 0) goto L41
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            goto L45
        L41:
            int r0 = r0 + 1
            goto L30
        L44:
            r4 = 0
        L45:
            if (r4 == 0) goto L59
            if (r1 == 0) goto L4f
            int r0 = r4.getRight()
        L4d:
            r2 = r0
            goto L59
        L4f:
            int r0 = r6.getWidth()
            int r2 = r4.getLeft()
            int r0 = r0 - r2
            goto L4d
        L59:
            if (r1 == 0) goto L5d
            r0 = r2
            goto L5e
        L5d:
            r0 = r3
        L5e:
            int r0 = -r0
            float r0 = (float) r0
            if (r1 == 0) goto L63
            goto L64
        L63:
            r3 = r2
        L64:
            int r1 = -r3
            float r1 = (float) r1
            a.Nd.a(r6, r0, r1)
            return
    }
}
