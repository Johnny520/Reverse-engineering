package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda40 implements java.lang.Runnable {
    public final kevin.fun.hook.XhsHook f$0;
    public final android.content.Context f$1;
    public final java.lang.String f$2;
    public final java.lang.String f$3;
    public final int f$4;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda40(kevin.fun.hook.XhsHook r4, android.content.Context r5, java.lang.String r6, java.lang.String r7, int r8) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            r3.f$4 = r8
            int r1 = androidx.activity.C1065.m427()
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
            if (r1 > 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            java.lang.String r0 = "ocNojnnj4ycaG"
            java.lang.String r0 = org.luckypray.dexkit.C1125.m10629(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۟ۧ۠ۤ۠, reason: not valid java name and contains not printable characters */
    public static void m7789(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            r2.m7735lambda$20$kevinfunhookXhsHook(r3, r4, r5, r6)
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
            r5 = this;
            kevin.fun.hook.XhsHook r0 = org.luckypray.dexkit.C1123.m10504(r5)
            android.content.Context r1 = androidx.lifecycle.viewmodel.C1093.m2373(r5)
            java.lang.String r2 = androidx.lifecycle.process.C1090.m2224(r5)
            java.lang.String r3 = androidx.vectordrawable.C1104.m3207(r5)
            int r4 = androidx.customview.C1074.m1081(r5)
            m7789(r0, r1, r2, r3, r4)
            int r1 = androidx.drawerlayout.C1077.m1360()
            r0 = 1616(0x650, float:2.264E-42)
        L1d:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L23;
                case 49: goto L26;
                case 204: goto L2b;
                case 239: goto L3a;
                default: goto L22;
            }
        L22:
            goto L1d
        L23:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L1d
        L26:
            if (r1 < 0) goto L23
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L1d
        L2b:
            java.lang.String r0 = "yJFRC"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
    }
}
