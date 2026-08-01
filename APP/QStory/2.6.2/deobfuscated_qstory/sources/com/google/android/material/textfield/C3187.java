package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0118;
import androidx.appcompat.widget.C0134;
import androidx.appcompat.widget.C0182;
import androidx.appcompat.widget.C0192;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3159;
import java.util.List;
import java.util.Locale;
import p253.AbstractC8189;
import p268.AbstractC8266;
import p305.C8651;
import p314.AbstractC8669;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3187 extends C0192 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public ColorStateList f10729;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f10730;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f10731;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float f10732;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0182 f10733;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Rect f10734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f10735;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AccessibilityManager f10736;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int[] f10737;

    public C3187(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f10737 = new int[]{android.R.attr.state_selected};
        this.f10734 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(context2, attributeSet, AbstractC8669.f24453, R.attr.autoCompleteTextViewStyle, 605226016, new int[0]);
        if (typedArrayM7195.hasValue(0) && typedArrayM7195.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f10735 = typedArrayM7195.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.f10732 = typedArrayM7195.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM7195.hasValue(2)) {
            this.f10731 = ColorStateList.valueOf(typedArrayM7195.getColor(2, 0));
        }
        this.f10730 = typedArrayM7195.getColor(4, 0);
        this.f10729 = AbstractC8189.m13678(context2, typedArrayM7195, 5);
        this.f10736 = (AccessibilityManager) context2.getSystemService("accessibility");
        C0182 c0182 = new C0182(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f10733 = c0182;
        c0182.f712 = true;
        C0134 c0134 = c0182.f709;
        c0134.setFocusable(true);
        c0182.f714 = this;
        c0134.setInputMethodMode(2);
        c0182.mo513(getAdapter());
        c0182.setOnItemClickListener(new C0118(this, i));
        if (typedArrayM7195.hasValue(6)) {
            setSimpleItems(typedArrayM7195.getResourceId(6, 0));
        }
        typedArrayM7195.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m7261()) {
            this.f10733.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f10731;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM7262 = m7262();
        return (textInputLayoutM7262 == null || !textInputLayoutM7262.f10584) ? super.getHint() : textInputLayoutM7262.getHint();
    }

    public float getPopupElevation() {
        return this.f10732;
    }

    public int getSimpleItemSelectedColor() {
        return this.f10730;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f10729;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        C0182 c0182 = this.f10733;
        if (c0182 == null || !c0182.f709.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM7262 = m7262();
        if (textInputLayoutM7262 != null && textInputLayoutM7262.f10584 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10733.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout textInputLayoutM7262 = m7262();
        if (textInputLayoutM7262 != null) {
            textInputLayoutM7262.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM7262 = m7262();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM7262 != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0182 c0182 = this.f10733;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0182.f709.isShowing() ? -1 : c0182.f733.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM7262);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0182.f709.getBackground();
                if (background != null) {
                    Rect rect = this.f10734;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM7262.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m7261()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f10733.mo513(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0182 c0182 = this.f10733;
        if (c0182 != null) {
            c0182.m648(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f10731 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C8651) {
            ((C8651) dropDownBackground).m14323(this.f10731);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f10733.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM7262 = m7262();
        if (textInputLayoutM7262 != null) {
            textInputLayoutM7262.m7219();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f10730 = i;
        if (getAdapter() instanceof C3183) {
            ((C3183) getAdapter()).m7244();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f10729 = colorStateList;
        if (getAdapter() instanceof C3183) {
            ((C3183) getAdapter()).m7244();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C3183(this, getContext(), this.f10735, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m7261()) {
            this.f10733.show();
        } else {
            super.showDropDown();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7261() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f10736;
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextInputLayout m7262() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
