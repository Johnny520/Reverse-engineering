package t8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f13089a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            t8.b.f13089a = r0
            return
    }

    public static boolean a(k8.o r0, java.lang.String r1) {
            boolean r1 = b(r1)
            if (r1 == 0) goto L1d
            boolean r1 = r0.f7452i
            if (r1 != 0) goto L1d
            boolean r1 = r0.q()
            if (r1 == 0) goto L11
            goto L1d
        L11:
            boolean r1 = r0.e()
            if (r1 == 0) goto L18
            goto L1d
        L18:
            boolean r0 = r0.n()
            return r0
        L1d:
            r0 = 0
            return r0
    }

    public static boolean b(java.lang.String r2) {
            java.lang.String r0 = "@chatroom"
            r1 = 0
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L13
            java.lang.String r0 = "@im.chatroom"
            boolean r2 = og.t.W(r2, r0, r1)
            if (r2 == 0) goto L12
            goto L13
        L12:
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static void c(android.content.Context r2, java.lang.String r3, long r4) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r2 = oh.h.i(r2, r3)
            boolean r0 = b(r3)
            if (r0 == 0) goto L4a
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4a
            if (r2 != 0) goto L1b
            goto L4a
        L1b:
            long r0 = java.lang.System.currentTimeMillis()
            t8.a r2 = new t8.a
            r2.<init>(r3, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r4 = t8.b.f13089a
            r4.put(r2, r3)
            int r2 = r4.size()
            r3 = 128(0x80, float:1.8E-43)
            if (r2 < r3) goto L4a
            java.util.Set r2 = r4.entrySet()
            ca.c r3 = new ca.c
            r4 = 12
            r3.<init>(r0, r4)
            be.i r4 = new be.i
            r5 = 26
            r4.<init>(r3, r5)
            r2.removeIf(r4)
        L4a:
            return
    }
}
