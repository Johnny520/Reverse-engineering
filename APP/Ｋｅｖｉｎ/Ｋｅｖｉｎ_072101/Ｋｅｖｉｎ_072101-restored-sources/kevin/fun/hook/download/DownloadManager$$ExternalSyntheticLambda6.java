package kevin.fun.hook.download;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadManager$$ExternalSyntheticLambda6 implements java.lang.Runnable {
    public final kevin.fun.hook.download.DownloadManager f$0;
    public final android.content.Context f$1;
    public final int f$2;
    public final java.lang.String f$3;

    static {
            return
    }

    public /* synthetic */ DownloadManager$$ExternalSyntheticLambda6(kevin.fun.hook.download.DownloadManager r3, android.content.Context r4, int r5, java.lang.String r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.lifecycle.process.C1088.m2011()
            r0 = 1616(0x650, float:2.264E-42)
        L11:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L17;
                case 49: goto L1a;
                case 204: goto L1f;
                case 239: goto L2a;
                default: goto L16;
            }
        L16:
            goto L11
        L17:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L11
        L1a:
            if (r1 < 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "PilLJkjlXNvBznpKxtgnT7l0L"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۣ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m8270(java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5) {
            int r1 = androidx.loader.C1099.m2876()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            java.lang.String r5 = (java.lang.String) r5
            r2.m8249lambda$15$kevinfunhookdownloadDownloadManager(r3, r4, r5)
        L1d:
            int r1 = kevin.fun.hook.audio.C1114.m7895()
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L40;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 > 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "vTVq"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            r1 = 0
            r5 = 0
            java.lang.String r4 = "ۣۨ۠"
            r0 = r1
            r2 = r1
            r3 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1746755: goto L35;
                case 1746881: goto L1e;
                case 1749703: goto L26;
                case 1750594: goto L16;
                case 1755527: goto L2e;
                default: goto Le;
            }
        Le:
            kevin.fun.hook.download.DownloadManager r1 = androidx.lifecycle.runtime.C1092.m2360(r6)
            java.lang.String r4 = "۟ۥۧ"
            r2 = r1
            goto L7
        L16:
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2064(r6)
            java.lang.String r1 = "ۨۥۤ"
            r4 = r1
            goto L7
        L1e:
            android.content.Context r1 = androidx.versionedparcelable.C1106.m3366(r6)
            java.lang.String r4 = "ۣۢۨ"
            r3 = r1
            goto L7
        L26:
            int r5 = androidx.lifecycle.process.C1089.m2104(r6)
            java.lang.String r1 = "ۣۡ۠"
            r4 = r1
            goto L7
        L2e:
            m8270(r2, r3, r5, r0)
            java.lang.String r1 = "۟ۡۥ"
            r4 = r1
            goto L7
        L35:
            return
    }
}
