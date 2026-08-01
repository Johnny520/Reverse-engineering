package ad;

import java.util.Map;
import p010a9.InterfaceC0173a;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: ad.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0288t {

    /* JADX INFO: renamed from: a */
    public final Map f697a = AbstractC0286s.m843a(16);

    /* JADX INFO: renamed from: ad.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
    }

    /* JADX INFO: renamed from: a */
    public final Object m844a(InterfaceC9218f interfaceC9218f, a aVar) {
        interfaceC9218f.getClass();
        aVar.getClass();
        Map map = (Map) this.f697a.get(interfaceC9218f);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public final Object m845b(InterfaceC9218f interfaceC9218f, a aVar, InterfaceC0173a interfaceC0173a) {
        interfaceC9218f.getClass();
        aVar.getClass();
        interfaceC0173a.getClass();
        Object objM844a = m844a(interfaceC9218f, aVar);
        if (objM844a != null) {
            return objM844a;
        }
        Object objInvoke = interfaceC0173a.invoke();
        m846c(interfaceC9218f, aVar, objInvoke);
        return objInvoke;
    }

    /* JADX INFO: renamed from: c */
    public final void m846c(InterfaceC9218f interfaceC9218f, a aVar, Object obj) {
        interfaceC9218f.getClass();
        aVar.getClass();
        obj.getClass();
        Map map = this.f697a;
        Object objM843a = map.get(interfaceC9218f);
        if (objM843a == null) {
            objM843a = AbstractC0286s.m843a(2);
            map.put(interfaceC9218f, objM843a);
        }
        ((Map) objM843a).put(aVar, obj);
    }
}
