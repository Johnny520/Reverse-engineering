package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8492 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8492 f23565 = new C8492();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23564 = InterfaceC2911.m6297("AtomicInteger");

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.m6019();
            return;
        }
        AtomicInteger atomicInteger = (AtomicInteger) obj;
        if (abstractC2896.m6014(atomicInteger, type)) {
            abstractC2896.mo5998(7576651708426282938L, f23564);
        }
        abstractC2896.mo5928(atomicInteger.intValue());
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.m6019();
        } else {
            abstractC2896.mo5928(((AtomicInteger) obj).intValue());
        }
    }
}
