package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C7340 implements androidx.appcompat.view.menu.InterfaceC7352, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f25419 = "ListMenuPresenter";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f25420 = "android:menu:list";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public android.content.Context f25421;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.view.LayoutInflater f25422;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 f25423;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.appcompat.view.menu.ExpandedMenuView f25424;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f25425;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f25426;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f25427;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 f25428;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7340.C7341 f25429;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int f25430;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟$ۥ, reason: contains not printable characters */
    public class C7341 extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f25431;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.view.menu.C7340 f25432;

        public C7341(androidx.appcompat.view.menu.C7340 r1) {
                r0 = this;
                r0.f25432 = r1
                r0.<init>()
                r1 = -1
                r0.f25431 = r1
                r0.m28195()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                androidx.appcompat.view.menu.ۥ۟۟ r0 = r2.f25432
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.f25423
                java.util.ArrayList r0 = r0.getNonActionItems()
                int r0 = r0.size()
                androidx.appcompat.view.menu.ۥ۟۟ r1 = r2.f25432
                int r1 = r1.f25425
                int r0 = r0 - r1
                int r1 = r2.f25431
                if (r1 >= 0) goto L16
                return r0
            L16:
                int r0 = r0 + (-1)
                return r0
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = r0.m28196(r1)
                return r1
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
                r2 = this;
                r0 = 0
                if (r4 != 0) goto Ld
                androidx.appcompat.view.menu.ۥ۟۟ r4 = r2.f25432
                android.view.LayoutInflater r1 = r4.f25422
                int r4 = r4.f25427
                android.view.View r4 = r1.inflate(r4, r5, r0)
            Ld:
                r5 = r4
                androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ r5 = (androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355) r5
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r3 = r2.m28196(r3)
                r5.initialize(r3, r0)
                return r4
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
                r0 = this;
                r0.m28195()
                super.notifyDataSetChanged()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m28195() {
                r5 = this;
                androidx.appcompat.view.menu.ۥ۟۟ r0 = r5.f25432
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.f25423
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r0.getExpandedItem()
                if (r0 == 0) goto L27
                androidx.appcompat.view.menu.ۥ۟۟ r1 = r5.f25432
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r1.f25423
                java.util.ArrayList r1 = r1.getNonActionItems()
                int r2 = r1.size()
                r3 = 0
            L17:
                if (r3 >= r2) goto L27
                java.lang.Object r4 = r1.get(r3)
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r4 = (androidx.appcompat.view.menu.C7348) r4
                if (r4 != r0) goto L24
                r5.f25431 = r3
                return
            L24:
                int r3 = r3 + 1
                goto L17
            L27:
                r0 = -1
                r5.f25431 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.appcompat.view.menu.C7348 m28196(int r3) {
                r2 = this;
                androidx.appcompat.view.menu.ۥ۟۟ r0 = r2.f25432
                androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r0.f25423
                java.util.ArrayList r0 = r0.getNonActionItems()
                androidx.appcompat.view.menu.ۥ۟۟ r1 = r2.f25432
                int r1 = r1.f25425
                int r3 = r3 + r1
                int r1 = r2.f25431
                if (r1 < 0) goto L15
                if (r3 < r1) goto L15
                int r3 = r3 + 1
            L15:
                java.lang.Object r3 = r0.get(r3)
                androidx.appcompat.view.menu.ۥ۟۟۟ۢ r3 = (androidx.appcompat.view.menu.C7348) r3
                return r3
        }
    }

    public C7340(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f25427 = r1
            r0.f25426 = r2
            return
    }

    public C7340(android.content.Context r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            r1.f25421 = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1.f25422 = r2
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean collapseItemActionView(androidx.appcompat.view.menu.C7343 r1, androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean expandItemActionView(androidx.appcompat.view.menu.C7343 r1, androidx.appcompat.view.menu.C7348 r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public int getId() {
            r1 = this;
            int r0 = r1.f25430
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public androidx.appcompat.view.menu.InterfaceC7354 getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r3.f25424
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r3.f25422
            int r1 = Yue.C5058.C5068.f17199
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r3.f25424 = r4
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r4 = r3.f25429
            if (r4 != 0) goto L1c
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r4 = new androidx.appcompat.view.menu.ۥ۟۟$ۥ
            r4.<init>(r3)
            r3.f25429 = r4
        L1c:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.f25424
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r0 = r3.f25429
            r4.setAdapter(r0)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.f25424
            r4.setOnItemClickListener(r3)
        L28:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r3.f25424
            return r4
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void initForMenu(android.content.Context r3, androidx.appcompat.view.menu.C7343 r4) {
            r2 = this;
            int r0 = r2.f25426
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f25426
            r0.<init>(r3, r1)
            r2.f25421 = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
            r2.f25422 = r3
            goto L24
        L14:
            android.content.Context r0 = r2.f25421
            if (r0 == 0) goto L24
            r2.f25421 = r3
            android.view.LayoutInflater r0 = r2.f25422
            if (r0 != 0) goto L24
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f25422 = r3
        L24:
            r2.f25423 = r4
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r3 = r2.f25429
            if (r3 == 0) goto L2d
            r3.notifyDataSetChanged()
        L2d:
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onCloseMenu(androidx.appcompat.view.menu.C7343 r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r1.f25428
            if (r0 == 0) goto L7
            r0.onCloseMenu(r2, r3)
        L7:
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r0.f25423
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r2 = r0.f25429
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r2 = r2.m28196(r3)
            r3 = 0
            r1.performItemAction(r2, r0, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.m28191(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.f25424
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.m28192(r0)
            return r0
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuC7359 r3) {
            r2 = this;
            boolean r0 = r3.hasVisibleItems()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            androidx.appcompat.view.menu.ۥ۟۟۟۠ r0 = new androidx.appcompat.view.menu.ۥ۟۟۟۠
            r0.<init>(r3)
            r1 = 0
            r0.m28214(r1)
            androidx.appcompat.view.menu.ۥ۟۟۟ۤ$ۥ r0 = r2.f25428
            if (r0 == 0) goto L18
            r0.mo28095(r3)
        L18:
            r3 = 1
            return r3
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void setCallback(androidx.appcompat.view.menu.InterfaceC7352.InterfaceC7353 r1) {
            r0 = this;
            r0.f25428 = r1
            return
    }

    @Override // androidx.appcompat.view.menu.InterfaceC7352
    public void updateMenuView(boolean r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r1 = r0.f25429
            if (r1 == 0) goto L7
            r1.notifyDataSetChanged()
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.widget.ListAdapter m28189() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r0 = r1.f25429
            if (r0 != 0) goto Lb
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r0 = new androidx.appcompat.view.menu.ۥ۟۟$ۥ
            r0.<init>(r1)
            r1.f25429 = r0
        Lb:
            androidx.appcompat.view.menu.ۥ۟۟$ۥ r0 = r1.f25429
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m28190() {
            r1 = this;
            int r0 = r1.f25425
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m28191(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "android:menu:list"
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r0)
            if (r2 == 0) goto Ld
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r1.f25424
            r0.restoreHierarchyState(r2)
        Ld:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28192(android.os.Bundle r3) {
            r2 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.appcompat.view.menu.ExpandedMenuView r1 = r2.f25424
            if (r1 == 0) goto Lc
            r1.saveHierarchyState(r0)
        Lc:
            java.lang.String r1 = "android:menu:list"
            r3.putSparseParcelableArray(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m28193(int r1) {
            r0 = this;
            r0.f25430 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m28194(int r1) {
            r0 = this;
            r0.f25425 = r1
            androidx.appcompat.view.menu.ExpandedMenuView r1 = r0.f25424
            if (r1 == 0) goto La
            r1 = 0
            r0.updateMenuView(r1)
        La:
            return
    }
}
