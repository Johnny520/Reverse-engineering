package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda10 implements android.view.View.OnClickListener {
    public final android.app.Activity f$0;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda10(android.app.Activity r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.activity.C1063.m300()
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
            if (r1 > 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "yp8"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static void m7549(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3b;
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
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.View r3 = (android.view.View) r3
            kevin.fun.hook.VoiceAssistantHook.lambda$14(r2, r3)
        L1b:
            int r1 = org.luckypray.dexkit.C1125.m10627()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3a;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 < 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "k4DFgSRImdBMS92AUfNgE8NeK"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3a:
            return
        L3b:
            r0 = 1864(0x748, float:2.612E-42)
        L3d:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L43;
                case 47483: goto L1b;
                default: goto L42;
            }
        L42:
            goto L3d
        L43:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3d
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            android.app.Activity r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3676(r2)
            m7549(r0, r3)
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            java.lang.String r0 = "JuYgWtLb31SobdiPDJVj6jkNcfX"
            java.lang.String r0 = androidx.versionedparcelable.C1107.m3469(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }
}
