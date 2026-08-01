package kevin.fun.hook.webdav;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WebDAVDialog$$ExternalSyntheticLambda10 implements android.view.View.OnClickListener {
    public final android.content.Context f$0;
    public final android.widget.TextView f$1;
    public final android.app.Dialog f$2;

    static {
            return
    }

    public /* synthetic */ WebDAVDialog$$ExternalSyntheticLambda10(android.content.Context r4, android.widget.TextView r5, android.app.Dialog r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = androidx.appcompat.resources.C1068.m612()
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
            java.lang.String r0 = "c9rWdplvsIlwel2O9HSTU9QTNsyrw"
            java.lang.String r0 = androidx.emoji2.C1080.m1544(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۠ۥۦۧ, reason: not valid java name and contains not printable characters */
    public static void m8440(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.activity.C1064.m377()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.app.Dialog r4 = (android.app.Dialog) r4
            android.view.View r5 = (android.view.View) r5
            kevin.fun.hook.webdav.WebDAVDialog.lambda$1(r2, r3, r4, r5)
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
            java.lang.String r4 = "ۣ۠"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56413: goto L15;
                case 1748711: goto L1d;
                case 1750660: goto L25;
                case 1751591: goto L2c;
                default: goto Ld;
            }
        Ld:
            android.widget.TextView r1 = androidx.lifecycle.runtime.C1092.m2299(r5)
            java.lang.String r4 = "ۡۢۨ"
            r3 = r1
            goto L6
        L15:
            android.content.Context r0 = kevin.fun.hook.audio.C1116.m8083(r5)
            java.lang.String r1 = "ۢۤۤ"
            r4 = r1
            goto L6
        L1d:
            android.app.Dialog r1 = androidx.vectordrawable.animated.C1102.m3124(r5)
            java.lang.String r4 = "ۣۣۤ"
            r2 = r1
            goto L6
        L25:
            m8440(r0, r3, r2, r6)
            java.lang.String r1 = "ۤۢۥ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
