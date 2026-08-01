package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda9 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final java.lang.ref.WeakReference f$1;
    public final kevin.fun.hook.KSHook.AtlasDownloadHolder f$2;
    public final int f$3;
    public final java.util.concurrent.atomic.AtomicInteger f$4;
    public final long f$5;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda9(kevin.fun.hook.KSHook r3, java.lang.ref.WeakReference r4, kevin.fun.hook.KSHook.AtlasDownloadHolder r5, int r6, java.util.concurrent.atomic.AtomicInteger r7, long r8) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            r2.f$5 = r8
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
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
            if (r1 > 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.String r0 = "1hujnVMEEWjAxLfqbO"
            java.lang.String r0 = androidx.loader.C1094.m2472(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L32:
            return
    }

    /* JADX INFO: renamed from: ۟ۢ۠ۢ۟, reason: not valid java name and contains not printable characters */
    public static void m7187(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, int r12, java.lang.Object r13, long r14) {
            int r1 = androidx.lifecycle.process.C1091.m2283()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L26;
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
            r1 = r9
            kevin.fun.hook.KSHook r1 = (kevin.fun.hook.KSHook) r1
            r2 = r10
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            r3 = r11
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r3
            r5 = r13
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            r4 = r12
            r6 = r14
            r1.m7137lambda$34$kevinfunhookKSHook(r2, r3, r4, r5, r6)
        L25:
            return
        L26:
            r0 = 1740(0x6cc, float:2.438E-42)
        L28:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2e;
                case 54: goto L25;
                default: goto L2d;
            }
        L2d:
            goto L28
        L2e:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L28
    }

    @Override // java.lang.Runnable
    public final void run() {
            r8 = this;
            kevin.fun.hook.KSHook r1 = kevin.fun.hook.audio.C1115.m7990(r8)
            java.lang.ref.WeakReference r2 = androidx.emoji2.viewsintegration.C1078.m1381(r8)
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = androidx.loader.C1094.m2514(r8)
            int r4 = com.tencent.mmkv.C1109.m3608(r8)
            java.util.concurrent.atomic.AtomicInteger r5 = androidx.vectordrawable.C1103.m3158(r8)
            long r6 = androidx.vectordrawable.C1105.m3283(r8)
            m7187(r1, r2, r3, r4, r5, r6)
            int r1 = androidx.activity.C1066.m518()
            r0 = 1616(0x650, float:2.264E-42)
        L21:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L27;
                case 49: goto L2a;
                case 204: goto L2f;
                case 239: goto L3e;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L21
        L2a:
            if (r1 > 0) goto L27
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L21
        L2f:
            java.lang.String r0 = "9AIZ5tuvJaFwC7nFB5wurelMVMUU"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
    }
}
