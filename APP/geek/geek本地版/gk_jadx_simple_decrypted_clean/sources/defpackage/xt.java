package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class xt extends y2 {
    public static final int[][] A = null;
    public static final int B = 0;
    public static final int[] y = null;
    public static final int[] z = null;
    public final LinkedHashSet e;
    public final LinkedHashSet f;
    public ColorStateList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public CharSequence k;
    public Drawable l;
    public Drawable m;
    public boolean n;
    public ColorStateList o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public int[] s;
    public boolean t;
    public CharSequence u;
    public CompoundButton.OnCheckedChangeListener v;
    public final n2 w;
    public final vt x;

    static {
        y = new int[]{R.attr.state_indeterminate};
        z = new int[]{R.attr.state_error};
        A = new int[][]{new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public xt(Context r9, AttributeSet r10) {
        super(ff.W(r9, r10, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), r10, R.attr.checkboxStyle);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        Context r92 = getContext();
        n2 r0 = new n2(r92, 0);
        Resources r1 = r92.getResources();
        Resources.Theme r93 = r92.getTheme();
        ThreadLocal r2 = c10.a;
        Drawable r94 = x00.a(r1, R.drawable.mtrl_checkbox_button_checked_unchecked, r93);
        r0.a = r94;
        r94.setCallback(r0.f);
        new m2(r0.a.getConstantState());
        this.w = r0;
        this.x = new vt(this);
        Context r12 = getContext();
        this.l = xb.a(this);
        this.o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        a80.c(r12, r10, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] r3 = wy.n;
        a80.e(r12, r10, r3, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray r02 = r12.obtainStyledAttributes(r10, r3, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        r5 r102 = new r5(r12, r02);
        this.m = r102.m(2);
        if (this.l != null) goto L5;
    L12:
        this.p = ct.m(r12, r102, 3);
        this.q = gt.v(r02.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = r02.getBoolean(10, false);
        this.i = r02.getBoolean(6, true);
        this.j = r02.getBoolean(9, false);
        this.k = r02.getText(8);
        if (r02.hasValue(7) == false) goto L15;
        setCheckedState(r02.getInt(7, 0));
    L15:
        r102.z();
        a();
        return;
    L5:
        if (gt.z(r12, R.attr.isMaterial3Theme, false) == false) goto L12;
        int r22 = r02.getResourceId(0, 0);
        int r4 = r02.getResourceId(1, 0);
        if (r22 != B) goto L12;
        if (r4 != 0) goto L12;
        super.setButtonDrawable(null);
        this.l = ff.r(r12, R.drawable.mtrl_checkbox_button);
        this.n = true;
        if (this.m != null) goto L12;
        this.m = ff.r(r12, R.drawable.mtrl_checkbox_button_icon);
        goto L12
    }

    private String getButtonStateDescription() {
        int r0 = this.r;
        if (r0 == 1) goto L5;
        if (r0 != 0) goto L10;
        return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
    L10:
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    L5:
        return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g != null) goto L6;
        int r0 = zt.k(this, R.attr.colorControlActivated);
        int r1 = zt.k(this, R.attr.colorError);
        int r2 = zt.k(this, R.attr.colorSurface);
        int r3 = zt.k(this, R.attr.colorOnSurface);
        int[] r02 = {zt.E(1.0f, r2, r1), zt.E(1.0f, r2, r0), zt.E(0.54f, r2, r3), zt.E(0.38f, r2, r3), zt.E(0.38f, r2, r3)};
        this.g = new ColorStateList(A, r02);
    L6:
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList r0 = this.o;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (super.getButtonTintList() == null) goto L10;
        return super.getButtonTintList();
    L10:
        return getSupportButtonTintList();
    }

    public final void a() {
        Drawable r0 = this.l;
        ColorStateList r1 = this.o;
        PorterDuff.Mode r2 = wb.b(this);
        if (r0 != null) goto L5;
        r0 = null;
    L9:
        this.l = r0;
        Drawable r02 = this.m;
        ColorStateList r12 = this.p;
        PorterDuff.Mode r22 = this.q;
        if (r02 != null) goto L12;
        r02 = null;
    L16:
        this.m = r02;
        if (this.n == false) goto L58;
        n2 r03 = this.w;
        if (r03 == null) goto L54;
        l2 r13 = r03.b;
        Drawable r23 = r03.a;
        vt r4 = this.x;
        if (r23 == null) goto L27;
        AnimatedVectorDrawable r24 = (AnimatedVectorDrawable) r23;
        if (r4.a != null) goto L26;
        r4.a = new j2(r4);
    L26:
        r24.unregisterAnimationCallback(r4.a);
    L27:
        ArrayList r25 = r03.e;
        if (r25 == null) goto L36;
        if (r4 == null) goto L36;
        r25.remove(r4);
        if (r03.e.size() != 0) goto L36;
        y0 r26 = r03.d;
        if (r26 == null) goto L36;
        r13.b.removeListener(r26);
        r03.d = null;
    L36:
        Drawable r27 = r03.a;
        if (r27 == null) goto L42;
        AnimatedVectorDrawable r28 = (AnimatedVectorDrawable) r27;
        if (r4.a != null) goto L41;
        r4.a = new j2(r4);
    L41:
        r28.registerAnimationCallback(r4.a);
        goto L54
    L42:
        if (r4 == null) goto L54;
        if (r03.e != null) goto L48;
        r03.e = new ArrayList();
    L48:
        if (r03.e.contains(r4) == true) goto L54;
        r03.e.add(r4);
        if (r03.d != null) goto L53;
        r03.d = new y0(1, r03);
    L53:
        r13.b.addListener(r03.d);
    L54:
        Drawable r14 = this.l;
        if ((r14 instanceof AnimatedStateListDrawable) == false) goto L58;
        if (r03 == null) goto L58;
        ((AnimatedStateListDrawable) r14).addTransition(R.id.checked, R.id.unchecked, r03, false);
        ((AnimatedStateListDrawable) this.l).addTransition(R.id.indeterminate, R.id.unchecked, r03, false);
    L58:
        Drawable r04 = this.l;
        if (r04 == null) goto L63;
        ColorStateList r15 = this.o;
        if (r15 == null) goto L63;
        ch.h(r04, r15);
    L63:
        Drawable r05 = this.m;
        if (r05 == null) goto L68;
        ColorStateList r16 = this.p;
        if (r16 == null) goto L68;
        ch.h(r05, r16);
    L68:
        Drawable r06 = this.l;
        Drawable r17 = this.m;
        if (r06 != null) goto L71;
        r06 = r17;
    L91:
        super.setButtonDrawable(r06);
        refreshDrawableState();
        return;
    L71:
        if (r17 == null) goto L91;
        int r29 = r17.getIntrinsicWidth();
        if (r29 != (-1)) goto L77;
        r29 = r06.getIntrinsicWidth();
    L77:
        int r42 = r17.getIntrinsicHeight();
        if (r42 != (-1)) goto L82;
        r42 = r06.getIntrinsicHeight();
    L82:
        if (r29 <= r06.getIntrinsicWidth()) goto L84;
    L86:
        float r210 = r29 / r42;
        if (r210 < (r06.getIntrinsicWidth() / r06.getIntrinsicHeight())) goto L89;
        int r3 = r06.getIntrinsicWidth();
        r42 = (int) (r3 / r210);
        r29 = r3;
    L90:
        LayerDrawable r32 = new LayerDrawable(new Drawable[]{r06, r17});
        r32.setLayerSize(1, r29, r42);
        r32.setLayerGravity(1, 17);
        r06 = r32;
        goto L91
    L89:
        r42 = r06.getIntrinsicHeight();
        r29 = (int) (r210 * r42);
        goto L90
    L84:
        if (r42 > r06.getIntrinsicHeight()) goto L86;
    L12:
        if (r12 == null) goto L16;
        r02 = r02.mutate();
        if (r22 == null) goto L16;
        ch.i(r02, r22);
        goto L16
    L5:
        if (r1 == null) goto L9;
        r0 = r0.mutate();
        if (r2 == null) goto L9;
        ch.i(r0, r2);
        goto L9
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.r != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h == true) goto L5;
        return;
    L5:
        if (this.o == null) goto L7;
        return;
    L7:
        if (this.p != null) goto L12;
        setUseMaterialThemeColors(true);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r4) {
        int[] r42 = super.onCreateDrawableState(r4 + 2);
        if (getCheckedState() != 2) goto L6;
        View.mergeDrawableStates(r42, y);
    L6:
        if (this.j == false) goto L8;
        View.mergeDrawableStates(r42, z);
    L8:
        int r0 = 0;
    L10:
        if (r0 >= r42.length) goto L17;
        int r1 = r42[r0];
        if (r1 == 16842912) goto L13;
        if (r1 == 0) goto L15;
        r0 = r0 + 1;
        goto L10
    L15:
        int[] r12 = (int[]) r42.clone();
        r12[r0] = 16842912;
    L18:
        this.s = r12;
        return r42;
    L13:
        r12 = r42;
        goto L18
    L17:
        r12 = Arrays.copyOf(r42, r42.length + 1);
        r12[r42.length] = 16842912;
        goto L18
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas r6) {
        if (this.i == true) goto L5;
    L16:
        super.onDraw(r6);
        return;
    L5:
        if (TextUtils.isEmpty(getText()) == false) goto L16;
        Drawable r0 = xb.a(this);
        if (r0 == null) goto L16;
        if (gt.n(this) == false) goto L11;
        int r1 = -1;
    L12:
        int r2 = ((getWidth() - r0.getIntrinsicWidth()) / 2) * r1;
        int r12 = r6.save();
        r6.translate(r2, 0.0f);
        super.onDraw(r6);
        r6.restoreToCount(r12);
        if (getBackground() == null) goto L18;
        Rect r62 = r0.getBounds();
        ch.f(getBackground(), r62.left + r2, r62.top, r62.right + r2, r62.bottom);
        return;
    L18:
        return;
    L11:
        r1 = 1;
        goto L12
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r3) {
        super.onInitializeAccessibilityNodeInfo(r3);
        if (r3 != null) goto L6;
        return;
    L6:
        if (this.j == false) goto L9;
        r3.setText(r3.getText() + ", " + this.k);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof wt) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        wt r22 = (wt) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        setCheckedState(r22.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        wt r1 = new wt(super.onSaveInstanceState());
        r1.a = getCheckedState();
        return r1;
    }

    @Override // defpackage.y2, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(ff.r(getContext(), r2));
    }

    public void setButtonIconDrawable(Drawable r1) {
        this.m = r1;
        a();
    }

    public void setButtonIconDrawableResource(int r2) {
        setButtonIconDrawable(ff.r(getContext(), r2));
    }

    public void setButtonIconTintList(ColorStateList r2) {
        if (this.p != r2) goto L5;
        return;
    L5:
        this.p = r2;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode r2) {
        if (this.q != r2) goto L5;
        return;
    L5:
        this.q = r2;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList r2) {
        if (this.o != r2) goto L5;
        return;
    L5:
        this.o = r2;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode r1) {
        setSupportButtonTintMode(r1);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
        this.i = r1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r1) {
        setCheckedState(r1 ? 1 : 0);
    }

    public void setCheckedState(int r4) {
        if (this.r == r4) goto L33;
        this.r = r4;
        if (r4 != 1) goto L7;
        boolean r42 = true;
    L8:
        super.setChecked(r42);
        refreshDrawableState();
        if (Build.VERSION.SDK_INT < 30) goto L14;
        if (this.u != null) goto L14;
        super.setStateDescription(getButtonStateDescription());
    L14:
        if (this.t == true) goto L34;
        this.t = true;
        LinkedHashSet r43 = this.f;
        if (r43 == null) goto L24;
        Iterator r44 = r43.iterator();
        if (r44.hasNext() == false) goto L24;
        throw z30.h(r44);
    L24:
        if (this.r == 2) goto L28;
        CompoundButton.OnCheckedChangeListener r45 = this.v;
        if (r45 == null) goto L28;
        r45.onCheckedChanged(this, isChecked());
    L28:
        AutofillManager r46 = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (r46 == null) goto L31;
        r46.notifyValueChanged(this);
    L31:
        this.t = false;
        return;
    L34:
        return;
    L7:
        r42 = false;
        goto L8
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean r1) {
        super.setEnabled(r1);
    }

    public void setErrorAccessibilityLabel(CharSequence r1) {
        this.k = r1;
    }

    public void setErrorAccessibilityLabelResource(int r2) {
        if (r2 == 0) goto L4;
        CharSequence r22 = getResources().getText(r2);
    L5:
        setErrorAccessibilityLabel(r22);
        return;
    L4:
        r22 = null;
        goto L5
    }

    public void setErrorShown(boolean r2) {
        if (this.j == r2) goto L10;
        this.j = r2;
        refreshDrawableState();
        Iterator r22 = this.e.iterator();
        if (r22.hasNext() == true) goto L9;
        return;
    L9:
        throw z30.h(r22);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener r1) {
        this.v = r1;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence r3) {
        this.u = r3;
        if (r3 == null) goto L5;
        super.setStateDescription(r3);
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L11;
        if (r3 != null) goto L12;
        super.setStateDescription(getButtonStateDescription());
        return;
    L12:
        return;
    }

    public void setUseMaterialThemeColors(boolean r1) {
        this.h = r1;
        if (r1 == false) goto L6;
        wb.c(this, getMaterialThemeColorsTintList());
        return;
    L6:
        wb.c(this, null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.y2, android.widget.CompoundButton
    public void setButtonDrawable(Drawable r1) {
        this.l = r1;
        this.n = false;
        a();
    }
}
