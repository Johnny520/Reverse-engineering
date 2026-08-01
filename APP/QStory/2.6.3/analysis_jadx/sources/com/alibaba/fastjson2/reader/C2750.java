package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Method;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2750 extends AbstractC2762 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Object f8399;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f8400 = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2750(String str, int i, Double d, JSONSchema jSONSchema, Method method, ObjDoubleConsumer objDoubleConsumer) {
        Class cls = Double.TYPE;
        super(str, cls, cls, i, 0L, null, null, d, jSONSchema, method, null);
        this.f8399 = objDoubleConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        int i = this.f8400;
        Object obj3 = this.f8399;
        JSONSchema jSONSchema = this.f8413;
        switch (i) {
            case 0:
                double dM5917 = AbstractC2867.m5917(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5644(dM5917);
                }
                ((ObjDoubleConsumer) obj3).accept(obj, dM5917);
                break;
            case 1:
                int iM5909 = AbstractC2867.m5909(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5643(iM5909);
                }
                ((ObjIntConsumer) obj3).accept(obj, iM5909);
                break;
            default:
                long jM5905 = AbstractC2867.m5905(obj2);
                if (jSONSchema != null) {
                    jSONSchema.m5643(jM5905);
                }
                ((ObjLongConsumer) obj3).accept(obj, jM5905);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        int i = this.f8400;
        Object obj2 = this.f8399;
        JSONSchema jSONSchema = this.f8413;
        switch (i) {
            case 0:
                double dMo6127 = abstractC2899.mo6127();
                if (jSONSchema != null) {
                    jSONSchema.m5644(dMo6127);
                }
                ((ObjDoubleConsumer) obj2).accept(obj, dMo6127);
                break;
            case 1:
                int iMo6212 = abstractC2899.mo6212();
                if (jSONSchema != null) {
                    jSONSchema.m5643(iMo6212);
                }
                ((ObjIntConsumer) obj2).accept(obj, iMo6212);
                break;
            default:
                long jMo6209 = abstractC2899.mo6209();
                if (jSONSchema != null) {
                    jSONSchema.m5643(jMo6209);
                }
                ((ObjLongConsumer) obj2).accept(obj, jMo6209);
                break;
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        switch (this.f8400) {
            case 0:
                return Double.valueOf(abstractC2899.mo6127());
            case 1:
                return Integer.valueOf(abstractC2899.mo6212());
            default:
                return Long.valueOf(abstractC2899.mo6209());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2750(String str, int i, Integer num, JSONSchema jSONSchema, Method method, ObjIntConsumer objIntConsumer) {
        Class cls = Integer.TYPE;
        super(str, cls, cls, i, 0L, null, null, num, jSONSchema, method, null);
        this.f8399 = objIntConsumer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2750(String str, int i, Long l, JSONSchema jSONSchema, Method method, ObjLongConsumer objLongConsumer) {
        Class cls = Long.TYPE;
        super(str, cls, cls, i, 0L, null, null, l, jSONSchema, method, null);
        this.f8399 = objLongConsumer;
    }
}
