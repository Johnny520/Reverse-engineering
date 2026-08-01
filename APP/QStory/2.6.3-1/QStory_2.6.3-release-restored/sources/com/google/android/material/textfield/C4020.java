package com.google.android.material.textfield;

import android.R;
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
import androidx.appcompat.widget.C0965;
import androidx.appcompat.widget.C0981;
import androidx.appcompat.widget.C1029;
import androidx.appcompat.widget.C1039;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import java.util.List;
import java.util.Locale;
import p191.AbstractC8568;
import p284.AbstractC9096;
import p321.C9472;
import p330.AbstractC9490;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4020 extends C1039 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public ColorStateList f11079;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f11080;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public ColorStateList f11081;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float f11082;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1029 f11083;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Rect f11084;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f11085;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AccessibilityManager f11086;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int[] f11087;

    public C4020(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f11087 = new int[]{R.attr.state_selected};
        this.f11084 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(context2, attributeSet, AbstractC9490.f24789, C0328R.attr.autoCompleteTextViewStyle, 605226016, new int[0]);
        if (typedArrayM7741.hasValue(0) && typedArrayM7741.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f11085 = typedArrayM7741.getResourceId(3, C0328R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.f11082 = typedArrayM7741.getDimensionPixelOffset(1, C0328R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM7741.hasValue(2)) {
            this.f11081 = ColorStateList.valueOf(typedArrayM7741.getColor(2, 0));
        }
        this.f11080 = typedArrayM7741.getColor(4, 0);
        this.f11079 = AbstractC8568.m13632(context2, typedArrayM7741, 5);
        this.f11086 = (AccessibilityManager) context2.getSystemService("accessibility");
        C1029 c1029 = new C1029(context2, null, C0328R.attr.listPopupWindowStyle, 0);
        this.f11083 = c1029;
        c1029.f1057 = true;
        C0981 c0981 = c1029.f1054;
        c0981.setFocusable(true);
        c1029.f1059 = this;
        c0981.setInputMethodMode(2);
        c1029.mo1074(getAdapter());
        c1029.setOnItemClickListener(new C0965(this, i));
        if (typedArrayM7741.hasValue(6)) {
            setSimpleItems(typedArrayM7741.getResourceId(6, 0));
        }
        typedArrayM7741.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m7807()) {
            this.f11083.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f11081;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM7808 = m7808();
        return (textInputLayoutM7808 == null || !textInputLayoutM7808.f10934) ? super.getHint() : textInputLayoutM7808.getHint();
    }

    public float getPopupElevation() {
        return this.f11082;
    }

    public int getSimpleItemSelectedColor() {
        return this.f11080;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f11079;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        C1029 c1029 = this.f11083;
        if (c1029 == null || !c1029.f1054.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM7808 = m7808();
        if (textInputLayoutM7808 != null && textInputLayoutM7808.f10934 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11083.dismiss();
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
        TextInputLayout textInputLayoutM7808 = m7808();
        if (textInputLayoutM7808 != null) {
            textInputLayoutM7808.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM7808 = m7808();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM7808 != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1029 c1029 = this.f11083;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c1029.f1054.isShowing() ? -1 : c1029.f1078.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM7808);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c1029.f1054.getBackground();
                if (background != null) {
                    Rect rect = this.f11084;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM7808.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m7807()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f11083.mo1074(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1029 c1029 = this.f11083;
        if (c1029 != null) {
            c1029.m1209(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f11081 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C9472) {
            ((C9472) dropDownBackground).m14900(this.f11081);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f11083.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM7808 = m7808();
        if (textInputLayoutM7808 != null) {
            textInputLayoutM7808.m7765();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f11080 = i;
        if (getAdapter() instanceof C4016) {
            ((C4016) getAdapter()).m7790();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f11079 = colorStateList;
        if (getAdapter() instanceof C4016) {
            ((C4016) getAdapter()).m7790();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C4016(this, getContext(), this.f11085, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m7807()) {
            this.f11083.show();
        } else {
            super.showDropDown();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m7807() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f11086;
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
    public final TextInputLayout m7808() {
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
