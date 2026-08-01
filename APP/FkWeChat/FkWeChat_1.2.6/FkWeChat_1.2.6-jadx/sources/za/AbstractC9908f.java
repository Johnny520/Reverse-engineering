package za;

import gb.AbstractC2706r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.C1038h0;
import p082fb.AbstractC2411m;
import p082fb.InterfaceC2407i;
import p082fb.InterfaceC2412n;
import p098g9.InterfaceC2557k;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6055y0;
import p229p9.InterfaceC6056z;
import p244qb.AbstractC6370a;
import p244qb.C6379j;
import p342x9.InterfaceC9468b;
import sa.AbstractC7263m;
import sa.C7265o;
import za.InterfaceC9916n;

/* JADX INFO: renamed from: za.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9908f extends AbstractC9914l {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC2557k[] f33424d = {AbstractC1052o0.m3814i(new C1038h0(AbstractC9908f.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b */
    public final InterfaceC5995e f33425b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2407i f33426c;

    /* JADX INFO: renamed from: za.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC7263m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f33427a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC9908f f33428b;

        public a(ArrayList arrayList, AbstractC9908f abstractC9908f) {
            this.f33427a = arrayList;
            this.f33428b = abstractC9908f;
        }

        @Override // sa.AbstractC7264n
        /* JADX INFO: renamed from: a */
        public void mo7475a(InterfaceC5986b interfaceC5986b) {
            interfaceC5986b.getClass();
            C7265o.m28800K(interfaceC5986b, null);
            this.f33427a.add(interfaceC5986b);
        }

        @Override // sa.AbstractC7263m
        /* JADX INFO: renamed from: e */
        public void mo7476e(InterfaceC5986b interfaceC5986b, InterfaceC5986b interfaceC5986b2) {
            interfaceC5986b.getClass();
            interfaceC5986b2.getClass();
            throw new IllegalStateException(("Conflict in scope of " + this.f33428b.m38453m() + ": " + interfaceC5986b + " vs " + interfaceC5986b2).toString());
        }
    }

    public AbstractC9908f(InterfaceC2412n interfaceC2412n, InterfaceC5995e interfaceC5995e) {
        interfaceC2412n.getClass();
        interfaceC5995e.getClass();
        this.f33425b = interfaceC5995e;
        this.f33426c = interfaceC2412n.mo8663f(new C9907e(this));
    }

    /* JADX INFO: renamed from: i */
    public static final List m38450i(AbstractC9908f abstractC9908f) {
        List listMo13969j = abstractC9908f.mo13969j();
        return AbstractC5081g0.m20533E0(listMo13969j, abstractC9908f.m38451k(listMo13969j));
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: a */
    public Collection mo5513a(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        List listM38452l = m38452l();
        if (listM38452l.isEmpty()) {
            return AbstractC5114x.m20800o();
        }
        C6379j c6379j = new C6379j();
        for (Object obj : listM38452l) {
            if ((obj instanceof InterfaceC6000f1) && AbstractC1061t.m3842c(((InterfaceC6000f1) obj).getName(), c5695f)) {
                c6379j.add(obj);
            }
        }
        return c6379j;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        List listM38452l = m38452l();
        if (listM38452l.isEmpty()) {
            return AbstractC5114x.m20800o();
        }
        C6379j c6379j = new C6379j();
        for (Object obj : listM38452l) {
            if ((obj instanceof InterfaceC6055y0) && AbstractC1061t.m3842c(((InterfaceC6055y0) obj).getName(), c5695f)) {
                c6379j.add(obj);
            }
        }
        return c6379j;
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        return !c9906d.m38433a(C9906d.f33408p.m38435m()) ? AbstractC5114x.m20800o() : m38452l();
    }

    /* JADX INFO: renamed from: j */
    public abstract List mo13969j();

    /* JADX INFO: renamed from: k */
    public final List m38451k(List list) {
        Collection collectionM20800o;
        ArrayList arrayList = new ArrayList(3);
        Collection collectionMo9546n = this.f33425b.mo5591o().mo9546n();
        collectionMo9546n.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionMo9546n.iterator();
        while (it.hasNext()) {
            AbstractC5070c0.m20492E(arrayList2, InterfaceC9916n.a.m38461a(((AbstractC2706r0) it.next()).mo7040v(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC5986b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            C5695f name = ((InterfaceC5986b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            C5695f c5695f = (C5695f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC5986b) obj3) instanceof InterfaceC6056z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C7265o c7265o = C7265o.f24143f;
                if (zBooleanValue) {
                    collectionM20800o = new ArrayList();
                    for (Object obj4 : list) {
                        if (AbstractC1061t.m3842c(((InterfaceC6056z) obj4).getName(), c5695f)) {
                            collectionM20800o.add(obj4);
                        }
                    }
                } else {
                    collectionM20800o = AbstractC5114x.m20800o();
                }
                c7265o.m28830v(c5695f, list3, collectionM20800o, this.f33425b, new a(arrayList, this));
            }
        }
        return AbstractC6370a.m25341c(arrayList);
    }

    /* JADX INFO: renamed from: l */
    public final List m38452l() {
        return (List) AbstractC2411m.m8702a(this.f33426c, this, f33424d[0]);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC5995e m38453m() {
        return this.f33425b;
    }
}
