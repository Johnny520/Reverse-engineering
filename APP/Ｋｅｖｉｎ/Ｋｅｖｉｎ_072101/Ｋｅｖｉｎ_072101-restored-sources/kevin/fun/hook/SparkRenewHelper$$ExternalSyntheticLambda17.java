package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SparkRenewHelper$$ExternalSyntheticLambda17 implements android.widget.CompoundButton.OnCheckedChangeListener {
    public final kevin.fun.hook.SparkRenewHelper.SparkInfo f$0;
    public final android.widget.Switch f$1;

    static {
            return
    }

    public /* synthetic */ SparkRenewHelper$$ExternalSyntheticLambda17(kevin.fun.hook.SparkRenewHelper.SparkInfo r3, android.widget.Switch r4) {
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
            java.lang.String r0 = "wllCkIpJUkzhQ73s8r2GoPv6O"
            java.lang.String r0 = androidx.activity.C1064.m367(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۣۨۨۢ, reason: not valid java name and contains not printable characters */
    public static void m7423(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            int r1 = androidx.interpolator.C1083.m1725()
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
            if (r1 >= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.SparkRenewHelper$SparkInfo r2 = (kevin.fun.hook.SparkRenewHelper.SparkInfo) r2
            android.widget.Switch r3 = (android.widget.Switch) r3
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            kevin.fun.hook.SparkRenewHelper.lambda$13(r2, r3, r4, r5)
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

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۡ۟ۤ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 56383: goto L1c;
                case 1748614: goto L14;
                case 1749703: goto L23;
                default: goto Lc;
            }
        Lc:
            android.widget.Switch r1 = androidx.emoji2.C1080.m1514(r4)
            java.lang.String r3 = "ۢۡ"
            r2 = r1
            goto L5
        L14:
            kevin.fun.hook.SparkRenewHelper$SparkInfo r0 = kevin.fun.hook.C1120.m8616(r4)
            java.lang.String r1 = "ۧۥ۟"
            r3 = r1
            goto L5
        L1c:
            m7423(r0, r2, r5, r6)
            java.lang.String r1 = "ۣۢۨ"
            r3 = r1
            goto L5
        L23:
            return
    }
}
