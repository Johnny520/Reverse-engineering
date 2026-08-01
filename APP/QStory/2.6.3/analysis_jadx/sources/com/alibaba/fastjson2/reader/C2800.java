package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0966;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2800 extends C2772 {
    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5499(long j) {
        Supplier supplier = this.f8449;
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        long j2;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        String strMo6100;
        long j3;
        int i;
        String str;
        boolean z = abstractC2899.f9199;
        C2943 c2943 = abstractC2899.f9201;
        if (z) {
            return mo5467(abstractC2899, type, obj, j);
        }
        boolean z2 = this.f8468;
        Class cls = this.f8450;
        if (!z2) {
            abstractC2899.m6156(cls);
        }
        if (abstractC2899.mo6133()) {
            abstractC2899.mo6145();
            return null;
        }
        int i2 = 0;
        if (!abstractC2899.mo6179()) {
            C0966 c0966Mo6174 = abstractC2899.mo6174();
            long j4 = this.f8447 | j;
            String str2 = null;
            long jM6157 = abstractC2899.m6157(j4);
            long j5 = 0;
            if (abstractC2899.mo6169()) {
                return (JSONReader$Feature.SupportArrayToBean.mask & jM6157) != 0 ? mo5537(abstractC2899, type, obj, j) : m5585(abstractC2899, type, obj, jM6157);
            }
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
            Object objApply = null;
            LinkedHashMap linkedHashMap2 = null;
            while (!abstractC2899.mo6152()) {
                long jMo6129 = abstractC2899.mo6129();
                c2943.getClass();
                String str3 = str2;
                long j6 = this.f8458;
                Class cls2 = this.f8453;
                if (jMo6129 == j6 || !(cls2 == null || cls2 == Void.class)) {
                    j2 = j5;
                    long j7 = c2943.f9320 | j4;
                    obj2 = objApply;
                    linkedHashMap = linkedHashMap2;
                    if ((JSONReader$Feature.SupportAutoType.mask & j7) != j2) {
                        long jMo6239 = abstractC2899.mo6239();
                        if (jMo6239 == -1 && abstractC2899.mo6178()) {
                            Number numberMo6192 = abstractC2899.mo6192();
                            String string = numberMo6192.toString();
                            obj3 = numberMo6192;
                            strMo6100 = string;
                            jMo6239 = AbstractC2860.m5774(string);
                        } else {
                            obj3 = str3;
                            strMo6100 = obj3;
                        }
                        InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, jMo6239);
                        long j8 = InterfaceC2788.f8586;
                        String strMo61002 = (interfaceC2788Mo5586 == null || jMo6129 == j8) ? str3 : abstractC2899.mo6100();
                        if (interfaceC2788Mo5586 == null) {
                            strMo61002 = abstractC2899.mo6100();
                            j3 = j4;
                            i = i2;
                            interfaceC2788Mo5586 = ((C2802) c2943.f9318).m5629(strMo61002, cls, c2943.f9320 | j7);
                            if (interfaceC2788Mo5586 == null && cls2 != null) {
                                interfaceC2788Mo5586 = c2943.m6411(cls2);
                            }
                            if (interfaceC2788Mo5586 == null) {
                                C0276.m850(abstractC2899.mo6170("No suitable ObjectReader found for" + strMo61002));
                                return str3;
                            }
                        } else {
                            j3 = j4;
                            i = i2;
                        }
                        if (interfaceC2788Mo5586 != this) {
                            AbstractC2762 abstractC2762Mo5465 = interfaceC2788Mo5586.mo5465(jMo6129);
                            if (abstractC2762Mo5465 == null && jMo6129 != j8) {
                                abstractC2762Mo5465 = interfaceC2788Mo5586.m5620(this.f8466);
                            }
                            AbstractC2762 abstractC2762 = abstractC2762Mo5465;
                            if (abstractC2762 == null || strMo61002 != null) {
                                str = strMo61002;
                            } else {
                                if (strMo6100 == null) {
                                    strMo6100 = abstractC2899.mo6100();
                                }
                                str = strMo6100;
                            }
                            if (i != 0 || abstractC2762 != null) {
                                abstractC2899.mo6236(c0966Mo6174);
                            }
                            Object objMo5463 = interfaceC2788Mo5586.mo5463(abstractC2899, type, obj, j3);
                            if (abstractC2762 != null) {
                                if (obj3 != null) {
                                    abstractC2762.mo5471(objMo5463, obj3);
                                    return objMo5463;
                                }
                                abstractC2762.mo5471(objMo5463, str);
                            }
                            return objMo5463;
                        }
                        objApply = obj2;
                        linkedHashMap2 = linkedHashMap;
                    }
                    i2 = i + 1;
                    str2 = str3;
                    j5 = j2;
                    j4 = j3;
                } else {
                    obj2 = objApply;
                    linkedHashMap = linkedHashMap2;
                    j2 = j5;
                }
                AbstractC2762 abstractC2762Mo54652 = mo5465(jMo6129);
                if (abstractC2762Mo54652 == null && abstractC2899.m6171(j4)) {
                    abstractC2762Mo54652 = mo5464(abstractC2899.mo6106());
                }
                Object objMo5499 = obj2 == null ? mo5499(c2943.f9320 | j) : obj2;
                if (abstractC2762Mo54652 == null) {
                    m5581(abstractC2899, objMo5499);
                } else if (objMo5499 == null) {
                    Object objMo5473 = abstractC2762Mo54652.mo5473(abstractC2899);
                    LinkedHashMap linkedHashMap3 = linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
                    linkedHashMap3.put(Long.valueOf(jMo6129), objMo5473);
                    objApply = objMo5499;
                    j3 = j4;
                    linkedHashMap2 = linkedHashMap3;
                    i = i2;
                    i2 = i + 1;
                    str2 = str3;
                    j5 = j2;
                    j4 = j3;
                } else {
                    abstractC2762Mo54652.mo5472(abstractC2899, objMo5499);
                }
                objApply = objMo5499;
                j3 = j4;
                linkedHashMap2 = linkedHashMap;
                i = i2;
                i2 = i + 1;
                str2 = str3;
                j5 = j2;
                j4 = j3;
            }
            if (objApply == null) {
                objApply = mo5499(c2943.f9320 | j);
            }
            if (linkedHashMap2 != null) {
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    mo5465(((Long) entry.getKey()).longValue()).mo5471(objApply, entry.getValue());
                }
            }
            abstractC2899.mo6145();
            Function function = this.f8448;
            if (function != null) {
                objApply = function.apply(objApply);
            }
            JSONSchema jSONSchema = this.f8465;
            if (jSONSchema != null) {
                jSONSchema.m5656(objApply);
            }
            return objApply;
        }
        long jMo6244 = abstractC2899.mo6244();
        while (true) {
            Class[] clsArr = this.f8455;
            if (i2 >= clsArr.length) {
                C0276.m850(abstractC2899.mo6170("not support input " + abstractC2899.mo6100()));
                return null;
            }
            Class cls3 = clsArr[i2];
            if (Enum.class.isAssignableFrom(cls3)) {
                InterfaceC2788 interfaceC2788M6102 = abstractC2899.m6102(cls3);
                Enum enumM5535 = interfaceC2788M6102 instanceof C2737 ? ((C2737) interfaceC2788M6102).m5535(jMo6244) : null;
                if (enumM5535 != null) {
                    return enumM5535;
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2772, com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean zMo6133 = abstractC2899.mo6133();
        C2943 c2943 = abstractC2899.f9201;
        if (zMo6133) {
            return null;
        }
        long j2 = this.f8447 | j;
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(this.f8464, j2, this.f8450);
        Class cls = this.f8450;
        if (interfaceC2788Mo6164 != null && interfaceC2788Mo6164.mo5498() != cls) {
            return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
        }
        if (!this.f8468) {
            abstractC2899.m6156(cls);
        }
        if (abstractC2899.mo6169()) {
            if (abstractC2899.m6176()) {
                return mo5462(abstractC2899, type, obj, j);
            }
            C0276.m850(abstractC2899.mo6170("expect object, but " + InterfaceC2912.m6357(abstractC2899.mo6183())));
            return null;
        }
        C0966 c0966Mo6174 = abstractC2899.mo6174();
        abstractC2899.mo6148();
        int i = 0;
        Object objMo5499 = null;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == this.f8458) {
                InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, abstractC2899.mo6244());
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
                    if (i != 0) {
                        abstractC2899.mo6236(c0966Mo6174);
                    }
                    abstractC2899.f9180 = true;
                    return interfaceC2788Mo5586.mo5467(abstractC2899, type, obj, j);
                }
            } else if (jMo6129 != 0) {
                AbstractC2762 abstractC2762Mo5465 = mo5465(jMo6129);
                if (abstractC2762Mo5465 == null && abstractC2899.m6171(j2)) {
                    abstractC2762Mo5465 = mo5464(abstractC2899.mo6106());
                }
                if (abstractC2762Mo5465 == null) {
                    m5581(abstractC2899, objMo5499);
                } else {
                    if (objMo5499 == null) {
                        objMo5499 = mo5499(c2943.f9320 | j);
                    }
                    abstractC2762Mo5465.mo5472(abstractC2899, objMo5499);
                }
            }
            i++;
        }
        if (objMo5499 == null) {
            objMo5499 = mo5499(c2943.f9320 | j);
        }
        JSONSchema jSONSchema = this.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(objMo5499);
        }
        return objMo5499;
    }
}
