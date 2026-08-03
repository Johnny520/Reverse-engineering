package a;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 extends a.I6 {
    public int e;
    public int f;

    public class a implements a.Z2.d {
    }

    public static class b extends android.view.ViewGroup.MarginLayoutParams {
    }

    @java.lang.Deprecated
    public interface c {
    }

    public interface d {
    }

    private int getVisibleChipCount() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L1f
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.chip.Chip
            if (r2 == 0) goto L1c
            android.view.View r2 = r3.getChildAt(r0)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L1c
            int r1 = r1 + 1
        L1c:
            int r0 = r0 + 1
            goto L2
        L1f:
            return r1
    }

    @Override // a.I6
    public final boolean a() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r2 = r2 instanceof a.Z2.b
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            a.Z2$b r0 = new a.Z2$b
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            a.Z2$b r0 = new a.Z2$b
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            a.Z2$b r0 = new a.Z2$b
            r0.<init>(r2)
            return r0
    }

    public int getCheckedChipId() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public java.util.List<java.lang.Integer> getCheckedChipIds() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public int getChipSpacingHorizontal() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    public int getChipSpacingVertical() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            boolean r1 = r0.c
            if (r1 == 0) goto La
            r0.getVisibleChipCount()
        La:
            r0.getRowCount()
            r1 = 0
            throw r1
    }

    public void setChipSpacing(int r1) {
            r0 = this;
            r0.setChipSpacingHorizontal(r1)
            r0.setChipSpacingVertical(r1)
            return
    }

    public void setChipSpacingHorizontal(int r2) {
            r1 = this;
            int r0 = r1.e
            if (r0 == r2) goto Lc
            r1.e = r2
            r1.setItemSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingHorizontalResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingHorizontal(r2)
            return
    }

    public void setChipSpacingResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacing(r2)
            return
    }

    public void setChipSpacingVertical(int r2) {
            r1 = this;
            int r0 = r1.f
            if (r0 == r2) goto Lc
            r1.f = r2
            r1.setLineSpacing(r2)
            r1.requestLayout()
        Lc:
            return
    }

    public void setChipSpacingVerticalResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelOffset(r2)
            r1.setChipSpacingVertical(r2)
            return
    }

    @java.lang.Deprecated
    public void setDividerDrawableHorizontal(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setDividerDrawableVertical(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setFlexWrap(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setOnCheckedChangeListener(a.Z2.c r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 0
            r0.setOnCheckedStateChangeListener(r1)
            return
        L7:
            a.Z2$a r1 = new a.Z2$a
            r1.<init>()
            r0.setOnCheckedStateChangeListener(r1)
            return
    }

    public void setOnCheckedStateChangeListener(a.Z2.d r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @java.lang.Deprecated
    public void setShowDividerHorizontal(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    @java.lang.Deprecated
    public void setShowDividerVertical(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing."
            r2.<init>(r0)
            throw r2
    }

    public void setSingleLine(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleLine(r2)
            return
    }

    @Override // a.I6
    public void setSingleLine(boolean r1) {
            r0 = this;
            super.setSingleLine(r1)
            return
    }

    public void setSingleSelection(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r1) {
            r0 = this;
            r1 = 0
            throw r1
    }
}
