package defpackage;

/* JADX INFO: renamed from: ᛵᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0947 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.reflect.Method f4241;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f4242;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.View f4243;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.content.Context f4244;

    public ViewOnClickListenerC0947(android.view.View r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f4243 = r1
            r0.f4242 = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.f4241
            if (r0 != 0) goto L83
            android.view.View r0 = r5.f4243
            android.content.Context r1 = r0.getContext()
        La:
            java.lang.String r2 = r5.f4242
            if (r1 == 0) goto L37
            boolean r3 = r1.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L2a
            if (r3 != 0) goto L2a
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L2a
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L2a
            if (r2 == 0) goto L2a
            r5.f4241 = r2     // Catch: java.lang.NoSuchMethodException -> L2a
            r5.f4244 = r1     // Catch: java.lang.NoSuchMethodException -> L2a
            r0 = r2
            goto L83
        L2a:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L35
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto La
        L35:
            r1 = 0
            goto La
        L37:
            int r5 = r0.getId()
            r6 = -1
            if (r5 != r6) goto L41
            java.lang.String r5 = ""
            goto L60
        L41:
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
        L60:
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
        L83:
            android.content.Context r5 = r5.f4244     // Catch: java.lang.reflect.InvocationTargetException -> L8d java.lang.IllegalAccessException -> L96
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L8d java.lang.IllegalAccessException -> L96
            r0.invoke(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L8d java.lang.IllegalAccessException -> L96
            return
        L8d:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not execute method for android:onClick"
            r6.<init>(r0, r5)
            throw r6
        L96:
            r5 = move-exception
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not execute non-public method for android:onClick"
            r6.<init>(r0, r5)
            throw r6
    }
}
