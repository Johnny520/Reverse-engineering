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
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1394f4 extends Spinner {

    /* JADX INFO: renamed from: i */
    public static final int[] f4948i = null;

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

    static {
        f4948i = new int[]{R.attr.spinnerMode};
    }

    public C1394f4(Context r13, AttributeSet r14) {
        super(r13, r14, io.github.cherrywechat.R.attr.spinnerStyle);
        this.f4956h = new Rect();
        AbstractC1042YA.m1987a(getContext(), this);
        int[] r1 = AbstractC0982Wu.f3086u;
        C2656w4 r2 = C2656w4.m5186A(r13, r14, r1, io.github.cherrywechat.R.attr.spinnerStyle);
        TypedArray r3 = (TypedArray) r2.f9196b;
        this.f4949a = new C1349e3(this);
        int r4 = r3.getResourceId(4, 0);
        if (r4 == 0) goto L5;
        this.f4950b = new C0147Db(r13, r4);
    L6:
        int r42 = -1;
        TypedArray r6 = null;
        TypedArray r7 = r13.obtainStyledAttributes(r14, f4948i, io.github.cherrywechat.R.attr.spinnerStyle, 0);     // Catch: Throwable -> L15 Exception -> L17
    L40:
    L12:
        th = th;
        r6 = r7;
    L18:
        if (r6 == null) goto L20;
        r6.recycle();
    L20:
        throw th;
    L9:
        if (r7.hasValue(0) == false) goto L14;
        r42 = r7.getInt(0, 0);     // Catch: Throwable -> L12 Exception -> L37
    L14:
        r7.recycle();
    L24:
        if (r42 == 0) goto L28;
        if (r42 != 1) goto L29;
        C1245c4 r43 = new C1245c4(this, this.f4950b, r14);
        C2656w4 r12 = C2656w4.m5186A(this.f4950b, r14, r1, io.github.cherrywechat.R.attr.spinnerStyle);
        this.f4955g = ((TypedArray) r12.f9196b).getLayoutDimension(3, -2);
        r43.m579g(r12.m5210q(1));
        r43.f4232C = r3.getString(2);
        r12.m5195E();
        this.f4954f = r43;
        this.f4951c = new C0906V3(this, this, r43);
    L29:
        CharSequence[] r15 = r3.getTextArray(0);
        if (r15 == null) goto L32;
        ArrayAdapter r32 = new ArrayAdapter(r13, R.layout.simple_spinner_item, r15);
        r32.setDropDownViewResource(io.github.cherrywechat.R.layout.support_simple_spinner_dropdown_item);
        setAdapter(r32);
    L32:
        r2.m5195E();
        this.f4953e = true;
        SpinnerAdapter r132 = this.f4952d;
        if (r132 == null) goto L35;
        setAdapter(r132);
        this.f4952d = null;
    L35:
        this.f4949a.m2603d(r14, io.github.cherrywechat.R.attr.spinnerStyle);
        return;
    L28:
        DialogInterfaceOnClickListenerC1035Y3 r16 = new DialogInterfaceOnClickListenerC1035Y3(this);
        this.f4954f = r16;
        r16.f3306c = r3.getString(2);
    L21:
        if (r7 == null) goto L24;
    L17:
        r7 = null;
    L15:
        th = th;
        goto L18
    L5:
        this.f4950b = r13;
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public final int m2672a(SpinnerAdapter r11, Drawable r12) {
        int r0 = 0;
        if (r11 != null) goto L5;
        return 0;
    L5:
        int r1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int r3 = Math.max(0, getSelectedItemPosition());
        int r4 = Math.min(r11.getCount(), r3 + 15);
        int r6 = Math.max(0, r3 - (15 - (r4 - r3)));
        View r7 = null;
        int r32 = 0;
    L6:
        if (r6 >= r4) goto L14;
        int r8 = r11.getItemViewType(r6);
        if (r8 == r0) goto L10;
        r7 = null;
        r0 = r8;
    L10:
        r7 = r11.getView(r6, r7, this);
        if (r7.getLayoutParams() != null) goto L13;
        r7.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    L13:
        r7.measure(r1, r2);
        r32 = Math.max(r32, r7.getMeasuredWidth());
        r6 = r6 + 1;
        goto L6
    L14:
        if (r12 == null) goto L17;
        Rect r112 = this.f4956h;
        r12.getPadding(r112);
        return (r112.left + r112.right) + r32;
    L17:
        return r32;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1349e3 r0 = this.f4949a;
        if (r0 == null) goto L6;
        r0.m2600a();
        return;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L7;
        return r0.mo1972b();
    L7:
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L7;
        return r0.mo1980n();
    L7:
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f4954f == null) goto L7;
        return this.f4955g;
    L7:
        return super.getDropDownWidth();
    }

    public final InterfaceC1350e4 getInternalPopup() {
        return this.f4954f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L7;
        return r0.mo1973d();
    L7:
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f4950b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L7;
        return r0.mo1981o();
    L7:
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1349e3 r0 = this.f4949a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2601b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1349e3 r0 = this.f4949a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2602c();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.mo1971a() == false) goto L9;
        r0.dismiss();
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        if (this.f4954f != null) goto L5;
        return;
    L5:
        if (View.MeasureSpec.getMode(r3) != Integer.MIN_VALUE) goto L9;
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2672a(getAdapter(), getBackground())), View.MeasureSpec.getSize(r3)), getMeasuredHeight());
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable r3) {
        C1307d4 r32 = (C1307d4) r3;
        super.onRestoreInstanceState(r32.getSuperState());
        if (r32.f4757a == false) goto L8;
        ViewTreeObserver r33 = getViewTreeObserver();
        if (r33 == null) goto L9;
        r33.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0949W3(0, this));
        return;
    L9:
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1307d4 r0 = new C1307d4(super.onSaveInstanceState());
        InterfaceC1350e4 r1 = this.f4954f;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        r0.f4757a = r12;
        return r0;
    L5:
        if (r1.mo1971a() == false) goto L7;
        r12 = true;
        goto L8
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        C0906V3 r0 = this.f4951c;
        if (r0 == null) goto L9;
        if (r0.onTouch(this, r2) == false) goto L9;
        return true;
    L9:
        return super.onTouchEvent(r2);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L10;
        if (r0.mo1971a() == true) goto L11;
        r0.mo1979m(getTextDirection(), getTextAlignment());
        return true;
    L11:
        return true;
    L10:
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(Adapter r1) {
        setAdapter((SpinnerAdapter) r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
        C1349e3 r12 = this.f4949a;
        if (r12 == null) goto L6;
        r12.m2604e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        C1349e3 r0 = this.f4949a;
        if (r0 == null) goto L6;
        r0.m2605f(r2);
        return;
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L6;
        r0.mo1977k(r2);
        r0.mo1978l(r2);
        return;
    L6:
        super.setDropDownHorizontalOffset(r2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L6;
        r0.mo1976j(r2);
        return;
    L6:
        super.setDropDownVerticalOffset(r2);
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
        if (this.f4954f == null) goto L6;
        this.f4955g = r2;
        return;
    L6:
        super.setDropDownWidth(r2);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable r2) {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L6;
        r0.mo1975g(r2);
        return;
    L6:
        super.setPopupBackgroundDrawable(r2);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
        setPopupBackgroundDrawable(AbstractC1406fG.m2695U(getPopupContext(), r2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence r2) {
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L6;
        r0.mo1974f(r2);
        return;
    L6:
        super.setPrompt(r2);
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        C1349e3 r0 = this.f4949a;
        if (r0 == null) goto L6;
        r0.m2607h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        C1349e3 r0 = this.f4949a;
        if (r0 == null) goto L6;
        r0.m2608i(r2);
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter r5) {
        if (this.f4953e == true) goto L6;
        this.f4952d = r5;
        return;
    L6:
        super.setAdapter(r5);
        InterfaceC1350e4 r0 = this.f4954f;
        if (r0 == null) goto L20;
        Context r1 = this.f4950b;
        if (r1 != null) goto L11;
        r1 = getContext();
    L11:
        Resources.Theme r12 = r1.getTheme();
        C1078Z3 r2 = new C1078Z3();
        r2.f3442a = r5;
        if ((r5 instanceof ListAdapter) == false) goto L14;
        r2.f3443b = (ListAdapter) r5;
    L14:
        if (r12 != null) goto L16;
    L18:
        r0.mo584p(r2);
        return;
    L16:
        if ((r5 instanceof ThemedSpinnerAdapter) == false) goto L18;
        AbstractC0992X3.m1882a((ThemedSpinnerAdapter) r5, r12);
        goto L18
    }
}
