package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2791 extends C2771 {
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5454(long j) {
        return AbstractC2866.m5883(new JSONObject(), this.f8448);
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        String str;
        long j2;
        int i;
        String strMo6055;
        if (abstractC2898.f9197) {
            return mo5422(abstractC2898, type, obj, j);
        }
        String str2 = null;
        if (abstractC2898.mo6087()) {
            abstractC2898.mo6099();
            return null;
        }
        boolean zMo6123 = abstractC2898.mo6123();
        long j3 = this.f8445;
        if (zMo6123 && abstractC2898.m6126(j3 | j)) {
            return mo5492(abstractC2898, type, obj, j);
        }
        JSONObject jSONObject = new JSONObject();
        if (!abstractC2898.mo6102()) {
            char c = abstractC2898.f9191;
            if (c == 't' || c == 'f') {
                abstractC2898.mo6062();
                return null;
            }
            if (c != '\"' && c != '\'' && c != '}') {
                C0276.m849(abstractC2898.mo6124(null));
                return null;
            }
        }
        int i2 = 0;
        while (true) {
            boolean zMo6106 = abstractC2898.mo6106();
            Class cls = this.f8448;
            if (zMo6106) {
                abstractC2898.mo6099();
                Object objM5883 = AbstractC2866.m5883(jSONObject, cls);
                Function function = this.f8446;
                if (function != null) {
                    objM5883 = function.apply(objM5883);
                }
                JSONSchema jSONSchema = this.f8463;
                if (jSONSchema != null) {
                    jSONSchema.m5611(objM5883);
                }
                return objM5883;
            }
            C2942 c2942 = abstractC2898.f9199;
            long jMo6083 = abstractC2898.mo6083();
            c2942.getClass();
            if (i2 == 0 && jMo6083 == this.f8456) {
                j2 = j3;
                long j4 = j | j2;
                long j5 = c2942.f9318 | j4;
                str = str2;
                if ((JSONReader$Feature.SupportAutoType.mask & j5) != 0) {
                    InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, abstractC2898.mo6194());
                    if (interfaceC2787Mo5541 == null) {
                        String strMo60552 = abstractC2898.mo6055();
                        i = i2;
                        InterfaceC2787 interfaceC2787M5584 = ((C2801) c2942.f9316).m5584(strMo60552, cls, c2942.f9318 | j5);
                        if (interfaceC2787M5584 == null) {
                            C0276.m849(abstractC2898.mo6124("No suitable ObjectReader found for" + strMo60552));
                            return str;
                        }
                        strMo6055 = strMo60552;
                        interfaceC2787Mo5541 = interfaceC2787M5584;
                    } else {
                        i = i2;
                        strMo6055 = str;
                    }
                    if (interfaceC2787Mo5541 != this) {
                        AbstractC2761 abstractC2761Mo5420 = interfaceC2787Mo5541.mo5420(jMo6083);
                        if (abstractC2761Mo5420 != null && strMo6055 == null) {
                            strMo6055 = abstractC2898.mo6055();
                        }
                        String str3 = strMo6055;
                        Object objMo5418 = interfaceC2787Mo5541.mo5418(abstractC2898, null, null, j4);
                        if (abstractC2761Mo5420 != null) {
                            abstractC2761Mo5420.mo5426(objMo5418, str3);
                        }
                        return objMo5418;
                    }
                }
                i2 = i + 1;
                j3 = j2;
                str2 = str;
            } else {
                str = str2;
                j2 = j3;
            }
            i = i2;
            AbstractC2761 abstractC2761Mo54202 = mo5420(jMo6083);
            if (abstractC2761Mo54202 == null && abstractC2898.m6125(j | j2)) {
                abstractC2761Mo54202 = mo5419(abstractC2898.mo6060());
            }
            if (abstractC2761Mo54202 == null) {
                jSONObject.put(abstractC2898.mo6058(), abstractC2898.mo6078());
            } else {
                jSONObject.put(abstractC2761Mo54202.f8426, abstractC2761Mo54202.mo5428(abstractC2898));
            }
            i2 = i + 1;
            j3 = j2;
            str2 = str;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6087()) {
            return null;
        }
        long j2 = this.f8445 | j;
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(this.f8462, j2, this.f8448);
        Class cls = this.f8448;
        if (interfaceC2787Mo6118 != null && interfaceC2787Mo6118.mo5453() != cls) {
            return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
        }
        if (abstractC2898.mo6123()) {
            if (abstractC2898.m6130()) {
                return mo5417(abstractC2898, type, obj, j);
            }
            C0276.m849(abstractC2898.mo6124("expect object, but " + InterfaceC2911.m6299(abstractC2898.mo6138())));
            return null;
        }
        abstractC2898.mo6102();
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == this.f8456 && i == 0) {
                long jMo6199 = abstractC2898.mo6199();
                C2942 c2942 = abstractC2898.f9199;
                InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, jMo6199);
                if (interfaceC2787Mo5541 == null) {
                    String strMo6055 = abstractC2898.mo6055();
                    InterfaceC2787 interfaceC2787M6352 = c2942.m6352(null, strMo6055);
                    if (interfaceC2787M6352 == null) {
                        C0276.m849(abstractC2898.mo6124("autoType not support : " + strMo6055));
                        return null;
                    }
                    interfaceC2787Mo5541 = interfaceC2787M6352;
                }
                if (interfaceC2787Mo5541 != this) {
                    abstractC2898.f9178 = true;
                    return interfaceC2787Mo5541.mo5422(abstractC2898, type, obj, j);
                }
            } else if (jMo6083 != 0) {
                AbstractC2761 abstractC2761Mo5420 = mo5420(jMo6083);
                if (abstractC2761Mo5420 == null && abstractC2898.m6125(j2)) {
                    abstractC2761Mo5420 = mo5419(abstractC2898.mo6060());
                }
                if (abstractC2761Mo5420 == null) {
                    jSONObject.put(abstractC2898.mo6058(), abstractC2898.mo6078());
                } else {
                    jSONObject.put(abstractC2761Mo5420.f8426, abstractC2761Mo5420.mo5428(abstractC2898));
                }
            }
            i++;
        }
        Object objM5883 = AbstractC2866.m5883(jSONObject, cls);
        JSONSchema jSONSchema = this.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objM5883);
        }
        return objM5883;
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
        for (AbstractC2761 abstractC2761 : this.f8455) {
            Object obj = jSONObject.get(abstractC2761.f8426);
            if (obj instanceof Map) {
                InterfaceC2787 interfaceC2787M5529 = abstractC2761.m5529(AbstractC2932.m6329());
                if (interfaceC2787M5529 instanceof C2771) {
                    if (jSONObject == map) {
                        jSONObject = new JSONObject(map);
                    }
                    jSONObject.put(abstractC2761.f8426, interfaceC2787M5529.mo5462((Map) obj, j));
                }
            }
        }
        return AbstractC2866.m5883(jSONObject, this.f8448);
    }
}
