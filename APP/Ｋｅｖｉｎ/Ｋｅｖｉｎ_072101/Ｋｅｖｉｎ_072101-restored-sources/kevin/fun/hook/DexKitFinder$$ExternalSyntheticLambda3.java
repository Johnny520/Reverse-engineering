package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DexKitFinder$$ExternalSyntheticLambda3 implements kevin.fun.hook.DexKitFinder.FinderTask {
    public final org.luckypray.dexkit.DexKitBridge f$0;
    public final java.lang.ClassLoader f$1;

    static {
            return
    }

    public /* synthetic */ DexKitFinder$$ExternalSyntheticLambda3(org.luckypray.dexkit.DexKitBridge r3, java.lang.ClassLoader r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L2a;
                default: goto L12;
            }
        L12:
            goto Ld
        L13:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld
        L16:
            if (r1 > 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "wtH1OsQ"
            java.lang.String r0 = androidx.loader.C1099.m2832(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۟ۥۦۦۣ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6663(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.loader.C1099.m2876()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            org.luckypray.dexkit.DexKitBridge r2 = (org.luckypray.dexkit.DexKitBridge) r2
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            java.lang.String r0 = kevin.fun.hook.DexKitFinder.lambda$10(r2, r3)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    @Override // kevin.fun.hook.DexKitFinder.FinderTask
    public final java.lang.String run() {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge r0 = androidx.lifecycle.process.C1090.m2192(r2)
            java.lang.ClassLoader r1 = androidx.versionedparcelable.C1107.m3448(r2)
            java.lang.String r0 = m6663(r0, r1)
            return r0
    }
}
