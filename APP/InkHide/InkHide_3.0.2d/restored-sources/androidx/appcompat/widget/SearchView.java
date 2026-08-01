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
import com.p055lu.wxmask272.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p004C.C0064h;
import p008E.AbstractC0099c;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p066g.InterfaceC0562b;
import p069i.AbstractC0728y0;
import p069i.C0636O;
import p069i.C0642R0;
import p069i.C0650V0;
import p069i.C0658Z0;
import p069i.C0661a1;
import p069i.C0701o;
import p069i.C0730z0;
import p069i.InterfaceC0652W0;
import p069i.InterfaceC0654X0;
import p069i.InterfaceC0656Y0;
import p069i.RunnableC0644S0;
import p069i.ViewOnClickListenerC0667c1;
import p069i.ViewOnFocusChangeListenerC0646T0;
import p069i.ViewOnLayoutChangeListenerC0648U0;
import p099y.AbstractC1048L;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC0728y0 implements InterfaceC0562b {

    /* JADX INFO: renamed from: h0 */
    public static final C0064h f1024h0;

    /* JADX INFO: renamed from: A */
    public final Rect f1025A;

    /* JADX INFO: renamed from: B */
    public final Rect f1026B;

    /* JADX INFO: renamed from: C */
    public final int[] f1027C;

    /* JADX INFO: renamed from: D */
    public final int[] f1028D;

    /* JADX INFO: renamed from: E */
    public final ImageView f1029E;

    /* JADX INFO: renamed from: F */
    public final Drawable f1030F;

    /* JADX INFO: renamed from: G */
    public final int f1031G;

    /* JADX INFO: renamed from: H */
    public final int f1032H;

    /* JADX INFO: renamed from: I */
    public final Intent f1033I;

    /* JADX INFO: renamed from: J */
    public final Intent f1034J;

    /* JADX INFO: renamed from: K */
    public final CharSequence f1035K;

    /* JADX INFO: renamed from: L */
    public View.OnFocusChangeListener f1036L;

    /* JADX INFO: renamed from: M */
    public View.OnClickListener f1037M;

    /* JADX INFO: renamed from: N */
    public boolean f1038N;

    /* JADX INFO: renamed from: O */
    public boolean f1039O;

    /* JADX INFO: renamed from: P */
    public AbstractC0099c f1040P;

    /* JADX INFO: renamed from: Q */
    public boolean f1041Q;

    /* JADX INFO: renamed from: R */
    public CharSequence f1042R;

    /* JADX INFO: renamed from: S */
    public boolean f1043S;

    /* JADX INFO: renamed from: T */
    public boolean f1044T;

    /* JADX INFO: renamed from: U */
    public int f1045U;

    /* JADX INFO: renamed from: V */
    public boolean f1046V;

    /* JADX INFO: renamed from: W */
    public CharSequence f1047W;

    /* JADX INFO: renamed from: a0 */
    public boolean f1048a0;

    /* JADX INFO: renamed from: b0 */
    public int f1049b0;

    /* JADX INFO: renamed from: c0 */
    public SearchableInfo f1050c0;

    /* JADX INFO: renamed from: d0 */
    public Bundle f1051d0;

    /* JADX INFO: renamed from: e0 */
    public final RunnableC0644S0 f1052e0;

    /* JADX INFO: renamed from: f0 */
    public final RunnableC0644S0 f1053f0;

    /* JADX INFO: renamed from: g0 */
    public final WeakHashMap f1054g0;

    /* JADX INFO: renamed from: q */
    public final SearchAutoComplete f1055q;

    /* JADX INFO: renamed from: r */
    public final View f1056r;

    /* JADX INFO: renamed from: s */
    public final View f1057s;

    /* JADX INFO: renamed from: t */
    public final View f1058t;

    /* JADX INFO: renamed from: u */
    public final ImageView f1059u;

    /* JADX INFO: renamed from: v */
    public final ImageView f1060v;

    /* JADX INFO: renamed from: w */
    public final ImageView f1061w;

    /* JADX INFO: renamed from: x */
    public final ImageView f1062x;

    /* JADX INFO: renamed from: y */
    public final View f1063y;

    /* JADX INFO: renamed from: z */
    public C0661a1 f1064z;

    public static class SearchAutoComplete extends C0701o {

        /* JADX INFO: renamed from: f */
        public int f1065f;

        /* JADX INFO: renamed from: g */
        public SearchView f1066g;

        /* JADX INFO: renamed from: h */
        public boolean f1067h;

        /* JADX INFO: renamed from: i */
        public final RunnableC0384d f1068i;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1068i = new RunnableC0384d(this);
            this.f1065f = getThreshold();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final void m694a() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0383c.m716b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0064h c0064h = SearchView.f1024h0;
            c0064h.getClass();
            C0064h.m115u();
            Method method = (Method) c0064h.f310d;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f1065f <= 0 || super.enoughToFilter();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // p069i.C0701o, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1067h) {
                RunnableC0384d runnableC0384d = this.f1068i;
                removeCallbacks(runnableC0384d);
                post(runnableC0384d);
            }
            return inputConnectionOnCreateInputConnection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f1066g;
            searchView.m693x(searchView.f1039O);
            searchView.post(searchView.f1052e0);
            if (searchView.f1055q.hasFocus()) {
                searchView.m682m();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1066g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f1066g.hasFocus() && getVisibility() == 0) {
                this.f1067h = true;
                Context context = getContext();
                C0064h c0064h = SearchView.f1024h0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m694a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0384d runnableC0384d = this.f1068i;
            if (!z2) {
                this.f1067h = false;
                removeCallbacks(runnableC0384d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1067h = true;
                    return;
                }
                this.f1067h = false;
                removeCallbacks(runnableC0384d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setSearchView(SearchView searchView) {
            this.f1066g = searchView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f1065f = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0064h c0064h = null;
        if (Build.VERSION.SDK_INT < 29) {
            C0064h c0064h2 = new C0064h();
            c0064h2.f308b = null;
            c0064h2.f309c = null;
            c0064h2.f310d = null;
            C0064h.m115u();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                c0064h2.f308b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                c0064h2.f309c = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c0064h2.f310d = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0064h = c0064h2;
        }
        f1024h0 = c0064h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SearchView(Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f1055q;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.InterfaceC0562b
    /* JADX INFO: renamed from: a */
    public final void mo678a() {
        if (this.f1048a0) {
            return;
        }
        this.f1048a0 = true;
        SearchAutoComplete searchAutoComplete = this.f1055q;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1049b0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p066g.InterfaceC0562b
    /* JADX INFO: renamed from: c */
    public final void mo679c() {
        SearchAutoComplete searchAutoComplete = this.f1055q;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1047W = "";
        clearFocus();
        m693x(true);
        searchAutoComplete.setImeOptions(this.f1049b0);
        this.f1048a0 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1044T = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1055q;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1044T = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getImeOptions() {
        return this.f1055q.getImeOptions();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getInputType() {
        return this.f1055q.getInputType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxWidth() {
        return this.f1045U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getQuery() {
        return this.f1055q.getText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1042R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1050c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1035K : getContext().getText(this.f1050c0.getHintId());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSuggestionCommitIconResId() {
        return this.f1032H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getSuggestionRowLayout() {
        return this.f1031G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0099c getSuggestionsAdapter() {
        return this.f1040P;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Intent m680k(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1047W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1051d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1050c0.getSearchActivity());
        return intent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Intent m681l(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1051d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m682m() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1055q;
        if (i2 >= 29) {
            AbstractC0383c.m715a(searchAutoComplete);
            return;
        }
        C0064h c0064h = f1024h0;
        c0064h.getClass();
        C0064h.m115u();
        Method method = (Method) c0064h.f308b;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c0064h.getClass();
        C0064h.m115u();
        Method method2 = (Method) c0064h.f309c;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m683n() {
        SearchAutoComplete searchAutoComplete = this.f1055q;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f1038N) {
            clearFocus();
            m693x(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m684o(int i2) {
        int position;
        String strM1292h;
        Cursor cursor = this.f1040P.f388d;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intentM680k = null;
            try {
                int i3 = ViewOnClickListenerC0667c1.f2254y;
                String strM1292h2 = ViewOnClickListenerC0667c1.m1292h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM1292h2 == null) {
                    strM1292h2 = this.f1050c0.getSuggestIntentAction();
                }
                if (strM1292h2 == null) {
                    strM1292h2 = "android.intent.action.SEARCH";
                }
                String strM1292h3 = ViewOnClickListenerC0667c1.m1292h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM1292h3 == null) {
                    strM1292h3 = this.f1050c0.getSuggestIntentData();
                }
                if (strM1292h3 != null && (strM1292h = ViewOnClickListenerC0667c1.m1292h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM1292h3 = strM1292h3 + "/" + Uri.encode(strM1292h);
                }
                intentM680k = m680k(strM1292h2, strM1292h3 == null ? null : Uri.parse(strM1292h3), ViewOnClickListenerC0667c1.m1292h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0667c1.m1292h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentM680k != null) {
                try {
                    getContext().startActivity(intentM680k);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intentM680k, e3);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1055q;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1052e0);
        post(this.f1053f0);
        super.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            int[] iArr = this.f1027C;
            SearchAutoComplete searchAutoComplete = this.f1055q;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f1028D;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i7;
            int height = searchAutoComplete.getHeight() + i6;
            Rect rect = this.f1025A;
            rect.set(i7, i6, width, height);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.f1026B;
            rect2.set(i8, 0, i9, i10);
            C0661a1 c0661a1 = this.f1064z;
            if (c0661a1 == null) {
                C0661a1 c0661a12 = new C0661a1(rect2, rect, searchAutoComplete);
                this.f1064z = c0661a12;
                setTouchDelegate(c0661a12);
            } else {
                c0661a1.f2228b.set(rect2);
                Rect rect3 = c0661a1.f2230d;
                rect3.set(rect2);
                int i11 = -c0661a1.f2231e;
                rect3.inset(i11, i11);
                c0661a1.f2229c.set(rect);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f1039O) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.f1045U;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1045U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.f1045U) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0658Z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0658Z0 c0658z0 = (C0658Z0) parcelable;
        super.onRestoreInstanceState(c0658z0.f407a);
        m693x(c0658z0.f2223c);
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0658Z0 c0658z0 = new C0658Z0(super.onSaveInstanceState());
        c0658z0.f2223c = this.f1039O;
        return c0658z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f1052e0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m685p(int i2) {
        Editable text = this.f1055q.getText();
        Cursor cursor = this.f1040P.f388d;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2)) {
            setQuery(text);
            return;
        }
        String strMo244c = this.f1040P.mo244c(cursor);
        if (strMo244c != null) {
            setQuery(strMo244c);
        } else {
            setQuery(text);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m686q(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m687r() {
        SearchAutoComplete searchAutoComplete = this.f1055q;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1050c0 != null) {
            getContext().startActivity(m680k("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.f1044T || !isFocusable()) {
            return false;
        }
        if (this.f1039O) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f1055q.requestFocus(i2, rect);
        if (zRequestFocus) {
            m693x(false);
        }
        return zRequestFocus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m688s() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f1055q.getText());
        int i2 = (!zIsEmpty || (this.f1038N && !this.f1048a0)) ? 0 : 8;
        ImageView imageView = this.f1061w;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAppSearchData(Bundle bundle) {
        this.f1051d0 = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconified(boolean z2) {
        if (z2) {
            m683n();
            return;
        }
        m693x(false);
        SearchAutoComplete searchAutoComplete = this.f1055q;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1037M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIconifiedByDefault(boolean z2) {
        if (this.f1038N == z2) {
            return;
        }
        this.f1038N = z2;
        m693x(z2);
        m690u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setImeOptions(int i2) {
        this.f1055q.setImeOptions(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setInputType(int i2) {
        this.f1055q.setInputType(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMaxWidth(int i2) {
        this.f1045U = i2;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1036L = onFocusChangeListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1037M = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setQueryHint(CharSequence charSequence) {
        this.f1042R = charSequence;
        m690u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setQueryRefinementEnabled(boolean z2) {
        this.f1043S = z2;
        AbstractC0099c abstractC0099c = this.f1040P;
        if (abstractC0099c instanceof ViewOnClickListenerC0667c1) {
            ((ViewOnClickListenerC0667c1) abstractC0099c).f2263q = z2 ? 2 : 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1050c0 = searchableInfo;
        Intent intent = null;
        boolean z2 = true;
        SearchAutoComplete searchAutoComplete = this.f1055q;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1050c0.getImeOptions());
            int inputType = this.f1050c0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1050c0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AbstractC0099c abstractC0099c = this.f1040P;
            if (abstractC0099c != null) {
                abstractC0099c.mo243b(null);
            }
            if (this.f1050c0.getSuggestAuthority() != null) {
                ViewOnClickListenerC0667c1 viewOnClickListenerC0667c1 = new ViewOnClickListenerC0667c1(getContext(), this, this.f1050c0, this.f1054g0);
                this.f1040P = viewOnClickListenerC0667c1;
                searchAutoComplete.setAdapter(viewOnClickListenerC0667c1);
                ((ViewOnClickListenerC0667c1) this.f1040P).f2263q = this.f1043S ? 2 : 1;
            }
            m690u();
        }
        SearchableInfo searchableInfo2 = this.f1050c0;
        if (searchableInfo2 == null || !searchableInfo2.getVoiceSearchEnabled()) {
            z2 = false;
        } else {
            if (this.f1050c0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f1033I;
            } else if (this.f1050c0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1034J;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            }
        }
        this.f1046V = z2;
        if (z2) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        m693x(this.f1039O);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSubmitButtonEnabled(boolean z2) {
        this.f1041Q = z2;
        m693x(this.f1039O);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSuggestionsAdapter(AbstractC0099c abstractC0099c) {
        this.f1040P = abstractC0099c;
        this.f1055q.setAdapter(abstractC0099c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m689t() {
        int[] iArr = this.f1055q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1057s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1058t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: u */
    public final void m690u() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z2 = this.f1038N;
        SearchAutoComplete searchAutoComplete = this.f1055q;
        CharSequence charSequence2 = charSequence;
        if (z2) {
            Drawable drawable = this.f1030F;
            charSequence2 = charSequence;
            if (drawable != null) {
                int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
                drawable.setBounds(0, 0, textSize, textSize);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
                spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
                spannableStringBuilder.append(charSequence);
                charSequence2 = spannableStringBuilder;
            }
        }
        searchAutoComplete.setHint(charSequence2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m691v() {
        this.f1058t.setVisibility(((this.f1041Q || this.f1046V) && !this.f1039O && (this.f1060v.getVisibility() == 0 || this.f1062x.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m692w(boolean z2) {
        boolean z3 = this.f1041Q;
        this.f1060v.setVisibility((!z3 || !(z3 || this.f1046V) || this.f1039O || !hasFocus() || (!z2 && this.f1046V)) ? 8 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m693x(boolean z2) {
        this.f1039O = z2;
        int i2 = 8;
        int i3 = z2 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f1055q.getText());
        this.f1059u.setVisibility(i3);
        m692w(!zIsEmpty);
        this.f1056r.setVisibility(z2 ? 8 : 0);
        ImageView imageView = this.f1029E;
        imageView.setVisibility((imageView.getDrawable() == null || this.f1038N) ? 8 : 0);
        m688s();
        if (this.f1046V && !this.f1039O && zIsEmpty) {
            this.f1060v.setVisibility(8);
            i2 = 0;
        }
        this.f1062x.setVisibility(i2);
        m691v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1025A = new Rect();
        this.f1026B = new Rect();
        this.f1027C = new int[2];
        this.f1028D = new int[2];
        this.f1052e0 = new RunnableC0644S0(this, 0);
        this.f1053f0 = new RunnableC0644S0(this, 1);
        this.f1054g0 = new WeakHashMap();
        ViewOnClickListenerC0381a viewOnClickListenerC0381a = new ViewOnClickListenerC0381a(this);
        ViewOnKeyListenerC0382b viewOnKeyListenerC0382b = new ViewOnKeyListenerC0382b(this);
        C0650V0 c0650v0 = new C0650V0(this);
        C0636O c0636o = new C0636O(1, this);
        C0730z0 c0730z0 = new C0730z0(1, this);
        C0642R0 c0642r0 = new C0642R0(0, this);
        int[] iArr = AbstractC0515a.f1657u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0064h c0064h = new C0064h(context, typedArrayObtainStyledAttributes);
        AbstractC1048L.m2289h(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1055q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1056r = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f1057s = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f1058t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f1059u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f1060v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f1061w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f1062x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1029E = imageView5;
        viewFindViewById.setBackground(c0064h.m123m(10));
        viewFindViewById2.setBackground(c0064h.m123m(14));
        imageView.setImageDrawable(c0064h.m123m(13));
        imageView2.setImageDrawable(c0064h.m123m(7));
        imageView3.setImageDrawable(c0064h.m123m(4));
        imageView4.setImageDrawable(c0064h.m123m(16));
        imageView5.setImageDrawable(c0064h.m123m(13));
        this.f1030F = c0064h.m123m(12);
        AbstractC0503h.m976N(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1031G = typedArrayObtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1032H = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(viewOnClickListenerC0381a);
        imageView3.setOnClickListener(viewOnClickListenerC0381a);
        imageView2.setOnClickListener(viewOnClickListenerC0381a);
        imageView4.setOnClickListener(viewOnClickListenerC0381a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0381a);
        searchAutoComplete.addTextChangedListener(c0642r0);
        searchAutoComplete.setOnEditorActionListener(c0650v0);
        searchAutoComplete.setOnItemClickListener(c0636o);
        searchAutoComplete.setOnItemSelectedListener(c0730z0);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0382b);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0646T0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f1035K = typedArrayObtainStyledAttributes.getText(6);
        this.f1042R = typedArrayObtainStyledAttributes.getText(11);
        int i3 = typedArrayObtainStyledAttributes.getInt(3, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(2, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(0, true));
        c0064h.m130v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1033I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1034J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1063y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0648U0(this));
        }
        m693x(this.f1038N);
        m690u();
    }

    public void setOnCloseListener(InterfaceC0652W0 interfaceC0652W0) {
    }

    public void setOnQueryTextListener(InterfaceC0654X0 interfaceC0654X0) {
    }

    public void setOnSuggestionListener(InterfaceC0656Y0 interfaceC0656Y0) {
    }
}
