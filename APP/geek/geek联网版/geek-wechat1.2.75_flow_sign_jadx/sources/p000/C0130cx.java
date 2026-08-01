package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: cx */
/* JADX INFO: loaded from: classes.dex */
public final class C0130cx implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0786um f1267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0786um f1268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0379jm f1269c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0379jm f1270d;

    public C0130cx(InterfaceC0786um interfaceC0786um, InterfaceC0786um interfaceC0786um2, InterfaceC0379jm interfaceC0379jm, InterfaceC0379jm interfaceC0379jm2) {
        this.f1267a = interfaceC0786um;
        this.f1268b = interfaceC0786um2;
        this.f1269c = interfaceC0379jm;
        this.f1270d = interfaceC0379jm2;
    }

    public final void onBackCancelled() {
        this.f1270d.mo474a();
    }

    public final void onBackInvoked() {
        this.f1269c.mo474a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0493mp.m1857g("backEvent", backEvent);
        this.f1268b.mo26f(new C0401k7(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0493mp.m1857g("backEvent", backEvent);
        this.f1267a.mo26f(new C0401k7(backEvent));
    }
}
