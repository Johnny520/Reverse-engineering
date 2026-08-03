package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0728f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import org.luckypray.dexkit.C1031R;
import p003B0.AbstractC0059a;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p050c0.C0695t;
import p058g0.AbstractC0942a;
import p070m0.C0994d;
import p070m0.C0995e;
import p081s0.AbstractC1077k;
import p089x0.C1117a;
import p089x0.C1126j;
import p089x0.C1127k;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f2353k = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2354a;

    /* JADX INFO: renamed from: b */
    public final C0095d f2355b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f2356c;

    /* JADX INFO: renamed from: d */
    public final C0695t f2357d;

    /* JADX INFO: renamed from: e */
    public Integer[] f2358e;

    /* JADX INFO: renamed from: f */
    public boolean f2359f;

    /* JADX INFO: renamed from: g */
    public boolean f2360g;

    /* JADX INFO: renamed from: h */
    public boolean f2361h;

    /* JADX INFO: renamed from: i */
    public final int f2362i;

    /* JADX INFO: renamed from: j */
    public HashSet f2363j;

    public MaterialButtonToggleGroup(Context r11, AttributeSet r12) {
        super(AbstractC0059a.m197a(r11, r12, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), r12, C1031R.attr.materialButtonToggleGroupStyle);
        this.f2354a = new ArrayList();
        this.f2355b = new C0095d(21, this);
        this.f2356c = new LinkedHashSet();
        this.f2357d = new C0695t(4, this);
        this.f2359f = false;
        this.f2363j = new HashSet();
        Context r7 = getContext();
        int[] r8 = AbstractC0942a.f3338j;
        AbstractC1077k.m2553a(r7, r12, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        AbstractC1077k.m2554b(r7, r12, r8, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        TypedArray r122 = r7.obtainStyledAttributes(r12, r8, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        setSingleSelection(r122.getBoolean(3, false));
        this.f2362i = r122.getResourceId(1, -1);
        this.f2361h = r122.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(r122.getBoolean(0, true));
        r122.recycle();
        Field r112 = AbstractC0080Q.f219a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int r02 = getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        if (m1860c(r1) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int r02 = getChildCount() - 1;
    L3:
        if (r02 < 0) goto L8;
        if (m1860c(r02) == true) goto L6;
        r02 = r02 - 1;
        goto L3
    L6:
        return r02;
    L8:
        return -1;
    }

    private int getVisibleButtonCount() {
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r02 >= getChildCount()) goto L11;
        if ((getChildAt(r02) instanceof MaterialButton) == false) goto L10;
        if (m1860c(r02) == false) goto L10;
        r1 = r1 + 1;
    L10:
        r02 = r02 + 1;
        goto L4
    L11:
        return r1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton r3) {
        if (r3.getId() != (-1)) goto L6;
        Field r02 = AbstractC0080Q.f219a;
        r3.setId(View.generateViewId());
        return;
    }

    private void setupButtonChild(MaterialButton r3) {
        r3.setMaxLines(1);
        r3.setEllipsize(TextUtils.TruncateAt.END);
        r3.setCheckable(true);
        r3.setOnPressedChangeListenerInternal(this.f2355b);
        r3.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1858a() {
        int r02 = getFirstVisibleChildIndex();
        if (r02 != (-1)) goto L5;
        return;
    L5:
        int r2 = r02 + 1;
    L7:
        if (r2 >= getChildCount()) goto L18;
        MaterialButton r3 = (MaterialButton) getChildAt(r2);
        int r5 = Math.min(r3.getStrokeWidth(), ((MaterialButton) getChildAt(r2 - 1)).getStrokeWidth());
        ViewGroup.LayoutParams r6 = r3.getLayoutParams();
        if ((r6 instanceof LinearLayout.LayoutParams) == false) goto L11;
        LinearLayout.LayoutParams r62 = (LinearLayout.LayoutParams) r6;
    L13:
        if (getOrientation() != 0) goto L15;
        r62.setMarginEnd(0);
        r62.setMarginStart(-r5);
        r62.topMargin = 0;
    L16:
        r3.setLayoutParams(r62);
        r2 = r2 + 1;
        goto L7
    L15:
        r62.bottomMargin = 0;
        r62.topMargin = -r5;
        r62.setMarginStart(0);
        goto L16
    L11:
        r62 = new LinearLayout.LayoutParams(r6.width, r6.height);
        goto L13
    L18:
        if (getChildCount() == 0) goto L29;
        if (r02 == (-1)) goto L31;
        LinearLayout.LayoutParams r03 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(r02)).getLayoutParams();
        if (getOrientation() != 1) goto L24;
        r03.topMargin = 0;
        r03.bottomMargin = 0;
        return;
    L24:
        r03.setMarginEnd(0);
        r03.setMarginStart(0);
        r03.leftMargin = 0;
        r03.rightMargin = 0;
        return;
    L31:
        return;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r5, int r6, ViewGroup.LayoutParams r7) {
        if ((r5 instanceof MaterialButton) == true) goto L5;
        return;
    L5:
        super.addView(r5, r6, r7);
        MaterialButton r52 = (MaterialButton) r5;
        setGeneratedIdIfNeeded(r52);
        setupButtonChild(r52);
        m1859b(r52.getId(), r52.f2350o);
        C1127k r62 = r52.getShapeAppearanceModel();
        this.f2354a.add(new C0995e(r62.f4351e, r62.f4354h, r62.f4352f, r62.f4353g));
        r52.setEnabled(isEnabled());
        AbstractC0080Q.m291j(r52, new C0994d(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public final void m1859b(int r3, boolean r4) {
        if (r3 != (-1)) goto L5;
        return;
    L5:
        HashSet r02 = new HashSet(this.f2363j);
        if (r4 == true) goto L8;
    L15:
        if (r4 == false) goto L17;
        return;
    L17:
        if (r02.contains(Integer.valueOf(r3)) == true) goto L19;
        return;
    L19:
        if (this.f2361h == true) goto L21;
    L22:
        r02.remove(Integer.valueOf(r3));
    L23:
        m1861d(r02);
        return;
    L21:
        if (r02.size() <= 1) goto L23;
    L8:
        if (r02.contains(Integer.valueOf(r3)) == true) goto L15;
        if (this.f2360g == true) goto L12;
    L14:
        r02.add(Integer.valueOf(r3));
        goto L23
    L12:
        if (r02.isEmpty() == true) goto L14;
        r02.clear();
        goto L14
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1860c(int r2) {
        if (getChildAt(r2).getVisibility() == 8) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m1861d(Set r8) {
        HashSet r02 = this.f2363j;
        this.f2363j = new HashSet(r8);
        int r2 = 0;
    L4:
        if (r2 >= getChildCount()) goto L15;
        int r3 = ((MaterialButton) getChildAt(r2)).getId();
        boolean r4 = r8.contains(Integer.valueOf(r3));
        View r5 = findViewById(r3);
        if ((r5 instanceof MaterialButton) == false) goto L9;
        this.f2359f = true;
        ((MaterialButton) r5).setChecked(r4);
        this.f2359f = false;
    L9:
        if (r02.contains(Integer.valueOf(r3)) == r8.contains(Integer.valueOf(r3))) goto L14;
        r8.contains(Integer.valueOf(r3));
        Iterator r32 = this.f2356c.iterator();
    L12:
        if (r32.hasNext() == false) goto L14;
        ((C0728f) r32.next()).m1917a();
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r7) {
        TreeMap r02 = new TreeMap(this.f2357d);
        int r1 = getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r02.put((MaterialButton) getChildAt(r3), Integer.valueOf(r3));
        r3 = r3 + 1;
        goto L3
    L5:
        this.f2358e = (Integer[]) r02.values().toArray(new Integer[0]);
        super.dispatchDraw(r7);
    }

    /* JADX INFO: renamed from: e */
    public final void m1862e() {
        int r02 = getChildCount();
        int r1 = getFirstVisibleChildIndex();
        int r2 = getLastVisibleChildIndex();
        int r4 = 0;
    L3:
        if (r4 >= r02) goto L36;
        MaterialButton r5 = (MaterialButton) getChildAt(r4);
        if (r5.getVisibility() == 8) goto L35;
        C1126j r6 = r5.getShapeAppearanceModel().m2660d();
        C0995e r7 = (C0995e) this.f2354a.get(r4);
        if (r1 != r2) goto L11;
    L31:
        if (r7 != null) goto L33;
        r6.f4339e = new C1117a(0.0f);
        r6.f4340f = new C1117a(0.0f);
        r6.f4341g = new C1117a(0.0f);
        r6.f4342h = new C1117a(0.0f);
    L34:
        r5.setShapeAppearanceModel(r6.m2656a());
        goto L35
    L33:
        r6.f4339e = r7.f3553a;
        r6.f4342h = r7.f3556d;
        r6.f4340f = r7.f3554b;
        r6.f4341g = r7.f3555c;
        goto L34
    L11:
        if (getOrientation() != 0) goto L13;
        boolean r8 = true;
    L14:
        C1117a r9 = C0995e.f3552e;
        if (r4 != r1) goto L23;
        if (r8 == true) goto L18;
        C0995e r82 = new C0995e(r7.f3553a, r9, r7.f3554b, r9);
    L21:
        r7 = r82;
        goto L31
    L18:
        if (AbstractC1077k.m2557e(this) == false) goto L20;
        r82 = new C0995e(r9, r9, r7.f3554b, r7.f3555c);
        goto L21
    L20:
        r82 = new C0995e(r7.f3553a, r7.f3556d, r9, r9);
        goto L21
    L23:
        if (r4 != r2) goto L30;
        if (r8 == true) goto L26;
        r82 = new C0995e(r9, r7.f3556d, r9, r7.f3555c);
        goto L21
    L26:
        if (AbstractC1077k.m2557e(this) == false) goto L28;
        r82 = new C0995e(r7.f3553a, r7.f3556d, r9, r9);
        goto L21
    L28:
        r82 = new C0995e(r9, r9, r7.f3554b, r7.f3555c);
        goto L21
    L30:
        r7 = null;
        goto L31
    L13:
        r8 = false;
    L35:
        r4 = r4 + 1;
        goto L3
    }

    public int getCheckedButtonId() {
        if (this.f2360g == true) goto L5;
    L7:
        return -1;
    L5:
        if (this.f2363j.isEmpty() == true) goto L7;
        return ((Integer) this.f2363j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= getChildCount()) goto L9;
        int r2 = ((MaterialButton) getChildAt(r1)).getId();
        if (this.f2363j.contains(Integer.valueOf(r2)) == false) goto L8;
        r02.add(Integer.valueOf(r2));
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r02;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
        Integer[] r22 = this.f2358e;
        if (r22 != null) goto L5;
    L9:
        return r3;
    L5:
        if (r3 >= r22.length) goto L9;
        return r22[r3].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int r1 = this.f2362i;
        if (r1 == (-1)) goto L6;
        m1861d(Collections.singleton(Integer.valueOf(r1)));
        return;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r5) {
        super.onInitializeAccessibilityNodeInfo(r5);
        int r02 = getVisibleButtonCount();
        if (this.f2360g == false) goto L5;
        int r1 = 1;
    L6:
        r5.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, r02, false, r1));
        return;
    L5:
        r1 = 2;
        goto L6
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        m1862e();
        m1858a();
        super.onMeasure(r1, r2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View r3) {
        super.onViewRemoved(r3);
        if ((r3 instanceof MaterialButton) == false) goto L5;
        ((MaterialButton) r3).setOnPressedChangeListenerInternal(null);
    L5:
        int r32 = indexOfChild(r3);
        if (r32 < 0) goto L8;
        this.f2354a.remove(r32);
    L8:
        m1862e();
        m1858a();
    }

    @Override // android.view.View
    public void setEnabled(boolean r3) {
        super.setEnabled(r3);
        int r02 = 0;
    L4:
        if (r02 >= getChildCount()) goto L6;
        ((MaterialButton) getChildAt(r02)).setEnabled(r3);
        r02 = r02 + 1;
        goto L4
    }

    public void setSelectionRequired(boolean r1) {
        this.f2361h = r1;
    }

    public void setSingleSelection(boolean r3) {
        if (this.f2360g == r3) goto L5;
        this.f2360g = r3;
        m1861d(new HashSet());
    L5:
        int r32 = 0;
    L7:
        if (r32 >= getChildCount()) goto L14;
        if (this.f2360g == false) goto L12;
        Class r02 = RadioButton.class;
    L11:
        String r03 = r02.getName();
        ((MaterialButton) getChildAt(r32)).setA11yClassName(r03);
        r32 = r32 + 1;
        goto L7
    L12:
        r02 = ToggleButton.class;
        goto L11
    }

    public void setSingleSelection(int r2) {
        setSingleSelection(getResources().getBoolean(r2));
    }
}
