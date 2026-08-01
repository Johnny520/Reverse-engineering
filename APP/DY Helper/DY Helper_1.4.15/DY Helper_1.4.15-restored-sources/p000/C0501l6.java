package p000;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0501l6 {

    /* JADX INFO: renamed from: β */
    public static final java.lang.Class[] f6449 = null;

    /* JADX INFO: renamed from: γ */
    public static final int[] f6450 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.lang.String[] f6451 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.fw1 f6452 = null;

    /* JADX INFO: renamed from: α */
    public final java.lang.Object[] f6453;

    static {
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            p000.C0501l6.f6449 = r0
            r0 = 16843375(0x101026f, float:2.3695304E-38)
            int[] r0 = new int[]{r0}
            p000.C0501l6.f6450 = r0
            java.lang.String r0 = "android.view."
            java.lang.String r1 = "android.webkit."
            java.lang.String r2 = "android.widget."
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            p000.C0501l6.f6451 = r0
            fw1 r0 = new fw1
            r1 = 0
            r0.<init>(r1)
            p000.C0501l6.f6452 = r0
            return
    }

    public C0501l6() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f6453 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final android.view.View m3520(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            fw1 r0 = p000.C0501l6.f6452
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 != 0) goto L2a
            if (r5 == 0) goto L11
            java.lang.String r5 = r5.concat(r4)     // Catch: java.lang.Exception -> L37
            goto L12
        L11:
            r5 = r4
        L12:
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L37
            r1 = 0
            java.lang.Class r3 = java.lang.Class.forName(r5, r1, r3)     // Catch: java.lang.Exception -> L37
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r3 = r3.asSubclass(r5)     // Catch: java.lang.Exception -> L37
            java.lang.Class[] r5 = p000.C0501l6.f6449     // Catch: java.lang.Exception -> L37
            java.lang.reflect.Constructor r1 = r3.getConstructor(r5)     // Catch: java.lang.Exception -> L37
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L37
        L2a:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L37
            java.lang.Object[] r2 = r2.f6453     // Catch: java.lang.Exception -> L37
            java.lang.Object r2 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L37
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Exception -> L37
            return r2
        L37:
            r2 = 0
            return r2
    }
}
