package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda4 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.DYHook f$0;
    public final android.content.Context f$1;
    public final java.util.List f$2;
    public final android.app.Dialog f$3;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda4(kevin.fun.hook.DYHook r3, android.content.Context r4, java.util.List r5, android.app.Dialog r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
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
            java.lang.String r0 = "kendvmBuC73d2ey9Z8rl1DA"
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10497(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۣ۟ۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m4660(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.util.List r4 = (java.util.List) r4
            android.app.Dialog r5 = (android.app.Dialog) r5
            android.view.View r6 = (android.view.View) r6
            r2.m4477lambda$55$kevinfunhookDYHook(r3, r4, r5, r6)
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
    public final void onClick(android.view.View r7) {
            r6 = this;
            r1 = 0
            java.lang.String r5 = "ۤۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56446: goto L26;
                case 1747654: goto L35;
                case 1748644: goto L2e;
                case 1749758: goto L16;
                case 1754380: goto L1e;
                default: goto Le;
            }
        Le:
            java.util.List r0 = androidx.activity.C1065.m411(r6)
            java.lang.String r1 = "ۢۥۡ"
            r5 = r1
            goto L7
        L16:
            android.app.Dialog r1 = kevin.fun.hook.C1120.m8638(r6)
            java.lang.String r5 = "ۣۡ۠"
            r4 = r1
            goto L7
        L1e:
            android.content.Context r1 = androidx.startup.C1101.m3010(r6)
            java.lang.String r5 = "ۤۢۦ"
            r3 = r1
            goto L7
        L26:
            kevin.fun.hook.DYHook r1 = androidx.drawerlayout.C1077.m1321(r6)
            java.lang.String r5 = "ۧ۟ۤ"
            r2 = r1
            goto L7
        L2e:
            m4660(r2, r3, r0, r4, r7)
            java.lang.String r1 = "۠۟ۥ"
            r5 = r1
            goto L7
        L35:
            return
    }
}
