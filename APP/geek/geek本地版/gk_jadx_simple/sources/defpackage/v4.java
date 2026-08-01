package defpackage;

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
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class v4 extends Spinner {
    public static final int[] i = null;
    public final v2 a;
    public final Context b;
    public final j4 c;
    public SpinnerAdapter d;
    public final boolean e;
    public final u4 f;
    public int g;
    public final Rect h;

    static {
        i = new int[]{R.attr.spinnerMode};
    }

    public v4(Context r13, AttributeSet r14) {
        super(r13, r14, com.ljx.wechatmod.R.attr.spinnerStyle);
        this.h = new Rect();
        r60.a(this, getContext());
        int[] r1 = xy.v;
        r5 r2 = r5.y(r13, r14, r1, com.ljx.wechatmod.R.attr.spinnerStyle);
        TypedArray r3 = (TypedArray) r2.b;
        this.a = new v2(this);
        int r4 = r3.getResourceId(4, 0);
        if (r4 == 0) goto L5;
        this.b = new kd(r13, r4);
    L6:
        int r42 = -1;
        TypedArray r6 = null;
        TypedArray r7 = r13.obtainStyledAttributes(r14, i, com.ljx.wechatmod.R.attr.spinnerStyle, 0);     // Catch: Throwable -> L17 Exception -> L19
    L14:
        e = e;
    L21:
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);     // Catch: Throwable -> L12
        if (r7 == null) goto L25;
    L16:
        r7.recycle();
    L25:
        if (r42 == 0) goto L29;
        if (r42 != 1) goto L30;
        s4 r43 = new s4(this, this.b, r14);
        r5 r12 = r5.y(this.b, r14, r1, com.ljx.wechatmod.R.attr.spinnerStyle);
        this.g = ((TypedArray) r12.b).getLayoutDimension(3, -2);
        r43.l(r12.m(1));
        r43.C = r3.getString(2);
        r12.z();
        this.f = r43;
        this.c = new j4(this, this, r43);
    L30:
        CharSequence[] r15 = r3.getTextArray(0);
        if (r15 == null) goto L33;
        ArrayAdapter r32 = new ArrayAdapter(r13, R.layout.simple_spinner_item, r15);
        r32.setDropDownViewResource(com.ljx.wechatmod.R.layout.support_simple_spinner_dropdown_item);
        setAdapter(r32);
    L33:
        r2.z();
        this.e = true;
        SpinnerAdapter r132 = this.d;
        if (r132 == null) goto L36;
        setAdapter(r132);
        this.d = null;
    L36:
        this.a.d(r14, com.ljx.wechatmod.R.attr.spinnerStyle);
        return;
    L29:
        o4 r16 = new o4(this);
        this.f = r16;
        r16.c = r3.getString(2);
    L12:
        th = th;
        r6 = r7;
    L38:
        if (r6 == null) goto L40;
        r6.recycle();
    L40:
        throw th;
    L9:
        if (r7.hasValue(0) == false) goto L16;
        r42 = r7.getInt(0, 0);     // Catch: Throwable -> L12 Exception -> L14
        goto L16
    L19:
        e = e;
        r7 = null;
    L17:
        th = th;
        goto L38
    L5:
        this.b = r13;
        goto L6
    }

    public final int a(SpinnerAdapter r11, Drawable r12) {
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
        Rect r112 = this.h;
        r12.getPadding(r112);
        return (r112.left + r112.right) + r32;
    L17:
        return r32;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.a();
        return;
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        u4 r0 = this.f;
        if (r0 == null) goto L7;
        return r0.d();
    L7:
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        u4 r0 = this.f;
        if (r0 == null) goto L7;
        return r0.g();
    L7:
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f == null) goto L7;
        return this.g;
    L7:
        return super.getDropDownWidth();
    }

    public final u4 getInternalPopup() {
        return this.f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        u4 r0 = this.f;
        if (r0 == null) goto L7;
        return r0.h();
    L7:
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        u4 r0 = this.f;
        if (r0 == null) goto L7;
        return r0.i();
    L7:
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        v2 r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.c();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u4 r0 = this.f;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.b() == false) goto L9;
        r0.dismiss();
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        if (this.f != null) goto L5;
        return;
    L5:
        if (View.MeasureSpec.getMode(r3) != Integer.MIN_VALUE) goto L9;
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(r3)), getMeasuredHeight());
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable r3) {
        t4 r32 = (t4) r3;
        super.onRestoreInstanceState(r32.getSuperState());
        if (r32.a == false) goto L8;
        ViewTreeObserver r33 = getViewTreeObserver();
        if (r33 == null) goto L9;
        r33.addOnGlobalLayoutListener(new k4(0, this));
        return;
    L9:
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        t4 r0 = new t4(super.onSaveInstanceState());
        u4 r1 = this.f;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        r0.a = r12;
        return r0;
    L5:
        if (r1.b() == false) goto L7;
        r12 = true;
        goto L8
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent r2) {
        j4 r0 = this.c;
        if (r0 == null) goto L9;
        if (r0.onTouch(this, r2) == false) goto L9;
        return true;
    L9:
        return super.onTouchEvent(r2);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        u4 r0 = this.f;
        if (r0 == null) goto L10;
        if (r0.b() == true) goto L11;
        r0.e(m4.b(this), m4.a(this));
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
        v2 r12 = this.a;
        if (r12 == null) goto L6;
        r12.e();
        return;
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
        super.setBackgroundResource(r2);
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.f(r2);
        return;
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
        u4 r0 = this.f;
        if (r0 == null) goto L6;
        r0.o(r2);
        r0.c(r2);
        return;
    L6:
        super.setDropDownHorizontalOffset(r2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
        u4 r0 = this.f;
        if (r0 == null) goto L6;
        r0.m(r2);
        return;
    L6:
        super.setDropDownVerticalOffset(r2);
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
        if (this.f == null) goto L6;
        this.g = r2;
        return;
    L6:
        super.setDropDownWidth(r2);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable r2) {
        u4 r0 = this.f;
        if (r0 == null) goto L6;
        r0.l(r2);
        return;
    L6:
        super.setPopupBackgroundDrawable(r2);
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
        setPopupBackgroundDrawable(ff.r(getPopupContext(), r2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence r2) {
        u4 r0 = this.f;
        if (r0 == null) goto L6;
        r0.k(r2);
        return;
    L6:
        super.setPrompt(r2);
    }

    public void setSupportBackgroundTintList(ColorStateList r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.h(r2);
        return;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode r2) {
        v2 r0 = this.a;
        if (r0 == null) goto L6;
        r0.i(r2);
        return;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter r5) {
        if (this.e == true) goto L6;
        this.d = r5;
        return;
    L6:
        super.setAdapter(r5);
        u4 r0 = this.f;
        if (r0 == null) goto L20;
        Context r1 = this.b;
        if (r1 != null) goto L11;
        r1 = getContext();
    L11:
        Resources.Theme r12 = r1.getTheme();
        p4 r2 = new p4();
        r2.a = r5;
        if ((r5 instanceof ListAdapter) == false) goto L14;
        r2.b = (ListAdapter) r5;
    L14:
        if (r12 != null) goto L16;
    L18:
        r0.n(r2);
        return;
    L16:
        if ((r5 instanceof ThemedSpinnerAdapter) == false) goto L18;
        n4.a((ThemedSpinnerAdapter) r5, r12);
        goto L18
    }
}
