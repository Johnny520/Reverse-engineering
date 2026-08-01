package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sg0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.ConcurrentHashMap f9894 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f9895 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f9896 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap f9897 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.CopyOnWriteArrayList f9898 = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.sg0.f9894 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.sg0.f9895 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.sg0.f9896 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.sg0.f9897 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.sg0.f9898 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m5494() {
            java.lang.String r0 = "im_anti_recall_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final boolean m5495(java.lang.String r1) {
            if (r1 == 0) goto L16
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L16
            java.lang.String r0 = "Recall Content Hided"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r0 = 1
            if (r1 != r0) goto L16
            return r0
        L16:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static final void m5496(java.lang.Throwable r2) {
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "DYHelper:AntiRecall"
            p000.C0888ux.m5977(r1, r0, r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final void m5497(java.lang.Object r5) {
            if (r5 != 0) goto L3
            goto L58
        L3:
            java.lang.String r5 = m5499(r5)
            if (r5 != 0) goto La
            goto L58
        La:
            java.util.concurrent.ConcurrentHashMap r0 = p000.sg0.f9895
            r0.remove(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r1 = p000.sg0.f9894
            java.lang.Object r0 = r1.putIfAbsent(r5, r0)
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            m5500(r1)
            if (r0 == 0) goto L58
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.sg0.f9898
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r5)     // Catch: java.lang.Throwable -> L39
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L39
            goto L40
        L39:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L40:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L27
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "撤回监听器异常: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 0
            r3 = 4
            java.lang.String r4 = "DYHelper:AntiRecall"
            p000.C0888ux.m5988(r4, r1, r2, r3, r2)
            goto L27
        L58:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static final int m5498(java.lang.Object r3) {
            r0 = 0
            java.lang.String r1 = "getMsgType"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L18
            boolean r1 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L10
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L18
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L18
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m5499(java.lang.Object r2) {
            java.lang.String r0 = "getUuid"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = p000.qe0.m4869(r2, r0, r1)     // Catch: java.lang.Throwable -> L10
            boolean r0 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L10
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static void m5500(java.util.concurrent.ConcurrentHashMap r3) {
            int r0 = r3.size()
            r1 = 3000(0xbb8, float:4.204E-42)
            if (r0 > r1) goto L9
            goto L25
        L9:
            java.util.Set r0 = r3.keySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            r3.remove(r2)
            int r1 = r1 + 1
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r2) goto L12
        L25:
            return
    }
}
