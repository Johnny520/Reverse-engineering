package gf;

import java.util.Queue;
import p086ff.InterfaceC2440h;
import p116hf.AbstractC3022e;
import p116hf.C3031n;

/* JADX INFO: renamed from: gf.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2793b extends AbstractC3022e {
    private static final long serialVersionUID = -176083308134819629L;

    /* JADX INFO: renamed from: q */
    public String f7284q;

    /* JADX INFO: renamed from: r */
    public C3031n f7285r;

    /* JADX INFO: renamed from: s */
    public Queue f7286s;

    public C2793b(C3031n c3031n, Queue queue) {
        this.f7285r = c3031n;
        this.f7284q = c3031n.m11200I();
        this.f7286s = queue;
    }

    @Override // p116hf.AbstractC3018a
    /* JADX INFO: renamed from: H */
    public void mo9959H(EnumC2795d enumC2795d, InterfaceC2440h interfaceC2440h, String str, Object[] objArr, Throwable th) {
        C2797f c2797f = new C2797f();
        c2797f.m9971q(System.currentTimeMillis());
        c2797f.m9965k(enumC2795d);
        c2797f.m9966l(this.f7285r);
        c2797f.m9967m(this.f7284q);
        if (interfaceC2440h != null) {
            c2797f.m9962h(interfaceC2440h);
        }
        c2797f.m9968n(str);
        c2797f.m9969o(Thread.currentThread().getName());
        c2797f.m9964j(objArr);
        c2797f.m9970p(th);
        this.f7286s.add(c2797f);
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: a */
    public boolean mo8803a() {
        return true;
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: b */
    public boolean mo8804b() {
        return true;
    }

    @Override // p116hf.AbstractC3018a
    public String getName() {
        return this.f7284q;
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: h */
    public boolean mo8810h() {
        return true;
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: k */
    public boolean mo8813k() {
        return true;
    }

    @Override // p086ff.InterfaceC2436d
    /* JADX INFO: renamed from: n */
    public boolean mo8816n() {
        return true;
    }
}
