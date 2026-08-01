package kevin.fun.hook;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DexKitFinder$$ExternalSyntheticLambda6 implements java.lang.Runnable {
    public final android.content.Context f$0;
    public final java.lang.StringBuilder f$1;
    public final int f$2;
    public final int f$3;

    static {
            return
    }

    public /* synthetic */ DexKitFinder$$ExternalSyntheticLambda6(android.content.Context r3, java.lang.StringBuilder r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            r2.f$0 = r3
            r2.f$1 = r4
            r2.f$2 = r5
            r2.f$3 = r6
            int r1 = androidx.lifecycle.runtime.C1092.m2295()
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
            java.lang.String r0 = "5VjvZIrigV"
            java.lang.String r0 = kevin.fun.hook.webdav.C1119.m8604(r0)
            float r0 = java.lang.Float.parseFloat(r0)
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
        L2e:
            return
    }

    /* JADX INFO: renamed from: ۨۧۢۥ, reason: not valid java name and contains not printable characters */
    public static void m6666(java.lang.Object r2, java.lang.Object r3, int r4, int r5) {
            int r1 = androidx.activity.C1064.m377()
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
            if (r1 > 0) goto Lc
            r0 = 1709(0x6ad, float:2.395E-42)
            goto L6
        L14:
            android.content.Context r2 = (android.content.Context) r2
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            kevin.fun.hook.DexKitFinder.lambda$8(r2, r3, r4, r5)
        L1b:
            int r1 = androidx.documentfile.C1076.m1211()
            r0 = 1740(0x6cc, float:2.438E-42)
        L21:
            r0 = r0 ^ 1757(0x6dd, float:2.462E-42)
            switch(r0) {
                case 17: goto L27;
                case 54: goto L2c;
                case 471: goto L3e;
                case 500: goto L2f;
                default: goto L26;
            }
        L26:
            goto L21
        L27:
            if (r1 > 0) goto L2c
            r0 = 1833(0x729, float:2.569E-42)
            goto L21
        L2c:
            r0 = 1802(0x70a, float:2.525E-42)
            goto L21
        L2f:
            java.lang.String r0 = "lYJLbIATIIFddJ3HuEDeXU"
            java.lang.String r0 = androidx.loader.C1098.m2778(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
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
                case 47483: goto L1b;
                default: goto L46;
            }
        L46:
            goto L41
        L47:
            r0 = 48674(0xbe22, float:6.8207E-41)
            goto L41
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            r1 = 0
            r5 = 0
            java.lang.String r3 = "ۨۤۢ"
            r0 = r1
            r2 = r1
            r4 = r5
            r6 = r5
        L8:
            int r1 = kevin.fun.hook.audio.C1114.m7934(r3)
            switch(r1) {
                case 1748896: goto L37;
                case 1749601: goto L20;
                case 1753604: goto L2f;
                case 1755494: goto L27;
                case 1755616: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.StringBuilder r1 = androidx.lifecycle.livedata.C1086.m1902(r7)
            java.lang.String r3 = "ۦۥۣ"
            r2 = r1
            goto L8
        L17:
            int r5 = androidx.lifecycle.livedata.C1084.m1779(r7)
            java.lang.String r1 = "ۢ۠۟"
            r3 = r1
            r6 = r5
            goto L8
        L20:
            m6666(r0, r2, r4, r6)
            java.lang.String r1 = "ۡۨۧ"
            r3 = r1
            goto L8
        L27:
            android.content.Context r0 = androidx.customview.C1074.m1085(r7)
            java.lang.String r1 = "ۧۥۡ"
            r3 = r1
            goto L8
        L2f:
            int r4 = org.luckypray.dexkit.C1125.m10623(r7)
            java.lang.String r1 = "ۨۨ۠"
            r3 = r1
            goto L8
        L37:
            return
    }
}
