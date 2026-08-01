package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.ljx.wechatmod.R;
import java.util.Locale;

/* JADX INFO: renamed from: jt */
/* JADX INFO: loaded from: classes.dex */
public final class C0386jt extends C0767u2 {

    /* JADX INFO: renamed from: e */
    public final C0421kr f2667e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f2668f;

    /* JADX INFO: renamed from: g */
    public final Rect f2669g;

    /* JADX INFO: renamed from: h */
    public final int f2670h;

    /* JADX INFO: renamed from: i */
    public final float f2671i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f2672j;

    /* JADX INFO: renamed from: k */
    public int f2673k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f2674l;

    public C0386jt(Context context, AttributeSet attributeSet) {
        super(AbstractC0222ff.m1177W(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f2669g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM56u = a80.m56u(context2, attributeSet, AbstractC0873wy.f5050i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM56u.hasValue(0) && typedArrayM56u.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f2670h = typedArrayM56u.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f2671i = typedArrayM56u.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM56u.hasValue(2)) {
            this.f2672j = ColorStateList.valueOf(typedArrayM56u.getColor(2, 0));
        }
        this.f2673k = typedArrayM56u.getColor(4, 0);
        this.f2674l = AbstractC0126ct.m816n(context2, typedArrayM56u, 5);
        this.f2668f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0421kr c0421kr = new C0421kr(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f2667e = c0421kr;
        c0421kr.f2944y = true;
        c0421kr.f2945z.setFocusable(true);
        c0421kr.f2934o = this;
        c0421kr.f2945z.setInputMethodMode(2);
        c0421kr.mo1714n(getAdapter());
        c0421kr.f2935p = new C0621q4(1, this);
        if (typedArrayM56u.hasValue(6)) {
            setSimpleItems(typedArrayM56u.getResourceId(6, 0));
        }
        typedArrayM56u.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m1607a(C0386jt c0386jt, Object obj) {
        c0386jt.setText(c0386jt.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m1608b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f2668f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f2667e.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f2672j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM1608b = m1608b();
        return (textInputLayoutM1608b == null || !textInputLayoutM1608b.f1179E) ? super.getHint() : textInputLayoutM1608b.getHint();
    }

    public float getPopupElevation() {
        return this.f2671i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f2673k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f2674l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM1608b = m1608b();
        if (textInputLayoutM1608b != null && textInputLayoutM1608b.f1179E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2667e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM1608b = m1608b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM1608b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0421kr c0421kr = this.f2667e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0421kr.f2945z.isShowing() ? -1 : c0421kr.f2922c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM1608b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0421kr.f2945z.getBackground();
                if (background != null) {
                    Rect rect = this.f2669g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM1608b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.f2668f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f2667e.mo1714n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0421kr c0421kr = this.f2667e;
        if (c0421kr != null) {
            c0421kr.m1712l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f2672j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0200eu) {
            ((C0200eu) dropDownBackground).m1085j(this.f2672j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f2667e.f2936q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM1608b = m1608b();
        if (textInputLayoutM1608b != null) {
            textInputLayoutM1608b.m785s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f2673k = i;
        if (getAdapter() instanceof C0310ht) {
            ((C0310ht) getAdapter()).m1373a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f2674l = colorStateList;
        if (getAdapter() instanceof C0310ht) {
            ((C0310ht) getAdapter()).m1373a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f2668f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f2667e.mo1708f();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0310ht(this, getContext(), this.f2670h, strArr));
    }
}
