package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda37 implements java.lang.Runnable {
    public final kevin.fun.hook.XhsHook f$0;
    public final int f$1;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda37(kevin.fun.hook.XhsHook r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L26;
                default: goto L12;
            }
        L12:
            goto Ld
        L13:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld
        L16:
            if (r1 < 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "0V40AcqEsbrRSPMQR98D1Q"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۣ۟ۡ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m7785(java.lang.Object r2, int r3) {
            int r1 = androidx.loader.C1099.m2876()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.XhsHook r2 = (kevin.fun.hook.XhsHook) r2
            r2.m7739lambda$25$kevinfunhookXhsHook(r3)
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
            r2 = this;
            kevin.fun.hook.XhsHook r0 = androidx.activity.C1066.m515(r2)
            int r1 = kevin.fun.hook.webdav.C1118.m8510(r2)
            m7785(r0, r1)
            return
    }
}
