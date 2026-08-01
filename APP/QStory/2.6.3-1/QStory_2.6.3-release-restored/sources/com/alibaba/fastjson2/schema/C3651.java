package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.reader.C3605;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3651 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONSchema.Type[] f9122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Boolean f9123;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema f9124;

    public C3651(JSONSchema jSONSchema, JSONSchema.Type[] typeArr, Boolean bool) {
        this.f9124 = jSONSchema;
        this.f9122 = typeArr;
        this.f9123 = bool;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        Boolean bool;
        C1589 c1589 = JSONSchema.f9039;
        JSONSchema jSONSchema = this.f9124;
        if (jSONSchema == null || !jSONSchema.mo6208(obj).f2501) {
            JSONSchema.Type[] typeArr = this.f9122;
            if (typeArr == null) {
                bool = this.f9123;
                if (bool != null) {
                }
                return JSONSchema.f9028;
            }
            for (JSONSchema.Type type : typeArr) {
                switch (AbstractC3650.f9121[type.ordinal()]) {
                    case 1:
                        if (obj instanceof String) {
                            return c1589;
                        }
                        continue;
                        break;
                        break;
                    case 2:
                        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
                            return c1589;
                        }
                        continue;
                        break;
                    case 3:
                        if (obj instanceof Number) {
                            return c1589;
                        }
                        continue;
                        break;
                        break;
                    case 4:
                        if (obj == null) {
                        }
                        break;
                    case 5:
                        if ((obj instanceof Object[]) || (obj instanceof Collection)) {
                            return c1589;
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                        }
                        break;
                    case 6:
                        if (obj instanceof Map) {
                            return c1589;
                        }
                        if (obj == null || !(JSONSchema.f9029.m6971(obj.getClass()) instanceof C3605)) {
                        }
                        break;
                        break;
                    case 7:
                        if (obj instanceof Boolean) {
                            return c1589;
                        }
                        continue;
                        break;
                        break;
                    case 8:
                        break;
                    default:
                        break;
                }
            }
            bool = this.f9123;
            if (bool != null || !bool.booleanValue()) {
                return JSONSchema.f9028;
            }
        }
        return c1589;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.AllOf;
    }
}
