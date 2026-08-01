package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda37 implements java.lang.Runnable {
    public final android.app.Activity f$0;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda37(android.app.Activity r3) {
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
            java.lang.String r0 = "g9ufuuZ22K"
            java.lang.String r0 = androidx.vectordrawable.animated.C1102.m3070(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۟ۢۤۡۦ, reason: not valid java name and contains not printable characters */
    public static void m7578(java.lang.Object r2) {
            int r1 = org.luckypray.dexkit.C1123.m10509()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L39;
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
            android.app.Activity r2 = (android.app.Activity) r2
            kevin.fun.hook.VoiceAssistantHook.lambda$1(r2)
        L19:
            int r1 = androidx.loader.C1099.m2876()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L38;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 < 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "ctIql7L"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L38:
            return
        L39:
            r0 = 1864(0x748, float:2.612E-42)
        L3b:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L41;
                case 47483: goto L19;
                default: goto L40;
            }
        L40:
            goto L3b
        L41:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3b
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            android.app.Activity r0 = androidx.lifecycle.process.C1089.m2121(r1)
            m7578(r0)
            return
    }
}
