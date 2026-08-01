package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda38 implements android.content.DialogInterface.OnClickListener {
    public final android.widget.EditText f$0;
    public final java.lang.String f$1;
    public final android.content.Context f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda38(android.widget.EditText r4, java.lang.String r5, android.content.Context r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = androidx.lifecycle.process.C1088.m2011()
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
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "PyE4S88WAOkkXMKfPFH"
            java.lang.String r0 = androidx.interpolator.C1083.m1724(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۟۠۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static void m4658(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            int r1 = androidx.core.C1072.m980()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.widget.EditText r2 = (android.widget.EditText) r2
            java.lang.String r3 = (java.lang.String) r3
            android.content.Context r4 = (android.content.Context) r4
            android.content.DialogInterface r5 = (android.content.DialogInterface) r5
            kevin.fun.hook.DYHook.lambda$166(r2, r3, r4, r5, r6)
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

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r6, int r7) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۥۥۣ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747687: goto L24;
                case 1748642: goto L2c;
                case 1750786: goto L14;
                case 1752643: goto L1c;
                default: goto Ld;
            }
        Ld:
            m4658(r2, r0, r3, r6, r7)
            java.lang.String r1 = "ۡ۠ۡ"
            r4 = r1
            goto L6
        L14:
            android.content.Context r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3745(r5)
            java.lang.String r4 = "ۨۤۤ"
            r3 = r1
            goto L6
        L1c:
            android.widget.EditText r1 = androidx.loader.C1096.m2644(r5)
            java.lang.String r4 = "۠۠ۧ"
            r2 = r1
            goto L6
        L24:
            java.lang.String r0 = androidx.startup.C1100.m2957(r5)
            java.lang.String r1 = "ۣۧۦ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
