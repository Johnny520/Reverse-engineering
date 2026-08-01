package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda67 implements kevin.fun.hook.DYHook.Consumer {
    public final int[] f$0;
    public final kevin.fun.hook.DYHook.Consumer f$1;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda67(int[] r3, kevin.fun.hook.DYHook.Consumer r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L2a;
                default: goto L12;
            }
        L12:
            goto Ld
        L13:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld
        L16:
            if (r1 < 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "s9W5OLRPGajioPEA5U6E9fygB"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۟۟ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static void m4690(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.interpolator.C1083.m1725()
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
            int[] r2 = (int[]) r2
            kevin.fun.hook.DYHook$Consumer r3 = (kevin.fun.hook.DYHook.Consumer) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            kevin.fun.hook.DYHook.lambda$193(r2, r3, r4)
        L1d:
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "eqvgx79YLIshCth8EcHBBY"
            java.lang.String r0 = kevin.fun.hook.audio.C1115.m8007(r0)
            int r0 = java.lang.Integer.parseInt(r0)
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

    @Override // kevin.fun.hook.DYHook.Consumer
    public final void accept(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            java.lang.String r4 = "ۣ۠ۢ"
            r1 = r0
            r2 = r0
            r3 = r0
        L6:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r0) {
                case 1747745: goto L1b;
                case 1747904: goto L14;
                case 1754530: goto L2b;
                case 1755525: goto L23;
                default: goto Ld;
            }
        Ld:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r4 = "۠ۧۧ"
            r3 = r0
            goto L6
        L14:
            m4690(r1, r2, r3)
            java.lang.String r0 = "ۧۤ۟"
            r4 = r0
            goto L6
        L1b:
            int[] r0 = androidx.activity.C1063.m254(r5)
            java.lang.String r4 = "ۨۥۢ"
            r1 = r0
            goto L6
        L23:
            kevin.fun.hook.DYHook$Consumer r0 = androidx.activity.C1065.m431(r5)
            java.lang.String r4 = "ۧۢۨ"
            r2 = r0
            goto L6
        L2b:
            return
    }
}
