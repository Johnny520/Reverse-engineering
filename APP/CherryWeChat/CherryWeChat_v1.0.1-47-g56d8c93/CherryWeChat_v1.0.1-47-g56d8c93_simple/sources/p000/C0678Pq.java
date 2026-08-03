package p000;

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
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: Pq */
/* JADX INFO: loaded from: classes.dex */
public final class C0678Pq extends C1481h3 {

    /* JADX INFO: renamed from: A */
    public static final int[][] f2154A = null;

    /* JADX INFO: renamed from: B */
    public static final int f2155B = 0;

    /* JADX INFO: renamed from: y */
    public static final int[] f2156y = null;

    /* JADX INFO: renamed from: z */
    public static final int[] f2157z = null;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f2158e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f2159f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2160g;

    /* JADX INFO: renamed from: h */
    public boolean f2161h;

    /* JADX INFO: renamed from: i */
    public boolean f2162i;

    /* JADX INFO: renamed from: j */
    public boolean f2163j;

    /* JADX INFO: renamed from: k */
    public CharSequence f2164k;

    /* JADX INFO: renamed from: l */
    public Drawable f2165l;

    /* JADX INFO: renamed from: m */
    public Drawable f2166m;

    /* JADX INFO: renamed from: n */
    public boolean f2167n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f2168o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f2169p;

    /* JADX INFO: renamed from: q */
    public PorterDuff.Mode f2170q;

    /* JADX INFO: renamed from: r */
    public int f2171r;

    /* JADX INFO: renamed from: s */
    public int[] f2172s;

    /* JADX INFO: renamed from: t */
    public boolean f2173t;

    /* JADX INFO: renamed from: u */
    public CharSequence f2174u;

    /* JADX INFO: renamed from: v */
    public CompoundButton.OnCheckedChangeListener f2175v;

    /* JADX INFO: renamed from: w */
    public final C0519M2 f2176w;

    /* JADX INFO: renamed from: x */
    public final C0592Nq f2177x;

