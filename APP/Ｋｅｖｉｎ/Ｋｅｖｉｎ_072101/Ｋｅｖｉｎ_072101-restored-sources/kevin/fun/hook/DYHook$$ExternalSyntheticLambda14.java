package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda14 implements android.widget.CompoundButton.OnCheckedChangeListener {
    public final kevin.fun.hook.DYHook.Consumer f$0;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda14(kevin.fun.hook.DYHook.Consumer r3) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            int r1 = androidx.loader.C1099.m2876()
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
            java.lang.String r0 = "0mFVdn7jll2"
            java.lang.String r0 = com.tencent.mmkv.C1109.m3585(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L28:
            return
    }

    /* JADX INFO: renamed from: ۨ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static void m4550(java.lang.Object r2, java.lang.Object r3, boolean r4) {
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1110.m3663()
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
            if (r1 < 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            kevin.fun.hook.DYHook$Consumer r2 = (kevin.fun.hook.DYHook.Consumer) r2
            android.widget.CompoundButton r3 = (android.widget.CompoundButton) r3
            kevin.fun.hook.DYHook.lambda$178(r2, r3, r4)
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

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r3, boolean r4) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "ۥۨۡ"
        L3:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r1)
            switch(r1) {
                case 1751494: goto L17;
                case 1755342: goto L11;
                default: goto La;
            }
        La:
            kevin.fun.hook.DYHook$Consumer r0 = androidx.loader.C1095.m2558(r2)
            java.lang.String r1 = "ۨ۟ۥ"
            goto L3
        L11:
            m4550(r0, r3, r4)
            java.lang.String r1 = "ۤ۟ۡ"
            goto L3
        L17:
            return
    }
}
