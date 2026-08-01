package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda37 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final kevin.fun.hook.KSHook.DownloadDialogHolder f$1;
    public final int f$2;
    public final int f$3;
    public final long f$4;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda37(kevin.fun.hook.KSHook r4, kevin.fun.hook.KSHook.DownloadDialogHolder r5, int r6, int r7, long r8) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            r3.f$4 = r8
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            if (r1 < 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            java.lang.String r0 = "eiopXAsoU"
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8109(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۟ۢۦۦۨ, reason: not valid java name and contains not printable characters */
    public static void m7178(java.lang.Object r6, java.lang.Object r7, int r8, int r9, long r10) {
            int r1 = androidx.activity.C1065.m427()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L21;
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
            r3 = r9
            r4 = r10
            r0.m7135lambda$32$kevinfunhookKSHook(r1, r2, r3, r4)
        L20:
            return
        L21:
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L20;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L23
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            r6 = 0
            r8 = 0
            r4 = 0
            java.lang.String r7 = "ۣ۟۟"
            r0 = r6
            r1 = r6
            r2 = r8
            r3 = r8
        La:
            int r6 = kevin.fun.hook.audio.C1114.m7934(r7)
            switch(r6) {
                case 1746691: goto L29;
                case 1747904: goto L40;
                case 1747927: goto L31;
                case 1748610: goto L19;
                case 1752546: goto L21;
                case 1755460: goto L39;
                default: goto L11;
            }
        L11:
            int r3 = androidx.versionedparcelable.C1106.m3339(r9)
            java.lang.String r6 = "۠ۨ۟"
            r7 = r6
            goto La
        L19:
            kevin.fun.hook.KSHook$DownloadDialogHolder r1 = androidx.loader.C1094.m2498(r9)
            java.lang.String r6 = "ۥۢ۟"
            r7 = r6
            goto La
        L21:
            int r2 = androidx.appcompat.resources.C1068.m643(r9)
            java.lang.String r6 = "ۣ۟ۡ"
            r7 = r6
            goto La
        L29:
            kevin.fun.hook.KSHook r0 = androidx.activity.C1062.m189(r9)
            java.lang.String r6 = "ۡ۟۠"
            r7 = r6
            goto La
        L31:
            long r4 = kevin.fun.hook.audio.C1115.m7982(r9)
            java.lang.String r6 = "ۣۨ۟"
            r7 = r6
            goto La
        L39:
            m7178(r0, r1, r2, r3, r4)
            java.lang.String r6 = "۠ۧۧ"
            r7 = r6
            goto La
        L40:
            return
    }
}
