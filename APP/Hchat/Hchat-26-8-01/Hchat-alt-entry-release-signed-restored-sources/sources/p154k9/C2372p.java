package p154k9;

import android.app.Activity;
import p007a7.AbstractC0018a;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;

/* JADX INFO: renamed from: k9.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2372p implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7795g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f7796h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2372p(Activity activity, int i9) {
        this.f7795g = i9;
        this.f7796h = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f7795g) {
            case 0:
                Activity activity = this.f7796h;
                C2374r c2374r = C2374r.f7799a;
                if (C2374r.f7803e && C2374r.f7802d && C2374r.m5688q(activity)) {
                    Activity activity2 = (Activity) C2374r.f7805g.get();
                    if (activity2 != null && activity2 != activity) {
                        AbstractC0018a.m248l(activity2);
                        C2374r.m5676e(activity2);
                    }
                    C2374r.m5674c(activity);
                } else if (C2374r.f7805g.get() != activity || !C2374r.m5688q(activity)) {
                    Activity activity3 = (Activity) C2374r.f7805g.get();
                    if (activity3 != null) {
                        AbstractC0018a.m248l(activity3);
                    }
                    C2374r.m5676e(null);
                }
                break;
            default:
                Activity activity4 = this.f7796h;
                if (C2374r.f7805g.get() == activity4) {
                    AbstractC0018a.m248l(activity4);
                    C2374r c2374r2 = C2374r.f7799a;
                    C2374r.m5676e(activity4);
                }
                break;
        }
        return C3967n.f12976a;
    }
}
