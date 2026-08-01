package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static final defpackage.u30 b = null;
    public final /* synthetic */ defpackage.yl a;

    static {
            u30 r0 = new u30
            r0.<init>()
            defpackage.tl.b = r0
            return
    }

    public tl(defpackage.yl r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.Class b(java.lang.ClassLoader r3, java.lang.String r4) {
            u30 r0 = defpackage.tl.b
            r1 = 0
            java.lang.Object r2 = r0.getOrDefault(r3, r1)
            u30 r2 = (defpackage.u30) r2
            if (r2 != 0) goto L13
            u30 r2 = new u30
            r2.<init>()
            r0.put(r3, r2)
        L13:
            java.lang.Object r0 = r2.getOrDefault(r4, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L24
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r4, r0, r3)
            r2.put(r4, r3)
            return r3
        L24:
            return r0
    }

    public static java.lang.Class c(java.lang.ClassLoader r3, java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = b(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L14
            return r3
        L7:
            r3 = move-exception
            pb r1 = new pb
            java.lang.String r2 = ": make sure class is a valid subclass of Fragment"
            java.lang.String r4 = defpackage.z30.j(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
        L14:
            r3 = move-exception
            pb r1 = new pb
            java.lang.String r2 = ": make sure class name exists"
            java.lang.String r4 = defpackage.z30.j(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
    }

    public final defpackage.ml a(java.lang.String r5) {
            r4 = this;
            yl r0 = r4.a
            nl r0 = r0.n
            androidx.fragment.app.FragmentActivity r0 = r0.D
            java.lang.String r1 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r2 = "Unable to instantiate fragment "
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            java.lang.Class r0 = c(r0, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            r3 = 0
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            ml r0 = (defpackage.ml) r0     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            return r0
        L1e:
            r0 = move-exception
            goto L26
        L20:
            r0 = move-exception
            goto L32
        L22:
            r0 = move-exception
            goto L3e
        L24:
            r0 = move-exception
            goto L48
        L26:
            pb r1 = new pb
            java.lang.String r3 = ": calling Fragment constructor caused an exception"
            java.lang.String r5 = defpackage.z30.j(r2, r5, r3)
            r1.<init>(r5, r0)
            throw r1
        L32:
            pb r1 = new pb
            java.lang.String r3 = ": could not find Fragment constructor"
            java.lang.String r5 = defpackage.z30.j(r2, r5, r3)
            r1.<init>(r5, r0)
            throw r1
        L3e:
            pb r3 = new pb
            java.lang.String r5 = defpackage.z30.j(r2, r5, r1)
            r3.<init>(r5, r0)
            throw r3
        L48:
            pb r3 = new pb
            java.lang.String r5 = defpackage.z30.j(r2, r5, r1)
            r3.<init>(r5, r0)
            throw r3
    }
}
