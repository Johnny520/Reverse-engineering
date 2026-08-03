package p332wb;

import android.app.Activity;
import p085fg.InterfaceC1220a;
import p347xa.C5752m;

/* JADX INFO: renamed from: wb.vu */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5421vu implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21560g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f21561h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1220a f21562i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC5421vu(Activity activity, InterfaceC1220a interfaceC1220a) {
        this.f21561h = activity;
        this.f21562i = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21560g) {
            case 0:
                Activity activity = this.f21561h;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    this.f21562i.invoke();
                    break;
                }
                break;
            default:
                if (C5752m.m10441a(this.f21561h)) {
                    this.f21562i.invoke();
                }
                break;
        }
    }

    public /* synthetic */ RunnableC5421vu(C5752m c5752m, Activity activity, InterfaceC1220a interfaceC1220a) {
        this.f21561h = activity;
        this.f21562i = interfaceC1220a;
    }
}
