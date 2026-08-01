package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$87$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final kevin.fun.hook.DYHook.C063887 f$0;
    public final java.lang.Object f$1;
    public final android.content.Context f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$87$$ExternalSyntheticLambda1(kevin.fun.hook.DYHook.C063887 r3, java.lang.Object r4, android.content.Context r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L28;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 > 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "yWdm5kDJMv5OSE"
            java.lang.String r0 = androidx.core.C1073.m1027(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۟ۤۥۦ۟, reason: not valid java name and contains not printable characters */
    public static void m6448(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            kevin.fun.hook.DYHook$87 r2 = (kevin.fun.hook.DYHook.C063887) r2
            android.content.Context r4 = (android.content.Context) r4
            r2.m6446lambda$1$kevinfunhookDYHook$87(r3, r4)
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

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "ۤۡۤ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 56542: goto L24;
                case 1746909: goto L2c;
                case 1751559: goto L1c;
                case 1753600: goto L15;
                default: goto Ld;
            }
        Ld:
            android.content.Context r1 = kevin.fun.hook.audio.C1117.m8113(r5)
            java.lang.String r4 = "ۦۥ۟"
            r3 = r1
            goto L6
        L15:
            m6448(r2, r0, r3)
            java.lang.String r1 = "۟ۦۤ"
            r4 = r1
            goto L6
        L1c:
            kevin.fun.hook.DYHook$87 r1 = androidx.interpolator.C1082.m1720(r5)
            java.lang.String r4 = "ۧۥ"
            r2 = r1
            goto L6
        L24:
            java.lang.Object r0 = androidx.lifecycle.livedata.C1085.m1846(r5)
            java.lang.String r1 = "ۣ۟ۢ"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
