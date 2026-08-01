package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda99 implements java.lang.Runnable {
    public final kevin.fun.hook.DYHook f$0;
    public final android.widget.LinearLayout f$1;
    public final android.graphics.Bitmap f$2;
    public final android.content.Context f$3;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda99(kevin.fun.hook.DYHook r4, android.widget.LinearLayout r5, android.graphics.Bitmap r6, android.content.Context r7) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            int r1 = androidx.lifecycle.livedata.C1086.m1929()
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
            if (r1 < 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "y6B"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۟ۦۥۢ۠, reason: not valid java name and contains not printable characters */
    public static void m4725(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.content.Context r5 = (android.content.Context) r5
            r2.m4502lambda$96$kevinfunhookDYHook(r3, r4, r5)
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
            r4 = this;
            kevin.fun.hook.DYHook r0 = androidx.emoji2.C1080.m1543(r4)
            android.widget.LinearLayout r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3834(r4)
            android.graphics.Bitmap r2 = androidx.core.C1072.m962(r4)
            android.content.Context r3 = org.luckypray.dexkit.C1124.m10553(r4)
            m4725(r0, r1, r2, r3)
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L36;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r1 > 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            java.lang.String r0 = "e0uCw9f7DZpf1Pzumju"
            java.lang.String r0 = androidx.core.ktx.C1070.m793(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L36:
            return
    }
}
