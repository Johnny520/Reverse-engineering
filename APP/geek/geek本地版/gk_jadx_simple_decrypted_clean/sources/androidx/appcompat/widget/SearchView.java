package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.ljx.wechatmod.R;
import defpackage.a20;
import defpackage.b20;
import defpackage.c20;
import defpackage.d20;
import defpackage.e20;
import defpackage.e50;
import defpackage.er;
import defpackage.f20;
import defpackage.g20;
import defpackage.h20;
import defpackage.ja0;
import defpackage.l70;
import defpackage.o7;
import defpackage.q4;
import defpackage.r5;
import defpackage.s90;
import defpackage.tq;
import defpackage.u2;
import defpackage.we;
import defpackage.xy;
import defpackage.ya;
import defpackage.yv;
import defpackage.z10;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends tq implements ya {
    public static final yv g0 = null;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public we O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public boolean W;
    public int a0;
    public SearchableInfo b0;
    public Bundle c0;
    public final a20 d0;
    public final a20 e0;
    public final WeakHashMap f0;
    public final SearchAutoComplete p;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public h20 y;
    public final Rect z;

    public static class SearchAutoComplete extends u2 {
        public int e;
        public SearchView f;
        public boolean g;
        public final d h;

        public SearchAutoComplete(Context r1, AttributeSet r2) {
            super(r1, r2);
            this.h = new d(this);
            this.e = getThreshold();
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

        public final void a() {
            if (Build.VERSION.SDK_INT < 29) goto L8;
            c.b(this, 1);
            if (enoughToFilter() == false) goto L15;
            showDropDown();
            return;
        L15:
            return;
        L8:
            yv r0 = SearchView.g0;
            r0.getClass();
            yv.a();
            Method r02 = r0.c;
            if (r02 == null) goto L16;
            r02.invoke(this, new Object[]{Boolean.TRUE});     // Catch: Exception -> L12
            return;
        L17:
            return;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.e > 0) goto L5;
            return true;
        L5:
            if (super.enoughToFilter() == true) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // defpackage.u2, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo r2) {
            InputConnection r22 = super.onCreateInputConnection(r2);
            if (this.g == false) goto L5;
            d r0 = this.h;
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
            SearchView r12 = this.f;
            r12.w(r12.N);
            r12.post(r12.d0);
            if (r12.p.hasFocus() == false) goto L6;
            r12.l();
            return;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int r3, KeyEvent r4) {
            if (r3 != 4) goto L24;
            if (r4.getAction() != 0) goto L13;
            if (r4.getRepeatCount() != 0) goto L13;
            KeyEvent.DispatcherState r32 = getKeyDispatcherState();
            if (r32 == null) goto L11;
            r32.startTracking(r4, this);
        L11:
            return true;
        L13:
            if (r4.getAction() != 1) goto L24;
            KeyEvent.DispatcherState r0 = getKeyDispatcherState();
            if (r0 == null) goto L18;
            r0.handleUpEvent(r4);
        L18:
            if (r4.isTracking() == false) goto L24;
            if (r4.isCanceled() == true) goto L24;
            this.f.clearFocus();
            setImeVisibility(false);
            return true;
        L24:
            return super.onKeyPreIme(r3, r4);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean r2) {
            super.onWindowFocusChanged(r2);
            if (r2 == true) goto L5;
            return;
        L5:
            if (this.f.hasFocus() == true) goto L7;
            return;
        L7:
            if (getVisibility() != 0) goto L14;
            this.g = true;
            Context r22 = getContext();
            yv r0 = SearchView.g0;
            if (r22.getResources().getConfiguration().orientation != 2) goto L15;
            a();
            return;
        L15:
            return;
        }

        public void setImeVisibility(boolean r4) {
            InputMethodManager r0 = (InputMethodManager) getContext().getSystemService("input_method");
            d r1 = this.h;
            if (r4 == true) goto L7;
            this.g = false;
            removeCallbacks(r1);
            r0.hideSoftInputFromWindow(getWindowToken(), 0);
            return;
        L7:
            if (r0.isActive(this) == false) goto L10;
            this.g = false;
            removeCallbacks(r1);
            r0.showSoftInput(this, 0);
            return;
        L10:
            this.g = true;
        }

        public void setSearchView(SearchView r1) {
            this.f = r1;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
            super.setThreshold(r1);
            this.e = r1;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence r1) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }
    }

    static {
        yv r2 = null;
        if (Build.VERSION.SDK_INT >= 29) goto L9;
        yv r0 = new yv();
        r0.a = null;
        r0.b = null;
        r0.c = null;
        yv.a();
        Method r4 = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);     // Catch: NoSuchMethodException -> L11
        r0.a = r4;     // Catch: NoSuchMethodException -> L11
        r4.setAccessible(true);     // Catch: NoSuchMethodException -> L11
    L16:
        Method r22 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);     // Catch: NoSuchMethodException -> L12
        r0.b = r22;     // Catch: NoSuchMethodException -> L12
        r22.setAccessible(true);     // Catch: NoSuchMethodException -> L12
    L14:
        Method r1 = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L13
        r0.c = r1;     // Catch: NoSuchMethodException -> L13
        r1.setAccessible(true);     // Catch: NoSuchMethodException -> L13
    L8:
        r2 = r0;
    L9:
        g0 = r2;
    }

    public SearchView(Context r2) {
        this(r2, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence r3) {
        SearchAutoComplete r0 = this.p;
        r0.setText(r3);
        if (TextUtils.isEmpty(r3) == false) goto L5;
        int r32 = 0;
    L6:
        r0.setSelection(r32);
        return;
    L5:
        r32 = r3.length();
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.S = true;
        super.clearFocus();
        SearchAutoComplete r0 = this.p;
        r0.clearFocus();
        r0.setImeVisibility(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence r0 = this.Q;
        if (r0 == null) goto L5;
        return r0;
    L5:
        SearchableInfo r02 = this.b0;
        if (r02 == null) goto L12;
        if (r02.getHintId() == 0) goto L12;
        return getContext().getText(this.b0.getHintId());
    L12:
        return this.J;
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public we getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent j(String r2, Uri r3, String r4, String r5) {
        Intent r0 = new Intent(r2);
        r0.addFlags(268435456);
        if (r3 == null) goto L5;
        r0.setData(r3);
    L5:
        r0.putExtra("user_query", this.V);
        if (r5 == null) goto L8;
        r0.putExtra("query", r5);
    L8:
        if (r4 == null) goto L10;
        r0.putExtra("intent_extra_data_key", r4);
    L10:
        Bundle r22 = this.c0;
        if (r22 == null) goto L13;
        r0.putExtra("app_data", r22);
    L13:
        r0.setComponent(this.b0.getSearchActivity());
        return r0;
    }

    public final Intent k(Intent r9, SearchableInfo r10) {
        ComponentName r0 = r10.getSearchActivity();
        Intent r1 = new Intent("android.intent.action.SEARCH");
        r1.setComponent(r0);
        PendingIntent r12 = PendingIntent.getActivity(getContext(), 0, r1, 1107296256);
        Bundle r2 = new Bundle();
        Bundle r3 = this.c0;
        if (r3 == null) goto L5;
        r2.putParcelable("app_data", r3);
    L5:
        Intent r32 = new Intent(r9);
        Resources r92 = getResources();
        if (r10.getVoiceLanguageModeId() == 0) goto L8;
        String r4 = r92.getString(r10.getVoiceLanguageModeId());
    L9:
        String r6 = null;
        if (r10.getVoicePromptTextId() == 0) goto L12;
        String r5 = r92.getString(r10.getVoicePromptTextId());
    L14:
        if (r10.getVoiceLanguageId() == 0) goto L16;
        String r93 = r92.getString(r10.getVoiceLanguageId());
    L18:
        if (r10.getVoiceMaxResults() == 0) goto L20;
        int r102 = r10.getVoiceMaxResults();
    L21:
        r32.putExtra("android.speech.extra.LANGUAGE_MODEL", r4);
        r32.putExtra("android.speech.extra.PROMPT", r5);
        r32.putExtra("android.speech.extra.LANGUAGE", r93);
        r32.putExtra("android.speech.extra.MAX_RESULTS", r102);
        if (r0 == null) goto L25;
        r6 = r0.flattenToShortString();
    L25:
        r32.putExtra("calling_package", r6);
        r32.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", r12);
        r32.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", r2);
        return r32;
    L20:
        r102 = 1;
        goto L21
    L16:
        r93 = null;
        goto L18
    L12:
        r5 = null;
        goto L14
    L8:
        r4 = "free_form";
        goto L9
    }

    public final void l() {
        int r0 = Build.VERSION.SDK_INT;
        SearchAutoComplete r2 = this.p;
        if (r0 < 29) goto L6;
        c.a(r2);
        return;
    L6:
        yv r02 = g0;
        r02.getClass();
        yv.a();
        Method r1 = r02.a;
        if (r1 != null) goto L15;
    L9:
        r02.getClass();
        yv.a();
        Method r03 = r02.b;
        if (r03 == null) goto L19;
        r03.invoke(r2, null);     // Catch: Exception -> L14
        return;
    L20:
        return;
    L19:
        return;
    L15:
        r1.invoke(r2, null);     // Catch: Exception -> L13
        goto L9
    }

    public final void m() {
        SearchAutoComplete r0 = this.p;
        if (TextUtils.isEmpty(r0.getText()) == true) goto L5;
        r0.setText("");
        r0.requestFocus();
        r0.setImeVisibility(true);
        return;
    L5:
        if (this.M == false) goto L10;
        clearFocus();
        w(true);
        return;
    }

    public final void n(int r7) {
        Cursor r1 = this.O.c;
        if (r1 != null) goto L5;
    L36:
        SearchAutoComplete r0 = this.p;
        r0.setImeVisibility(false);
        r0.dismissDropDown();
        return;
    L5:
        if (r1.moveToPosition(r7) == false) goto L36;
        Intent r72 = null;
        int r2 = e50.x;     // Catch: RuntimeException -> L10
        String r22 = e50.h(r1, r1.getColumnIndex("suggest_intent_action"));     // Catch: RuntimeException -> L10
        if (r22 != null) goto L12;
        r22 = this.b0.getSuggestIntentAction();     // Catch: RuntimeException -> L10
    L12:
        if (r22 != null) goto L14;
        r22 = "android.intent.action.SEARCH";
    L14:
        String r3 = e50.h(r1, r1.getColumnIndex("suggest_intent_data"));     // Catch: RuntimeException -> L10
        if (r3 != null) goto L17;
        r3 = this.b0.getSuggestIntentData();     // Catch: RuntimeException -> L10
    L17:
        if (r3 == null) goto L21;
        String r4 = e50.h(r1, r1.getColumnIndex("suggest_intent_data_id"));     // Catch: RuntimeException -> L10
        if (r4 == null) goto L21;
        r3 = r3 + "/" + Uri.encode(r4);     // Catch: RuntimeException -> L10
    L21:
        if (r3 != null) goto L23;
        Uri r32 = null;
    L24:
        r72 = j(r22, r32, e50.h(r1, r1.getColumnIndex("suggest_intent_extra_data")), e50.h(r1, r1.getColumnIndex("suggest_intent_query")));     // Catch: RuntimeException -> L10
    L30:
        if (r72 == null) goto L36;
        getContext().startActivity(r72);     // Catch: RuntimeException -> L34
    L34:
        e = move-exception;
        Log.e("SearchView", "Failed launch activity: " + r72, e);
        goto L36
    L23:
        r32 = Uri.parse(r3);     // Catch: RuntimeException -> L10
    L10:
        e = move-exception;
        int r12 = r1.getPosition();     // Catch: RuntimeException -> L28
    L29:
        Log.w("SearchView", "Search suggestions cursor at row " + r12 + " returned exception.", e);
    L28:
        r12 = -1;
        goto L29
    }

    public final void o(int r3) {
        Editable r0 = this.p.getText();
        Cursor r1 = this.O.c;
        if (r1 != null) goto L6;
        return;
    L6:
        if (r1.moveToPosition(r3) == false) goto L11;
        String r32 = this.O.c(r1);
        if (r32 == null) goto L10;
        setQuery(r32);
        return;
    L10:
        setQuery(r0);
        return;
    L11:
        setQuery(r0);
    }

    @Override // defpackage.ya
    public final void onActionViewCollapsed() {
        SearchAutoComplete r0 = this.p;
        r0.setText("");
        r0.setSelection(r0.length());
        this.V = "";
        clearFocus();
        w(true);
        r0.setImeOptions(this.a0);
        this.W = false;
    }

    @Override // defpackage.ya
    public final void onActionViewExpanded() {
        if (this.W == false) goto L5;
        return;
    L5:
        this.W = true;
        SearchAutoComplete r0 = this.p;
        int r1 = r0.getImeOptions();
        this.a0 = r1;
        r0.setImeOptions(r1 | 33554432);
        r0.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.d0);
        post(this.e0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        super.onLayout(r6, r7, r8, r9, r10);
        if (r6 == false) goto L10;
        SearchAutoComplete r72 = this.p;
        int[] r92 = this.B;
        r72.getLocationInWindow(r92);
        int[] r0 = this.C;
        getLocationInWindow(r0);
        int r2 = r92[1] - r0[1];
        int r93 = r92[0] - r0[0];
        int r02 = r72.getWidth() + r93;
        int r3 = r72.getHeight() + r2;
        Rect r4 = this.z;
        r4.set(r93, r2, r02, r3);
        int r94 = r4.left;
        int r03 = r4.right;
        int r102 = r10 - r8;
        Rect r82 = this.A;
        r82.set(r94, 0, r03, r102);
        h20 r95 = this.y;
        if (r95 != null) goto L8;
        h20 r96 = new h20(r82, r4, r72);
        this.y = r96;
        setTouchDelegate(r96);
        return;
    L8:
        r95.b.set(r82);
        Rect r73 = r95.d;
        r73.set(r82);
        int r83 = -r95.e;
        r73.inset(r83, r83);
        r95.c.set(r4);
        return;
    }

    @Override // defpackage.tq, android.view.View
    public final void onMeasure(int r4, int r5) {
        if (this.N == false) goto L6;
        super.onMeasure(r4, r5);
        return;
    L6:
        int r0 = View.MeasureSpec.getMode(r4);
        int r42 = View.MeasureSpec.getSize(r4);
        if (r0 == Integer.MIN_VALUE) goto L18;
        if (r0 == 0) goto L14;
        if (r0 != 1073741824) goto L22;
        int r02 = this.T;
        if (r02 <= 0) goto L22;
        r42 = Math.min(r02, r42);
    L22:
        int r03 = View.MeasureSpec.getMode(r5);
        int r52 = View.MeasureSpec.getSize(r5);
        if (r03 == Integer.MIN_VALUE) goto L27;
        if (r03 != 0) goto L28;
        r52 = getPreferredHeight();
    L28:
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r42, 1073741824), View.MeasureSpec.makeMeasureSpec(r52, 1073741824));
        return;
    L27:
        r52 = Math.min(getPreferredHeight(), r52);
        goto L28
    L14:
        r42 = this.T;
        if (r42 > 0) goto L22;
        r42 = getPreferredWidth();
        goto L22
    L18:
        int r04 = this.T;
        if (r04 <= 0) goto L21;
        r42 = Math.min(r04, r42);
        goto L22
    L21:
        r42 = Math.min(getPreferredWidth(), r42);
        goto L22
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof g20) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        g20 r22 = (g20) r2;
        super.onRestoreInstanceState(r22.a);
        w(r22.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g20 r1 = new g20(super.onSaveInstanceState());
        r1.c = this.N;
        return r1;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean r1) {
        super.onWindowFocusChanged(r1);
        post(this.d0);
    }

    public final void p(CharSequence r1) {
        setQuery(r1);
    }

    public final void q() {
        SearchAutoComplete r0 = this.p;
        Editable r1 = r0.getText();
        if (r1 != null) goto L5;
        return;
    L5:
        if (TextUtils.getTrimmedLength(r1) > 0) goto L7;
        return;
    L7:
        if (this.b0 == null) goto L9;
        Intent r12 = j("android.intent.action.SEARCH", null, null, r1.toString());
        getContext().startActivity(r12);
    L9:
        r0.setImeVisibility(false);
        r0.dismissDropDown();
    }

    public final void r() {
        boolean r0 = TextUtils.isEmpty(this.p.getText());
        if (r0 == true) goto L5;
    L10:
        int r1 = 0;
    L11:
        ImageView r2 = this.v;
        r2.setVisibility(r1);
        Drawable r12 = r2.getDrawable();
        if (r12 == null) goto L18;
        if (r0 == true) goto L15;
        int[] r02 = ViewGroup.ENABLED_STATE_SET;
    L16:
        r12.setState(r02);
        return;
    L15:
        r02 = ViewGroup.EMPTY_STATE_SET;
        goto L16
    L18:
        return;
    L5:
        if (this.M == true) goto L7;
    L9:
        r1 = 8;
        goto L11
    L7:
        if (this.W == true) goto L9;
        goto L9
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r3, Rect r4) {
        if (this.S == false) goto L6;
    L7:
        return false;
    L6:
        if (isFocusable() == false) goto L7;
        if (this.N == true) goto L15;
        boolean r32 = this.p.requestFocus(r3, r4);
        if (r32 == false) goto L13;
        w(false);
    L13:
        return r32;
    L15:
        return super.requestFocus(r3, r4);
    }

    public final void s() {
        if (this.p.hasFocus() == false) goto L5;
        int[] r0 = ViewGroup.FOCUSED_STATE_SET;
    L6:
        Drawable r1 = this.r.getBackground();
        if (r1 == null) goto L9;
        r1.setState(r0);
    L9:
        Drawable r12 = this.s.getBackground();
        if (r12 == null) goto L12;
        r12.setState(r0);
    L12:
        invalidate();
        return;
    L5:
        r0 = ViewGroup.EMPTY_STATE_SET;
        goto L6
    }

    public void setAppSearchData(Bundle r1) {
        this.c0 = r1;
    }

    public void setIconified(boolean r2) {
        if (r2 == false) goto L5;
        m();
        return;
    L5:
        w(false);
        SearchAutoComplete r22 = this.p;
        r22.requestFocus();
        r22.setImeVisibility(true);
        View.OnClickListener r23 = this.L;
        if (r23 == null) goto L9;
        r23.onClick(this);
        return;
    }

    public void setIconifiedByDefault(boolean r2) {
        if (this.M != r2) goto L5;
        return;
    L5:
        this.M = r2;
        w(r2);
        t();
    }

    public void setImeOptions(int r2) {
        this.p.setImeOptions(r2);
    }

    public void setInputType(int r2) {
        this.p.setInputType(r2);
    }

    public void setMaxWidth(int r1) {
        this.T = r1;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener r1) {
        this.K = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener r1) {
        this.L = r1;
    }

    public void setQueryHint(CharSequence r1) {
        this.Q = r1;
        t();
    }

    public void setQueryRefinementEnabled(boolean r3) {
        this.R = r3;
        we r0 = this.O;
        if ((r0 instanceof e50) == false) goto L10;
        e50 r02 = (e50) r0;
        if (r3 == false) goto L7;
        int r32 = 2;
    L8:
        r02.p = r32;
        return;
    L7:
        r32 = 1;
        goto L8
    }

    public void setSearchableInfo(SearchableInfo r7) {
        this.b0 = r7;
        Intent r0 = null;
        boolean r1 = true;
        SearchAutoComplete r2 = this.p;
        if (r7 == null) goto L20;
        r2.setThreshold(r7.getSuggestThreshold());
        r2.setImeOptions(this.b0.getImeOptions());
        int r72 = this.b0.getInputType();
        if ((r72 & 15) != 1) goto L9;
        r72 = r72 & (-65537);
        if (this.b0.getSuggestAuthority() == null) goto L9;
        r72 = r72 | 589824;
    L9:
        r2.setInputType(r72);
        we r73 = this.O;
        if (r73 == null) goto L13;
        r73.b(null);
    L13:
        if (this.b0.getSuggestAuthority() == null) goto L19;
        e50 r74 = new e50(getContext(), this, this.b0, this.f0);
        this.O = r74;
        r2.setAdapter(r74);
        e50 r75 = (e50) this.O;
        if (this.R == false) goto L17;
        int r3 = 2;
    L18:
        r75.p = r3;
        goto L19
    L17:
        r3 = 1;
    L19:
        t();
    L20:
        SearchableInfo r76 = this.b0;
        if (r76 != null) goto L23;
    L34:
        r1 = false;
    L35:
        this.U = r1;
        if (r1 == false) goto L38;
        r2.setPrivateImeOptions("nm");
    L38:
        w(this.N);
        return;
    L23:
        if (r76.getVoiceSearchEnabled() == false) goto L34;
        if (this.b0.getVoiceSearchLaunchWebSearch() == false) goto L28;
        r0 = this.H;
    L30:
        if (r0 == null) goto L34;
        if (getContext().getPackageManager().resolveActivity(r0, 65536) == null) goto L34;
    L28:
        if (this.b0.getVoiceSearchLaunchRecognizer() == false) goto L30;
        r0 = this.I;
        goto L30
    }

    public void setSubmitButtonEnabled(boolean r1) {
        this.P = r1;
        w(this.N);
    }

    public void setSuggestionsAdapter(we r2) {
        this.O = r2;
        this.p.setAdapter(r2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        CharSequence r0 = getQueryHint();
        CharSequence r02 = r0;
        if (r0 != null) goto L5;
        r02 = "";
    L5:
        boolean r1 = this.M;
        SearchAutoComplete r2 = this.p;
        CharSequence r03 = r02;
        if (r1 == false) goto L11;
        Drawable r12 = this.E;
        r03 = r02;
        if (r12 == null) goto L11;
        int r3 = (int) (((double) r2.getTextSize()) * 1.25d);
        r12.setBounds(0, 0, r3, r3);
        SpannableStringBuilder r32 = new SpannableStringBuilder("   ");
        r32.setSpan(new ImageSpan(r12), 1, 2, 33);
        r32.append(r02);
        r03 = r32;
    L11:
        r2.setHint(r03);
    }

    public final void u() {
        if (this.P == true) goto L7;
        if (this.U == true) goto L7;
    L13:
        int r0 = 8;
    L14:
        this.s.setVisibility(r0);
        return;
    L7:
        if (this.N == true) goto L13;
        if (this.u.getVisibility() != 0) goto L11;
    L12:
        r0 = 0;
        goto L14
    L11:
        if (this.w.getVisibility() != 0) goto L13;
        goto L12
    }

    public final void v(boolean r2) {
        boolean r0 = this.P;
        if (r0 == false) goto L15;
        if (r0 == true) goto L8;
        if (this.U == false) goto L15;
    L8:
        if (this.N == true) goto L15;
        if (hasFocus() == false) goto L15;
        if (r2 == false) goto L13;
    L14:
        int r22 = 0;
    L16:
        this.u.setVisibility(r22);
        return;
    L13:
        if (this.U == false) goto L14;
    L15:
        r22 = 8;
        goto L16
    }

    public final void w(boolean r7) {
        this.N = r7;
        int r0 = 8;
        if (r7 == false) goto L5;
        int r2 = 0;
    L6:
        boolean r3 = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(r2);
        v(!r3);
        if (r7 == false) goto L9;
        int r72 = 8;
    L10:
        this.q.setVisibility(r72);
        ImageView r73 = this.D;
        if (r73.getDrawable() != null) goto L13;
    L16:
        int r22 = 8;
    L17:
        r73.setVisibility(r22);
        r();
        if (this.U == true) goto L20;
    L23:
        this.w.setVisibility(r0);
        u();
        return;
    L20:
        if (this.N == true) goto L23;
        if (r3 == false) goto L23;
        this.u.setVisibility(8);
        r0 = 0;
        goto L23
    L13:
        if (this.M == true) goto L16;
        r22 = 0;
        goto L17
    L9:
        r72 = 0;
        goto L10
    L5:
        r2 = 8;
        goto L6
    }

    public SearchView(Context r2, AttributeSet r3) {
        this(r2, r3, R.attr.searchViewStyle);
    }

    public SearchView(Context r19, AttributeSet r20, int r21) {
        super(r19, r20, r21);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.d0 = new a20(this, 0);
        this.e0 = new a20(this, 1);
        this.f0 = new WeakHashMap();
        a r7 = new a(this);
        b r8 = new b(this);
        c20 r9 = new c20(this);
        q4 r10 = new q4(2, this);
        er r11 = new er(1, this);
        z10 r12 = new z10(this, 0);
        int[] r2 = xy.u;
        TypedArray r4 = r19.obtainStyledAttributes(r20, r2, r21, 0);
        r5 r13 = new r5(r19, r4);
        ja0.k(this, r19, r2, r20, r4, r21);
        LayoutInflater.from(r19).inflate(r4.getResourceId(19, R.layout.abc_search_view), this, true);
        SearchAutoComplete r1 = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.p = r1;
        r1.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View r22 = findViewById(R.id.search_plate);
        this.r = r22;
        View r5 = findViewById(R.id.submit_area);
        this.s = r5;
        ImageView r15 = (ImageView) findViewById(R.id.search_button);
        this.t = r15;
        ImageView r6 = (ImageView) findViewById(R.id.search_go_btn);
        this.u = r6;
        ImageView r3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = r3;
        ImageView r14 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = r14;
        ImageView r82 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = r82;
        s90.q(r22, r13.m(20));
        s90.q(r5, r13.m(25));
        r15.setImageDrawable(r13.m(23));
        r6.setImageDrawable(r13.m(15));
        r3.setImageDrawable(r13.m(12));
        r14.setImageDrawable(r13.m(28));
        r82.setImageDrawable(r13.m(23));
        this.E = r13.m(22);
        l70.a(r15, getResources().getString(R.string.abc_searchview_description_search));
        this.F = r4.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = r4.getResourceId(13, 0);
        r15.setOnClickListener(r7);
        r3.setOnClickListener(r7);
        r6.setOnClickListener(r7);
        r14.setOnClickListener(r7);
        r1.setOnClickListener(r7);
        r1.addTextChangedListener(r12);
        r1.setOnEditorActionListener(r9);
        r1.setOnItemClickListener(r10);
        r1.setOnItemSelectedListener(r11);
        r1.setOnKeyListener(r8);
        r1.setOnFocusChangeListener(new b20(this));
        setIconifiedByDefault(r4.getBoolean(18, true));
        int r32 = r4.getDimensionPixelSize(2, -1);
        if (r32 == (-1)) goto L5;
        setMaxWidth(r32);
    L5:
        this.J = r4.getText(14);
        this.Q = r4.getText(21);
        int r33 = r4.getInt(6, -1);
        if (r33 == (-1)) goto L8;
        setImeOptions(r33);
    L8:
        int r34 = r4.getInt(5, -1);
        if (r34 == (-1)) goto L11;
        setInputType(r34);
    L11:
        setFocusable(r4.getBoolean(1, true));
        r13.z();
        Intent r23 = new Intent("android.speech.action.WEB_SEARCH");
        this.H = r23;
        r23.addFlags(268435456);
        r23.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent r24 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = r24;
        r24.addFlags(268435456);
        View r16 = findViewById(r1.getDropDownAnchor());
        this.x = r16;
        if (r16 == null) goto L14;
        r16.addOnLayoutChangeListener(new o7(2, this));
    L14:
        w(this.M);
        t();
    }

    public void setOnCloseListener(d20 r1) {
    }

    public void setOnQueryTextListener(e20 r1) {
    }

    public void setOnSuggestionListener(f20 r1) {
    }
}
