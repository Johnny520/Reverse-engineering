package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda121 implements android.view.View.OnClickListener {
    public final android.app.Dialog f$0;
    public final java.lang.ref.WeakReference f$1;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda121(android.app.Dialog r3, java.lang.ref.WeakReference r4) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            int r1 = androidx.core.C1073.m1015()
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
            java.lang.String r0 = "OTGmg1ViOvmD32Unq4RPxnxXBj"
            java.lang.String r0 = androidx.appcompat.resources.C1068.m670(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L26:
            return
    }

    /* JADX INFO: renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static void m4530(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            int r1 = androidx.versionedparcelable.C1106.m3393()
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
            android.app.Dialog r2 = (android.app.Dialog) r2
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            android.view.View r4 = (android.view.View) r4
            kevin.fun.hook.DYHook.lambda$12(r2, r3, r4)
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
            java.lang.String r0 = "5XZL"
            java.lang.String r0 = androidx.annotation.experimental.C1067.m548(r0)
            java.lang.Float r0 = java.lang.Float.decode(r0)
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

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r5) {
            r4 = this;
            r1 = 0
            java.lang.String r3 = "ۣۡۥ"
            r0 = r1
            r2 = r1
        L5:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1750599: goto L1b;
                case 1750687: goto L23;
                case 1755372: goto L13;
                default: goto Lc;
            }
        Lc:
            m4530(r0, r2, r5)
            java.lang.String r1 = "ۣۤ۠"
            r3 = r1
            goto L5
        L13:
            java.lang.ref.WeakReference r1 = androidx.loader.C1094.m2461(r4)
            java.lang.String r3 = "ۥۧۡ"
            r2 = r1
            goto L5
        L1b:
            android.app.Dialog r0 = kevin.fun.hook.webdav.C1118.m8492(r4)
            java.lang.String r1 = "ۨ۠ۤ"
            r3 = r1
            goto L5
        L23:
            return
    }
}
