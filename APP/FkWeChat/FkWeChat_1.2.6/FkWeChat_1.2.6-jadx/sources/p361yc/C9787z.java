package p361yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0188p;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p185m8.AbstractC5116y;
import p300uc.InterfaceC8647b;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: yc.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9787z implements InterfaceC9679c2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p f33075a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f33076b;

    public C9787z(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        this.f33075a = interfaceC0188p;
        this.f33076b = new ConcurrentHashMap();
    }

    @Override // p361yc.InterfaceC9679c2
    /* JADX INFO: renamed from: a */
    public Object mo37831a(InterfaceC2549c interfaceC2549c, List list) {
        Object objM18798b;
        Object objPutIfAbsent;
        interfaceC2549c.getClass();
        list.getClass();
        ConcurrentHashMap concurrentHashMap = this.f33076b;
        Class clsM38367b = AbstractC9886a.m38367b(interfaceC2549c);
        Object c9674b2 = concurrentHashMap.get(clsM38367b);
        if (c9674b2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM38367b, (c9674b2 = new C9674b2()))) != null) {
            c9674b2 = objPutIfAbsent;
        }
        C9674b2 c9674b22 = (C9674b2) c9674b2;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9788z0((InterfaceC2560n) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = c9674b22.f32906a;
        Object obj = concurrentHashMap2.get(arrayList);
        if (obj == null) {
            try {
                C4712s.a aVar = C4712s.f13928r;
                objM18798b = C4712s.m18798b((InterfaceC8647b) this.f33075a.invoke(interfaceC2549c, list));
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            C4712s c4712sM18797a = C4712s.m18797a(objM18798b);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, c4712sM18797a);
            obj = objPutIfAbsent2 == null ? c4712sM18797a : objPutIfAbsent2;
        }
        obj.getClass();
        return ((C4712s) obj).m18806j();
    }
}
