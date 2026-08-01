package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KSHook$$ExternalSyntheticLambda27 implements java.lang.Runnable {
    public final kevin.fun.hook.KSHook f$0;
    public final kevin.fun.hook.KSHook.AtlasDownloadHolder f$1;
    public final java.lang.ref.WeakReference f$2;
    public final java.lang.Exception f$3;

    static {
            return
    }

    public /* synthetic */ KSHook$$ExternalSyntheticLambda27(kevin.fun.hook.KSHook r3, kevin.fun.hook.KSHook.AtlasDownloadHolder r4, java.lang.ref.WeakReference r5, java.lang.Exception r6) {
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
            java.lang.String r0 = "aK5VN4"
            java.lang.String r0 = androidx.lifecycle.process.C1089.m2108(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۣ۠ۥ۠, reason: not valid java name and contains not printable characters */
    public static void m7167(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = kevin.fun.hook.webdav.C1119.m8565()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L20;
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
            kevin.fun.hook.KSHook r2 = (kevin.fun.hook.KSHook) r2
            kevin.fun.hook.KSHook$AtlasDownloadHolder r3 = (kevin.fun.hook.KSHook.AtlasDownloadHolder) r3
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Exception r5 = (java.lang.Exception) r5
            r2.m7140lambda$37$kevinfunhookKSHook(r3, r4, r5)
        L1f:
            return
        L20:
            r0 = 1740(0x6cc, float:2.438E-42)
        L22:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L28;
                case 54: goto L1f;
                default: goto L27;
            }
        L27:
            goto L22
        L28:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L22
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            kevin.fun.hook.KSHook r0 = androidx.appcompat.resources.C1068.m6(r4)
            kevin.fun.hook.KSHook$AtlasDownloadHolder r1 = androidx.activity.C1064.m330(r4)
            java.lang.ref.WeakReference r2 = kevin.fun.hook.audio.C1115.m7967(r4)
            java.lang.Exception r3 = androidx.vectordrawable.C1105.m3258(r4)
            m7167(r0, r1, r2, r3)
            int r1 = androidx.vectordrawable.animated.C1102.m3110()
            r0 = 1616(0x650, float:2.264E-42)
        L19:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L1f;
                case 49: goto L22;
                case 204: goto L27;
                case 239: goto L36;
                default: goto L1e;
            }
        L1e:
            goto L19
        L1f:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L19
        L22:
            if (r1 > 0) goto L1f
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L19
        L27:
            java.lang.String r0 = "JawPHy48H80FZM7VF7RtDRohWSi"
            java.lang.String r0 = androidx.lifecycle.process.C1088.m2067(r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L36:
            return
    }
}
