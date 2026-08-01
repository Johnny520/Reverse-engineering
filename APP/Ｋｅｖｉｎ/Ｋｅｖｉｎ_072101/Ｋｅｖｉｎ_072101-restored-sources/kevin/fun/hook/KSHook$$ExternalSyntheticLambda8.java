package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda8 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final java.lang.ref.WeakReference f$1;
    public final kevin.fun.hook.KSHook.AtlasDownloadHolder f$2;
    public final int f$3;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda8(kevin.fun.hook.KSHook r3, java.lang.ref.WeakReference r4, kevin.fun.hook.KSHook.AtlasDownloadHolder r5, int r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.lifecycle.process.C1091.m2283()
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
            java.lang.String r0 = "yiug"
            java.lang.String r0 = androidx.vectordrawable.C1103.m69(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۧ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static void m7186(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1e;
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
            kevin.fun.hook.KSHook$AtlasDownloadHolder r4 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r4
            r2.m7136lambda$33$kevinfunhookKSHook(r3, r4, r5)
        L1d:
            return
        L1e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L1d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            kevin.fun.hook.KSHook r0 = androidx.lifecycle.process.C1089.m2122(r4)
            java.lang.ref.WeakReference r1 = androidx.customview.C1074.m1091(r4)
            kevin.fun.hook.KSHook$AtlasDownloadHolder r2 = androidx.core.C1073.m988(r4)
            int r3 = androidx.lifecycle.viewmodel.C1093.m2374(r4)
            m7186(r0, r1, r2, r3)
            int r1 = androidx.loader.C1096.m2651()
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
            java.lang.String r0 = "dEA91uzfeXY14AJanYW1nd"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }
}
