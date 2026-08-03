package com.google.android.material.search;

/* JADX INFO: loaded from: classes.dex */
public final class SearchView extends android.widget.FrameLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.material.search.SearchBar f1084a;
    public int b;
    public com.google.android.material.search.SearchView.c c;

    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<com.google.android.material.search.SearchView> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                com.google.android.material.search.SearchView r2 = (com.google.android.material.search.SearchView) r2
                com.google.android.material.search.SearchBar r1 = r2.f1084a
                if (r1 == 0) goto L7
                goto L10
            L7:
                boolean r1 = r3 instanceof com.google.android.material.search.SearchBar
                if (r1 == 0) goto L10
                com.google.android.material.search.SearchBar r3 = (com.google.android.material.search.SearchBar) r3
                r2.setupWithSearchBar(r3)
            L10:
                r1 = 0
                return r1
        }
    }

    public static class a extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchView.a> CREATOR = null;
        public final java.lang.String c;
        public final int d;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchView$a$a, reason: collision with other inner class name */
        public class C0035a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.search.SearchView.a> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.search.SearchView$a r0 = new com.google.android.material.search.SearchView$a
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.search.SearchView.a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.search.SearchView$a r0 = new com.google.android.material.search.SearchView$a
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.search.SearchView$a[] r1 = new com.google.android.material.search.SearchView.a[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.search.SearchView$a$a r0 = new com.google.android.material.search.SearchView$a$a
                r0.<init>()
                com.google.android.material.search.SearchView.a.CREATOR = r0
                return
        }

        public a(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r2 = r1.readString()
                r0.c = r2
                int r1 = r1.readInt()
                r0.d = r1
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.c
                r1.writeString(r2)
                int r2 = r0.d
                r1.writeInt(r2)
                return
        }
    }

    public interface b {
        void a();
    }

    public enum c extends java.lang.Enum<com.google.android.material.search.SearchView.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.google.android.material.search.SearchView.c f1085a = null;
        public static final com.google.android.material.search.SearchView.c b = null;
        public static final /* synthetic */ com.google.android.material.search.SearchView.c[] c = null;

        static {
                com.google.android.material.search.SearchView$c r0 = new com.google.android.material.search.SearchView$c
                java.lang.String r1 = "HIDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.search.SearchView$c r1 = new com.google.android.material.search.SearchView$c
                java.lang.String r2 = "HIDDEN"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.android.material.search.SearchView.c.f1085a = r1
                com.google.android.material.search.SearchView$c r2 = new com.google.android.material.search.SearchView$c
                java.lang.String r3 = "SHOWING"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.android.material.search.SearchView$c r3 = new com.google.android.material.search.SearchView$c
                java.lang.String r4 = "SHOWN"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.android.material.search.SearchView.c.b = r3
                com.google.android.material.search.SearchView$c[] r0 = new com.google.android.material.search.SearchView.c[]{r0, r1, r2, r3}
                com.google.android.material.search.SearchView.c.c = r0
                return
        }

        c() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static com.google.android.material.search.SearchView.c valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.search.SearchView$c> r0 = com.google.android.material.search.SearchView.c.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.search.SearchView$c r1 = (com.google.android.material.search.SearchView.c) r1
                return r1
        }

        public static com.google.android.material.search.SearchView.c[] values() {
                com.google.android.material.search.SearchView$c[] r0 = com.google.android.material.search.SearchView.c.c
                java.lang.Object r0 = r0.clone()
                com.google.android.material.search.SearchView$c[] r0 = (com.google.android.material.search.SearchView.c[]) r0
                return r0
        }
    }

    private android.view.Window getActivityWindow() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L4:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L17
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L10
            android.app.Activity r0 = (android.app.Activity) r0
            goto L18
        L10:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L4
        L17:
            r0 = r2
        L18:
            if (r0 != 0) goto L1b
            return r2
        L1b:
            android.view.Window r0 = r0.getWindow()
            return r0
    }

    private float getOverlayElevation() {
            r2 = this;
            com.google.android.material.search.SearchBar r0 = r2.f1084a
            if (r0 == 0) goto L9
            float r0 = r0.getCompatElevation()
            return r0
        L9:
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.dimen.m3_searchview_elevation
            float r0 = r0.getDimension(r1)
            return r0
    }

    private int getStatusBarHeight() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L19
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r1.getDimensionPixelSize(r0)
            return r0
        L19:
            r0 = 0
            return r0
    }

    private void setStatusBarSpacerEnabledInternal(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    private void setUpBackgroundViewElevationOverlay(float r1) {
            r0 = this;
            return
    }

    private void setUpHeaderLayout(int r4) {
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L4
            return
        L4:
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            r2 = 0
            r0.inflate(r4, r2, r1)
            throw r2
    }

    private void setUpStatusBarSpacer(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public a.Pa getBackHelper() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.c<com.google.android.material.search.SearchView> getBehavior() {
            r1 = this;
            com.google.android.material.search.SearchView$Behavior r0 = new com.google.android.material.search.SearchView$Behavior
            r0.<init>()
            return r0
    }

    public com.google.android.material.search.SearchView.c getCurrentTransitionState() {
            r1 = this;
            com.google.android.material.search.SearchView$c r0 = r1.c
            return r0
    }

    public int getDefaultNavigationIconResource() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.ic_arrow_back_black_24
            return r0
    }

    public android.widget.EditText getEditText() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getHint() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public android.widget.TextView getSearchPrefix() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.CharSequence getSearchPrefixText() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public android.text.Editable getText() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public androidx.appcompat.widget.Toolbar getToolbar() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r1 = r0 instanceof a.Ta
            if (r1 == 0) goto L10
            a.Ta r0 = (a.Ta) r0
            a.C0282n9.A(r2, r0)
        L10:
            return
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            android.view.Window r0 = r1.getActivityWindow()
            if (r0 == 0) goto L11
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.softInputMode
            r1.b = r0
        L11:
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchView.a
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchView$a r2 = (com.google.android.material.search.SearchView.a) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            java.lang.String r0 = r2.c
            r1.setText(r0)
            int r2 = r2.d
            if (r2 != 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r1.setVisible(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            if (r0 == 0) goto L12
            android.text.Editable r0 = r2.getText()
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            r0.toString()
        L10:
            r0 = 0
            throw r0
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "superState must not be null"
            r0.<init>(r1)
            throw r0
    }

    public void setAnimatedNavigationIcon(boolean r1) {
            r0 = this;
            return
    }

    public void setAutoShowKeyboard(boolean r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.setUpBackgroundViewElevationOverlay(r1)
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

    public void setMenuItemsAnimated(boolean r1) {
            r0 = this;
            return
    }

    public void setModalForAccessibility(boolean r4) {
            r3 = this;
            android.view.View r0 = r3.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r4 == 0) goto L11
            java.util.HashMap r4 = new java.util.HashMap
            int r1 = r0.getChildCount()
            r4.<init>(r1)
        L11:
            r4 = 0
        L12:
            int r1 = r0.getChildCount()
            r2 = 0
            if (r4 >= r1) goto L23
            android.view.View r1 = r0.getChildAt(r4)
            if (r1 != r3) goto L22
            int r4 = r4 + 1
            goto L12
        L22:
            throw r2
        L23:
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.h r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setSearchPrefixText(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setStatusBarSpacerEnabled(boolean r1) {
            r0 = this;
            r0.setStatusBarSpacerEnabledInternal(r1)
            return
    }

    public void setText(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public void setText(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setToolbarTouchscreenBlocksFocus(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setTransitionState(com.google.android.material.search.SearchView.c r2) {
            r1 = this;
            com.google.android.material.search.SearchView$c r0 = r1.c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            goto L36
        L9:
            com.google.android.material.search.SearchView$c r0 = com.google.android.material.search.SearchView.c.b
            if (r2 != r0) goto L12
            r0 = 1
            r1.setModalForAccessibility(r0)
            goto L1a
        L12:
            com.google.android.material.search.SearchView$c r0 = com.google.android.material.search.SearchView.c.f1085a
            if (r2 != r0) goto L1a
            r0 = 0
            r1.setModalForAccessibility(r0)
        L1a:
            r1.c = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r0 = 0
            r2.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.next()
            com.google.android.material.search.SearchView$b r0 = (com.google.android.material.search.SearchView.b) r0
            r0.a()
            goto L26
        L36:
            return
    }

    public void setUseWindowInsetsController(boolean r1) {
            r0 = this;
            return
    }

    public void setVisible(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setupWithSearchBar(com.google.android.material.search.SearchBar r1) {
            r0 = this;
            r0.f1084a = r1
            r1 = 0
            throw r1
    }
}
