package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda13 implements java.lang.Runnable {
    public final android.widget.TextView f$0;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda13(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.vectordrawable.C1103.m3151()
            r0 = 1616(0x650, float:2.264E-42)
        Lb:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L11;
                case 49: goto L14;
                case 204: goto L19;
                case 239: goto L24;
                default: goto L10;
            }
        L10:
            goto Lb
        L11:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lb
        L14:
            if (r1 > 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "oncAv50"
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2222(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L24:
            return
    }

    /* JADX INFO: renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static void m7552(java.lang.Object r2) {
            int r1 = androidx.activity.C1066.m518()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.TextView r2 = (android.widget.TextView) r2
            kevin.fun.hook.VoiceAssistantHook.lambda$25(r2)
        L19:
            int r1 = androidx.core.C1072.m980()
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
            if (r1 > 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "8V3rhdMYXs3ZZoGLj2"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
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
            r3 = this;
            android.widget.TextView r0 = org.luckypray.dexkit.C1123.m10521(r3)
            m7552(r0)
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L2a;
                default: goto L12;
            }
        L12:
            goto Ld
        L13:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Ld
        L16:
            if (r1 < 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "70KwWcWpeaRUhpw"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2a:
            return
    }
}
