package p317;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC3992;
import com.google.android.material.internal.AbstractC3994;
import com.google.android.material.internal.C3985;
import com.google.android.material.internal.InterfaceC3998;
import java.util.Iterator;
import java.util.List;
import p140.C8242;
import p284.AbstractC9096;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9436 extends AbstractC3994 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewGroupOnHierarchyChangeListenerC9437 f24486;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f24487;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3985 f24488;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f24489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f24490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC9430 f24491;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC9436(Context context, AttributeSet attributeSet) {
        Context contextM14389 = AbstractC9096.m14389(C0328R.attr.chipGroupStyle, C0328R.style.Widget_MaterialComponents_ChipGroup, context, attributeSet, new int[0]);
        super(contextM14389, attributeSet, C0328R.attr.chipGroupStyle);
        this.f10869 = false;
        TypedArray typedArrayObtainStyledAttributes = contextM14389.getTheme().obtainStyledAttributes(attributeSet, AbstractC9490.f24790, 0, 0);
        this.f10870 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f10868 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        C3985 c3985 = new C3985();
        this.f24488 = c3985;
        ViewGroupOnHierarchyChangeListenerC9437 viewGroupOnHierarchyChangeListenerC9437 = new ViewGroupOnHierarchyChangeListenerC9437(this);
        this.f24486 = viewGroupOnHierarchyChangeListenerC9437;
        TypedArray typedArrayM7741 = AbstractC3992.m7741(getContext(), attributeSet, AbstractC9490.f24770, C0328R.attr.chipGroupStyle, C0328R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM7741.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM7741.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM7741.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM7741.getBoolean(5, false));
        setSingleSelection(typedArrayM7741.getBoolean(6, false));
        setSelectionRequired(typedArrayM7741.getBoolean(4, false));
        this.f24489 = typedArrayM7741.getResourceId(0, -1);
        typedArrayM7741.recycle();
        c3985.setOnCheckedStateChangeListener(new C9433(this));
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC9437);
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
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C9432);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C9432(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C9432(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f24488.m7733();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f24488.m7734(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f24487;
    }

    public int getChipSpacingVertical() {
        return this.f24490;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f24489;
        if (i != -1) {
            C3985 c3985 = this.f24488;
            InterfaceC3998 interfaceC3998 = (InterfaceC3998) c3985.f10846.get(Integer.valueOf(i));
            if (interfaceC3998 != null && c3985.m7735(interfaceC3998)) {
                c3985.m7732();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C8242.m13202(getRowCount(), this.f10869 ? getVisibleChipCount() : -1, this.f24488.f10843 ? 1 : 2).f20444);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f24487 != i) {
            this.f24487 = i;
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
        if (this.f24490 != i) {
            this.f24490 = i;
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
    public void setOnCheckedChangeListener(InterfaceC9431 interfaceC9431) {
        if (interfaceC9431 == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C9433(this));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC9430 interfaceC9430) {
        this.f24491 = interfaceC9430;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24486.f24493 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f24488.f10842 = z;
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
        C3985 c3985 = this.f24488;
        if (c3985.f10843 != z) {
            c3985.f10843 = z;
            boolean zIsEmpty = c3985.f10845.isEmpty();
            Iterator it = c3985.f10846.values().iterator();
            while (it.hasNext()) {
                c3985.m7731((InterfaceC3998) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            c3985.m7732();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C9432(layoutParams);
    }

    @Override // com.google.android.material.internal.AbstractC3994
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
