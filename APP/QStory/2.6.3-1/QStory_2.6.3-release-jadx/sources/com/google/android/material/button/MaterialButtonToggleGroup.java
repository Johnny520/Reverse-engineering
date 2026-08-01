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
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.timepicker.C4046;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p140.C8242;
import p284.AbstractC9096;
import p321.C9447;
import p321.C9457;
import p330.AbstractC9490;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC3931 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final /* synthetic */ int f10474 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f10475;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f10476;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final LinkedHashSet f10477;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public HashSet f10478;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int f10479;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f10480;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC9096.m14388(context, attributeSet, C0328R.attr.materialButtonToggleGroupStyle, C0328R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f10477 = new LinkedHashSet();
        this.f10476 = false;
        this.f10478 = new HashSet();
        TypedArray typedArrayM7741 = AbstractC3992.m7741(getContext(), attributeSet, AbstractC9490.f24785, C0328R.attr.materialButtonToggleGroupStyle, C0328R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM7741.getBoolean(7, false));
        this.f10479 = typedArrayM7741.getResourceId(2, -1);
        this.f10480 = typedArrayM7741.getBoolean(4, false);
        if (this.f10513 == null) {
            this.f10513 = C9447.m14857(new C9457(0.0f));
        }
        setEnabled(typedArrayM7741.getBoolean(0, true));
        typedArrayM7741.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f10475 ? RadioButton.class : ToggleButton.class).getName();
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

    public void addOnButtonCheckedListener(InterfaceC3933 interfaceC3933) {
        this.f10477.add(interfaceC3933);
    }

    @Override // com.google.android.material.button.AbstractC3931, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m7618(materialButton.getId(), materialButton.f10455);
        AbstractC3103.m4804(materialButton, new C3932(this, 0));
    }

    public int getCheckedButtonId() {
        if (!this.f10475 || this.f10478.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f10478.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f10478.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10479;
        if (i != -1) {
            m7617(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C8242.m13202(1, getVisibleButtonCount(), this.f10475 ? 1 : 2).f20444);
    }

    public void removeOnButtonCheckedListener(InterfaceC3933 interfaceC3933) {
        this.f10477.remove(interfaceC3933);
    }

    public void setSelectionRequired(boolean z) {
        this.f10480 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f10475 != z) {
            this.f10475 = z;
            m7617(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m7617(Set set) {
        HashSet hashSet = this.f10478;
        this.f10478 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f10476 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f10476 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f10477.iterator();
                while (it.hasNext()) {
                    ((C4046) ((InterfaceC3933) it.next())).m7843();
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m7618(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f10478);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f10475 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f10480 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m7617(hashSet);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
