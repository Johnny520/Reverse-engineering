package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends defpackage.tq implements defpackage.ya {
    public static final defpackage.yv g0 = null;
    public final android.graphics.Rect A;
    public final int[] B;
    public final int[] C;
    public final android.widget.ImageView D;
    public final android.graphics.drawable.Drawable E;
    public final int F;
    public final int G;
    public final android.content.Intent H;
    public final android.content.Intent I;
    public final java.lang.CharSequence J;
    public android.view.View.OnFocusChangeListener K;
    public android.view.View.OnClickListener L;
    public boolean M;
    public boolean N;
    public defpackage.we O;
    public boolean P;
    public java.lang.CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public java.lang.CharSequence V;
    public boolean W;
    public int a0;
    public android.app.SearchableInfo b0;
    public android.os.Bundle c0;
    public final defpackage.a20 d0;
    public final defpackage.a20 e0;
    public final java.util.WeakHashMap f0;
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete p;
    public final android.view.View q;
    public final android.view.View r;
    public final android.view.View s;
    public final android.widget.ImageView t;
    public final android.widget.ImageView u;
    public final android.widget.ImageView v;
    public final android.widget.ImageView w;
    public final android.view.View x;
    public defpackage.h20 y;
    public final android.graphics.Rect z;

    public static class SearchAutoComplete extends defpackage.u2 {
        public int e;
        public androidx.appcompat.widget.SearchView f;
        public boolean g;
        public final androidx.appcompat.widget.d h;

        public SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                androidx.appcompat.widget.d r1 = new androidx.appcompat.widget.d
                r1.<init>(r0)
                r0.h = r1
                int r1 = r0.getThreshold()
                r0.e = r1
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

        public final void a() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L14
                r0 = 1
                androidx.appcompat.widget.c.b(r2, r0)
                boolean r0 = r2.enoughToFilter()
                if (r0 == 0) goto L29
                r2.showDropDown()
                return
            L14:
                yv r0 = androidx.appcompat.widget.SearchView.g0
                r0.getClass()
                defpackage.yv.a()
                java.lang.reflect.Method r0 = r0.c
                if (r0 == 0) goto L29
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L29
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L29
                r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L29
            L29:
                return
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

        @Override // defpackage.u2, android.widget.TextView, android.view.View
        public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.g
                if (r0 == 0) goto L10
                androidx.appcompat.widget.d r0 = r1.h
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
                boolean r2 = r1.N
                r1.w(r2)
                a20 r2 = r1.d0
                r1.post(r2)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.p
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L1a
                r1.l()
            L1a:
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 4
                if (r3 != r0) goto L3f
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
                if (r0 != r1) goto L3f
                android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r4)
            L29:
                boolean r0 = r4.isTracking()
                if (r0 == 0) goto L3f
                boolean r0 = r4.isCanceled()
                if (r0 != 0) goto L3f
                androidx.appcompat.widget.SearchView r3 = r2.f
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L3f:
                boolean r3 = super.onKeyPreIme(r3, r4)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean r2) {
                r1 = this;
                super.onWindowFocusChanged(r2)
                if (r2 == 0) goto L2c
                androidx.appcompat.widget.SearchView r2 = r1.f
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L2c
                int r2 = r1.getVisibility()
                if (r2 != 0) goto L2c
                r2 = 1
                r1.g = r2
                android.content.Context r2 = r1.getContext()
                yv r0 = androidx.appcompat.widget.SearchView.g0
                android.content.res.Resources r2 = r2.getResources()
                android.content.res.Configuration r2 = r2.getConfiguration()
                int r2 = r2.orientation
                r0 = 2
                if (r2 != r0) goto L2c
                r1.a()
            L2c:
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
                androidx.appcompat.widget.d r1 = r3.h
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

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 >= r1) goto L40
            yv r0 = new yv
            java.lang.Class<android.widget.AutoCompleteTextView> r1 = android.widget.AutoCompleteTextView.class
            r0.<init>()
            r0.a = r2
            r0.b = r2
            r0.c = r2
            defpackage.yv.a()
            r3 = 1
            java.lang.String r4 = "doBeforeTextChanged"
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L23
            r0.a = r4     // Catch: java.lang.NoSuchMethodException -> L23
            r4.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L23
        L23:
            java.lang.String r4 = "doAfterTextChanged"
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L2e
            r0.b = r2     // Catch: java.lang.NoSuchMethodException -> L2e
            r2.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L2e
        L2e:
            java.lang.String r2 = "ensureImeVisible"
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3f
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L3f
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L3f
            r0.c = r1     // Catch: java.lang.NoSuchMethodException -> L3f
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> L3f
        L3f:
            r2 = r0
        L40:
            androidx.appcompat.widget.SearchView.g0 = r2
            return
    }

    public SearchView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969453(0x7f04036d, float:1.7547588E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            r18.<init>(r19, r20, r21)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.z = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.A = r2
            r6 = 2
            int[] r2 = new int[r6]
            r0.B = r2
            int[] r2 = new int[r6]
            r0.C = r2
            a20 r2 = new a20
            r3 = 0
            r2.<init>(r0, r3)
            r0.d0 = r2
            a20 r2 = new a20
            r3 = 1
            r2.<init>(r0, r3)
            r0.e0 = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r0.f0 = r2
            androidx.appcompat.widget.a r7 = new androidx.appcompat.widget.a
            r7.<init>(r0)
            androidx.appcompat.widget.b r8 = new androidx.appcompat.widget.b
            r8.<init>(r0)
            c20 r9 = new c20
            r9.<init>(r0)
            q4 r10 = new q4
            r2 = 2
            r10.<init>(r2, r0)
            er r11 = new er
            r2 = 1
            r11.<init>(r2, r0)
            z10 r12 = new z10
            r2 = 0
            r12.<init>(r0, r2)
            r5 r13 = new r5
            int[] r2 = defpackage.xy.u
            r14 = 0
            r3 = r20
            r5 = r21
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r3, r2, r5, r14)
            r13.<init>(r1, r4)
            defpackage.ja0.k(r0, r1, r2, r3, r4, r5)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r19)
            r2 = 19
            r3 = 2131492889(0x7f0c0019, float:1.8609243E38)
            int r2 = r4.getResourceId(r2, r3)
            r3 = 1
            r1.inflate(r2, r0, r3)
            r1 = 2131296603(0x7f09015b, float:1.8211127E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r1
            r0.p = r1
            r1.setSearchView(r0)
            r2 = 2131296599(0x7f090157, float:1.821112E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.q = r2
            r2 = 2131296602(0x7f09015a, float:1.8211125E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.r = r2
            r5 = 2131296639(0x7f09017f, float:1.82112E38)
            android.view.View r5 = r0.findViewById(r5)
            r0.s = r5
            r15 = 2131296597(0x7f090155, float:1.8211115E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r0.t = r15
            r6 = 2131296600(0x7f090158, float:1.8211121E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.u = r6
            r3 = 2131296598(0x7f090156, float:1.8211117E38)
            android.view.View r3 = r0.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.v = r3
            r14 = 2131296604(0x7f09015c, float:1.821113E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r0.w = r14
            r16 = r8
            r8 = 2131296601(0x7f090159, float:1.8211123E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.D = r8
            r17 = r11
            r11 = 20
            android.graphics.drawable.Drawable r11 = r13.m(r11)
            defpackage.s90.q(r2, r11)
            r2 = 25
            android.graphics.drawable.Drawable r2 = r13.m(r2)
            defpackage.s90.q(r5, r2)
            r2 = 23
            android.graphics.drawable.Drawable r5 = r13.m(r2)
            r15.setImageDrawable(r5)
            r5 = 15
            android.graphics.drawable.Drawable r5 = r13.m(r5)
            r6.setImageDrawable(r5)
            r5 = 12
            android.graphics.drawable.Drawable r5 = r13.m(r5)
            r3.setImageDrawable(r5)
            r5 = 28
            android.graphics.drawable.Drawable r5 = r13.m(r5)
            r14.setImageDrawable(r5)
            android.graphics.drawable.Drawable r2 = r13.m(r2)
            r8.setImageDrawable(r2)
            r2 = 22
            android.graphics.drawable.Drawable r2 = r13.m(r2)
            r0.E = r2
            android.content.res.Resources r2 = r0.getResources()
            r5 = 2131755029(0x7f100015, float:1.9140926E38)
            java.lang.String r2 = r2.getString(r5)
            defpackage.l70.a(r15, r2)
            r2 = 26
            r5 = 2131492888(0x7f0c0018, float:1.860924E38)
            int r2 = r4.getResourceId(r2, r5)
            r0.F = r2
            r2 = 13
            r5 = 0
            int r2 = r4.getResourceId(r2, r5)
            r0.G = r2
            r15.setOnClickListener(r7)
            r3.setOnClickListener(r7)
            r6.setOnClickListener(r7)
            r14.setOnClickListener(r7)
            r1.setOnClickListener(r7)
            r1.addTextChangedListener(r12)
            r1.setOnEditorActionListener(r9)
            r1.setOnItemClickListener(r10)
            r2 = r17
            r1.setOnItemSelectedListener(r2)
            r2 = r16
            r1.setOnKeyListener(r2)
            b20 r2 = new b20
            r2.<init>(r0)
            r1.setOnFocusChangeListener(r2)
            r2 = 18
            r3 = 1
            boolean r2 = r4.getBoolean(r2, r3)
            r0.setIconifiedByDefault(r2)
            r2 = -1
            r3 = 2
            int r3 = r4.getDimensionPixelSize(r3, r2)
            if (r3 == r2) goto L184
            r0.setMaxWidth(r3)
        L184:
            r3 = 14
            java.lang.CharSequence r3 = r4.getText(r3)
            r0.J = r3
            r3 = 21
            java.lang.CharSequence r3 = r4.getText(r3)
            r0.Q = r3
            r3 = 6
            int r3 = r4.getInt(r3, r2)
            if (r3 == r2) goto L19e
            r0.setImeOptions(r3)
        L19e:
            r3 = 5
            int r3 = r4.getInt(r3, r2)
            if (r3 == r2) goto L1a8
            r0.setInputType(r3)
        L1a8:
            r3 = 1
            boolean r2 = r4.getBoolean(r3, r3)
            r0.setFocusable(r2)
            r13.z()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.speech.action.WEB_SEARCH"
            r2.<init>(r3)
            r0.H = r2
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            java.lang.String r4 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r5 = "web_search"
            r2.putExtra(r4, r5)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.speech.action.RECOGNIZE_SPEECH"
            r2.<init>(r4)
            r0.I = r2
            r2.addFlags(r3)
            int r1 = r1.getDropDownAnchor()
            android.view.View r1 = r0.findViewById(r1)
            r0.x = r1
            if (r1 == 0) goto L1e9
            o7 r2 = new o7
            r3 = 2
            r2.<init>(r3, r0)
            r1.addOnLayoutChangeListener(r2)
        L1e9:
            boolean r1 = r0.M
            r0.w(r1)
            r0.t()
            return
    }

    private int getPreferredHeight() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165238(0x7f070036, float:1.7944687E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private int getPreferredWidth() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131165239(0x7f070037, float:1.794469E38)
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private void setQuery(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.p
            r0.setText(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Ld
            r3 = 0
            goto L11
        Ld:
            int r3 = r3.length()
        L11:
            r0.setSelection(r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
            r2 = this;
            r0 = 1
            r2.S = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.p
            r0.clearFocus()
            r1 = 0
            r0.setImeVisibility(r1)
            r2.S = r1
            return
    }

    public int getImeOptions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.p
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.p
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.T
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.p
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.Q
            if (r0 == 0) goto L5
            return r0
        L5:
            android.app.SearchableInfo r0 = r2.b0
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            android.app.SearchableInfo r1 = r2.b0
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L1e:
            java.lang.CharSequence r0 = r2.J
            return r0
    }

    public int getSuggestionCommitIconResId() {
            r1 = this;
            int r0 = r1.G
            return r0
    }

    public int getSuggestionRowLayout() {
            r1 = this;
            int r0 = r1.F
            return r0
    }

    public defpackage.we getSuggestionsAdapter() {
            r1 = this;
            we r0 = r1.O
            return r0
    }

    public final android.content.Intent j(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
            if (r3 == 0) goto Lf
            r0.setData(r3)
        Lf:
            java.lang.String r2 = "user_query"
            java.lang.CharSequence r3 = r1.V
            r0.putExtra(r2, r3)
            if (r5 == 0) goto L1d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L24:
            android.os.Bundle r2 = r1.c0
            if (r2 == 0) goto L2d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L2d:
            android.app.SearchableInfo r2 = r1.b0
            android.content.ComponentName r2 = r2.getSearchActivity()
            r0.setComponent(r2)
            return r0
    }

    public final android.content.Intent k(android.content.Intent r9, android.app.SearchableInfo r10) {
            r8 = this;
            android.content.ComponentName r0 = r10.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r8.getContext()
            r3 = 0
            r4 = 1107296256(0x42000000, float:32.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r8.c0
            if (r3 == 0) goto L27
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L27:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r9)
            android.content.res.Resources r9 = r8.getResources()
            int r4 = r10.getVoiceLanguageModeId()
            if (r4 == 0) goto L3f
            int r4 = r10.getVoiceLanguageModeId()
            java.lang.String r4 = r9.getString(r4)
            goto L41
        L3f:
            java.lang.String r4 = "free_form"
        L41:
            int r5 = r10.getVoicePromptTextId()
            r6 = 0
            if (r5 == 0) goto L51
            int r5 = r10.getVoicePromptTextId()
            java.lang.String r5 = r9.getString(r5)
            goto L52
        L51:
            r5 = r6
        L52:
            int r7 = r10.getVoiceLanguageId()
            if (r7 == 0) goto L61
            int r7 = r10.getVoiceLanguageId()
            java.lang.String r9 = r9.getString(r7)
            goto L62
        L61:
            r9 = r6
        L62:
            int r7 = r10.getVoiceMaxResults()
            if (r7 == 0) goto L6d
            int r10 = r10.getVoiceMaxResults()
            goto L6e
        L6d:
            r10 = 1
        L6e:
            java.lang.String r7 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r7, r4)
            java.lang.String r4 = "android.speech.extra.PROMPT"
            r3.putExtra(r4, r5)
            java.lang.String r4 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r4, r9)
            java.lang.String r9 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r9, r10)
            if (r0 != 0) goto L85
            goto L89
        L85:
            java.lang.String r6 = r0.flattenToShortString()
        L89:
            java.lang.String r9 = "calling_package"
            r3.putExtra(r9, r6)
            java.lang.String r9 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r9, r1)
            java.lang.String r9 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r9, r2)
            return r3
    }

    public final void l() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r4.p
            if (r0 < r1) goto Lc
            androidx.appcompat.widget.c.a(r2)
            return
        Lc:
            yv r0 = androidx.appcompat.widget.SearchView.g0
            r0.getClass()
            defpackage.yv.a()
            java.lang.reflect.Method r1 = r0.a
            r3 = 0
            if (r1 == 0) goto L1c
            r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L1c
        L1c:
            r0.getClass()
            defpackage.yv.a()
            java.lang.reflect.Method r0 = r0.b
            if (r0 == 0) goto L29
            r0.invoke(r2, r3)     // Catch: java.lang.Exception -> L29
        L29:
            return
    }

    public final void m() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.p
            android.text.Editable r1 = r0.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r1 == 0) goto L18
            boolean r0 = r3.M
            if (r0 == 0) goto L17
            r3.clearFocus()
            r3.w(r2)
        L17:
            return
        L18:
            java.lang.String r1 = ""
            r0.setText(r1)
            r0.requestFocus()
            r0.setImeVisibility(r2)
            return
    }

    public final void n(int r7) {
            r6 = this;
            java.lang.String r0 = "SearchView"
            we r1 = r6.O
            android.database.Cursor r1 = r1.c
            if (r1 == 0) goto Lbc
            boolean r7 = r1.moveToPosition(r7)
            if (r7 == 0) goto Lbc
            r7 = 0
            int r2 = defpackage.e50.x     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = "suggest_intent_action"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = defpackage.e50.h(r1, r2)     // Catch: java.lang.RuntimeException -> L24
            if (r2 != 0) goto L26
            android.app.SearchableInfo r2 = r6.b0     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L24
            goto L26
        L24:
            r2 = move-exception
            goto L83
        L26:
            if (r2 != 0) goto L2a
            java.lang.String r2 = "android.intent.action.SEARCH"
        L2a:
            java.lang.String r3 = "suggest_intent_data"
            int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = defpackage.e50.h(r1, r3)     // Catch: java.lang.RuntimeException -> L24
            if (r3 != 0) goto L3c
            android.app.SearchableInfo r3 = r6.b0     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = r3.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L24
        L3c:
            if (r3 == 0) goto L62
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = defpackage.e50.h(r1, r4)     // Catch: java.lang.RuntimeException -> L24
            if (r4 == 0) goto L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L24
            r5.<init>()     // Catch: java.lang.RuntimeException -> L24
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = android.net.Uri.encode(r4)     // Catch: java.lang.RuntimeException -> L24
            r5.append(r3)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = r5.toString()     // Catch: java.lang.RuntimeException -> L24
        L62:
            if (r3 != 0) goto L66
            r3 = r7
            goto L6a
        L66:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.RuntimeException -> L24
        L6a:
            java.lang.String r4 = "suggest_intent_query"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = defpackage.e50.h(r1, r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = "suggest_intent_extra_data"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = defpackage.e50.h(r1, r5)     // Catch: java.lang.RuntimeException -> L24
            android.content.Intent r7 = r6.j(r2, r3, r5, r4)     // Catch: java.lang.RuntimeException -> L24
            goto L9f
        L83:
            int r1 = r1.getPosition()     // Catch: java.lang.RuntimeException -> L88
            goto L89
        L88:
            r1 = -1
        L89:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Search suggestions cursor at row "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " returned exception."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r0, r1, r2)
        L9f:
            if (r7 != 0) goto La2
            goto Lbc
        La2:
            android.content.Context r1 = r6.getContext()     // Catch: java.lang.RuntimeException -> Laa
            r1.startActivity(r7)     // Catch: java.lang.RuntimeException -> Laa
            goto Lbc
        Laa:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed launch activity: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7, r1)
        Lbc:
            r7 = 0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.p
            r0.setImeVisibility(r7)
            r0.dismissDropDown()
            return
    }

    public final void o(int r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.p
            android.text.Editable r0 = r0.getText()
            we r1 = r2.O
            android.database.Cursor r1 = r1.c
            if (r1 != 0) goto Ld
            goto L26
        Ld:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L23
            we r3 = r2.O
            java.lang.String r3 = r3.c(r1)
            if (r3 == 0) goto L1f
            r2.setQuery(r3)
            goto L26
        L1f:
            r2.setQuery(r0)
            goto L26
        L23:
            r2.setQuery(r0)
        L26:
            return
    }

    @Override // defpackage.ya
    public final void onActionViewCollapsed() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.p
            java.lang.String r1 = ""
            r0.setText(r1)
            int r2 = r0.length()
            r0.setSelection(r2)
            r3.V = r1
            r3.clearFocus()
            r1 = 1
            r3.w(r1)
            int r1 = r3.a0
            r0.setImeOptions(r1)
            r0 = 0
            r3.W = r0
            return
    }

    @Override // defpackage.ya
    public final void onActionViewExpanded() {
            r3 = this;
            boolean r0 = r3.W
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.W = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.p
            int r1 = r0.getImeOptions()
            r3.a0 = r1
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r2
            r0.setImeOptions(r1)
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            a20 r0 = r1.d0
            r1.removeCallbacks(r0)
            a20 r0 = r1.e0
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // defpackage.tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r7 = r6
            r6 = r5
            if (r7 == 0) goto L5c
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.p
            int[] r9 = r6.B
            r7.getLocationInWindow(r9)
            int[] r0 = r6.C
            r5.getLocationInWindow(r0)
            r1 = 1
            r2 = r9[r1]
            r1 = r0[r1]
            int r2 = r2 - r1
            r1 = 0
            r9 = r9[r1]
            r0 = r0[r1]
            int r9 = r9 - r0
            int r0 = r7.getWidth()
            int r0 = r0 + r9
            int r3 = r7.getHeight()
            int r3 = r3 + r2
            android.graphics.Rect r4 = r6.z
            r4.set(r9, r2, r0, r3)
            int r9 = r4.left
            int r0 = r4.right
            int r10 = r10 - r8
            android.graphics.Rect r8 = r6.A
            r8.set(r9, r1, r0, r10)
            h20 r9 = r6.y
            if (r9 != 0) goto L47
            h20 r9 = new h20
            r9.<init>(r8, r4, r7)
            r6.y = r9
            r5.setTouchDelegate(r9)
            return
        L47:
            android.graphics.Rect r7 = r9.b
            r7.set(r8)
            android.graphics.Rect r7 = r9.d
            r7.set(r8)
            int r8 = r9.e
            int r8 = -r8
            r7.inset(r8, r8)
            android.graphics.Rect r7 = r9.c
            r7.set(r4)
        L5c:
            return
    }

    @Override // defpackage.tq, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.N
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
            int r0 = r3.T
            if (r0 <= 0) goto L3f
            int r4 = java.lang.Math.min(r0, r4)
            goto L3f
        L24:
            int r4 = r3.T
            if (r4 <= 0) goto L29
            goto L3f
        L29:
            int r4 = r3.getPreferredWidth()
            goto L3f
        L2e:
            int r0 = r3.T
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
            boolean r0 = r2 instanceof defpackage.g20
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            g20 r2 = (defpackage.g20) r2
            android.os.Parcelable r0 = r2.a
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.c
            r1.w(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            g20 r1 = new g20
            r1.<init>(r0)
            boolean r0 = r2.N
            r1.c = r0
            return r1
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            a20 r1 = r0.d0
            r0.post(r1)
            return
    }

    public final void p(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    public final void q() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.p
            android.text.Editable r1 = r0.getText()
            if (r1 == 0) goto L2b
            int r2 = android.text.TextUtils.getTrimmedLength(r1)
            if (r2 <= 0) goto L2b
            android.app.SearchableInfo r2 = r4.b0
            if (r2 == 0) goto L24
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.action.SEARCH"
            r3 = 0
            android.content.Intent r1 = r4.j(r2, r3, r3, r1)
            android.content.Context r2 = r4.getContext()
            r2.startActivity(r1)
        L24:
            r1 = 0
            r0.setImeVisibility(r1)
            r0.dismissDropDown()
        L2b:
            return
    }

    public final void r() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.p
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            boolean r1 = r3.M
            if (r1 == 0) goto L15
            boolean r1 = r3.W
            if (r1 != 0) goto L15
            goto L18
        L15:
            r1 = 8
            goto L19
        L18:
            r1 = 0
        L19:
            android.widget.ImageView r2 = r3.v
            r2.setVisibility(r1)
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            if (r1 == 0) goto L2e
            if (r0 != 0) goto L29
            int[] r0 = android.view.ViewGroup.ENABLED_STATE_SET
            goto L2b
        L29:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L2b:
            r1.setState(r0)
        L2e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.S
            r1 = 0
            if (r0 == 0) goto L6
            goto Lc
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
        Lc:
            return r1
        Ld:
            boolean r0 = r2.N
            if (r0 != 0) goto L1d
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.p
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L1c
            r2.w(r1)
        L1c:
            return r3
        L1d:
            boolean r3 = super.requestFocus(r3, r4)
            return r3
    }

    public final void s() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.p
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r0 = android.view.ViewGroup.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        Ld:
            android.view.View r1 = r2.r
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L18
            r1.setState(r0)
        L18:
            android.view.View r1 = r2.s
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L23
            r1.setState(r0)
        L23:
            r2.invalidate()
            return
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.c0 = r1
            return
    }

    public void setIconified(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r1.m()
            return
        L6:
            r2 = 0
            r1.w(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.p
            r2.requestFocus()
            r0 = 1
            r2.setImeVisibility(r0)
            android.view.View$OnClickListener r2 = r1.L
            if (r2 == 0) goto L1a
            r2.onClick(r1)
        L1a:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.M
            if (r0 != r2) goto L5
            return
        L5:
            r1.M = r2
            r1.w(r2)
            r1.t()
            return
    }

    public void setImeOptions(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.p
            r0.setImeOptions(r2)
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.p
            r0.setInputType(r2)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.T = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(defpackage.d20 r1) {
            r0 = this;
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.K = r1
            return
    }

    public void setOnQueryTextListener(defpackage.e20 r1) {
            r0 = this;
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.L = r1
            return
    }

    public void setOnSuggestionListener(defpackage.f20 r1) {
            r0 = this;
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.Q = r1
            r0.t()
            return
    }

    public void setQueryRefinementEnabled(boolean r3) {
            r2 = this;
            r2.R = r3
            we r0 = r2.O
            boolean r1 = r0 instanceof defpackage.e50
            if (r1 == 0) goto L11
            e50 r0 = (defpackage.e50) r0
            if (r3 == 0) goto Le
            r3 = 2
            goto Lf
        Le:
            r3 = 1
        Lf:
            r0.p = r3
        L11:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r7) {
            r6 = this;
            r6.b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            we r7 = r6.O
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            e50 r7 = new e50
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.b0
            java.util.WeakHashMap r5 = r6.f0
            r7.<init>(r3, r6, r4, r5)
            r6.O = r7
            r2.setAdapter(r7)
            we r7 = r6.O
            e50 r7 = (defpackage.e50) r7
            boolean r3 = r6.R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.p = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.b0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.I
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.U = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.N
            r6.w(r7)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.P = r1
            boolean r1 = r0.N
            r0.w(r1)
            return
    }

    public void setSuggestionsAdapter(defpackage.we r2) {
            r1 = this;
            r1.O = r2
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.p
            r0.setAdapter(r2)
            return
    }

    public final void t() {
            r7 = this;
            java.lang.CharSequence r0 = r7.getQueryHint()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            boolean r1 = r7.M
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r7.p
            if (r1 == 0) goto L37
            android.graphics.drawable.Drawable r1 = r7.E
            if (r1 != 0) goto L13
            goto L37
        L13:
            float r3 = r2.getTextSize()
            double r3 = (double) r3
            r5 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r3 = r3 * r5
            int r3 = (int) r3
            r4 = 0
            r1.setBounds(r4, r4, r3, r3)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            java.lang.String r4 = "   "
            r3.<init>(r4)
            android.text.style.ImageSpan r4 = new android.text.style.ImageSpan
            r4.<init>(r1)
            r1 = 2
            r5 = 33
            r6 = 1
            r3.setSpan(r4, r6, r1, r5)
            r3.append(r0)
            r0 = r3
        L37:
            r2.setHint(r0)
            return
    }

    public final void u() {
            r2 = this;
            boolean r0 = r2.P
            if (r0 != 0) goto L8
            boolean r0 = r2.U
            if (r0 == 0) goto L1e
        L8:
            boolean r0 = r2.N
            if (r0 != 0) goto L1e
            android.widget.ImageView r0 = r2.u
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L1c
            android.widget.ImageView r0 = r2.w
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1e
        L1c:
            r0 = 0
            goto L20
        L1e:
            r0 = 8
        L20:
            android.view.View r1 = r2.s
            r1.setVisibility(r0)
            return
    }

    public final void v(boolean r2) {
            r1 = this;
            boolean r0 = r1.P
            if (r0 == 0) goto L1c
            if (r0 != 0) goto La
            boolean r0 = r1.U
            if (r0 == 0) goto L1c
        La:
            boolean r0 = r1.N
            if (r0 != 0) goto L1c
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L1a
            boolean r2 = r1.U
            if (r2 != 0) goto L1c
        L1a:
            r2 = 0
            goto L1e
        L1c:
            r2 = 8
        L1e:
            android.widget.ImageView r0 = r1.u
            r0.setVisibility(r2)
            return
    }

    public final void w(boolean r7) {
            r6 = this;
            r6.N = r7
            r0 = 8
            r1 = 0
            if (r7 == 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.p
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = r3 ^ 1
            android.widget.ImageView r5 = r6.t
            r5.setVisibility(r2)
            r6.v(r4)
            if (r7 == 0) goto L22
            r7 = r0
            goto L23
        L22:
            r7 = r1
        L23:
            android.view.View r2 = r6.q
            r2.setVisibility(r7)
            android.widget.ImageView r7 = r6.D
            android.graphics.drawable.Drawable r2 = r7.getDrawable()
            if (r2 == 0) goto L37
            boolean r2 = r6.M
            if (r2 == 0) goto L35
            goto L37
        L35:
            r2 = r1
            goto L38
        L37:
            r2 = r0
        L38:
            r7.setVisibility(r2)
            r6.r()
            boolean r7 = r6.U
            if (r7 == 0) goto L4e
            boolean r7 = r6.N
            if (r7 != 0) goto L4e
            if (r3 == 0) goto L4e
            android.widget.ImageView r7 = r6.u
            r7.setVisibility(r0)
            r0 = r1
        L4e:
            android.widget.ImageView r7 = r6.w
            r7.setVisibility(r0)
            r6.u()
            return
    }
}
