package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w60 {

    /* JADX INFO: renamed from: β */
    public static final p000.fw1 f11581 = null;

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ p000.b70 f11582;

    static {
            fw1 r0 = new fw1
            r1 = 0
            r0.<init>(r1)
            p000.w60.f11581 = r0
            return
    }

    public w60(p000.b70 r1) {
            r0 = this;
            r0.<init>()
            r0.f11582 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Class m6322(java.lang.ClassLoader r3, java.lang.String r4) {
            fw1 r0 = p000.w60.f11581
            java.lang.Object r1 = r0.get(r3)
            fw1 r1 = (p000.fw1) r1
            r2 = 0
            if (r1 != 0) goto L13
            fw1 r1 = new fw1
            r1.<init>(r2)
            r0.put(r3, r1)
        L13:
            java.lang.Object r0 = r1.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L23
            java.lang.Class r3 = java.lang.Class.forName(r4, r2, r3)
            r1.put(r4, r3)
            return r3
        L23:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Class m6323(java.lang.ClassLoader r3, java.lang.String r4) {
            java.lang.String r0 = "Unable to instantiate fragment "
            java.lang.Class r3 = m6322(r3, r4)     // Catch: java.lang.ClassCastException -> L7 java.lang.ClassNotFoundException -> L14
            return r3
        L7:
            r3 = move-exception
            pm r1 = new pm
            java.lang.String r2 = ": make sure class is a valid subclass of Fragment"
            java.lang.String r4 = p000.lz1.m3674(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
        L14:
            r3 = move-exception
            pm r1 = new pm
            java.lang.String r2 = ": make sure class name exists"
            java.lang.String r4 = p000.lz1.m3674(r0, r4, r2)
            r1.<init>(r4, r3)
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public final p000.n60 m6324(java.lang.String r4) {
            r3 = this;
            b70 r3 = r3.f11582
            p60 r3 = r3.f1537
            androidx.fragment.app.FragmentActivity r3 = r3.f8431
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            java.lang.Class r3 = m6323(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            r2 = 0
            java.lang.reflect.Constructor r3 = r3.getConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            java.lang.Object r3 = r3.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            n60 r3 = (p000.n60) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.NoSuchMethodException -> L20 java.lang.IllegalAccessException -> L22 java.lang.InstantiationException -> L24
            return r3
        L1e:
            r3 = move-exception
            goto L26
        L20:
            r3 = move-exception
            goto L32
        L22:
            r3 = move-exception
            goto L3e
        L24:
            r3 = move-exception
            goto L48
        L26:
            pm r0 = new pm
            java.lang.String r2 = ": calling Fragment constructor caused an exception"
            java.lang.String r4 = p000.lz1.m3674(r1, r4, r2)
            r0.<init>(r4, r3)
            throw r0
        L32:
            pm r0 = new pm
            java.lang.String r2 = ": could not find Fragment constructor"
            java.lang.String r4 = p000.lz1.m3674(r1, r4, r2)
            r0.<init>(r4, r3)
            throw r0
        L3e:
            pm r2 = new pm
            java.lang.String r4 = p000.lz1.m3674(r1, r4, r0)
            r2.<init>(r4, r3)
            throw r2
        L48:
            pm r2 = new pm
            java.lang.String r4 = p000.lz1.m3674(r1, r4, r0)
            r2.<init>(r4, r3)
            throw r2
    }
}
