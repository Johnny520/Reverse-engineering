package p228;

import com.alibaba.fastjson2.C2928;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8030 extends C2928 {
    @Override // com.alibaba.fastjson2.C2928
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6324(Object obj, Object obj2) {
        C8034 c8034 = (C8034) obj;
        c8034.getClass();
        ArrayDeque arrayDeque = C8034.f22187;
        synchronized (arrayDeque) {
            arrayDeque.offer(c8034);
        }
    }
}
