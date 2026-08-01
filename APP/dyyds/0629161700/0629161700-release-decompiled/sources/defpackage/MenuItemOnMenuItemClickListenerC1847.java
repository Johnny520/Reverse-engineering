package defpackage;

/* JADX INFO: renamed from: ᲁᛴᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1847 implements android.view.MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.Class[] f8046 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f8047;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8048;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f8049;

    static {
            java.lang.Class<android.view.MenuItem> r0 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            defpackage.MenuItemOnMenuItemClickListenerC1847.f8046 = r0
            return
    }

    public /* synthetic */ MenuItemOnMenuItemClickListenerC1847() {
            r1 = this;
            r0 = 0
            r1.f8048 = r0
            r1.<init>()
            return
    }

    public MenuItemOnMenuItemClickListenerC1847(defpackage.MenuItemC1719 r2, android.view.MenuItem.OnMenuItemClickListener r3) {
            r1 = this;
            r0 = 1
            r1.f8048 = r0
            r1.<init>()
            r1.f8047 = r2
            r1.f8049 = r3
            return
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem r4) {
            r3 = this;
            int r0 = r3.f8048
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f8049
            android.view.MenuItem$OnMenuItemClickListener r0 = (android.view.MenuItem.OnMenuItemClickListener) r0
            java.lang.Object r3 = r3.f8047
            ᲀᛸᛱᲈ r3 = (defpackage.MenuItemC1719) r3
            android.view.MenuItem r3 = r3.m2355(r4)
            boolean r3 = r0.onMenuItemClick(r3)
            return r3
        L16:
            java.lang.Object r0 = r3.f8049
            java.lang.Object r3 = r3.f8047
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class r1 = r3.getReturnType()     // Catch: java.lang.Exception -> L3c
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L3c
            if (r1 != r2) goto L33
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L3c
            java.lang.Object r3 = r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L3c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L3c
            goto L3b
        L33:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L3c
            r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L3c
            r3 = 1
        L3b:
            return r3
        L3c:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }
}
