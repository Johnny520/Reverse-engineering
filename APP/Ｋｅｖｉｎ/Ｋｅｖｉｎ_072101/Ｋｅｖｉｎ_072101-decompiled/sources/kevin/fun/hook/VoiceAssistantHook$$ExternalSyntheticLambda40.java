package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda40 implements java.lang.Runnable {
    public final java.lang.String f$0;
    public final android.widget.TextView f$1;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda40(java.lang.String r3, android.widget.TextView r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            if (r1 > 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "ftM4ncjySiAuD5u0VDuMc9oB8cbnM"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۟ۡۢۧۦ, reason: not valid java name and contains not printable characters */
    public static void m7582(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.loader.C1099.m2876()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1c;
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
            java.lang.String r2 = (java.lang.String) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            kevin.fun.hook.VoiceAssistantHook.lambda$24(r2, r3)
        L1b:
            return
        L1c:
            r0 = 1740(0x6cc, float:2.438E-42)
        L1e:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L24;
                case 54: goto L1b;
                default: goto L23;
            }
        L23:
            goto L1e
        L24:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L1e
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2126(r2)
            android.widget.TextView r1 = androidx.lifecycle.runtime.C1092.m2301(r2)
            m7582(r0, r1)
            return
    }
}
