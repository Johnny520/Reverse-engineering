package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements p000.InterfaceC0947wh {

    /* JADX INFO: renamed from: л */
    public static final /* synthetic */ int f646 = 0;

    /* JADX INFO: renamed from: Α */
    public final android.widget.ImageView f647;

    /* JADX INFO: renamed from: Β */
    public final android.widget.ImageView f648;

    /* JADX INFO: renamed from: Γ */
    public final android.widget.ImageView f649;

    /* JADX INFO: renamed from: Δ */
    public final android.view.View f650;

    /* JADX INFO: renamed from: Ε */
    public p000.lr1 f651;

    /* JADX INFO: renamed from: Ζ */
    public final android.graphics.Rect f652;

    /* JADX INFO: renamed from: Η */
    public final android.graphics.Rect f653;

    /* JADX INFO: renamed from: Θ */
    public final int[] f654;

    /* JADX INFO: renamed from: Ι */
    public final int[] f655;

    /* JADX INFO: renamed from: Κ */
    public final android.widget.ImageView f656;

    /* JADX INFO: renamed from: Λ */
    public final android.graphics.drawable.Drawable f657;

    /* JADX INFO: renamed from: Μ */
    public final int f658;

    /* JADX INFO: renamed from: Ν */
    public final int f659;

    /* JADX INFO: renamed from: Ξ */
    public final android.content.Intent f660;

    /* JADX INFO: renamed from: Ο */
    public final android.content.Intent f661;

    /* JADX INFO: renamed from: Π */
    public final java.lang.CharSequence f662;

    /* JADX INFO: renamed from: Ρ */
    public android.view.View.OnFocusChangeListener f663;

    /* JADX INFO: renamed from: Σ */
    public android.view.View.OnClickListener f664;

    /* JADX INFO: renamed from: Τ */
    public boolean f665;

    /* JADX INFO: renamed from: Υ */
    public boolean f666;

    /* JADX INFO: renamed from: Φ */
    public p000.AbstractC0807sq f667;

    /* JADX INFO: renamed from: Χ */
    public boolean f668;

    /* JADX INFO: renamed from: Ψ */
    public java.lang.CharSequence f669;

    /* JADX INFO: renamed from: Ω */
    public boolean f670;

    /* JADX INFO: renamed from: υ */
    public final androidx.appcompat.widget.SearchView.SearchAutoComplete f671;

    /* JADX INFO: renamed from: φ */
    public final android.view.View f672;

    /* JADX INFO: renamed from: χ */
    public final android.view.View f673;

    /* JADX INFO: renamed from: ψ */
    public final android.view.View f674;

    /* JADX INFO: renamed from: ω */
    public final android.widget.ImageView f675;

    /* JADX INFO: renamed from: а */
    public boolean f676;

    /* JADX INFO: renamed from: б */
    public int f677;

    /* JADX INFO: renamed from: в */
    public boolean f678;

    /* JADX INFO: renamed from: г */
    public java.lang.CharSequence f679;

    /* JADX INFO: renamed from: д */
    public boolean f680;

    /* JADX INFO: renamed from: е */
    public int f681;

    /* JADX INFO: renamed from: ж */
    public android.app.SearchableInfo f682;

    /* JADX INFO: renamed from: з */
    public android.os.Bundle f683;

    /* JADX INFO: renamed from: и */
    public final p000.cr1 f684;

    /* JADX INFO: renamed from: й */
    public final p000.cr1 f685;

    /* JADX INFO: renamed from: к */
    public final java.util.WeakHashMap f686;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static class SearchAutoComplete extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {

        /* JADX INFO: renamed from: ι */
        public int f687;

        /* JADX INFO: renamed from: κ */
        public androidx.appcompat.widget.SearchView f688;

        /* JADX INFO: renamed from: λ */
        public boolean f689;

        /* JADX INFO: renamed from: μ */
        public final androidx.appcompat.widget.RunnableC0041 f690;

        public SearchAutoComplete(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r0 = 2130968625(0x7f040031, float:1.7545909E38)
                r1.<init>(r2, r3, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                androidx.appcompat.widget.ξ r1 = new androidx.appcompat.widget.ξ
                r1.<init>(r0)
                r0.f690 = r1
                int r1 = r0.getThreshold()
                r0.f687 = r1
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r3 = this;
                android.content.res.Resources r3 = r3.getResources()
                android.content.res.Configuration r3 = r3.getConfiguration()
                int r0 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r2 = 960(0x3c0, float:1.345E-42)
                if (r0 < r2) goto L1c
                r2 = 720(0x2d0, float:1.009E-42)
                if (r1 < r2) goto L1c
                int r3 = r3.orientation
                r2 = 2
                if (r3 != r2) goto L1c
                r3 = 256(0x100, float:3.59E-43)
                return r3
            L1c:
                r3 = 600(0x258, float:8.41E-43)
                if (r0 >= r3) goto L2c
                r3 = 640(0x280, float:8.97E-43)
                if (r0 < r3) goto L29
                r3 = 480(0x1e0, float:6.73E-43)
                if (r1 < r3) goto L29
                goto L2c
            L29:
                r3 = 160(0xa0, float:2.24E-43)
                return r3
            L2c:
                r3 = 192(0xc0, float:2.69E-43)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.f687
                if (r0 <= 0) goto Ld
                boolean r1 = super.enoughToFilter()
                if (r1 == 0) goto Lb
                goto Ld
            Lb:
                r1 = 0
                return r1
            Ld:
                r1 = 1
                return r1
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
                r1 = this;
                android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
                boolean r0 = r1.f689
                if (r0 == 0) goto L10
                androidx.appcompat.widget.ξ r0 = r1.f690
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
                androidx.appcompat.widget.SearchView r0 = r0.f688
                boolean r1 = r0.f666
                r0.m291(r1)
                cr1 r1 = r0.f684
                r0.post(r1)
                androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
                boolean r1 = r0.hasFocus()
                if (r1 == 0) goto L1a
                androidx.appcompat.widget.AbstractC0040.m352(r0)
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
                androidx.appcompat.widget.SearchView r3 = r2.f688
                r3.clearFocus()
                r3 = 0
                r2.setImeVisibility(r3)
                return r1
            L3f:
                boolean r2 = super.onKeyPreIme(r3, r4)
                return r2
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean r3) {
                r2 = this;
                super.onWindowFocusChanged(r3)
                if (r3 == 0) goto L35
                androidx.appcompat.widget.SearchView r3 = r2.f688
                boolean r3 = r3.hasFocus()
                if (r3 == 0) goto L35
                int r3 = r2.getVisibility()
                if (r3 != 0) goto L35
                r3 = 1
                r2.f689 = r3
                android.content.Context r0 = r2.getContext()
                int r1 = androidx.appcompat.widget.SearchView.f646
                android.content.res.Resources r0 = r0.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r0 = r0.orientation
                r1 = 2
                if (r0 != r1) goto L35
                androidx.appcompat.widget.AbstractC0040.m353(r2, r3)
                boolean r3 = r2.enoughToFilter()
                if (r3 == 0) goto L35
                r2.showDropDown()
            L35:
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
                androidx.appcompat.widget.ξ r1 = r3.f690
                r2 = 0
                if (r4 != 0) goto L1e
                r3.f689 = r2
                r3.removeCallbacks(r1)
                android.os.IBinder r3 = r3.getWindowToken()
                r0.hideSoftInputFromWindow(r3, r2)
                return
            L1e:
                boolean r4 = r0.isActive(r3)
                if (r4 == 0) goto L2d
                r3.f689 = r2
                r3.removeCallbacks(r1)
                r0.showSoftInput(r3, r2)
                return
            L2d:
                r4 = 1
                r3.f689 = r4
                return
        }

        public void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.f688 = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.f687 = r1
                return
        }
    }

    public SearchView(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 2130968810(0x7f0400ea, float:1.7546284E38)
            r2.<init>(r3, r0, r1)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968810(0x7f0400ea, float:1.7546284E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r20.<init>(r21, r22, r23)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f652 = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r0.f653 = r2
            r7 = 2
            int[] r2 = new int[r7]
            r0.f654 = r2
            int[] r2 = new int[r7]
            r0.f655 = r2
            cr1 r2 = new cr1
            r8 = 0
            r2.<init>(r0, r8)
            r0.f684 = r2
            cr1 r2 = new cr1
            r9 = 1
            r2.<init>(r0, r9)
            r0.f685 = r2
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            r0.f686 = r2
            androidx.appcompat.widget.λ r10 = new androidx.appcompat.widget.λ
            r10.<init>(r0)
            androidx.appcompat.widget.μ r11 = new androidx.appcompat.widget.μ
            r11.<init>(r0)
            fr1 r12 = new fr1
            r12.<init>(r0)
            u5 r13 = new u5
            r13.<init>(r9, r0)
            gr1 r14 = new gr1
            r14.<init>(r0)
            md0 r15 = new md0
            r2 = 3
            r15.<init>(r2, r0)
            m6 r3 = new m6
            r4 = r2
            int[] r2 = p000.kk1.f5988
            r5 = r22
            r6 = r23
            r16 = r4
            android.content.res.TypedArray r4 = r1.obtainStyledAttributes(r5, r2, r6, r8)
            r3.<init>(r1, r4)
            java.util.WeakHashMap r17 = p000.b92.f1572
            r6 = 0
            r7 = r3
            r3 = r5
            r5 = r23
            p000.y82.m6840(r0, r1, r2, r3, r4, r5, r6)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r21)
            r2 = 9
            r3 = 2131492889(0x7f0c0019, float:1.8609243E38)
            int r2 = r4.getResourceId(r2, r3)
            r1.inflate(r2, r0, r9)
            r1 = 2131296897(0x7f090281, float:1.8211724E38)
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r1
            r0.f671 = r1
            r1.setSearchView(r0)
            r2 = 2131296893(0x7f09027d, float:1.8211716E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.f672 = r2
            r2 = 2131296896(0x7f090280, float:1.8211722E38)
            android.view.View r2 = r0.findViewById(r2)
            r0.f673 = r2
            r3 = 2131296970(0x7f0902ca, float:1.8211872E38)
            android.view.View r3 = r0.findViewById(r3)
            r0.f674 = r3
            r5 = 2131296891(0x7f09027b, float:1.8211711E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.f675 = r5
            r6 = 2131296894(0x7f09027e, float:1.8211718E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0.f647 = r6
            r9 = 2131296892(0x7f09027c, float:1.8211714E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0.f648 = r9
            r8 = 2131296898(0x7f090282, float:1.8211726E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0.f649 = r8
            r18 = r11
            r11 = 2131296895(0x7f09027f, float:1.821172E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0.f656 = r11
            r19 = r14
            r14 = 10
            android.graphics.drawable.Drawable r14 = r7.m3754(r14)
            r2.setBackground(r14)
            r2 = 14
            android.graphics.drawable.Drawable r2 = r7.m3754(r2)
            r3.setBackground(r2)
            r2 = 13
            android.graphics.drawable.Drawable r3 = r7.m3754(r2)
            r5.setImageDrawable(r3)
            r3 = 7
            android.graphics.drawable.Drawable r3 = r7.m3754(r3)
            r6.setImageDrawable(r3)
            r3 = 4
            android.graphics.drawable.Drawable r3 = r7.m3754(r3)
            r9.setImageDrawable(r3)
            r3 = 16
            android.graphics.drawable.Drawable r3 = r7.m3754(r3)
            r8.setImageDrawable(r3)
            android.graphics.drawable.Drawable r2 = r7.m3754(r2)
            r11.setImageDrawable(r2)
            r2 = 12
            android.graphics.drawable.Drawable r2 = r7.m3754(r2)
            r0.f657 = r2
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2131689493(0x7f0f0015, float:1.9008003E38)
            java.lang.String r2 = r2.getString(r3)
            p000.c52.m1142(r5, r2)
            r2 = 15
            r3 = 2131492888(0x7f0c0018, float:1.860924E38)
            int r2 = r4.getResourceId(r2, r3)
            r0.f658 = r2
            r2 = 5
            r3 = 0
            int r2 = r4.getResourceId(r2, r3)
            r0.f659 = r2
            r5.setOnClickListener(r10)
            r9.setOnClickListener(r10)
            r6.setOnClickListener(r10)
            r8.setOnClickListener(r10)
            r1.setOnClickListener(r10)
            r1.addTextChangedListener(r15)
            r1.setOnEditorActionListener(r12)
            r1.setOnItemClickListener(r13)
            r2 = r19
            r1.setOnItemSelectedListener(r2)
            r2 = r18
            r1.setOnKeyListener(r2)
            dr1 r2 = new dr1
            r2.<init>(r0)
            r1.setOnFocusChangeListener(r2)
            r2 = 8
            r3 = 1
            boolean r2 = r4.getBoolean(r2, r3)
            r0.setIconifiedByDefault(r2)
            r2 = -1
            int r5 = r4.getDimensionPixelSize(r3, r2)
            if (r5 == r2) goto L186
            r0.setMaxWidth(r5)
        L186:
            r3 = 6
            java.lang.CharSequence r3 = r4.getText(r3)
            r0.f662 = r3
            r3 = 11
            java.lang.CharSequence r3 = r4.getText(r3)
            r0.f669 = r3
            r3 = 3
            int r3 = r4.getInt(r3, r2)
            if (r3 == r2) goto L19f
            r0.setImeOptions(r3)
        L19f:
            r3 = 2
            int r3 = r4.getInt(r3, r2)
            if (r3 == r2) goto L1a9
            r0.setInputType(r3)
        L1a9:
            r2 = 1
            r3 = 0
            boolean r2 = r4.getBoolean(r3, r2)
            r0.setFocusable(r2)
            r7.m3765()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.speech.action.WEB_SEARCH"
            r2.<init>(r3)
            r0.f660 = r2
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r3)
            java.lang.String r4 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r5 = "web_search"
            r2.putExtra(r4, r5)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.speech.action.RECOGNIZE_SPEECH"
            r2.<init>(r4)
            r0.f661 = r2
            r2.addFlags(r3)
            int r1 = r1.getDropDownAnchor()
            android.view.View r1 = r0.findViewById(r1)
            r0.f650 = r1
            if (r1 == 0) goto L1ea
            er1 r2 = new er1
            r2.<init>(r0)
            r1.addOnLayoutChangeListener(r2)
        L1ea:
            boolean r1 = r0.f665
            r0.m291(r1)
            r0.m288()
            return
    }

    private int getPreferredHeight() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165238(0x7f070036, float:1.7944687E38)
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private int getPreferredWidth() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165239(0x7f070037, float:1.794469E38)
            int r1 = r1.getDimensionPixelSize(r0)
            return r1
    }

    private void setQuery(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r1.f671
            r1.setText(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            int r2 = r2.length()
        L11:
            r1.setSelection(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
            r2 = this;
            r0 = 1
            r2.f676 = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f671
            r0.clearFocus()
            r1 = 0
            r0.setImeVisibility(r1)
            r2.f676 = r1
            return
    }

    public int getImeOptions() {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r0 = this;
            int r0 = r0.f677
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r1 = this;
            java.lang.CharSequence r0 = r1.f669
            if (r0 == 0) goto L5
            return r0
        L5:
            android.app.SearchableInfo r0 = r1.f682
            if (r0 == 0) goto L1e
            int r0 = r0.getHintId()
            if (r0 == 0) goto L1e
            android.content.Context r0 = r1.getContext()
            android.app.SearchableInfo r1 = r1.f682
            int r1 = r1.getHintId()
            java.lang.CharSequence r1 = r0.getText(r1)
            return r1
        L1e:
            java.lang.CharSequence r1 = r1.f662
            return r1
    }

    public int getSuggestionCommitIconResId() {
            r0 = this;
            int r0 = r0.f659
            return r0
    }

    public int getSuggestionRowLayout() {
            r0 = this;
            int r0 = r0.f658
            return r0
    }

    public p000.AbstractC0807sq getSuggestionsAdapter() {
            r0 = this;
            sq r0 = r0.f667
            return r0
    }

    @Override // p000.InterfaceC0947wh
    public final void onActionViewCollapsed() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f671
            java.lang.String r1 = ""
            r0.setText(r1)
            int r2 = r0.length()
            r0.setSelection(r2)
            r3.f679 = r1
            r3.clearFocus()
            r1 = 1
            r3.m291(r1)
            int r1 = r3.f681
            r0.setImeOptions(r1)
            r0 = 0
            r3.f680 = r0
            return
    }

    @Override // p000.InterfaceC0947wh
    public final void onActionViewExpanded() {
            r3 = this;
            boolean r0 = r3.f680
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.f680 = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f671
            int r1 = r0.getImeOptions()
            r3.f681 = r1
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
            cr1 r0 = r1.f684
            r1.removeCallbacks(r0)
            cr1 r0 = r1.f685
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            if (r5 == 0) goto L5a
            androidx.appcompat.widget.SearchView$SearchAutoComplete r5 = r4.f671
            int[] r6 = r4.f654
            r5.getLocationInWindow(r6)
            int[] r8 = r4.f655
            r4.getLocationInWindow(r8)
            r0 = 1
            r1 = r6[r0]
            r0 = r8[r0]
            int r1 = r1 - r0
            r0 = 0
            r6 = r6[r0]
            r8 = r8[r0]
            int r6 = r6 - r8
            int r8 = r5.getWidth()
            int r8 = r8 + r6
            int r2 = r5.getHeight()
            int r2 = r2 + r1
            android.graphics.Rect r3 = r4.f652
            r3.set(r6, r1, r8, r2)
            int r6 = r3.left
            int r8 = r3.right
            int r9 = r9 - r7
            android.graphics.Rect r7 = r4.f653
            r7.set(r6, r0, r8, r9)
            lr1 r6 = r4.f651
            if (r6 != 0) goto L45
            lr1 r6 = new lr1
            r6.<init>(r5, r7, r3)
            r4.f651 = r6
            r4.setTouchDelegate(r6)
            return
        L45:
            android.graphics.Rect r4 = r6.f6753
            r4.set(r7)
            android.graphics.Rect r4 = r6.f6755
            r4.set(r7)
            int r5 = r6.f6756
            int r5 = -r5
            r4.inset(r5, r5)
            android.graphics.Rect r4 = r6.f6754
            r4.set(r3)
        L5a:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.f666
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
            int r0 = r3.f677
            if (r0 <= 0) goto L3f
            int r4 = java.lang.Math.min(r0, r4)
            goto L3f
        L24:
            int r4 = r3.f677
            if (r4 <= 0) goto L29
            goto L3f
        L29:
            int r4 = r3.getPreferredWidth()
            goto L3f
        L2e:
            int r0 = r3.f677
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
            boolean r0 = r2 instanceof p000.kr1
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            kr1 r2 = (p000.kr1) r2
            android.os.Parcelable r0 = r2.f1063
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f6097
            r1.m291(r2)
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            kr1 r1 = new kr1
            r1.<init>(r0)
            boolean r2 = r2.f666
            r1.f6097 = r2
            return r1
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            cr1 r1 = r0.f684
            r0.post(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.f676
            r1 = 0
            if (r0 == 0) goto L6
            goto Lc
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
        Lc:
            return r1
        Ld:
            boolean r0 = r2.f666
            if (r0 != 0) goto L1d
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f671
            boolean r3 = r0.requestFocus(r3, r4)
            if (r3 == 0) goto L1c
            r2.m291(r1)
        L1c:
            return r3
        L1d:
            boolean r2 = super.requestFocus(r3, r4)
            return r2
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.f683 = r1
            return
    }

    public void setIconified(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L6
            r1.m281()
            return
        L6:
            r2 = 0
            r1.m291(r2)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r1.f671
            r2.requestFocus()
            r0 = 1
            r2.setImeVisibility(r0)
            android.view.View$OnClickListener r2 = r1.f664
            if (r2 == 0) goto L1a
            r2.onClick(r1)
        L1a:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.f665
            if (r0 != r2) goto L5
            return
        L5:
            r1.f665 = r2
            r1.m291(r2)
            r1.m288()
            return
    }

    public void setImeOptions(int r1) {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
            r0.setImeOptions(r1)
            return
    }

    public void setInputType(int r1) {
            r0 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
            r0.setInputType(r1)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.f677 = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(p000.hr1 r1) {
            r0 = this;
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.f663 = r1
            return
    }

    public void setOnQueryTextListener(p000.ir1 r1) {
            r0 = this;
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.f664 = r1
            return
    }

    public void setOnSuggestionListener(p000.jr1 r1) {
            r0 = this;
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.f669 = r1
            r0.m288()
            return
    }

    public void setQueryRefinementEnabled(boolean r2) {
            r1 = this;
            r1.f670 = r2
            sq r1 = r1.f667
            boolean r0 = r1 instanceof p000.m12
            if (r0 == 0) goto L11
            m12 r1 = (p000.m12) r1
            if (r2 == 0) goto Le
            r2 = 2
            goto Lf
        Le:
            r2 = 1
        Lf:
            r1.f6901 = r2
        L11:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r7) {
            r6 = this;
            r6.f682 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f671
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f682
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f682
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f682
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            sq r7 = r6.f667
            if (r7 == 0) goto L3b
            r7.mo3707(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f682
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            m12 r7 = new m12
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f682
            java.util.WeakHashMap r5 = r6.f686
            r7.<init>(r3, r6, r4, r5)
            r6.f667 = r7
            r2.setAdapter(r7)
            sq r7 = r6.f667
            m12 r7 = (p000.m12) r7
            boolean r3 = r6.f670
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f6901 = r3
        L62:
            r6.m288()
        L65:
            android.app.SearchableInfo r7 = r6.f682
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f682
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f660
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f682
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f661
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
            r6.f678 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f666
            r6.m291(r7)
            return
    }

    public void setSubmitButtonEnabled(boolean r1) {
            r0 = this;
            r0.f668 = r1
            boolean r1 = r0.f666
            r0.m291(r1)
            return
    }

    public void setSuggestionsAdapter(p000.AbstractC0807sq r1) {
            r0 = this;
            r0.f667 = r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r0.f671
            r0.setAdapter(r1)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final android.content.Intent m279(java.lang.String r2, android.net.Uri r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
            if (r3 == 0) goto Lf
            r0.setData(r3)
        Lf:
            java.lang.String r2 = "user_query"
            java.lang.CharSequence r3 = r1.f679
            r0.putExtra(r2, r3)
            if (r5 == 0) goto L1d
            java.lang.String r2 = "query"
            r0.putExtra(r2, r5)
        L1d:
            if (r4 == 0) goto L24
            java.lang.String r2 = "intent_extra_data_key"
            r0.putExtra(r2, r4)
        L24:
            android.os.Bundle r2 = r1.f683
            if (r2 == 0) goto L2d
            java.lang.String r3 = "app_data"
            r0.putExtra(r3, r2)
        L2d:
            android.app.SearchableInfo r1 = r1.f682
            android.content.ComponentName r1 = r1.getSearchActivity()
            r0.setComponent(r1)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final android.content.Intent m280(android.content.Intent r8, android.app.SearchableInfo r9) {
            r7 = this;
            android.content.ComponentName r0 = r9.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r7.getContext()
            r3 = 0
            r4 = 1107296256(0x42000000, float:32.0)
            android.app.PendingIntent r1 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.os.Bundle r3 = r7.f683
            if (r3 == 0) goto L27
            java.lang.String r4 = "app_data"
            r2.putParcelable(r4, r3)
        L27:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r8)
            android.content.res.Resources r7 = r7.getResources()
            int r8 = r9.getVoiceLanguageModeId()
            if (r8 == 0) goto L3f
            int r8 = r9.getVoiceLanguageModeId()
            java.lang.String r8 = r7.getString(r8)
            goto L41
        L3f:
            java.lang.String r8 = "free_form"
        L41:
            int r4 = r9.getVoicePromptTextId()
            r5 = 0
            if (r4 == 0) goto L51
            int r4 = r9.getVoicePromptTextId()
            java.lang.String r4 = r7.getString(r4)
            goto L52
        L51:
            r4 = r5
        L52:
            int r6 = r9.getVoiceLanguageId()
            if (r6 == 0) goto L61
            int r6 = r9.getVoiceLanguageId()
            java.lang.String r7 = r7.getString(r6)
            goto L62
        L61:
            r7 = r5
        L62:
            int r6 = r9.getVoiceMaxResults()
            if (r6 == 0) goto L6d
            int r9 = r9.getVoiceMaxResults()
            goto L6e
        L6d:
            r9 = 1
        L6e:
            java.lang.String r6 = "android.speech.extra.LANGUAGE_MODEL"
            r3.putExtra(r6, r8)
            java.lang.String r8 = "android.speech.extra.PROMPT"
            r3.putExtra(r8, r4)
            java.lang.String r8 = "android.speech.extra.LANGUAGE"
            r3.putExtra(r8, r7)
            java.lang.String r7 = "android.speech.extra.MAX_RESULTS"
            r3.putExtra(r7, r9)
            if (r0 != 0) goto L85
            goto L89
        L85:
            java.lang.String r5 = r0.flattenToShortString()
        L89:
            java.lang.String r7 = "calling_package"
            r3.putExtra(r7, r5)
            java.lang.String r7 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r3.putExtra(r7, r1)
            java.lang.String r7 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r3.putExtra(r7, r2)
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public final void m281() {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.f671
            android.text.Editable r1 = r0.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            if (r1 == 0) goto L18
            boolean r0 = r3.f665
            if (r0 == 0) goto L17
            r3.clearFocus()
            r3.m291(r2)
        L17:
            return
        L18:
            java.lang.String r3 = ""
            r0.setText(r3)
            r0.requestFocus()
            r0.setImeVisibility(r2)
            return
    }

    /* JADX INFO: renamed from: μ */
    public final void m282(int r7) {
            r6 = this;
            java.lang.String r0 = "SearchView"
            sq r1 = r6.f667
            android.database.Cursor r1 = r1.f9991
            if (r1 == 0) goto Lbc
            boolean r7 = r1.moveToPosition(r7)
            if (r7 == 0) goto Lbc
            r7 = 0
            int r2 = p000.m12.f6889     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = "suggest_intent_action"
            int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r2 = p000.m12.m3705(r1, r2)     // Catch: java.lang.RuntimeException -> L24
            if (r2 != 0) goto L26
            android.app.SearchableInfo r2 = r6.f682     // Catch: java.lang.RuntimeException -> L24
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
            java.lang.String r3 = p000.m12.m3705(r1, r3)     // Catch: java.lang.RuntimeException -> L24
            if (r3 != 0) goto L3c
            android.app.SearchableInfo r3 = r6.f682     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r3 = r3.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L24
        L3c:
            if (r3 == 0) goto L62
            java.lang.String r4 = "suggest_intent_data_id"
            int r4 = r1.getColumnIndex(r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r4 = p000.m12.m3705(r1, r4)     // Catch: java.lang.RuntimeException -> L24
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
            java.lang.String r4 = p000.m12.m3705(r1, r4)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = "suggest_intent_extra_data"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.RuntimeException -> L24
            java.lang.String r5 = p000.m12.m3705(r1, r5)     // Catch: java.lang.RuntimeException -> L24
            android.content.Intent r7 = r6.m279(r2, r3, r5, r4)     // Catch: java.lang.RuntimeException -> L24
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
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r6.f671
            r6.setImeVisibility(r7)
            r6.dismissDropDown()
            return
    }

    /* JADX INFO: renamed from: ν */
    public final void m283(int r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f671
            android.text.Editable r0 = r0.getText()
            sq r1 = r2.f667
            android.database.Cursor r1 = r1.f9991
            if (r1 != 0) goto Ld
            goto L26
        Ld:
            boolean r3 = r1.moveToPosition(r3)
            if (r3 == 0) goto L23
            sq r3 = r2.f667
            java.lang.String r3 = r3.mo3708(r1)
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

    /* JADX INFO: renamed from: ξ */
    public final void m284(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m285() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.f671
            android.text.Editable r1 = r0.getText()
            if (r1 == 0) goto L2b
            int r2 = android.text.TextUtils.getTrimmedLength(r1)
            if (r2 <= 0) goto L2b
            android.app.SearchableInfo r2 = r4.f682
            if (r2 == 0) goto L24
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.action.SEARCH"
            r3 = 0
            android.content.Intent r1 = r4.m279(r2, r3, r3, r1)
            android.content.Context r4 = r4.getContext()
            r4.startActivity(r1)
        L24:
            r4 = 0
            r0.setImeVisibility(r4)
            r0.dismissDropDown()
        L2b:
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m286() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f671
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            boolean r1 = r2.f665
            if (r1 == 0) goto L15
            boolean r1 = r2.f680
            if (r1 != 0) goto L15
            goto L18
        L15:
            r1 = 8
            goto L19
        L18:
            r1 = 0
        L19:
            android.widget.ImageView r2 = r2.f648
            r2.setVisibility(r1)
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            if (r2 == 0) goto L2e
            if (r0 != 0) goto L29
            int[] r0 = android.view.ViewGroup.ENABLED_STATE_SET
            goto L2b
        L29:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        L2b:
            r2.setState(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m287() {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.f671
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r0 = android.view.ViewGroup.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r0 = android.view.ViewGroup.EMPTY_STATE_SET
        Ld:
            android.view.View r1 = r2.f673
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L18
            r1.setState(r0)
        L18:
            android.view.View r1 = r2.f674
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L23
            r1.setState(r0)
        L23:
            r2.invalidate()
            return
    }

    /* JADX INFO: renamed from: σ */
    public final void m288() {
            r7 = this;
            java.lang.CharSequence r0 = r7.getQueryHint()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            boolean r1 = r7.f665
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r7.f671
            if (r1 == 0) goto L37
            android.graphics.drawable.Drawable r7 = r7.f657
            if (r7 != 0) goto L13
            goto L37
        L13:
            float r1 = r2.getTextSize()
            double r3 = (double) r1
            r5 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r3 = r3 * r5
            int r1 = (int) r3
            r3 = 0
            r7.setBounds(r3, r3, r1, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.String r3 = "   "
            r1.<init>(r3)
            android.text.style.ImageSpan r3 = new android.text.style.ImageSpan
            r3.<init>(r7)
            r7 = 2
            r4 = 33
            r5 = 1
            r1.setSpan(r3, r5, r7, r4)
            r1.append(r0)
            r0 = r1
        L37:
            r2.setHint(r0)
            return
    }

    /* JADX INFO: renamed from: τ */
    public final void m289() {
            r1 = this;
            boolean r0 = r1.f668
            if (r0 != 0) goto L8
            boolean r0 = r1.f678
            if (r0 == 0) goto L1e
        L8:
            boolean r0 = r1.f666
            if (r0 != 0) goto L1e
            android.widget.ImageView r0 = r1.f647
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L1c
            android.widget.ImageView r0 = r1.f649
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L1e
        L1c:
            r0 = 0
            goto L20
        L1e:
            r0 = 8
        L20:
            android.view.View r1 = r1.f674
            r1.setVisibility(r0)
            return
    }

    /* JADX INFO: renamed from: υ */
    public final void m290(boolean r2) {
            r1 = this;
            boolean r0 = r1.f668
            if (r0 == 0) goto L1c
            if (r0 != 0) goto La
            boolean r0 = r1.f678
            if (r0 == 0) goto L1c
        La:
            boolean r0 = r1.f666
            if (r0 != 0) goto L1c
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L1c
            if (r2 != 0) goto L1a
            boolean r2 = r1.f678
            if (r2 != 0) goto L1c
        L1a:
            r2 = 0
            goto L1e
        L1c:
            r2 = 8
        L1e:
            android.widget.ImageView r1 = r1.f647
            r1.setVisibility(r2)
            return
    }

    /* JADX INFO: renamed from: φ */
    public final void m291(boolean r7) {
            r6 = this;
            r6.f666 = r7
            r0 = 8
            r1 = 0
            if (r7 == 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f671
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = r3 ^ 1
            android.widget.ImageView r5 = r6.f675
            r5.setVisibility(r2)
            r6.m290(r4)
            if (r7 == 0) goto L22
            r7 = r0
            goto L23
        L22:
            r7 = r1
        L23:
            android.view.View r2 = r6.f672
            r2.setVisibility(r7)
            android.widget.ImageView r7 = r6.f656
            android.graphics.drawable.Drawable r2 = r7.getDrawable()
            if (r2 == 0) goto L37
            boolean r2 = r6.f665
            if (r2 == 0) goto L35
            goto L37
        L35:
            r2 = r1
            goto L38
        L37:
            r2 = r0
        L38:
            r7.setVisibility(r2)
            r6.m286()
            boolean r7 = r6.f678
            if (r7 == 0) goto L4e
            boolean r7 = r6.f666
            if (r7 != 0) goto L4e
            if (r3 == 0) goto L4e
            android.widget.ImageView r7 = r6.f647
            r7.setVisibility(r0)
            r0 = r1
        L4e:
            android.widget.ImageView r7 = r6.f649
            r7.setVisibility(r0)
            r6.m289()
            return
    }
}
