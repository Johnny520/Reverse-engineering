package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PPHook$$ExternalSyntheticLambda9 implements java.lang.Runnable {
    public final android.content.Context f$0;
    public final java.lang.Throwable f$1;
    public final kevin.fun.hook.PPHook.VerifyCallback f$2;

    static {
            return
    }

    public /* synthetic */ PPHook$$ExternalSyntheticLambda9(android.content.Context r3, java.lang.Throwable r4, kevin.fun.hook.PPHook.VerifyCallback r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.activity.C1064.m377()
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
            java.lang.String r0 = "L1T"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۤۨۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7286(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1098.m2793()
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
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kevin.fun.hook.PPHook$VerifyCallback r4 = (kevin.fun.hook.PPHook.VerifyCallback) r4
            kevin.fun.hook.PPHook.lambda$15(r2, r3, r4)
        L1d:
            int r1 = androidx.loader.C1095.m2562()
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
            java.lang.String r0 = "tDA6S0j"
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
            float r0 = java.lang.Float.parseFloat(r0)
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
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۧۦۥ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1748704: goto L15;
                case 1751501: goto L2c;
                case 1752644: goto L24;
                case 1754598: goto L1c;
                default: goto Ld;
            }
        Ld:
            java.lang.Throwable r1 = kevin.fun.hook.C1120.m8636(r5)
            java.lang.String r4 = "ۥۥۤ"
            r2 = r1
            goto L6
        L15:
            m7286(r0, r2, r3)
            java.lang.String r1 = "ۤ۟ۨ"
            r4 = r1
            goto L6
        L1c:
            android.content.Context r0 = androidx.appcompat.resources.C1068.m614(r5)
            java.lang.String r1 = "ۣ۟ۢ"
            r4 = r1
            goto L6
        L24:
            kevin.fun.hook.PPHook$VerifyCallback r1 = androidx.startup.C1101.m2988(r5)
            java.lang.String r4 = "ۡۢۡ"
            r3 = r1
            goto L6
        L2c:
            return
    }
}
