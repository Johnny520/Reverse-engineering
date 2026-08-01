package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ew {
    public static android.content.Intent a(android.app.Activity r0) {
            android.content.Intent r0 = r0.getParentActivityIntent()
            return r0
    }

    public static boolean b(android.app.Activity r0, android.content.Intent r1) {
            boolean r0 = r0.navigateUpTo(r1)
            return r0
    }

    public static boolean c(android.app.Activity r0, android.content.Intent r1) {
            boolean r0 = r0.shouldUpRecreateTask(r1)
            return r0
    }
}
