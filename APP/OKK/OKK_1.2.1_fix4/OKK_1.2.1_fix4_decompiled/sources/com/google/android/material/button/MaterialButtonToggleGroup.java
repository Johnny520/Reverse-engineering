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

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0059a.m197a(context, attributeSet, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, C1031R.attr.materialButtonToggleGroupStyle);
        this.f2354a = new ArrayList();
        this.f2355b = new C0095d(21, this);
        this.f2356c = new LinkedHashSet();
        this.f2357d = new C0695t(4, this);
        this.f2359f = false;
        this.f2363j = new HashSet();
        Context context2 = getContext();
        int[] iArr = AbstractC0942a.f3338j;
        AbstractC1077k.m2553a(context2, attributeSet, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        AbstractC1077k.m2554b(context2, attributeSet, iArr, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C1031R.attr.materialButtonToggleGroupStyle, C1031R.style.Widget_MaterialComponents_MaterialButtonToggleGroup);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(3, false));
        this.f2362i = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f2361h = typedArrayObtainStyledAttributes.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        Field field = AbstractC0080Q.f219a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (m1860c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m1860c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && m1860c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = AbstractC0080Q.f219a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2355b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1858a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
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
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i2, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            m1859b(materialButton.getId(), materialButton.f2350o);
            C1127k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f2354a.add(new C0995e(shapeAppearanceModel.f4351e, shapeAppearanceModel.f4354h, shapeAppearanceModel.f4352f, shapeAppearanceModel.f4353g));
            materialButton.setEnabled(isEnabled());
            AbstractC0080Q.m291j(materialButton, new C0994d(this, 0));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1859b(int i2, boolean z2) {
        if (i2 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f2363j);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f2360g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            if (!this.f2361h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        m1861d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1860c(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m1861d(Set set) {
        HashSet hashSet = this.f2363j;
        this.f2363j = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f2359f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f2359f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f2356c.iterator();
                while (it.hasNext()) {
                    ((C0728f) it.next()).m1917a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2357d);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f2358e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m1862e() {
        C0995e c0995e;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                C1126j c1126jM2660d = materialButton.getShapeAppearanceModel().m2660d();
                C0995e c0995e2 = (C0995e) this.f2354a.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C1117a c1117a = C0995e.f3552e;
                    if (i2 == firstVisibleChildIndex) {
                        c0995e = z2 ? AbstractC1077k.m2557e(this) ? new C0995e(c1117a, c1117a, c0995e2.f3554b, c0995e2.f3555c) : new C0995e(c0995e2.f3553a, c0995e2.f3556d, c1117a, c1117a) : new C0995e(c0995e2.f3553a, c1117a, c0995e2.f3554b, c1117a);
                    } else if (i2 == lastVisibleChildIndex) {
                        c0995e = z2 ? AbstractC1077k.m2557e(this) ? new C0995e(c0995e2.f3553a, c0995e2.f3556d, c1117a, c1117a) : new C0995e(c1117a, c1117a, c0995e2.f3554b, c0995e2.f3555c) : new C0995e(c1117a, c0995e2.f3556d, c1117a, c0995e2.f3555c);
                    } else {
                        c0995e2 = null;
                    }
                    c0995e2 = c0995e;
                }
                if (c0995e2 == null) {
                    c1126jM2660d.f4339e = new C1117a(0.0f);
                    c1126jM2660d.f4340f = new C1117a(0.0f);
                    c1126jM2660d.f4341g = new C1117a(0.0f);
                    c1126jM2660d.f4342h = new C1117a(0.0f);
                } else {
                    c1126jM2660d.f4339e = c0995e2.f3553a;
                    c1126jM2660d.f4342h = c0995e2.f3556d;
                    c1126jM2660d.f4340f = c0995e2.f3554b;
                    c1126jM2660d.f4341g = c0995e2.f3555c;
                }
                materialButton.setShapeAppearanceModel(c1126jM2660d.m2656a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2360g || this.f2363j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2363j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f2363j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f2358e;
        return (numArr == null || i3 >= numArr.length) ? i3 : numArr[i3].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f2362i;
        if (i2 != -1) {
            m1861d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2360g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        m1862e();
        m1858a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f2354a.remove(iIndexOfChild);
        }
        m1862e();
        m1858a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f2361h = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2360g != z2) {
            this.f2360g = z2;
            m1861d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f2360g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
