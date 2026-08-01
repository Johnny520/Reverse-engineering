package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda28 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook.AtlasDownloadHolder f$0;
    public final int f$1;
    public final int f$2;
    public final long f$3;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda28(kevin.fun.hook.KSHook.AtlasDownloadHolder r3, int r4, int r5, long r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            java.lang.String r0 = "tDRL"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۣۧۡۤ, reason: not valid java name and contains not printable characters */
    public static void m7168(java.lang.Object r3, int r4, int r5, long r6) {
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
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
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r3
            kevin.fun.hook.KSHook.lambda$38(r3, r4, r5, r6)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r5 = 0
            r0 = 0
            r2 = 0
            java.lang.String r1 = "ۢ۠ۡ"
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748647: goto L23;
                case 1749603: goto L1c;
                case 1751496: goto L16;
                case 1754597: goto L2b;
                case 1755590: goto L32;
                default: goto Lf;
            }
        Lf:
            long r2 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3656(r7)
            java.lang.String r1 = "ۣۤ۟"
            goto L8
        L16:
            m7168(r0, r6, r4, r2)
            java.lang.String r1 = "ۨۧۥ"
            goto L8
        L1c:
            kevin.fun.hook.KSHook$AtlasDownloadHolder r0 = kevin.fun.hook.audio.C1114.m7921(r7)
            java.lang.String r1 = "ۡ۠ۦ"
            goto L8
        L23:
            int r5 = androidx.documentfile.C1076.m1247(r7)
            java.lang.String r1 = "ۧۦۤ"
            r6 = r5
            goto L8
        L2b:
            int r4 = androidx.vectordrawable.animated.C1102.m3098(r7)
            java.lang.String r1 = "ۣۨ۠"
            goto L8
        L32:
            return
    }
}
