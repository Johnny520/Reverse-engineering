package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda32 implements android.media.MediaScannerConnection.OnScanCompletedListener {
    public final kevin.fun.hook.XhsHook f$0;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda32(kevin.fun.hook.XhsHook r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.lifecycle.process.C1089.m2142()
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
            if (r1 < 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "muHTgslquupga"
            java.lang.String r0 = androidx.loader.C1098.m2778(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۟۟ۢۤۡ, reason: not valid java name and contains not printable characters */
    public static void m7780(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = org.luckypray.dexkit.C1124.m10581()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1e;
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
            kevin.fun.hook.XhsHook r2 = (kevin.fun.hook.XhsHook) r2
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri r4 = (android.net.Uri) r4
            r2.m7746lambda$32$kevinfunhookXhsHook(r3, r4)
        L1d:
            return
        L1e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L1d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(java.lang.String r4, android.net.Uri r5) {
            r3 = this;
            kevin.fun.hook.XhsHook r0 = androidx.interpolator.C1082.m1678(r3)
            m7780(r0, r4, r5)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            java.lang.String r0 = "rNPrAh17wbDd9isCYW4ErB"
            java.lang.String r0 = androidx.loader.C1099.m2832(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2a:
            return
    }
}
