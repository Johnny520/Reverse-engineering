package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.ljx.wechatmod.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class jt extends u2 {
    public final kr e;
    public final AccessibilityManager f;
    public final Rect g;
    public final int h;
    public final float i;
    public ColorStateList j;
    public int k;
    public ColorStateList l;

    public jt(Context r8, AttributeSet r9) {
        super(ff.W(r8, r9, R.attr.autoCompleteTextViewStyle, 0), r9);
        this.g = new Rect();
        Context r0 = getContext();
        TypedArray r82 = a80.u(r0, r9, wy.i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (r82.hasValue(0) == true) goto L5;
    L7:
        this.h = r82.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.i = r82.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (r82.hasValue(2) == false) goto L10;
        this.j = ColorStateList.valueOf(r82.getColor(2, 0));
    L10:
        this.k = r82.getColor(4, 0);
        this.l = ct.n(r0, r82, 5);
        this.f = (AccessibilityManager) r0.getSystemService("accessibility");
        kr r3 = new kr(r0, null, R.attr.listPopupWindowStyle, 0);
        this.e = r3;
        r3.y = true;
        r3.z.setFocusable(true);
        r3.o = this;
        r3.z.setInputMethodMode(2);
        r3.n(getAdapter());
        r3.p = new q4(1, this);
        if (r82.hasValue(6) == false) goto L13;
        setSimpleItems(r82.getResourceId(6, 0));
    L13:
        r82.recycle();
        return;
    L5:
        if (r82.getInt(0, 0) != 0) goto L7;
        setKeyListener(null);
        goto L7
    }

    public static void a(jt r1, Object r2) {
        r1.setText(r1.convertSelectionToString(r2), false);
    }

    public final TextInputLayout b() {
        ViewParent r0 = getParent();
    L3:
        if (r0 == null) goto L9;
        if ((r0 instanceof TextInputLayout) == true) goto L7;
        r0 = r0.getParent();
        goto L3
    L7:
        return (TextInputLayout) r0;
    L9:
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager r0 = this.f;
        if (r0 != null) goto L5;
    L8:
        super.dismissDropDown();
        return;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L8;
        this.e.dismiss();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout r0 = b();
        if (r0 == null) goto L9;
        if (r0.E == false) goto L9;
        return r0.getHint();
    L9:
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout r0 = b();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.E == true) goto L7;
        return;
    L7:
        if (super.getHint() != null) goto L18;
        String r02 = Build.MANUFACTURER;
        if (r02 == null) goto L11;
        String r03 = r02.toLowerCase(Locale.ENGLISH);
    L13:
        if (r03.equals("meizu") == false) goto L19;
        setHint("");
        return;
    L19:
        return;
    L11:
        r03 = "";
        goto L13
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r14, int r15) {
        super.onMeasure(r14, r15);
        if (View.MeasureSpec.getMode(r14) != Integer.MIN_VALUE) goto L30;
        int r152 = getMeasuredWidth();
        ListAdapter r0 = getAdapter();
        TextInputLayout r1 = b();
        int r2 = 0;
        if (r0 == null) goto L25;
        if (r1 == null) goto L25;
        int r3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        kr r5 = this.e;
        if (r5.z.isShowing() == true) goto L11;
        int r6 = -1;
    L12:
        int r62 = Math.min(r0.getCount(), Math.max(0, r6) + 15);
        int r9 = Math.max(0, r62 - 15);
        View r10 = null;
        int r7 = 0;
    L13:
        if (r9 >= r62) goto L21;
        int r11 = r0.getItemViewType(r9);
        if (r11 == r2) goto L17;
        r10 = null;
        r2 = r11;
    L17:
        r10 = r0.getView(r9, r10, r1);
        if (r10.getLayoutParams() != null) goto L20;
        r10.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    L20:
        r10.measure(r3, r4);
        r7 = Math.max(r7, r10.getMeasuredWidth());
        r9 = r9 + 1;
        goto L13
    L21:
        Drawable r02 = r5.z.getBackground();
        if (r02 == null) goto L24;
        Rect r22 = this.g;
        r02.getPadding(r22);
        r7 = r7 + (r22.left + r22.right);
    L24:
        r2 = r1.getEndIconView().getMeasuredWidth() + r7;
        goto L25
    L11:
        r6 = r5.c.getSelectedItemPosition();
    L25:
        setMeasuredDimension(Math.min(Math.max(r152, r2), View.MeasureSpec.getSize(r14)), getMeasuredHeight());
        return;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r2) {
        AccessibilityManager r0 = this.f;
        if (r0 != null) goto L5;
    L7:
        super.onWindowFocusChanged(r2);
        return;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L7;
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T r2) {
        super.setAdapter(r2);
        this.e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable r2) {
        super.setDropDownBackgroundDrawable(r2);
        kr r0 = this.e;
        if (r0 == null) goto L6;
        r0.l(r2);
        return;
    }

    public void setDropDownBackgroundTint(int r1) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(r1));
    }

    public void setDropDownBackgroundTintList(ColorStateList r2) {
        this.j = r2;
        Drawable r22 = getDropDownBackground();
        if ((r22 instanceof eu) == false) goto L6;
        ((eu) r22).j(this.j);
        return;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener r2) {
        super.setOnItemSelectedListener(r2);
        kr r22 = this.e;
        r22.q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r1) {
        super.setRawInputType(r1);
        TextInputLayout r12 = b();
        if (r12 == null) goto L6;
        r12.s();
        return;
    }

    public void setSimpleItemSelectedColor(int r1) {
        this.k = r1;
        if ((getAdapter() instanceof ht) == false) goto L6;
        ((ht) getAdapter()).a();
        return;
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList r1) {
        this.l = r1;
        if ((getAdapter() instanceof ht) == false) goto L6;
        ((ht) getAdapter()).a();
        return;
    }

    public void setSimpleItems(int r2) {
        setSimpleItems(getResources().getStringArray(r2));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager r0 = this.f;
        if (r0 != null) goto L5;
    L8:
        super.showDropDown();
        return;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L8;
        this.e.f();
    }

    public void setSimpleItems(String[] r4) {
        setAdapter(new ht(this, getContext(), this.h, r4));
    }
}
