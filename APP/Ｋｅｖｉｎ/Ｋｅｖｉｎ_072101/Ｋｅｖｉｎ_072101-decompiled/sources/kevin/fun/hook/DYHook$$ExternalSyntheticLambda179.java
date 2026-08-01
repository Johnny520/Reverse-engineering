package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda179 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.DYHook f$0;
    public final java.lang.String f$1;
    public final android.content.Context f$2;
    public final java.lang.String f$3;
    public final java.lang.Runnable[] f$4;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda179(kevin.fun.hook.DYHook r3, java.lang.String r4, android.content.Context r5, java.lang.String r6, java.lang.Runnable[] r7) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            int r1 = org.luckypray.dexkit.C1125.m10627()
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
            java.lang.String r0 = "rQv6lxDui7U"
            java.lang.String r0 = androidx.startup.C1101.m2985(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۢ۠ۥۧ, reason: not valid java name and contains not printable characters */
    public static void m4593(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2a;
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
            r0 = r6
            kevin.fun.hook.DYHook r0 = (kevin.fun.hook.DYHook) r0
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            r2 = r8
            android.content.Context r2 = (android.content.Context) r2
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3
            r4 = r10
            java.lang.Runnable[] r4 = (java.lang.Runnable[]) r4
            r5 = r11
            android.view.View r5 = (android.view.View) r5
            r0.m4428lambda$10$kevinfunhookDYHook(r1, r2, r3, r4, r5)
        L29:
            return
        L2a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L2c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L32;
                case 54: goto L29;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2c
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r8) {
            r7 = this;
            r5 = 0
            java.lang.String r6 = "۠۟ۦ"
            r3 = r5
            r0 = r5
            r4 = r5
            r2 = r5
            r1 = r5
        L8:
            int r5 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r5) {
                case 56322: goto L3f;
                case 1747655: goto L2f;
                case 1747716: goto L37;
                case 1748706: goto L17;
                case 1748769: goto L1f;
                case 1753510: goto L27;
                default: goto Lf;
            }
        Lf:
            java.lang.String r1 = kevin.fun.hook.audio.C1114.m7897(r7)
            java.lang.String r5 = "ۡۤۤ"
            r6 = r5
            goto L8
        L17:
            java.lang.Runnable[] r4 = androidx.core.ktx.C1070.m805(r7)
            java.lang.String r5 = "ۦۢۢ"
            r6 = r5
            goto L8
        L1f:
            android.content.Context r2 = androidx.core.ktx.C1070.m784(r7)
            java.lang.String r5 = "۠ۡۥ"
            r6 = r5
            goto L8
        L27:
            r5 = r8
            m4593(r0, r1, r2, r3, r4, r5)
            java.lang.String r5 = "۠ۢ"
            r6 = r5
            goto L8
        L2f:
            kevin.fun.hook.DYHook r0 = androidx.loader.C1095.m2568(r7)
            java.lang.String r5 = "ۨۡۡ"
            r6 = r5
            goto L8
        L37:
            java.lang.String r3 = androidx.activity.C1066.m509(r7)
            java.lang.String r5 = "ۣۡۢ"
            r6 = r5
            goto L8
        L3f:
            return
    }
}
