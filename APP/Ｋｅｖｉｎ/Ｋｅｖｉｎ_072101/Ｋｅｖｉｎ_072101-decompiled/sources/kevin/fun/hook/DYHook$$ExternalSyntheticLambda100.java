package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda100 implements android.view.ViewTreeObserver.OnScrollChangedListener {
    public final android.widget.HorizontalScrollView f$0;
    public final android.view.View f$1;
    public final android.view.View f$2;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda100(android.widget.HorizontalScrollView r3, android.view.View r4, android.view.View r5) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            int r1 = kevin.fun.hook.audio.C1114.m7895()
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
            java.lang.String r0 = "fXwmcQmyByXhXPq8vg1Opx5wT"
            java.lang.String r0 = androidx.core.C1072.m925(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static void m4507(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.vectordrawable.C1105.m3314()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L41;
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
            android.widget.HorizontalScrollView r2 = (android.widget.HorizontalScrollView) r2
            android.view.View r3 = (android.view.View) r3
            android.view.View r4 = (android.view.View) r4
            kevin.fun.hook.DYHook.lambda$24(r2, r3, r4)
        L1d:
            int r1 = androidx.customview.C1074.m1071()
            r0 = 1740(0x6cc, float:2.438E-42)
        L23:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L29;
                case 54: goto L2e;
                case 471: goto L40;
                case 500: goto L31;
                default: goto L28;
            }
        L28:
            goto L23
        L29:
            if (r1 < 0) goto L2e
            r0 = 1833(0x729, float:2.569E-42)
            goto L23
        L2e:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L23
        L31:
            java.lang.String r0 = "cd6w8cN"
            java.lang.String r0 = androidx.lifecycle.livedata.C1085.m1844(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L40:
            return
        L41:
            r0 = 1864(0x748, float:2.612E-42)
        L43:
            r0 = r0 ^ 1881(0x759, float:2.636E-42)
            switch(r0) {
                case 17: goto L49;
                case 47483: goto L1d;
                default: goto L48;
            }
        L48:
            goto L43
        L49:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L43
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
            r3 = this;
            android.widget.HorizontalScrollView r0 = kevin.fun.hook.webdav.C1118.m8496(r3)
            android.view.View r1 = androidx.appcompat.C1069.m756(r3)
            android.view.View r2 = androidx.vectordrawable.C1104.m3243(r3)
            m4507(r0, r1, r2)
            int r1 = dev.rikka.ndk.thirdparty.libcxx.C1112.m3799()
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
            java.lang.String r0 = "Akdi89gaZgjgzU4C1ap8y3ocp"
            java.lang.String r0 = androidx.activity.C1062.m169(r0)
            java.lang.Integer r0 = java.lang.Integer.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L32:
            return
    }
}
