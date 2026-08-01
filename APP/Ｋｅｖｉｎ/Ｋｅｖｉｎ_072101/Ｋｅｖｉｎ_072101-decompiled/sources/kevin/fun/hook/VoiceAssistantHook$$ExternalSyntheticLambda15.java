package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda15 implements android.view.View.OnClickListener {
    public final android.widget.LinearLayout f$0;
    public final android.widget.LinearLayout f$1;
    public final android.app.Activity f$2;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda15(android.widget.LinearLayout r4, android.widget.LinearLayout r5, android.app.Activity r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = androidx.core.C1072.m980()
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
            java.lang.String r0 = "rj9JjAmgnZWbmwfEQuiXHfV"
            java.lang.String r0 = androidx.drawerlayout.C1077.m1328(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟۟ۨۦۣ, reason: not valid java name and contains not printable characters */
    public static void m7554(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.appcompat.resources.C1068.m612()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L43;
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
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.View r5 = (android.view.View) r5
            kevin.fun.hook.VoiceAssistantHook.lambda$6(r2, r3, r4, r5)
        L1f:
            int r1 = androidx.drawerlayout.C1077.m1360()
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L42;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r1 < 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.String r0 = "hT6ok3f30S9A"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L42:
            return
        L43:
            r0 = 1864(0x748, float:2.612E-42)
        L45:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4b;
                case 47483: goto L1f;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L45
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۤۧ۠"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1749760: goto L1d;
                case 1751741: goto L15;
                case 1752524: goto Le;
                case 1753702: goto L25;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            m7554(r0, r3, r2, r6)
            java.lang.String r1 = "ۥ۟ۢ"
            r4 = r1
            goto L6
        L15:
            android.widget.LinearLayout r0 = androidx.interpolator.C1081.m1637(r5)
            java.lang.String r1 = "ۦۨۨ"
            r4 = r1
            goto L6
        L1d:
            android.app.Activity r1 = org.luckypray.dexkit.C1123.m10482(r5)
            java.lang.String r4 = "ۥۡۨ"
            r2 = r1
            goto L6
        L25:
            android.widget.LinearLayout r1 = androidx.loader.C1099.m2871(r5)
            java.lang.String r4 = "ۢۥۣ"
            r3 = r1
            goto L6
    }
}
