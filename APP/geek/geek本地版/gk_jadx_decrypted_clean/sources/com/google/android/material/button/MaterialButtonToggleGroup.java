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
import p000.AbstractC0199et;
import p000.AbstractC0222ff;
import p000.AbstractC0273gt;
import p000.AbstractC0873wy;
import p000.C0011aa;
import p000.C0169e;
import p000.C0431l0;
import p000.C0534nt;
import p000.C0571ot;
import p000.a80;
import p000.e30;
import p000.f30;
import p000.ja0;
import p000.s90;
import p000.t90;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f1085k = 0;

    /* JADX INFO: renamed from: a */
    public final ArrayList f1086a;

    /* JADX INFO: renamed from: b */
    public final C0431l0 f1087b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f1088c;

    /* JADX INFO: renamed from: d */
    public final C0534nt f1089d;

    /* JADX INFO: renamed from: e */
    public Integer[] f1090e;

    /* JADX INFO: renamed from: f */
    public boolean f1091f;

    /* JADX INFO: renamed from: g */
    public boolean f1092g;

    /* JADX INFO: renamed from: h */
    public boolean f1093h;

    /* JADX INFO: renamed from: i */
    public final int f1094i;

    /* JADX INFO: renamed from: j */
    public HashSet f1095j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0222ff.m1177W(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f1086a = new ArrayList();
        this.f1087b = new C0431l0(18, this);
        this.f1088c = new LinkedHashSet();
        this.f1089d = new C0534nt(this);
        this.f1091f = false;
        this.f1095j = new HashSet();
        TypedArray typedArrayM56u = a80.m56u(getContext(), attributeSet, AbstractC0873wy.f5052k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM56u.getBoolean(3, false));
        this.f1094i = typedArrayM56u.getResourceId(1, -1);
        this.f1093h = typedArrayM56u.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM56u.getBoolean(0, true));
        typedArrayM56u.recycle();
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2327s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m740c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m740c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m740c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = ja0.f2600a;
            materialButton.setId(t90.m2364a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1087b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m738a() {
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
                AbstractC0199et.m1075g(layoutParams2, 0);
                AbstractC0199et.m1076h(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                AbstractC0199et.m1076h(layoutParams2, 0);
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
            AbstractC0199et.m1075g(layoutParams3, 0);
            AbstractC0199et.m1076h(layoutParams3, 0);
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
        m739b(materialButton.getId(), materialButton.f1082o);
        f30 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1086a.add(new C0571ot(shapeAppearanceModel.f1879e, shapeAppearanceModel.f1882h, shapeAppearanceModel.f1880f, shapeAppearanceModel.f1881g));
        materialButton.setEnabled(isEnabled());
        ja0.m1575l(materialButton, new C0011aa(1, this));
    }

    /* JADX INFO: renamed from: b */
    public final void m739b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f1095j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f1092g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f1093h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m741d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m740c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m741d(Set set) {
        HashSet hashSet = this.f1095j;
        this.f1095j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f1091f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f1091f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1088c.iterator();
                while (it.hasNext()) {
                    ((C0119d) it.next()).m801a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1089d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f1090e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m742e() {
        C0571ot c0571ot;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                e30 e30VarM1139e = materialButton.getShapeAppearanceModel().m1139e();
                C0571ot c0571ot2 = (C0571ot) this.f1086a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    C0169e c0169e = C0571ot.f3578e;
                    if (i == firstVisibleChildIndex) {
                        c0571ot = z ? AbstractC0273gt.m1311n(this) ? new C0571ot(c0169e, c0169e, c0571ot2.f3580b, c0571ot2.f3581c) : new C0571ot(c0571ot2.f3579a, c0571ot2.f3582d, c0169e, c0169e) : new C0571ot(c0571ot2.f3579a, c0169e, c0571ot2.f3580b, c0169e);
                    } else if (i == lastVisibleChildIndex) {
                        c0571ot = z ? AbstractC0273gt.m1311n(this) ? new C0571ot(c0571ot2.f3579a, c0571ot2.f3582d, c0169e, c0169e) : new C0571ot(c0169e, c0169e, c0571ot2.f3580b, c0571ot2.f3581c) : new C0571ot(c0169e, c0571ot2.f3582d, c0169e, c0571ot2.f3581c);
                    } else {
                        c0571ot2 = null;
                    }
                    c0571ot2 = c0571ot;
                }
                if (c0571ot2 == null) {
                    e30VarM1139e.f1697e = new C0169e(0.0f);
                    e30VarM1139e.f1698f = new C0169e(0.0f);
                    e30VarM1139e.f1699g = new C0169e(0.0f);
                    e30VarM1139e.f1700h = new C0169e(0.0f);
                } else {
                    e30VarM1139e.f1697e = c0571ot2.f3579a;
                    e30VarM1139e.f1700h = c0571ot2.f3582d;
                    e30VarM1139e.f1698f = c0571ot2.f3580b;
                    e30VarM1139e.f1699g = c0571ot2.f3581c;
                }
                materialButton.setShapeAppearanceModel(e30VarM1139e.m982a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1092g || this.f1095j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1095j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f1095j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f1090e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f1094i;
        if (i != -1) {
            m741d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1092g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m742e();
        m738a();
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
            this.f1086a.remove(iIndexOfChild);
        }
        m742e();
        m738a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f1093h = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f1092g != z) {
            this.f1092g = z;
            m741d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f1092g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
