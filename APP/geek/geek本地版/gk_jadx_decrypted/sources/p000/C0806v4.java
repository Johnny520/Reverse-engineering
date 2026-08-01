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
public final class C0806v4 extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f4798i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C0804v2 f4799a;

    /* JADX INFO: renamed from: b */
    public final Context f4800b;

    /* JADX INFO: renamed from: c */
    public final C0361j4 f4801c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f4802d;

    /* JADX INFO: renamed from: e */
    public final boolean f4803e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0769u4 f4804f;

    /* JADX INFO: renamed from: g */
    public int f4805g;

    /* JADX INFO: renamed from: h */
    public final Rect f4806h;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0806v4(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0806v4.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: renamed from: a */
    public final int m2488a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        Rect rect = this.f4806h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            c0804v2.m2479a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        return interfaceC0769u4 != null ? interfaceC0769u4.mo1991d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        return interfaceC0769u4 != null ? interfaceC0769u4.mo1993g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f4804f != null ? this.f4805g : super.getDropDownWidth();
    }

    public final InterfaceC0769u4 getInternalPopup() {
        return this.f4804f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        return interfaceC0769u4 != null ? interfaceC0769u4.mo1994h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4800b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        return interfaceC0769u4 != null ? interfaceC0769u4.mo1995i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            return c0804v2.m2480b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            return c0804v2.m2481c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 == null || !interfaceC0769u4.mo1989b()) {
            return;
        }
        interfaceC0769u4.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4804f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2488a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0732t4 c0732t4 = (C0732t4) parcelable;
        super.onRestoreInstanceState(c0732t4.getSuperState());
        if (!c0732t4.f4495a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0398k4(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0732t4 c0732t4 = new C0732t4(super.onSaveInstanceState());
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        c0732t4.f4495a = interfaceC0769u4 != null && interfaceC0769u4.mo1989b();
        return c0732t4;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0361j4 c0361j4 = this.f4801c;
        if (c0361j4 == null || !c0361j4.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 == null) {
            return super.performClick();
        }
        if (interfaceC0769u4.mo1989b()) {
            return true;
        }
        interfaceC0769u4.mo1992e(AbstractC0472m4.m1781b(this), AbstractC0472m4.m1780a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            c0804v2.m2483e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            c0804v2.m2484f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC0769u4.mo1999o(i);
            interfaceC0769u4.mo1990c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 != null) {
            interfaceC0769u4.mo1998m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f4804f != null) {
            this.f4805g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 != null) {
            interfaceC0769u4.mo1997l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0222ff.m1196r(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 != null) {
            interfaceC0769u4.mo1996k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            c0804v2.m2486h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0804v2 c0804v2 = this.f4799a;
        if (c0804v2 != null) {
            c0804v2.m2487i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4803e) {
            this.f4802d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC0769u4 interfaceC0769u4 = this.f4804f;
        if (interfaceC0769u4 != null) {
            Context context = this.f4800b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C0584p4 c0584p4 = new C0584p4();
            c0584p4.f3663a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c0584p4.f3664b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC0509n4.m1896a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC0769u4.mo1714n(c0584p4);
        }
    }
}
