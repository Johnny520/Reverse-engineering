package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$192$1$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final java.lang.reflect.Method f$0;
    public final java.lang.Object f$1;
    public final java.lang.Object[] f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$192$1$$ExternalSyntheticLambda0(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object[] r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
            if (r1 > 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "fb"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۣۧۥ۠, reason: not valid java name and contains not printable characters */
    public static void m5359(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.loader.C1098.m2793()
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
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            kevin.fun.hook.DYHook.AnonymousClass192.C05411.lambda$0(r2, r3, r4)
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
            java.lang.String r4 = "ۢۢ۟"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1748799: goto L1d;
                case 1749663: goto L15;
                case 1753671: goto L25;
                case 1754531: goto L2c;
                default: goto Ld;
            }
        Ld:
            java.lang.Object[] r1 = androidx.loader.C1094.m2460(r5)
            java.lang.String r4 = "ۦۧۨ"
            r3 = r1
            goto L6
        L15:
            java.lang.reflect.Method r0 = androidx.interpolator.C1082.m1674(r5)
            java.lang.String r1 = "ۡۥۣ"
            r4 = r1
            goto L6
        L1d:
            java.lang.Object r1 = androidx.lifecycle.livedata.C1085.m1869(r5)
            java.lang.String r4 = "ۣۡ"
            r2 = r1
            goto L6
        L25:
            m5359(r0, r2, r3)
            java.lang.String r1 = "ۧۤ۠"
            r4 = r1
            goto L6
        L2c:
            return
    }
}
