package kotlin.reflect.jvm.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.InterfaceC5092;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p087.C7122;
import p087.InterfaceC7135;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5013 implements InterfaceC7135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f14442;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6557 f14443;

    public C5013(InterfaceC6557 interfaceC6557, int i) {
        switch (i) {
            case 1:
                this.f14443 = interfaceC6557;
                this.f14442 = new ConcurrentHashMap();
                break;
            default:
                this.f14443 = interfaceC6557;
                this.f14442 = new ConcurrentHashMap();
                break;
        }
    }

    @Override // p087.InterfaceC7135
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public InterfaceC7183 mo9755(InterfaceC5092 interfaceC5092) {
        Object objPutIfAbsent;
        Class clsM12029 = AbstractC6560.m12029(interfaceC5092);
        ConcurrentHashMap concurrentHashMap = this.f14442;
        Object c7122 = concurrentHashMap.get(clsM12029);
        if (c7122 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM12029, (c7122 = new C7122((InterfaceC7183) this.f14443.invoke(interfaceC5092))))) != null) {
            c7122 = objPutIfAbsent;
        }
        return ((C7122) c7122).f19065;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m9991(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.f14442;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f14443.invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
