package a;

/* JADX INFO: loaded from: classes.dex */
public final class Y7 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static volatile a.Y7 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile android.app.Activity f353a;
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<a.D7<android.app.Activity, a.Wf>>> b;

    public Y7() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.b = r0
            return
    }

    public static void a(android.view.ViewGroup r4, a.V7 r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            android.view.View r2 = r4.getChildAt(r1)
            a.C0193i9.b(r2)
            r5.f(r2)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            a(r2, r5)
        L1a:
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    public final void b(android.app.Activity r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 0
            java.lang.String r2 = "Sns"
            boolean r1 = a.Be.I(r0, r2, r1)
            if (r1 == 0) goto L23
            java.lang.String r1 = "[GlobalLifecycle] Activity: "
            java.lang.String r1 = r1.concat(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.b(r1)
        L23:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<a.D7<android.app.Activity, a.Wf>>> r1 = r3.b
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L2e
            goto L49
        L2e:
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            a.D7 r1 = (a.D7) r1
            r1.f(r4)     // Catch: java.lang.Throwable -> L44
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L44
            goto L32
        L44:
            r1 = move-exception
            a.C0465xd.a(r1)
            goto L32
        L49:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r6) {
            r5 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r6, r0)
            a.Y7.c = r5
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            a.U7 r1 = new a.U7
            r2 = 0
            r1.<init>(r5, r2)
            java.lang.String r2 = "onCreate"
            java.lang.String r3 = "android.app.Activity"
            a.J8.a(r6, r3, r2, r0, r1)
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            a.U7 r2 = new a.U7
            r4 = 1
            r2.<init>(r5, r4)
            java.lang.String r4 = "onResume"
            a.J8.a(r6, r3, r4, r1, r2)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            a.U7 r1 = new a.U7
            r2 = 2
            r1.<init>(r5, r2)
            java.lang.String r2 = "onDestroy"
            a.J8.a(r6, r3, r2, r0, r1)
            java.lang.String r6 = "[GlobalLifecycle] hooked Activity lifecycle"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r0 = 1
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            a.C0453x1.b(r6)
            return
    }
}
