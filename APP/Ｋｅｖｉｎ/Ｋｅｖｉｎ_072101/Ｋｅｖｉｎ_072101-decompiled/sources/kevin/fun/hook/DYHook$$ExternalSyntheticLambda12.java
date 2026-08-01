package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda12 implements java.lang.Runnable {
    public final java.lang.String f$0;
    public final android.widget.ImageView f$1;
    public final android.graphics.Bitmap f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda12(java.lang.String r3, android.widget.ImageView r4, android.graphics.Bitmap r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
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
            java.lang.String r0 = "jrEeBgspi0r1YRqNujAv"
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10497(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥۥۣۡ, reason: contains not printable characters */
    public static void m4528(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.activity.C1062.m182()
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
            java.lang.String r2 = (java.lang.String) r2
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            kevin.fun.hook.DYHook.lambda$75(r2, r3, r4)
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

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            java.lang.String r0 = kevin.fun.hook.audio.C1117.m8110(r3)
            android.widget.ImageView r1 = kevin.fun.hook.C1120.m8647(r3)
            android.graphics.Bitmap r2 = androidx.lifecycle.viewmodel.C1093.m2377(r3)
            m4528(r0, r1, r2)
            int r1 = kevin.fun.hook.audio.C1117.m8167()
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L32;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r1 > 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.String r0 = "xziOFuvC5N"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L32:
            return
    }
}
