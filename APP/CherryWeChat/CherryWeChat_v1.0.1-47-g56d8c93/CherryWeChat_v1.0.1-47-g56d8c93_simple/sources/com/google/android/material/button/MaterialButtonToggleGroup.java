package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C1283e;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.AbstractC0148Dc;
import p000.AbstractC0248Fq;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.AbstractC2185lE;
import p000.C1196az;
import p000.C1486h8;
import p000.C2436r;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC0248Fq {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f4498q = 0;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f4499k;

    /* JADX INFO: renamed from: l */
    public boolean f4500l;

    /* JADX INFO: renamed from: m */
    public boolean f4501m;

    /* JADX INFO: renamed from: n */
    public boolean f4502n;

    /* JADX INFO: renamed from: o */
    public final int f4503o;

    /* JADX INFO: renamed from: p */
    public HashSet f4504p;

    public MaterialButtonToggleGroup(Context r8, AttributeSet r9) {
        super(AbstractC0148Dc.m291y(r8, r9, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), r9);
        this.f4499k = new LinkedHashSet();
        this.f4500l = false;
        this.f4504p = new HashSet();
        int[] r3 = AbstractC0939Vu.f2943l;
        TypedArray r92 = AbstractC1293cr.m2534G(getContext(), r9, r3, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(r92.getBoolean(7, false));
        this.f4503o = r92.getResourceId(2, -1);
        this.f4502n = r92.getBoolean(4, false);
        if (this.f812f != null) goto L5;
        this.f812f = C1196az.m2313b(new C2436r(0.0f));
    L5:
        setEnabled(r92.getBoolean(0, true));
        r92.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        if (this.f4501m == false) goto L7;
        Class r0 = RadioButton.class;
    L6:
        return r0.getName();
    L7:
        r0 = ToggleButton.class;
        goto L6
    }

    private int getVisibleButtonCount() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= getChildCount()) goto L11;
        if ((getChildAt(r0) instanceof MaterialButton) == false) goto L10;
        if (getChildAt(r0).getVisibility() == 8) goto L10;
        r1 = r1 + 1;
    L10:
        r0 = r0 + 1;
        goto L4
    L11:
        return r1;
    }

    private void setupButtonChild(MaterialButton r3) {
        r3.setMaxLines(1);
        r3.setEllipsize(TextUtils.TruncateAt.END);
        r3.setCheckable(true);
        r3.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // p000.AbstractC0248Fq, android.view.ViewGroup
    public final void addView(View r2, int r3, ViewGroup.LayoutParams r4) {
        if ((r2 instanceof MaterialButton) == true) goto L5;
        return;
    L5:
        super.addView(r2, r3, r4);
        MaterialButton r22 = (MaterialButton) r2;
        setupButtonChild(r22);
        m2455f(r22.getId(), r22.f4486o);
        AbstractC2185lE.m4399l(r22, new C1486h8(1, this));
    }

    /* JADX INFO: renamed from: f */
    public final void m2455f(int r3, boolean r4) {
        if (r3 == (-1)) goto L27;
        HashSet r0 = new HashSet(this.f4504p);
        if (r4 == true) goto L8;
    L15:
        if (r4 == false) goto L17;
        return;
    L17:
        if (r0.contains(Integer.valueOf(r3)) == true) goto L19;
        return;
    L19:
        if (this.f4502n == true) goto L21;
    L22:
        r0.remove(Integer.valueOf(r3));
    L23:
        m2456g(r0);
        return;
    L21:
        if (r0.size() <= 1) goto L23;
    L8:
        if (r0.contains(Integer.valueOf(r3)) == true) goto L15;
        if (this.f4501m == true) goto L12;
    L14:
        r0.add(Integer.valueOf(r3));
        goto L23
    L12:
        if (r0.isEmpty() == true) goto L14;
        r0.clear();
        goto L14
    }

    /* JADX INFO: renamed from: g */
    public final void m2456g(Set r8) {
        HashSet r0 = this.f4504p;
        this.f4504p = new HashSet(r8);
        int r2 = 0;
    L4:
        if (r2 >= getChildCount()) goto L15;
        int r3 = ((MaterialButton) getChildAt(r2)).getId();
        boolean r4 = r8.contains(Integer.valueOf(r3));
        View r5 = findViewById(r3);
        if ((r5 instanceof MaterialButton) == false) goto L9;
        this.f4500l = true;
        ((MaterialButton) r5).setChecked(r4);
        this.f4500l = false;
    L9:
        if (r0.contains(Integer.valueOf(r3)) == r8.contains(Integer.valueOf(r3))) goto L14;
        r8.contains(Integer.valueOf(r3));
        Iterator r32 = this.f4499k.iterator();
    L12:
        if (r32.hasNext() == false) goto L14;
        ((C1283e) r32.next()).m2509a();
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        invalidate();
    }

    public int getCheckedButtonId() {
        if (this.f4501m == true) goto L5;
        return -1;
    L5:
        if (this.f4504p.isEmpty() == false) goto L7;
        return -1;
    L7:
        return ((Integer) this.f4504p.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= getChildCount()) goto L9;
        int r2 = ((MaterialButton) getChildAt(r1)).getId();
        if (this.f4504p.contains(Integer.valueOf(r2)) == false) goto L8;
        r0.add(Integer.valueOf(r2));
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int r1 = this.f4503o;
        if (r1 == (-1)) goto L6;
        m2456g(Collections.singleton(Integer.valueOf(r1)));
        return;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r5) {
        super.onInitializeAccessibilityNodeInfo(r5);
        int r0 = getVisibleButtonCount();
        if (this.f4501m == false) goto L5;
        int r1 = 1;
    L6:
        r5.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, r0, false, r1));
        return;
    L5:
        r1 = 2;
        goto L6
    }

    public void setSelectionRequired(boolean r1) {
        this.f4502n = r1;
    }

    public void setSingleSelection(boolean r3) {
        if (this.f4501m == r3) goto L5;
        this.f4501m = r3;
        m2456g(new HashSet());
    L5:
        String r32 = getChildrenA11yClassName();
        int r0 = 0;
    L7:
        if (r0 >= getChildCount()) goto L9;
        ((MaterialButton) getChildAt(r0)).setA11yClassName(r32);
        r0 = r0 + 1;
        goto L7
    }

    public void setSingleSelection(int r2) {
        setSingleSelection(getResources().getBoolean(r2));
    }
}
