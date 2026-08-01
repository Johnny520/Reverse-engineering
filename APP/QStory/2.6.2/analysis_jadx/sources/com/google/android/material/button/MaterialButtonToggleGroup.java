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
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.timepicker.C3213;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p124.C7412;
import p268.AbstractC8266;
import p305.C8626;
import p305.C8636;
import p314.AbstractC8669;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC3098 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final /* synthetic */ int f10124 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10125;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10126;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10127;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public HashSet f10128;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f10129;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f10130;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC8266.m13812(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f10127 = new LinkedHashSet();
        this.f10126 = false;
        this.f10128 = new HashSet();
        TypedArray typedArrayM7195 = AbstractC3159.m7195(getContext(), attributeSet, AbstractC8669.f24449, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM7195.getBoolean(7, false));
        this.f10129 = typedArrayM7195.getResourceId(2, -1);
        this.f10130 = typedArrayM7195.getBoolean(4, false);
        if (this.f10163 == null) {
            this.f10163 = C8626.m14279(new C8636(0.0f));
        }
        setEnabled(typedArrayM7195.getBoolean(0, true));
        typedArrayM7195.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f10125 ? RadioButton.class : ToggleButton.class).getName();
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

    public void addOnButtonCheckedListener(InterfaceC3100 interfaceC3100) {
        this.f10127.add(interfaceC3100);
    }

    @Override // com.google.android.material.button.AbstractC3098, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m7072(materialButton.getId(), materialButton.f10105);
        AbstractC2270.m4234(materialButton, new C3099(this, 0));
    }

    public int getCheckedButtonId() {
        if (!this.f10125 || this.f10128.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f10128.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f10128.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10129;
        if (i != -1) {
            m7071(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C7412.m12616(1, getVisibleButtonCount(), this.f10125 ? 1 : 2).f20104);
    }

    public void removeOnButtonCheckedListener(InterfaceC3100 interfaceC3100) {
        this.f10127.remove(interfaceC3100);
    }

    public void setSelectionRequired(boolean z) {
        this.f10130 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f10125 != z) {
            this.f10125 = z;
            m7071(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7071(Set set) {
        HashSet hashSet = this.f10128;
        this.f10128 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f10126 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f10126 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f10127.iterator();
                while (it.hasNext()) {
                    ((C3213) ((InterfaceC3100) it.next())).m7297();
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7072(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f10128);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f10125 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f10130 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m7071(hashSet);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
