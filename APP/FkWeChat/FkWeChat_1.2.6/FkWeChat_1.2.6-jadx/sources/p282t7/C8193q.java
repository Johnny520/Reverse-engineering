package p282t7;

import java.util.HashMap;
import java.util.Map;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: t7.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8193q extends AbstractC8178c {

    /* JADX INFO: renamed from: a */
    public final Map f27495a = new HashMap();

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
        Object objPut = mo31842h().put(c8174a, objInvoke);
        if (objPut != null) {
            objInvoke = objPut;
        }
        objInvoke.getClass();
        return objInvoke;
    }

    @Override // p282t7.AbstractC8178c
    /* JADX INFO: renamed from: h */
    public Map mo31842h() {
        return this.f27495a;
    }
}
