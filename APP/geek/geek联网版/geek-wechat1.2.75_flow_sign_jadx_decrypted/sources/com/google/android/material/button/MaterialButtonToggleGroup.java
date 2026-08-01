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
import com.google.android.material.timepicker.C0119d;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p000.AbstractC0168dz;
import p000.AbstractC0259gf;
import p000.AbstractC0423kt;
import p000.AbstractC0498mu;
import p000.C0169e;
import p000.C0328ia;
import p000.C0431l0;
import p000.C0682rt;
import p000.C0719st;
import p000.g80;
import p000.l30;
import p000.m30;
import p000.oa0;
import p000.x90;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f1010k = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1011a;

    /* JADX INFO: renamed from: b */
    public final C0431l0 f1012b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f1013c;

    /* JADX INFO: renamed from: d */
    public final C0682rt f1014d;

    /* JADX INFO: renamed from: e */
    public Integer[] f1015e;

    /* JADX INFO: renamed from: f */
    public boolean f1016f;

    /* JADX INFO: renamed from: g */
    public boolean f1017g;

    /* JADX INFO: renamed from: h */
    public boolean f1018h;

    /* JADX INFO: renamed from: i */
    public final int f1019i;

    /* JADX INFO: renamed from: j */
    public HashSet f1020j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0259gf.m1245c0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f1011a = new ArrayList();
        this.f1012b = new C0431l0(18, this);
        this.f1013c = new LinkedHashSet();
        this.f1014d = new C0682rt(this);
        this.f1016f = false;
        this.f1020j = new HashSet();
        TypedArray typedArrayM1170A = g80.m1170A(getContext(), attributeSet, AbstractC0168dz.f1448k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM1170A.getBoolean(3, false));
        this.f1019i = typedArrayM1170A.getResourceId(1, -1);
        this.f1018h = typedArrayM1170A.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM1170A.getBoolean(0, true));
        typedArrayM1170A.recycle();
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2671s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m698c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m698c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m698c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = oa0.f3426a;
            materialButton.setId(y90.m2729a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1012b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m696a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                AbstractC0423kt.m1714g(layoutParams2, 0);
                AbstractC0423kt.m1715h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                AbstractC0423kt.m1715h(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            AbstractC0423kt.m1714g(layoutParams3, 0);
            AbstractC0423kt.m1715h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m697b(materialButton.getId(), materialButton.f1007o);
        m30 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1011a.add(new C0719st(shapeAppearanceModel.f3065e, shapeAppearanceModel.f3068h, shapeAppearanceModel.f3066f, shapeAppearanceModel.f3067g));
        materialButton.setEnabled(isEnabled());
        oa0.m2012l(materialButton, new C0328ia(1, this));
    }

    /* JADX INFO: renamed from: b */
    public final void m697b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f1020j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f1017g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f1018h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m699d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m698c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m699d(Set set) {
        HashSet hashSet = this.f1020j;
        this.f1020j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f1016f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f1016f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1013c.iterator();
                while (it.hasNext()) {
                    ((C0119d) it.next()).m762a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1014d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f1015e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m700e() {
        C0719st c0719st;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                l30 l30VarM1802e = materialButton.getShapeAppearanceModel().m1802e();
                C0719st c0719st2 = (C0719st) this.f1011a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    C0169e c0169e = C0719st.f4364e;
                    if (i == firstVisibleChildIndex) {
                        c0719st = z ? AbstractC0498mu.m1899t(this) ? new C0719st(c0169e, c0169e, c0719st2.f4366b, c0719st2.f4367c) : new C0719st(c0719st2.f4365a, c0719st2.f4368d, c0169e, c0169e) : new C0719st(c0719st2.f4365a, c0169e, c0719st2.f4366b, c0169e);
                    } else if (i == lastVisibleChildIndex) {
                        c0719st = z ? AbstractC0498mu.m1899t(this) ? new C0719st(c0719st2.f4365a, c0719st2.f4368d, c0169e, c0169e) : new C0719st(c0169e, c0169e, c0719st2.f4366b, c0719st2.f4367c) : new C0719st(c0169e, c0719st2.f4368d, c0169e, c0719st2.f4367c);
                    } else {
                        c0719st2 = null;
                    }
                    c0719st2 = c0719st;
                }
                if (c0719st2 == null) {
                    l30VarM1802e.f2908e = new C0169e(0.0f);
                    l30VarM1802e.f2909f = new C0169e(0.0f);
                    l30VarM1802e.f2910g = new C0169e(0.0f);
                    l30VarM1802e.f2911h = new C0169e(0.0f);
                } else {
                    l30VarM1802e.f2908e = c0719st2.f4365a;
                    l30VarM1802e.f2911h = c0719st2.f4368d;
                    l30VarM1802e.f2909f = c0719st2.f4366b;
                    l30VarM1802e.f2910g = c0719st2.f4367c;
                }
                materialButton.setShapeAppearanceModel(l30VarM1802e.m1731a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1017g || this.f1020j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1020j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f1020j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f1015e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f1019i;
        if (i != -1) {
            m699d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1017g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m700e();
        m696a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f1011a.remove(iIndexOfChild);
        }
        m700e();
        m696a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f1018h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f1017g != z) {
            this.f1017g = z;
            m699d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f1017g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
