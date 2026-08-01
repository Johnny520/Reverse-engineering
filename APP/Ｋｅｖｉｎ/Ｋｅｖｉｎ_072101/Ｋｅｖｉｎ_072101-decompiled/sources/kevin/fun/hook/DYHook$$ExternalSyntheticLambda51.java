package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda51 implements java.lang.Runnable {
    public final kevin.fun.hook.DYHook f$0;
    public final android.widget.LinearLayout f$1;
    public final android.content.Context f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda51(kevin.fun.hook.DYHook r3, android.widget.LinearLayout r4, android.content.Context r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.emoji2.C1080.m1539()
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
            java.lang.String r0 = "pUAk1RYLsFyxmeSCGJqM2QUeQ"
            java.lang.String r0 = kevin.fun.hook.audio.C1114.m7912(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۠ۦۡۦ, reason: not valid java name and contains not printable characters */
    public static void m4673(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.DYHook r2 = (kevin.fun.hook.DYHook) r2
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.content.Context r4 = (android.content.Context) r4
            r2.m4501lambda$95$kevinfunhookDYHook(r3, r4)
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

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            kevin.fun.hook.DYHook r0 = androidx.lifecycle.process.C1091.m2264(r3)
            android.widget.LinearLayout r1 = androidx.vectordrawable.C1104.m3194(r3)
            android.content.Context r2 = androidx.core.ktx.C1071.m908(r3)
            m4673(r0, r1, r2)
            int r1 = androidx.core.ktx.C1070.m822()
            r0 = 1616(0x650, float:2.264E-42)
        L15:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1b;
                case 49: goto L1e;
                case 204: goto L23;
                case 239: goto L32;
                default: goto L1a;
            }
        L1a:
            goto L15
        L1b:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L15
        L1e:
            if (r1 < 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.String r0 = "JCHqOpLFznIsHNUaJJPjN3pG6G"
            java.lang.String r0 = androidx.activity.C1063.m233(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L32:
            return
    }
}
