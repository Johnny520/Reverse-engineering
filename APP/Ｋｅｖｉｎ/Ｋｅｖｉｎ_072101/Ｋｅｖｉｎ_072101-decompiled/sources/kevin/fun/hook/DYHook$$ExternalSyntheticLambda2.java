package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda2 implements android.view.View.OnClickListener {
    public final int[] f$0;
    public final android.widget.TextView f$1;
    public final java.util.function.Consumer f$2;
    public final java.lang.Runnable f$3;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda2(int[] r3, android.widget.TextView r4, java.util.function.Consumer r5, java.lang.Runnable r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.loader.C1094.m2490()
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
            java.lang.String r0 = "H2liaC"
            java.lang.String r0 = androidx.emoji2.C1080.m1544(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۦۤۦۥ, reason: contains not printable characters */
    public static void m4616(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            int r1 = androidx.loader.C1095.m2562()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L22;
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
            java.util.function.Consumer r4 = (java.util.function.Consumer) r4
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            android.view.View r6 = (android.view.View) r6
            kevin.fun.hook.DYHook.lambda$53(r2, r3, r4, r5, r6)
        L21:
            return
        L22:
            r0 = 1740(0x6cc, float:2.438E-42)
        L24:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2a;
                case 54: goto L21;
                default: goto L29;
            }
        L29:
            goto L24
        L2a:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L24
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r7) {
            r6 = this;
            r1 = 0
            java.lang.String r5 = "ۡۢۦ"
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r1
        L7:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r5)
            switch(r1) {
                case 1748709: goto L2d;
                case 1752733: goto L35;
                case 1753418: goto L16;
                case 1753476: goto L26;
                case 1753607: goto L1e;
                default: goto Le;
            }
        Le:
            android.widget.TextView r1 = androidx.lifecycle.livedata.C1085.m1877(r6)
            java.lang.String r5 = "ۦۣ۟"
            r3 = r1
            goto L7
        L16:
            java.util.function.Consumer r1 = androidx.emoji2.C1080.m1532(r6)
            java.lang.String r5 = "ۦۥۦ"
            r2 = r1
            goto L7
        L1e:
            java.lang.Runnable r0 = androidx.lifecycle.livedata.C1085.m1807(r6)
            java.lang.String r1 = "ۦۡ۟"
            r5 = r1
            goto L7
        L26:
            m4616(r4, r3, r2, r0, r7)
            java.lang.String r1 = "ۥۨ۠"
            r5 = r1
            goto L7
        L2d:
            int[] r1 = androidx.core.C1073.m984(r6)
            java.lang.String r5 = "ۡۧ۠"
            r4 = r1
            goto L7
        L35:
            return
    }
}
