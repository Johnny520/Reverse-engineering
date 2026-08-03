package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
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
import io.github.cherrywechat.R;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: Bq */
/* JADX INFO: loaded from: classes.dex */
public final class C0076Bq extends C1306d3 {

    /* JADX INFO: renamed from: e */
    public final C0289Go f177e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f178f;

    /* JADX INFO: renamed from: g */
    public final Rect f179g;

    /* JADX INFO: renamed from: h */
    public final int f180h;

    /* JADX INFO: renamed from: i */
    public final float f181i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f182j;

    /* JADX INFO: renamed from: k */
    public int f183k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f184l;

    public C0076Bq(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m291y(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f179g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context2, attributeSet, AbstractC0939Vu.f2940i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM2534G.hasValue(0) && typedArrayM2534G.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f180h = typedArrayM2534G.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f181i = typedArrayM2534G.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM2534G.hasValue(2)) {
            this.f182j = ColorStateList.valueOf(typedArrayM2534G.getColor(2, 0));
        }
        this.f183k = typedArrayM2534G.getColor(4, 0);
        this.f184l = AbstractC0828TB.m1643j(context2, typedArrayM2534G, 5);
        this.f178f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0289Go c0289Go = new C0289Go(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f177e = c0289Go;
        c0289Go.f961y = true;
        c0289Go.f962z.setFocusable(true);
        c0289Go.f951o = this;
        c0289Go.f962z.setInputMethodMode(2);
        c0289Go.mo584p(getAdapter());
        c0289Go.f952p = new C1122a4(1, this);
        if (typedArrayM2534G.hasValue(6)) {
            setSimpleItems(typedArrayM2534G.getResourceId(6, 0));
        }
        typedArrayM2534G.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m126b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m127c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f178f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m127c()) {
            this.f177e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f182j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM126b = m126b();
        return (textInputLayoutM126b == null || !textInputLayoutM126b.f4599F) ? super.getHint() : textInputLayoutM126b.getHint();
    }

    public float getPopupElevation() {
        return this.f181i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f183k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f184l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM126b = m126b();
        if (textInputLayoutM126b != null && textInputLayoutM126b.f4599F && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f177e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM126b = m126b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM126b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0289Go c0289Go = this.f177e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0289Go.f962z.isShowing() ? -1 : c0289Go.f939c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM126b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0289Go.f962z.getBackground();
                if (background != null) {
                    Rect rect = this.f179g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM126b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m127c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f177e.mo584p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0289Go c0289Go = this.f177e;
        if (c0289Go != null) {
            c0289Go.m579g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f182j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C1021Xq) {
            ((C1021Xq) dropDownBackground).m1928n(this.f182j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f177e.f953q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM126b = m126b();
        if (textInputLayoutM126b != null) {
            textInputLayoutM126b.m2493u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f183k = i;
        if (getAdapter() instanceof C0033Aq) {
            ((C0033Aq) getAdapter()).m56a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f184l = colorStateList;
        if (getAdapter() instanceof C0033Aq) {
            ((C0033Aq) getAdapter()).m56a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m127c()) {
            this.f177e.mo577c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0033Aq(this, getContext(), this.f180h, strArr));
    }
}
