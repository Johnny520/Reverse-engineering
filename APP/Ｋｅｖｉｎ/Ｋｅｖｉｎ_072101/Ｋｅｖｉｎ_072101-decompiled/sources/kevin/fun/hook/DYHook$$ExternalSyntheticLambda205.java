package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda205 implements android.view.View.OnClickListener {
    public final android.widget.EditText f$0;
    public final android.content.Context f$1;
    public final java.lang.Runnable f$2;
    public final java.lang.ref.WeakReference f$3;
    public final android.app.Dialog f$4;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda205(android.widget.EditText r3, android.content.Context r4, java.lang.Runnable r5, java.lang.ref.WeakReference r6, android.app.Dialog r7) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            int r1 = androidx.activity.C1064.m377()
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
            java.lang.String r0 = "LbAnSPJ"
            java.lang.String r0 = org.luckypray.dexkit.C1123.m10497(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۟۟ۦۣۡ, reason: not valid java name and contains not printable characters */
    public static void m4623(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            int r1 = androidx.core.ktx.C1070.m822()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L2a;
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
            r0 = r6
            android.widget.EditText r0 = (android.widget.EditText) r0
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            r2 = r8
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r3 = r9
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r4 = r10
            android.app.Dialog r4 = (android.app.Dialog) r4
            r5 = r11
            android.view.View r5 = (android.view.View) r5
            kevin.fun.hook.DYHook.lambda$45(r0, r1, r2, r3, r4, r5)
        L29:
            return
        L2a:
            r0 = 1740(0x6cc, float:2.438E-42)
        L2c:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L32;
                case 54: goto L29;
                default: goto L31;
            }
        L31:
            goto L2c
        L32:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2c
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r8) {
            r7 = this;
            r5 = 0
            java.lang.String r6 = "ۤۡۥ"
            r2 = r5
            r0 = r5
            r4 = r5
            r1 = r5
            r3 = r5
        L8:
            int r5 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r5) {
                case 1747649: goto L27;
                case 1747840: goto L3f;
                case 1749576: goto L1f;
                case 1751560: goto L17;
                case 1751653: goto L37;
                case 1755556: goto L2f;
                default: goto Lf;
            }
        Lf:
            android.app.Dialog r4 = androidx.versionedparcelable.C1106.m3384(r7)
            java.lang.String r5 = "ۢ۟ۥ"
            r6 = r5
            goto L8
        L17:
            android.widget.EditText r0 = androidx.loader.C1094.m2480(r7)
            java.lang.String r5 = "ۤۤۥ"
            r6 = r5
            goto L8
        L1f:
            r5 = r8
            m4623(r0, r1, r2, r3, r4, r5)
            java.lang.String r5 = "۠ۥۥ"
            r6 = r5
            goto L8
        L27:
            java.lang.Runnable r2 = androidx.core.C1073.m1048(r7)
            java.lang.String r5 = "ۨۦۢ"
            r6 = r5
            goto L8
        L2f:
            java.lang.ref.WeakReference r3 = androidx.lifecycle.process.C1087.m1962(r7)
            java.lang.String r5 = "ۥۢۨ"
            r6 = r5
            goto L8
        L37:
            android.content.Context r1 = kevin.fun.hook.C1120.m8659(r7)
            java.lang.String r5 = "۠۟۠"
            r6 = r5
            goto L8
        L3f:
            return
    }
}
