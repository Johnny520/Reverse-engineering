package p361yc;

import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0184l;
import p098g9.InterfaceC2549c;
import p300uc.InterfaceC8647b;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: yc.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9783y implements InterfaceC9774v2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f33068a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f33069b;

    public C9783y(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        this.f33068a = interfaceC0184l;
        this.f33069b = new ConcurrentHashMap();
    }

    @Override // p361yc.InterfaceC9774v2
    /* JADX INFO: renamed from: a */
    public InterfaceC8647b mo38053a(InterfaceC2549c interfaceC2549c) {
        Object objPutIfAbsent;
        interfaceC2549c.getClass();
        ConcurrentHashMap concurrentHashMap = this.f33069b;
        Class clsM38367b = AbstractC9886a.m38367b(interfaceC2549c);
        Object c9726m = concurrentHashMap.get(clsM38367b);
        if (c9726m == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM38367b, (c9726m = new C9726m((InterfaceC8647b) this.f33068a.mo27m(interfaceC2549c))))) != null) {
            c9726m = objPutIfAbsent;
        }
        return ((C9726m) c9726m).f32992a;
    }
}
