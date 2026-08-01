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
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000.AbstractC0754tq;
import p000.AbstractC0853we;
import p000.AbstractC0910xy;
import p000.C0197er;
import p000.C0621q4;
import p000.C0659r5;
import p000.C0767u2;
import p000.C0944yv;
import p000.InterfaceC0923ya;
import p000.ViewOnLayoutChangeListenerC0549o7;
import p000.a20;
import p000.b20;
import p000.c20;
import p000.d20;
import p000.e20;
import p000.e50;
import p000.f20;
import p000.g20;
import p000.h20;
import p000.ja0;
import p000.l70;
import p000.s90;
import p000.z10;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC0754tq implements InterfaceC0923ya {

    /* JADX INFO: renamed from: g0 */
    public static final C0944yv f304g0;

    /* JADX INFO: renamed from: A */
    public final Rect f305A;

    /* JADX INFO: renamed from: B */
    public final int[] f306B;

    /* JADX INFO: renamed from: C */
    public final int[] f307C;

    /* JADX INFO: renamed from: D */
    public final ImageView f308D;

    /* JADX INFO: renamed from: E */
    public final Drawable f309E;

    /* JADX INFO: renamed from: F */
    public final int f310F;

    /* JADX INFO: renamed from: G */
    public final int f311G;

    /* JADX INFO: renamed from: H */
    public final Intent f312H;

    /* JADX INFO: renamed from: I */
    public final Intent f313I;

    /* JADX INFO: renamed from: J */
    public final CharSequence f314J;

    /* JADX INFO: renamed from: K */
    public View.OnFocusChangeListener f315K;

    /* JADX INFO: renamed from: L */
    public View.OnClickListener f316L;

    /* JADX INFO: renamed from: M */
    public boolean f317M;

    /* JADX INFO: renamed from: N */
    public boolean f318N;

    /* JADX INFO: renamed from: O */
    public AbstractC0853we f319O;

    /* JADX INFO: renamed from: P */
    public boolean f320P;

    /* JADX INFO: renamed from: Q */
    public CharSequence f321Q;

    /* JADX INFO: renamed from: R */
    public boolean f322R;

    /* JADX INFO: renamed from: S */
    public boolean f323S;

    /* JADX INFO: renamed from: T */
    public int f324T;

    /* JADX INFO: renamed from: U */
    public boolean f325U;

    /* JADX INFO: renamed from: V */
    public CharSequence f326V;

    /* JADX INFO: renamed from: W */
    public boolean f327W;

    /* JADX INFO: renamed from: a0 */
    public int f328a0;

    /* JADX INFO: renamed from: b0 */
    public SearchableInfo f329b0;

    /* JADX INFO: renamed from: c0 */
    public Bundle f330c0;

    /* JADX INFO: renamed from: d0 */
    public final a20 f331d0;

    /* JADX INFO: renamed from: e0 */
    public final a20 f332e0;

    /* JADX INFO: renamed from: f0 */
    public final WeakHashMap f333f0;

    /* JADX INFO: renamed from: p */
    public final SearchAutoComplete f334p;

    /* JADX INFO: renamed from: q */
    public final View f335q;

    /* JADX INFO: renamed from: r */
    public final View f336r;

    /* JADX INFO: renamed from: s */
    public final View f337s;

    /* JADX INFO: renamed from: t */
    public final ImageView f338t;

    /* JADX INFO: renamed from: u */
    public final ImageView f339u;

    /* JADX INFO: renamed from: v */
    public final ImageView f340v;

    /* JADX INFO: renamed from: w */
    public final ImageView f341w;

    /* JADX INFO: renamed from: x */
    public final View f342x;

    /* JADX INFO: renamed from: y */
    public h20 f343y;

    /* JADX INFO: renamed from: z */
    public final Rect f344z;

    static {
        C0944yv c0944yv = null;
        if (Build.VERSION.SDK_INT < 29) {
            C0944yv c0944yv2 = new C0944yv();
            c0944yv2.f5407a = null;
            c0944yv2.f5408b = null;
            c0944yv2.f5409c = null;
            C0944yv.m2743a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                c0944yv2.f5407a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                c0944yv2.f5408b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c0944yv2.f5409c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0944yv = c0944yv2;
        }
        f304g0 = c0944yv;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f334p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f323S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f334p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f323S = false;
    }

    public int getImeOptions() {
        return this.f334p.getImeOptions();
    }

    public int getInputType() {
        return this.f334p.getInputType();
    }

    public int getMaxWidth() {
        return this.f324T;
    }

    public CharSequence getQuery() {
        return this.f334p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f321Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f329b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f314J : getContext().getText(this.f329b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f311G;
    }

    public int getSuggestionRowLayout() {
        return this.f310F;
    }

    public AbstractC0853we getSuggestionsAdapter() {
        return this.f319O;
    }

    /* JADX INFO: renamed from: j */
    public final Intent m167j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f326V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f330c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f329b0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: k */
    public final Intent m168k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f330c0;
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

    /* JADX INFO: renamed from: l */
    public final void m169l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f334p;
        if (i >= 29) {
            AbstractC0032c.m204a(searchAutoComplete);
            return;
        }
        C0944yv c0944yv = f304g0;
        c0944yv.getClass();
        C0944yv.m2743a();
        Method method = c0944yv.f5407a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c0944yv.getClass();
        C0944yv.m2743a();
        Method method2 = c0944yv.f5408b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m170m() {
        SearchAutoComplete searchAutoComplete = this.f334p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f317M) {
            clearFocus();
            m180w(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m171n(int i) {
        int position;
        String strM988h;
        Cursor cursor = this.f319O.f4958c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM167j = null;
            try {
                int i2 = e50.f1713x;
                String strM988h2 = e50.m988h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM988h2 == null) {
                    strM988h2 = this.f329b0.getSuggestIntentAction();
                }
                if (strM988h2 == null) {
                    strM988h2 = "android.intent.action.SEARCH";
                }
                String strM988h3 = e50.m988h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM988h3 == null) {
                    strM988h3 = this.f329b0.getSuggestIntentData();
                }
                if (strM988h3 != null && (strM988h = e50.m988h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM988h3 = strM988h3 + "/" + Uri.encode(strM988h);
                }
                intentM167j = m167j(strM988h2, strM988h3 == null ? null : Uri.parse(strM988h3), e50.m988h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), e50.m988h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentM167j != null) {
                try {
                    getContext().startActivity(intentM167j);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentM167j, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f334p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX INFO: renamed from: o */
    public final void m172o(int i) {
        Editable text = this.f334p.getText();
        Cursor cursor = this.f319O.f4958c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strMo991c = this.f319O.mo991c(cursor);
        if (strMo991c != null) {
            setQuery(strMo991c);
        } else {
            setQuery(text);
        }
    }

    @Override // p000.InterfaceC0923ya
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f334p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f326V = "";
        clearFocus();
        m180w(true);
        searchAutoComplete.setImeOptions(this.f328a0);
        this.f327W = false;
    }

    @Override // p000.InterfaceC0923ya
    public final void onActionViewExpanded() {
        if (this.f327W) {
            return;
        }
        this.f327W = true;
        SearchAutoComplete searchAutoComplete = this.f334p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f328a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f331d0);
        post(this.f332e0);
        super.onDetachedFromWindow();
    }

    @Override // p000.AbstractC0754tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f334p;
            int[] iArr = this.f306B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f307C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f344z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f305A;
            rect2.set(i7, 0, i8, i9);
            h20 h20Var = this.f343y;
            if (h20Var == null) {
                h20 h20Var2 = new h20(rect2, rect, searchAutoComplete);
                this.f343y = h20Var2;
                setTouchDelegate(h20Var2);
            } else {
                h20Var.f2197b.set(rect2);
                Rect rect3 = h20Var.f2199d;
                rect3.set(rect2);
                int i10 = -h20Var.f2200e;
                rect3.inset(i10, i10);
                h20Var.f2198c.set(rect);
            }
        }
    }

    @Override // p000.AbstractC0754tq, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f318N) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f324T;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f324T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f324T) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g20)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g20 g20Var = (g20) parcelable;
        super.onRestoreInstanceState(g20Var.f1344a);
        m180w(g20Var.f2010c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g20 g20Var = new g20(super.onSaveInstanceState());
        g20Var.f2010c = this.f318N;
        return g20Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f331d0);
    }

    /* JADX INFO: renamed from: p */
    public final void m173p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: q */
    public final void m174q() {
        SearchAutoComplete searchAutoComplete = this.f334p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f329b0 != null) {
            getContext().startActivity(m167j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX INFO: renamed from: r */
    public final void m175r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f334p.getText());
        int i = (!zIsEmpty || (this.f317M && !this.f327W)) ? 0 : 8;
        ImageView imageView = this.f340v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f323S || !isFocusable()) {
            return false;
        }
        if (this.f318N) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f334p.requestFocus(i, rect);
        if (zRequestFocus) {
            m180w(false);
        }
        return zRequestFocus;
    }

    /* JADX INFO: renamed from: s */
    public final void m176s() {
        int[] iArr = this.f334p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f336r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f337s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f330c0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m170m();
            return;
        }
        m180w(false);
        SearchAutoComplete searchAutoComplete = this.f334p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f316L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f317M == z) {
            return;
        }
        this.f317M = z;
        m180w(z);
        m177t();
    }

    public void setImeOptions(int i) {
        this.f334p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f334p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f324T = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f315K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f316L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f321Q = charSequence;
        m177t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f322R = z;
        AbstractC0853we abstractC0853we = this.f319O;
        if (abstractC0853we instanceof e50) {
            ((e50) abstractC0853we).f1722p = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f329b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f334p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f329b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f329b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f329b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            we r7 = r6.f319O
            if (r7 == 0) goto L3b
            r7.mo990b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f329b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            e50 r7 = new e50
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f329b0
            java.util.WeakHashMap r5 = r6.f333f0
            r7.<init>(r3, r6, r4, r5)
            r6.f319O = r7
            r2.setAdapter(r7)
            we r7 = r6.f319O
            e50 r7 = (p000.e50) r7
            boolean r3 = r6.f322R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f1722p = r3
        L62:
            r6.m177t()
        L65:
            android.app.SearchableInfo r7 = r6.f329b0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f329b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f312H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f329b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f313I
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
            r6.f325U = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f318N
            r6.m180w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f320P = z;
        m180w(this.f318N);
    }

    public void setSuggestionsAdapter(AbstractC0853we abstractC0853we) {
        this.f319O = abstractC0853we;
        this.f334p.setAdapter(abstractC0853we);
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
    /* JADX INFO: renamed from: t */
    public final void m177t() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.f317M;
        SearchAutoComplete searchAutoComplete = this.f334p;
        CharSequence charSequence2 = charSequence;
        if (z) {
            Drawable drawable = this.f309E;
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

    /* JADX INFO: renamed from: u */
    public final void m178u() {
        this.f337s.setVisibility(((this.f320P || this.f325U) && !this.f318N && (this.f339u.getVisibility() == 0 || this.f341w.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: v */
    public final void m179v(boolean z) {
        boolean z2 = this.f320P;
        this.f339u.setVisibility((!z2 || !(z2 || this.f325U) || this.f318N || !hasFocus() || (!z && this.f325U)) ? 8 : 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m180w(boolean z) {
        this.f318N = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f334p.getText());
        this.f338t.setVisibility(i2);
        m179v(!zIsEmpty);
        this.f335q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f308D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f317M) ? 8 : 0);
        m175r();
        if (this.f325U && !this.f318N && zIsEmpty) {
            this.f339u.setVisibility(8);
            i = 0;
        }
        this.f341w.setVisibility(i);
        m178u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f344z = new Rect();
        this.f305A = new Rect();
        this.f306B = new int[2];
        this.f307C = new int[2];
        this.f331d0 = new a20(this, 0);
        this.f332e0 = new a20(this, 1);
        this.f333f0 = new WeakHashMap();
        ViewOnClickListenerC0030a viewOnClickListenerC0030a = new ViewOnClickListenerC0030a(this);
        ViewOnKeyListenerC0031b viewOnKeyListenerC0031b = new ViewOnKeyListenerC0031b(this);
        c20 c20Var = new c20(this);
        C0621q4 c0621q4 = new C0621q4(2, this);
        C0197er c0197er = new C0197er(1, this);
        z10 z10Var = new z10(this, 0);
        int[] iArr = AbstractC0910xy.f5237u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0659r5 c0659r5 = new C0659r5(context, typedArrayObtainStyledAttributes);
        ja0.m1574k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f334p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f335q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f336r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f337s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f338t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f339u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f340v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f341w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f308D = imageView5;
        s90.m2325q(viewFindViewById, c0659r5.m2234m(20));
        s90.m2325q(viewFindViewById2, c0659r5.m2234m(25));
        imageView.setImageDrawable(c0659r5.m2234m(23));
        imageView2.setImageDrawable(c0659r5.m2234m(15));
        imageView3.setImageDrawable(c0659r5.m2234m(12));
        imageView4.setImageDrawable(c0659r5.m2234m(28));
        imageView5.setImageDrawable(c0659r5.m2234m(23));
        this.f309E = c0659r5.m2234m(22);
        l70.m1753a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f310F = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f311G = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC0030a);
        imageView3.setOnClickListener(viewOnClickListenerC0030a);
        imageView2.setOnClickListener(viewOnClickListenerC0030a);
        imageView4.setOnClickListener(viewOnClickListenerC0030a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0030a);
        searchAutoComplete.addTextChangedListener(z10Var);
        searchAutoComplete.setOnEditorActionListener(c20Var);
        searchAutoComplete.setOnItemClickListener(c0621q4);
        searchAutoComplete.setOnItemSelectedListener(c0197er);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0031b);
        searchAutoComplete.setOnFocusChangeListener(new b20(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f314J = typedArrayObtainStyledAttributes.getText(14);
        this.f321Q = typedArrayObtainStyledAttributes.getText(21);
        int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c0659r5.m2245z();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f312H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f313I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f342x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0549o7(2, this));
        }
        m180w(this.f317M);
        m177t();
    }

    public static class SearchAutoComplete extends C0767u2 {

        /* JADX INFO: renamed from: e */
        public int f345e;

        /* JADX INFO: renamed from: f */
        public SearchView f346f;

        /* JADX INFO: renamed from: g */
        public boolean f347g;

        /* JADX INFO: renamed from: h */
        public final RunnableC0033d f348h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f348h = new RunnableC0033d(this);
            this.f345e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* JADX INFO: renamed from: a */
        public final void m181a() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0032c.m205b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0944yv c0944yv = SearchView.f304g0;
            c0944yv.getClass();
            C0944yv.m2743a();
            Method method = c0944yv.f5409c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f345e <= 0 || super.enoughToFilter();
        }

        @Override // p000.C0767u2, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f347g) {
                RunnableC0033d runnableC0033d = this.f348h;
                removeCallbacks(runnableC0033d);
                post(runnableC0033d);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f346f;
            searchView.m180w(searchView.f318N);
            searchView.post(searchView.f331d0);
            if (searchView.f334p.hasFocus()) {
                searchView.m169l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
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
                        this.f346f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f346f.hasFocus() && getVisibility() == 0) {
                this.f347g = true;
                Context context = getContext();
                C0944yv c0944yv = SearchView.f304g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m181a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0033d runnableC0033d = this.f348h;
            if (!z) {
                this.f347g = false;
                removeCallbacks(runnableC0033d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f347g = true;
                    return;
                }
                this.f347g = false;
                removeCallbacks(runnableC0033d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f346f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f345e = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }
    }

    public void setOnCloseListener(d20 d20Var) {
    }

    public void setOnQueryTextListener(e20 e20Var) {
    }

    public void setOnSuggestionListener(f20 f20Var) {
    }
}
