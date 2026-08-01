package p228;

import com.alibaba.fastjson2.C2929;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8031 extends C2929 {
    @Override // com.alibaba.fastjson2.C2929
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6382(Object obj, Object obj2) {
        C8035 c8035 = (C8035) obj;
        c8035.getClass();
        ArrayDeque arrayDeque = C8035.f22184;
        synchronized (arrayDeque) {
            arrayDeque.offer(c8035);
        }
    }
}
