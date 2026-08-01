package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$9$$ExternalSyntheticLambda2 implements android.view.View.OnTouchListener {
    public final kevin.fun.hook.XhsHook.C06799 f$0;
    public final int f$1;

    static {
            return
    }

    public /* synthetic */ XhsHook$9$$ExternalSyntheticLambda2(kevin.fun.hook.XhsHook.C06799 r3, int r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.activity.C1062.m182()
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
            java.lang.String r0 = "N1y3GCp2P"
            java.lang.String r0 = androidx.activity.C1066.m487(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۣ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static boolean m7879(java.lang.Object r2, int r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.interpolator.C1082.m1718()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
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
            android.view.MotionEvent r5 = (android.view.MotionEvent) r5
            boolean r0 = r2.m7876lambda$2$kevinfunhookXhsHook$9(r3, r4, r5)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            r3 = 0
            r0 = 0
            java.lang.String r1 = "ۢۡۤ"
            r2 = r3
            r4 = r3
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1749637: goto L1c;
                case 1754383: goto L23;
                case 1755558: goto L15;
                default: goto Ld;
            }
        Ld:
            int r3 = androidx.lifecycle.process.C1087.m1943(r5)
            java.lang.String r1 = "ۨۦۤ"
            r4 = r3
            goto L6
        L15:
            boolean r2 = m7879(r0, r4, r6, r7)
            java.lang.String r1 = "ۧ۟ۧ"
            goto L6
        L1c:
            kevin.fun.hook.XhsHook$9 r0 = androidx.versionedparcelable.C1107.m3450(r5)
            java.lang.String r1 = "ۣۨۤ"
            goto L6
        L23:
            return r2
    }
}
