package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class SearchView extends androidx.appcompat.widget.b implements a.InterfaceC0258m3 {
    public static final androidx.appcompat.widget.SearchView.e v = null;
    public boolean p;
    public boolean q;
    public a.B4 r;
    public java.lang.CharSequence s;
    public int t;
    public android.app.SearchableInfo u;

    public static class SearchAutoComplete extends a.F0 {
        public int e;
        public androidx.appcompat.widget.SearchView f;
        public boolean g;
        public final androidx.appcompat.widget.SearchView.SearchAutoComplete.a h;

        public class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.widget.SearchView.SearchAutoComplete f841a;

            public a(androidx.appcompat.widget.SearchView.SearchAutoComplete r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f841a = r1
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r3 = this;
                    androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f841a
                    boolean r1 = r0.g
                    if (r1 == 0) goto L18
                    android.content.Context r1 = r0.getContext()
                    java.lang.String r2 = "input_method"
                    java.lang.Object r1 = r1.getSystemService(r2)
                    android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                    r2 = 0
                    r1.showSoftInput(r0, r2)
                    r0.g = r2
                L18:
                    return
            }
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
                r1.<init>(r2, r3, r0)
                androidx.appcompat.widget.SearchView$SearchAutoComplete$a r2 = new androidx.appcompat.widget.SearchView$SearchAutoComplete$a
                r2.<init>(r1)
                r1.h = r2
                int r2 = r1.getThreshold()
                r1.e = r2
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r1 = r0.screenWidthDp
                int r2 = r0.screenHeightDp
                r3 = 960(0x3c0, float:1.345E-42)
                if (r1 < r3) goto L1c
                r3 = 720(0x2d0, float:1.009E-42)
                if (r2 < r3) goto L1c
                int r0 = r0.orientation
                r3 = 2
                if (r0 != r3) goto L1c
                r0 = 256(0x100, float:3.59E-43)
                return r0
            L1c:
                r0 = 600(0x258, float:8.41E-43)
                if (r1 >= r0) goto L2c
                r0 = 640(0x280, float:8.97E-43)
                if (r1 < r0) goto L29
                r0 = 480(0x1e0, float:6.73E-43)
                if (r2 < r0) goto L29
                goto L2c
            L29:
                r0 = 160(0xa0, float:2.24E-43)
                return r0
            L2c:
                r0 = 192(0xc0, float:2.69E-43)
                return r0
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.e
                if (r0 <= 0) goto Ld
                boolean r0 = super.enoughToFilter()
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                return r0
            Ld:
                r0 = 1
                return r0
        }

        @Override // a.F0, android.widget.TextView, android.view.View
        public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.g
                if (r0 == 0) goto L10
                androidx.appcompat.widget.SearchView$SearchAutoComplete$a r0 = r1.h
                r1.removeCallbacks(r0)
                r1.post(r0)
            L10:
                return r2
        }

        @Override // android.view.View
        public final void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r0 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r0 = (int) r0
                r3.setMinWidth(r0)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
                r0 = this;
                super.onFocusChanged(r1, r2, r3)
                androidx.appcompat.widget.SearchView r1 = r0.f
                boolean r2 = r1.q
                r1.q = r2
                r1 = 0
                throw r1
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L3d
                int r0 = r4.getAction()
                r1 = 1
                if (r0 != 0) goto L1a
                int r0 = r4.getRepeatCount()
                if (r0 != 0) goto L1a
                android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
                if (r3 == 0) goto L19
                r3.startTracking(r4, r2)
            L19:
                return r1
            L1a:
                int r0 = r4.getAction()
                if (r0 != r1) goto L3d
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r4)
            L29:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L3d
                boolean r0 = r4.isCanceled()
                if (r0 == 0) goto L36
                goto L3d
            L36:
                androidx.appcompat.widget.SearchView r3 = r2.f
                r3.clearFocus()
                r3 = 0
                throw r3
            L3d:
                boolean r3 = super.onKeyPreIme(r3, r4)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean r3) {
                r2 = this;
                super.onWindowFocusChanged(r3)
                if (r3 == 0) goto L50
                androidx.appcompat.widget.SearchView r3 = r2.f
                boolean r3 = r3.hasFocus()
                if (r3 == 0) goto L50
                int r3 = r2.getVisibility()
                if (r3 != 0) goto L50
                r3 = 1
                r2.g = r3
                android.content.Context r0 = r2.getContext()
                android.content.res.Resources r0 = r0.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r0 = r0.orientation
                r1 = 2
                if (r0 != r1) goto L50
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L3a
                androidx.appcompat.widget.SearchView.a.b(r2, r3)
                boolean r3 = r2.enoughToFilter()
                if (r3 == 0) goto L50
                r2.showDropDown()
                goto L50
            L3a:
                androidx.appcompat.widget.SearchView$e r3 = androidx.appcompat.widget.SearchView.v
                r3.getClass()
                androidx.appcompat.widget.SearchView.e.a()
                java.lang.reflect.Method r3 = r3.f842a
                if (r3 == 0) goto L50
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L50
                java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L50
                r3.invoke(r2, r0)     // Catch: java.lang.Exception -> L50
            L50:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        public void setImeVisibility(boolean r4) {
                r3 = this;
                android.content.Context r0 = r3.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                androidx.appcompat.widget.SearchView$SearchAutoComplete$a r1 = r3.h
                r2 = 0
                if (r4 != 0) goto L1e
                r3.g = r2
                r3.removeCallbacks(r1)
                android.os.IBinder r4 = r3.getWindowToken()
                r0.hideSoftInputFromWindow(r4, r2)
                return
            L1e:
                boolean r4 = r0.isActive(r3)
                if (r4 == 0) goto L2d
                r3.g = r2
                r3.removeCallbacks(r1)
                r0.showSoftInput(r3, r2)
                return
            L2d:
                r4 = 1
                r3.g = r4
                return
        }

        public void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.e = r1
                return
        }
    }

    public static class a {
        public static void a(android.widget.AutoCompleteTextView r0) {
                r0.refreshAutoCompleteResults()
                return
        }

        public static void b(androidx.appcompat.widget.SearchView.SearchAutoComplete r0, int r1) {
                r0.setInputMethodMode(r1)
                return
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.reflect.Method f842a;

        public static void a() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L7
                return
            L7:
                java.lang.UnsupportedClassVersionError r0 = new java.lang.UnsupportedClassVersionError
                java.lang.String r1 = "This function can only be used for API Level < 29."
                r0.<init>(r1)
                throw r0
        }
    }

    public static class f extends a.r {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.f> CREATOR = null;
        public boolean c;

        public class a implements android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.SearchView.f> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.appcompat.widget.SearchView$f r0 = new androidx.appcompat.widget.SearchView$f
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final androidx.appcompat.widget.SearchView.f createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.appcompat.widget.SearchView$f r0 = new androidx.appcompat.widget.SearchView$f
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.appcompat.widget.SearchView$f[] r1 = new androidx.appcompat.widget.SearchView.f[r1]
                    return r1
            }
        }

        static {
                androidx.appcompat.widget.SearchView$f$a r0 = new androidx.appcompat.widget.SearchView$f$a
                r0.<init>()
                androidx.appcompat.widget.SearchView.f.CREATOR = r0
                return
        }

        public f(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                java.lang.Object r1 = r1.readValue(r2)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r0.c = r1
                return
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SearchView.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " isIconified="
                r0.append(r1)
                boolean r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.c
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.writeValue(r2)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 >= r1) goto L38
            androidx.appcompat.widget.SearchView$e r0 = new androidx.appcompat.widget.SearchView$e
            java.lang.Class<android.widget.AutoCompleteTextView> r1 = android.widget.AutoCompleteTextView.class
            r0.<init>()
            r0.f842a = r2
            androidx.appcompat.widget.SearchView.e.a()
            r3 = 1
            java.lang.String r4 = "doBeforeTextChanged"
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L1d
            r4.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L1d
        L1d:
            java.lang.String r4 = "doAfterTextChanged"
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L26
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L26
        L26:
            java.lang.String r2 = "ensureImeVisible"
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L37
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L37
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L37
            r0.f842a = r1     // Catch: java.lang.NoSuchMethodException -> L37
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L37
        L37:
            r2 = r0
        L38:
            androidx.appcompat.widget.SearchView.v = r2
            return
    }

    private int getPreferredHeight() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.R.dimen.abc_search_view_preferred_height
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private int getPreferredWidth() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.R.dimen.abc_search_view_preferred_width
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private void setQuery(java.lang.CharSequence r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
            r1 = this;
            super.clearFocus()
            r0 = 0
            throw r0
    }

    @Override // a.InterfaceC0258m3
    public final void d() {
            r0 = this;
            return
    }

    @Override // a.InterfaceC0258m3
    public final void e() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public int getImeOptions() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public int getInputType() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.t
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public java.lang.CharSequence getQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.s
            if (r0 == 0) goto L5
            return r0
        L5:
            android.app.SearchableInfo r0 = r2.u
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            android.app.SearchableInfo r1 = r2.u
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L1e:
            r0 = 0
            return r0
    }

    public int getSuggestionCommitIconResId() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getSuggestionRowLayout() {
            r1 = this;
            r0 = 0
            return r0
    }

    public a.B4 getSuggestionsAdapter() {
            r1 = this;
            a.B4 r0 = r1.r
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.removeCallbacks(r0)
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 != 0) goto L6
            return
        L6:
            r1 = 0
            throw r1
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.q
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2e
            if (r0 == 0) goto L24
            if (r0 == r2) goto L1b
            goto L3f
        L1b:
            int r0 = r3.t
            if (r0 <= 0) goto L3f
            int r4 = java.lang.Math.min(r0, r4)
            goto L3f
        L24:
            int r4 = r3.t
            if (r4 <= 0) goto L29
            goto L3f
        L29:
            int r4 = r3.getPreferredWidth()
            goto L3f
        L2e:
            int r0 = r3.t
            if (r0 <= 0) goto L37
            int r4 = java.lang.Math.min(r0, r4)
            goto L3f
        L37:
            int r0 = r3.getPreferredWidth()
            int r4 = java.lang.Math.min(r0, r4)
        L3f:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L51
            if (r0 == 0) goto L4c
            goto L59
        L4c:
            int r5 = r3.getPreferredHeight()
            goto L59
        L51:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L59:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.SearchView.f
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.appcompat.widget.SearchView$f r2 = (androidx.appcompat.widget.SearchView.f) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.c
            r1.q = r2
            r2 = 0
            throw r2
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.SearchView$f r1 = new androidx.appcompat.widget.SearchView$f
            r1.<init>(r0)
            boolean r0 = r2.q
            r1.c = r0
            return r1
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            r1 = 0
            r0.post(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r1, android.graphics.Rect r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void setIconified(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L4
            throw r0
        L4:
            r2 = 0
            r1.q = r2
            throw r0
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.p
            if (r0 != r2) goto L5
            return
        L5:
            r1.p = r2
            r1.q = r2
            r2 = 0
            throw r2
    }

    public void setImeOptions(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setInputType(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.t = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.b r1) {
            r0 = this;
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            return
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.c r1) {
            r0 = this;
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            return
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.d r1) {
            r0 = this;
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.s = r1
            r0.getQueryHint()
            r1 = 0
            throw r1
    }

    public void setQueryRefinementEnabled(boolean r3) {
            r2 = this;
            a.B4 r0 = r2.r
            boolean r1 = r0 instanceof a.Ee
            if (r1 == 0) goto Lf
            a.Ee r0 = (a.Ee) r0
            if (r3 == 0) goto Lc
            r3 = 2
            goto Ld
        Lc:
            r3 = 1
        Ld:
            r0.e = r3
        Lf:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r2) {
            r1 = this;
            r1.u = r2
            r0 = 0
            if (r2 != 0) goto L20
            if (r2 == 0) goto L1b
            boolean r2 = r2.getVoiceSearchEnabled()
            if (r2 == 0) goto L1b
            android.app.SearchableInfo r2 = r1.u
            boolean r2 = r2.getVoiceSearchLaunchWebSearch()
            if (r2 == 0) goto L16
            goto L1b
        L16:
            android.app.SearchableInfo r2 = r1.u
            r2.getVoiceSearchLaunchRecognizer()
        L1b:
            boolean r2 = r1.q
            r1.q = r2
            throw r0
        L20:
            r2.getSuggestThreshold()
            throw r0
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            boolean r1 = r0.q
            r0.q = r1
            r1 = 0
            throw r1
    }

    public void setSuggestionsAdapter(a.B4 r1) {
            r0 = this;
            r0.r = r1
            r1 = 0
            throw r1
    }
}
