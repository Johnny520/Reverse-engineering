package sa;

import java.util.Collection;
import java.util.LinkedList;
import p010a9.InterfaceC0184l;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p229p9.InterfaceC5983a;
import p244qb.C6380k;

/* JADX INFO: renamed from: sa.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7269s {
    /* JADX INFO: renamed from: b */
    public static final Collection m28848b(Collection collection, InterfaceC0184l interfaceC0184l) {
        collection.getClass();
        interfaceC0184l.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C6380k c6380kM25381a = C6380k.f20125s.m25381a();
        while (!linkedList.isEmpty()) {
            Object objM20576j0 = AbstractC5081g0.m20576j0(linkedList);
            C6380k c6380kM25381a2 = C6380k.f20125s.m25381a();
            Collection collectionM28815p = C7265o.m28815p(objM20576j0, linkedList, interfaceC0184l, new C7268r(c6380kM25381a2));
            collectionM28815p.getClass();
            if (collectionM28815p.size() == 1 && c6380kM25381a2.isEmpty()) {
                Object objM20536H0 = AbstractC5081g0.m20536H0(collectionM28815p);
                objM20536H0.getClass();
                c6380kM25381a.add(objM20536H0);
            } else {
                Object objM28801L = C7265o.m28801L(collectionM28815p, interfaceC0184l);
                InterfaceC5983a interfaceC5983a = (InterfaceC5983a) interfaceC0184l.mo27m(objM28801L);
                for (Object obj : collectionM28815p) {
                    obj.getClass();
                    if (!C7265o.m28794B(interfaceC5983a, (InterfaceC5983a) interfaceC0184l.mo27m(obj))) {
                        c6380kM25381a2.add(obj);
                    }
                }
                if (!c6380kM25381a2.isEmpty()) {
                    c6380kM25381a.addAll(c6380kM25381a2);
                }
                c6380kM25381a.add(objM28801L);
            }
        }
        return c6380kM25381a;
    }

    /* JADX INFO: renamed from: c */
    public static final C4700i0 m28849c(C6380k c6380k, Object obj) {
        obj.getClass();
        c6380k.add(obj);
        return C4700i0.f13910a;
    }
}
