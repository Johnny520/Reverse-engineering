package ca;

import ba.C1079g;
import ba.C1083k;
import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import gb.C2715u0;
import gb.EnumC2671h2;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p050da.AbstractC1929b;
import p081fa.InterfaceC2382j;
import p081fa.InterfaceC2397y;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5116y;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p273s9.AbstractC7203b;

/* JADX INFO: renamed from: ca.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1411b1 extends AbstractC7203b {

    /* JADX INFO: renamed from: A */
    public final C1083k f4176A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC2397y f4177B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411b1(C1083k c1083k, InterfaceC2397y interfaceC2397y, int i10, InterfaceC6019m interfaceC6019m) {
        super(c1083k.m3941e(), interfaceC6019m, new C1079g(c1083k, interfaceC2397y, false, 4, null), interfaceC2397y.getName(), EnumC2691m2.f7042u, false, i10, InterfaceC6003g1.f18958a, c1083k.m3937a().m3917v());
        c1083k.getClass();
        interfaceC2397y.getClass();
        interfaceC6019m.getClass();
        this.f4176A = c1083k;
        this.f4177B = interfaceC2397y;
    }

    @Override // p273s9.AbstractC7215h
    /* JADX INFO: renamed from: L0 */
    public List mo5494L0(List list) {
        list.getClass();
        return this.f4176A.m3937a().m3913r().m9289r(this, list, this.f4176A);
    }

    @Override // p273s9.AbstractC7215h
    /* JADX INFO: renamed from: Q0 */
    public void mo5495Q0(AbstractC2706r0 abstractC2706r0) {
        abstractC2706r0.getClass();
    }

    @Override // p273s9.AbstractC7215h
    /* JADX INFO: renamed from: R0 */
    public List mo5496R0() {
        return m5497S0();
    }

    /* JADX INFO: renamed from: S0 */
    public final List m5497S0() {
        Collection upperBounds = this.f4177B.getUpperBounds();
        if (upperBounds.isEmpty()) {
            AbstractC2650c1 abstractC2650c1M20920i = this.f4176A.m3940d().mo12669t().m20920i();
            abstractC2650c1M20920i.getClass();
            AbstractC2650c1 abstractC2650c1M20902J = this.f4176A.m3940d().mo12669t().m20902J();
            abstractC2650c1M20902J.getClass();
            return AbstractC5112w.m20789e(C2715u0.m9624e(abstractC2650c1M20920i, abstractC2650c1M20902J));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f4176A.m3943g().m7014p((InterfaceC2382j) it.next(), AbstractC1929b.m6997b(EnumC2671h2.f7006r, false, false, this, 3, null)));
        }
        return arrayList;
    }
}
