package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2956 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9579;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9580;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9581;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9582;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9583;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f9584;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤ۠$ۥ, reason: contains not printable characters */
    public class C2957 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f9585;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f9586;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2956 f9587;

        public C2957(Yue.C2956 r1) {
                r0 = this;
                r0.f9587 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L17
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                java.lang.String r2 = Yue.C2956.C2957.f9586
                if (r2 != 0) goto L16
                r0 = -2267483290063835787(0xe08847f6199c6d75, double:-1.0417801948713824E157)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C2956.C2957.f9586 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C2956.C2957.f9585
                if (r2 != 0) goto L26
                r0 = -3209443734276815954(0xd375c3ed93d3c3ae, double:-1.1350217868740876E94)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C2956.C2957.f9585 = r2
            L26:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 != 0) goto Lc
                return
            Lc:
                java.lang.Object[] r4 = r4.args     // Catch: java.lang.Throwable -> L1b
                r4 = r4[r0]     // Catch: java.lang.Throwable -> L1b
                Yue.ۥۣۡۡۨ r4 = Yue.C4200.m16354(r4)     // Catch: java.lang.Throwable -> L1b
                Yue.C0693.m4382(r4)     // Catch: java.lang.Throwable -> L1b
                Yue.C0702.m4404(r4)     // Catch: java.lang.Throwable -> L1b
                goto L37
            L1b:
                r4 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 1
                java.lang.String r2 = yue_xin_awa(r1)
                r0.append(r2)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                Yue.C4350.m17147(r4, r1)
            L37:
                return
        }
    }

    static {
            r0 = 515(0x203, float:7.22E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C2956() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
