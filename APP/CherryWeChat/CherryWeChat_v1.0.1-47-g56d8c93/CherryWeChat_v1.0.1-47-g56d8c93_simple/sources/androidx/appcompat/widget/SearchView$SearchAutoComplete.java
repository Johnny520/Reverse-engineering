package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import p000.AbstractC2605ux;
import p000.C1306d3;
import p000.RunnableC0431K0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C1306d3 {

    /* JADX INFO: renamed from: e */
    public int f3800e;

    /* JADX INFO: renamed from: f */
    public boolean f3801f;

    /* JADX INFO: renamed from: g */
    public final RunnableC0431K0 f3802g;

    public SearchView$SearchAutoComplete(Context r1, AttributeSet r2) {
        super(r1, r2);
        this.f3802g = new RunnableC0431K0(13, this);
        this.f3800e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration r0 = getResources().getConfiguration();
        int r1 = r0.screenWidthDp;
        int r2 = r0.screenHeightDp;
        if (r1 < 960) goto L11;
        if (r2 < 720) goto L11;
        if (r0.orientation != 2) goto L11;
        return 256;
    L11:
        if (r1 < 600) goto L13;
        return 192;
    L13:
        if (r1 >= 640) goto L15;
        return 160;
    L15:
        if (r2 >= 480) goto L22;
        return 160;
    L22:
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        if (this.f3800e > 0) goto L5;
        return true;
    L5:
        if (super.enoughToFilter() == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // p000.C1306d3, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo r2) {
        InputConnection r22 = super.onCreateInputConnection(r2);
        if (this.f3801f == false) goto L5;
        RunnableC0431K0 r0 = this.f3802g;
        removeCallbacks(r0);
        post(r0);
    L5:
        return r22;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, Rect r3) {
        super.onFocusChanged(r1, r2, r3);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int r3, KeyEvent r4) {
        if (r3 != 4) goto L25;
        if (r4.getAction() != 0) goto L13;
        if (r4.getRepeatCount() != 0) goto L13;
        KeyEvent.DispatcherState r32 = getKeyDispatcherState();
        if (r32 == null) goto L11;
        r32.startTracking(r4, this);
    L11:
        return true;
    L13:
        if (r4.getAction() != 1) goto L25;
        KeyEvent.DispatcherState r0 = getKeyDispatcherState();
        if (r0 == null) goto L18;
        r0.handleUpEvent(r4);
    L18:
        if (r4.isTracking() == false) goto L25;
        if (r4.isCanceled() == true) goto L25;
        throw null;
    L25:
        return super.onKeyPreIme(r3, r4);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r1) {
        super.onWindowFocusChanged(r1);
        if (r1 == true) goto L6;
        return;
    L6:
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence r1) {
    }

    public void setImeVisibility(boolean r4) {
        InputMethodManager r0 = (InputMethodManager) getContext().getSystemService("input_method");
        RunnableC0431K0 r1 = this.f3802g;
        if (r4 == true) goto L7;
        this.f3801f = false;
        removeCallbacks(r1);
        r0.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
    L7:
        if (r0.isActive(this) == false) goto L10;
        this.f3801f = false;
        removeCallbacks(r1);
        r0.showSoftInput(this, 0);
        return;
    L10:
        this.f3801f = true;
    }

    public void setSearchView(AbstractC2605ux r1) {
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int r1) {
        super.setThreshold(r1);
        this.f3800e = r1;
    }
}
