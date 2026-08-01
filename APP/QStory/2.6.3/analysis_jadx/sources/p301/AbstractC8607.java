package p301;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.AbstractC3160;
import com.google.android.material.internal.AbstractC3162;
import com.google.android.material.internal.C3153;
import com.google.android.material.internal.InterfaceC3166;
import java.util.Iterator;
import java.util.List;
import p124.C7413;
import p268.AbstractC8267;
import p314.AbstractC8661;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8607 extends AbstractC3162 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewGroupOnHierarchyChangeListenerC8608 f24141;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f24142;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3153 f24143;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f24144;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f24145;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC8601 f24146;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC8607(Context context, AttributeSet attributeSet) {
        Context contextM13830 = AbstractC8267.m13830(R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, context, attributeSet, new int[0]);
        super(contextM13830, attributeSet, R.attr.chipGroupStyle);
        this.f10524 = false;
        TypedArray typedArrayObtainStyledAttributes = contextM13830.getTheme().obtainStyledAttributes(attributeSet, AbstractC8661.f24445, 0, 0);
        this.f10525 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f10523 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        C3153 c3153 = new C3153();
        this.f24143 = c3153;
        ViewGroupOnHierarchyChangeListenerC8608 viewGroupOnHierarchyChangeListenerC8608 = new ViewGroupOnHierarchyChangeListenerC8608(this);
        this.f24141 = viewGroupOnHierarchyChangeListenerC8608;
        TypedArray typedArrayM7182 = AbstractC3160.m7182(getContext(), attributeSet, AbstractC8661.f24425, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayM7182.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayM7182.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayM7182.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayM7182.getBoolean(5, false));
        setSingleSelection(typedArrayM7182.getBoolean(6, false));
        setSelectionRequired(typedArrayM7182.getBoolean(4, false));
        this.f24144 = typedArrayM7182.getResourceId(0, -1);
        typedArrayM7182.recycle();
        c3153.setOnCheckedStateChangeListener(new C8604(this));
        super.setOnHierarchyChangeListener(viewGroupOnHierarchyChangeListenerC8608);
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
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C8603);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8603(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8603(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f24143.m7174();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f24143.m7175(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f24142;
    }

    public int getChipSpacingVertical() {
        return this.f24145;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f24144;
        if (i != -1) {
            C3153 c3153 = this.f24143;
            InterfaceC3166 interfaceC3166 = (InterfaceC3166) c3153.f10501.get(Integer.valueOf(i));
            if (interfaceC3166 != null && c3153.m7176(interfaceC3166)) {
                c3153.m7173();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C7413.m12643(getRowCount(), this.f10524 ? getVisibleChipCount() : -1, this.f24143.f10498 ? 1 : 2).f20099);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f24142 != i) {
            this.f24142 = i;
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
        if (this.f24145 != i) {
            this.f24145 = i;
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
    public void setOnCheckedChangeListener(InterfaceC8602 interfaceC8602) {
        if (interfaceC8602 == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C8604(this));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC8601 interfaceC8601) {
        this.f24146 = interfaceC8601;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f24141.f24148 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f24143.f10497 = z;
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
        C3153 c3153 = this.f24143;
        if (c3153.f10498 != z) {
            c3153.f10498 = z;
            boolean zIsEmpty = c3153.f10500.isEmpty();
            Iterator it = c3153.f10501.values().iterator();
            while (it.hasNext()) {
                c3153.m7172((InterfaceC3166) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            c3153.m7173();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8603(layoutParams);
    }

    @Override // com.google.android.material.internal.AbstractC3162
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
