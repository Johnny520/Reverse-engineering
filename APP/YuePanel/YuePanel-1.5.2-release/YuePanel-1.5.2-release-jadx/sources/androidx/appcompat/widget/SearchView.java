package androidx.appcompat.widget;

import Yue.AbstractC2967;
import Yue.AbstractC4256;
import Yue.C3277;
import Yue.C6898;
import Yue.C7837;
import Yue.C7939;
import Yue.C8273;
import Yue.C8370;
import Yue.InterfaceC3875;
import Yue.InterfaceC4482;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.ViewOnClickListenerC7675;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends C8754 implements InterfaceC3875 {

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final boolean f26238 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final String f26239 = "SearchView";

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final String f26240 = "nm";

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final C8727 f26241;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final SearchAutoComplete f26242;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final View f26243;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final View f26244;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final View f26245;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final ImageView f26246;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final ImageView f26247;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final ImageView f26248;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final ImageView f26249;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final View f26250;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public C8729 f26251;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public Rect f26252;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Rect f26253;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int[] f26254;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int[] f26255;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final ImageView f26256;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final Drawable f26257;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final int f26258;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final int f26259;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final Intent f26260;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final Intent f26261;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final CharSequence f26262;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public InterfaceC8725 f26263;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public InterfaceC8724 f26264;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public View.OnFocusChangeListener f26265;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public InterfaceC8726 f26266;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public View.OnClickListener f26267;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean f26268;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public boolean f26269;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public AbstractC4256 f26270;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f26271;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public CharSequence f26272;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean f26273;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean f26274;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public int f26275;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean f26276;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public CharSequence f26277;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public CharSequence f26278;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean f26279;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public int f26280;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public SearchableInfo f26281;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public Bundle f26282;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final Runnable f26283;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public Runnable f26284;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public final WeakHashMap<String, Drawable.ConstantState> f26285;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final View.OnClickListener f26286;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public View.OnKeyListener f26287;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public final TextView.OnEditorActionListener f26288;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public final AdapterView.OnItemClickListener f26289;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public final AdapterView.OnItemSelectedListener f26290;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public TextWatcher f26291;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends C3277 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26292;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public SearchView f26293;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f26294;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final Runnable f26295;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$ۥ */
        public class RunnableC1620 implements Runnable {
            public RunnableC1620() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m29158();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SearchAutoComplete(Context context) {
            this(context, null);
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
        public boolean enoughToFilter() {
            return this.f26292 <= 0 || super.enoughToFilter();
        }

        @Override // Yue.C3277, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f26294) {
                removeCallbacks(this.f26295);
                post(this.f26295);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f26293.m29145();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
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
                        this.f26293.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f26293.hasFocus() && getVisibility() == 0) {
                this.f26294 = true;
                if (SearchView.m29118(getContext())) {
                    m4666();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f26294 = false;
                removeCallbacks(this.f26295);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f26294 = true;
                    return;
                }
                this.f26294 = false;
                removeCallbacks(this.f26295);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f26293 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f26292 = i;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4666() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f26241.m29160(this);
                return;
            }
            C8723.m4669(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4667() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29158() {
            if (this.f26294) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f26294 = false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C6898.C1110.f18394);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f26295 = new RunnableC1620();
            this.f26292 = getThreshold();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ */
    public class C1621 implements TextWatcher {
        public C1621() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m29144(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟ */
    public class RunnableC1622 implements Runnable {
        public RunnableC1622() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m29151();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟, reason: contains not printable characters */
    public class RunnableC8715 implements Runnable {
        public RunnableC8715() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4256 abstractC4256 = SearchView.this.f26270;
            if (abstractC4256 instanceof ViewOnClickListenerC7675) {
                abstractC4256.mo1221(null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟, reason: contains not printable characters */
    public class ViewOnFocusChangeListenerC8716 implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC8716() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f26265;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟۟, reason: contains not printable characters */
    public class ViewOnLayoutChangeListenerC8717 implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC8717() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m29119();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟۠, reason: contains not printable characters */
    public class ViewOnClickListenerC8718 implements View.OnClickListener {
        public ViewOnClickListenerC8718() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f26246) {
                searchView.m29141();
                return;
            }
            if (view == searchView.f26248) {
                searchView.m29137();
                return;
            }
            if (view == searchView.f26247) {
                searchView.m29142();
            } else if (view == searchView.f26249) {
                searchView.m29146();
            } else if (view == searchView.f26242) {
                searchView.m29125();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class ViewOnKeyListenerC8719 implements View.OnKeyListener {
        public ViewOnKeyListenerC8719() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f26281 == null) {
                return false;
            }
            if (searchView.f26242.isPopupShowing() && SearchView.this.f26242.getListSelection() != -1) {
                return SearchView.this.m29143(view, i, keyEvent);
            }
            if (SearchView.this.f26242.m4667() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m29135(0, null, searchView2.f26242.getText().toString());
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C8720 implements TextView.OnEditorActionListener {
        public C8720() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m29142();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C8721 implements AdapterView.OnItemClickListener {
        public C8721() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m29138(i, 0, null);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public class C8722 implements AdapterView.OnItemSelectedListener {
        public C8722() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m29139(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C8723 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4668(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m4669(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public interface InterfaceC8724 {
        /* JADX INFO: renamed from: ۥ */
        boolean m4670();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC8725 {
        /* JADX INFO: renamed from: ۥ */
        boolean m4671(String str);

        /* JADX INFO: renamed from: ۥ۟ */
        boolean m4672(String str);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public interface InterfaceC8726 {
        /* JADX INFO: renamed from: ۥ */
        boolean m4673(int i);

        /* JADX INFO: renamed from: ۥ۟ */
        boolean m4674(int i);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۠, reason: contains not printable characters */
    public static class C8727 {

        /* JADX INFO: renamed from: ۥ */
        public Method f3660;

        /* JADX INFO: renamed from: ۥ۟ */
        public Method f3661;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Method f26305;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C8727() {
            this.f3660 = null;
            this.f3661 = null;
            this.f26305 = null;
            m29159();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f3660 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f3661 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f26305 = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m29159() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4675(AutoCompleteTextView autoCompleteTextView) {
            m29159();
            Method method = this.f3661;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4676(AutoCompleteTextView autoCompleteTextView) {
            m29159();
            Method method = this.f3660;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29160(AutoCompleteTextView autoCompleteTextView) {
            m29159();
            Method method = this.f26305;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C8728 extends AbstractC2967 {
        public static final Parcelable.Creator<C8728> CREATOR = new C1623();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f26306;

        /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۠۟$ۥ */
        public class C1623 implements Parcelable.ClassLoaderCreator<C8728> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8728 createFromParcel(Parcel parcel) {
                return new C8728(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8728 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8728(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8728[] newArray(int i) {
                return new C8728[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8728(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f26306 + "}";
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f26306));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8728(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f26306 = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SearchView$ۥ۟۟۠۠, reason: contains not printable characters */
    public static class C8729 extends TouchDelegate {

        /* JADX INFO: renamed from: ۥ */
        public final View f3662;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Rect f3663;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Rect f26307;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Rect f26308;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f26309;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f26310;

        public C8729(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f26309 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f3663 = new Rect();
            this.f26308 = new Rect();
            this.f26307 = new Rect();
            m4679(rect, rect2);
            this.f3662 = view;
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f26310;
                    if (z2 && !this.f26308.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f26310;
                        this.f26310 = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.f3663.contains(x, y)) {
                this.f26310 = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f26307.contains(x, y)) {
                Rect rect = this.f26307;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f3662.getWidth() / 2, this.f3662.getHeight() / 2);
            }
            return this.f3662.dispatchTouchEvent(motionEvent);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4679(Rect rect, Rect rect2) {
            this.f3663.set(rect);
            this.f26308.set(rect);
            Rect rect3 = this.f26308;
            int i = this.f26309;
            rect3.inset(-i, -i);
            this.f26307.set(rect2);
        }
    }

    static {
        f26241 = Build.VERSION.SDK_INT < 29 ? new C8727() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SearchView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C6898.C6901.f18756);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C6898.C6901.f18757);
    }

    private void setQuery(CharSequence charSequence) {
        this.f26242.setText(charSequence);
        this.f26242.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m29118(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f26274 = true;
        super.clearFocus();
        this.f26242.clearFocus();
        this.f26242.setImeVisibility(false);
        this.f26274 = false;
    }

    public int getImeOptions() {
        return this.f26242.getImeOptions();
    }

    public int getInputType() {
        return this.f26242.getInputType();
    }

    public int getMaxWidth() {
        return this.f26275;
    }

    public CharSequence getQuery() {
        return this.f26242.getText();
    }

    @InterfaceC6490
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f26272;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f26281;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f26262 : getContext().getText(this.f26281.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f26259;
    }

    public int getSuggestionRowLayout() {
        return this.f26258;
    }

    public AbstractC4256 getSuggestionsAdapter() {
        return this.f26270;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f26283);
        post(this.f26284);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m29126(this.f26242, this.f26252);
            Rect rect = this.f26253;
            Rect rect2 = this.f26252;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C8729 c8729 = this.f26251;
            if (c8729 != null) {
                c8729.m4679(this.f26253, this.f26252);
                return;
            }
            C8729 c87292 = new C8729(this.f26253, this.f26252, this.f26242);
            this.f26251 = c87292;
            setTouchDelegate(c87292);
        }
    }

    @Override // androidx.appcompat.widget.C8754, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (m29130()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f26275;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f26275;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f26275) > 0) {
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
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8728)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8728 c8728 = (C8728) parcelable;
        super.onRestoreInstanceState(c8728.getSuperState());
        m29156(c8728.f26306);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C8728 c8728 = new C8728(super.onSaveInstanceState());
        c8728.f26306 = m29130();
        return c8728;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m29147();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f26274 || !isFocusable()) {
            return false;
        }
        if (m29130()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f26242.requestFocus(i, rect);
        if (zRequestFocus) {
            m29156(false);
        }
        return zRequestFocus;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f26282 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m29137();
        } else {
            m29141();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f26268 == z) {
            return;
        }
        this.f26268 = z;
        m29156(z);
        m29152();
    }

    public void setImeOptions(int i) {
        this.f26242.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f26242.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f26275 = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC8724 interfaceC8724) {
        this.f26264 = interfaceC8724;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f26265 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC8725 interfaceC8725) {
        this.f26263 = interfaceC8725;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f26267 = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC8726 interfaceC8726) {
        this.f26266 = interfaceC8726;
    }

    public void setQueryHint(@InterfaceC6490 CharSequence charSequence) {
        this.f26272 = charSequence;
        m29152();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f26273 = z;
        AbstractC4256 abstractC4256 = this.f26270;
        if (abstractC4256 instanceof ViewOnClickListenerC7675) {
            ((ViewOnClickListenerC7675) abstractC4256).m24442(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f26281 = searchableInfo;
        if (searchableInfo != null) {
            m29153();
            m29152();
        }
        boolean zM29128 = m29128();
        this.f26276 = zM29128;
        if (zM29128) {
            this.f26242.setPrivateImeOptions(f26240);
        }
        m29156(m29130());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f26271 = z;
        m29156(m29130());
    }

    public void setSuggestionsAdapter(AbstractC4256 abstractC4256) {
        this.f26270 = abstractC4256;
        this.f26242.setAdapter(abstractC4256);
    }

    @Override // Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo912() {
        if (this.f26279) {
            return;
        }
        this.f26279 = true;
        int imeOptions = this.f26242.getImeOptions();
        this.f26280 = imeOptions;
        this.f26242.setImeOptions(imeOptions | 33554432);
        this.f26242.setText("");
        setIconified(false);
    }

    @Override // Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo10705() {
        m29149("", false);
        clearFocus();
        m29156(true);
        this.f26242.setImeOptions(this.f26280);
        this.f26279 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29119() {
        if (this.f26250.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f26244.getPaddingLeft();
            Rect rect = new Rect();
            boolean zM4344 = C8370.m4344(this);
            int dimensionPixelSize = this.f26268 ? resources.getDimensionPixelSize(C6898.C6901.f18743) + resources.getDimensionPixelSize(C6898.C6901.f18744) : 0;
            this.f26242.getDropDownBackground().getPadding(rect);
            this.f26242.setDropDownHorizontalOffset(zM4344 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f26242.setDropDownWidth((((this.f26250.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final Intent m29120(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f26278);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f26282;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f26281.getSearchActivity());
        return intent;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Intent m29121(Cursor cursor, int i, String str) {
        int position;
        String strM24427;
        try {
            String strM244272 = ViewOnClickListenerC7675.m24427(cursor, "suggest_intent_action");
            if (strM244272 == null) {
                strM244272 = this.f26281.getSuggestIntentAction();
            }
            if (strM244272 == null) {
                strM244272 = "android.intent.action.SEARCH";
            }
            String str2 = strM244272;
            String strM244273 = ViewOnClickListenerC7675.m24427(cursor, "suggest_intent_data");
            if (strM244273 == null) {
                strM244273 = this.f26281.getSuggestIntentData();
            }
            if (strM244273 != null && (strM24427 = ViewOnClickListenerC7675.m24427(cursor, "suggest_intent_data_id")) != null) {
                strM244273 = strM244273 + "/" + Uri.encode(strM24427);
            }
            return m29120(str2, strM244273 == null ? null : Uri.parse(strM244273), ViewOnClickListenerC7675.m24427(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC7675.m24427(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w(f26239, "Search suggestions cursor at row " + position + " returned exception.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Intent m29122(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f26282;
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

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Intent m29123(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m29124() {
        this.f26242.dismissDropDown();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29125() {
        if (Build.VERSION.SDK_INT >= 29) {
            C8723.m4668(this.f26242);
            return;
        }
        C8727 c8727 = f26241;
        c8727.m4676(this.f26242);
        c8727.m4675(this.f26242);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29126(View view, Rect rect) {
        view.getLocationInWindow(this.f26254);
        getLocationInWindow(this.f26255);
        int[] iArr = this.f26254;
        int i = iArr[1];
        int[] iArr2 = this.f26255;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final CharSequence m29127(CharSequence charSequence) {
        if (!this.f26268 || this.f26257 == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f26242.getTextSize()) * 1.25d);
        this.f26257.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f26257), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m29128() {
        SearchableInfo searchableInfo = this.f26281;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f26281.getVoiceSearchLaunchWebSearch() ? this.f26260 : this.f26281.getVoiceSearchLaunchRecognizer() ? this.f26261 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m29129() {
        return this.f26268;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m29130() {
        return this.f26269;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m29131() {
        return this.f26273;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m29132() {
        return (this.f26271 || this.f26276) && !m29130();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m29133() {
        return this.f26271;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m29134(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e) {
            Log.e(f26239, "Failed launch activity: " + intent, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m29135(int i, String str, String str2) {
        getContext().startActivity(m29120("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m29136(int i, int i2, String str) {
        Cursor cursor = this.f26270.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        m29134(m29121(cursor, i2, str));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m29137() {
        if (!TextUtils.isEmpty(this.f26242.getText())) {
            this.f26242.setText("");
            this.f26242.requestFocus();
            this.f26242.setImeVisibility(true);
        } else if (this.f26268) {
            InterfaceC8724 interfaceC8724 = this.f26264;
            if (interfaceC8724 == null || !interfaceC8724.m4670()) {
                clearFocus();
                m29156(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m29138(int i, int i2, String str) {
        InterfaceC8726 interfaceC8726 = this.f26266;
        if (interfaceC8726 != null && interfaceC8726.m4674(i)) {
            return false;
        }
        m29136(i, 0, null);
        this.f26242.setImeVisibility(false);
        m29124();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean m29139(int i) {
        InterfaceC8726 interfaceC8726 = this.f26266;
        if (interfaceC8726 != null && interfaceC8726.m4673(i)) {
            return false;
        }
        m29148(i);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m29140(@InterfaceC6490 CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m29141() {
        m29156(false);
        this.f26242.requestFocus();
        this.f26242.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f26267;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29142() {
        Editable text = this.f26242.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC8725 interfaceC8725 = this.f26263;
        if (interfaceC8725 == null || !interfaceC8725.m4672(text.toString())) {
            if (this.f26281 != null) {
                m29135(0, null, text.toString());
            }
            this.f26242.setImeVisibility(false);
            m29124();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean m29143(View view, int i, KeyEvent keyEvent) {
        if (this.f26281 != null && this.f26270 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m29138(this.f26242.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f26242.setSelection(i == 21 ? 0 : this.f26242.length());
                this.f26242.setListSelection(0);
                this.f26242.clearListSelection();
                this.f26242.m4666();
                return true;
            }
            if (i == 19) {
                this.f26242.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m29144(CharSequence charSequence) {
        Editable text = this.f26242.getText();
        this.f26278 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        m29155(!zIsEmpty);
        m29157(zIsEmpty);
        m29150();
        m29154();
        if (this.f26263 != null && !TextUtils.equals(charSequence, this.f26277)) {
            this.f26263.m4671(charSequence.toString());
        }
        this.f26277 = charSequence.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m29145() {
        m29156(m29130());
        m29147();
        if (this.f26242.hasFocus()) {
            m29125();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m29146() {
        SearchableInfo searchableInfo = this.f26281;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(m29123(this.f26260, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(m29122(this.f26261, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(f26239, "Could not find voice search activity");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m29147() {
        post(this.f26283);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m29148(int i) {
        Editable text = this.f26242.getText();
        Cursor cursor = this.f26270.getCursor();
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceMo1220 = this.f26270.mo1220(cursor);
        if (charSequenceMo1220 != null) {
            setQuery(charSequenceMo1220);
        } else {
            setQuery(text);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m29149(CharSequence charSequence, boolean z) {
        this.f26242.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f26242;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f26278 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m29142();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final void m29150() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f26242.getText());
        if (!z2 && (!this.f26268 || this.f26279)) {
            z = false;
        }
        this.f26248.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f26248.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m29151() {
        int[] iArr = this.f26242.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f26244.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f26245.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m29152() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f26242;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m29127(queryHint));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m29153() {
        this.f26242.setThreshold(this.f26281.getSuggestThreshold());
        this.f26242.setImeOptions(this.f26281.getImeOptions());
        int inputType = this.f26281.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f26281.getSuggestAuthority() != null) {
                inputType |= Opcodes.ASM9;
            }
        }
        this.f26242.setInputType(inputType);
        AbstractC4256 abstractC4256 = this.f26270;
        if (abstractC4256 != null) {
            abstractC4256.mo1221(null);
        }
        if (this.f26281.getSuggestAuthority() != null) {
            ViewOnClickListenerC7675 viewOnClickListenerC7675 = new ViewOnClickListenerC7675(getContext(), this, this.f26281, this.f26285);
            this.f26270 = viewOnClickListenerC7675;
            this.f26242.setAdapter(viewOnClickListenerC7675);
            ((ViewOnClickListenerC7675) this.f26270).m24442(this.f26273 ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final void m29154() {
        this.f26245.setVisibility((m29132() && (this.f26247.getVisibility() == 0 || this.f26249.getVisibility() == 0)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m29155(boolean z) {
        this.f26247.setVisibility((this.f26271 && m29132() && hasFocus() && (z || !this.f26276)) ? 0 : 8);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final void m29156(boolean z) {
        this.f26269 = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f26242.getText());
        this.f26246.setVisibility(i2);
        m29155(!zIsEmpty);
        this.f26243.setVisibility(z ? 8 : 0);
        if (this.f26256.getDrawable() != null && !this.f26268) {
            i = 0;
        }
        this.f26256.setVisibility(i);
        m29150();
        m29157(zIsEmpty);
        m29154();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m29157(boolean z) {
        int i = 8;
        if (this.f26276 && !m29130() && z) {
            this.f26247.setVisibility(8);
            i = 0;
        }
        this.f26249.setVisibility(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SearchView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18545);
    }

    public SearchView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26252 = new Rect();
        this.f26253 = new Rect();
        this.f26254 = new int[2];
        this.f26255 = new int[2];
        this.f26283 = new RunnableC1622();
        this.f26284 = new RunnableC8715();
        this.f26285 = new WeakHashMap<>();
        ViewOnClickListenerC8718 viewOnClickListenerC8718 = new ViewOnClickListenerC8718();
        this.f26286 = viewOnClickListenerC8718;
        this.f26287 = new ViewOnKeyListenerC8719();
        C8720 c8720 = new C8720();
        this.f26288 = c8720;
        C8721 c8721 = new C8721();
        this.f26289 = c8721;
        C8722 c8722 = new C8722();
        this.f26290 = c8722;
        this.f26291 = new C1621();
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19678, i, 0);
        C8273.m27437(this, context, C6898.C6909.f19678, attributeSet, c7837M24869.m24895(), i, 0);
        LayoutInflater.from(context).inflate(c7837M24869.m24888(C6898.C6909.f19698, C6898.C6906.f18993), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C6898.C6903.f18941);
        this.f26242 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f26243 = findViewById(C6898.C6903.f18937);
        View viewFindViewById = findViewById(C6898.C6903.f18940);
        this.f26244 = viewFindViewById;
        View viewFindViewById2 = findViewById(C6898.C6903.f18951);
        this.f26245 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(C6898.C6903.f18935);
        this.f26246 = imageView;
        ImageView imageView2 = (ImageView) findViewById(C6898.C6903.f18938);
        this.f26247 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C6898.C6903.f18936);
        this.f26248 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C6898.C6903.f18942);
        this.f26249 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C6898.C6903.f18939);
        this.f26256 = imageView5;
        C8273.m27447(viewFindViewById, c7837M24869.m24875(C6898.C6909.f19699));
        C8273.m27447(viewFindViewById2, c7837M24869.m24875(C6898.C6909.f19704));
        imageView.setImageDrawable(c7837M24869.m24875(C6898.C6909.f19702));
        imageView2.setImageDrawable(c7837M24869.m24875(C6898.C6909.f19694));
        imageView3.setImageDrawable(c7837M24869.m24875(C6898.C6909.f19691));
        imageView4.setImageDrawable(c7837M24869.m24875(C6898.C6909.f19707));
        imageView5.setImageDrawable(c7837M24869.m24875(C6898.C6909.f19702));
        this.f26257 = c7837M24869.m24875(C6898.C6909.f19701);
        C7939.m3953(imageView, getResources().getString(C6898.C6907.f19019));
        this.f26258 = c7837M24869.m24888(C6898.C6909.f19705, C6898.C6906.f18992);
        this.f26259 = c7837M24869.m24888(C6898.C6909.f19692, 0);
        imageView.setOnClickListener(viewOnClickListenerC8718);
        imageView3.setOnClickListener(viewOnClickListenerC8718);
        imageView2.setOnClickListener(viewOnClickListenerC8718);
        imageView4.setOnClickListener(viewOnClickListenerC8718);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC8718);
        searchAutoComplete.addTextChangedListener(this.f26291);
        searchAutoComplete.setOnEditorActionListener(c8720);
        searchAutoComplete.setOnItemClickListener(c8721);
        searchAutoComplete.setOnItemSelectedListener(c8722);
        searchAutoComplete.setOnKeyListener(this.f26287);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC8716());
        setIconifiedByDefault(c7837M24869.m3933(C6898.C6909.f19697, true));
        int iM24874 = c7837M24869.m24874(C6898.C6909.f19681, -1);
        if (iM24874 != -1) {
            setMaxWidth(iM24874);
        }
        this.f26262 = c7837M24869.m24891(C6898.C6909.f19693);
        this.f26272 = c7837M24869.m24891(C6898.C6909.f19700);
        int iM24882 = c7837M24869.m24882(C6898.C6909.f19685, -1);
        if (iM24882 != -1) {
            setImeOptions(iM24882);
        }
        int iM248822 = c7837M24869.m24882(C6898.C6909.f19684, -1);
        if (iM248822 != -1) {
            setInputType(iM248822);
        }
        setFocusable(c7837M24869.m3933(C6898.C6909.f19680, true));
        c7837M24869.m24899();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f26260 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f26261 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f26250 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8717());
        }
        m29156(this.f26268);
        m29152();
    }
}
