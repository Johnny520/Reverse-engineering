package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.C0983R;
import java.lang.reflect.Method;
import p000a.AbstractC0024B4;
import p000a.AbstractC0792r;
import p000a.C0093F0;
import p000a.InterfaceC0701m3;
import p000a.ViewOnClickListenerC0089Ee;

/* JADX INFO: loaded from: classes.dex */
public final class SearchView extends C1039b implements InterfaceC0701m3 {

    /* JADX INFO: renamed from: v */
    public static final C1024e f3965v;

    /* JADX INFO: renamed from: p */
    public boolean f3966p;

    /* JADX INFO: renamed from: q */
    public boolean f3967q;

    /* JADX INFO: renamed from: r */
    public AbstractC0024B4 f3968r;

    /* JADX INFO: renamed from: s */
    public CharSequence f3969s;

    /* JADX INFO: renamed from: t */
    public int f3970t;

    /* JADX INFO: renamed from: u */
    public SearchableInfo f3971u;

    public static class SearchAutoComplete extends C0093F0 {

        /* JADX INFO: renamed from: e */
        public int f3972e;

        /* JADX INFO: renamed from: f */
        public SearchView f3973f;

        /* JADX INFO: renamed from: g */
        public boolean f3974g;

        /* JADX INFO: renamed from: h */
        public final RunnableC1019a f3975h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC1019a implements Runnable {
            public RunnableC1019a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f3974g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f3974g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, C0983R.attr.autoCompleteTextViewStyle);
            this.f3975h = new RunnableC1019a();
            this.f3972e = getThreshold();
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

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f3972e <= 0 || super.enoughToFilter();
        }

        @Override // p000a.C0093F0, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3974g) {
                RunnableC1019a runnableC1019a = this.f3975h;
                removeCallbacks(runnableC1019a);
                post(runnableC1019a);
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
            SearchView searchView = this.f3973f;
            searchView.f3967q = searchView.f3967q;
            throw null;
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
                        this.f3973f.clearFocus();
                        throw null;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f3973f.hasFocus() && getVisibility() == 0) {
                this.f3974g = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        C1020a.m2363b(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    C1024e c1024e = SearchView.f3965v;
                    c1024e.getClass();
                    C1024e.m2364a();
                    Method method = c1024e.f3977a;
                    if (method != null) {
                        try {
                            method.invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            RunnableC1019a runnableC1019a = this.f3975h;
            if (!z) {
                this.f3974g = false;
                removeCallbacks(runnableC1019a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3974g = true;
                    return;
                }
                this.f3974g = false;
                removeCallbacks(runnableC1019a);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3973f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f3972e = i;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$a */
    public static class C1020a {
        /* JADX INFO: renamed from: a */
        public static void m2362a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* JADX INFO: renamed from: b */
        public static void m2363b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$b */
    public interface InterfaceC1021b {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$c */
    public interface InterfaceC1022c {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$d */
    public interface InterfaceC1023d {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$e */
    public static class C1024e {

        /* JADX INFO: renamed from: a */
        public Method f3977a;

        /* JADX INFO: renamed from: a */
        public static void m2364a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f */
    public static class C1025f extends AbstractC0792r {
        public static final Parcelable.Creator<C1025f> CREATOR = new a();

        /* JADX INFO: renamed from: c */
        public boolean f3978c;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$f$a */
        public class a implements Parcelable.ClassLoaderCreator<C1025f> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C1025f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1025f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C1025f[i];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C1025f(parcel, null);
            }
        }

        public C1025f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3978c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3978c + "}";
        }

        @Override // p000a.AbstractC0792r, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f3978c));
        }
    }

    static {
        C1024e c1024e = null;
        if (Build.VERSION.SDK_INT < 29) {
            C1024e c1024e2 = new C1024e();
            c1024e2.f3977a = null;
            C1024e.m2364a();
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null).setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null).setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                c1024e2.f3977a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            c1024e = c1024e2;
        }
        f3965v = c1024e;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0983R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0983R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        throw null;
    }

    @Override // p000a.InterfaceC0701m3
    /* JADX INFO: renamed from: d */
    public final void mo1309d() {
    }

    @Override // p000a.InterfaceC0701m3
    /* JADX INFO: renamed from: e */
    public final void mo1310e() {
        throw null;
    }

    public int getImeOptions() {
        throw null;
    }

    public int getInputType() {
        throw null;
    }

    public int getMaxWidth() {
        return this.f3970t;
    }

    public CharSequence getQuery() {
        throw null;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f3969s;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3971u;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return null;
        }
        return getContext().getText(this.f3971u.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return 0;
    }

    public int getSuggestionRowLayout() {
        return 0;
    }

    public AbstractC0024B4 getSuggestionsAdapter() {
        return this.f3968r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C1039b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.C1039b, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f3967q) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f3970t;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f3970t;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f3970t) > 0) {
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
        if (!(parcelable instanceof C1025f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1025f c1025f = (C1025f) parcelable;
        super.onRestoreInstanceState(c1025f.f3119a);
        this.f3967q = c1025f.f3978c;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1025f c1025f = new C1025f(super.onSaveInstanceState());
        c1025f.f3978c = this.f3967q;
        return c1025f;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return false;
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setIconified(boolean z) {
        if (z) {
            throw null;
        }
        this.f3967q = false;
        throw null;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f3966p == z) {
            return;
        }
        this.f3966p = z;
        this.f3967q = z;
        throw null;
    }

    public void setImeOptions(int i) {
        throw null;
    }

    public void setInputType(int i) {
        throw null;
    }

    public void setMaxWidth(int i) {
        this.f3970t = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC1021b interfaceC1021b) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(InterfaceC1022c interfaceC1022c) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
    }

    public void setOnSuggestionListener(InterfaceC1023d interfaceC1023d) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3969s = charSequence;
        getQueryHint();
        throw null;
    }

    public void setQueryRefinementEnabled(boolean z) {
        AbstractC0024B4 abstractC0024B4 = this.f3968r;
        if (abstractC0024B4 instanceof ViewOnClickListenerC0089Ee) {
            ((ViewOnClickListenerC0089Ee) abstractC0024B4).f290e = z ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3971u = searchableInfo;
        if (searchableInfo != null) {
            searchableInfo.getSuggestThreshold();
            throw null;
        }
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled() && !this.f3971u.getVoiceSearchLaunchWebSearch()) {
            this.f3971u.getVoiceSearchLaunchRecognizer();
        }
        this.f3967q = this.f3967q;
        throw null;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f3967q = this.f3967q;
        throw null;
    }

    public void setSuggestionsAdapter(AbstractC0024B4 abstractC0024B4) {
        this.f3968r = abstractC0024B4;
        throw null;
    }
}
