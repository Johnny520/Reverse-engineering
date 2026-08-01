package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda30 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.KSHook f$0;
    public final java.lang.ref.WeakReference f$1;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda30(kevin.fun.hook.KSHook r3, java.lang.ref.WeakReference r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.lifecycle.process.C1087.m1954()
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
            java.lang.String r0 = "GsWFdKZkbjz"
            java.lang.String r0 = org.luckypray.dexkit.C1124.m10540(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۟ۤۧۦ, reason: not valid java name and contains not printable characters */
    public static void m7171(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1088.m2011()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1e;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            android.view.View r4 = (android.view.View) r4
            r2.m7123lambda$17$kevinfunhookKSHook(r3, r4)
        L1d:
            return
        L1e:
            r0 = 1740(0x6cc, float:2.438E-42)
        L20:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L26;
                case 54: goto L1d;
                default: goto L25;
            }
        L25:
            goto L20
        L26:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L20
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۣ۠ۤ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1750567: goto L1b;
                case 1750599: goto L23;
                case 1755405: goto L14;
                default: goto Lc;
            }
        Lc:
            java.lang.ref.WeakReference r1 = androidx.startup.C1101.m3020(r4)
            java.lang.String r3 = "ۨۡۦ"
            r2 = r1
            goto L5
        L14:
            m7171(r0, r2, r5)
            java.lang.String r1 = "ۣۡۥ"
            r3 = r1
            goto L5
        L1b:
            kevin.fun.hook.KSHook r0 = androidx.annotation.experimental.C1067.m567(r4)
            java.lang.String r1 = "ۤۢۧ"
            r3 = r1
            goto L5
        L23:
            return
    }
}
