package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XhsHook$$ExternalSyntheticLambda9 implements java.lang.Runnable {
    public final android.content.Context f$0;
    public final int f$1;

    static {
            return
    }

    public /* synthetic */ XhsHook$$ExternalSyntheticLambda9(android.content.Context r3, int r4) {
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
            java.lang.String r0 = "UhI8"
            java.lang.String r0 = androidx.lifecycle.livedata.C1084.m1770(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۟۟۠ۧۢ, reason: not valid java name and contains not printable characters */
    public static void m7794(java.lang.Object r2, int r3) {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3d;
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
            android.content.Context r2 = (android.content.Context) r2
            kevin.fun.hook.XhsHook.lambda$30(r2, r3)
        L19:
            int r1 = androidx.loader.C1096.m2651()
            r0 = 1740(0x6cc, float:2.438E-42)
        L1f:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L25;
                case 54: goto L2a;
                case 471: goto L3c;
                case 500: goto L2d;
                default: goto L24;
            }
        L24:
            goto L1f
        L25:
            if (r1 < 0) goto L2a
            r0 = 1833(0x729, float:2.569E-42)
            goto L1f
        L2a:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L1f
        L2d:
            java.lang.String r0 = "YS2nf9F1"
            java.lang.String r0 = androidx.documentfile.C1076.m1239(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3c:
            return
        L3d:
            r0 = 1864(0x748, float:2.612E-42)
        L3f:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L45;
                case 47483: goto L19;
                default: goto L44;
            }
        L44:
            goto L3f
        L45:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L3f
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            android.content.Context r0 = androidx.vectordrawable.C1104.m3231(r2)
            int r1 = androidx.lifecycle.process.C1087.m2005(r2)
            m7794(r0, r1)
            return
    }
}
