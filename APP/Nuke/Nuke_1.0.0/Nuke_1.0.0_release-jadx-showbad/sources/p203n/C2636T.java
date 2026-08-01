package p203n;

import p095T.AbstractC1385s;
import p095T.C1366i0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: n.T */
/* JADX INFO: loaded from: classes.dex */
public final class C2636T {

    /* JADX INFO: renamed from: a */
    public final C2652e0 f8381a;

    /* JADX INFO: renamed from: b */
    public final C1366i0 f8382b = AbstractC1385s.m2629s(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2642Z f8383c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2636T(C2642Z c2642z, C2652e0 c2652e0, String str) {
        this.f8383c = c2642z;
        this.f8381a = c2652e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: W2.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final C2635S m4584a(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        C1366i0 c1366i0 = this.f8382b;
        C2635S c2635s = (C2635S) c1366i0.getValue();
        C2642Z c2642z = this.f8383c;
        if (c2635s == null) {
            Object objMo1h = interfaceC1601c2.mo1h(c2642z.m4593c());
            Object objMo1h2 = interfaceC1601c2.mo1h(c2642z.m4593c());
            C2652e0 c2652e0 = this.f8381a;
            AbstractC2670o abstractC2670o = (AbstractC2670o) c2652e0.f8459a.mo1h(objMo1h2);
            abstractC2670o.mo4627d();
            C2639W c2639w = new C2639W(c2642z, objMo1h, abstractC2670o, c2652e0);
            c2635s = new C2635S(this, c2639w, interfaceC1601c, interfaceC1601c2);
            c1366i0.setValue(c2635s);
            c2642z.f8409i.add(c2639w);
        }
        c2635s.f8379f = (AbstractC1666k) interfaceC1601c2;
        c2635s.f8378e = interfaceC1601c;
        c2635s.m4583a(c2642z.m4596f());
        return c2635s;
    }
}
