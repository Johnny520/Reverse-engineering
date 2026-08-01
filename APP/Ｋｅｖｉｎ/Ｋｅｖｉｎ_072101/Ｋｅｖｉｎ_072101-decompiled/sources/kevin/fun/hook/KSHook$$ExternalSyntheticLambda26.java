package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda26 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final kevin.fun.hook.KSHook.AtlasDownloadHolder f$1;
    public final java.lang.ref.WeakReference f$2;
    public final java.util.concurrent.atomic.AtomicInteger f$3;
    public final int f$4;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda26(kevin.fun.hook.KSHook r4, kevin.fun.hook.KSHook.AtlasDownloadHolder r5, java.lang.ref.WeakReference r6, java.util.concurrent.atomic.AtomicInteger r7, int r8) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            r3.f$3 = r7
            r3.f$4 = r8
            int r1 = androidx.vectordrawable.C1104.m3230()
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L30;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r1 < 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            java.lang.String r0 = "ceqxfmQq"
            java.lang.String r0 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3837(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۠ۨۥۦ, reason: not valid java name and contains not printable characters */
    public static void m7166(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L43;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            r2.m7139lambda$36$kevinfunhookKSHook(r3, r4, r5, r6)
        L1f:
            int r1 = androidx.loader.C1097.m2731()
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L42;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r1 < 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.String r0 = "mgiSwDcFqdrIR"
            java.lang.String r0 = androidx.customview.C1075.m1195(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L42:
            return
        L43:
            r0 = 1864(0x748, float:2.612E-42)
        L45:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L4b;
                case 47483: goto L1f;
                default: goto L4a;
            }
        L4a:
            goto L45
        L4b:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L45
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r1 = 0
            r6 = 0
            java.lang.String r5 = "۟ۢۢ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 56446: goto L36;
                case 1746783: goto L17;
                case 1748647: goto L2e;
                case 1750626: goto L3e;
                case 1750721: goto L26;
                case 1754595: goto L1f;
                default: goto Lf;
            }
        Lf:
            int r6 = androidx.loader.C1099.m2846(r7)
            java.lang.String r1 = "ۧۦۢ"
            r5 = r1
            goto L8
        L17:
            kevin.fun.hook.KSHook r1 = androidx.appcompat.C1069.m758(r7)
            java.lang.String r5 = "ۤۢ"
            r2 = r1
            goto L8
        L1f:
            m7166(r2, r4, r3, r0, r6)
            java.lang.String r1 = "ۣۢۡ"
            r5 = r1
            goto L8
        L26:
            java.lang.ref.WeakReference r1 = androidx.activity.C1065.m451(r7)
            java.lang.String r5 = "ۡ۠ۦ"
            r3 = r1
            goto L8
        L2e:
            java.util.concurrent.atomic.AtomicInteger r0 = androidx.loader.C1098.m2776(r7)
            java.lang.String r1 = "ۣۤۧ"
            r5 = r1
            goto L8
        L36:
            kevin.fun.hook.KSHook$AtlasDownloadHolder r1 = androidx.viewpager.C1108.m3502(r7)
            java.lang.String r5 = "ۣۥۣ"
            r4 = r1
            goto L8
        L3e:
            return
    }
}
