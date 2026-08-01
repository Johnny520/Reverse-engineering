package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$8$$ExternalSyntheticLambda1 implements android.view.View.OnLongClickListener {
    public final kevin.fun.hook.DYHook.C06308 f$0;

    static {
            return
    }

    public /* synthetic */ DYHook$8$$ExternalSyntheticLambda1(kevin.fun.hook.DYHook.C06308 r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            java.lang.String r0 = "RNpRsOpCsh9AZD3ua3rTzdnu5CLi"
            java.lang.String r0 = androidx.customview.C1074.m1077(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣ۟ۤۡۦ, reason: not valid java name and contains not printable characters */
    public static boolean m6361(java.lang.Object r2, java.lang.Object r3) {
            int r1 = kevin.fun.hook.audio.C1115.m98()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1d;
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
            kevin.fun.hook.DYHook$8 r2 = (kevin.fun.hook.DYHook.C06308) r2
            android.view.View r3 = (android.view.View) r3
            boolean r0 = r2.m6359lambda$1$kevinfunhookDYHook$8(r3)
        L1c:
            return r0
        L1d:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L20:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L26;
                case 54: goto L1c;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View r2) {
            r1 = this;
            kevin.fun.hook.DYHook$8 r0 = androidx.activity.C1064.m373(r1)
            boolean r0 = m6361(r0, r2)
            return r0
    }
}
