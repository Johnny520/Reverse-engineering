package a;

/* JADX INFO: loaded from: classes.dex */
public final class S {
    public static void a(android.app.Activity r0) {
            r0.finishAfterTransition()
            return
    }

    public static void b(android.app.Activity r0) {
            r0.postponeEnterTransition()
            return
    }

    public static void c(android.app.Activity r0, android.app.SharedElementCallback r1) {
            r0.setEnterSharedElementCallback(r1)
            return
    }

    public static void d(android.app.Activity r0, android.app.SharedElementCallback r1) {
            r0.setExitSharedElementCallback(r1)
            return
    }

    public static void e(android.app.Activity r0) {
            r0.startPostponedEnterTransition()
            return
    }
}
