package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class od2 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.CopyOnWriteArrayList f8054 = null;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.od2.f8054 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static boolean m4227(p000.z81 r2, p000.C0574n5 r3, java.util.concurrent.atomic.AtomicBoolean r4) {
            r4.getClass()
            r2 = 0
            r3 = 1
            boolean r0 = r4.compareAndSet(r2, r3)
            if (r0 != 0) goto Lc
            return r2
        Lc:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.od2.f8054     // Catch: java.lang.Throwable -> L37
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L37
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L1e
            java.lang.String r0 = "XHSHelper: 当前没有注册 SAMPLE 功能 Hook"
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L37
            return r3
        L1e:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L29
            return r3
        L29:
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L31
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L37
        L31:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            throw r3     // Catch: java.lang.Throwable -> L37
        L37:
            r3 = move-exception
            r4.set(r2)
            throw r3
    }
}
