package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.util.C2849;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2732 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2732 f8338 = new C2732(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2849 f8340;

    public C2732(Function function) {
        super(BigDecimal.class);
        this.f8340 = new C2849(6);
        this.f8339 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        BigDecimal bigDecimalMo6065 = abstractC2898.mo6065();
        Function function = this.f8339;
        return function != null ? function.apply(bigDecimalMo6065) : bigDecimalMo6065;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        BigDecimal bigDecimalMo6065 = abstractC2898.mo6065();
        Function function = this.f8339;
        return function != null ? function.apply(bigDecimalMo6065) : bigDecimalMo6065;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        Object objApply = map.get("value");
        if (objApply == null) {
            objApply = map.get("$numberDecimal");
        }
        if (!(objApply instanceof BigDecimal)) {
            objApply = this.f8340.apply(objApply);
        }
        BigDecimal bigDecimal = (BigDecimal) objApply;
        Function function = this.f8339;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }
}
