package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda7 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager f$0;
    public final android.content.Context f$1;
    public final java.lang.String f$2;

    static {
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda7(kevin.fun.hook.download.DownloadManager r3, android.content.Context r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
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
            java.lang.String r0 = "tjxg5"
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2067(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۦۨۧۨ, reason: not valid java name and contains not printable characters */
    public static void m8271(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = com.tencent.mmkv.C1109.m3598()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.m8244lambda$1$kevinfunhookdownloadDownloadManager(r3, r4)
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
            java.lang.String r4 = "ۡۡ۟"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56350: goto L24;
                case 1746724: goto L2c;
                case 1748671: goto L14;
                case 1752493: goto L1c;
                default: goto Ld;
            }
        Ld:
            m8271(r2, r0, r3)
            java.lang.String r1 = "۟۠ۥ"
            r4 = r1
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r1 = androidx.vectordrawable.C1103.m3188(r5)
            java.lang.String r4 = "ۡ۟"
            r2 = r1
            goto L6
        L1c:
            java.lang.String r1 = androidx.core.C1073.m1016(r5)
            java.lang.String r4 = "ۦۦ"
            r3 = r1
            goto L6
        L24:
            android.content.Context r0 = androidx.lifecycle.livedata.C1085.m1878(r5)
            java.lang.String r1 = "ۥ۠ۨ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
