package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.C2850;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2733 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2733 f8340 = new C2733(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2850 f8342;

    public C2733(Function function) {
        super(BigDecimal.class);
        this.f8342 = new C2850(6);
        this.f8341 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        BigDecimal bigDecimalMo6111 = abstractC2899.mo6111();
        Function function = this.f8341;
        return function != null ? function.apply(bigDecimalMo6111) : bigDecimalMo6111;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        BigDecimal bigDecimalMo6111 = abstractC2899.mo6111();
        Function function = this.f8341;
        return function != null ? function.apply(bigDecimalMo6111) : bigDecimalMo6111;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        Object objApply = map.get("value");
        if (objApply == null) {
            objApply = map.get("$numberDecimal");
        }
        if (!(objApply instanceof BigDecimal)) {
            objApply = this.f8342.apply(objApply);
        }
        BigDecimal bigDecimal = (BigDecimal) objApply;
        Function function = this.f8341;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }
}
