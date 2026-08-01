package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$9$$ExternalSyntheticLambda0 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.XhsHook.C06799 f$0;
    public final int f$1;

    static {
            return
    }

    public /* synthetic */ XhsHook$9$$ExternalSyntheticLambda0(kevin.fun.hook.XhsHook.C06799 r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.activity.C1063.m300()
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
            if (r1 > 0) goto L13
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Ld
        L1b:
            java.lang.String r0 = "tORaLrUjy76TzFSauSSB8H6"
            java.lang.String r0 = androidx.loader.C1098.m2778(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۟ۡۧۧۧ, reason: not valid java name and contains not printable characters */
    public static void m7877(java.lang.Object r2, int r3, java.lang.Object r4) {
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3f;
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
            kevin.fun.hook.XhsHook$9 r2 = (kevin.fun.hook.XhsHook.C06799) r2
            android.view.View r4 = (android.view.View) r4
            r2.m7874lambda$0$kevinfunhookXhsHook$9(r3, r4)
        L1b:
            int r1 = androidx.appcompat.resources.C1068.m612()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3e;
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
            java.lang.String r0 = "kIp"
            java.lang.String r0 = androidx.lifecycle.process.C1087.m1957(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L1b;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            java.lang.String r1 = "ۣ۟ۥ"
        L4:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748648: goto L12;
                case 1750537: goto L18;
                case 1755590: goto L1f;
                default: goto Lb;
            }
        Lb:
            int r2 = androidx.startup.C1100.m2971(r3)
            java.lang.String r1 = "ۡ۠ۧ"
            goto L4
        L12:
            m7877(r0, r2, r4)
            java.lang.String r1 = "ۨۧۥ"
            goto L4
        L18:
            kevin.fun.hook.XhsHook$9 r0 = androidx.lifecycle.process.C1088.m2051(r3)
            java.lang.String r1 = "ۦۤۦ"
            goto L4
        L1f:
            return
    }
}
