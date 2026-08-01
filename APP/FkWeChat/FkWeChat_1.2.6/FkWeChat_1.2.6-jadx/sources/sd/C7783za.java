package sd;

import android.app.Activity;
import p262rd.DialogC6599e;

/* JADX INFO: renamed from: sd.za */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7783za {

    /* JADX INFO: renamed from: a */
    public static final C7783za f25972a = new C7783za();

    /* JADX INFO: renamed from: a */
    public static void m30209a(Activity activity) {
        try {
            DialogC6599e dialogC6599e = new DialogC6599e(activity);
            dialogC6599e.m26165e(C7628r7.f25245a.m29506g());
            dialogC6599e.show();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m30210b(final Activity activity) {
        activity.getClass();
        activity.runOnUiThread(new Runnable() { // from class: sd.ya
            @Override // java.lang.Runnable
            public final void run() {
                C7783za.m30209a(activity);
            }
        });
    }
}
