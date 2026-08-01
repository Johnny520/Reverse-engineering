package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda26 implements android.view.View.OnClickListener {
    public final android.app.Dialog f$0;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda26(android.app.Dialog r4) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
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
            java.lang.String r0 = "pcaNCeyDdmAA"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۟ۧۢ۟ۦ, reason: not valid java name and contains not printable characters */
    public static void m4645(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.loader.C1094.m2490()
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
            android.app.Dialog r2 = (android.app.Dialog) r2
            android.view.View r3 = (android.view.View) r3
            kevin.fun.hook.DYHook.lambda$112(r2, r3)
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

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            android.app.Dialog r0 = kevin.fun.hook.audio.C1115.m7977(r1)
            m4645(r0, r2)
            return
    }
}
