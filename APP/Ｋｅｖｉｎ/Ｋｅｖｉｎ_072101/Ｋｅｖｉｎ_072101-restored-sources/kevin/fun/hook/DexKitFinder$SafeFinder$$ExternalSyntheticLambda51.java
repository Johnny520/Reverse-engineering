package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DexKitFinder$SafeFinder$$ExternalSyntheticLambda51 implements kevin.fun.hook.DexKitFinder.FinderTask {
    public final kevin.fun.hook.DexKitFinder.SafeFinder f$0;

    static {
            return
    }

    public /* synthetic */ DexKitFinder$SafeFinder$$ExternalSyntheticLambda51(kevin.fun.hook.DexKitFinder.SafeFinder r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L28;
                default: goto L10;
            }
        L10:
            goto Lb
        L11:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lb
        L14:
            if (r1 > 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "shBHsdZsFH036LEEeXGJkgx"
            java.lang.String r0 = androidx.lifecycle.process.C1091.m2259(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۧۤۨۨ, reason: not valid java name and contains not printable characters */
    public static java.lang.String m6910(java.lang.Object r2) {
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1b;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.DexKitFinder$SafeFinder r2 = (kevin.fun.hook.DexKitFinder.SafeFinder) r2
            java.lang.String r0 = r2.m6835lambda$61$kevinfunhookDexKitFinder$SafeFinder()
        L1a:
            return r0
        L1b:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L24;
                case 54: goto L1a;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    @Override // kevin.fun.hook.DexKitFinder.FinderTask
    public final java.lang.String run() {
            r1 = this;
            kevin.fun.hook.DexKitFinder$SafeFinder r0 = androidx.interpolator.C1081.m1644(r1)
            java.lang.String r0 = m6910(r0)
            return r0
    }
}
