package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0805v4 extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f4888i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C0803v2 f4889a;

    /* JADX INFO: renamed from: b */
    public final Context f4890b;

    /* JADX INFO: renamed from: c */
    public final C0361j4 f4891c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f4892d;

    /* JADX INFO: renamed from: e */
    public final boolean f4893e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0768u4 f4894f;

    /* JADX INFO: renamed from: g */
    public int f4895g;

    /* JADX INFO: renamed from: h */
    public final Rect f4896h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0805v4(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0805v4.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: renamed from: a */
    public final int m2542a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        Rect rect = this.f4896h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            c0803v2.m2533a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        return interfaceC0768u4 != null ? interfaceC0768u4.mo1974d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        return interfaceC0768u4 != null ? interfaceC0768u4.mo1976g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4894f != null ? this.f4895g : super.getDropDownWidth();
    }

    public final InterfaceC0768u4 getInternalPopup() {
        return this.f4894f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        return interfaceC0768u4 != null ? interfaceC0768u4.mo1977h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4890b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        return interfaceC0768u4 != null ? interfaceC0768u4.mo1978i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            return c0803v2.m2534b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            return c0803v2.m2535c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 == null || !interfaceC0768u4.mo1972b()) {
            return;
        }
        interfaceC0768u4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4894f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2542a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0731t4 c0731t4 = (C0731t4) parcelable;
        super.onRestoreInstanceState(c0731t4.getSuperState());
        if (!c0731t4.f4400a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0398k4(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0731t4 c0731t4 = new C0731t4(super.onSaveInstanceState());
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        c0731t4.f4400a = interfaceC0768u4 != null && interfaceC0768u4.mo1972b();
        return c0731t4;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0361j4 c0361j4 = this.f4891c;
        if (c0361j4 == null || !c0361j4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 == null) {
            return super.performClick();
        }
        if (interfaceC0768u4.mo1972b()) {
            return true;
        }
        interfaceC0768u4.mo1975e(AbstractC0472m4.m1804b(this), AbstractC0472m4.m1803a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            c0803v2.m2537e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            c0803v2.m2538f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC0768u4.mo1983o(i);
            interfaceC0768u4.mo1973c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 != null) {
            interfaceC0768u4.mo1981m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f4894f != null) {
            this.f4895g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 != null) {
            interfaceC0768u4.mo1980l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0259gf.m1261w(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 != null) {
            interfaceC0768u4.mo1979k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            c0803v2.m2540h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0803v2 c0803v2 = this.f4889a;
        if (c0803v2 != null) {
            c0803v2.m2541i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4893e) {
            this.f4892d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0768u4 interfaceC0768u4 = this.f4894f;
        if (interfaceC0768u4 != null) {
            Context context = this.f4890b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0583p4 c0583p4 = new C0583p4();
            c0583p4.f3580a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0583p4.f3581b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0509n4.m1911a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0768u4.mo1982n(c0583p4);
        }
    }
}
