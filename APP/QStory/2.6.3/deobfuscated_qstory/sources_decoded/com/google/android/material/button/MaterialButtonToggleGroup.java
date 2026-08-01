package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.AbstractC2270;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.timepicker.C3214;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p124.C7413;
import p268.AbstractC8267;
import p305.C8618;
import p305.C8628;
import p314.AbstractC8661;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC3099 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final /* synthetic */ int f10129 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10130;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10131;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10132;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public HashSet f10133;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f10134;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f10135;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC8267.m13829(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f10132 = new LinkedHashSet();
        this.f10131 = false;
        this.f10133 = new HashSet();
        TypedArray typedArrayM7182 = AbstractC3160.m7182(getContext(), attributeSet, AbstractC8661.f24440, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM7182.getBoolean(7, false));
        this.f10134 = typedArrayM7182.getResourceId(2, -1);
        this.f10135 = typedArrayM7182.getBoolean(4, false);
        if (this.f10168 == null) {
            this.f10168 = C8618.m14298(new C8628(0.0f));
        }
        setEnabled(typedArrayM7182.getBoolean(0, true));
        typedArrayM7182.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f10130 ? RadioButton.class : ToggleButton.class).getName();
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

    public void addOnButtonCheckedListener(InterfaceC3101 interfaceC3101) {
        this.f10132.add(interfaceC3101);
    }

    @Override // com.google.android.material.button.AbstractC3099, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m7059(materialButton.getId(), materialButton.f10110);
        AbstractC2270.m4244(materialButton, new C3100(this, 0));
    }

    public int getCheckedButtonId() {
        if (!this.f10130 || this.f10133.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f10133.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f10133.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10134;
        if (i != -1) {
            m7058(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C7413.m12643(1, getVisibleButtonCount(), this.f10130 ? 1 : 2).f20099);
    }

    public void removeOnButtonCheckedListener(InterfaceC3101 interfaceC3101) {
        this.f10132.remove(interfaceC3101);
    }

    public void setSelectionRequired(boolean z) {
        this.f10135 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f10130 != z) {
            this.f10130 = z;
            m7058(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7058(Set set) {
        HashSet hashSet = this.f10133;
        this.f10133 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f10131 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f10131 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f10132.iterator();
                while (it.hasNext()) {
                    ((C3214) ((InterfaceC3101) it.next())).m7284();
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7059(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f10133);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f10130 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f10135 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m7058(hashSet);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
