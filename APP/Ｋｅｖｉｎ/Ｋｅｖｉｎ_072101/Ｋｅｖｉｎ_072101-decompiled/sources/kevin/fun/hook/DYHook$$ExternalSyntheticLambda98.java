package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda98 implements java.lang.Runnable {
    public final long f$0;
    public final int f$1;
    public final android.content.Context f$2;
    public final de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f$3;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda98(long r4, int r6, android.content.Context r7, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r8) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r6
            r3.f$2 = r7
            r3.f$3 = r8
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            java.lang.String r0 = "O1JjABy4iO5YYASFtiO"
            java.lang.String r0 = androidx.loader.C1094.m2472(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۟ۡۦۣۨ, reason: not valid java name and contains not printable characters */
    public static void m4724(long r2, int r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = org.luckypray.dexkit.C1123.m10509()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r5 = (android.content.Context) r5
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r6 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r6
            kevin.fun.hook.DYHook.lambda$214(r2, r4, r5, r6)
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
            long r0 = androidx.lifecycle.process.C1089.m2136(r5)
            int r2 = androidx.lifecycle.process.C1088.m2054(r5)
            android.content.Context r3 = androidx.vectordrawable.C1103.m3144(r5)
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r4 = kevin.fun.hook.audio.C1116.m8085(r5)
            m4724(r0, r2, r3, r4)
            int r1 = kevin.fun.hook.audio.C1116.m8064()
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
            java.lang.String r0 = "WuazGUrYAco39pRKoSSSH4Fzf5rc"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1079.m1451(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L36:
            return
    }
}
