package p291;

import com.alibaba.fastjson2.C2942;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8419 extends AbstractC8423 {
    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        try {
            return this.f23603.invoke(obj, null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C2942.m6401("invoke getter method error, ", this.f23618, e);
            return null;
        }
    }
}
