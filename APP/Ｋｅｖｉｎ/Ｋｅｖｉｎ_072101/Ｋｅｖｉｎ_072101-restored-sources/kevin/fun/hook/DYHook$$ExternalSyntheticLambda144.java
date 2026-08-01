package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda144 implements kevin.fun.hook.DYHook.Consumer {
    public final android.content.Context f$0;
    public final de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f$1;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda144(android.content.Context r3, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4) {
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
            java.lang.String r0 = "bRTbydkhoRy0zsM"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۣ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static void m4555(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = org.luckypray.dexkit.C1124.m10581()
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
            android.content.Context r2 = (android.content.Context) r2
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            kevin.fun.hook.DYHook.lambda$104(r2, r3, r4)
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

    @Override // kevin.fun.hook.DYHook.Consumer
    public final void accept(java.lang.Object r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "۟ۡۦ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1746756: goto L24;
                case 1746913: goto L15;
                case 1747718: goto L1c;
                case 1749763: goto Le;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            m4555(r3, r2, r0)
            java.lang.String r1 = "ۣۡۤ"
            r4 = r1
            goto L6
        L15:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r1 = "ۢۥۦ"
            r4 = r1
            goto L6
        L1c:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = com.tencent.mmkv.C1109.m3633(r5)
            java.lang.String r4 = "۟ۦۨ"
            r2 = r1
            goto L6
        L24:
            android.content.Context r1 = androidx.emoji2.viewsintegration.C1079.m1480(r5)
            java.lang.String r4 = "۠ۡۧ"
            r3 = r1
            goto L6
    }
}
