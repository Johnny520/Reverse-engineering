package kevin.fun.hook.webdav;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WebDAVConfig$$ExternalSyntheticLambda17 implements java.util.function.Consumer {
    public final java.lang.Exception f$0;

    static {
            return
    }

    public /* synthetic */ WebDAVConfig$$ExternalSyntheticLambda17(java.lang.Exception r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            java.lang.String r0 = "GBFdCSzUMKyhWMVUMnll"
            java.lang.String r0 = androidx.versionedparcelable.C1106.m3412(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۣۣ۟۠ۨ, reason: not valid java name and contains not printable characters */
    public static void m8393(java.lang.Object r2, java.lang.Object r3) {
            int r1 = androidx.lifecycle.process.C1091.m2283()
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
            java.lang.Exception r2 = (java.lang.Exception) r2
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r3 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r3
            kevin.fun.hook.webdav.WebDAVConfig.lambda$29(r2, r3)
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
    public final void accept(java.lang.Object r4) {
            r3 = this;
            java.lang.Exception r0 = androidx.interpolator.C1082.m1647(r3)
            kevin.fun.hook.webdav.WebDAVConfig$BackupCallback r4 = (kevin.fun.hook.webdav.WebDAVConfig.BackupCallback) r4
            m8393(r0, r4)
            int r1 = androidx.drawerlayout.C1077.m1360()
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
            java.lang.String r0 = "Um50eqHAhsvRC0"
            java.lang.String r0 = com.tencent.mmkv.C1109.m3585(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }
}
