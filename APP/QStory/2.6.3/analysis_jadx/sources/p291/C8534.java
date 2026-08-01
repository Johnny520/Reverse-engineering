package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8534 extends AbstractC8418 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final Function f23774;

    public C8534(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.f23774 = function;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14000() {
        return this.f23774;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return this.f23774.apply(obj);
    }

    @Override // p291.AbstractC8418, p291.C8421, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        UUID uuid = (UUID) this.f23774.apply(obj);
        if (uuid == null) {
            if (((this.f23611 | abstractC2897.f9178.f9153) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                return false;
            }
            m14078(abstractC2897);
            abstractC2897.mo5967();
            return true;
        }
        m14078(abstractC2897);
        if (this.f23324 == null) {
            this.f23324 = mo13994(abstractC2897, UUID.class);
        }
        if (this.f23324 != C8488.f23572) {
            this.f23324.mo5679(abstractC2897, uuid, this.f23618, this.f23323, this.f23611);
            return true;
        }
        abstractC2897.mo6002(uuid);
        return true;
    }
}
