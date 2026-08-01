package p244;

import com.alibaba.fastjson2.C3762;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8860 extends C3762 {
    @Override // com.alibaba.fastjson2.C3762
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6942(Object obj, Object obj2) {
        C8864 c8864 = (C8864) obj;
        c8864.getClass();
        ArrayDeque arrayDeque = C8864.f22529;
        synchronized (arrayDeque) {
            arrayDeque.offer(c8864);
        }
    }
}
