package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda185 implements java.lang.Runnable {
    public final kevin.fun.hook.DYHook f$0;
    public final int f$1;
    public final boolean[] f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda185(kevin.fun.hook.DYHook r3, int r4, boolean[] r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.lifecycle.process.C1091.m2283()
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
            java.lang.String r0 = "0Ja4D"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۦ۟ۨۡ, reason: not valid java name and contains not printable characters */
    public static void m4600(java.lang.Object r2, int r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            boolean[] r4 = (boolean[]) r4
            r2.m4431lambda$117$kevinfunhookDYHook(r3, r4)
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
            java.lang.String r3 = "ۥۥۥ"
            r0 = r1
            r2 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56293: goto L2c;
                case 1748864: goto L15;
                case 1752645: goto L24;
                case 1755558: goto L1c;
                default: goto Ld;
            }
        Ld:
            int r4 = androidx.startup.C1101.m3044(r5)
            java.lang.String r1 = "ۨۦۤ"
            r3 = r1
            goto L6
        L15:
            m4600(r0, r4, r2)
            java.lang.String r1 = "۟ۤ"
            r3 = r1
            goto L6
        L1c:
            boolean[] r1 = androidx.documentfile.C1076.m1268(r5)
            java.lang.String r3 = "ۡۧۦ"
            r2 = r1
            goto L6
        L24:
            kevin.fun.hook.DYHook r0 = androidx.vectordrawable.C1104.m3220(r5)
            java.lang.String r1 = "ۥۥۨ"
            r3 = r1
            goto L6
        L2c:
            return
    }
}
