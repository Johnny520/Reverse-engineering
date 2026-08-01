package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda161 implements android.content.DialogInterface.OnClickListener {
    public final int[] f$0;
    public final kevin.fun.hook.DYHook.Consumer f$1;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda161(int[] r3, kevin.fun.hook.DYHook.Consumer r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.interpolator.C1083.m1725()
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
            java.lang.String r0 = "aL8jDYoEqVjU8OwVEEbTWleDUe"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۦۧۧۥ, reason: contains not printable characters */
    public static void m4574(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.lifecycle.livedata.C1084.m1794()
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
            int[] r2 = (int[]) r2
            kevin.fun.hook.DYHook$Consumer r3 = (kevin.fun.hook.DYHook.Consumer) r3
            android.content.DialogInterface r4 = (android.content.DialogInterface) r4
            kevin.fun.hook.DYHook.lambda$182(r2, r3, r4, r5)
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

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            int[] r0 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3678(r2)
            kevin.fun.hook.DYHook$Consumer r1 = androidx.startup.C1100.m2965(r2)
            m4574(r0, r1, r3, r4)
            int r1 = androidx.core.C1073.m1015()
            r0 = 1616(0x650, float:2.264E-42)
        L11:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L17;
                case 49: goto L1a;
                case 204: goto L1f;
                case 239: goto L2e;
                default: goto L16;
            }
        L16:
            goto L11
        L17:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L11
        L1a:
            if (r1 < 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "vZ"
            java.lang.String r0 = androidx.interpolator.C1082.m1668(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }
}
