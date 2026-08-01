package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda14 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final java.lang.ref.WeakReference f$1;
    public final kevin.fun.hook.KSHook.DownloadDialogHolder f$2;
    public final java.lang.String f$3;
    public final java.lang.String f$4;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda14(kevin.fun.hook.KSHook r3, java.lang.ref.WeakReference r4, kevin.fun.hook.KSHook.DownloadDialogHolder r5, java.lang.String r6, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L30;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r1 > 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            java.lang.String r0 = "hpwcc2IpMchKQk4G5h00AyUEiWQtV"
            java.lang.String r0 = androidx.interpolator.C1083.m1724(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۟ۦۧۢۦ, reason: not valid java name and contains not printable characters */
    public static void m7153(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L22;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            kevin.fun.hook.KSHook$DownloadDialogHolder r4 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            r2.m7128lambda$26$kevinfunhookKSHook(r3, r4, r5, r6)
        L21:
            return
        L22:
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L21;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            kevin.fun.hook.KSHook r0 = androidx.emoji2.viewsintegration.C1079.m1437(r5)
            java.lang.ref.WeakReference r1 = androidx.startup.C1101.m3019(r5)
            kevin.fun.hook.KSHook$DownloadDialogHolder r2 = androidx.lifecycle.process.C1090.m2178(r5)
            java.lang.String r3 = androidx.lifecycle.process.C1090.m2194(r5)
            java.lang.String r4 = androidx.interpolator.C1081.m1584(r5)
            m7153(r0, r1, r2, r3, r4)
            int r1 = androidx.lifecycle.process.C1091.m2283()
            r0 = 1616(0x650, float:2.264E-42)
        L1d:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L23;
                case 49: goto L26;
                case 204: goto L2b;
                case 239: goto L3a;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1d
        L26:
            if (r1 < 0) goto L23
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "E311cR5RHv9iy67mQVgX5"
            java.lang.String r0 = androidx.activity.C1063.m233(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
    }
}
