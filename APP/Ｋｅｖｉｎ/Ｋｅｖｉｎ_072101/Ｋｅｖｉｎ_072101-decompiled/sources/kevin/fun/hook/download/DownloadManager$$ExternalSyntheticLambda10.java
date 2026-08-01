package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda10 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager f$0;
    public final android.app.Dialog[] f$1;
    public final android.content.Context f$2;
    public final java.lang.String f$3;

    static {
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda10(kevin.fun.hook.download.DownloadManager r3, android.app.Dialog[] r4, android.content.Context r5, java.lang.String r6) {
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
            java.lang.String r0 = "lruheHCOqJzpKxuwovtB7q"
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m8259(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L20;
                default: goto Lb;
            }
        Lb:
            goto L6
        Lc:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L6
        Lf:
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.download.DownloadManager r2 = (kevin.fun.hook.download.DownloadManager) r2
            android.app.Dialog[] r3 = (android.app.Dialog[]) r3
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r5 = (java.lang.String) r5
            r2.m8254lambda$6$kevinfunhookdownloadDownloadManager(r3, r4, r5)
        L1f:
            return
        L20:
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L1f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            r1 = 0
            java.lang.String r5 = "ۤ۠"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56444: goto L17;
                case 1748671: goto Lf;
                case 1750756: goto L2e;
                case 1751591: goto L26;
                case 1754630: goto L1f;
                default: goto Le;
            }
        Le:
            return
        Lf:
            android.content.Context r1 = androidx.vectordrawable.animated.C1102.m3115(r6)
            java.lang.String r5 = "ۣۦۧ"
            r4 = r1
            goto L7
        L17:
            kevin.fun.hook.download.DownloadManager r1 = androidx.interpolator.C1081.m1573(r6)
            java.lang.String r5 = "ۤۢۥ"
            r2 = r1
            goto L7
        L1f:
            m8259(r2, r0, r4, r3)
            java.lang.String r1 = "ۢۦ۟"
            r5 = r1
            goto L7
        L26:
            android.app.Dialog[] r0 = androidx.vectordrawable.C1105.m3309(r6)
            java.lang.String r1 = "ۡۡ۟"
            r5 = r1
            goto L7
        L2e:
            java.lang.String r1 = kevin.fun.hook.webdav.C1119.m111(r6)
            java.lang.String r5 = "ۧۧۦ"
            r3 = r1
            goto L7
    }
}
