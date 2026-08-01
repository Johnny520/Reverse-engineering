package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Method;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2749 extends AbstractC2761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Object f8397;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8398 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2749(String str, int i, Double d, JSONSchema jSONSchema, Method method, ObjDoubleConsumer objDoubleConsumer) {
        Class cls = Double.TYPE;
        super(str, cls, cls, i, 0L, null, null, d, jSONSchema, method, null);
        this.f8397 = objDoubleConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        int i = this.f8398;
        Object obj3 = this.f8397;
        JSONSchema jSONSchema = this.f8411;
        switch (i) {
            case 0:
                double dM5872 = AbstractC2866.m5872(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5599(dM5872);
                }
                ((ObjDoubleConsumer) obj3).accept(obj, dM5872);
                break;
            case 1:
                int iM5864 = AbstractC2866.m5864(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5598(iM5864);
                }
                ((ObjIntConsumer) obj3).accept(obj, iM5864);
                break;
            default:
                long jM5860 = AbstractC2866.m5860(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5598(jM5860);
                }
                ((ObjLongConsumer) obj3).accept(obj, jM5860);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        int i = this.f8398;
        Object obj2 = this.f8397;
        JSONSchema jSONSchema = this.f8411;
        switch (i) {
            case 0:
                double dMo6081 = abstractC2898.mo6081();
                if (jSONSchema != null) {
                    jSONSchema.m5599(dMo6081);
                }
                ((ObjDoubleConsumer) obj2).accept(obj, dMo6081);
                break;
            case 1:
                int iMo6167 = abstractC2898.mo6167();
                if (jSONSchema != null) {
                    jSONSchema.m5598(iMo6167);
                }
                ((ObjIntConsumer) obj2).accept(obj, iMo6167);
                break;
            default:
                long jMo6164 = abstractC2898.mo6164();
                if (jSONSchema != null) {
                    jSONSchema.m5598(jMo6164);
                }
                ((ObjLongConsumer) obj2).accept(obj, jMo6164);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        switch (this.f8398) {
            case 0:
                return Double.valueOf(abstractC2898.mo6081());
            case 1:
                return Integer.valueOf(abstractC2898.mo6167());
            default:
                return Long.valueOf(abstractC2898.mo6164());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2749(String str, int i, Integer num, JSONSchema jSONSchema, Method method, ObjIntConsumer objIntConsumer) {
        Class cls = Integer.TYPE;
        super(str, cls, cls, i, 0L, null, null, num, jSONSchema, method, null);
        this.f8397 = objIntConsumer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2749(String str, int i, Long l, JSONSchema jSONSchema, Method method, ObjLongConsumer objLongConsumer) {
        Class cls = Long.TYPE;
        super(str, cls, cls, i, 0L, null, null, l, jSONSchema, method, null);
        this.f8397 = objLongConsumer;
    }
}
