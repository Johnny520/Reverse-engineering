package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q12 implements android.view.MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: δ */
    public static final java.lang.Class[] f8795 = null;

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8796;

    /* JADX INFO: renamed from: β */
    public java.lang.Object f8797;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f8798;

    static {
            java.lang.Class<android.view.MenuItem> r0 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            p000.q12.f8795 = r0
            return
    }

    public /* synthetic */ q12() {
            r1 = this;
            r0 = 0
            r1.f8796 = r0
            r1.<init>()
            return
    }

    public q12(androidx.appcompat.view.menu.MenuItemC0027 r2, android.view.MenuItem.OnMenuItemClickListener r3) {
            r1 = this;
            r0 = 1
            r1.f8796 = r0
            r1.<init>()
            r1.f8798 = r2
            r1.f8797 = r3
            return
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem r4) {
            r3 = this;
            int r0 = r3.f8796
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f8797
            android.view.MenuItem$OnMenuItemClickListener r0 = (android.view.MenuItem.OnMenuItemClickListener) r0
            java.lang.Object r3 = r3.f8798
            androidx.appcompat.view.menu.α r3 = (androidx.appcompat.view.menu.MenuItemC0027) r3
            android.view.MenuItem r3 = r3.m7304(r4)
            boolean r3 = r0.onMenuItemClick(r3)
            return r3
        L16:
            java.lang.Object r0 = r3.f8797
            java.lang.Object r3 = r3.f8798
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
