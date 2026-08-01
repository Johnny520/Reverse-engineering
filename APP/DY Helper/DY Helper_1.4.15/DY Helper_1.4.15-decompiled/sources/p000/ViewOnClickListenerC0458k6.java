package p000;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0458k6 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final android.view.View f5769;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f5770;

    /* JADX INFO: renamed from: η */
    public java.lang.reflect.Method f5771;

    /* JADX INFO: renamed from: θ */
    public android.content.Context f5772;

    public ViewOnClickListenerC0458k6(android.view.View r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f5769 = r1
            r0.f5770 = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.f5771
            if (r0 != 0) goto L82
            android.view.View r0 = r5.f5769
            android.content.Context r1 = r0.getContext()
        La:
            java.lang.String r2 = r5.f5770
            if (r1 == 0) goto L36
            boolean r3 = r1.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L29
            if (r3 != 0) goto L29
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L29
            if (r2 == 0) goto L29
            r5.f5771 = r2     // Catch: java.lang.NoSuchMethodException -> L29
            r5.f5772 = r1     // Catch: java.lang.NoSuchMethodException -> L29
            goto L82
        L29:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L34
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto La
        L34:
            r1 = 0
            goto La
        L36:
            int r5 = r0.getId()
            r6 = -1
            if (r5 != r6) goto L40
            java.lang.String r5 = ""
            goto L5f
        L40:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = " with id '"
            r6.<init>(r1)
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r5 = r1.getResourceEntryName(r5)
            r6.append(r5)
            java.lang.String r5 = "'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L5f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not find method "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
            r1.append(r2)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r6.<init>(r5)
            throw r6
        L82:
            java.lang.reflect.Method r0 = r5.f5771     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L97
            android.content.Context r5 = r5.f5772     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L97
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L97
            r0.invoke(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L97
            return
        L8e:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not execute method for android:onClick"
            r6.<init>(r0, r5)
            throw r6
        L97:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not execute non-public method for android:onClick"
            r6.<init>(r0, r5)
            throw r6
    }
}
