package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3889;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7387;
import p103.C7952;
import p103.InterfaceC7965;
import p105.InterfaceC8013;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5846 implements InterfaceC7965 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ConcurrentHashMap f14789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7387 f14790;

    public C5846(InterfaceC7387 interfaceC7387, int i) {
        switch (i) {
            case 1:
                this.f14790 = interfaceC7387;
                this.f14789 = new ConcurrentHashMap();
                break;
            default:
                this.f14790 = interfaceC7387;
                this.f14789 = new ConcurrentHashMap();
                break;
        }
    }

    @Override // p103.InterfaceC7965
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public InterfaceC8013 mo10306(InterfaceC5925 interfaceC5925) {
        Object objPutIfAbsent;
        Class clsM7316 = AbstractC3889.m7316(interfaceC5925);
        ConcurrentHashMap concurrentHashMap = this.f14789;
        Object c7952 = concurrentHashMap.get(clsM7316);
        if (c7952 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM7316, (c7952 = new C7952((InterfaceC8013) this.f14790.invoke(interfaceC5925))))) != null) {
            c7952 = objPutIfAbsent;
        }
        return ((C7952) c7952).f19405;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object m10547(Class cls) {
        cls.getClass();
        ConcurrentHashMap concurrentHashMap = this.f14789;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f14790.invoke(cls);
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, objInvoke);
        return objPutIfAbsent == null ? objInvoke : objPutIfAbsent;
    }
}
