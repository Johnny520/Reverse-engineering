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
import com.google.android.material.C1247R;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p000a.C0038C;
import p000a.C0146I;
import p000a.C0181Jg;
import p000a.C0324Rg;
import p000a.C0393Vd;
import p000a.C0408Wa;
import p000a.C0523cf;
import p000a.C0811s;
import p000a.C0866ug;
import p000a.InterfaceC0892w4;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static final int f5523k = C1247R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5524a;

    /* JADX INFO: renamed from: b */
    public final C1272e f5525b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet<InterfaceC1271d> f5526c;

    /* JADX INFO: renamed from: d */
    public final C1268a f5527d;

    /* JADX INFO: renamed from: e */
    public Integer[] f5528e;

    /* JADX INFO: renamed from: f */
    public boolean f5529f;

    /* JADX INFO: renamed from: g */
    public boolean f5530g;

    /* JADX INFO: renamed from: h */
    public boolean f5531h;

    /* JADX INFO: renamed from: i */
    public final int f5532i;

    /* JADX INFO: renamed from: j */
    public HashSet f5533j;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    public class C1268a implements Comparator<MaterialButton> {
        public C1268a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.f5519o).compareTo(Boolean.valueOf(materialButton4.f5519o));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    public class C1269b extends C0038C {
        public C1269b() {
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: d */
        public final void mo115d(View view, C0146I c0146i) {
            int i;
            View.AccessibilityDelegate accessibilityDelegate = this.f137a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            int i2 = MaterialButtonToggleGroup.f5523k;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (view instanceof MaterialButton) {
                i = 0;
                for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                    if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.m3123c(i3)) {
                        i++;
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f5519o));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    public static class C1270c {

        /* JADX INFO: renamed from: e */
        public static final C0811s f5536e = new C0811s(0.0f);

        /* JADX INFO: renamed from: a */
        public final InterfaceC0892w4 f5537a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0892w4 f5538b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0892w4 f5539c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC0892w4 f5540d;

        public C1270c(InterfaceC0892w4 interfaceC0892w4, InterfaceC0892w4 interfaceC0892w42, InterfaceC0892w4 interfaceC0892w43, InterfaceC0892w4 interfaceC0892w44) {
            this.f5537a = interfaceC0892w4;
            this.f5538b = interfaceC0892w43;
            this.f5539c = interfaceC0892w44;
            this.f5540d = interfaceC0892w42;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    public interface InterfaceC1271d {
        /* JADX INFO: renamed from: a */
        void mo3126a();
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    public class C1272e implements MaterialButton.InterfaceC1266b {
        public C1272e() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.materialButtonToggleGroupStyle;
        int i2 = f5523k;
        super(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        this.f5524a = new ArrayList();
        this.f5525b = new C1272e();
        this.f5526c = new LinkedHashSet<>();
        this.f5527d = new C1268a();
        this.f5529f = false;
        this.f5533j = new HashSet();
        TypedArray typedArrayM1301d = C0523cf.m1301d(getContext(), attributeSet, C1247R.styleable.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(typedArrayM1301d.getBoolean(C1247R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f5532i = typedArrayM1301d.getResourceId(C1247R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f5531h = typedArrayM1301d.getBoolean(C1247R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM1301d.getBoolean(C1247R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayM1301d.recycle();
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m3123c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m3123c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m3123c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5525b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m3121a() {
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
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m3122b(materialButton.getId(), materialButton.f5519o);
        C0393Vd shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f5524a.add(new C1270c(shapeAppearanceModel.f1486e, shapeAppearanceModel.f1489h, shapeAppearanceModel.f1487f, shapeAppearanceModel.f1488g));
        materialButton.setEnabled(isEnabled());
        C0866ug.m2003j(materialButton, new C1269b());
    }

    /* JADX INFO: renamed from: b */
    public final void m3122b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f5533j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f5530g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f5531h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m3124d(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3123c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* JADX INFO: renamed from: d */
    public final void m3124d(Set<Integer> set) {
        HashSet hashSet = this.f5533j;
        this.f5533j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f5529f = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f5529f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<InterfaceC1271d> it = this.f5526c.iterator();
                while (it.hasNext()) {
                    it.next().mo3126a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5527d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f5528e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m3125e() {
        C1270c c1270c;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C0393Vd.a aVarM1026e = materialButton.getShapeAppearanceModel().m1026e();
                C1270c c1270c2 = (C1270c) this.f5524a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    C0811s c0811s = C1270c.f5536e;
                    if (i == firstVisibleChildIndex) {
                        c1270c = z ? C0324Rg.m895a(this) ? new C1270c(c0811s, c0811s, c1270c2.f5538b, c1270c2.f5539c) : new C1270c(c1270c2.f5537a, c1270c2.f5540d, c0811s, c0811s) : new C1270c(c1270c2.f5537a, c0811s, c1270c2.f5538b, c0811s);
                    } else if (i == lastVisibleChildIndex) {
                        c1270c = z ? C0324Rg.m895a(this) ? new C1270c(c1270c2.f5537a, c1270c2.f5540d, c0811s, c0811s) : new C1270c(c0811s, c0811s, c1270c2.f5538b, c1270c2.f5539c) : new C1270c(c0811s, c1270c2.f5540d, c0811s, c1270c2.f5539c);
                    } else {
                        c1270c2 = null;
                    }
                    c1270c2 = c1270c;
                }
                if (c1270c2 == null) {
                    aVarM1026e.f1498e = new C0811s(0.0f);
                    aVarM1026e.f1499f = new C0811s(0.0f);
                    aVarM1026e.f1500g = new C0811s(0.0f);
                    aVarM1026e.f1501h = new C0811s(0.0f);
                } else {
                    aVarM1026e.f1498e = c1270c2.f5537a;
                    aVarM1026e.f1501h = c1270c2.f5540d;
                    aVarM1026e.f1499f = c1270c2.f5538b;
                    aVarM1026e.f1500g = c1270c2.f5539c;
                }
                materialButton.setShapeAppearanceModel(aVarM1026e.m1028a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f5530g || this.f5533j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5533j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f5533j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f5528e;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f5532i;
        if (i != -1) {
            m3124d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f5530g ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m3125e();
        m3121a();
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
            this.f5524a.remove(iIndexOfChild);
        }
        m3125e();
        m3121a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f5531h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSingleSelection(boolean z) {
        if (this.f5530g != z) {
            this.f5530g = z;
            m3124d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f5530g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
