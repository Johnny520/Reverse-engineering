package com.google.android.material.textfield;

import Yue.C3277;
import Yue.C4520;
import Yue.C5726;
import Yue.C8273;
import Yue.InterfaceC3397;
import Yue.InterfaceC3897;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
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
import com.google.android.material.C1980R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends C3277 {
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final String SWITCH_ACCESS_ACTIVITY_NAME = "SwitchAccess";

    @InterfaceC6490
    private final AccessibilityManager accessibilityManager;

    @InterfaceC6490
    private ColorStateList dropDownBackgroundTint;

    @InterfaceC6391
    private final C5726 modalListPopup;
    private final float popupElevation;

    @InterfaceC5683
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;

    @InterfaceC6490
    private ColorStateList simpleItemSelectedRippleColor;

    @InterfaceC6391
    private final Rect tempRect;

    public class MaterialArrayAdapter<T> extends ArrayAdapter<String> {

        @InterfaceC6490
        private ColorStateList pressedRippleColor;

        @InterfaceC6490
        private ColorStateList selectedItemRippleOverlaidColor;

        public MaterialArrayAdapter(@InterfaceC6391 Context context, int i, @InterfaceC6391 String[] strArr) {
            super(context, i, strArr);
            updateSelectedItemColorStateList();
        }

        @InterfaceC6490
        private ColorStateList createItemSelectedColorStateList() {
            if (!hasSelectedColor() || !hasSelectedRippleColor()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{MaterialColors.layer(MaterialAutoCompleteTextView.this.simpleItemSelectedColor, colorForState), MaterialColors.layer(MaterialAutoCompleteTextView.this.simpleItemSelectedColor, colorForState2), MaterialAutoCompleteTextView.this.simpleItemSelectedColor});
        }

        @InterfaceC6490
        private Drawable getSelectedItemDrawable() {
            if (!hasSelectedColor()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.simpleItemSelectedColor);
            if (this.pressedRippleColor == null) {
                return colorDrawable;
            }
            C4520.m13236(colorDrawable, this.selectedItemRippleOverlaidColor);
            return new RippleDrawable(this.pressedRippleColor, colorDrawable, null);
        }

        private boolean hasSelectedColor() {
            return MaterialAutoCompleteTextView.this.simpleItemSelectedColor != 0;
        }

        private boolean hasSelectedRippleColor() {
            return MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor != null;
        }

        private ColorStateList sanitizeDropdownItemSelectedRippleColor() {
            if (!hasSelectedRippleColor()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0), 0});
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, @InterfaceC6490 View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C8273.m27447(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? getSelectedItemDrawable() : null);
            }
            return view2;
        }

        public void updateSelectedItemColorStateList() {
            this.pressedRippleColor = sanitizeDropdownItemSelectedRippleColor();
            this.selectedItemRippleOverlaidColor = createItemSelectedColorStateList();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialAutoCompleteTextView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6490
    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean isPopupRequired() {
        return isTouchExplorationEnabled() || isSwitchAccessEnabled();
    }

    private boolean isSwitchAccessEnabled() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains(SWITCH_ACCESS_ACTIVITY_NAME)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTouchExplorationEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i = 0;
        if (adapter == null || textInputLayoutFindTextInputLayoutAncestor == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.modalListPopup.m17756()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutFindTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableM17739 = this.modalListPopup.m17739();
        if (drawableM17739 != null) {
            drawableM17739.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutFindTextInputLayoutAncestor.getEndIconView().getMeasuredWidth();
    }

    private void onInputTypeChanged() {
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null) {
            textInputLayoutFindTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (isPopupRequired()) {
            this.modalListPopup.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @InterfaceC6490
    public ColorStateList getDropDownBackgroundTintList() {
        return this.dropDownBackgroundTint;
    }

    @Override // android.widget.TextView
    @InterfaceC6490
    public CharSequence getHint() {
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        return (textInputLayoutFindTextInputLayoutAncestor == null || !textInputLayoutFindTextInputLayoutAncestor.isProvidingHint()) ? super.getHint() : textInputLayoutFindTextInputLayoutAncestor.getHint();
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    @InterfaceC6490
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutFindTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (textInputLayoutFindTextInputLayoutAncestor != null && textInputLayoutFindTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (isPopupRequired()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@InterfaceC6490 T t) {
        super.setAdapter(t);
        this.modalListPopup.mo6805(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C5726 c5726 = this.modalListPopup;
        if (c5726 != null) {
            c5726.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(@InterfaceC3897 int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.dropDownBackgroundTint = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).setFillColor(this.dropDownBackgroundTint);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@InterfaceC6490 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.m17783(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        onInputTypeChanged();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.simpleItemSelectedColor = i;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    public void setSimpleItemSelectedRippleColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof MaterialArrayAdapter) {
            ((MaterialArrayAdapter) getAdapter()).updateSelectedItemColorStateList();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSimpleItems(@InterfaceC3397 int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (isPopupRequired()) {
            this.modalListPopup.show();
        } else {
            super.showDropDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialAutoCompleteTextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.autoCompleteTextViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSimpleItems(@InterfaceC6391 String[] strArr) {
        setAdapter(new MaterialArrayAdapter(getContext(), this.simpleItemLayout, strArr));
    }

    public MaterialAutoCompleteTextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, 0), attributeSet, i);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.MaterialAutoCompleteTextView, i, C1980R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayObtainStyledAttributes.getInt(C1980R.styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, C1980R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.MaterialAutoCompleteTextView_android_popupElevation, C1980R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.dropDownBackgroundTint = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(C1980R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.simpleItemSelectedColor = typedArrayObtainStyledAttributes.getColor(C1980R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.simpleItemSelectedRippleColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        C5726 c5726 = new C5726(context2);
        this.modalListPopup = c5726;
        c5726.m17780(true);
        c5726.m17769(this);
        c5726.m17777(2);
        c5726.mo6805(getAdapter());
        c5726.m17782(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.textfield.MaterialAutoCompleteTextView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                MaterialAutoCompleteTextView.this.updateText(i2 < 0 ? materialAutoCompleteTextView.modalListPopup.m17754() : materialAutoCompleteTextView.getAdapter().getItem(i2));
                AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        view = MaterialAutoCompleteTextView.this.modalListPopup.m17757();
                        i2 = MaterialAutoCompleteTextView.this.modalListPopup.m17756();
                        j = MaterialAutoCompleteTextView.this.modalListPopup.m17755();
                    }
                    onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.modalListPopup.mo17740(), view, i2, j);
                }
                MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
            }
        });
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
