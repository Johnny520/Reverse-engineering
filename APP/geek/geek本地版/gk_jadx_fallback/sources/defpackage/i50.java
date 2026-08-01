package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i50 implements android.view.MenuItem.OnMenuItemClickListener {
    public static final java.lang.Class[] d = null;
    public final /* synthetic */ int a;
    public java.lang.Object b;
    public java.lang.Object c;

    static {
            java.lang.Class<android.view.MenuItem> r0 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            defpackage.i50.d = r0
            return
    }

    public /* synthetic */ i50() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public i50(defpackage.su r2, android.view.MenuItem.OnMenuItemClickListener r3) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.b
            android.view.MenuItem$OnMenuItemClickListener r0 = (android.view.MenuItem.OnMenuItemClickListener) r0
            java.lang.Object r1 = r4.c
            su r1 = (defpackage.su) r1
            android.view.MenuItem r5 = r1.g(r5)
            boolean r5 = r0.onMenuItemClick(r5)
            return r5
        L16:
            java.lang.Object r0 = r4.b
            java.lang.Object r1 = r4.c
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.Exception -> L33
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L33
            if (r2 != r3) goto L35
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L33
            java.lang.Object r5 = r1.invoke(r0, r5)     // Catch: java.lang.Exception -> L33
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Exception -> L33
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Exception -> L33
            goto L3d
        L33:
            r5 = move-exception
            goto L3e
        L35:
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L33
            r1.invoke(r0, r5)     // Catch: java.lang.Exception -> L33
            r5 = 1
        L3d:
            return r5
        L3e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
    }
}
