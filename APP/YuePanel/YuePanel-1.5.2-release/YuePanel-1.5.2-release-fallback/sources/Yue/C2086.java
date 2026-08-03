package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
@Yue.InterfaceC3421(name = "EdgeToEdge")
public final class C2086 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f6618 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f6619 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static Yue.InterfaceC2094 f6620;

    static {
            r0 = 230(0xe6, float:3.22E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            Yue.C2086.f6618 = r0
            r0 = 128(0x80, float:1.8E-43)
            r1 = 27
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            Yue.C2086.f6619 = r0
            return
    }

    @Yue.InterfaceC3422
    @Yue.InterfaceC3421(name = "enable")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m9747(@Yue.InterfaceC4418 androidx.activity.ComponentActivity r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            r1 = 3
            m9750(r2, r0, r0, r1, r0)
            return
    }

    @Yue.InterfaceC3422
    @Yue.InterfaceC3421(name = "enable")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m9748(@Yue.InterfaceC4418 androidx.activity.ComponentActivity r2, @Yue.InterfaceC4418 Yue.C6081 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "statusBarStyle"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 2
            m9750(r2, r3, r0, r1, r0)
            return
    }

    @Yue.InterfaceC3422
    @Yue.InterfaceC3421(name = "enable")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m9749(@Yue.InterfaceC4418 androidx.activity.ComponentActivity r8, @Yue.InterfaceC4418 Yue.C6081 r9, @Yue.InterfaceC4418 Yue.C6081 r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "statusBarStyle"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "navigationBarStyle"
            Yue.C3329.m13906(r10, r0)
            android.view.Window r0 = r8.getWindow()
            android.view.View r5 = r0.getDecorView()
            java.lang.String r0 = "window.decorView"
            Yue.C3329.m13905(r5, r0)
            Yue.ۥۣ۠ۡ۟ r0 = r9.m22830()
            android.content.res.Resources r1 = r5.getResources()
            java.lang.String r2 = "view.resources"
            Yue.C3329.m13905(r1, r2)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            Yue.ۥۣ۠ۡ۟ r0 = r10.m22830()
            android.content.res.Resources r1 = r5.getResources()
            Yue.C3329.m13905(r1, r2)
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            Yue.ۥ۠۠ۤۧ r0 = Yue.C2086.f6620
            if (r0 != 0) goto L57
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L59
            Yue.ۥ۠۠ۤۥ r0 = new Yue.ۥ۠۠ۤۥ
            r0.<init>()
        L57:
            r1 = r0
            goto L5f
        L59:
            Yue.ۥ۠۠ۤۢ r0 = new Yue.ۥ۠۠ۤۢ
            r0.<init>()
            goto L57
        L5f:
            android.view.Window r4 = r8.getWindow()
            java.lang.String r8 = "window"
            Yue.C3329.m13905(r4, r8)
            r2 = r9
            r3 = r10
            r1.mo9755(r2, r3, r4, r5, r6, r7)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m9750(androidx.activity.ComponentActivity r6, Yue.C6081 r7, Yue.C6081 r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto Lf
            Yue.ۥۢ۠ۦۨ$ۥ r0 = Yue.C6081.f21995
            r4 = 4
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            Yue.ۥۢ۠ۦۨ r7 = Yue.C6081.C6082.m22834(r0, r1, r2, r3, r4, r5)
        Lf:
            r9 = r9 & 2
            if (r9 == 0) goto L20
            Yue.ۥۢ۠ۦۨ$ۥ r0 = Yue.C6081.f21995
            int r1 = Yue.C2086.f6618
            int r2 = Yue.C2086.f6619
            r4 = 4
            r5 = 0
            r3 = 0
            Yue.ۥۢ۠ۦۨ r8 = Yue.C6081.C6082.m22834(r0, r1, r2, r3, r4, r5)
        L20:
            m9749(r6, r7, r8)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m9751() {
            int r0 = Yue.C2086.f6619
            return r0
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m9752() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m9753() {
            int r0 = Yue.C2086.f6618
            return r0
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m9754() {
            return
    }
}
