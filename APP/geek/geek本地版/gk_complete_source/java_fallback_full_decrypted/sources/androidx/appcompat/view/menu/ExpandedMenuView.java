package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements defpackage.ju, defpackage.fv, android.widget.AdapterView.OnItemClickListener {
    public static final int[] b = null;
    public defpackage.ku a;

    static {
            r0 = 16842964(0x10100d4, float:2.3694152E-38)
            r1 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.view.menu.ExpandedMenuView.b = r0
            return
    }

    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.b
            r1 = 16842868(0x1010074, float:2.3693883E-38)
            r5 r3 = defpackage.r5.y(r3, r4, r0, r1)
            java.lang.Object r4 = r3.b
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = 0
            boolean r1 = r4.hasValue(r0)
            if (r1 == 0) goto L21
            android.graphics.drawable.Drawable r0 = r3.m(r0)
            r2.setBackgroundDrawable(r0)
        L21:
            r0 = 1
            boolean r4 = r4.hasValue(r0)
            if (r4 == 0) goto L2f
            android.graphics.drawable.Drawable r4 = r3.m(r0)
            r2.setDivider(r4)
        L2f:
            r3.z()
            return
    }

    @Override // defpackage.ju
    public final boolean a(defpackage.ou r4) {
            r3 = this;
            ku r0 = r3.a
            r1 = 0
            r2 = 0
            boolean r4 = r0.q(r4, r2, r1)
            return r4
    }

    @Override // defpackage.fv
    public final void b(defpackage.ku r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            ou r1 = (defpackage.ou) r1
            r0.a(r1)
            return
    }
}
