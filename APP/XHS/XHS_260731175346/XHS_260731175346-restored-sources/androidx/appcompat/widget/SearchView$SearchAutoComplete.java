package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends xhss.AbstractC0195 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f5;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.RunnableC0432 f6;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f7;

    public SearchView$SearchAutoComplete(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView$SearchAutoComplete(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            xhss.ᛴᲈᲀᲇ r1 = new xhss.ᛴᲈᲀᲇ
            r2 = 5
            r1.<init>(r2, r0)
            r0.f6 = r1
            int r1 = r0.getThreshold()
            r0.f5 = r1
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
            int r0 = r1.f5
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

    @Override // xhss.AbstractC0195, android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r2)
            boolean r0 = r1.f7
            if (r0 == 0) goto L10
            xhss.ᛴᲈᲀᲇ r0 = r1.f6
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
            r0 = 0
            throw r0
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int r3, android.view.KeyEvent r4) {
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L38
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
            if (r0 != r1) goto L38
            android.view.KeyEvent$DispatcherState r0 = r2.getKeyDispatcherState()
            if (r0 == 0) goto L29
            r0.handleUpEvent(r4)
        L29:
            boolean r0 = r4.isTracking()
            if (r0 == 0) goto L38
            boolean r0 = r4.isCanceled()
            if (r0 == 0) goto L36
            goto L38
        L36:
            r2 = 0
            throw r2
        L38:
            boolean r2 = super.onKeyPreIme(r3, r4)
            return r2
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            if (r1 != 0) goto L6
            return
        L6:
            r0 = 0
            throw r0
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
            xhss.ᛴᲈᲀᲇ r1 = r3.f6
            r2 = 0
            if (r4 != 0) goto L1e
            r3.f7 = r2
            r3.removeCallbacks(r1)
            android.os.IBinder r3 = r3.getWindowToken()
            r0.hideSoftInputFromWindow(r3, r2)
            return
        L1e:
            boolean r4 = r0.isActive(r3)
            if (r4 == 0) goto L2d
            r3.f7 = r2
            r3.removeCallbacks(r1)
            r0.showSoftInput(r3, r2)
            return
        L2d:
            r4 = 1
            r3.f7 = r4
            return
    }

    public void setSearchView(xhss.AbstractC1204 r1) {
            r0 = this;
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int r1) {
            r0 = this;
            super.setThreshold(r1)
            r0.f5 = r1
            return
    }
}
