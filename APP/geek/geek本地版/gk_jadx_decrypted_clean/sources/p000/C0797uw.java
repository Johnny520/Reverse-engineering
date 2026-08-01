package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: uw */
/* JADX INFO: loaded from: classes.dex */
public final class C0797uw implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0713sm f4778a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0713sm f4779b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0303hm f4780c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0303hm f4781d;

    public C0797uw(InterfaceC0713sm interfaceC0713sm, InterfaceC0713sm interfaceC0713sm2, InterfaceC0303hm interfaceC0303hm, InterfaceC0303hm interfaceC0303hm2) {
        this.f4778a = interfaceC0713sm;
        this.f4779b = interfaceC0713sm2;
        this.f4780c = interfaceC0303hm;
        this.f4781d = interfaceC0303hm2;
    }

    public final void onBackCancelled() {
        this.f4781d.mo10a();
    }

    public final void onBackInvoked() {
        this.f4780c.mo10a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0346ip.m1503o("backEvent", backEvent);
        this.f4779b.mo96f(new C0008a7(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0346ip.m1503o("backEvent", backEvent);
        this.f4778a.mo96f(new C0008a7(backEvent));
    }
}
