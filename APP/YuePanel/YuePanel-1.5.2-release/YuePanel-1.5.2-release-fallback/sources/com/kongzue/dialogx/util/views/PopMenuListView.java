package com.kongzue.dialogx.util.views;

/* JADX INFO: loaded from: classes2.dex */
public class PopMenuListView extends android.widget.ListView {
    private float maxHeight;

    public PopMenuListView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.maxHeight = r1
            return
    }

    public PopMenuListView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.maxHeight = r1
            return
    }

    public PopMenuListView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.maxHeight = r1
            return
    }

    public float getMaxHeight() {
            r1 = this;
            float r0 = r1.maxHeight
            return r0
    }

    public boolean isCanScroll() {
            r4 = this;
            int r0 = r4.getCount()
            int r1 = r4.getFirstVisiblePosition()
            int r2 = r4.getLastVisiblePosition()
            r3 = 1
            if (r1 != 0) goto L14
            int r2 = r2 + r3
            if (r0 == r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
            r1 = this;
            super.layoutChildren()     // Catch: java.lang.IllegalStateException -> L4
            goto L10
        L4:
            android.widget.ListAdapter r0 = r1.getAdapter()
            android.widget.BaseAdapter r0 = (android.widget.BaseAdapter) r0
            r0.notifyDataSetChanged()
            super.layoutChildren()
        L10:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r4)
            float r1 = r2.maxHeight
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L1f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1f
            java.lang.Float r4 = java.lang.Float.valueOf(r1)
            int r4 = r4.intValue()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
        L1f:
            super.onMeasure(r3, r4)
            return
    }

    public com.kongzue.dialogx.util.views.PopMenuListView setMaxHeight(float r1) {
            r0 = this;
            r0.maxHeight = r1
            return r0
    }
}