    static {
        f2156y = new int[]{R.attr.state_indeterminate};
        f2157z = new int[]{R.attr.state_error};
        f2154A = new int[][]{new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f2155B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public C0678Pq(Context r9, AttributeSet r10) {
        super(AbstractC0148Dc.m291y(r9, r10, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), r10, R.attr.checkboxStyle);
        this.f2158e = new LinkedHashSet();
        this.f2159f = new LinkedHashSet();
        Context r92 = getContext();
        C0519M2 r0 = new C0519M2(r92, 0);
        Resources r1 = r92.getResources();
        Resources.Theme r93 = r92.getTheme();
        ThreadLocal r2 = AbstractC0125Cw.f295a;
        Drawable r94 = r1.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, r93);
        r0.f373a = r94;
        r94.setCallback(r0.f1696f);
        new C0476L2(0, r0.f373a.getConstantState());
        this.f2176w = r0;
        this.f2177x = new C0592Nq(this);
        Context r12 = getContext();
        this.f2165l = getButtonDrawable();
        this.f2168o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC1293cr.m2547f(r12, r10, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] r3 = AbstractC0939Vu.f2946o;
        AbstractC1293cr.m2549h(r12, r10, r3, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray r02 = r12.obtainStyledAttributes(r10, r3, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C2656w4 r102 = new C2656w4(r12, r02);
        this.f2166m = r102.m5210q(2);
        if (this.f2165l != null) goto L5;
    L12:
        this.f2169p = AbstractC0828TB.m1642i(r12, r102, 3);
        this.f2170q = AbstractC0148Dc.m282p(r02.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f2161h = r02.getBoolean(10, false);
        this.f2162i = r02.getBoolean(6, true);
        this.f2163j = r02.getBoolean(9, false);
        this.f2164k = r02.getText(8);
        if (r02.hasValue(7) == false) goto L15;
        setCheckedState(r02.getInt(7, 0));
    L15:
        r102.m5195E();
        m1372a();
        return;
    L5:
        if (AbstractC1293cr.m2538Q(r12, R.attr.isMaterial3Theme, false) == false) goto L12;
        int r22 = r02.getResourceId(0, 0);
        int r4 = r02.getResourceId(1, 0);
        if (r22 != f2155B) goto L12;
        if (r4 != 0) goto L12;
        super.setButtonDrawable(null);
        this.f2165l = AbstractC1406fG.m2695U(r12, R.drawable.mtrl_checkbox_button);
        this.f2167n = true;
        if (this.f2166m != null) goto L12;
        this.f2166m = AbstractC1406fG.m2695U(r12, R.drawable.mtrl_checkbox_button_icon);
        goto L12
    }

    private String getButtonStateDescription() {
        int r0 = this.f2171r;
        if (r0 == 1) goto L5;
        if (r0 != 0) goto L10;
        return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
    L10:
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    L5:
        return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2160g != null) goto L6;
        int r0 = AbstractC0295Gu.m621n(this, R.attr.colorControlActivated);
        int r1 = AbstractC0295Gu.m621n(this, R.attr.colorError);
        int r2 = AbstractC0295Gu.m621n(this, R.attr.colorSurface);
        int r3 = AbstractC0295Gu.m621n(this, R.attr.colorOnSurface);
        int[] r02 = {AbstractC0295Gu.m629v(r2, r1, 1.0f), AbstractC0295Gu.m629v(r2, r0, 1.0f), AbstractC0295Gu.m629v(r2, r3, 0.54f), AbstractC0295Gu.m629v(r2, r3, 0.38f), AbstractC0295Gu.m629v(r2, r3, 0.38f)};
        this.f2160g = new ColorStateList(f2154A, r02);
    L6:
        return this.f2160g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList r0 = this.f2168o;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (super.getButtonTintList() == null) goto L10;
        return super.getButtonTintList();
    L10:
        return getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m1372a() {
        Drawable r0 = this.f2165l;
        ColorStateList r1 = this.f2168o;
        PorterDuff.Mode r2 = getButtonTintMode();
        if (r0 != null) goto L5;
        r0 = null;
    L9:
        this.f2165l = r0;
        Drawable r02 = this.f2166m;
        ColorStateList r12 = this.f2169p;
        PorterDuff.Mode r22 = this.f2170q;
        if (r02 != null) goto L12;
        r02 = null;
    L16:
        this.f2166m = r02;
        if (this.f2167n == false) goto L58;
        C0519M2 r03 = this.f2176w;
        if (r03 == null) goto L54;
        C0433K2 r13 = r03.f1692b;
        Drawable r23 = r03.f373a;
        C0592Nq r4 = this.f2177x;
        if (r23 == null) goto L27;
        AnimatedVectorDrawable r24 = (AnimatedVectorDrawable) r23;
        if (r4.f1920a != null) goto L26;
        r4.f1920a = new C0261G2(r4);
    L26:
        r24.unregisterAnimationCallback(r4.f1920a);
    L27:
        ArrayList r25 = r03.f1695e;
        if (r25 == null) goto L36;
        if (r4 == null) goto L36;
        r25.remove(r4);
        if (r03.f1695e.size() != 0) goto L36;
        C2437r0 r26 = r03.f1694d;
        if (r26 == null) goto L36;
        r13.f1421b.removeListener(r26);
        r03.f1694d = null;
    L36:
        Drawable r27 = r03.f373a;
        if (r27 == null) goto L42;
        AnimatedVectorDrawable r28 = (AnimatedVectorDrawable) r27;
        if (r4.f1920a != null) goto L41;
        r4.f1920a = new C0261G2(r4);
    L41:
        r28.registerAnimationCallback(r4.f1920a);
        goto L54
    L42:
        if (r4 == null) goto L54;
        if (r03.f1695e != null) goto L48;
        r03.f1695e = new ArrayList();
    L48:
        if (r03.f1695e.contains(r4) == true) goto L54;
        r03.f1695e.add(r4);
        if (r03.f1694d != null) goto L53;
        r03.f1694d = new C2437r0(1, r03);
    L53:
        r13.f1421b.addListener(r03.f1694d);
    L54:
        Drawable r14 = this.f2165l;
        if ((r14 instanceof AnimatedStateListDrawable) == false) goto L58;
        if (r03 == null) goto L58;
        ((AnimatedStateListDrawable) r14).addTransition(R.id.checked, R.id.unchecked, r03, false);
        ((AnimatedStateListDrawable) this.f2165l).addTransition(R.id.indeterminate, R.id.unchecked, r03, false);
    L58:
        Drawable r04 = this.f2165l;
        if (r04 == null) goto L63;
        ColorStateList r15 = this.f2168o;
        if (r15 == null) goto L63;
        r04.setTintList(r15);
    L63:
        Drawable r05 = this.f2166m;
        if (r05 == null) goto L68;
        ColorStateList r16 = this.f2169p;
        if (r16 == null) goto L68;
        r05.setTintList(r16);
    L68:
        Drawable r06 = this.f2165l;
        Drawable r17 = this.f2166m;
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
        r02.setTintMode(r22);
        goto L16
    L5:
        if (r1 == null) goto L9;
        r0 = r0.mutate();
        if (r2 == null) goto L9;
        r0.setTintMode(r2);
        goto L9
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f2165l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f2166m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f2169p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f2170q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f2168o;
    }

    public int getCheckedState() {
        return this.f2171r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f2164k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f2171r != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2161h == true) goto L5;
        return;
    L5:
        if (this.f2168o == null) goto L7;
        return;
    L7:
        if (this.f2169p != null) goto L12;
        setUseMaterialThemeColors(true);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r4) {
        int[] r42 = super.onCreateDrawableState(r4 + 2);
        if (getCheckedState() != 2) goto L6;
        View.mergeDrawableStates(r42, f2156y);
    L6:
        if (this.f2163j == false) goto L8;
        View.mergeDrawableStates(r42, f2157z);
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
        this.f2172s = r12;
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
        if (this.f2162i == true) goto L5;
    L15:
        super.onDraw(r6);
        return;
    L5:
        if (TextUtils.isEmpty(getText()) == false) goto L15;
        Drawable r0 = getButtonDrawable();
        if (r0 == null) goto L15;
        int r2 = 1;
        if (getLayoutDirection() != 1) goto L11;
        r2 = -1;
    L11:
        int r1 = ((getWidth() - r0.getIntrinsicWidth()) / 2) * r2;
        int r22 = r6.save();
        r6.translate(r1, 0.0f);
        super.onDraw(r6);
        r6.restoreToCount(r22);
        if (getBackground() == null) goto L17;
        Rect r62 = r0.getBounds();
        getBackground().setHotspotBounds(r62.left + r1, r62.top, r62.right + r1, r62.bottom);
        return;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r3) {
        super.onInitializeAccessibilityNodeInfo(r3);
        if (r3 != null) goto L6;
        return;
    L6:
        if (this.f2163j == false) goto L9;
        r3.setText(r3.getText() + ", " + this.f2164k);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C0635Oq) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C0635Oq r22 = (C0635Oq) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        setCheckedState(r22.f2032a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0635Oq r1 = new C0635Oq(super.onSaveInstanceState());
        r1.f2032a = getCheckedState();
        return r1;
    }

    @Override // p000.C1481h3, android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
        setButtonDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setButtonIconDrawable(Drawable r1) {
        this.f2166m = r1;
        m1372a();
    }

    public void setButtonIconDrawableResource(int r2) {
        setButtonIconDrawable(AbstractC1406fG.m2695U(getContext(), r2));
    }

    public void setButtonIconTintList(ColorStateList r2) {
        if (this.f2169p != r2) goto L5;
        return;
    L5:
        this.f2169p = r2;
        m1372a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode r2) {
        if (this.f2170q != r2) goto L5;
        return;
    L5:
        this.f2170q = r2;
        m1372a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList r2) {
        if (this.f2168o != r2) goto L5;
        return;
    L5:
        this.f2168o = r2;
        m1372a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode r1) {
        setSupportButtonTintMode(r1);
        m1372a();
    }

    public void setCenterIfNoTextEnabled(boolean r1) {
        this.f2162i = r1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r1) {
        setCheckedState(r1 ? 1 : 0);
    }

    public void setCheckedState(int r4) {
        if (this.f2171r == r4) goto L33;
        this.f2171r = r4;
        if (r4 != 1) goto L7;
        boolean r42 = true;
    L8:
        super.setChecked(r42);
        refreshDrawableState();
        if (Build.VERSION.SDK_INT < 30) goto L14;
        if (this.f2174u != null) goto L14;
        super.setStateDescription(getButtonStateDescription());
    L14:
        if (this.f2173t == true) goto L34;
        this.f2173t = true;
        LinkedHashSet r43 = this.f2159f;
        if (r43 == null) goto L24;
        Iterator r44 = r43.iterator();
        if (r44.hasNext() == false) goto L24;
        r44.next().getClass();
        throw new ClassCastException();
    L24:
        if (this.f2171r == 2) goto L28;
        CompoundButton.OnCheckedChangeListener r45 = this.f2175v;
        if (r45 == null) goto L28;
        r45.onCheckedChanged(this, isChecked());
    L28:
        AutofillManager r46 = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (r46 == null) goto L31;
        r46.notifyValueChanged(this);
    L31:
        this.f2173t = false;
        return;
    L34:
        return;
    L7:
        r42 = false;
        goto L8
    }

    public void setErrorAccessibilityLabel(CharSequence r1) {
        this.f2164k = r1;
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
        if (this.f2163j == r2) goto L10;
        this.f2163j = r2;
        refreshDrawableState();
        Iterator r22 = this.f2158e.iterator();
        if (r22.hasNext() == true) goto L8;
        return;
    L8:
        r22.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener r1) {
        this.f2175v = r1;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence r3) {
        this.f2174u = r3;
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
        this.f2161h = r1;
        if (r1 == false) goto L6;
        setButtonTintList(getMaterialThemeColorsTintList());
        return;
    L6:
        setButtonTintList(null);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C1481h3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable r1) {
        this.f2165l = r1;
        this.f2167n = false;
        m1372a();
    }
}
