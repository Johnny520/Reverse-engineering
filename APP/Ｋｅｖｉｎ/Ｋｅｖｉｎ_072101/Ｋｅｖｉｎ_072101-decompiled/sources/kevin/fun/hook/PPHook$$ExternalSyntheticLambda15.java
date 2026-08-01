package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PPHook$$ExternalSyntheticLambda15 implements java.lang.Runnable {
    public final android.content.Context f$0;
    public final java.lang.String f$1;
    public final boolean f$2;
    public final java.lang.String f$3;
    public final kevin.fun.hook.PPHook.VerifyCallback f$4;

    static {
            return
    }

    public /* synthetic */ PPHook$$ExternalSyntheticLambda15(android.content.Context r3, java.lang.String r4, boolean r5, java.lang.String r6, kevin.fun.hook.PPHook.VerifyCallback r7) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            int r1 = androidx.lifecycle.process.C1089.m2142()
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
            java.lang.String r0 = "XbR"
            java.lang.String r0 = androidx.documentfile.C1076.m1239(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۟ۢۥۧۥ, reason: not valid java name and contains not printable characters */
    public static void m7275(java.lang.Object r2, java.lang.Object r3, boolean r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = (java.lang.String) r5
            kevin.fun.hook.PPHook$VerifyCallback r6 = (kevin.fun.hook.PPHook.VerifyCallback) r6
            kevin.fun.hook.PPHook.lambda$18(r2, r3, r4, r5, r6)
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
            r5 = this;
            android.content.Context r0 = androidx.lifecycle.livedata.C1085.m1881(r5)
            java.lang.String r1 = androidx.activity.C1064.m351(r5)
            boolean r2 = androidx.appcompat.resources.C1068.m618(r5)
            java.lang.String r3 = androidx.lifecycle.livedata.C1085.m1827(r5)
            kevin.fun.hook.PPHook$VerifyCallback r4 = androidx.vectordrawable.C1105.m3310(r5)
            m7275(r0, r1, r2, r3, r4)
            int r1 = androidx.core.C1072.m980()
            r0 = 1616(0x650, float:2.264E-42)
        L1d:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L23;
                case 49: goto L26;
                case 204: goto L2b;
                case 239: goto L3a;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1d
        L26:
            if (r1 > 0) goto L23
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "1dcs"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L3a:
            return
    }
}
