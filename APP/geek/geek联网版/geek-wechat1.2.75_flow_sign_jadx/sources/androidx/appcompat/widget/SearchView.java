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
import p000.AbstractC0205ez;
import p000.AbstractC0890xe;
import p000.AbstractC0902xq;
import p000.C0239fw;
import p000.C0348ir;
import p000.C0620q4;
import p000.C0658r5;
import p000.C0766u2;
import p000.InterfaceC0255gb;
import p000.ViewOnLayoutChangeListenerC0920y7;
import p000.g20;
import p000.h20;
import p000.i20;
import p000.j20;
import p000.k20;
import p000.l20;
import p000.l50;
import p000.m20;
import p000.n20;
import p000.o20;
import p000.oa0;
import p000.r70;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends AbstractC0902xq implements InterfaceC0255gb {

    /* JADX INFO: renamed from: g0 */
    public static final C0239fw f267g0;

    /* JADX INFO: renamed from: A */
    public final Rect f268A;

    /* JADX INFO: renamed from: B */
    public final int[] f269B;

    /* JADX INFO: renamed from: C */
    public final int[] f270C;

    /* JADX INFO: renamed from: D */
    public final ImageView f271D;

    /* JADX INFO: renamed from: E */
    public final Drawable f272E;

    /* JADX INFO: renamed from: F */
    public final int f273F;

    /* JADX INFO: renamed from: G */
    public final int f274G;

    /* JADX INFO: renamed from: H */
    public final Intent f275H;

    /* JADX INFO: renamed from: I */
    public final Intent f276I;

    /* JADX INFO: renamed from: J */
    public final CharSequence f277J;

    /* JADX INFO: renamed from: K */
    public View.OnFocusChangeListener f278K;

    /* JADX INFO: renamed from: L */
    public View.OnClickListener f279L;

    /* JADX INFO: renamed from: M */
    public boolean f280M;

    /* JADX INFO: renamed from: N */
    public boolean f281N;

    /* JADX INFO: renamed from: O */
    public AbstractC0890xe f282O;

    /* JADX INFO: renamed from: P */
    public boolean f283P;

    /* JADX INFO: renamed from: Q */
    public CharSequence f284Q;

    /* JADX INFO: renamed from: R */
    public boolean f285R;

    /* JADX INFO: renamed from: S */
    public boolean f286S;

    /* JADX INFO: renamed from: T */
    public int f287T;

    /* JADX INFO: renamed from: U */
    public boolean f288U;

    /* JADX INFO: renamed from: V */
    public CharSequence f289V;

    /* JADX INFO: renamed from: W */
    public boolean f290W;

    /* JADX INFO: renamed from: a0 */
    public int f291a0;

    /* JADX INFO: renamed from: b0 */
    public SearchableInfo f292b0;

    /* JADX INFO: renamed from: c0 */
    public Bundle f293c0;

    /* JADX INFO: renamed from: d0 */
    public final h20 f294d0;

    /* JADX INFO: renamed from: e0 */
    public final h20 f295e0;

    /* JADX INFO: renamed from: f0 */
    public final WeakHashMap f296f0;

    /* JADX INFO: renamed from: p */
    public final SearchAutoComplete f297p;

    /* JADX INFO: renamed from: q */
    public final View f298q;

    /* JADX INFO: renamed from: r */
    public final View f299r;

    /* JADX INFO: renamed from: s */
    public final View f300s;

    /* JADX INFO: renamed from: t */
    public final ImageView f301t;

    /* JADX INFO: renamed from: u */
    public final ImageView f302u;

    /* JADX INFO: renamed from: v */
    public final ImageView f303v;

    /* JADX INFO: renamed from: w */
    public final ImageView f304w;

    /* JADX INFO: renamed from: x */
    public final View f305x;

    /* JADX INFO: renamed from: y */
    public o20 f306y;

    /* JADX INFO: renamed from: z */
    public final Rect f307z;

    static {
        C0239fw c0239fw = null;
        if (Build.VERSION.SDK_INT < 29) {
            C0239fw c0239fw2 = new C0239fw();
            c0239fw2.f1840a = null;
            c0239fw2.f1841b = null;
            c0239fw2.f1842c = null;
            C0239fw.m1115a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                c0239fw2.f1840a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                c0239fw2.f1841b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c0239fw2.f1842c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c0239fw = c0239fw2;
        }
        f267g0 = c0239fw;
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
        SearchAutoComplete searchAutoComplete = this.f297p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f286S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f297p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f286S = false;
    }

    public int getImeOptions() {
        return this.f297p.getImeOptions();
    }

    public int getInputType() {
        return this.f297p.getInputType();
    }

    public int getMaxWidth() {
        return this.f287T;
    }

    public CharSequence getQuery() {
        return this.f297p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f284Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f292b0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f277J : getContext().getText(this.f292b0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f274G;
    }

    public int getSuggestionRowLayout() {
        return this.f273F;
    }

    public AbstractC0890xe getSuggestionsAdapter() {
        return this.f282O;
    }

    /* JADX INFO: renamed from: j */
    public final Intent m152j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f289V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f293c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f292b0.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: k */
    public final Intent m153k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f293c0;
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
    public final void m154l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f297p;
        if (i >= 29) {
            AbstractC0032c.m189a(searchAutoComplete);
            return;
        }
        C0239fw c0239fw = f267g0;
        c0239fw.getClass();
        C0239fw.m1115a();
        Method method = c0239fw.f1840a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        c0239fw.getClass();
        C0239fw.m1115a();
        Method method2 = c0239fw.f1841b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m155m() {
        SearchAutoComplete searchAutoComplete = this.f297p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f280M) {
            clearFocus();
            m165w(true);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m156n(int i) {
        int position;
        String strM1737h;
        Cursor cursor = this.f282O.f5239c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentM152j = null;
            try {
                int i2 = l50.f2920x;
                String strM1737h2 = l50.m1737h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM1737h2 == null) {
                    strM1737h2 = this.f292b0.getSuggestIntentAction();
                }
                if (strM1737h2 == null) {
                    strM1737h2 = "android.intent.action.SEARCH";
                }
                String strM1737h3 = l50.m1737h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM1737h3 == null) {
                    strM1737h3 = this.f292b0.getSuggestIntentData();
                }
                if (strM1737h3 != null && (strM1737h = l50.m1737h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM1737h3 = strM1737h3 + "/" + Uri.encode(strM1737h);
                }
                intentM152j = m152j(strM1737h2, strM1737h3 == null ? null : Uri.parse(strM1737h3), l50.m1737h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), l50.m1737h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentM152j != null) {
                try {
                    getContext().startActivity(intentM152j);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentM152j, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f297p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX INFO: renamed from: o */
    public final void m157o(int i) {
        Editable text = this.f297p.getText();
        Cursor cursor = this.f282O.f5239c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strMo1740c = this.f282O.mo1740c(cursor);
        if (strMo1740c != null) {
            setQuery(strMo1740c);
        } else {
            setQuery(text);
        }
    }

    @Override // p000.InterfaceC0255gb
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f297p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f289V = "";
        clearFocus();
        m165w(true);
        searchAutoComplete.setImeOptions(this.f291a0);
        this.f290W = false;
    }

    @Override // p000.InterfaceC0255gb
    public final void onActionViewExpanded() {
        if (this.f290W) {
            return;
        }
        this.f290W = true;
        SearchAutoComplete searchAutoComplete = this.f297p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f291a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f294d0);
        post(this.f295e0);
        super.onDetachedFromWindow();
    }

    @Override // p000.AbstractC0902xq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f297p;
            int[] iArr = this.f269B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f270C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.f307z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.f268A;
            rect2.set(i7, 0, i8, i9);
            o20 o20Var = this.f306y;
            if (o20Var == null) {
                o20 o20Var2 = new o20(rect2, rect, searchAutoComplete);
                this.f306y = o20Var2;
                setTouchDelegate(o20Var2);
            } else {
                o20Var.f3359b.set(rect2);
                Rect rect3 = o20Var.f3361d;
                rect3.set(rect2);
                int i10 = -o20Var.f3362e;
                rect3.inset(i10, i10);
                o20Var.f3360c.set(rect);
            }
        }
    }

    @Override // p000.AbstractC0902xq, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f281N) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f287T;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f287T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f287T) > 0) {
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
        if (!(parcelable instanceof n20)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n20 n20Var = (n20) parcelable;
        super.onRestoreInstanceState(n20Var.f1274a);
        m165w(n20Var.f3211c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n20 n20Var = new n20(super.onSaveInstanceState());
        n20Var.f3211c = this.f281N;
        return n20Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f294d0);
    }

    /* JADX INFO: renamed from: p */
    public final void m158p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: q */
    public final void m159q() {
        SearchAutoComplete searchAutoComplete = this.f297p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f292b0 != null) {
            getContext().startActivity(m152j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    /* JADX INFO: renamed from: r */
    public final void m160r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f297p.getText());
        int i = (!zIsEmpty || (this.f280M && !this.f290W)) ? 0 : 8;
        ImageView imageView = this.f303v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f286S || !isFocusable()) {
            return false;
        }
        if (this.f281N) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f297p.requestFocus(i, rect);
        if (zRequestFocus) {
            m165w(false);
        }
        return zRequestFocus;
    }

    /* JADX INFO: renamed from: s */
    public final void m161s() {
        int[] iArr = this.f297p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f299r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f300s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f293c0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m155m();
            return;
        }
        m165w(false);
        SearchAutoComplete searchAutoComplete = this.f297p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f279L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f280M == z) {
            return;
        }
        this.f280M = z;
        m165w(z);
        m162t();
    }

    public void setImeOptions(int i) {
        this.f297p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f297p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f287T = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f278K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f279L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f284Q = charSequence;
        m162t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f285R = z;
        AbstractC0890xe abstractC0890xe = this.f282O;
        if (abstractC0890xe instanceof l50) {
            ((l50) abstractC0890xe).f2929p = z ? 2 : 1;
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
            r6.f292b0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f297p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f292b0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f292b0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f292b0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            xe r7 = r6.f282O
            if (r7 == 0) goto L3b
            r7.mo1739b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f292b0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            l50 r7 = new l50
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f292b0
            java.util.WeakHashMap r5 = r6.f296f0
            r7.<init>(r3, r6, r4, r5)
            r6.f282O = r7
            r2.setAdapter(r7)
            xe r7 = r6.f282O
            l50 r7 = (p000.l50) r7
            boolean r3 = r6.f285R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f2929p = r3
        L62:
            r6.m162t()
        L65:
            android.app.SearchableInfo r7 = r6.f292b0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f292b0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f275H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f292b0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f276I
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
            r6.f288U = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f281N
            r6.m165w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f283P = z;
        m165w(this.f281N);
    }

    public void setSuggestionsAdapter(AbstractC0890xe abstractC0890xe) {
        this.f282O = abstractC0890xe;
        this.f297p.setAdapter(abstractC0890xe);
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
    public final void m162t() {
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        boolean z = this.f280M;
        SearchAutoComplete searchAutoComplete = this.f297p;
        CharSequence charSequence2 = charSequence;
        if (z) {
            Drawable drawable = this.f272E;
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
    public final void m163u() {
        this.f300s.setVisibility(((this.f283P || this.f288U) && !this.f281N && (this.f302u.getVisibility() == 0 || this.f304w.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: v */
    public final void m164v(boolean z) {
        boolean z2 = this.f283P;
        this.f302u.setVisibility((!z2 || !(z2 || this.f288U) || this.f281N || !hasFocus() || (!z && this.f288U)) ? 8 : 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m165w(boolean z) {
        this.f281N = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f297p.getText());
        this.f301t.setVisibility(i2);
        m164v(!zIsEmpty);
        this.f298q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f271D;
        imageView.setVisibility((imageView.getDrawable() == null || this.f280M) ? 8 : 0);
        m160r();
        if (this.f288U && !this.f281N && zIsEmpty) {
            this.f302u.setVisibility(8);
            i = 0;
        }
        this.f304w.setVisibility(i);
        m163u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f307z = new Rect();
        this.f268A = new Rect();
        this.f269B = new int[2];
        this.f270C = new int[2];
        this.f294d0 = new h20(this, 0);
        this.f295e0 = new h20(this, 1);
        this.f296f0 = new WeakHashMap();
        ViewOnClickListenerC0030a viewOnClickListenerC0030a = new ViewOnClickListenerC0030a(this);
        ViewOnKeyListenerC0031b viewOnKeyListenerC0031b = new ViewOnKeyListenerC0031b(this);
        j20 j20Var = new j20(this);
        C0620q4 c0620q4 = new C0620q4(2, this);
        C0348ir c0348ir = new C0348ir(1, this);
        g20 g20Var = new g20(this, 0);
        int[] iArr = AbstractC0205ez.f1697u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C0658r5 c0658r5 = new C0658r5(context, typedArrayObtainStyledAttributes);
        oa0.m2011k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f297p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f298q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f299r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f300s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f301t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f302u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f303v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f304w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f271D = imageView5;
        x90.m2669q(viewFindViewById, c0658r5.m2241m(20));
        x90.m2669q(viewFindViewById2, c0658r5.m2241m(25));
        imageView.setImageDrawable(c0658r5.m2241m(23));
        imageView2.setImageDrawable(c0658r5.m2241m(15));
        imageView3.setImageDrawable(c0658r5.m2241m(12));
        imageView4.setImageDrawable(c0658r5.m2241m(28));
        imageView5.setImageDrawable(c0658r5.m2241m(23));
        this.f272E = c0658r5.m2241m(22);
        r70.m2264a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f273F = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f274G = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(viewOnClickListenerC0030a);
        imageView3.setOnClickListener(viewOnClickListenerC0030a);
        imageView2.setOnClickListener(viewOnClickListenerC0030a);
        imageView4.setOnClickListener(viewOnClickListenerC0030a);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0030a);
        searchAutoComplete.addTextChangedListener(g20Var);
        searchAutoComplete.setOnEditorActionListener(j20Var);
        searchAutoComplete.setOnItemClickListener(c0620q4);
        searchAutoComplete.setOnItemSelectedListener(c0348ir);
        searchAutoComplete.setOnKeyListener(viewOnKeyListenerC0031b);
        searchAutoComplete.setOnFocusChangeListener(new i20(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f277J = typedArrayObtainStyledAttributes.getText(14);
        this.f284Q = typedArrayObtainStyledAttributes.getText(21);
        int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        c0658r5.m2252z();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f275H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f276I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f305x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0920y7(2, this));
        }
        m165w(this.f280M);
        m162t();
    }

    public static class SearchAutoComplete extends C0766u2 {

        /* JADX INFO: renamed from: e */
        public int f308e;

        /* JADX INFO: renamed from: f */
        public SearchView f309f;

        /* JADX INFO: renamed from: g */
        public boolean f310g;

        /* JADX INFO: renamed from: h */
        public final RunnableC0033d f311h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f311h = new RunnableC0033d(this);
            this.f308e = getThreshold();
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
        public final void m166a() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC0032c.m190b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C0239fw c0239fw = SearchView.f267g0;
            c0239fw.getClass();
            C0239fw.m1115a();
            Method method = c0239fw.f1842c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f308e <= 0 || super.enoughToFilter();
        }

        @Override // p000.C0766u2, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f310g) {
                RunnableC0033d runnableC0033d = this.f311h;
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
            SearchView searchView = this.f309f;
            searchView.m165w(searchView.f281N);
            searchView.post(searchView.f294d0);
            if (searchView.f297p.hasFocus()) {
                searchView.m154l();
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
                        this.f309f.clearFocus();
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
            if (z && this.f309f.hasFocus() && getVisibility() == 0) {
                this.f310g = true;
                Context context = getContext();
                C0239fw c0239fw = SearchView.f267g0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    m166a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC0033d runnableC0033d = this.f311h;
            if (!z) {
                this.f310g = false;
                removeCallbacks(runnableC0033d);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f310g = true;
                    return;
                }
                this.f310g = false;
                removeCallbacks(runnableC0033d);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f309f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f308e = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }
    }

    public void setOnCloseListener(k20 k20Var) {
    }

    public void setOnQueryTextListener(l20 l20Var) {
    }

    public void setOnSuggestionListener(m20 m20Var) {
    }
}
