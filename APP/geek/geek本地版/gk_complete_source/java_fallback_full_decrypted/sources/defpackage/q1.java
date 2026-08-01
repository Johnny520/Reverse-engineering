package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static void a(android.app.Activity r0) {
            r0.finishAffinity()
            return
    }

    public static void b(android.app.Activity r0, android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0.startActivityForResult(r1, r2, r3)
            return
    }

    public static void c(android.app.Activity r0, android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) {
            r0.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
