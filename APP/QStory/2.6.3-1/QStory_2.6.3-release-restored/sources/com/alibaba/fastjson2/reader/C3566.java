package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.util.C3683;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3566 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3566 f8685 = new C3566(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Function f8686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C3683 f8687;

    public C3566(Function function) {
        super(BigDecimal.class);
        this.f8687 = new C3683(6);
        this.f8686 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        BigDecimal bigDecimalMo6671 = abstractC3732.mo6671();
        Function function = this.f8686;
        return function != null ? function.apply(bigDecimalMo6671) : bigDecimalMo6671;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        BigDecimal bigDecimalMo6671 = abstractC3732.mo6671();
        Function function = this.f8686;
        return function != null ? function.apply(bigDecimalMo6671) : bigDecimalMo6671;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        Object objApply = map.get("value");
        if (objApply == null) {
            objApply = map.get("$numberDecimal");
        }
        if (!(objApply instanceof BigDecimal)) {
            objApply = this.f8687.apply(objApply);
        }
        BigDecimal bigDecimal = (BigDecimal) objApply;
        Function function = this.f8686;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }
}
