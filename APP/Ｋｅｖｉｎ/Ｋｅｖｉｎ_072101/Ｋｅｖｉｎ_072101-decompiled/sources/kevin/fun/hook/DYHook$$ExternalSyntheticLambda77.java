package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DYHook$$ExternalSyntheticLambda77 implements android.widget.CompoundButton.OnCheckedChangeListener {
    public final java.util.Map f$0;
    public final int f$1;
    public final android.widget.TextView f$2;
    public final android.widget.TextView f$3;
    public final java.util.List f$4;

    static {
            return
    }

    public /* synthetic */ DYHook$$ExternalSyntheticLambda77(java.util.Map r3, int r4, android.widget.TextView r5, android.widget.TextView r6, java.util.List r7) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            r2.f$4 = r7
            int r1 = kevin.fun.hook.webdav.C1118.m8486()
            r0 = 1616(0x650, float:2.264E-42)
        L13:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto L19;
                case 49: goto L1c;
                case 204: goto L21;
                case 239: goto L30;
                default: goto L18;
            }
        L18:
            goto L13
        L19:
            r0 = 1678(0x68e, float:2.351E-42)
            goto L13
        L1c:
            if (r1 < 0) goto L19
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L13
        L21:
            java.lang.String r0 = "mbdK0SDQIIOAcF8xztr81JE"
            java.lang.String r0 = androidx.viewpager.C1108.m3522(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L30:
            return
    }

    /* JADX INFO: renamed from: ۟ۡۨۤۤ, reason: not valid java name and contains not printable characters */
    public static void m4701(java.lang.Object r7, int r8, java.lang.Object r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, boolean r13) {
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
            r0 = 1616(0x650, float:2.264E-42)
        L6:
            r0 = r0 ^ 1633(0x661, float:2.288E-42)
            switch(r0) {
                case 14: goto Lc;
                case 49: goto Lf;
                case 204: goto L14;
                case 239: goto L29;
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
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            r2 = r9
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = r10
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = r11
            java.util.List r4 = (java.util.List) r4
            r5 = r12
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            r1 = r8
            r6 = r13
            kevin.fun.hook.DYHook.lambda$65(r0, r1, r2, r3, r4, r5, r6)
        L28:
            return
        L29:
            r0 = 1740(0x6cc, float:2.438E-42)
        L2b:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L31;
                case 54: goto L28;
                default: goto L30;
            }
        L30:
            goto L2b
        L31:
            r0 = 1771(0x6eb, float:2.482E-42)
            goto L2b
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
            r7 = this;
            r5 = 0
            r1 = 0
            java.lang.String r6 = "ۦۣ۟"
            r0 = r5
            r2 = r5
            r4 = r5
            r3 = r5
        L8:
            int r5 = kevin.fun.hook.audio.C1114.m7934(r6)
            switch(r5) {
                case 1746756: goto L30;
                case 1750562: goto L1f;
                case 1750721: goto L40;
                case 1753538: goto L17;
                case 1753540: goto L38;
                case 1753699: goto L27;
                default: goto Lf;
            }
        Lf:
            int r1 = androidx.versionedparcelable.C1107.m3425(r7)
            java.lang.String r5 = "ۣ۠۟"
            r6 = r5
            goto L8
        L17:
            java.util.Map r0 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3765(r7)
            java.lang.String r5 = "۠ۨۧ"
            r6 = r5
            goto L8
        L1f:
            android.widget.TextView r2 = dev.rikka.ndk.thirdparty.libcxx.C1111.m3721(r7)
            java.lang.String r5 = "۟ۡۦ"
            r6 = r5
            goto L8
        L27:
            r5 = r8
            r6 = r9
            m4701(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r5 = "ۣۥۣ"
            r6 = r5
            goto L8
        L30:
            android.widget.TextView r3 = org.luckypray.dexkit.C1124.m10530(r7)
            java.lang.String r5 = "ۦۣۡ"
            r6 = r5
            goto L8
        L38:
            java.util.List r4 = androidx.activity.C1064.m390(r7)
            java.lang.String r5 = "ۦۨۥ"
            r6 = r5
            goto L8
        L40:
            return
    }
}
