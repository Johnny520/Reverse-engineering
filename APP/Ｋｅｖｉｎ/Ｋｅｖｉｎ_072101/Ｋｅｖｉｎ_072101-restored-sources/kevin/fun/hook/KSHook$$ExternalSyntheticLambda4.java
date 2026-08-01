package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda4 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.KSHook f$0;
    public final java.lang.ref.WeakReference f$1;
    public final android.content.Context f$2;
    public final de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f$3;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda4(kevin.fun.hook.KSHook r3, java.lang.ref.WeakReference r4, android.content.Context r5, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.core.ktx.C1070.m822()
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
            if (r1 < 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "qVJTRpyUGxgXliPPCi0Og"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۣ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m7181(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L22;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            android.content.Context r4 = (android.content.Context) r4
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r5 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r5
            android.view.View r6 = (android.view.View) r6
            r2.m7117lambda$10$kevinfunhookKSHook(r3, r4, r5, r6)
        L21:
            return
        L22:
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L21;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            kevin.fun.hook.KSHook r0 = androidx.emoji2.C1080.m1530(r4)
            java.lang.ref.WeakReference r1 = androidx.vectordrawable.C1104.m3219(r4)
            android.content.Context r2 = androidx.vectordrawable.animated.C1102.m3121(r4)
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = androidx.emoji2.viewsintegration.C1078.m1390(r4)
            m7181(r0, r1, r2, r3, r5)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            if (r1 > 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            java.lang.String r0 = "vlEQOotwNxpbdIwPfrhky"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }
}
