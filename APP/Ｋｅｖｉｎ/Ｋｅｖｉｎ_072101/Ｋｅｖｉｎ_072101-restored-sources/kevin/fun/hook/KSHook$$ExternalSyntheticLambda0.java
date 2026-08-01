package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final java.lang.ref.WeakReference f$1;
    public final java.lang.String f$2;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda0(kevin.fun.hook.KSHook r3, java.lang.ref.WeakReference r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.startup.C1100.m2972()
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
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "wN"
            java.lang.String r0 = androidx.lifecycle.viewmodel.C1093.m2376(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۨۢۥۡ, reason: not valid java name and contains not printable characters */
    public static void m7147(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1095.m2562()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.m7142lambda$40$kevinfunhookKSHook(r3, r4)
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

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "۠ۤۦ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747810: goto L24;
                case 1748830: goto L1c;
                case 1752701: goto L2c;
                case 1755400: goto L14;
                default: goto Ld;
            }
        Ld:
            m7147(r0, r3, r2)
            java.lang.String r1 = "ۥۧ۟"
            r4 = r1
            goto L6
        L14:
            java.lang.String r1 = androidx.lifecycle.runtime.C1092.m2354(r5)
            java.lang.String r4 = "ۤۨ۟"
            r2 = r1
            goto L6
        L1c:
            java.lang.ref.WeakReference r1 = androidx.drawerlayout.C1077.m1302(r5)
            java.lang.String r4 = "ۨۡۡ"
            r3 = r1
            goto L6
        L24:
            kevin.fun.hook.KSHook r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3753(r5)
            java.lang.String r1 = "ۡۦۣ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
