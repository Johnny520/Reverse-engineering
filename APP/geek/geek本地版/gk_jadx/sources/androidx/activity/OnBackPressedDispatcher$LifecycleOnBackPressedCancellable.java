package androidx.activity;

import androidx.lifecycle.C0036a;
import p000.AbstractC0346ip;
import p000.C0712sl;
import p000.C0871ww;
import p000.C0908xw;
import p000.EnumC0347iq;
import p000.InterfaceC0289h8;
import p000.InterfaceC0494mq;
import p000.InterfaceC0568oq;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0494mq, InterfaceC0289h8 {

    /* JADX INFO: renamed from: a */
    public final C0036a f179a;

    /* JADX INFO: renamed from: b */
    public final C0712sl f180b;

    /* JADX INFO: renamed from: c */
    public C0871ww f181c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0029a f182d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0029a c0029a, C0036a c0036a, C0712sl c0712sl) {
        AbstractC0346ip.m1503o("onBackPressedCallback", c0712sl);
        this.f182d = c0029a;
        this.f179a = c0036a;
        this.f180b = c0712sl;
        c0036a.m274a(this);
    }

    @Override // p000.InterfaceC0494mq
    /* JADX INFO: renamed from: b */
    public final void mo124b(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        if (enumC0347iq != EnumC0347iq.ON_START) {
            if (enumC0347iq != EnumC0347iq.ON_STOP) {
                if (enumC0347iq == EnumC0347iq.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0871ww c0871ww = this.f181c;
                if (c0871ww != null) {
                    c0871ww.cancel();
                    return;
                }
                return;
            }
        }
        C0029a c0029a = this.f182d;
        c0029a.getClass();
        C0712sl c0712sl = this.f180b;
        AbstractC0346ip.m1503o("onBackPressedCallback", c0712sl);
        c0029a.f184b.addLast(c0712sl);
        C0871ww c0871ww2 = new C0871ww(c0029a, c0712sl);
        c0712sl.f4447b.add(c0871ww2);
        c0029a.m128d();
        c0712sl.f4448c = new C0908xw(1, c0029a);
        this.f181c = c0871ww2;
    }

    @Override // p000.InterfaceC0289h8
    public final void cancel() {
        this.f179a.m279f(this);
        this.f180b.f4447b.remove(this);
        C0871ww c0871ww = this.f181c;
        if (c0871ww != null) {
            c0871ww.cancel();
        }
        this.f181c = null;
    }
}
