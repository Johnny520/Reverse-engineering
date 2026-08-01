package p282t7;

import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: t7.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8190n extends AbstractC8178c {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f27486a = new ConcurrentHashMap();

    @Override // p282t7.InterfaceC8176b
    /* JADX INFO: renamed from: f */
    public Object mo31835f(C8174a c8174a, InterfaceC0173a interfaceC0173a) {
        c8174a.getClass();
        interfaceC0173a.getClass();
        Object obj = mo31842h().get(c8174a);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = interfaceC0173a.invoke();
        Object objPutIfAbsent = mo31842h().putIfAbsent(c8174a, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        objInvoke.getClass();
        return objInvoke;
    }

    @Override // p282t7.AbstractC8178c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ConcurrentHashMap mo31842h() {
        return this.f27486a;
    }
}
