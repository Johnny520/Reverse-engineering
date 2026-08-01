package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda168 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.DYHook f$0;
    public final android.content.Context f$1;
    public final android.widget.TextView f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda168(kevin.fun.hook.DYHook r3, android.content.Context r4, android.widget.TextView r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            java.lang.String r0 = "yZiCJy7bNjcxsF4"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟ۤۤۥ۠, reason: not valid java name and contains not printable characters */
    public static void m4581(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.loader.C1098.m2793()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L43;
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
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            android.content.Context r3 = (android.content.Context) r3
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.view.View r5 = (android.view.View) r5
            r2.m4441lambda$168$kevinfunhookDYHook(r3, r4, r5)
        L1f:
            int r1 = androidx.lifecycle.process.C1087.m1954()
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L42;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r1 < 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.String r0 = "kSONtURwZa"
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1844(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L42:
            return
        L43:
            r0 = 1864(0x748, float:2.612E-42)
        L45:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4b;
                case 47483: goto L1f;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L45
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۡۥۢ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56514: goto L1c;
                case 1747711: goto L2c;
                case 1748798: goto L24;
                case 1753547: goto L15;
                default: goto Ld;
            }
        Ld:
            android.widget.TextView r1 = androidx.activity.C1064.m316(r5)
            java.lang.String r4 = "ۦۣۨ"
            r3 = r1
            goto L6
        L15:
            m4581(r2, r0, r3, r6)
            java.lang.String r1 = "۠ۡ۠"
            r4 = r1
            goto L6
        L1c:
            android.content.Context r0 = androidx.core.ktx.C1071.m875(r5)
            java.lang.String r1 = "ۣۨ۟"
            r4 = r1
            goto L6
        L24:
            kevin.fun.hook.DYHook r1 = androidx.core.ktx.C1071.m864(r5)
            java.lang.String r4 = "ۦۨ"
            r2 = r1
            goto L6
        L2c:
            return
    }
}
