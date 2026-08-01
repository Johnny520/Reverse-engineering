package androidx.activity;

import androidx.lifecycle.C0036a;
import p000.AbstractC0493mp;
import p000.C0203ex;
import p000.C0240fx;
import p000.C0785ul;
import p000.EnumC0494mq;
import p000.InterfaceC0642qq;
import p000.InterfaceC0661r8;
import p000.InterfaceC0716sq;

/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0642qq, InterfaceC0661r8 {

    /* JADX INFO: renamed from: a */
    public final C0036a f142a;

    /* JADX INFO: renamed from: b */
    public final C0785ul f143b;

    /* JADX INFO: renamed from: c */
    public C0203ex f144c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0029a f145d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C0029a c0029a, C0036a c0036a, C0785ul c0785ul) {
        AbstractC0493mp.m1857g("onBackPressedCallback", c0785ul);
        this.f145d = c0029a;
        this.f142a = c0036a;
        this.f143b = c0785ul;
        c0036a.m259a(this);
    }

    @Override // p000.InterfaceC0642qq
    /* JADX INFO: renamed from: b */
    public final void mo109b(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        if (enumC0494mq != EnumC0494mq.ON_START) {
            if (enumC0494mq != EnumC0494mq.ON_STOP) {
                if (enumC0494mq == EnumC0494mq.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0203ex c0203ex = this.f144c;
                if (c0203ex != null) {
                    c0203ex.cancel();
                    return;
                }
                return;
            }
        }
        C0029a c0029a = this.f145d;
        c0029a.getClass();
        C0785ul c0785ul = this.f143b;
        AbstractC0493mp.m1857g("onBackPressedCallback", c0785ul);
        c0029a.f147b.addLast(c0785ul);
        C0203ex c0203ex2 = new C0203ex(c0029a, c0785ul);
        c0785ul.f4837b.add(c0203ex2);
        c0029a.m113d();
        c0785ul.f4838c = new C0240fx(1, c0029a);
        this.f144c = c0203ex2;
    }

    @Override // p000.InterfaceC0661r8
    public final void cancel() {
        this.f142a.m264f(this);
        this.f143b.f4837b.remove(this);
        C0203ex c0203ex = this.f144c;
        if (c0203ex != null) {
            c0203ex.cancel();
        }
        this.f144c = null;
    }
}
