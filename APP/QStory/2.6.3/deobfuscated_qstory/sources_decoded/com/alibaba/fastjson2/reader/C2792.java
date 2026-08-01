package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2792 extends C2772 {
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5499(long j) {
        return AbstractC2867.m5928(new JSONObject(), this.f8450);
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        String str;
        long j2;
        int i;
        String strMo6100;
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, j);
        }
        String str2 = null;
        if (abstractC2899.mo6133()) {
            abstractC2899.mo6145();
            return null;
        }
        boolean zMo6169 = abstractC2899.mo6169();
        long j3 = this.f8447;
        if (zMo6169 && abstractC2899.m6172(j3 | j)) {
            return mo5537(abstractC2899, type, obj, j);
        }
        JSONObject jSONObject = new JSONObject();
        if (!abstractC2899.mo6148()) {
            char c = abstractC2899.f9193;
            if (c == 't' || c == 'f') {
                abstractC2899.mo6108();
                return null;
            }
            if (c != '\"' && c != '\'' && c != '}') {
                C0276.m850(abstractC2899.mo6170(null));
                return null;
            }
        }
        int i2 = 0;
        while (true) {
            boolean zMo6152 = abstractC2899.mo6152();
            Class cls = this.f8450;
            if (zMo6152) {
                abstractC2899.mo6145();
                Object objM5928 = AbstractC2867.m5928(jSONObject, cls);
                Function function = this.f8448;
                if (function != null) {
                    objM5928 = function.apply(objM5928);
                }
                JSONSchema jSONSchema = this.f8465;
                if (jSONSchema != null) {
                    jSONSchema.m5656(objM5928);
                }
                return objM5928;
            }
            C2943 c2943 = abstractC2899.f9201;
            long jMo6129 = abstractC2899.mo6129();
            c2943.getClass();
            if (i2 == 0 && jMo6129 == this.f8458) {
                j2 = j3;
                long j4 = j | j2;
                long j5 = c2943.f9320 | j4;
                str = str2;
                if ((JSONReader$Feature.SupportAutoType.mask & j5) != 0) {
                    InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, abstractC2899.mo6239());
                    if (interfaceC2788Mo5586 == null) {
                        String strMo61002 = abstractC2899.mo6100();
                        i = i2;
                        InterfaceC2788 interfaceC2788M5629 = ((C2802) c2943.f9318).m5629(strMo61002, cls, c2943.f9320 | j5);
                        if (interfaceC2788M5629 == null) {
                            C0276.m850(abstractC2899.mo6170("No suitable ObjectReader found for" + strMo61002));
                            return str;
                        }
                        strMo6100 = strMo61002;
                        interfaceC2788Mo5586 = interfaceC2788M5629;
                    } else {
                        i = i2;
                        strMo6100 = str;
                    }
                    if (interfaceC2788Mo5586 != this) {
                        AbstractC2762 abstractC2762Mo5465 = interfaceC2788Mo5586.mo5465(jMo6129);
                        if (abstractC2762Mo5465 != null && strMo6100 == null) {
                            strMo6100 = abstractC2899.mo6100();
                        }
                        String str3 = strMo6100;
                        Object objMo5463 = interfaceC2788Mo5586.mo5463(abstractC2899, null, null, j4);
                        if (abstractC2762Mo5465 != null) {
                            abstractC2762Mo5465.mo5471(objMo5463, str3);
                        }
                        return objMo5463;
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
            AbstractC2762 abstractC2762Mo54652 = mo5465(jMo6129);
            if (abstractC2762Mo54652 == null && abstractC2899.m6171(j | j2)) {
                abstractC2762Mo54652 = mo5464(abstractC2899.mo6106());
            }
            if (abstractC2762Mo54652 == null) {
                jSONObject.put(abstractC2899.mo6104(), abstractC2899.mo6124());
            } else {
                jSONObject.put(abstractC2762Mo54652.f8428, abstractC2762Mo54652.mo5473(abstractC2899));
            }
            i2 = i + 1;
            j3 = j2;
            str2 = str;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6133()) {
            return null;
        }
        long j2 = this.f8447 | j;
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(this.f8464, j2, this.f8450);
        Class cls = this.f8450;
        if (interfaceC2788Mo6164 != null && interfaceC2788Mo6164.mo5498() != cls) {
            return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
        }
        if (abstractC2899.mo6169()) {
            if (abstractC2899.m6176()) {
                return mo5462(abstractC2899, type, obj, j);
            }
            C0276.m850(abstractC2899.mo6170("expect object, but " + InterfaceC2912.m6357(abstractC2899.mo6183())));
            return null;
        }
        abstractC2899.mo6148();
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == this.f8458 && i == 0) {
                long jMo6244 = abstractC2899.mo6244();
                C2943 c2943 = abstractC2899.f9201;
                InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, jMo6244);
                if (interfaceC2788Mo5586 == null) {
                    String strMo6100 = abstractC2899.mo6100();
                    InterfaceC2788 interfaceC2788M6410 = c2943.m6410(null, strMo6100);
                    if (interfaceC2788M6410 == null) {
                        C0276.m850(abstractC2899.mo6170("autoType not support : " + strMo6100));
                        return null;
                    }
                    interfaceC2788Mo5586 = interfaceC2788M6410;
                }
                if (interfaceC2788Mo5586 != this) {
                    abstractC2899.f9180 = true;
                    return interfaceC2788Mo5586.mo5467(abstractC2899, type, obj, j);
                }
            } else if (jMo6129 != 0) {
                AbstractC2762 abstractC2762Mo5465 = mo5465(jMo6129);
                if (abstractC2762Mo5465 == null && abstractC2899.m6171(j2)) {
                    abstractC2762Mo5465 = mo5464(abstractC2899.mo6106());
                }
                if (abstractC2762Mo5465 == null) {
                    jSONObject.put(abstractC2899.mo6104(), abstractC2899.mo6124());
                } else {
                    jSONObject.put(abstractC2762Mo5465.f8428, abstractC2762Mo5465.mo5473(abstractC2899));
                }
            }
            i++;
        }
        Object objM5928 = AbstractC2867.m5928(jSONObject, cls);
        JSONSchema jSONSchema = this.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objM5928);
        }
        return objM5928;
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
        for (AbstractC2762 abstractC2762 : this.f8457) {
            Object obj = jSONObject.get(abstractC2762.f8428);
            if (obj instanceof Map) {
                InterfaceC2788 interfaceC2788M5574 = abstractC2762.m5574(AbstractC2933.m6387());
                if (interfaceC2788M5574 instanceof C2772) {
                    if (jSONObject == map) {
                        jSONObject = new JSONObject(map);
                    }
                    jSONObject.put(abstractC2762.f8428, interfaceC2788M5574.mo5507((Map) obj, j));
                }
            }
        }
        return AbstractC2867.m5928(jSONObject, this.f8450);
    }
}
