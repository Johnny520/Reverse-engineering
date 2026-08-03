package a;

/* JADX INFO: renamed from: a.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0399u1 {
    public static final java.lang.Class<?>[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final java.lang.String[] g = null;
    public static final a.C0162ge<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f703a;

    /* JADX INFO: renamed from: a.u1$a */
    public static class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.View f704a;
        public final java.lang.String b;
        public java.lang.reflect.Method c;
        public android.content.Context d;

        public a(android.view.View r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f704a = r1
                r0.b = r2
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r6) {
                r5 = this;
                java.lang.reflect.Method r0 = r5.c
                if (r0 != 0) goto L82
                android.view.View r0 = r5.f704a
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

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            a.C0399u1.b = r0
            r0 = 16843375(0x101026f, float:2.3695304E-38)
            int[] r0 = new int[]{r0}
            a.C0399u1.c = r0
            r0 = 16844160(0x1010580, float:2.3697504E-38)
            int[] r0 = new int[]{r0}
            a.C0399u1.d = r0
            r0 = 16844156(0x101057c, float:2.3697493E-38)
            int[] r0 = new int[]{r0}
            a.C0399u1.e = r0
            r0 = 16844148(0x1010574, float:2.369747E-38)
            int[] r0 = new int[]{r0}
            a.C0399u1.f = r0
            java.lang.String r0 = "android.view."
            java.lang.String r1 = "android.webkit."
            java.lang.String r2 = "android.widget."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            a.C0399u1.g = r0
            a.ge r0 = new a.ge
            r0.<init>()
            a.C0399u1.h = r0
            return
    }

    public C0399u1() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f703a = r0
            return
    }

    public a.F0 a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            a.F0 r0 = new a.F0
            r0.<init>(r2, r3)
            return r0
    }

    public a.H0 b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            a.H0 r0 = new a.H0
            r0.<init>(r2, r3)
            return r0
    }

    public a.J0 c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            a.J0 r0 = new a.J0
            r0.<init>(r2, r3)
            return r0
    }

    public a.C0185i1 d(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            a.i1 r0 = new a.i1
            int r1 = androidx.appcompat.R.attr.radioButtonStyle
            r0.<init>(r3, r4, r1)
            return r0
    }

    public a.C0345r1 e(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            a.r1 r0 = new a.r1
            r0.<init>(r2, r3)
            return r0
    }

    public final android.view.View f(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            a.ge<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = a.C0399u1.h
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r5, r1)
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            if (r2 != 0) goto L2b
            if (r6 == 0) goto L12
            java.lang.String r6 = r6.concat(r5)     // Catch: java.lang.Exception -> L38
            goto L13
        L12:
            r6 = r5
        L13:
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Exception -> L38
            r2 = 0
            java.lang.Class r4 = java.lang.Class.forName(r6, r2, r4)     // Catch: java.lang.Exception -> L38
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r4 = r4.asSubclass(r6)     // Catch: java.lang.Exception -> L38
            java.lang.Class<?>[] r6 = a.C0399u1.b     // Catch: java.lang.Exception -> L38
            java.lang.reflect.Constructor r2 = r4.getConstructor(r6)     // Catch: java.lang.Exception -> L38
            r0.put(r5, r2)     // Catch: java.lang.Exception -> L38
        L2b:
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L38
            java.lang.Object[] r4 = r3.f703a     // Catch: java.lang.Exception -> L38
            java.lang.Object r4 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L38
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Exception -> L38
            return r4
        L38:
            return r1
    }
}
