package kevin.fun.hook.gesture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GestureMainDialog$$ExternalSyntheticLambda9 implements java.util.function.Consumer {
    public final kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener f$0;

    static {
            return
    }

    public /* synthetic */ GestureMainDialog$$ExternalSyntheticLambda9(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            java.lang.String r0 = "lQjTZF0ZwOZ6zRjs"
            java.lang.String r0 = androidx.vectordrawable.C1104.m3213(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static void m8341(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.customview.C1074.m1071()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r2 = (kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            kevin.fun.hook.gesture.GestureMainDialog.lambda$2(r2, r3)
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

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            java.lang.String r3 = "ۤ۟ۢ"
            r1 = r0
            r2 = r0
        L5:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r0) {
                case 1751495: goto L13;
                case 1753607: goto L22;
                case 1755589: goto L1b;
                default: goto Lc;
            }
        Lc:
            m8341(r1, r2)
            java.lang.String r0 = "ۦۥۦ"
            r3 = r0
            goto L5
        L13:
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r0 = androidx.activity.C1062.m163(r4)
            java.lang.String r3 = "ۨۧۤ"
            r1 = r0
            goto L5
        L1b:
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r3 = "۟۠ۧ"
            r2 = r0
            goto L5
        L22:
            return
    }
}
