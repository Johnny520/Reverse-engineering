package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda8 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager f$0;
    public final boolean f$1;
    public final android.content.Context f$2;
    public final java.lang.String f$3;

    static {
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda8(kevin.fun.hook.download.DownloadManager r3, boolean r4, android.content.Context r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.lifecycle.process.C1090.m2172()
            r0 = 1616(0x650, float:2.264E-42)
        L11:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L17;
                case 49: goto L1a;
                case 204: goto L1f;
                case 239: goto L2e;
                default: goto L16;
            }
        L16:
            goto L11
        L17:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L11
        L1a:
            if (r1 > 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "RwY66t2wGJjcO41QeXKz2"
            java.lang.String r0 = androidx.vectordrawable.C1103.m69(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۥ۠ۨۡ, reason: contains not printable characters */
    public static void m8272(java.lang.Object r2, boolean r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r5 = (java.lang.String) r5
            r2.m8246lambda$11$kevinfunhookdownloadDownloadManager(r3, r4, r5)
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
            r6 = this;
            r1 = 0
            r5 = 0
            java.lang.String r4 = "ۡ۟ۡ"
            r0 = r1
            r2 = r1
            r3 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1748611: goto L1e;
                case 1750533: goto L2e;
                case 1750813: goto L16;
                case 1752516: goto L26;
                case 1753663: goto Lf;
                default: goto Le;
            }
        Le:
            return
        Lf:
            m8272(r2, r5, r3, r0)
            java.lang.String r1 = "ۡۥ"
            r4 = r1
            goto L7
        L16:
            boolean r5 = androidx.annotation.experimental.C1067.m557(r6)
            java.lang.String r1 = "ۥۡ۠"
            r4 = r1
            goto L7
        L1e:
            kevin.fun.hook.download.DownloadManager r1 = androidx.emoji2.viewsintegration.C1079.m1476(r6)
            java.lang.String r4 = "ۣۨۢ"
            r2 = r1
            goto L7
        L26:
            android.content.Context r1 = com.tencent.mmkv.C1109.m3631(r6)
            java.lang.String r4 = "ۣ۟ۡ"
            r3 = r1
            goto L7
        L2e:
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1866(r6)
            java.lang.String r1 = "ۦۧ۠"
            r4 = r1
            goto L7
    }
}
