package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda8 implements java.lang.Runnable {
    public final kevin.fun.hook.XhsHook f$0;
    public final android.content.Context f$1;
    public final int f$2;
    public final java.lang.String f$3;
    public final java.lang.String f$4;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda8(kevin.fun.hook.XhsHook r3, android.content.Context r4, int r5, java.lang.String r6, java.lang.String r7) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            int r1 = androidx.lifecycle.process.C1089.m2142()
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
            java.lang.String r0 = "JpZqMgpNWETxyDY2NnlY"
            java.lang.String r0 = androidx.lifecycle.process.C1087.m1957(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۧۧۨۨ, reason: not valid java name and contains not printable characters */
    public static void m7793(java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.interpolator.C1083.m1725()
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
            kevin.fun.hook.XhsHook r2 = (kevin.fun.hook.XhsHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            r2.m7740lambda$26$kevinfunhookXhsHook(r3, r4, r5, r6)
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

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r1 = 0
            r6 = 0
            java.lang.String r5 = "۟ۥۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 1746758: goto L2e;
                case 1746851: goto L26;
                case 1746876: goto L16;
                case 1751590: goto L36;
                case 1751715: goto L1e;
                case 1751772: goto L3e;
                default: goto Lf;
            }
        Lf:
            m7793(r2, r0, r6, r3, r4)
            java.lang.String r1 = "ۤۨ۠"
            r5 = r1
            goto L8
        L16:
            kevin.fun.hook.XhsHook r1 = androidx.lifecycle.process.C1090.m2186(r7)
            java.lang.String r5 = "ۤۦۥ"
            r2 = r1
            goto L8
        L1e:
            android.content.Context r0 = kevin.fun.hook.webdav.C1118.m8522(r7)
            java.lang.String r1 = "۟ۡۨ"
            r5 = r1
            goto L8
        L26:
            java.lang.String r1 = androidx.activity.C1063.m298(r7)
            java.lang.String r5 = "ۤۢۤ"
            r3 = r1
            goto L8
        L2e:
            int r6 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3730(r7)
            java.lang.String r1 = "۟ۤۨ"
            r5 = r1
            goto L8
        L36:
            java.lang.String r1 = androidx.versionedparcelable.C1106.m3389(r7)
            java.lang.String r5 = "ۤ۠ۤ"
            r4 = r1
            goto L8
        L3e:
            return
    }
}
