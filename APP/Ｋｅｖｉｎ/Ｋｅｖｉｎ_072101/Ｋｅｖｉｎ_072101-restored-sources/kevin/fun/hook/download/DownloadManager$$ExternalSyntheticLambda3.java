package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda3 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager f$0;
    public final boolean f$1;
    public final android.content.Context f$2;

    static {
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda3(kevin.fun.hook.download.DownloadManager r3, boolean r4, android.content.Context r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            java.lang.String r0 = "57zoSNnvYck08"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۥۣ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m8267(java.lang.Object r2, boolean r3, java.lang.Object r4) {
            int r1 = androidx.interpolator.C1083.m1725()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r4 = (android.content.Context) r4
            r2.m8245lambda$10$kevinfunhookdownloadDownloadManager(r3, r4)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            kevin.fun.hook.download.DownloadManager r0 = androidx.vectordrawable.C1105.m3300(r3)
            boolean r1 = androidx.vectordrawable.C1105.m3326(r3)
            android.content.Context r2 = androidx.viewpager.C1108.m3537(r3)
            m8267(r0, r1, r2)
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L2e;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r1 < 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.String r0 = "an4zyZT40"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }
}
