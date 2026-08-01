package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda160 implements kevin.fun.hook.DYHook.Consumer {
    public final int[] f$0;
    public final android.widget.TextView f$1;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda160(int[] r3, android.widget.TextView r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
            r0 = 1616(0x650, float:2.264E-42)
        Ld:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L13;
                case 49: goto L16;
                case 204: goto L1b;
                case 239: goto L26;
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
            java.lang.String r0 = "IofKpfDtQ54hdrRre"
            java.lang.String r0 = com.tencent.mmkv.C1109.m3585(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۟۠ۢۤۧ, reason: not valid java name and contains not printable characters */
    public static void m4573(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.lifecycle.process.C1090.m2172()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            int[] r2 = (int[]) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            kevin.fun.hook.DYHook.lambda$181(r2, r3, r4)
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

    @Override // kevin.fun.hook.DYHook.Consumer
    public final void accept(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            java.lang.String r4 = "۟۟۠"
            r1 = r0
            r2 = r0
            r3 = r0
        L6:
            int r0 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r0) {
                case 1746688: goto L16;
                case 1746694: goto L25;
                case 1747747: goto Le;
                case 1755345: goto L1e;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            android.widget.TextView r0 = androidx.activity.C1063.m264(r5)
            java.lang.String r4 = "ۨ۟ۨ"
            r2 = r0
            goto L6
        L16:
            int[] r0 = androidx.core.ktx.C1070.m823(r5)
            java.lang.String r4 = "۠ۢۥ"
            r1 = r0
            goto L6
        L1e:
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r4 = "۟۟ۦ"
            r3 = r0
            goto L6
        L25:
            m4573(r1, r2, r3)
            java.lang.String r0 = "ۦۤۦ"
            r4 = r0
            goto L6
    }
}
