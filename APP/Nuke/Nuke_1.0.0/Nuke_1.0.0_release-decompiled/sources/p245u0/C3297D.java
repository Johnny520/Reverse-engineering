package p245u0;

import p000A.C0072l0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p121Y1.C1753n;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: u0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C3297D extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10184e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3298E f10185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3297D(C3298E c3298e, int i5) {
        super(1);
        this.f10184e = i5;
        this.f10185f = c3298e;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [W2.a, X2.k] */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f10184e) {
            case 0:
                C3298E c3298e = this.f10185f;
                c3298e.f10188d = true;
                c3298e.f10190f.mo6a();
                return C0891q.f2780a;
            default:
                InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                C3298E c3298e2 = this.f10185f;
                C3306c c3306c = c3298e2.f10186b;
                float f2 = c3298e2.f10195k;
                float f5 = c3298e2.f10196l;
                C0072l0 c0072l0Mo854L = interfaceC2903d.mo854L();
                long jM110n = c0072l0Mo854L.m110n();
                c0072l0Mo854L.m106j().mo4852n();
                try {
                    ((C1753n) c0072l0Mo854L.f307e).m3113I(f2, f5, 0L);
                    c3306c.mo5565a(interfaceC2903d);
                    c0072l0Mo854L.m106j().mo4851l();
                    c0072l0Mo854L.m119y(jM110n);
                    return C0891q.f2780a;
                } catch (Throwable th) {
                    c0072l0Mo854L.m106j().mo4851l();
                    c0072l0Mo854L.m119y(jM110n);
                    throw th;
                }
        }
    }
}
