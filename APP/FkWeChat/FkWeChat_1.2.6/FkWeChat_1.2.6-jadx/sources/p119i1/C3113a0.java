package p119i1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024b9.AbstractC1061t;
import p119i1.C3128g0;
import p172l8.C4699i;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p364z0.InterfaceC9826d;
import p364z0.InterfaceC9828f;

/* JADX INFO: renamed from: i1.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3113a0 extends AbstractC3165z {
    public C3113a0(C3128g0 c3128g0) {
        super(c3128g0);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m11645e(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m11646l(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return m11949a().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!m11949a().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public Void m11645e(Object obj) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    /* JADX INFO: renamed from: l */
    public Void m11646l(Collection collection) {
        AbstractC3130h0.m11750b();
        throw new C4699i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C3156u0 iterator() {
        return new C3156u0(m11949a(), ((InterfaceC9826d) m11949a().m11740p().m11744i().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return m11949a().m11743s(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        InterfaceC9828f interfaceC9828fM11744i;
        int iM11745j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11735c;
        Set setM20564c1 = AbstractC5081g0.m20564c1(collection);
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
            for (Map.Entry entry : c3128g0M11949a.entrySet()) {
                if (setM20564c1.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
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

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        InterfaceC9828f interfaceC9828fM11744i;
        int iM11745j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11735c;
        Set setM20564c1 = AbstractC5081g0.m20564c1(collection);
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
            for (Map.Entry entry : c3128g0M11949a.entrySet()) {
                if (!setM20564c1.contains(entry.getValue())) {
                    aVarBuilder.remove(entry.getKey());
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
