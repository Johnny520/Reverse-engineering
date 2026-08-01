package kevin.fun.hook.gesture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GestureMainDialog$$ExternalSyntheticLambda4 implements android.view.View.OnClickListener {
    public final android.app.Dialog f$0;
    public final android.content.Context f$1;
    public final int f$2;
    public final kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener f$3;

    static {
            return
    }

    public /* synthetic */ GestureMainDialog$$ExternalSyntheticLambda4(android.app.Dialog r4, android.content.Context r5, int r6, kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r7) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            int r1 = androidx.interpolator.C1081.m1643()
            r0 = 1616(0x650, float:2.264E-42)
        L11:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L17;
                case 49: goto L1a;
                case 204: goto L1f;
                case 239: goto L2e;
                default: goto L16;
            }
        L16:
            goto L11
        L17:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L11
        L1a:
            if (r1 > 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "8LgLsPVIpfpDkJ"
            java.lang.String r0 = androidx.loader.C1098.m2778(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۣۣۧ۟, reason: not valid java name and contains not printable characters */
    public static void m8336(java.lang.Object r2, java.lang.Object r3, int r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            android.app.Dialog r2 = (android.app.Dialog) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r5 = (kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener) r5
            android.view.View r6 = (android.view.View) r6
            kevin.fun.hook.gesture.GestureMainDialog.lambda$9(r2, r3, r4, r5, r6)
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
    public final void onClick(android.view.View r7) {
            r6 = this;
            r1 = 0
            r5 = 0
            java.lang.String r4 = "۠ۥۡ"
            r0 = r1
            r2 = r1
            r3 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747681: goto L35;
                case 1747836: goto L16;
                case 1751683: goto L1e;
                case 1753601: goto L25;
                case 1754597: goto L2d;
                default: goto Le;
            }
        Le:
            android.content.Context r1 = androidx.documentfile.C1076.m1238(r6)
            java.lang.String r4 = "ۧۦۤ"
            r3 = r1
            goto L7
        L16:
            android.app.Dialog r1 = androidx.activity.C1065.m426(r6)
            java.lang.String r4 = "۠ۦۤ"
            r2 = r1
            goto L7
        L1e:
            m8336(r2, r3, r5, r0, r7)
            java.lang.String r1 = "۠۠ۡ"
            r4 = r1
            goto L7
        L25:
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r0 = androidx.core.ktx.C1071.m889(r6)
            java.lang.String r1 = "ۤۥۤ"
            r4 = r1
            goto L7
        L2d:
            int r5 = androidx.appcompat.C1069.m733(r6)
            java.lang.String r1 = "ۦۥ۠"
            r4 = r1
            goto L7
        L35:
            return
    }
}
