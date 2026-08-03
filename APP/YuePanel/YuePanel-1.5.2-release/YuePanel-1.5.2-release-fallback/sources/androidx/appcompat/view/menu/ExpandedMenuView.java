package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.C7343.InterfaceC7345, androidx.appcompat.view.menu.InterfaceC7354, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int[] f25348 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 f25349;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f25350;

    static {
            r0 = 16842964(0x10100d4, float:2.3694152E-38)
            r1 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.view.menu.ExpandedMenuView.f25348 = r0
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842868(0x1010074, float:2.3693883E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ExpandedMenuView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4)
            r2.setOnItemClickListener(r2)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.f25348
            r1 = 0
            Yue.ۥۢۡۥۦ r3 = Yue.C6264.m23339(r3, r4, r0, r5, r1)
            boolean r4 = r3.m23368(r1)
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r4 = r3.m23347(r1)
            r2.setBackgroundDrawable(r4)
        L1a:
            r4 = 1
            boolean r5 = r3.m23368(r4)
            if (r5 == 0) goto L28
            android.graphics.drawable.Drawable r4 = r3.m23347(r4)
            r2.setDivider(r4)
        L28:
            r3.m23371()
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354
    public int getWindowAnimations() {
            r1 = this;
            int r0 = r1.f25350
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7354
    public void initialize(androidx.appcompat.view.menu.C7343 r1) {
            r0 = this;
            r0.f25349 = r1
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            android.widget.ListAdapter r1 = r0.getAdapter()
            java.lang.Object r1 = r1.getItem(r3)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = (androidx.appcompat.view.menu.C7348) r1
            r0.mo28167(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.C7343.InterfaceC7345
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean mo28167(androidx.appcompat.view.menu.C7348 r3) {
            r2 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25349
            r1 = 0
            boolean r3 = r0.performItemAction(r3, r1)
            return r3
    }
}
