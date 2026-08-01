package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3057;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6558;
import p087.C7123;
import p087.InterfaceC7136;
import p089.InterfaceC7184;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5014 implements InterfaceC7136 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f14444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6558 f14445;

    public C5014(InterfaceC6558 interfaceC6558, int i) {
        switch (i) {
            case 1:
                this.f14445 = interfaceC6558;
                this.f14444 = new ConcurrentHashMap();
                break;
            default:
                this.f14445 = interfaceC6558;
                this.f14444 = new ConcurrentHashMap();
                break;
        }
    }

    @Override // p087.InterfaceC7136
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public InterfaceC7184 mo9747(InterfaceC5093 interfaceC5093) {
        Object objPutIfAbsent;
        Class clsM6756 = AbstractC3057.m6756(interfaceC5093);
        ConcurrentHashMap concurrentHashMap = this.f14444;
        Object c7123 = concurrentHashMap.get(clsM6756);
        if (c7123 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM6756, (c7123 = new C7123((InterfaceC7184) this.f14445.invoke(interfaceC5093))))) != null) {
            c7123 = objPutIfAbsent;
        }
        return ((C7123) c7123).f19060;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m9988(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.f14444;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f14445.invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
