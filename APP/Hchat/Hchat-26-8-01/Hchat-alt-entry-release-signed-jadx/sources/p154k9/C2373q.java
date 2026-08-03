package p154k9;

import android.app.Activity;
import p007a7.AbstractC0018a;
import p085fg.InterfaceC1220a;
import p099h.Hchat.crash.RunnableC1436e;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p117i0.AbstractC1874r;
import p242q8.C3460o;
import p276sf.C3967n;

/* JADX INFO: renamed from: k9.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2373q implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7797g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f7798h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2373q(int i9, boolean z9) {
        this.f7797g = i9;
        this.f7798h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Activity activityM7263a;
        int i9 = this.f7797g;
        C3967n c3967n = C3967n.f12976a;
        boolean z9 = this.f7798h;
        switch (i9) {
            case 0:
                C2374r c2374r = C2374r.f7799a;
                if (z9) {
                    C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
                    if (c3460oCurrentActivity == null || (activityM7263a = c3460oCurrentActivity.m7263a()) == null) {
                        activityM7263a = (Activity) C2374r.f7805g.get();
                    }
                    if (activityM7263a != null) {
                        C2374r.m5687p(new C2372p(activityM7263a, 0));
                    }
                } else {
                    Activity activity = (Activity) C2374r.f7805g.get();
                    if (activity != null) {
                        AbstractC0018a.m248l(activity);
                    }
                    C2374r.m5676e(null);
                }
                return c3967n;
            case 1:
                if (z9) {
                    Activity activity2 = (Activity) C2374r.f7805g.get();
                    if (activity2 != null) {
                        AbstractC0018a.m248l(activity2);
                    }
                    C2374r c2374r2 = C2374r.f7799a;
                    C2374r.m5676e(null);
                } else {
                    C2374r.f7800b.postDelayed(new RunnableC1436e(3), 180L);
                }
                return c3967n;
            default:
                return AbstractC1874r.m4639u(Boolean.valueOf(z9));
        }
    }
}
