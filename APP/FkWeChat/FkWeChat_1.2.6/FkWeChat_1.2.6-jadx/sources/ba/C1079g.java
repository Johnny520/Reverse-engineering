package ba;

import java.util.Iterator;
import p024b9.AbstractC1043k;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2375d;
import p082fb.InterfaceC2406h;
import p185m8.AbstractC5081g0;
import p186m9.C5135p;
import p213oa.C5692c;
import p243q9.InterfaceC6328c;
import p243q9.InterfaceC6333h;
import p373z9.C9891d;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: ba.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1079g implements InterfaceC6333h {

    /* JADX INFO: renamed from: q */
    public final C1083k f3257q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2375d f3258r;

    /* JADX INFO: renamed from: s */
    public final boolean f3259s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2406h f3260t;

    public C1079g(C1083k c1083k, InterfaceC2375d interfaceC2375d, boolean z10) {
        c1083k.getClass();
        interfaceC2375d.getClass();
        this.f3257q = c1083k;
        this.f3258r = interfaceC2375d;
        this.f3259s = z10;
        this.f3260t = c1083k.m3937a().m3916u().mo8665h(new C1078f(this));
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6328c m3925c(C1079g c1079g, InterfaceC2369a interfaceC2369a) {
        interfaceC2369a.getClass();
        return C9891d.f33362a.m38388e(interfaceC2369a, c1079g.f3257q, c1079g.f3259s);
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: b */
    public InterfaceC6328c mo3926b(C5692c c5692c) {
        InterfaceC6328c interfaceC6328c;
        c5692c.getClass();
        InterfaceC2369a interfaceC2369aMo8603b = this.f3258r.mo8603b(c5692c);
        return (interfaceC2369aMo8603b == null || (interfaceC6328c = (InterfaceC6328c) this.f3260t.mo27m(interfaceC2369aMo8603b)) == null) ? C9891d.f33362a.m38384a(c5692c, this.f3258r, this.f3257q) : interfaceC6328c;
    }

    @Override // p243q9.InterfaceC6333h
    /* JADX INFO: renamed from: i */
    public boolean mo3927i(C5692c c5692c) {
        return InterfaceC6333h.b.m25006b(this, c5692c);
    }

    @Override // p243q9.InterfaceC6333h
    public boolean isEmpty() {
        return this.f3258r.getAnnotations().isEmpty() && !this.f3258r.mo8604k();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return AbstractC7294t.m28893A(AbstractC7294t.m28904L(AbstractC7294t.m28901I(AbstractC5081g0.m20555Y(this.f3258r.getAnnotations()), this.f3260t), C9891d.f33362a.m38384a(C5135p.a.f15620y, this.f3258r, this.f3257q))).iterator();
    }

    public /* synthetic */ C1079g(C1083k c1083k, InterfaceC2375d interfaceC2375d, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(c1083k, interfaceC2375d, (i10 & 4) != 0 ? false : z10);
    }
}
