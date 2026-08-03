package com.google.android.material.navigation;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public final class NavigationBarMenu extends androidx.appcompat.view.menu.C7343 {
    private final int maxItemCount;

    @Yue.InterfaceC4410
    private final java.lang.Class<?> viewClass;

    public NavigationBarMenu(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 java.lang.Class<?> r2, int r3) {
            r0 = this;
            r0.<init>(r1)
            r0.viewClass = r2
            r0.maxItemCount = r3
            return
    }

    @Override // androidx.appcompat.view.menu.C7343
    @Yue.InterfaceC4410
    public android.view.MenuItem addInternal(int r4, int r5, int r6, @Yue.InterfaceC4410 java.lang.CharSequence r7) {
            r3 = this;
            int r0 = r3.size()
            r1 = 1
            int r0 = r0 + r1
            int r2 = r3.maxItemCount
            if (r0 > r2) goto L1f
            r3.stopDispatchingItemsChanged()
            android.view.MenuItem r4 = super.addInternal(r4, r5, r6, r7)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.C7348
            if (r5 == 0) goto L1b
            r5 = r4
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r5 = (androidx.appcompat.view.menu.C7348) r5
            r5.m28234(r1)
        L1b:
            r3.startDispatchingItemsChanged()
            return r4
        L1f:
            java.lang.Class<?> r4 = r3.viewClass
            java.lang.String r4 = r4.getSimpleName()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Maximum number of items supported by "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " is "
            r6.append(r7)
            int r7 = r3.maxItemCount
            r6.append(r7)
            java.lang.String r7 = ". Limit can be checked with "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = "#getMaxItemCount()"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // androidx.appcompat.view.menu.C7343, android.view.Menu
    @Yue.InterfaceC4410
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, @Yue.InterfaceC4410 java.lang.CharSequence r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class<?> r3 = r0.viewClass
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " does not support submenus"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public int getMaxItemCount() {
            r1 = this;
            int r0 = r1.maxItemCount
            return r0
    }
}
