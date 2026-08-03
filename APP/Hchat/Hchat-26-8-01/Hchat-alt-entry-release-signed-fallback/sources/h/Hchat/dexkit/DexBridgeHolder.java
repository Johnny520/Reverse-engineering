package h.Hchat.dexkit;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DexBridgeHolder {
    private static final java.lang.String TAG = "[Hchat:DexBridgeHolder]";
    private final java.lang.String apkPath;
    private final h.Hchat.dexkit.DexFinder dexFinder;
    private final org.luckypray.dexkit.DexKitBridge dexKitBridge;
    private final java.lang.ClassLoader hostClassLoader;

    public DexBridgeHolder(org.luckypray.dexkit.DexKitBridge r1, h.Hchat.dexkit.DexFinder r2, java.lang.ClassLoader r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.dexKitBridge = r1
            r0.dexFinder = r2
            r0.hostClassLoader = r3
            r0.apkPath = r4
            return
    }

    public java.util.List<java.lang.String> findClassesByStrings(java.lang.String... r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.luckypray.dexkit.DexKitBridge r1 = r3.dexKitBridge
            if (r1 == 0) goto L4d
            if (r4 != 0) goto Lc
            goto L4d
        Lc:
            ch.c r1 = new ch.c     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            fh.a r2 = new fh.a     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: java.lang.Throwable -> L42
            r4.getClass()     // Catch: java.lang.Throwable -> L42
            fh.a.r0(r2, r4)     // Catch: java.lang.Throwable -> L42
            r1.f1664h = r2     // Catch: java.lang.Throwable -> L42
            org.luckypray.dexkit.DexKitBridge r4 = r3.dexKitBridge     // Catch: java.lang.Throwable -> L42
            hh.j r4 = r4.findClass(r1)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L42
        L2c:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L42
            hh.i r1 = (hh.i) r1     // Catch: java.lang.Throwable -> L42
            lh.a r1 = r1.p()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.f8057g     // Catch: java.lang.Throwable -> L42
            r0.add(r1)     // Catch: java.lang.Throwable -> L42
            goto L2c
        L42:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexBridgeHolder] findClassesByStrings 失败: "
            r1.<init>(r2)
            bc.e.s(r4, r1, r4)
        L4d:
            return r0
    }

    public java.util.List<e8.a> findMethodsByStrings(java.lang.String... r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.luckypray.dexkit.DexKitBridge r1 = r4.dexKitBridge
            if (r1 == 0) goto L55
            if (r5 != 0) goto Lc
            goto L55
        Lc:
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L4a
            r2.<init>()     // Catch: java.lang.Throwable -> L4a
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L4a
            r2.t0(r5)     // Catch: java.lang.Throwable -> L4a
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L4a
            org.luckypray.dexkit.DexKitBridge r5 = r4.dexKitBridge     // Catch: java.lang.Throwable -> L4a
            hh.p r5 = r5.findMethod(r1)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4a
        L29:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L55
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L4a
            hh.o r1 = (hh.o) r1     // Catch: java.lang.Throwable -> L4a
            e8.a r2 = new e8.a     // Catch: java.lang.Throwable -> L4a
            lh.d r3 = r1.p()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = r3.f8063g     // Catch: java.lang.Throwable -> L4a
            lh.d r1 = r1.p()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.f8064h     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4a
            r0.add(r2)     // Catch: java.lang.Throwable -> L4a
            goto L29
        L4a:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:DexBridgeHolder] findMethodsByStrings 失败: "
            r1.<init>(r2)
            bc.e.s(r5, r1, r5)
        L55:
            return r0
    }

    public java.lang.String getApkPath() {
            r1 = this;
            java.lang.String r0 = r1.apkPath
            return r0
    }

    public h.Hchat.dexkit.DexFinder getDexFinder() {
            r1 = this;
            h.Hchat.dexkit.DexFinder r0 = r1.dexFinder
            return r0
    }

    public org.luckypray.dexkit.DexKitBridge getDexKitBridge() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge r0 = r1.dexKitBridge
            return r0
    }

    public java.lang.ClassLoader getHostClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = r1.hostClassLoader
            return r0
    }
}
