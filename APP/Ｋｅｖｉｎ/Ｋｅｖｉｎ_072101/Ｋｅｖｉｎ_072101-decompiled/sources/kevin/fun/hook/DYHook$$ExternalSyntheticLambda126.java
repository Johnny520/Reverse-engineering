package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda126 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.DYHook f$0;
    public final java.lang.ref.WeakReference f$1;
    public final android.content.Context f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda126(kevin.fun.hook.DYHook r3, java.lang.ref.WeakReference r4, android.content.Context r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            java.lang.String r0 = "2eGIs4SGoBGf"
            java.lang.String r0 = androidx.documentfile.C1076.m1239(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۤ۟۠۟, reason: not valid java name and contains not printable characters */
    public static void m4535(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.startup.C1100.m2972()
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
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            android.content.Context r4 = (android.content.Context) r4
            android.view.View r5 = (android.view.View) r5
            r2.m4456lambda$20$kevinfunhookDYHook(r3, r4, r5)
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

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "۠ۤۨ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1746878: goto Le;
                case 1747812: goto L25;
                case 1747932: goto L15;
                case 1749729: goto L1d;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            m4535(r2, r3, r0, r6)
            java.lang.String r1 = "۟ۧۡ"
            r4 = r1
            goto L6
        L15:
            java.lang.ref.WeakReference r1 = androidx.activity.C1062.m184(r5)
            java.lang.String r4 = "ۣۢۤ"
            r3 = r1
            goto L6
        L1d:
            android.content.Context r0 = androidx.loader.C1095.m2546(r5)
            java.lang.String r1 = "۟ۥۤ"
            r4 = r1
            goto L6
        L25:
            kevin.fun.hook.DYHook r1 = org.luckypray.dexkit.C1123.m10474(r5)
            java.lang.String r4 = "۠ۨۤ"
            r2 = r1
            goto L6
    }
}
