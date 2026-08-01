package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DownloadPathDialog$$ExternalSyntheticLambda0 implements android.view.View.OnClickListener {
    public final kevin.fun.hook.DownloadPathConfig f$0;
    public final android.widget.TextView f$1;
    public final android.app.Activity f$2;

    static {
            return
    }

    public /* synthetic */ DownloadPathDialog$$ExternalSyntheticLambda0(kevin.fun.hook.DownloadPathConfig r3, android.widget.TextView r4, android.app.Activity r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = kevin.fun.hook.audio.C1115.m98()
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
            if (r1 < 0) goto L15
            r0 = 1709(0x6ad, float:2.395E-42)
            goto Lf
        L1d:
            java.lang.String r0 = "6v"
            java.lang.String r0 = androidx.vectordrawable.C1103.m69(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۧۢ۟ۤ, reason: not valid java name and contains not printable characters */
    public static void m6957(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            int r1 = androidx.loader.C1094.m2490()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L3f;
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
            kevin.fun.hook.DownloadPathConfig r2 = (kevin.fun.hook.DownloadPathConfig) r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.View r5 = (android.view.View) r5
            kevin.fun.hook.DownloadPathDialog.lambda$0(r2, r3, r4, r5)
        L1f:
            int r1 = androidx.lifecycle.viewmodel.C1093.m2412()
            r0 = 1740(0x6cc, float:2.438E-42)
        L25:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L2b;
                case 54: goto L30;
                case 471: goto L3e;
                case 500: goto L33;
                default: goto L2a;
            }
        L2a:
            goto L25
        L2b:
            if (r1 > 0) goto L30
            r0 = 1833(0x729, float:2.569E-42)
            goto L25
        L30:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L25
        L33:
            java.lang.String r0 = "U8guoWG9Jy"
            java.lang.String r0 = androidx.loader.C1094.m2472(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L3e:
            return
        L3f:
            r0 = 1864(0x748, float:2.612E-42)
        L41:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L47;
                case 47483: goto L1f;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            r1 = 0
            java.lang.String r4 = "۟ۤۡ"
            r0 = r1
            r2 = r1
            r3 = r1
        L6:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r4)
            switch(r1) {
                case 1746844: goto L16;
                case 1748796: goto L1e;
                case 1752455: goto L25;
                case 1752734: goto Le;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            android.widget.TextView r1 = androidx.lifecycle.process.C1090.m2185(r5)
            java.lang.String r4 = "ۥ۟ۡ"
            r2 = r1
            goto L6
        L16:
            kevin.fun.hook.DownloadPathConfig r1 = androidx.emoji2.C1080.m1556(r5)
            java.lang.String r4 = "ۥۨۡ"
            r3 = r1
            goto L6
        L1e:
            m6957(r3, r2, r0, r6)
            java.lang.String r1 = "ۨ۟۠"
            r4 = r1
            goto L6
        L25:
            android.app.Activity r0 = androidx.lifecycle.livedata.C1085.m1808(r5)
            java.lang.String r1 = "ۡۥ۠"
            r4 = r1
            goto L6
    }
}
