package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9313 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C9313 f23901 = new C9313();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23900 = InterfaceC3745.m6915("AtomicInteger");

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.m6625();
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (abstractC3730.m6619(atomicInteger, type)) {
            abstractC3730.mo6603(7576651708426282938L, f23900);
        }
        abstractC3730.mo6533(atomicInteger.intValue());
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.m6625();
        } else {
            abstractC3730.mo6533(((AtomicInteger) obj).intValue());
        }
    }
}
