package vb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vb.c f14305a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f14306b = null;

    static {
            vb.c r0 = new vb.c
            r0.<init>()
            vb.c.f14305a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            vb.c.f14306b = r0
            return
    }

    public static void a(vb.a r4) {
            java.lang.String r0 = r4.a()
            java.util.ArrayList r1 = vb.c.f14306b
            if (r0 != 0) goto L9
            goto L1a
        L9:
            ca.s r2 = new ca.s
            r3 = 20
            r2.<init>(r0, r3)
            be.i r0 = new be.i
            r3 = 29
            r0.<init>(r2, r3)
            r1.removeIf(r0)
        L1a:
            r1.add(r4)
            return
    }
}
