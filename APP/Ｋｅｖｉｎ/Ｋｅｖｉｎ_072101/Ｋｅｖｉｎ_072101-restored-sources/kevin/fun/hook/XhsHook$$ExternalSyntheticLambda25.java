package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda25 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.XhsHook f$0;
    public final android.content.Context f$1;
    public final java.lang.String f$2;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda25(kevin.fun.hook.XhsHook r3, android.content.Context r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            java.lang.String r0 = "I4jZS"
            java.lang.String r0 = androidx.loader.C1097.m2729(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۤۦۥۧ, reason: not valid java name and contains not printable characters */
    public static void m7772(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.core.ktx.C1071.m854()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.XhsHook r2 = (kevin.fun.hook.XhsHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = (java.lang.String) r4
            android.view.View r5 = (android.view.View) r5
            r2.m7751lambda$7$kevinfunhookXhsHook(r3, r4, r5)
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

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۡ۟ۥ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747804: goto L2c;
                case 1748615: goto L1d;
                case 1749855: goto L15;
                case 1751780: goto L25;
                default: goto Ld;
            }
        Ld:
            android.content.Context r1 = androidx.appcompat.C1069.m727(r5)
            java.lang.String r4 = "ۢۨۥ"
            r3 = r1
            goto L6
        L15:
            java.lang.String r0 = androidx.loader.C1097.m2698(r5)
            java.lang.String r1 = "ۤۨۨ"
            r4 = r1
            goto L6
        L1d:
            kevin.fun.hook.XhsHook r1 = androidx.versionedparcelable.C1107.m3459(r5)
            java.lang.String r4 = "ۣ۠ۢ"
            r2 = r1
            goto L6
        L25:
            m7772(r2, r3, r0, r6)
            java.lang.String r1 = "۠ۤ۠"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
