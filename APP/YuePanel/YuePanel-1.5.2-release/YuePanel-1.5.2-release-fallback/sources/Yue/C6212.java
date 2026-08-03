package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6212 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C6212.InterfaceC6215 f22211;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C6213 {
        public C6213() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m23206(android.service.quicksettings.TileService r0, android.content.Intent r1) {
                r0.startActivityAndCollapse(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C6214 {
        public C6214() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m23207(android.service.quicksettings.TileService r0, android.app.PendingIntent r1) {
                r0.startActivityAndCollapse(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۤ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC6215 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m23208(android.content.Intent r1);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        void m23209(android.app.PendingIntent r1);
    }

    public C6212() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23203() {
            r0 = 0
            Yue.C6212.f22211 = r0
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m23204(@Yue.InterfaceC4410 Yue.C6212.InterfaceC6215 r0) {
            Yue.C6212.f22211 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m23205(@Yue.InterfaceC4410 android.service.quicksettings.TileService r2, @Yue.InterfaceC4410 Yue.C4741 r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1a
            Yue.ۥۣۢۡۤ$ۥ۟۟ r0 = Yue.C6212.f22211
            if (r0 == 0) goto L12
            android.app.PendingIntent r2 = r3.m18909()
            r0.m23209(r2)
            goto L2d
        L12:
            android.app.PendingIntent r3 = r3.m18909()
            Yue.C6212.C6214.m23207(r2, r3)
            goto L2d
        L1a:
            Yue.ۥۣۢۡۤ$ۥ۟۟ r0 = Yue.C6212.f22211
            if (r0 == 0) goto L26
            android.content.Intent r2 = r3.m18907()
            r0.m23208(r2)
            goto L2d
        L26:
            android.content.Intent r3 = r3.m18907()
            Yue.C6212.C6213.m23206(r2, r3)
        L2d:
            return
    }
}
