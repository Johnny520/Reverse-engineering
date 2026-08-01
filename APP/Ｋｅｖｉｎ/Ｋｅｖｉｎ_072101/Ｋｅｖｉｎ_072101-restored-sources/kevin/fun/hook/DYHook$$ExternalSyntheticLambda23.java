package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda23 implements java.util.Comparator {
    public final java.util.function.Function f$0;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda23(java.util.function.Function r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.viewpager.C1108.m3542()
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
            if (r1 < 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "tT9Hp7SdxMFBYfgX9g"
            java.lang.String r0 = androidx.activity.C1063.m233(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۧۢۢۡ, reason: not valid java name and contains not printable characters */
    public static int m4642(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.emoji2.viewsintegration.C1079.m1471()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L1f;
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
            java.util.function.Function r2 = (java.util.function.Function) r2
            kevin.fun.hook.DYHook$WatchItem r3 = (kevin.fun.hook.DYHook.WatchItem) r3
            kevin.fun.hook.DYHook$WatchItem r4 = (kevin.fun.hook.DYHook.WatchItem) r4
            int r0 = kevin.fun.hook.DYHook.lambda$51(r2, r3, r4)
        L1e:
            return r0
        L1f:
            r0 = 0
            r1 = 1740(0x6cc, float:2.438E-42)
        L22:
            r1 = r1 ^ 1757(0x6dd, float:2.462E-42)
            switch(r1) {
                case 17: goto L28;
                case 54: goto L1e;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r1 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            r0 = 0
            r5 = 0
            java.lang.String r4 = "۠۠"
            r1 = r0
            r2 = r0
            r3 = r0
        L7:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r0) {
                case 1747935: goto L1d;
                case 1748679: goto L25;
                case 1749576: goto L16;
                case 1754377: goto L2c;
                default: goto Le;
            }
        Le:
            java.util.function.Function r0 = androidx.loader.C1097.m2709(r6)
            java.lang.String r4 = "ۢ۟ۥ"
            r3 = r0
            goto L7
        L16:
            r0 = r7
            kevin.fun.hook.DYHook$WatchItem r0 = (kevin.fun.hook.DYHook.WatchItem) r0
            java.lang.String r4 = "ۡۡۧ"
            r1 = r0
            goto L7
        L1d:
            int r5 = m4642(r3, r1, r2)
            java.lang.String r0 = "ۧ۟ۡ"
            r4 = r0
            goto L7
        L25:
            r0 = r8
            kevin.fun.hook.DYHook$WatchItem r0 = (kevin.fun.hook.DYHook.WatchItem) r0
            java.lang.String r4 = "۠ۨۧ"
            r2 = r0
            goto L7
        L2c:
            return r5
    }
}
