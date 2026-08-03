package p000a;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.C0983R;
import com.google.android.material.C1247R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.Ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0030Ba extends C0093F0 {

    /* JADX INFO: renamed from: e */
    public final C0102F9 f108e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f109f;

    /* JADX INFO: renamed from: g */
    public final Rect f110g;

    /* JADX INFO: renamed from: h */
    public final int f111h;

    /* JADX INFO: renamed from: i */
    public final float f112i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f113j;

    /* JADX INFO: renamed from: k */
    public int f114k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f115l;

    /* JADX INFO: renamed from: a.Ba$a */
    public class a<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a */
        public ColorStateList f116a;

        /* JADX INFO: renamed from: b */
        public ColorStateList f117b;

        public a(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            m91b();
        }

        /* JADX INFO: renamed from: b */
        public final void m91b() {
            ColorStateList colorStateList;
            C0030Ba c0030Ba = C0030Ba.this;
            ColorStateList colorStateList2 = c0030Ba.f115l;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f117b = colorStateList;
            if (c0030Ba.f114k != 0 && c0030Ba.f115l != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C0872v3.m2084b(c0030Ba.f115l.getColorForState(iArr3, 0), c0030Ba.f114k), C0872v3.m2084b(c0030Ba.f115l.getColorForState(iArr2, 0), c0030Ba.f114k), c0030Ba.f114k});
            }
            this.f116a = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C0030Ba c0030Ba = C0030Ba.this;
                Drawable rippleDrawable = null;
                if (c0030Ba.getText().toString().contentEquals(textView.getText()) && c0030Ba.f114k != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(c0030Ba.f114k);
                    if (this.f117b != null) {
                        C0893w5.a.m2176h(colorDrawable, this.f116a);
                        rippleDrawable = new RippleDrawable(this.f117b, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0030Ba(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.autoCompleteTextViewStyle;
        super(C0408Wa.m1054a(context, attributeSet, i, 0), attributeSet, i);
        this.f110g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM1301d = C0523cf.m1301d(context2, attributeSet, C1247R.styleable.MaterialAutoCompleteTextView, i, C1247R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayM1301d.getInt(C1247R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f111h = typedArrayM1301d.getResourceId(C1247R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, C1247R.layout.mtrl_auto_complete_simple_item);
        this.f112i = typedArrayM1301d.getDimensionPixelOffset(C1247R.styleable.MaterialAutoCompleteTextView_android_popupElevation, C1247R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.f113j = ColorStateList.valueOf(typedArrayM1301d.getColor(C1247R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.f114k = typedArrayM1301d.getColor(C1247R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f115l = C0336Sa.m925b(context2, typedArrayM1301d, C1247R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f109f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0102F9 c0102f9 = new C0102F9(context2, null, C0983R.attr.listPopupWindowStyle);
        this.f108e = c0102f9;
        c0102f9.f352y = true;
        c0102f9.f353z.setFocusable(true);
        c0102f9.f342o = this;
        c0102f9.f353z.setInputMethodMode(2);
        c0102f9.mo285o(getAdapter());
        c0102f9.f343p = new C0011Aa(this);
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayM1301d.getResourceId(C1247R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayM1301d.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m88a(C0030Ba c0030Ba, Object obj) {
        c0030Ba.setText(c0030Ba.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m89b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f109f;
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
        if (m90c()) {
            this.f108e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f113j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM89b = m89b();
        return (textInputLayoutM89b == null || !textInputLayoutM89b.f5885E) ? super.getHint() : textInputLayoutM89b.getHint();
    }

    public float getPopupElevation() {
        return this.f112i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f114k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f115l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM89b = m89b();
        if (textInputLayoutM89b != null && textInputLayoutM89b.f5885E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f108e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM89b = m89b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM89b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0102F9 c0102f9 = this.f108e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0102f9.f353z.isShowing() ? -1 : c0102f9.f330c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM89b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c0102f9.f353z.getBackground();
                if (background != null) {
                    Rect rect = this.f110g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM89b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m90c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f108e.mo285o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0102F9 c0102f9 = this.f108e;
        if (c0102f9 != null) {
            c0102f9.m283m(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f113j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0354Ta) {
            ((C0354Ta) dropDownBackground).m967k(this.f113j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f108e.f344q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM89b = m89b();
        if (textInputLayoutM89b != null) {
            textInputLayoutM89b.m3274s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f114k = i;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).m91b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f115l = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).m91b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m90c()) {
            this.f108e.mo279f();
        } else {
            super.showDropDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f111h, strArr));
    }
}
