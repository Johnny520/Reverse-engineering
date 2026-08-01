package p301;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC3159;
import com.google.android.material.internal.AbstractC3161;
import com.google.android.material.internal.C3152;
import com.google.android.material.internal.InterfaceC3165;
import java.util.Iterator;
import java.util.List;
import p124.C7412;
import p268.AbstractC8266;
import p314.AbstractC8669;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8615 extends AbstractC3161 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewGroupOnHierarchyChangeListenerC8616 f24150;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f24151;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3152 f24152;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f24153;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f24154;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC8609 f24155;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC8615(Context context, AttributeSet attributeSet) {
        Context contextM13813 = AbstractC8266.m13813(R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, context, attributeSet, new int[0]);
        super(contextM13813, attributeSet, R.attr.chipGroupStyle);
        this.f10519 = false;
        TypedArray typedArrayObtainStyledAttributes = contextM13813.getTheme().obtainStyledAttributes(attributeSet, AbstractC8669.f24454, 0, 0);
        this.f10520 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f10518 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        C3152 c3152 = new C3152();
        this.f24152 = c3152;
        ViewGroupOnHierarchyChangeListenerC8616 viewGroupOnHierarchyChangeListenerC8616 = new ViewGroupOnHierarchyChangeListenerC8616(this);
        this.f24150 = viewGroupOnHierarchyChangeListenerC8616;
        TypedArray typedArrayM7195 = AbstractC3159.m7195(getContext(), attributeSet, AbstractC8669.f24434, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM7195.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM7195.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM7195.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM7195.getBoolean(5, false));
        setSingleSelection(typedArrayM7195.getBoolean(6, false));
        setSelectionRequired(typedArrayM7195.getBoolean(4, false));
        this.f24153 = typedArrayM7195.getResourceId(0, -1);
        typedArrayM7195.recycle();
        c3152.setOnCheckedStateChangeListener(new C8612(this));
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC8616);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C8611);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8611(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8611(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f24152.m7187();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f24152.m7188(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f24151;
    }

    public int getChipSpacingVertical() {
        return this.f24154;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f24153;
        if (i != -1) {
            C3152 c3152 = this.f24152;
            InterfaceC3165 interfaceC3165 = (InterfaceC3165) c3152.f10496.get(Integer.valueOf(i));
            if (interfaceC3165 != null && c3152.m7189(interfaceC3165)) {
                c3152.m7186();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C7412.m12616(getRowCount(), this.f10519 ? getVisibleChipCount() : -1, this.f24152.f10493 ? 1 : 2).f20104);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f24151 != i) {
            this.f24151 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f24154 != i) {
            this.f24154 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC8610 interfaceC8610) {
        if (interfaceC8610 == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C8612(this));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC8609 interfaceC8609) {
        this.f24155 = interfaceC8609;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24150.f24157 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f24152.f10492 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        C3152 c3152 = this.f24152;
        if (c3152.f10493 != z) {
            c3152.f10493 = z;
            boolean zIsEmpty = c3152.f10495.isEmpty();
            Iterator it = c3152.f10496.values().iterator();
            while (it.hasNext()) {
                c3152.m7185((InterfaceC3165) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            c3152.m7186();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8611(layoutParams);
    }

    @Override // com.google.android.material.internal.AbstractC3161
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
