package ca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p080f9.AbstractC2368o;
import p081fa.AbstractC2388p;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2386n;
import p081fa.InterfaceC2390r;
import p081fa.InterfaceC2395w;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p213oa.C5695f;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ca.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1409b implements InterfaceC1412c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2379g f4169a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f4170b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f4171c;

    /* JADX INFO: renamed from: d */
    public final Map f4172d;

    /* JADX INFO: renamed from: e */
    public final Map f4173e;

    /* JADX INFO: renamed from: f */
    public final Map f4174f;

    public C1409b(InterfaceC2379g interfaceC2379g, InterfaceC0184l interfaceC0184l) {
        interfaceC2379g.getClass();
        interfaceC0184l.getClass();
        this.f4169a = interfaceC2379g;
        this.f4170b = interfaceC0184l;
        C1406a c1406a = new C1406a(this);
        this.f4171c = c1406a;
        InterfaceC7282h interfaceC7282hM28915y = AbstractC7294t.m28915y(AbstractC5081g0.m20555Y(interfaceC2379g.mo8614P()), c1406a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC7282hM28915y) {
            C5695f name = ((InterfaceC2390r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f4172d = linkedHashMap;
        InterfaceC7282h interfaceC7282hM28915y2 = AbstractC7294t.m28915y(AbstractC5081g0.m20555Y(this.f4169a.mo8609G()), this.f4170b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : interfaceC7282hM28915y2) {
            linkedHashMap2.put(((InterfaceC2386n) obj2).getName(), obj2);
        }
        this.f4173e = linkedHashMap2;
        Collection collectionMo8620p = this.f4169a.mo8620p();
        InterfaceC0184l interfaceC0184l2 = this.f4170b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionMo8620p) {
            if (((Boolean) interfaceC0184l2.mo27m(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((InterfaceC2395w) obj4).getName(), obj4);
        }
        this.f4174f = linkedHashMap3;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m5487h(C1409b c1409b, InterfaceC2390r interfaceC2390r) {
        interfaceC2390r.getClass();
        return ((Boolean) c1409b.f4170b.mo27m(interfaceC2390r)).booleanValue() && !AbstractC2388p.m8637c(interfaceC2390r);
    }

    @Override // ca.InterfaceC1412c
    /* JADX INFO: renamed from: a */
    public Set mo5488a() {
        InterfaceC7282h interfaceC7282hM28915y = AbstractC7294t.m28915y(AbstractC5081g0.m20555Y(this.f4169a.mo8614P()), this.f4171c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = interfaceC7282hM28915y.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC2390r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // ca.InterfaceC1412c
    /* JADX INFO: renamed from: b */
    public InterfaceC2395w mo5489b(C5695f c5695f) {
        c5695f.getClass();
        return (InterfaceC2395w) this.f4174f.get(c5695f);
    }

    @Override // ca.InterfaceC1412c
    /* JADX INFO: renamed from: c */
    public Set mo5490c() {
        return this.f4174f.keySet();
    }

    @Override // ca.InterfaceC1412c
    /* JADX INFO: renamed from: d */
    public InterfaceC2386n mo5491d(C5695f c5695f) {
        c5695f.getClass();
        return (InterfaceC2386n) this.f4173e.get(c5695f);
    }

    @Override // ca.InterfaceC1412c
    /* JADX INFO: renamed from: e */
    public Set mo5492e() {
        InterfaceC7282h interfaceC7282hM28915y = AbstractC7294t.m28915y(AbstractC5081g0.m20555Y(this.f4169a.mo8609G()), this.f4170b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = interfaceC7282hM28915y.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC2386n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // ca.InterfaceC1412c
    /* JADX INFO: renamed from: f */
    public Collection mo5493f(C5695f c5695f) {
        c5695f.getClass();
        List list = (List) this.f4172d.get(c5695f);
        return list != null ? list : AbstractC5114x.m20800o();
    }
}
