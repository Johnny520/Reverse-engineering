package p000;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1394f4 extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f4948i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C1349e3 f4949a;

    /* JADX INFO: renamed from: b */
    public final Context f4950b;

    /* JADX INFO: renamed from: c */
    public final C0906V3 f4951c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f4952d;

    /* JADX INFO: renamed from: e */
    public final boolean f4953e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1350e4 f4954f;

    /* JADX INFO: renamed from: g */
    public int f4955g;

    /* JADX INFO: renamed from: h */
    public final Rect f4956h;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1394f4(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, io.github.cherrywechat.R.attr.spinnerStyle);
        this.f4956h = new Rect();
        AbstractC1042YA.m1987a(getContext(), this);
        int[] iArr = AbstractC0982Wu.f3086u;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, io.github.cherrywechat.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
        this.f4949a = new C1349e3(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f4950b = new C0147Db(context, resourceId);
        } else {
            this.f4950b = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4948i, io.github.cherrywechat.R.attr.spinnerStyle, 0);
        } catch (Exception unused) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                i = typedArrayObtainStyledAttributes.getInt(0, 0);
            }
        } catch (Exception unused2) {
            if (typedArrayObtainStyledAttributes != null) {
            }
            if (i != 0) {
            }
            textArray = typedArray.getTextArray(0);
            if (textArray != null) {
            }
            c2656w4M5186A.m5195E();
            this.f4953e = true;
            spinnerAdapter = this.f4952d;
            if (spinnerAdapter != null) {
            }
            this.f4949a.m2603d(attributeSet, io.github.cherrywechat.R.attr.spinnerStyle);
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = typedArrayObtainStyledAttributes;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            DialogInterfaceOnClickListenerC1035Y3 dialogInterfaceOnClickListenerC1035Y3 = new DialogInterfaceOnClickListenerC1035Y3(this);
            this.f4954f = dialogInterfaceOnClickListenerC1035Y3;
            dialogInterfaceOnClickListenerC1035Y3.f3306c = typedArray.getString(2);
        } else if (i == 1) {
            C1245c4 c1245c4 = new C1245c4(this, this.f4950b, attributeSet);
            C2656w4 c2656w4M5186A2 = C2656w4.m5186A(this.f4950b, attributeSet, iArr, io.github.cherrywechat.R.attr.spinnerStyle);
            this.f4955g = ((TypedArray) c2656w4M5186A2.f9196b).getLayoutDimension(3, -2);
            c1245c4.m579g(c2656w4M5186A2.m5210q(1));
            c1245c4.f4232C = typedArray.getString(2);
            c2656w4M5186A2.m5195E();
            this.f4954f = c1245c4;
            this.f4951c = new C0906V3(this, this, c1245c4);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(io.github.cherrywechat.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        c2656w4M5186A.m5195E();
        this.f4953e = true;
        spinnerAdapter = this.f4952d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f4952d = null;
        }
        this.f4949a.m2603d(attributeSet, io.github.cherrywechat.R.attr.spinnerStyle);
    }

    /* JADX INFO: renamed from: a */
    public final int m2672a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        Rect rect = this.f4956h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            c1349e3.m2600a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        return interfaceC1350e4 != null ? interfaceC1350e4.mo1972b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        return interfaceC1350e4 != null ? interfaceC1350e4.mo1980n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4954f != null ? this.f4955g : super.getDropDownWidth();
    }

    public final InterfaceC1350e4 getInternalPopup() {
        return this.f4954f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        return interfaceC1350e4 != null ? interfaceC1350e4.mo1973d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4950b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        return interfaceC1350e4 != null ? interfaceC1350e4.mo1981o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            return c1349e3.m2601b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            return c1349e3.m2602c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 == null || !interfaceC1350e4.mo1971a()) {
            return;
        }
        interfaceC1350e4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4954f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2672a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1307d4 c1307d4 = (C1307d4) parcelable;
        super.onRestoreInstanceState(c1307d4.getSuperState());
        if (!c1307d4.f4757a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0949W3(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1307d4 c1307d4 = new C1307d4(super.onSaveInstanceState());
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        c1307d4.f4757a = interfaceC1350e4 != null && interfaceC1350e4.mo1971a();
        return c1307d4;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0906V3 c0906v3 = this.f4951c;
        if (c0906v3 == null || !c0906v3.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 == null) {
            return super.performClick();
        }
        if (interfaceC1350e4.mo1971a()) {
            return true;
        }
        interfaceC1350e4.mo1979m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            c1349e3.m2604e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            c1349e3.m2605f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1350e4.mo1977k(i);
            interfaceC1350e4.mo1978l(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 != null) {
            interfaceC1350e4.mo1976j(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f4954f != null) {
            this.f4955g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 != null) {
            interfaceC1350e4.mo1975g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC1406fG.m2695U(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 != null) {
            interfaceC1350e4.mo1974f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            c1349e3.m2607h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1349e3 c1349e3 = this.f4949a;
        if (c1349e3 != null) {
            c1349e3.m2608i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4953e) {
            this.f4952d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1350e4 interfaceC1350e4 = this.f4954f;
        if (interfaceC1350e4 != null) {
            Context context = this.f4950b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1078Z3 c1078z3 = new C1078Z3();
            c1078z3.f3442a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1078z3.f3443b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0992X3.m1882a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1350e4.mo584p(c1078z3);
        }
    }
}
