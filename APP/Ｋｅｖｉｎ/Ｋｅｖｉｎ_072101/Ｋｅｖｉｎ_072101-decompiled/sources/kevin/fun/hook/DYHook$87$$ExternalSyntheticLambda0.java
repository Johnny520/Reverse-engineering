package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$87$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final kevin.fun.hook.DYHook.C063887 f$0;
    public final java.lang.Object f$1;
    public final android.content.Context f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$87$$ExternalSyntheticLambda0(kevin.fun.hook.DYHook.C063887 r3, java.lang.Object r4, android.content.Context r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = org.luckypray.dexkit.C1124.m10581()
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
            java.lang.String r0 = "dCnJkBMWzE8zPm6HQi3AVINcOsuBh"
            java.lang.String r0 = androidx.loader.C1094.m2472(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۤۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m6447(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.interpolator.C1083.m1725()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3f;
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
            kevin.fun.hook.DYHook$87 r2 = (kevin.fun.hook.DYHook.C063887) r2
            android.content.Context r4 = (android.content.Context) r4
            r2.m6445lambda$0$kevinfunhookDYHook$87(r3, r4)
        L1b:
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3e;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 < 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "to"
            java.lang.String r0 = androidx.lifecycle.process.C1087.m1957(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L1b;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۦ۠"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56506: goto L1c;
                case 1747774: goto L14;
                case 1750533: goto L24;
                case 1752577: goto L2c;
                default: goto Ld;
            }
        Ld:
            m6447(r3, r0, r2)
            java.lang.String r1 = "ۥۣ۟"
            r4 = r1
            goto L6
        L14:
            android.content.Context r1 = androidx.vectordrawable.C1104.m3242(r5)
            java.lang.String r4 = "ۣۡ"
            r2 = r1
            goto L6
        L1c:
            kevin.fun.hook.DYHook$87 r1 = androidx.customview.C1075.m1136(r5)
            java.lang.String r4 = "ۣ۟ۡ"
            r3 = r1
            goto L6
        L24:
            java.lang.Object r0 = androidx.loader.C1097.m2732(r5)
            java.lang.String r1 = "ۣ۠ۡ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
