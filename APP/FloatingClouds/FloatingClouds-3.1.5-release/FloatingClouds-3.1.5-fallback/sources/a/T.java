package a;

/* JADX INFO: loaded from: classes.dex */
public final class T {
    public static void a(java.lang.Object r0) {
            android.app.SharedElementCallback$OnSharedElementsReadyListener r0 = (android.app.SharedElementCallback.OnSharedElementsReadyListener) r0
            r0.onSharedElementsReady()
            return
    }

    public static void b(android.app.Activity r0, java.lang.String[] r1, int r2) {
            r0.requestPermissions(r1, r2)
            return
    }

    public static boolean c(android.app.Activity r0, java.lang.String r1) {
            boolean r0 = r0.shouldShowRequestPermissionRationale(r1)
            return r0
    }
}
