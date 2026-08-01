package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DexKitFinder$$ExternalSyntheticLambda14 implements java.lang.Runnable {
    public final android.content.Context f$0;
    public final java.lang.StringBuilder f$1;
    public final int f$2;
    public final int f$3;

    static {
            return
    }

    public /* synthetic */ DexKitFinder$$ExternalSyntheticLambda14(android.content.Context r4, java.lang.StringBuilder r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            int r1 = androidx.activity.C1064.m377()
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
            java.lang.String r0 = "Uq6dTV0js7aydExGrH"
            java.lang.String r0 = androidx.vectordrawable.C1104.m3213(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۟ۤۥ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6660(java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            android.content.Context r2 = (android.content.Context) r2
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            kevin.fun.hook.DexKitFinder.lambda$15(r2, r3, r4, r5)
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
            r4 = this;
            android.content.Context r0 = androidx.activity.C1066.m532(r4)
            java.lang.StringBuilder r1 = androidx.startup.C1101.m3015(r4)
            int r2 = androidx.activity.C1063.m293(r4)
            int r3 = org.luckypray.dexkit.C1125.m10639(r4)
            m6660(r0, r1, r2, r3)
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            java.lang.String r0 = "Ie5SYd"
            java.lang.String r0 = androidx.emoji2.viewsintegration.C1078.m1387(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }
}
