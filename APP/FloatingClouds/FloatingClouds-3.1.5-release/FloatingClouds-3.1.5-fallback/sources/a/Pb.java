package a;

/* JADX INFO: loaded from: classes.dex */
public final class Pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.app.NotificationManager f210a;

    public static class a {
        public static boolean a(android.app.NotificationManager r0) {
                boolean r0 = r0.areNotificationsEnabled()
                return r0
        }

        public static int b(android.app.NotificationManager r0) {
                int r0 = r0.getImportance()
                return r0
        }
    }

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return
    }

    public Pb(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2
            r1.f210a = r2
            return
    }
}
