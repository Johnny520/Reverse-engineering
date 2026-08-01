package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n92 {

    /* JADX INFO: renamed from: α */
    public final p000.zz1 f7477;

    /* JADX INFO: renamed from: β */
    public final java.util.LinkedHashMap f7478;

    /* JADX INFO: renamed from: γ */
    public final java.util.LinkedHashSet f7479;

    /* JADX INFO: renamed from: δ */
    public volatile boolean f7480;

    public n92() {
            r3 = this;
            r3.<init>()
            zz1 r0 = new zz1
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            r3.f7477 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.f7478 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.f7479 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4016(java.lang.AutoCloseable r1) {
            if (r1 == 0) goto Ld
            p000.a12.m22(r1)     // Catch: java.lang.Exception -> L6
            return
        L6:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        Ld:
            return
    }
}
