package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$194$1$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final java.lang.reflect.Method f$0;
    public final java.lang.Object f$1;
    public final java.lang.Object[] f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$194$1$$ExternalSyntheticLambda0(java.lang.reflect.Method r4, java.lang.Object r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.f$0 = r4
            r3.f$1 = r5
            r3.f$2 = r6
            int r1 = androidx.versionedparcelable.C1107.m3467()
            r0 = 1616(0x650, float:2.264E-42)
        Lf:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L15;
                case 49: goto L18;
                case 204: goto L1d;
                case 239: goto L2c;
                default: goto L14;
            }
        L14:
            goto Lf
        L15:
            r0 = 1678(0x68e, float:2.351E-42)
            goto Lf
        L18:
            if (r1 > 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "y69yXBIuunzxGAaIGAe6i"
            java.lang.String r0 = androidx.startup.C1100.m2909(r0)
            double r0 = java.lang.Double.parseDouble(r0)
            java.io.PrintStream r2 = java.lang.System.out
            r2.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۣۣۢۦ, reason: not valid java name and contains not printable characters */
    public static void m5387(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.documentfile.C1076.m1211()
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
            if (r1 <= 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            kevin.fun.hook.DYHook.AnonymousClass194.C05431.lambda$0(r2, r3, r4)
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

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            java.lang.reflect.Method r0 = androidx.lifecycle.process.C1090.m2196(r3)
            java.lang.Object r1 = androidx.loader.C1096.m59(r3)
            java.lang.Object[] r2 = androidx.startup.C1101.m2987(r3)
            m5387(r0, r1, r2)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3719()
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
            if (r1 < 0) goto L1b
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L15
        L23:
            java.lang.String r0 = "frap2WyBDZqDro"
            java.lang.String r0 = androidx.loader.C1095.m2606(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L32:
            return
    }
}
