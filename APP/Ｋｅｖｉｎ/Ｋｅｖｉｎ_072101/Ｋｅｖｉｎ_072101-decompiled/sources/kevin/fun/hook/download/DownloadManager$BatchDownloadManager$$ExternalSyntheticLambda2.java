package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager.BatchDownloadManager f$0;
    public final android.content.Context f$1;
    public final int f$2;
    public final int f$3;

    static {
            return
    }

    public /* synthetic */ DownloadManager$BatchDownloadManager$$ExternalSyntheticLambda2(kevin.fun.hook.download.DownloadManager.BatchDownloadManager r3, android.content.Context r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.activity.C1066.m518()
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
            java.lang.String r0 = "bX9KRH2u"
            java.lang.String r0 = androidx.activity.C1064.m367(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۟ۤ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static void m8307(java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r2 = (kevin.fun.hook.download.DownloadManager.BatchDownloadManager) r2
            android.content.Context r3 = (android.content.Context) r3
            r2.m103x2a02fdcf(r3, r4, r5)
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
            r4 = this;
            kevin.fun.hook.download.DownloadManager$BatchDownloadManager r0 = androidx.lifecycle.process.C1087.m1983(r4)
            android.content.Context r1 = androidx.vectordrawable.C1105.m3277(r4)
            int r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3661(r4)
            int r3 = androidx.lifecycle.livedata.C1086.m1919(r4)
            m8307(r0, r1, r2, r3)
            int r1 = com.tencent.mmkv.C1109.m3598()
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L36;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r1 < 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            java.lang.String r0 = "6cAbLBpycrFhS8gYaCzMYQ"
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2067(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }
}
