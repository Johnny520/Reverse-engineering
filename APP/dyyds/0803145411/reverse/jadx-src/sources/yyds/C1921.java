package yyds;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: yyds.ᲀᛱᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1921 extends Spinner {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final int[] f9672 = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1710 f9673;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f9674;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1803 f9675;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final boolean f9676;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Rect f9677;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1231 f9678;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public SpinnerAdapter f9679;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Context f9680;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1921(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.spinnerStyle);
        this.f9677 = new Rect();
        AbstractC2251.m4251(getContext(), this);
        int[] iArr = AbstractC1592.f8103;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, com.p000ss.android.ugc.aweme.yyds.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        this.f9678 = new C1231(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f9680 = new C0586(context, resourceId);
        } else {
            this.f9680 = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9672, com.p000ss.android.ugc.aweme.yyds.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                    }
                    c0644M1535.m1568();
                    this.f9676 = true;
                    spinnerAdapter = this.f9679;
                    if (spinnerAdapter != null) {
                    }
                    this.f9678.m2518(attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC1295 dialogInterfaceOnClickListenerC1295 = new DialogInterfaceOnClickListenerC1295(this);
            this.f9673 = dialogInterfaceOnClickListenerC1295;
            dialogInterfaceOnClickListenerC1295.f5944 = typedArray.getString(2);
        } else if (i == 1) {
            C2600 c2600 = new C2600(this, this.f9680, attributeSet);
            C0644 c0644M15352 = C0644.m1535(this.f9680, attributeSet, iArr, com.p000ss.android.ugc.aweme.yyds.R.attr.spinnerStyle);
            this.f9674 = ((TypedArray) c0644M15352.f3099).getLayoutDimension(3, -2);
            c2600.m4369(c0644M15352.m1554(1));
            c2600.f12798 = typedArray.getString(2);
            c0644M15352.m1568();
            this.f9673 = c2600;
            this.f9675 = new C1803(this, this, c2600);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.p000ss.android.ugc.aweme.yyds.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c0644M1535.m1568();
        this.f9676 = true;
        spinnerAdapter = this.f9679;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f9679 = null;
        }
        this.f9678.m2518(attributeSet, com.p000ss.android.ugc.aweme.yyds.R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            c1231.m2510();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1710 interfaceC1710 = this.f9673;
        return interfaceC1710 != null ? interfaceC1710.mo2575() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1710 interfaceC1710 = this.f9673;
        return interfaceC1710 != null ? interfaceC1710.mo2577() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f9673 != null ? this.f9674 : super.getDropDownWidth();
    }

    public final InterfaceC1710 getInternalPopup() {
        return this.f9673;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1710 interfaceC1710 = this.f9673;
        return interfaceC1710 != null ? interfaceC1710.mo2579() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9680;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1710 interfaceC1710 = this.f9673;
        return interfaceC1710 != null ? interfaceC1710.mo2571() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            return c1231.m2506();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            return c1231.m2508();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 == null || !interfaceC1710.mo2574()) {
            return;
        }
        interfaceC1710.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f9673 == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m3713(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1752 c1752 = (C1752) parcelable;
        super.onRestoreInstanceState(c1752.getSuperState());
        if (!c1752.f8815 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0562(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1752 c1752 = new C1752(super.onSaveInstanceState());
        InterfaceC1710 interfaceC1710 = this.f9673;
        c1752.f8815 = interfaceC1710 != null && interfaceC1710.mo2574();
        return c1752;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1803 c1803 = this.f9675;
        if (c1803 == null || !c1803.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 == null) {
            return super.performClick();
        }
        if (interfaceC1710.mo2574()) {
            return true;
        }
        interfaceC1710.mo2576(AbstractC0162.m728(this), AbstractC0162.m727(this));
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9676) {
            this.f9679 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 != null) {
            Context context = this.f9680;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0223 c0223 = new C0223();
            c0223.f1239 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0223.f1240 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1973.m3803((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1710.mo2569(c0223);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            c1231.m2507();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            c1231.m2505(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1710.mo2572(i);
            interfaceC1710.mo2578(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 != null) {
            interfaceC1710.mo2570(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f9673 != null) {
            this.f9674 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 != null) {
            interfaceC1710.mo2573(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC1367.m2767(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1710 interfaceC1710 = this.f9673;
        if (interfaceC1710 != null) {
            interfaceC1710.mo2580(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            c1231.m2511(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1231 c1231 = this.f9678;
        if (c1231 != null) {
            c1231.m2517(mode);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m3713(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f9677;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }
}
