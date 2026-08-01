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

/* JADX INFO: renamed from: nt */
/* JADX INFO: loaded from: classes.dex */
public final class C0534nt extends C0766u2 {

    /* JADX INFO: renamed from: e */
    public final C0569or f3340e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f3341f;

    /* JADX INFO: renamed from: g */
    public final Rect f3342g;

    /* JADX INFO: renamed from: h */
    public final int f3343h;

    /* JADX INFO: renamed from: i */
    public final float f3344i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f3345j;

    /* JADX INFO: renamed from: k */
    public int f3346k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f3347l;

    public C0534nt(Context context, AttributeSet attributeSet) {
        super(AbstractC0259gf.m1245c0(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f3342g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM1170A = g80.m1170A(context2, attributeSet, AbstractC0168dz.f1446i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM1170A.hasValue(0) && typedArrayM1170A.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f3343h = typedArrayM1170A.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f3344i = typedArrayM1170A.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM1170A.hasValue(2)) {
            this.f3345j = ColorStateList.valueOf(typedArrayM1170A.getColor(2, 0));
        }
        this.f3346k = typedArrayM1170A.getColor(4, 0);
        this.f3347l = AbstractC0274gu.m1315i(context2, typedArrayM1170A, 5);
        this.f3341f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0569or c0569or = new C0569or(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f3340e = c0569or;
        c0569or.f3541y = true;
        c0569or.f3542z.setFocusable(true);
        c0569or.f3531o = this;
        c0569or.f3542z.setInputMethodMode(2);
        c0569or.mo1982n(getAdapter());
        c0569or.f3532p = new C0620q4(1, this);
        if (typedArrayM1170A.hasValue(6)) {
            setSimpleItems(typedArrayM1170A.getResourceId(6, 0));
        }
        typedArrayM1170A.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m1959a(C0534nt c0534nt, Object obj) {
        c0534nt.setText(c0534nt.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m1960b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f3341f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.f3340e.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f3345j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM1960b = m1960b();
        return (textInputLayoutM1960b == null || !textInputLayoutM1960b.f1104E) ? super.getHint() : textInputLayoutM1960b.getHint();
    }

    public float getPopupElevation() {
        return this.f3344i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f3346k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f3347l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM1960b = m1960b();
        if (textInputLayoutM1960b != null && textInputLayoutM1960b.f1104E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3340e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM1960b = m1960b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM1960b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0569or c0569or = this.f3340e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0569or.f3542z.isShowing() ? -1 : c0569or.f3519c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM1960b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0569or.f3542z.getBackground();
                if (background != null) {
                    Rect rect = this.f3342g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM1960b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.f3341f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f3340e.mo1982n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0569or c0569or = this.f3340e;
        if (c0569or != null) {
            c0569or.m2056l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f3345j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0350iu) {
            ((C0350iu) dropDownBackground).m1537j(this.f3345j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f3340e.f3533q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM1960b = m1960b();
        if (textInputLayoutM1960b != null) {
            textInputLayoutM1960b.m743s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f3346k = i;
        if (getAdapter() instanceof C0497mt) {
            ((C0497mt) getAdapter()).m1880a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f3347l = colorStateList;
        if (getAdapter() instanceof C0497mt) {
            ((C0497mt) getAdapter()).m1880a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f3341f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f3340e.mo976f();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0497mt(this, getContext(), this.f3343h, strArr));
    }
}
