package p000;

import androidx.activity.C0029a;

/* JADX INFO: renamed from: ex */
/* JADX INFO: loaded from: classes.dex */
public final class C0203ex implements InterfaceC0661r8 {

    /* JADX INFO: renamed from: a */
    public final C0785ul f1674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0029a f1675b;

    public C0203ex(C0029a c0029a, C0785ul c0785ul) {
        AbstractC0493mp.m1857g("onBackPressedCallback", c0785ul);
        this.f1675b = c0029a;
        this.f1674a = c0785ul;
    }

    @Override // p000.InterfaceC0661r8
    public final void cancel() {
        C0029a c0029a = this.f1675b;
        C0400k6 c0400k6 = c0029a.f147b;
        C0785ul c0785ul = this.f1674a;
        c0400k6.remove(c0785ul);
        if (AbstractC0493mp.m1853c(c0029a.f148c, c0785ul)) {
            c0785ul.getClass();
            c0029a.f148c = null;
        }
        c0785ul.f4837b.remove(this);
        C0240fx c0240fx = c0785ul.f4838c;
        if (c0240fx != null) {
            c0240fx.mo474a();
        }
        c0785ul.f4838c = null;
    }
}
