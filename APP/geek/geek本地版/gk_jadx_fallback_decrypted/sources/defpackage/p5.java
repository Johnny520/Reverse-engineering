package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p5 implements android.view.View.OnClickListener {
    public final android.view.View a;
    public final java.lang.String b;
    public java.lang.reflect.Method c;
    public android.content.Context d;

    public p5(android.view.View r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            java.lang.reflect.Method r0 = r5.c
            if (r0 != 0) goto L82
            android.view.View r0 = r5.a
            android.content.Context r1 = r0.getContext()
        La:
            java.lang.String r2 = r5.b
            if (r1 == 0) goto L36
            boolean r3 = r1.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L29
            if (r3 != 0) goto L29
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Method r2 = r3.getMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L29
            if (r2 == 0) goto L29
            r5.c = r2     // Catch: java.lang.NoSuchMethodException -> L29
            r5.d = r1     // Catch: java.lang.NoSuchMethodException -> L29
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
            int r6 = r0.getId()
            r1 = -1
            if (r6 != r1) goto L40
            java.lang.String r6 = ""
            goto L5f
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = " with id '"
            r1.<init>(r3)
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r6 = r3.getResourceEntryName(r6)
            r1.append(r6)
            java.lang.String r6 = "'"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Could not find method "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
            r3.append(r2)
            java.lang.Class r0 = r0.getClass()
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6)
            throw r1
        L82:
            java.lang.reflect.Method r0 = r5.c     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90
            android.content.Context r1 = r5.d     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90
            r0.invoke(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90
            return
        L8e:
            r6 = move-exception
            goto L92
        L90:
            r6 = move-exception
            goto L9a
        L92:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not execute method for android:onClick"
            r0.<init>(r1, r6)
            throw r0
        L9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not execute non-public method for android:onClick"
            r0.<init>(r1, r6)
            throw r0
    }
}
