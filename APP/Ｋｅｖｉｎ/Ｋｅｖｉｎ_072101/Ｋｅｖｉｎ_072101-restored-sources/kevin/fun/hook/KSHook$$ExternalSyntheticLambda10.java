package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda10 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final android.content.Context f$1;
    public final java.lang.ref.WeakReference f$2;
    public final int f$3;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda10(kevin.fun.hook.KSHook r3, android.content.Context r4, java.lang.ref.WeakReference r5, int r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            if (r1 > 0) goto L17
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L11
        L1f:
            java.lang.String r0 = "hIQJ1n"
            java.lang.String r0 = kevin.fun.hook.audio.C1116.m8071(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۢۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static void m7149(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            int r1 = androidx.core.C1072.m980()
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            android.content.Context r3 = (android.content.Context) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            r2.m7124lambda$19$kevinfunhookKSHook(r3, r4, r5)
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
            r6 = this;
            r1 = 0
            r5 = 0
            java.lang.String r4 = "ۡ۟۟"
            r0 = r1
            r2 = r1
            r3 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1746720: goto Lf;
                case 1748609: goto L1f;
                case 1749796: goto L27;
                case 1750752: goto L17;
                case 1754628: goto L2f;
                default: goto Le;
            }
        Le:
            return
        Lf:
            android.content.Context r0 = androidx.emoji2.viewsintegration.C1078.m1424(r6)
            java.lang.String r1 = "ۣۦۣ"
            r4 = r1
            goto L7
        L17:
            java.lang.ref.WeakReference r1 = androidx.activity.C1063.m263(r6)
            java.lang.String r4 = "ۢۦۨ"
            r2 = r1
            goto L7
        L1f:
            kevin.fun.hook.KSHook r1 = androidx.activity.C1063.m295(r6)
            java.lang.String r4 = "۟۠ۡ"
            r3 = r1
            goto L7
        L27:
            int r5 = com.tencent.mmkv.C1109.m3565(r6)
            java.lang.String r1 = "ۧۧۤ"
            r4 = r1
            goto L7
        L2f:
            m7149(r3, r0, r2, r5)
            java.lang.String r1 = "ۣ۠۟"
            r4 = r1
            goto L7
    }
}
