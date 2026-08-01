package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.d;
import com.ljx.wechatmod.R;
import defpackage.a80;
import defpackage.aa;
import defpackage.e;
import defpackage.e30;
import defpackage.et;
import defpackage.f30;
import defpackage.ff;
import defpackage.gt;
import defpackage.ja0;
import defpackage.l0;
import defpackage.nt;
import defpackage.ot;
import defpackage.s90;
import defpackage.t90;
import defpackage.wy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final ArrayList a;
    public final l0 b;
    public final LinkedHashSet c;
    public final nt d;
    public Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public HashSet j;

    public MaterialButtonToggleGroup(Context r8, AttributeSet r9) {
        super(ff.W(r8, r9, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), r9, R.attr.materialButtonToggleGroupStyle);
        this.a = new ArrayList();
        this.b = new l0(18, this);
        this.c = new LinkedHashSet();
        this.d = new nt(this);
        this.f = false;
        this.j = new HashSet();
        int[] r3 = wy.k;
        TypedArray r92 = a80.u(getContext(), r9, r3, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(r92.getBoolean(3, false));
        this.i = r92.getResourceId(1, -1);
        this.h = r92.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(r92.getBoolean(0, true));
        r92.recycle();
        WeakHashMap r82 = ja0.a;
        s90.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int r0 = getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        if (c(r1) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r1;
    L8:
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L8;
        if (c(r0) == true) goto L6;
        r0 = r0 - 1;
        goto L3
    L6:
        return r0;
    L8:
        return -1;
    }

    private int getVisibleButtonCount() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= getChildCount()) goto L11;
        if ((getChildAt(r0) instanceof MaterialButton) == false) goto L10;
        if (c(r0) == false) goto L10;
        r1 = r1 + 1;
    L10:
        r0 = r0 + 1;
        goto L4
    L11:
        return r1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton r3) {
        if (r3.getId() != (-1)) goto L6;
        WeakHashMap r0 = ja0.a;
        r3.setId(t90.a());
        return;
    }

    private void setupButtonChild(MaterialButton r3) {
        r3.setMaxLines(1);
        r3.setEllipsize(TextUtils.TruncateAt.END);
        r3.setCheckable(true);
        r3.setOnPressedChangeListenerInternal(this.b);
        r3.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int r0 = getFirstVisibleChildIndex();
        if (r0 == (-1)) goto L31;
        int r2 = r0 + 1;
    L7:
        if (r2 >= getChildCount()) goto L18;
        MaterialButton r3 = (MaterialButton) getChildAt(r2);
        int r5 = Math.min(r3.getStrokeWidth(), ((MaterialButton) getChildAt(r2 - 1)).getStrokeWidth());
        ViewGroup.LayoutParams r6 = r3.getLayoutParams();
        if ((r6 instanceof LinearLayout.LayoutParams) == false) goto L11;
        LinearLayout.LayoutParams r62 = (LinearLayout.LayoutParams) r6;
    L13:
        if (getOrientation() != 0) goto L15;
        et.g(r62, 0);
        et.h(r62, -r5);
        r62.topMargin = 0;
    L16:
        r3.setLayoutParams(r62);
        r2 = r2 + 1;
        goto L7
    L15:
        r62.bottomMargin = 0;
        r62.topMargin = -r5;
        et.h(r62, 0);
        goto L16
    L11:
        r62 = new LinearLayout.LayoutParams(r6.width, r6.height);
        goto L13
    L18:
        if (getChildCount() == 0) goto L30;
        if (r0 == (-1)) goto L32;
        LinearLayout.LayoutParams r02 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(r0)).getLayoutParams();
        if (getOrientation() != 1) goto L25;
        r02.topMargin = 0;
        r02.bottomMargin = 0;
        return;
    L25:
        et.g(r02, 0);
        et.h(r02, 0);
        r02.leftMargin = 0;
        r02.rightMargin = 0;
        return;
    L32:
        return;
    L30:
        return;
    }

    @Override // android.view.ViewGroup
    public final void addView(View r4, int r5, ViewGroup.LayoutParams r6) {
        if ((r4 instanceof MaterialButton) == true) goto L6;
        Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
        return;
    L6:
        super.addView(r4, r5, r6);
        MaterialButton r42 = (MaterialButton) r4;
        setGeneratedIdIfNeeded(r42);
        setupButtonChild(r42);
        b(r42.getId(), r42.o);
        f30 r52 = r42.getShapeAppearanceModel();
        ot r62 = new ot(r52.e, r52.h, r52.f, r52.g);
        this.a.add(r62);
        r42.setEnabled(isEnabled());
        ja0.l(r42, new aa(1, this));
    }

    public final void b(int r3, boolean r4) {
        if (r3 != (-1)) goto L6;
        Log.e("MButtonToggleGroup", "Button ID is not valid: " + r3);
        return;
    L6:
        HashSet r0 = new HashSet(this.j);
        if (r4 == true) goto L9;
    L16:
        if (r4 == false) goto L18;
        return;
    L18:
        if (r0.contains(Integer.valueOf(r3)) == true) goto L20;
        return;
    L20:
        if (this.h == true) goto L22;
    L23:
        r0.remove(Integer.valueOf(r3));
    L24:
        d(r0);
        return;
    L22:
        if (r0.size() <= 1) goto L24;
    L9:
        if (r0.contains(Integer.valueOf(r3)) == true) goto L16;
        if (this.g == true) goto L13;
    L15:
        r0.add(Integer.valueOf(r3));
        goto L24
    L13:
        if (r0.isEmpty() == true) goto L15;
        r0.clear();
        goto L15
    }

    public final boolean c(int r2) {
        if (getChildAt(r2).getVisibility() == 8) goto L6;
        return true;
    L6:
        return false;
    }

    public final void d(Set r8) {
        HashSet r0 = this.j;
        this.j = new HashSet(r8);
        int r2 = 0;
    L4:
        if (r2 >= getChildCount()) goto L15;
        int r3 = ((MaterialButton) getChildAt(r2)).getId();
        boolean r4 = r8.contains(Integer.valueOf(r3));
        View r5 = findViewById(r3);
        if ((r5 instanceof MaterialButton) == false) goto L9;
        this.f = true;
        ((MaterialButton) r5).setChecked(r4);
        this.f = false;
    L9:
        if (r0.contains(Integer.valueOf(r3)) == r8.contains(Integer.valueOf(r3))) goto L14;
        r8.contains(Integer.valueOf(r3));
        Iterator r32 = this.c.iterator();
    L12:
        if (r32.hasNext() == false) goto L14;
        ((d) r32.next()).a();
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas r7) {
        TreeMap r0 = new TreeMap(this.d);
        int r1 = getChildCount();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r0.put((MaterialButton) getChildAt(r3), Integer.valueOf(r3));
        r3 = r3 + 1;
        goto L3
    L5:
        this.e = (Integer[]) r0.values().toArray(new Integer[0]);
        super.dispatchDraw(r7);
    }

    public final void e() {
        int r0 = getChildCount();
        int r1 = getFirstVisibleChildIndex();
        int r2 = getLastVisibleChildIndex();
        int r4 = 0;
    L3:
        if (r4 >= r0) goto L36;
        MaterialButton r5 = (MaterialButton) getChildAt(r4);
        if (r5.getVisibility() == 8) goto L35;
        e30 r6 = r5.getShapeAppearanceModel().e();
        ot r7 = (ot) this.a.get(r4);
        if (r1 != r2) goto L11;
    L31:
        if (r7 != null) goto L33;
        r6.e = new e(0.0f);
        r6.f = new e(0.0f);
        r6.g = new e(0.0f);
        r6.h = new e(0.0f);
    L34:
        r5.setShapeAppearanceModel(r6.a());
        goto L35
    L33:
        r6.e = r7.a;
        r6.h = r7.d;
        r6.f = r7.b;
        r6.g = r7.c;
        goto L34
    L11:
        if (getOrientation() != 0) goto L13;
        boolean r8 = true;
    L14:
        e r9 = ot.e;
        if (r4 != r1) goto L23;
        if (r8 == true) goto L18;
        ot r82 = new ot(r7.a, r9, r7.b, r9);
    L20:
        r7 = r82;
        goto L31
    L18:
        if (gt.n(this) == false) goto L21;
        r82 = new ot(r9, r9, r7.b, r7.c);
        goto L20
    L21:
        r82 = new ot(r7.a, r7.d, r9, r9);
        goto L20
    L23:
        if (r4 != r2) goto L30;
        if (r8 == true) goto L26;
        r82 = new ot(r9, r7.d, r9, r7.c);
        goto L20
    L26:
        if (gt.n(this) == false) goto L28;
        r82 = new ot(r7.a, r7.d, r9, r9);
        goto L20
    L28:
        r82 = new ot(r9, r9, r7.b, r7.c);
        goto L20
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
        if (this.g == true) goto L5;
        return -1;
    L5:
        if (this.j.isEmpty() == false) goto L7;
        return -1;
    L7:
        return ((Integer) this.j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList r0 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= getChildCount()) goto L9;
        int r2 = ((MaterialButton) getChildAt(r1)).getId();
        if (this.j.contains(Integer.valueOf(r2)) == false) goto L8;
        r0.add(Integer.valueOf(r2));
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
        Integer[] r22 = this.e;
        if (r22 != null) goto L5;
    L9:
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return r3;
    L5:
        if (r3 >= r22.length) goto L9;
        return r22[r3].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int r1 = this.i;
        if (r1 == (-1)) goto L6;
        d(Collections.singleton(Integer.valueOf(r1)));
        return;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r5) {
        super.onInitializeAccessibilityNodeInfo(r5);
        int r0 = getVisibleButtonCount();
        if (this.g == false) goto L5;
        int r1 = 1;
    L6:
        r5.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, r0, false, r1));
        return;
    L5:
        r1 = 2;
        goto L6
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        e();
        a();
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
        this.a.remove(r32);
    L8:
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean r3) {
        super.setEnabled(r3);
        int r0 = 0;
    L4:
        if (r0 >= getChildCount()) goto L6;
        ((MaterialButton) getChildAt(r0)).setEnabled(r3);
        r0 = r0 + 1;
        goto L4
    }

    public void setSelectionRequired(boolean r1) {
        this.h = r1;
    }

    public void setSingleSelection(boolean r3) {
        if (this.g == r3) goto L5;
        this.g = r3;
        d(new HashSet());
    L5:
        int r32 = 0;
    L7:
        if (r32 >= getChildCount()) goto L14;
        if (this.g == false) goto L12;
        Class r0 = RadioButton.class;
    L11:
        String r02 = r0.getName();
        ((MaterialButton) getChildAt(r32)).setA11yClassName(r02);
        r32 = r32 + 1;
        goto L7
    L12:
        r0 = ToggleButton.class;
        goto L11
    }

    public void setSingleSelection(int r2) {
        setSingleSelection(getResources().getBoolean(r2));
    }
}
