package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1890 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f5816 = "android.hardware.display.category.PRESENTATION";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f5817;

    public C1890(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.f5817 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C1890 m8838(@Yue.InterfaceC4410 android.content.Context r1) {
            Yue.ۥۣ۠۟ۡ r0 = new Yue.ۥۣ۠۟ۡ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.view.Display m8839(int r3) {
            r2 = this;
            android.content.Context r0 = r2.f5817
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r3 = r0.getDisplay(r3)
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.view.Display[] m8840() {
            r2 = this;
            android.content.Context r0 = r2.f5817
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = r0.getDisplays()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.view.Display[] m8841(@Yue.InterfaceC4544 java.lang.String r2) {
            r1 = this;
            android.content.Context r2 = r1.f5817
            java.lang.String r0 = "display"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.view.Display[] r2 = r2.getDisplays()
            return r2
    }
}
