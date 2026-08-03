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

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0148Dc.m291y(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f4499k = new LinkedHashSet();
        this.f4500l = false;
        this.f4504p = new HashSet();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(getContext(), attributeSet, AbstractC0939Vu.f2943l, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM2534G.getBoolean(7, false));
        this.f4503o = typedArrayM2534G.getResourceId(2, -1);
        this.f4502n = typedArrayM2534G.getBoolean(4, false);
        if (this.f812f == null) {
            this.f812f = C1196az.m2313b(new C2436r(0.0f));
        }
        setEnabled(typedArrayM2534G.getBoolean(0, true));
        typedArrayM2534G.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f4501m ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // p000.AbstractC0248Fq, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setupButtonChild(materialButton);
            m2455f(materialButton.getId(), materialButton.f4486o);
            AbstractC2185lE.m4399l(materialButton, new C1486h8(1, this));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2455f(int i, boolean z) {
        if (i == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f4504p);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f4501m && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f4502n || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m2456g(hashSet);
    }

    /* JADX INFO: renamed from: g */
    public final void m2456g(Set set) {
        HashSet hashSet = this.f4504p;
        this.f4504p = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f4500l = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f4500l = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f4499k.iterator();
                while (it.hasNext()) {
                    ((C1283e) it.next()).m2509a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f4501m || this.f4504p.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f4504p.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f4504p.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f4503o;
        if (i != -1) {
            m2456g(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f4501m ? 1 : 2));
    }

    public void setSelectionRequired(boolean z) {
        this.f4502n = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f4501m != z) {
            this.f4501m = z;
            m2456g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
