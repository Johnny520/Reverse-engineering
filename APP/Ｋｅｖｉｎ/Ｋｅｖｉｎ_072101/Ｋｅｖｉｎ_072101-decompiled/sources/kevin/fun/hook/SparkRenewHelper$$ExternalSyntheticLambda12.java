package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SparkRenewHelper$$ExternalSyntheticLambda12 implements java.lang.Runnable {
    public final android.app.Activity f$0;
    public final boolean f$1;
    public final java.lang.String f$2;

    static {
            return
    }

    public /* synthetic */ SparkRenewHelper$$ExternalSyntheticLambda12(android.app.Activity r3, boolean r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            java.lang.String r0 = "ApaqF"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۣۨۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7418(java.lang.Object r2, boolean r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r4 = (java.lang.String) r4
            kevin.fun.hook.SparkRenewHelper.lambda$19(r2, r3, r4)
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
            r5 = this;
            r1 = 0
            r4 = 0
            java.lang.String r3 = "۠ۧۧ"
            r0 = r1
            r2 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1746789: goto L2c;
                case 1747873: goto L1d;
                case 1747904: goto L15;
                case 1753477: goto L24;
                default: goto Ld;
            }
        Ld:
            boolean r4 = androidx.versionedparcelable.C1106.m3386(r5)
            java.lang.String r1 = "ۦۡ۠"
            r3 = r1
            goto L6
        L15:
            android.app.Activity r0 = androidx.vectordrawable.C1103.m3133(r5)
            java.lang.String r1 = "ۥ۟ۢ"
            r3 = r1
            goto L6
        L1d:
            m7418(r0, r4, r2)
            java.lang.String r1 = "۟ۢۨ"
            r3 = r1
            goto L6
        L24:
            java.lang.String r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3815(r5)
            java.lang.String r3 = "۠ۦۧ"
            r2 = r1
            goto L6
        L2c:
            return
    }
}
