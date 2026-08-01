package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda20 implements kevin.fun.hook.KSHook.DownloadProgressListener {
    public final kevin.fun.hook.KSHook f$0;
    public final kevin.fun.hook.KSHook.DownloadDialogHolder f$1;
    public final long f$2;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda20(kevin.fun.hook.KSHook r4, kevin.fun.hook.KSHook.DownloadDialogHolder r5, long r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
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
            java.lang.String r0 = "jUzR"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۣۣۡۢ, reason: not valid java name and contains not printable characters */
    public static void m7160(java.lang.Object r6, java.lang.Object r7, long r8, int r10, int r11) {
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L44;
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
            r0 = r6
            kevin.fun.hook.KSHook r0 = (kevin.fun.hook.KSHook) r0
            r1 = r7
            kevin.fun.hook.KSHook$DownloadDialogHolder r1 = (kevin.fun.hook.KSHook.DownloadDialogHolder) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r0.m7131lambda$29$kevinfunhookKSHook(r1, r2, r4, r5)
        L20:
            int r1 = androidx.activity.C1062.m182()
            r0 = 1740(0x6cc, float:2.438E-42)
        L26:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2c;
                case 54: goto L31;
                case 471: goto L43;
                case 500: goto L34;
                default: goto L2b;
            }
        L2b:
            goto L26
        L2c:
            if (r1 < 0) goto L31
            r0 = 1833(0x729, float:2.569E-42)
            goto L26
        L31:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L26
        L34:
            java.lang.String r0 = "awZoF1LxGXVbGNscKbXtuX"
            java.lang.String r0 = androidx.interpolator.C1082.m1668(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L43:
            return
        L44:
            r0 = 1864(0x748, float:2.612E-42)
        L46:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4c;
                case 47483: goto L20;
                default: goto L4b;
            }
        L4b:
            goto L46
        L4c:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L46
    }

    @Override // kevin.fun.hook.KSHook.DownloadProgressListener
    public final void onProgress(int r7, int r8) {
            r6 = this;
            r4 = 0
            r2 = 0
            java.lang.String r5 = "ۢۥۡ"
            r0 = r4
            r1 = r4
        L7:
            int r4 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r4) {
                case 1747750: goto L27;
                case 1749758: goto L17;
                case 1750562: goto L2f;
                case 1750755: goto L1f;
                default: goto Le;
            }
        Le:
            r4 = r7
            r5 = r8
            m7160(r0, r1, r2, r4, r5)
            java.lang.String r4 = "ۣ۠۟"
            r5 = r4
            goto L7
        L17:
            kevin.fun.hook.KSHook r0 = androidx.lifecycle.runtime.C1092.m2353(r6)
            java.lang.String r4 = "ۣۦۦ"
            r5 = r4
            goto L7
        L1f:
            kevin.fun.hook.KSHook$DownloadDialogHolder r1 = androidx.activity.C1064.m319(r6)
            java.lang.String r4 = "۠ۢۨ"
            r5 = r4
            goto L7
        L27:
            long r2 = androidx.lifecycle.viewmodel.C1093.m2370(r6)
            java.lang.String r4 = "ۧۦۨ"
            r5 = r4
            goto L7
        L2f:
            return
    }
}
