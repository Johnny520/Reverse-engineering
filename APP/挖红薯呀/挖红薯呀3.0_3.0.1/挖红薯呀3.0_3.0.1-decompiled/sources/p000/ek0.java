package p000;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ek0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1479d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f1480e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ek0(Activity activity, int i) {
        this.f1479d = i;
        this.f1480e = activity;
    }

    /* JADX DEBUG: Class process forced to load method for inline: fk0.k(android.app.Activity):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1479d;
        Activity activity = this.f1480e;
        switch (i) {
            case 0:
                fk0.m1128Z(activity);
                break;
            default:
                fk0.m1138e0(activity);
                break;
        }
    }
}
