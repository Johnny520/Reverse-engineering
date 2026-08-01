package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda27 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.XhsHook f$0;
    public final boolean f$1;
    public final java.lang.String f$2;
    public final android.content.Context f$3;
    public final java.lang.String f$4;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda27(kevin.fun.hook.XhsHook r4, boolean r5, java.lang.String r6, android.content.Context r7, java.lang.String r8) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            r3.f$4 = r8
            int r1 = androidx.customview.C1074.m1071()
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
            java.lang.String r0 = "2L9aGm7HIhCNPJuMh5k82chKxHn1"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3639(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۠۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m7774(java.lang.Object r6, boolean r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            int r1 = androidx.emoji2.viewsintegration.C1078.m1376()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L28;
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
            r0 = r6
            kevin.fun.hook.XhsHook r0 = (kevin.fun.hook.XhsHook) r0
            r2 = r8
            java.lang.String r2 = (java.lang.String) r2
            r3 = r9
            android.content.Context r3 = (android.content.Context) r3
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            r5 = r11
            android.view.View r5 = (android.view.View) r5
            r1 = r7
            r0.m7753lambda$9$kevinfunhookXhsHook(r1, r2, r3, r4, r5)
        L27:
            return
        L28:
            r0 = 1740(0x6cc, float:2.438E-42)
        L2a:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L30;
                case 54: goto L27;
                default: goto L2f;
            }
        L2f:
            goto L2a
        L30:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2a
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r8) {
            r7 = this;
            r5 = 0
            r1 = 0
            java.lang.String r6 = "ۧۢ۟"
            r2 = r5
            r0 = r5
            r3 = r5
            r4 = r5
        L8:
            int r5 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r5) {
                case 56482: goto L17;
                case 1749570: goto L27;
                case 1751591: goto L2f;
                case 1751647: goto L3f;
                case 1752703: goto L1f;
                case 1754468: goto L37;
                default: goto Lf;
            }
        Lf:
            java.lang.String r2 = kevin.fun.hook.audio.C1115.m7992(r7)
            java.lang.String r5 = "ۥۧ"
            r6 = r5
            goto L8
        L17:
            android.content.Context r3 = androidx.startup.C1100.m2967(r7)
            java.lang.String r5 = "ۤۢۥ"
            r6 = r5
            goto L8
        L1f:
            boolean r1 = kevin.fun.hook.audio.C1116.m8049(r7)
            java.lang.String r5 = "ۡ۟ۦ"
            r6 = r5
            goto L8
        L27:
            r5 = r8
            m7774(r0, r1, r2, r3, r4, r5)
            java.lang.String r5 = "ۤۤ۟"
            r6 = r5
            goto L8
        L2f:
            java.lang.String r4 = androidx.activity.C1066.m457(r7)
            java.lang.String r5 = "ۢ۟۟"
            r6 = r5
            goto L8
        L37:
            kevin.fun.hook.XhsHook r0 = org.luckypray.dexkit.C1124.m10558(r7)
            java.lang.String r5 = "ۥۧۡ"
            r6 = r5
            goto L8
        L3f:
            return
    }
}
