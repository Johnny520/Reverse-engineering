package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VoiceAssistantHook$$ExternalSyntheticLambda30 implements android.widget.AdapterView.OnItemClickListener {
    public final kevin.fun.hook.VoiceAssistantHook.AudioAdapter f$0;

    static {
            return
    }

    public /* synthetic */ VoiceAssistantHook$$ExternalSyntheticLambda30(kevin.fun.hook.VoiceAssistantHook.AudioAdapter r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.interpolator.C1083.m1725()
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
            java.lang.String r0 = "TjTKVKn"
            java.lang.String r0 = androidx.activity.C1065.m453(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣۤۢۢ, reason: not valid java name and contains not printable characters */
    public static void m7571(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, int r9, long r10) {
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L23;
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
            r0 = r6
            kevin.fun.hook.VoiceAssistantHook$AudioAdapter r0 = (kevin.fun.hook.VoiceAssistantHook.AudioAdapter) r0
            r1 = r7
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1
            r2 = r8
            android.view.View r2 = (android.view.View) r2
            r3 = r9
            r4 = r10
            kevin.fun.hook.VoiceAssistantHook.lambda$36(r0, r1, r2, r3, r4)
        L22:
            return
        L23:
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L22;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L25
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView r7, android.view.View r8, int r9, long r10) {
            r6 = this;
            r0 = 0
            java.lang.String r1 = "ۡۢۨ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748711: goto L14;
                case 1753669: goto L1b;
                default: goto La;
            }
        La:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            m7571(r0, r1, r2, r3, r4)
            java.lang.String r1 = "ۦۧۦ"
            goto L3
        L14:
            kevin.fun.hook.VoiceAssistantHook$AudioAdapter r0 = androidx.emoji2.C1080.m1560(r6)
            java.lang.String r1 = "ۧۧۦ"
            goto L3
        L1b:
            return
    }
}
