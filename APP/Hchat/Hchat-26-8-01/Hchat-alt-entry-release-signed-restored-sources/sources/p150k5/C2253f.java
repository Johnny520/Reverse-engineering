package p150k5;

import androidx.lifecycle.C0119x;
import java.util.Iterator;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p207o5.AbstractC3058m;
import p207o5.AbstractC3065t;
import p207o5.InterfaceC3048c;
import p377z5.C6099a;
import p377z5.C6100b;

/* JADX INFO: renamed from: k5.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2253f extends AbstractC3065t {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7463j = 0;

    /* JADX INFO: renamed from: k */
    public int f7464k;

    /* JADX INFO: renamed from: l */
    public int f7465l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC3048c f7466m;

    /* JADX INFO: renamed from: n */
    public AbstractC0000a f7467n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f7468o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Iterable f7469p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253f(C2255g c2255g, C0119x c0119x, int i9, AbstractC3058m abstractC3058m, InterfaceC3048c interfaceC3048c) {
        super(c0119x, i9);
        this.f7469p = c2255g;
        this.f7468o = abstractC3058m;
        this.f7466m = interfaceC3048c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3065t
    /* JADX INFO: renamed from: a */
    public final Object mo5492a(C0016a c0016a) {
        C6099a c6099a;
        C6099a c6099aM10857g1;
        C2275z c2275z;
        switch (this.f7463j) {
            case 0:
                C0016a c0016a2 = c0016a;
                C2255g c2255g = (C2255g) this.f7469p;
                C2264o c2264o = c2255g.f7478l;
                do {
                    int i9 = this.f7464k + 1;
                    this.f7464k = i9;
                    if (i9 > c2264o.f7518q) {
                        c2264o.f7515n = c0016a2.f55h;
                        this.f9909g = 3;
                        return null;
                    }
                    Iterator it = c2255g.f7476j;
                    C0016a c0016a3 = c0016a2;
                    C2272w c2272w = new C2272w(c2264o.f7511j, c0016a3, c2264o, this.f7465l, (AbstractC3058m) this.f7468o, this.f7466m, it != null ? ((Integer) it.next()).intValue() : 7);
                    c0016a2 = c0016a3;
                    c6099a = (C6099a) this.f7467n;
                    c6099aM10857g1 = C6099a.m10857g1(c2272w);
                    this.f7467n = c6099aM10857g1;
                    this.f7465l = c2272w.f7561o;
                    if (!c2255g.f7477k || c6099a == null) {
                    }
                    return c2272w;
                } while (c6099a.equals(c6099aM10857g1));
                return c2272w;
            default:
                C2258i c2258i = (C2258i) this.f7469p;
                C2264o c2264o2 = c2258i.f7492l;
                while (true) {
                    int i10 = this.f7464k + 1;
                    this.f7464k = i10;
                    if (i10 > c2264o2.f7520s) {
                        c2264o2.f7517p = c0016a.f55h;
                        this.f9909g = 3;
                        return null;
                    }
                    Iterator it2 = c2258i.f7490j;
                    C0016a c0016a4 = c0016a;
                    c2275z = new C2275z(c2264o2.f7511j, c0016a4, c2264o2, this.f7465l, this.f7466m, (InterfaceC3048c) this.f7468o, it2 != null ? ((Integer) it2.next()).intValue() : 7);
                    C6100b c6100b = (C6100b) this.f7467n;
                    C6100b c6100bM10858i1 = C6100b.m10858i1(c2275z);
                    this.f7467n = c6100bM10858i1;
                    this.f7465l = c2275z.f7577q;
                    if (c2258i.f7491k && c6100b != null && c6100b.equals(c6100bM10858i1)) {
                        c0016a = c0016a4;
                    }
                }
                return c2275z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2253f(C2258i c2258i, C0119x c0119x, int i9, InterfaceC3048c interfaceC3048c, InterfaceC3048c interfaceC3048c2) {
        super(c0119x, i9);
        this.f7469p = c2258i;
        this.f7466m = interfaceC3048c;
        this.f7468o = interfaceC3048c2;
    }
}
