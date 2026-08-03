package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4751 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4752 {
        public C4752() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m18946(android.content.pm.PermissionInfo r0) {
                int r0 = r0.getProtection()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m18947(android.content.pm.PermissionInfo r0) {
                int r0 = r0.getProtectionFlags()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC4753 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۡ$ۥ۟۟, reason: contains not printable characters */
    @android.annotation.SuppressLint({"UniqueConstants"})
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC4754 {
    }

    public C4751() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m18944(@Yue.InterfaceC4410 android.content.pm.PermissionInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = Yue.C4751.C4752.m18946(r2)
            return r2
        Lb:
            int r2 = r2.protectionLevel
            r2 = r2 & 15
            return r2
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m18945(@Yue.InterfaceC4410 android.content.pm.PermissionInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = Yue.C4751.C4752.m18947(r2)
            return r2
        Lb:
            int r2 = r2.protectionLevel
            r2 = r2 & (-16)
            return r2
    }
}
