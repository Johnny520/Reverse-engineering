package p119i1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1064u0;
import p080f9.AbstractC2368o;
import p119i1.C3128g0;
import p172l8.AbstractC4717x;
import p172l8.C4699i;
import p172l8.C4700i0;
import p172l8.C4711r;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5116y;
import p364z0.InterfaceC9826d;
import p364z0.InterfaceC9828f;

/* JADX INFO: renamed from: i1.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3161x extends AbstractC3165z {
    public C3161x(C3128g0 c3128g0) {
        super(c3128g0);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m11936e((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m11937l(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (AbstractC1064u0.m3867o(obj)) {
            return m11938o((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public Void m11936e(Map.Entry entry) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C3150r0(m11949a(), ((InterfaceC9826d) m11949a().m11740p().m11744i().entrySet()).iterator());
    }

    /* JADX INFO: renamed from: l */
    public Void m11937l(Collection collection) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    /* JADX INFO: renamed from: o */
    public boolean m11938o(Map.Entry entry) {
        return AbstractC1061t.m3842c(m11949a().get(entry.getKey()), entry.getValue());
    }

    /* JADX INFO: renamed from: p */
    public boolean m11939p(Map.Entry entry) {
        return m11949a().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (AbstractC1064u0.m3867o(obj)) {
            return m11939p((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (m11949a().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        InterfaceC9828f interfaceC9828fM11744i;
        int iM11745j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11735c;
        Collection<Map.Entry> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(collection2, 10)), 16));
        for (Map.Entry entry : collection2) {
            C4711r c4711rM18815a = AbstractC4717x.m18815a(entry.getKey(), entry.getValue());
            linkedHashMap.put(c4711rM18815a.m18795e(), c4711rM18815a.m18796f());
        }
        C3128g0 c3128g0M11949a = m11949a();
        boolean z10 = false;
        do {
            synchronized (AbstractC3130h0.f8337a) {
                AbstractC3162x0 firstStateRecord = c3128g0M11949a.getFirstStateRecord();
                firstStateRecord.getClass();
                C3128g0.a aVar = (C3128g0.a) AbstractC3159w.m11880I((C3128g0.a) firstStateRecord);
                interfaceC9828fM11744i = aVar.m11744i();
                iM11745j = aVar.m11745j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9828fM11744i.getClass();
            InterfaceC9828f.a aVarBuilder = interfaceC9828fM11744i.builder();
            for (Map.Entry entry2 : c3128g0M11949a.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC1061t.m3842c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    aVarBuilder.remove(entry2.getKey());
                    z10 = true;
                }
            }
            C4700i0 c4700i02 = C4700i0.f13910a;
            InterfaceC9828f interfaceC9828fBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9828fBuild, interfaceC9828fM11744i)) {
                break;
            }
            AbstractC3162x0 firstStateRecord2 = c3128g0M11949a.getFirstStateRecord();
            firstStateRecord2.getClass();
            C3128g0.a aVar2 = (C3128g0.a) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11735c = c3128g0M11949a.m11735c((C3128g0.a) AbstractC3159w.m11917j0(aVar2, c3128g0M11949a, abstractC3137lM11764c), iM11745j, interfaceC9828fBuild);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, c3128g0M11949a);
        } while (!zM11735c);
        return z10;
    }
}
