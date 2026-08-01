package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda42 implements java.lang.Runnable {
    public final android.widget.TextView f$0;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda42(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.core.ktx.C1070.m822()
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L28;
                default: goto L10;
            }
        L10:
            goto Lb
        L11:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lb
        L14:
            if (r1 < 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "N2H2gDeKq"
            java.lang.String r0 = androidx.vectordrawable.C1104.m3213(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۟ۦۣۢۧ, reason: not valid java name and contains not printable characters */
    public static void m7584(java.lang.Object r2) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1a;
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
            android.widget.TextView r2 = (android.widget.TextView) r2
            kevin.fun.hook.VoiceAssistantHook.lambda$17(r2)
        L19:
            return
        L1a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L22;
                case 54: goto L19;
                default: goto L21;
            }
        L21:
            goto L1c
        L22:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1c
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            android.widget.TextView r0 = org.luckypray.dexkit.C1125.m10637(r1)
            m7584(r0)
            return
    }
}
