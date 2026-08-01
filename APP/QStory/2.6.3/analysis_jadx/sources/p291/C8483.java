package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8483 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8483 f23554 = new C8483();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f23553 = InterfaceC2912.m6355("AtomicLong");

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.m6065();
            return;
        }
        AtomicLong atomicLong = (AtomicLong) obj;
        if (abstractC2897.m6059(atomicLong, type)) {
            abstractC2897.mo6043(-1591858996898070466L, f23553);
        }
        abstractC2897.mo5963(atomicLong.longValue());
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.m6065();
        } else {
            abstractC2897.mo5963(((Number) obj).longValue());
        }
    }
}
