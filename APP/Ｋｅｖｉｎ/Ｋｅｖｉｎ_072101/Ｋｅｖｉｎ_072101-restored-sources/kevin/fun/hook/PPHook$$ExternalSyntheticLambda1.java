package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PPHook$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final kevin.fun.hook.PPHook.VerifyCallback f$0;

    static {
            return
    }

    public /* synthetic */ PPHook$$ExternalSyntheticLambda1(kevin.fun.hook.PPHook.VerifyCallback r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.vectordrawable.C1103.m3151()
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
            if (r1 > 0) goto L11
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lb
        L19:
            java.lang.String r0 = "V6LcMCmKSjCQfSZ41S4xD6O"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            kevin.fun.hook.PPHook$VerifyCallback r0 = androidx.versionedparcelable.C1106.m3397(r1)
            dev.rikka.ndk.thirdparty.libcxx.C1112.m3792(r0)
            return
    }
}
