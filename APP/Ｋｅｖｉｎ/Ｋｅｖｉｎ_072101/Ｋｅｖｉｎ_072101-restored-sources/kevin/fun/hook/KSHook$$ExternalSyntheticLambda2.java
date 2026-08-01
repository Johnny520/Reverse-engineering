package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda2 implements java.lang.Runnable {
    public final long f$0;
    public final android.content.Context f$1;
    public final de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f$2;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda2(long r4, android.content.Context r6, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r7) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r6
            r3.f$2 = r7
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
            java.lang.String r0 = "jSuT1BJMzvzMw"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۢ۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static void m7159(long r2, java.lang.Object r4, java.lang.Object r5) {
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
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
            android.content.Context r4 = (android.content.Context) r4
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r5 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r5
            kevin.fun.hook.KSHook.lambda$0(r2, r4, r5)
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
            r6 = this;
            r1 = 0
            r4 = 0
            java.lang.String r3 = "ۨۡۢ"
            r0 = r1
            r2 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56479: goto L27;
                case 1751684: goto L1f;
                case 1753415: goto L17;
                case 1755401: goto Lf;
                default: goto Le;
            }
        Le:
            return
        Lf:
            long r4 = androidx.vectordrawable.animated.C1102.m3112(r6)
            java.lang.String r1 = "ۦ۟۠"
            r3 = r1
            goto L7
        L17:
            android.content.Context r0 = kevin.fun.hook.audio.C1116.m8089(r6)
            java.lang.String r1 = "ۤۥۥ"
            r3 = r1
            goto L7
        L1f:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = androidx.loader.C1098.m2792(r6)
            java.lang.String r3 = "ۥۤ"
            r2 = r1
            goto L7
        L27:
            m7159(r4, r0, r2)
            java.lang.String r1 = "ۢۧ۠"
            r3 = r1
            goto L7
    }
}
