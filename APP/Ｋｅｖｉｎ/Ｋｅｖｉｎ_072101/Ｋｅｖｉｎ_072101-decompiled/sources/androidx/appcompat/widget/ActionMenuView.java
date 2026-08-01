package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ActionMenuView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final java.lang.String TAG = "ActionMenuView";
    private androidx.appcompat.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private androidx.appcompat.widget.ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    private static class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r2) {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class LayoutParams extends androidx.appcompat.widget.LinearLayoutCompat.LayoutParams {

        @android.view.ViewDebug.ExportedProperty
        public int cellsUsed;

        @android.view.ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @android.view.ViewDebug.ExportedProperty
        public int extraPixels;

        @android.view.ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @android.view.ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int r2, int r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.isOverflowButton = r0
                return
        }

        LayoutParams(int r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.isOverflowButton = r3
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(androidx.appcompat.widget.ActionMenuView.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                boolean r0 = r2.isOverflowButton
                r1.isOverflowButton = r0
                return
        }
    }

    private class MenuBuilderCallback implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuView this$0;

        MenuBuilderCallback(androidx.appcompat.widget.ActionMenuView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r2, android.view.MenuItem r3) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener r0 = r0.mOnMenuItemClickListener
                if (r0 == 0) goto L12
                androidx.appcompat.widget.ActionMenuView r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener r0 = r0.mOnMenuItemClickListener
                boolean r0 = r0.onMenuItemClick(r3)
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r2) {
                r1 = this;
                androidx.appcompat.widget.ActionMenuView r0 = r1.this$0
                androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r0.mMenuBuilderCallback
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.ActionMenuView r0 = r1.this$0
                androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r0.mMenuBuilderCallback
                r0.onMenuModeChange(r2)
            Ld:
                return
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public ActionMenuView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 0
            r3.setBaselineAligned(r0)
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1113587712(0x42600000, float:56.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r3.mMinCellSize = r2
            r2 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r1
            int r2 = (int) r2
            r3.mGeneratedItemPadding = r2
            r3.mPopupContext = r4
            r3.mPopupTheme = r0
            return
    }

    static int measureChildForCells(android.view.View r15, int r16, int r17, int r18, int r19) {
            r0 = r15
            r1 = r17
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r2 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r2
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r3 = r3 - r19
            int r4 = android.view.View.MeasureSpec.getMode(r18)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            boolean r6 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r6 == 0) goto L1f
            r6 = r0
            androidx.appcompat.view.menu.ActionMenuItemView r6 = (androidx.appcompat.view.menu.ActionMenuItemView) r6
            goto L20
        L1f:
            r6 = 0
        L20:
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L2c
            boolean r9 = r6.hasText()
            if (r9 == 0) goto L2c
            r9 = r8
            goto L2d
        L2c:
            r9 = r7
        L2d:
            r10 = 0
            if (r1 <= 0) goto L51
            r11 = 2
            if (r9 == 0) goto L35
            if (r1 < r11) goto L51
        L35:
            int r12 = r16 * r1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r13)
            r15.measure(r12, r5)
            int r13 = r15.getMeasuredWidth()
            int r10 = r13 / r16
            int r14 = r13 % r16
            if (r14 == 0) goto L4c
            int r10 = r10 + 1
        L4c:
            if (r9 == 0) goto L51
            if (r10 >= r11) goto L51
            r10 = 2
        L51:
            boolean r11 = r2.isOverflowButton
            if (r11 != 0) goto L58
            if (r9 == 0) goto L58
            r7 = r8
        L58:
            r2.expandable = r7
            r2.cellsUsed = r10
            int r8 = r10 * r16
            r11 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            r15.measure(r11, r5)
            return r10
    }

    private void onMeasureExactFormat(int r40, int r41) {
            r39 = this;
            r0 = r39
            int r1 = android.view.View.MeasureSpec.getMode(r41)
            int r2 = android.view.View.MeasureSpec.getSize(r40)
            int r3 = android.view.View.MeasureSpec.getSize(r41)
            int r4 = r39.getPaddingLeft()
            int r5 = r39.getPaddingRight()
            int r4 = r4 + r5
            int r5 = r39.getPaddingTop()
            int r6 = r39.getPaddingBottom()
            int r5 = r5 + r6
            r6 = -2
            r7 = r41
            int r6 = getChildMeasureSpec(r7, r5, r6)
            int r2 = r2 - r4
            int r8 = r0.mMinCellSize
            int r8 = r2 / r8
            int r9 = r0.mMinCellSize
            int r9 = r2 % r9
            r10 = 0
            if (r8 != 0) goto L37
            r0.setMeasuredDimension(r2, r10)
            return
        L37:
            int r11 = r0.mMinCellSize
            int r12 = r9 / r8
            int r11 = r11 + r12
            r12 = r8
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            int r10 = r39.getChildCount()
            r21 = 0
            r37 = r16
            r16 = r3
            r3 = r37
            r38 = r21
            r21 = r4
            r4 = r38
        L58:
            if (r4 >= r10) goto Lf4
            android.view.View r7 = r0.getChildAt(r4)
            r23 = r8
            int r8 = r7.getVisibility()
            r24 = r9
            r9 = 8
            if (r8 != r9) goto L6e
            r26 = r2
            goto Le8
        L6e:
            boolean r8 = r7 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r3 = r3 + 1
            if (r8 == 0) goto L81
            int r9 = r0.mGeneratedItemPadding
            r25 = r3
            int r3 = r0.mGeneratedItemPadding
            r26 = r2
            r2 = 0
            r7.setPadding(r9, r2, r3, r2)
            goto L86
        L81:
            r26 = r2
            r25 = r3
            r2 = 0
        L86:
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r3 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r3
            r3.expanded = r2
            r3.extraPixels = r2
            r3.cellsUsed = r2
            r3.expandable = r2
            r3.leftMargin = r2
            r3.rightMargin = r2
            if (r8 == 0) goto La5
            r2 = r7
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            boolean r2 = r2.hasText()
            if (r2 == 0) goto La5
            r2 = 1
            goto La6
        La5:
            r2 = 0
        La6:
            r3.preventEdgeOffset = r2
            boolean r2 = r3.isOverflowButton
            if (r2 == 0) goto Lae
            r2 = 1
            goto Laf
        Lae:
            r2 = r12
        Laf:
            int r9 = measureChildForCells(r7, r11, r2, r6, r5)
            int r14 = java.lang.Math.max(r14, r9)
            r27 = r2
            boolean r2 = r3.expandable
            if (r2 == 0) goto Lbf
            int r15 = r15 + 1
        Lbf:
            boolean r2 = r3.isOverflowButton
            if (r2 == 0) goto Lc5
            r17 = 1
        Lc5:
            int r12 = r12 - r9
            int r2 = r7.getMeasuredHeight()
            int r2 = java.lang.Math.max(r13, r2)
            r13 = 1
            if (r9 != r13) goto Le0
            int r13 = r13 << r4
            r28 = r2
            r22 = r3
            long r2 = (long) r13
            long r2 = r18 | r2
            r18 = r2
            r3 = r25
            r13 = r28
            goto Le8
        Le0:
            r28 = r2
            r22 = r3
            r3 = r25
            r13 = r28
        Le8:
            int r4 = r4 + 1
            r7 = r41
            r8 = r23
            r9 = r24
            r2 = r26
            goto L58
        Lf4:
            r26 = r2
            r23 = r8
            r24 = r9
            r2 = 2
            if (r17 == 0) goto L101
            if (r3 != r2) goto L101
            r4 = 1
            goto L102
        L101:
            r4 = 0
        L102:
            r7 = 0
        L103:
            r27 = 0
            if (r15 <= 0) goto L1c7
            if (r12 <= 0) goto L1c7
            r25 = 2147483647(0x7fffffff, float:NaN)
            r29 = 0
            r31 = 0
            r32 = 0
            r2 = r25
            r33 = r31
            r8 = r32
        L118:
            if (r8 >= r10) goto L159
            android.view.View r9 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r25 = r9.getLayoutParams()
            r34 = r5
            r5 = r25
            androidx.appcompat.widget.ActionMenuView$LayoutParams r5 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r5
            r25 = r7
            boolean r7 = r5.expandable
            if (r7 != 0) goto L131
            r7 = r33
            goto L150
        L131:
            int r7 = r5.cellsUsed
            if (r7 >= r2) goto L13f
            int r2 = r5.cellsUsed
            r31 = 1
            long r29 = r31 << r8
            r7 = 1
            r33 = r7
            goto L152
        L13f:
            r31 = 1
            int r7 = r5.cellsUsed
            if (r7 != r2) goto L14e
            long r35 = r31 << r8
            long r29 = r29 | r35
            r7 = r33
            int r33 = r7 + 1
            goto L152
        L14e:
            r7 = r33
        L150:
            r33 = r7
        L152:
            int r8 = r8 + 1
            r7 = r25
            r5 = r34
            goto L118
        L159:
            r34 = r5
            r25 = r7
            r7 = r33
            long r18 = r18 | r29
            if (r7 <= r12) goto L167
            r35 = r6
            goto L1cd
        L167:
            int r2 = r2 + 1
            r5 = 0
        L16a:
            if (r5 >= r10) goto L1bb
            android.view.View r8 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r9 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r9
            r33 = r7
            r22 = 1
            int r7 = r22 << r5
            r35 = r6
            long r6 = (long) r7
            long r6 = r29 & r6
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            if (r6 != 0) goto L191
            int r6 = r9.cellsUsed
            if (r6 != r2) goto L18e
            int r6 = r22 << r5
            long r6 = (long) r6
            long r18 = r18 | r6
        L18e:
            r31 = r2
            goto L1b2
        L191:
            if (r4 == 0) goto L1a6
            boolean r6 = r9.preventEdgeOffset
            if (r6 == 0) goto L1a6
            r6 = 1
            if (r12 != r6) goto L1a6
            int r6 = r0.mGeneratedItemPadding
            int r6 = r6 + r11
            int r7 = r0.mGeneratedItemPadding
            r31 = r2
            r2 = 0
            r8.setPadding(r6, r2, r7, r2)
            goto L1a8
        L1a6:
            r31 = r2
        L1a8:
            int r2 = r9.cellsUsed
            r6 = 1
            int r2 = r2 + r6
            r9.cellsUsed = r2
            r9.expanded = r6
            int r12 = r12 + (-1)
        L1b2:
            int r5 = r5 + 1
            r2 = r31
            r7 = r33
            r6 = r35
            goto L16a
        L1bb:
            r31 = r2
            r35 = r6
            r33 = r7
            r7 = 1
            r5 = r34
            r2 = 2
            goto L103
        L1c7:
            r34 = r5
            r35 = r6
            r25 = r7
        L1cd:
            if (r17 != 0) goto L1d4
            r2 = 1
            if (r3 != r2) goto L1d4
            r2 = 1
            goto L1d5
        L1d4:
            r2 = 0
        L1d5:
            if (r12 <= 0) goto L29e
            int r5 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r5 == 0) goto L29e
            int r5 = r3 + (-1)
            if (r12 < r5) goto L1e9
            if (r2 != 0) goto L1e9
            r5 = 1
            if (r14 <= r5) goto L1e5
            goto L1e9
        L1e5:
            r20 = r2
            goto L2a0
        L1e9:
            int r5 = java.lang.Long.bitCount(r18)
            float r5 = (float) r5
            if (r2 != 0) goto L22a
            r6 = 1
            long r6 = r18 & r6
            int r6 = (r6 > r27 ? 1 : (r6 == r27 ? 0 : -1))
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r6 == 0) goto L20b
            r6 = 0
            android.view.View r8 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r8 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r8
            boolean r9 = r8.preventEdgeOffset
            if (r9 != 0) goto L20c
            float r5 = r5 - r7
            goto L20c
        L20b:
            r6 = 0
        L20c:
            int r8 = r10 + (-1)
            r9 = 1
            int r8 = r9 << r8
            long r8 = (long) r8
            long r8 = r18 & r8
            int r8 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r8 == 0) goto L22b
            int r8 = r10 + (-1)
            android.view.View r8 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r8 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r8
            boolean r9 = r8.preventEdgeOffset
            if (r9 != 0) goto L22b
            float r5 = r5 - r7
            goto L22b
        L22a:
            r6 = 0
        L22b:
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L236
            int r6 = r12 * r11
            float r6 = (float) r6
            float r6 = r6 / r5
            int r6 = (int) r6
            goto L237
        L236:
        L237:
            r7 = 0
        L238:
            if (r7 >= r10) goto L298
            r8 = 1
            int r9 = r8 << r7
            long r8 = (long) r9
            long r8 = r18 & r8
            int r8 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r8 != 0) goto L249
            r20 = r2
            r29 = 2
            goto L293
        L249:
            android.view.View r8 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r9 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r9
            r20 = r2
            boolean r2 = r8 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r2 == 0) goto L270
            r9.extraPixels = r6
            r2 = 1
            r9.expanded = r2
            if (r7 != 0) goto L26b
            boolean r2 = r9.preventEdgeOffset
            if (r2 != 0) goto L26b
            int r2 = -r6
            r29 = 2
            int r2 = r2 / 2
            r9.leftMargin = r2
        L26b:
            r25 = 1
            r29 = 2
            goto L293
        L270:
            boolean r2 = r9.isOverflowButton
            if (r2 == 0) goto L283
            r9.extraPixels = r6
            r2 = 1
            r9.expanded = r2
            int r2 = -r6
            r29 = 2
            int r2 = r2 / 2
            r9.rightMargin = r2
            r25 = 1
            goto L293
        L283:
            r29 = 2
            if (r7 == 0) goto L28b
            int r2 = r6 / 2
            r9.leftMargin = r2
        L28b:
            int r2 = r10 + (-1)
            if (r7 == r2) goto L293
            int r2 = r6 / 2
            r9.rightMargin = r2
        L293:
            int r7 = r7 + 1
            r2 = r20
            goto L238
        L298:
            r20 = r2
            r12 = 0
            r7 = r25
            goto L2a2
        L29e:
            r20 = r2
        L2a0:
            r7 = r25
        L2a2:
            if (r7 == 0) goto L2d9
            r5 = 0
        L2a5:
            if (r5 >= r10) goto L2d4
            android.view.View r6 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r8 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r8
            boolean r9 = r8.expanded
            if (r9 != 0) goto L2ba
            r25 = r3
            r2 = r35
            goto L2cd
        L2ba:
            int r9 = r8.cellsUsed
            int r9 = r9 * r11
            int r2 = r8.extraPixels
            int r9 = r9 + r2
            r25 = r3
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r2)
            r2 = r35
            r6.measure(r3, r2)
        L2cd:
            int r5 = r5 + 1
            r35 = r2
            r3 = r25
            goto L2a5
        L2d4:
            r25 = r3
            r2 = r35
            goto L2dd
        L2d9:
            r25 = r3
            r2 = r35
        L2dd:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L2e3
            r3 = r13
            goto L2e5
        L2e3:
            r3 = r16
        L2e5:
            r5 = r26
            r0.setMeasuredDimension(r5, r3)
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams
            return r0
    }

    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto L9
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.dismissPopupMenus()
        L9:
            return
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected androidx.appcompat.widget.ActionMenuView.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 16
            r0.gravity = r1
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected androidx.appcompat.widget.ActionMenuView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            if (r3 == 0) goto L1e
            boolean r0 = r3 instanceof androidx.appcompat.widget.ActionMenuView.LayoutParams
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r1 = r3
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r1
            r0.<init>(r1)
            goto L14
        Lf:
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = new androidx.appcompat.widget.ActionMenuView$LayoutParams
            r0.<init>(r3)
        L14:
            int r1 = r0.gravity
            if (r1 > 0) goto L1d
            r1 = 16
            r0.gravity = r1
        L1d:
            return r0
        L1e:
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r2.generateDefaultLayoutParams()
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    public androidx.appcompat.widget.ActionMenuView.LayoutParams generateOverflowButtonLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuView$LayoutParams r0 = r2.generateDefaultLayoutParams()
            r1 = 1
            r0.isOverflowButton = r1
            return r0
    }

    public android.view.Menu getMenu() {
            r4 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.mMenu
            if (r0 != 0) goto L45
            android.content.Context r0 = r4.getContext()
            androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
            r1.<init>(r0)
            r4.mMenu = r1
            androidx.appcompat.view.menu.MenuBuilder r1 = r4.mMenu
            androidx.appcompat.widget.ActionMenuView$MenuBuilderCallback r2 = new androidx.appcompat.widget.ActionMenuView$MenuBuilderCallback
            r2.<init>(r4)
            r1.setCallback(r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = new androidx.appcompat.widget.ActionMenuPresenter
            r1.<init>(r0)
            r4.mPresenter = r1
            androidx.appcompat.widget.ActionMenuPresenter r1 = r4.mPresenter
            r2 = 1
            r1.setReserveOverflow(r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r4.mPresenter
            androidx.appcompat.view.menu.MenuPresenter$Callback r2 = r4.mActionMenuPresenterCallback
            if (r2 == 0) goto L2f
            androidx.appcompat.view.menu.MenuPresenter$Callback r2 = r4.mActionMenuPresenterCallback
            goto L34
        L2f:
            androidx.appcompat.widget.ActionMenuView$ActionMenuPresenterCallback r2 = new androidx.appcompat.widget.ActionMenuView$ActionMenuPresenterCallback
            r2.<init>()
        L34:
            r1.setCallback(r2)
            androidx.appcompat.view.menu.MenuBuilder r1 = r4.mMenu
            androidx.appcompat.widget.ActionMenuPresenter r2 = r4.mPresenter
            android.content.Context r3 = r4.mPopupContext
            r1.addMenuPresenter(r2, r3)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r4.mPresenter
            r1.setMenuView(r4)
        L45:
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.mMenu
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.mPopupTheme
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected boolean hasSupportDividerBeforeChildAt(int r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r5 + (-1)
            android.view.View r0 = r4.getChildAt(r0)
            android.view.View r1 = r4.getChildAt(r5)
            r2 = 0
            int r3 = r4.getChildCount()
            if (r5 >= r3) goto L21
            boolean r3 = r0 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
            if (r3 == 0) goto L21
            r3 = r0
            androidx.appcompat.widget.ActionMenuView$ActionMenuChildView r3 = (androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) r3
            boolean r3 = r3.needsDividerAfter()
            r2 = r2 | r3
        L21:
            if (r5 <= 0) goto L2f
            boolean r3 = r1 instanceof androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
            if (r3 == 0) goto L2f
            r3 = r1
            androidx.appcompat.widget.ActionMenuView$ActionMenuChildView r3 = (androidx.appcompat.widget.ActionMenuView.ActionMenuChildView) r3
            boolean r3 = r3.needsDividerBefore()
            r2 = r2 | r3
        L2f:
            return r2
    }

    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            boolean r0 = r0.hideOverflowMenu()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.mMenu = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            boolean r0 = r0.performItemAction(r3, r1)
            return r0
    }

    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            boolean r0 = r0.isOverflowMenuShowPending()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = r1.mReserveOverflow
            return r0
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mPresenter
            if (r0 == 0) goto L1f
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mPresenter
            r1 = 0
            r0.updateMenuView(r1)
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mPresenter
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto L1f
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mPresenter
            r0.hideOverflowMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r2.mPresenter
            r0.showOverflowMenu()
        L1f:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.dismissPopupMenus()
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
            r20 = this;
            r0 = r20
            boolean r1 = r0.mFormatItems
            if (r1 != 0) goto La
            super.onLayout(r21, r22, r23, r24, r25)
            return
        La:
            int r1 = r20.getChildCount()
            int r2 = r25 - r23
            int r2 = r2 / 2
            int r3 = r20.getDividerWidth()
            r4 = 0
            r5 = 0
            int r6 = r24 - r22
            int r7 = r20.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r20.getPaddingLeft()
            int r6 = r6 - r7
            r7 = 0
            boolean r8 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r20)
            r9 = 0
        L2a:
            r10 = 8
            if (r9 >= r1) goto L95
            android.view.View r11 = r0.getChildAt(r9)
            int r12 = r11.getVisibility()
            if (r12 != r10) goto L3b
            r16 = r3
            goto L90
        L3b:
            android.view.ViewGroup$LayoutParams r10 = r11.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r10 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r10
            boolean r12 = r10.isOverflowButton
            if (r12 == 0) goto L7e
            int r4 = r11.getMeasuredWidth()
            boolean r12 = r0.hasSupportDividerBeforeChildAt(r9)
            if (r12 == 0) goto L50
            int r4 = r4 + r3
        L50:
            int r12 = r11.getMeasuredHeight()
            if (r8 == 0) goto L60
            int r13 = r20.getPaddingLeft()
            int r14 = r10.leftMargin
            int r13 = r13 + r14
            int r14 = r13 + r4
            goto L6f
        L60:
            int r13 = r20.getWidth()
            int r14 = r20.getPaddingRight()
            int r13 = r13 - r14
            int r14 = r10.rightMargin
            int r14 = r13 - r14
            int r13 = r14 - r4
        L6f:
            int r15 = r12 / 2
            int r15 = r2 - r15
            r16 = r3
            int r3 = r15 + r12
            r11.layout(r13, r15, r14, r3)
            int r6 = r6 - r4
            r3 = 1
            r7 = r3
            goto L90
        L7e:
            r16 = r3
            int r3 = r11.getMeasuredWidth()
            int r12 = r10.leftMargin
            int r3 = r3 + r12
            int r12 = r10.rightMargin
            int r3 = r3 + r12
            int r6 = r6 - r3
            r0.hasSupportDividerBeforeChildAt(r9)
            int r5 = r5 + 1
        L90:
            int r9 = r9 + 1
            r3 = r16
            goto L2a
        L95:
            r16 = r3
            r3 = 0
            r9 = 1
            if (r1 != r9) goto Lbd
            if (r7 != 0) goto Lbd
            android.view.View r3 = r0.getChildAt(r3)
            int r9 = r3.getMeasuredWidth()
            int r10 = r3.getMeasuredHeight()
            int r11 = r24 - r22
            int r11 = r11 / 2
            int r12 = r9 / 2
            int r12 = r11 - r12
            int r13 = r10 / 2
            int r13 = r2 - r13
            int r14 = r12 + r9
            int r15 = r13 + r10
            r3.layout(r12, r13, r14, r15)
            return
        Lbd:
            r9 = r7 ^ 1
            int r9 = r5 - r9
            if (r9 <= 0) goto Lc6
            int r11 = r6 / r9
            goto Lc7
        Lc6:
            r11 = r3
        Lc7:
            int r3 = java.lang.Math.max(r3, r11)
            if (r8 == 0) goto L124
            int r11 = r20.getWidth()
            int r12 = r20.getPaddingRight()
            int r11 = r11 - r12
            r12 = 0
        Ld7:
            if (r12 >= r1) goto L11f
            android.view.View r13 = r0.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r14 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r14
            int r15 = r13.getVisibility()
            if (r15 == r10) goto L112
            boolean r15 = r14.isOverflowButton
            if (r15 == 0) goto Lf2
            r18 = r4
            r19 = r5
            goto L116
        Lf2:
            int r15 = r14.rightMargin
            int r11 = r11 - r15
            int r15 = r13.getMeasuredWidth()
            int r17 = r13.getMeasuredHeight()
            int r18 = r17 / 2
            int r10 = r2 - r18
            r18 = r4
            int r4 = r11 - r15
            r19 = r5
            int r5 = r10 + r17
            r13.layout(r4, r10, r11, r5)
            int r4 = r14.leftMargin
            int r4 = r4 + r15
            int r4 = r4 + r3
            int r11 = r11 - r4
            goto L116
        L112:
            r18 = r4
            r19 = r5
        L116:
            int r12 = r12 + 1
            r4 = r18
            r5 = r19
            r10 = 8
            goto Ld7
        L11f:
            r18 = r4
            r19 = r5
            goto L166
        L124:
            r18 = r4
            r19 = r5
            int r4 = r20.getPaddingLeft()
            r5 = 0
        L12d:
            if (r5 >= r1) goto L166
            android.view.View r10 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r11 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r11
            int r12 = r10.getVisibility()
            r13 = 8
            if (r12 == r13) goto L161
            boolean r12 = r11.isOverflowButton
            if (r12 == 0) goto L146
            goto L161
        L146:
            int r12 = r11.leftMargin
            int r4 = r4 + r12
            int r12 = r10.getMeasuredWidth()
            int r14 = r10.getMeasuredHeight()
            int r15 = r14 / 2
            int r15 = r2 - r15
            int r13 = r4 + r12
            int r0 = r15 + r14
            r10.layout(r4, r15, r13, r0)
            int r0 = r11.rightMargin
            int r0 = r0 + r12
            int r0 = r0 + r3
            int r4 = r4 + r0
        L161:
            int r5 = r5 + 1
            r0 = r20
            goto L12d
        L166:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            boolean r0 = r7.mFormatItems
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            r4 = 0
            if (r1 != r2) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r4
        Lf:
            r7.mFormatItems = r1
            boolean r1 = r7.mFormatItems
            if (r0 == r1) goto L17
            r7.mFormatItemsWidth = r4
        L17:
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            boolean r2 = r7.mFormatItems
            if (r2 == 0) goto L2e
            androidx.appcompat.view.menu.MenuBuilder r2 = r7.mMenu
            if (r2 == 0) goto L2e
            int r2 = r7.mFormatItemsWidth
            if (r1 == r2) goto L2e
            r7.mFormatItemsWidth = r1
            androidx.appcompat.view.menu.MenuBuilder r2 = r7.mMenu
            r2.onItemsChanged(r3)
        L2e:
            int r2 = r7.getChildCount()
            boolean r3 = r7.mFormatItems
            if (r3 == 0) goto L3c
            if (r2 <= 0) goto L3c
            r7.onMeasureExactFormat(r8, r9)
            goto L53
        L3c:
            r3 = 0
        L3d:
            if (r3 >= r2) goto L50
            android.view.View r5 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$LayoutParams r6 = (androidx.appcompat.widget.ActionMenuView.LayoutParams) r6
            r6.rightMargin = r4
            r6.leftMargin = r4
            int r3 = r3 + 1
            goto L3d
        L50:
            super.onMeasure(r8, r9)
        L53:
            return
    }

    public androidx.appcompat.view.menu.MenuBuilder peekMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    public void setExpandedActionViewsExclusive(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setExpandedActionViewsExclusive(r2)
            return
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r1, androidx.appcompat.view.menu.MenuBuilder.Callback r2) {
            r0 = this;
            r0.mActionMenuPresenterCallback = r1
            r0.mMenuBuilderCallback = r2
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener r1) {
            r0 = this;
            r0.mOnMenuItemClickListener = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.getMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setOverflowIcon(r2)
            return
    }

    public void setOverflowReserved(boolean r1) {
            r0 = this;
            r0.mReserveOverflow = r1
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.mPopupTheme
            if (r0 == r3) goto L1a
            r2.mPopupTheme = r3
            if (r3 != 0) goto Lf
            android.content.Context r0 = r2.getContext()
            r2.mPopupContext = r0
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.mPopupContext = r0
        L1a:
            return
    }

    public void setPresenter(androidx.appcompat.widget.ActionMenuPresenter r2) {
            r1 = this;
            r1.mPresenter = r2
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            r0.setMenuView(r1)
            return
    }

    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mPresenter
            boolean r0 = r0.showOverflowMenu()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
