package p142j9;

import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: j9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3690i extends AbstractC3650a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f10211a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f10212b;

    public C3690i(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        this.f10211a = interfaceC0184l;
        this.f10212b = new ConcurrentHashMap();
    }

    @Override // p142j9.AbstractC3650a
    /* JADX INFO: renamed from: a */
    public Object mo13609a(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.f10212b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objMo27m = this.f10211a.mo27m(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objMo27m);
        return objPutIfAbsent == null ? objMo27m : objPutIfAbsent;
    }
}
