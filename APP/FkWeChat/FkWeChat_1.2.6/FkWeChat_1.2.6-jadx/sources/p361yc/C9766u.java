package p361yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2560n;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p185m8.AbstractC5116y;
import p300uc.InterfaceC8647b;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: yc.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9766u implements InterfaceC9679c2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p f33046a;

    /* JADX INFO: renamed from: b */
    public final C9771v f33047b;

    /* JADX INFO: renamed from: yc.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0173a {
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return new C9674b2();
        }
    }

    public C9766u(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        this.f33046a = interfaceC0188p;
        this.f33047b = new C9771v();
    }

    @Override // p361yc.InterfaceC9679c2
    /* JADX INFO: renamed from: a */
    public Object mo37831a(InterfaceC2549c interfaceC2549c, List list) {
        Object objM18798b;
        interfaceC2549c.getClass();
        list.getClass();
        Object obj = this.f33047b.get(AbstractC9886a.m38367b(interfaceC2549c));
        obj.getClass();
        C9738o1 c9738o1 = (C9738o1) obj;
        Object objM37990a = c9738o1.f33007a.get();
        if (objM37990a == null) {
            objM37990a = c9738o1.m37990a(new a());
        }
        C9674b2 c9674b2 = (C9674b2) objM37990a;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9788z0((InterfaceC2560n) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c9674b2.f32906a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                C4712s.a aVar = C4712s.f13928r;
                objM18798b = C4712s.m18798b((InterfaceC8647b) this.f33046a.invoke(interfaceC2549c, list));
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            C4712s c4712sM18797a = C4712s.m18797a(objM18798b);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, c4712sM18797a);
            obj2 = objPutIfAbsent == null ? c4712sM18797a : objPutIfAbsent;
        }
        obj2.getClass();
        return ((C4712s) obj2).m18806j();
    }
}
