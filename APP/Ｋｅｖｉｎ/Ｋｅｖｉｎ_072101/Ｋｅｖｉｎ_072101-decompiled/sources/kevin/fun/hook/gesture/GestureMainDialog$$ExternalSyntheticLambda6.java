package kevin.fun.hook.gesture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GestureMainDialog$$ExternalSyntheticLambda6 implements kevin.fun.hook.gesture.GestureRegionDialog.ActionCallback {
    public final kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener f$0;
    public final android.content.Context f$1;

    static {
            return
    }

    public /* synthetic */ GestureMainDialog$$ExternalSyntheticLambda6(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            java.lang.String r0 = "D9Ds5Xgc6lGQiAuADXfWN5tUCajM"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۡۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m8338(java.lang.Object r3, java.lang.Object r4, int r5, int r6, boolean r7) {
            int r1 = androidx.activity.C1064.m377()
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
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r3 = (kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener) r3
            android.content.Context r4 = (android.content.Context) r4
            kevin.fun.hook.gesture.GestureMainDialog.lambda$7(r3, r4, r5, r6, r7)
        L1b:
            int r1 = androidx.versionedparcelable.C1107.m3467()
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
            if (r1 > 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "UPFTnTjs8V"
            java.lang.String r0 = androidx.loader.C1098.m2778(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
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

    @Override // kevin.fun.hook.gesture.GestureRegionDialog.ActionCallback
    public final void onActionSelected(int r5, int r6, boolean r7) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۢۧ۟"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1748648: goto L14;
                case 1754537: goto L23;
                case 1755523: goto L1c;
                default: goto Lc;
            }
        Lc:
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r1 = androidx.activity.C1066.m486(r4)
            java.lang.String r3 = "ۡ۠ۧ"
            r2 = r1
            goto L5
        L14:
            android.content.Context r0 = androidx.activity.C1063.m297(r4)
            java.lang.String r1 = "ۨۥ۠"
            r3 = r1
            goto L5
        L1c:
            m8338(r2, r0, r5, r6, r7)
            java.lang.String r1 = "ۧۤۦ"
            r3 = r1
            goto L5
        L23:
            return
    }
}
