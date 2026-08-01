package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda110 implements kevin.fun.hook.DYHook.Consumer {
    public final boolean[] f$0;
    public final int f$1;
    public final java.lang.Runnable f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda110(boolean[] r3, int r4, java.lang.Runnable r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.activity.C1065.m427()
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
            java.lang.String r0 = "GdQQ2JOOTvjwNQY1reZTo42Elw"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۠ۥۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4518(java.lang.Object r2, int r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            boolean[] r2 = (boolean[]) r2
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            kevin.fun.hook.DYHook.lambda$161(r2, r3, r4, r5)
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

    @Override // kevin.fun.hook.DYHook.Consumer
    public final void accept(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            r5 = 0
            java.lang.String r4 = "ۥ۟۠"
            r1 = r0
            r2 = r0
            r3 = r0
        L7:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r0) {
                case 1748769: goto L25;
                case 1748857: goto L16;
                case 1752454: goto L2c;
                case 1754381: goto L34;
                case 1755491: goto L1d;
                default: goto Le;
            }
        Le:
            java.lang.Runnable r0 = androidx.lifecycle.process.C1088.m2030(r6)
            java.lang.String r4 = "ۡۤۤ"
            r1 = r0
            goto L7
        L16:
            m4518(r2, r5, r1, r3)
            java.lang.String r0 = "ۧ۟ۥ"
            r4 = r0
            goto L7
        L1d:
            int r5 = androidx.startup.C1101.m2992(r6)
            java.lang.String r0 = "ۥۢۧ"
            r4 = r0
            goto L7
        L25:
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r4 = "ۡۧ۟"
            r3 = r0
            goto L7
        L2c:
            boolean[] r0 = androidx.loader.C1097.m2714(r6)
            java.lang.String r4 = "ۨۤ۟"
            r2 = r0
            goto L7
        L34:
            return
    }
}
