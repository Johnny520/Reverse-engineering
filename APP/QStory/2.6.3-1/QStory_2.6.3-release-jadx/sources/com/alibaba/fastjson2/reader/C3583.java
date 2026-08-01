package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Method;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3583 extends AbstractC3595 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Object f8744;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8745 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3583(String str, int i, Double d, JSONSchema jSONSchema, Method method, ObjDoubleConsumer objDoubleConsumer) {
        Class cls = Double.TYPE;
        super(str, cls, cls, i, 0L, null, null, d, jSONSchema, method, null);
        this.f8744 = objDoubleConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        int i = this.f8745;
        Object obj3 = this.f8744;
        JSONSchema jSONSchema = this.f8758;
        switch (i) {
            case 0:
                double dM6477 = AbstractC3700.m6477(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6204(dM6477);
                }
                ((ObjDoubleConsumer) obj3).accept(obj, dM6477);
                break;
            case 1:
                int iM6469 = AbstractC3700.m6469(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6203(iM6469);
                }
                ((ObjIntConsumer) obj3).accept(obj, iM6469);
                break;
            default:
                long jM6465 = AbstractC3700.m6465(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m6203(jM6465);
                }
                ((ObjLongConsumer) obj3).accept(obj, jM6465);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        int i = this.f8745;
        Object obj2 = this.f8744;
        JSONSchema jSONSchema = this.f8758;
        switch (i) {
            case 0:
                double dMo6687 = abstractC3732.mo6687();
                if (jSONSchema != null) {
                    jSONSchema.m6204(dMo6687);
                }
                ((ObjDoubleConsumer) obj2).accept(obj, dMo6687);
                break;
            case 1:
                int iMo6772 = abstractC3732.mo6772();
                if (jSONSchema != null) {
                    jSONSchema.m6203(iMo6772);
                }
                ((ObjIntConsumer) obj2).accept(obj, iMo6772);
                break;
            default:
                long jMo6769 = abstractC3732.mo6769();
                if (jSONSchema != null) {
                    jSONSchema.m6203(jMo6769);
                }
                ((ObjLongConsumer) obj2).accept(obj, jMo6769);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        switch (this.f8745) {
            case 0:
                return Double.valueOf(abstractC3732.mo6687());
            case 1:
                return Integer.valueOf(abstractC3732.mo6772());
            default:
                return Long.valueOf(abstractC3732.mo6769());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3583(String str, int i, Integer num, JSONSchema jSONSchema, Method method, ObjIntConsumer objIntConsumer) {
        Class cls = Integer.TYPE;
        super(str, cls, cls, i, 0L, null, null, num, jSONSchema, method, null);
        this.f8744 = objIntConsumer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3583(String str, int i, Long l, JSONSchema jSONSchema, Method method, ObjLongConsumer objLongConsumer) {
        Class cls = Long.TYPE;
        super(str, cls, cls, i, 0L, null, null, l, jSONSchema, method, null);
        this.f8744 = objLongConsumer;
    }
}
