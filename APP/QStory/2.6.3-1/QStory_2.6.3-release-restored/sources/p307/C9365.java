package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9365 extends AbstractC9247 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final Function f24120;

    public C9365(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.f24120 = function;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14559() {
        return this.f24120;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return this.f24120.apply(obj);
    }

    @Override // p307.AbstractC9247, p307.C9250, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        OffsetDateTime offsetDateTime = (OffsetDateTime) this.f24120.apply(obj);
        if (offsetDateTime == null) {
            if (((this.f23956 | abstractC3730.f9523.f9498) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                return false;
            }
            m14637(abstractC3730);
            abstractC3730.mo6527();
            return true;
        }
        m14637(abstractC3730);
        if (this.f23669 == null) {
            this.f23669 = mo14553(abstractC3730, OffsetDateTime.class);
        }
        if (this.f23669 != C9290.f23769) {
            this.f23669.mo6239(abstractC3730, offsetDateTime, this.f23963, this.f23668, this.f23956);
            return true;
        }
        abstractC3730.mo6529(offsetDateTime);
        return true;
    }
}
