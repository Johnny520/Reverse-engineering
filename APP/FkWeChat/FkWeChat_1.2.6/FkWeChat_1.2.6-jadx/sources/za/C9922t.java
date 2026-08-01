package za;

import gb.AbstractC2655d2;
import gb.C2663f2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p186m9.C5129j;
import p213oa.C5695f;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6009i1;
import p229p9.InterfaceC6019m;
import p244qb.AbstractC6370a;
import p285ta.AbstractC8213e;
import p314vb.C8897d;
import p342x9.InterfaceC9468b;
import za.InterfaceC9916n;

/* JADX INFO: renamed from: za.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9922t implements InterfaceC9913k {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9913k f33446b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f33447c;

    /* JADX INFO: renamed from: d */
    public final C2663f2 f33448d;

    /* JADX INFO: renamed from: e */
    public Map f33449e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4705l f33450f;

    public C9922t(InterfaceC9913k interfaceC9913k, C2663f2 c2663f2) {
        interfaceC9913k.getClass();
        c2663f2.getClass();
        this.f33446b = interfaceC9913k;
        this.f33447c = AbstractC4706m.m18787a(new C9920r(c2663f2));
        AbstractC2655d2 abstractC2655d2M9389j = c2663f2.m9389j();
        abstractC2655d2M9389j.getClass();
        this.f33448d = AbstractC8213e.m31912h(abstractC2655d2M9389j, false, 1, null).m9361c();
        this.f33450f = AbstractC4706m.m18787a(new C9921s(this));
    }

    /* JADX INFO: renamed from: h */
    public static final Collection m38471h(C9922t c9922t) {
        return c9922t.m38476l(InterfaceC9916n.a.m38461a(c9922t.f33446b, null, null, 3, null));
    }

    /* JADX INFO: renamed from: n */
    public static final C2663f2 m38474n(C2663f2 c2663f2) {
        return c2663f2.m9389j().m9361c();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return m38476l(this.f33446b.mo5513a(c5695f, interfaceC9468b));
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: b */
    public Set mo5514b() {
        return this.f33446b.mo5514b();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return m38476l(this.f33446b.mo5515c(c5695f, interfaceC9468b));
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: d */
    public Set mo5516d() {
        return this.f33446b.mo5516d();
    }

    @Override // za.InterfaceC9913k
    /* JADX INFO: renamed from: e */
    public Set mo5517e() {
        return this.f33446b.mo5517e();
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: f */
    public InterfaceC6004h mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        InterfaceC6004h interfaceC6004hMo5518f = this.f33446b.mo5518f(c5695f, interfaceC9468b);
        if (interfaceC6004hMo5518f != null) {
            return (InterfaceC6004h) m38477m(interfaceC6004hMo5518f);
        }
        return null;
    }

    @Override // za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        return m38475k();
    }

    /* JADX INFO: renamed from: k */
    public final Collection m38475k() {
        return (Collection) this.f33450f.getValue();
    }

    /* JADX INFO: renamed from: l */
    public final Collection m38476l(Collection collection) {
        if (this.f33448d.m9390k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetM25345g = AbstractC6370a.m25345g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetM25345g.add(m38477m((InterfaceC6019m) it.next()));
        }
        return linkedHashSetM25345g;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC6019m m38477m(InterfaceC6019m interfaceC6019m) {
        if (this.f33448d.m9390k()) {
            return interfaceC6019m;
        }
        if (this.f33449e == null) {
            this.f33449e = new HashMap();
        }
        Map map = this.f33449e;
        map.getClass();
        Object objMo7503c = map.get(interfaceC6019m);
        if (objMo7503c == null) {
            if (!(interfaceC6019m instanceof InterfaceC6009i1)) {
                C8897d.m34134a("Unknown descriptor in scope: ", interfaceC6019m);
                return null;
            }
            objMo7503c = ((InterfaceC6009i1) interfaceC6019m).mo7503c(this.f33448d);
            if (objMo7503c == null) {
                C5129j.m20943a("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", interfaceC6019m, " substitution fails");
                return null;
            }
            map.put(interfaceC6019m, objMo7503c);
        }
        return (InterfaceC6019m) objMo7503c;
    }
}
