package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda7 implements android.content.DialogInterface.OnDismissListener {
    public final kevin.fun.hook.XhsHook f$0;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda7(kevin.fun.hook.XhsHook r4) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            int r1 = androidx.activity.C1065.m427()
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
            java.lang.String r0 = "tXHCfHF"
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2067(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static void m7792(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.activity.C1062.m182()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.XhsHook r2 = (kevin.fun.hook.XhsHook) r2
            android.content.DialogInterface r3 = (android.content.DialogInterface) r3
            r2.m7738lambda$24$kevinfunhookXhsHook(r3)
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

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r2) {
            r1 = this;
            kevin.fun.hook.XhsHook r0 = kevin.fun.hook.webdav.C1118.m8499(r1)
            m7792(r0, r2)
            return
    }
}
