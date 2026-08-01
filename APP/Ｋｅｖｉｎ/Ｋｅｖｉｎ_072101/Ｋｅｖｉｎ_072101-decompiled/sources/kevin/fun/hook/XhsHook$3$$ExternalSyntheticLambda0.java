package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$3$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final kevin.fun.hook.XhsHook.C06733 f$0;
    public final android.app.Activity f$1;
    public final java.lang.String f$2;

    static {
            return
    }

    public /* synthetic */ XhsHook$3$$ExternalSyntheticLambda0(kevin.fun.hook.XhsHook.C06733 r3, android.app.Activity r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L2c;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "OXieCzNwS3jlZk3r"
            java.lang.String r0 = androidx.activity.C1064.m367(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۡۢۧ۟, reason: not valid java name and contains not printable characters */
    public static void m7831(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1088.m2011()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            kevin.fun.hook.XhsHook$3 r2 = (kevin.fun.hook.XhsHook.C06733) r2
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r4 = (java.lang.String) r4
            r2.m7830lambda$0$kevinfunhookXhsHook$3(r3, r4)
        L1d:
            int r1 = androidx.customview.C1075.m1139()
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L40;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 > 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "sropcRL7MaXsTD3WlXrl3L0tSO"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "۠ۦۤ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1747841: goto L2c;
                case 1748738: goto L15;
                case 1749699: goto L1d;
                case 1754468: goto L25;
                default: goto Ld;
            }
        Ld:
            kevin.fun.hook.XhsHook$3 r0 = androidx.versionedparcelable.C1107.m3432(r5)
            java.lang.String r1 = "ۣۡۤ"
            r4 = r1
            goto L6
        L15:
            android.app.Activity r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3827(r5)
            java.lang.String r4 = "ۣۢۤ"
            r2 = r1
            goto L6
        L1d:
            java.lang.String r1 = androidx.customview.C1075.m1164(r5)
            java.lang.String r4 = "ۧۢ۟"
            r3 = r1
            goto L6
        L25:
            m7831(r0, r2, r3)
            java.lang.String r1 = "۠ۥۦ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
