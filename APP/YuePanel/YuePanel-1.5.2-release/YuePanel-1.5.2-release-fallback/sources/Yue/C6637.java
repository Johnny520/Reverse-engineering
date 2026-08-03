package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6637 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C6638 {
        public C6638() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m25504(android.content.Context r1) {
                java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
                java.lang.Object r1 = r1.getSystemService(r0)
                android.os.UserManager r1 = (android.os.UserManager) r1
                boolean r1 = r1.isUserUnlocked()
                return r1
        }
    }

    public C6637() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m25503(@Yue.InterfaceC4410 android.content.Context r0) {
            boolean r0 = Yue.C6637.C6638.m25504(r0)
            return r0
    }
}
