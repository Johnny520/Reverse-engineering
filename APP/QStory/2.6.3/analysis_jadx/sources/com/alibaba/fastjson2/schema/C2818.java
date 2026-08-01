package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.reader.C2772;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2818 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final JSONSchema.Type[] f8777;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Boolean f8778;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema f8779;

    public C2818(JSONSchema jSONSchema, JSONSchema.Type[] typeArr, Boolean bool) {
        this.f8779 = jSONSchema;
        this.f8777 = typeArr;
        this.f8778 = bool;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        Boolean bool;
        C0748 c0748 = JSONSchema.f8694;
        JSONSchema jSONSchema = this.f8779;
        if (jSONSchema == null || !jSONSchema.mo5648(obj).f2156) {
            JSONSchema.Type[] typeArr = this.f8777;
            if (typeArr == null) {
                bool = this.f8778;
                if (bool != null) {
                }
                return JSONSchema.f8683;
            }
            for (JSONSchema.Type type : typeArr) {
                switch (AbstractC2817.f8776[type.ordinal()]) {
                    case 1:
                        if (obj instanceof String) {
                            return c0748;
                        }
                        continue;
                        break;
                        break;
                    case 2:
                        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
                            return c0748;
                        }
                        continue;
                        break;
                    case 3:
                        if (obj instanceof Number) {
                            return c0748;
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
                            return c0748;
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                        }
                        break;
                    case 6:
                        if (obj instanceof Map) {
                            return c0748;
                        }
                        if (obj == null || !(JSONSchema.f8684.m6411(obj.getClass()) instanceof C2772)) {
                        }
                        break;
                        break;
                    case 7:
                        if (obj instanceof Boolean) {
                            return c0748;
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
            bool = this.f8778;
            if (bool != null || !bool.booleanValue()) {
                return JSONSchema.f8683;
            }
        }
        return c0748;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.AllOf;
    }
}
