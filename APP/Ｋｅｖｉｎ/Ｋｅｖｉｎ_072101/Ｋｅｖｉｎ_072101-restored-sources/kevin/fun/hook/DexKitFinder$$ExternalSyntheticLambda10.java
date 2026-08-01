package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DexKitFinder$$ExternalSyntheticLambda10 implements java.lang.Runnable {
    public final int f$0;
    public final int f$1;
    public final java.lang.String f$2;

    static {
            return
    }

    public /* synthetic */ DexKitFinder$$ExternalSyntheticLambda10(int r4, int r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L2c;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 > 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "Ks5kmVSRhUTh6ElVViZTMjbUVG2oU"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۦ۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m6656(int r2, int r3, java.lang.Object r4) {
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.String r4 = (java.lang.String) r4
            kevin.fun.hook.DexKitFinder.lambda$0(r2, r3, r4)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۦۡ۟"
            r2 = r3
            r4 = r3
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1751620: goto L23;
                case 1753476: goto L1b;
                case 1753605: goto L29;
                case 1754407: goto L14;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = androidx.activity.C1063.m256(r5)
            java.lang.String r1 = "ۣۣۤ"
            goto L6
        L14:
            int r2 = androidx.versionedparcelable.C1106.m3359(r5)
            java.lang.String r1 = "ۤۦۨ"
            goto L6
        L1b:
            int r3 = androidx.interpolator.C1081.m1634(r5)
            java.lang.String r1 = "ۧ۠۠"
            r4 = r3
            goto L6
        L23:
            m6656(r4, r2, r0)
            java.lang.String r1 = "ۦۥۤ"
            goto L6
        L29:
            return
    }
}
