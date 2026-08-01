package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$9$$ExternalSyntheticLambda1 implements android.view.View.OnLongClickListener {
    public final kevin.fun.hook.XhsHook.C06799 f$0;
    public final int f$1;

    static {
            return
    }

    public /* synthetic */ XhsHook$9$$ExternalSyntheticLambda1(kevin.fun.hook.XhsHook.C06799 r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.vectordrawable.C1105.m3314()
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
            java.lang.String r0 = "ZhL6f"
            java.lang.String r0 = androidx.vectordrawable.C1103.m69(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۧۧۧۡ, reason: not valid java name and contains not printable characters */
    public static boolean m7878(java.lang.Object r2, int r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.XhsHook$9 r2 = (kevin.fun.hook.XhsHook.C06799) r2
            android.view.View r4 = (android.view.View) r4
            boolean r0 = r2.m7875lambda$1$kevinfunhookXhsHook$9(r3, r4)
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
    public final boolean onLongClick(android.view.View r6) {
            r5 = this;
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۤۦۢ"
            r2 = r3
            r4 = r3
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1748711: goto L14;
                case 1750692: goto L1c;
                case 1754532: goto L23;
                default: goto Ld;
            }
        Ld:
            kevin.fun.hook.XhsHook$9 r0 = androidx.appcompat.resources.C1068.m637(r5)
            java.lang.String r1 = "ۡۢۨ"
            goto L6
        L14:
            int r3 = androidx.appcompat.resources.C1068.m636(r5)
            java.lang.String r1 = "ۣۤۥ"
            r4 = r3
            goto L6
        L1c:
            boolean r2 = m7878(r0, r4, r6)
            java.lang.String r1 = "ۧۤۡ"
            goto L6
        L23:
            return r2
    }
}
