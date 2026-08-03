package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
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
import io.github.cherrywechat.R;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: Bq */
/* JADX INFO: loaded from: classes.dex */
public final class C0076Bq extends C1306d3 {

    /* JADX INFO: renamed from: e */
    public final C0289Go f177e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f178f;

    /* JADX INFO: renamed from: g */
    public final Rect f179g;

    /* JADX INFO: renamed from: h */
    public final int f180h;

    /* JADX INFO: renamed from: i */
    public final float f181i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f182j;

    /* JADX INFO: renamed from: k */
    public int f183k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f184l;

    public C0076Bq(Context r8, AttributeSet r9) {
        super(AbstractC0148Dc.m291y(r8, r9, R.attr.autoCompleteTextViewStyle, 0), r9);
        this.f179g = new Rect();
        Context r0 = getContext();
        TypedArray r82 = AbstractC1293cr.m2534G(r0, r9, AbstractC0939Vu.f2940i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (r82.hasValue(0) == true) goto L5;
    L7:
        this.f180h = r82.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f181i = r82.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (r82.hasValue(2) == false) goto L10;
        this.f182j = ColorStateList.valueOf(r82.getColor(2, 0));
    L10:
        this.f183k = r82.getColor(4, 0);
        this.f184l = AbstractC0828TB.m1643j(r0, r82, 5);
        this.f178f = (AccessibilityManager) r0.getSystemService("accessibility");
        C0289Go r3 = new C0289Go(r0, null, R.attr.listPopupWindowStyle, 0);
        this.f177e = r3;
        r3.f961y = true;
        r3.f962z.setFocusable(true);
        r3.f951o = this;
        r3.f962z.setInputMethodMode(2);
        r3.mo584p(getAdapter());
        r3.f952p = new C1122a4(1, this);
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

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ CharSequence m125a(C0076Bq r0, Object r1) {
        return r0.convertSelectionToString(r1);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m126b() {
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

    /* JADX INFO: renamed from: c */
    public final boolean m127c() {
        AccessibilityManager r0 = this.f178f;
        if (r0 != null) goto L5;
    L7:
        if (r0 != null) goto L9;
        return false;
    L9:
        if (r0.isEnabled() == false) goto L32;
        List<AccessibilityServiceInfo> r02 = r0.getEnabledAccessibilityServiceList(16);
        if (r02 == null) goto L31;
        Iterator<AccessibilityServiceInfo> r03 = r02.iterator();
    L15:
        if (r03.hasNext() == false) goto L33;
        AccessibilityServiceInfo r1 = r03.next();
        if (r1.getSettingsActivityName() == null) goto L15;
        if (r1.getSettingsActivityName().contains("SwitchAccess") == false) goto L15;
        return true;
    L33:
        return false;
    L31:
        return false;
    L32:
        return false;
    L5:
        if (r0.isTouchExplorationEnabled() == false) goto L7;
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m127c() == false) goto L6;
        this.f177e.dismiss();
        return;
    L6:
        super.dismissDropDown();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f182j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout r0 = m126b();
        if (r0 == null) goto L9;
        if (r0.f4599F == false) goto L9;
        return r0.getHint();
    L9:
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f181i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f183k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f184l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout r0 = m126b();
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.f4599F == true) goto L7;
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
        this.f177e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r14, int r15) {
        super.onMeasure(r14, r15);
        if (View.MeasureSpec.getMode(r14) != Integer.MIN_VALUE) goto L30;
        int r152 = getMeasuredWidth();
        ListAdapter r0 = getAdapter();
        TextInputLayout r1 = m126b();
        int r2 = 0;
        if (r0 == null) goto L25;
        if (r1 == null) goto L25;
        int r3 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int r4 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        C0289Go r5 = this.f177e;
        if (r5.f962z.isShowing() == true) goto L11;
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
        Drawable r02 = r5.f962z.getBackground();
        if (r02 == null) goto L24;
        Rect r22 = this.f179g;
        r02.getPadding(r22);
        r7 = r7 + (r22.left + r22.right);
    L24:
        r2 = r1.getEndIconView().getMeasuredWidth() + r7;
        goto L25
    L11:
        r6 = r5.f939c.getSelectedItemPosition();
    L25:
        setMeasuredDimension(Math.min(Math.max(r152, r2), View.MeasureSpec.getSize(r14)), getMeasuredHeight());
        return;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean r2) {
        if (m127c() == false) goto L5;
        return;
    L5:
        super.onWindowFocusChanged(r2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T r2) {
        super.setAdapter(r2);
        this.f177e.mo584p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable r2) {
        super.setDropDownBackgroundDrawable(r2);
        C0289Go r0 = this.f177e;
        if (r0 == null) goto L6;
        r0.m579g(r2);
        return;
    }

    public void setDropDownBackgroundTint(int r1) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(r1));
    }

    public void setDropDownBackgroundTintList(ColorStateList r2) {
        this.f182j = r2;
        Drawable r22 = getDropDownBackground();
        if ((r22 instanceof C1021Xq) == false) goto L6;
        ((C1021Xq) r22).m1928n(this.f182j);
        return;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener r2) {
        super.setOnItemSelectedListener(r2);
        C0289Go r22 = this.f177e;
        r22.f953q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int r1) {
        super.setRawInputType(r1);
        TextInputLayout r12 = m126b();
        if (r12 == null) goto L6;
        r12.m2493u();
        return;
    }

    public void setSimpleItemSelectedColor(int r1) {
        this.f183k = r1;
        if ((getAdapter() instanceof C0033Aq) == false) goto L6;
        ((C0033Aq) getAdapter()).m56a();
        return;
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList r1) {
        this.f184l = r1;
        if ((getAdapter() instanceof C0033Aq) == false) goto L6;
        ((C0033Aq) getAdapter()).m56a();
        return;
    }

    public void setSimpleItems(int r2) {
        setSimpleItems(getResources().getStringArray(r2));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m127c() == false) goto L6;
        this.f177e.mo577c();
        return;
    L6:
        super.showDropDown();
    }

    public void setSimpleItems(String[] r4) {
        setAdapter(new C0033Aq(this, getContext(), this.f180h, r4));
    }
}
