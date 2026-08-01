package kevin.fun.hook.gesture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GestureMainDialog$$ExternalSyntheticLambda5 implements kevin.fun.hook.gesture.GestureRegionDialog.ActionCallback {
    public final kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener f$0;
    public final android.content.Context f$1;

    static {
            return
    }

    public /* synthetic */ GestureMainDialog$$ExternalSyntheticLambda5(kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener r3, android.content.Context r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.loader.C1098.m2793()
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L26;
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
            java.lang.String r0 = "X7ckDs5DD"
            java.lang.String r0 = androidx.lifecycle.process.C1090.m2222(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۢۦۧۢ, reason: not valid java name and contains not printable characters */
    public static void m8337(java.lang.Object r2, java.lang.Object r3, int r4, int r5, boolean r6) {
            int r1 = androidx.core.ktx.C1071.m854()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r2 = (kevin.fun.hook.gesture.GestureMainDialog.OnSettingChangedListener) r2
            android.content.Context r3 = (android.content.Context) r3
            kevin.fun.hook.gesture.GestureMainDialog.lambda$10(r2, r3, r4, r5, r6)
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

    @Override // kevin.fun.hook.gesture.GestureRegionDialog.ActionCallback
    public final void onActionSelected(int r5, int r6, boolean r7) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۥۥۣ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1753446: goto L1c;
                case 1754532: goto L23;
                case 1755619: goto L14;
                default: goto Lc;
            }
        Lc:
            kevin.fun.hook.gesture.GestureMainDialog$OnSettingChangedListener r1 = androidx.lifecycle.process.C1088.m2066(r4)
            java.lang.String r3 = "ۣۨۨ"
            r2 = r1
            goto L5
        L14:
            android.content.Context r0 = androidx.appcompat.resources.C1068.m633(r4)
            java.lang.String r1 = "ۦ۠۠"
            r3 = r1
            goto L5
        L1c:
            m8337(r2, r0, r5, r6, r7)
            java.lang.String r1 = "ۧۤۡ"
            r3 = r1
            goto L5
        L23:
            return
    }
}
