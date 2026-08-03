package p150k5;

import androidx.lifecycle.C0119x;
import java.util.Iterator;
import p005a5.C0016a;
import p207o5.AbstractC3065t;
import p207o5.InterfaceC3048c;
import p377z5.C6099a;

/* JADX INFO: renamed from: k5.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2257h extends AbstractC3065t {

    /* JADX INFO: renamed from: j */
    public int f7482j;

    /* JADX INFO: renamed from: k */
    public C6099a f7483k;

    /* JADX INFO: renamed from: l */
    public int f7484l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC3048c f7485m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C2258i f7486n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2257h(C2258i c2258i, C0119x c0119x, int i9, InterfaceC3048c interfaceC3048c) {
        super(c0119x, i9);
        this.f7486n = c2258i;
        this.f7485m = interfaceC3048c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.AbstractC3065t
    /* JADX INFO: renamed from: a */
    public final Object mo5492a(C0016a c0016a) {
        C2272w c2272w;
        C2258i c2258i = this.f7486n;
        C2264o c2264o = c2258i.f7492l;
        while (true) {
            int i9 = this.f7482j + 1;
            this.f7482j = i9;
            if (i9 > c2264o.f7519r) {
                c2264o.f7516o = c0016a.f55h;
                this.f9909g = 3;
                return null;
            }
            Iterator it = c2258i.f7490j;
            C0016a c0016a2 = c0016a;
            c2272w = new C2272w(c2264o.f7511j, c0016a2, c2264o, this.f7484l, this.f7485m, it != null ? ((Integer) it.next()).intValue() : 7);
            C6099a c6099a = this.f7483k;
            C6099a c6099aM10857g1 = C6099a.m10857g1(c2272w);
            this.f7483k = c6099aM10857g1;
            this.f7484l = c2272w.f7561o;
            if (!c2258i.f7491k || c6099a == null || !c6099a.equals(c6099aM10857g1)) {
                break;
            }
            c0016a = c0016a2;
        }
        return c2272w;
    }
}
