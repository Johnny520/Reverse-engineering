package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0966;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2799 extends C2771 {
    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5454(long j) {
        Supplier supplier = this.f8447;
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        long j2;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        String strMo6055;
        long j3;
        int i;
        String str;
        boolean z = abstractC2898.f9197;
        C2942 c2942 = abstractC2898.f9199;
        if (z) {
            return mo5422(abstractC2898, type, obj, j);
        }
        boolean z2 = this.f8466;
        Class cls = this.f8448;
        if (!z2) {
            abstractC2898.m6112(cls);
        }
        if (abstractC2898.mo6087()) {
            abstractC2898.mo6099();
            return null;
        }
        int i2 = 0;
        if (!abstractC2898.mo6133()) {
            C0966 c0966Mo6128 = abstractC2898.mo6128();
            long j4 = this.f8445 | j;
            String str2 = null;
            long jM6110 = abstractC2898.m6110(j4);
            long j5 = 0;
            if (abstractC2898.mo6123()) {
                return (JSONReader$Feature.SupportArrayToBean.mask & jM6110) != 0 ? mo5492(abstractC2898, type, obj, j) : m5540(abstractC2898, type, obj, jM6110);
            }
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
            Object objApply = null;
            LinkedHashMap linkedHashMap2 = null;
            while (!abstractC2898.mo6106()) {
                long jMo6083 = abstractC2898.mo6083();
                c2942.getClass();
                String str3 = str2;
                long j6 = this.f8456;
                Class cls2 = this.f8451;
                if (jMo6083 == j6 || !(cls2 == null || cls2 == Void.class)) {
                    j2 = j5;
                    long j7 = c2942.f9318 | j4;
                    obj2 = objApply;
                    linkedHashMap = linkedHashMap2;
                    if ((JSONReader$Feature.SupportAutoType.mask & j7) != j2) {
                        long jMo6194 = abstractC2898.mo6194();
                        if (jMo6194 == -1 && abstractC2898.mo6132()) {
                            Number numberMo6147 = abstractC2898.mo6147();
                            String string = numberMo6147.toString();
                            obj3 = numberMo6147;
                            strMo6055 = string;
                            jMo6194 = AbstractC2859.m5729(string);
                        } else {
                            obj3 = str3;
                            strMo6055 = obj3;
                        }
                        InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, jMo6194);
                        long j8 = InterfaceC2787.f8584;
                        String strMo60552 = (interfaceC2787Mo5541 == null || jMo6083 == j8) ? str3 : abstractC2898.mo6055();
                        if (interfaceC2787Mo5541 == null) {
                            strMo60552 = abstractC2898.mo6055();
                            j3 = j4;
                            i = i2;
                            interfaceC2787Mo5541 = ((C2801) c2942.f9316).m5584(strMo60552, cls, c2942.f9318 | j7);
                            if (interfaceC2787Mo5541 == null && cls2 != null) {
                                interfaceC2787Mo5541 = c2942.m6353(cls2);
                            }
                            if (interfaceC2787Mo5541 == null) {
                                C0276.m849(abstractC2898.mo6124("No suitable ObjectReader found for" + strMo60552));
                                return str3;
                            }
                        } else {
                            j3 = j4;
                            i = i2;
                        }
                        if (interfaceC2787Mo5541 != this) {
                            AbstractC2761 abstractC2761Mo5420 = interfaceC2787Mo5541.mo5420(jMo6083);
                            if (abstractC2761Mo5420 == null && jMo6083 != j8) {
                                abstractC2761Mo5420 = interfaceC2787Mo5541.m5575(this.f8464);
                            }
                            AbstractC2761 abstractC2761 = abstractC2761Mo5420;
                            if (abstractC2761 == null || strMo60552 != null) {
                                str = strMo60552;
                            } else {
                                if (strMo6055 == null) {
                                    strMo6055 = abstractC2898.mo6055();
                                }
                                str = strMo6055;
                            }
                            if (i != 0 || abstractC2761 != null) {
                                abstractC2898.mo6191(c0966Mo6128);
                            }
                            Object objMo5418 = interfaceC2787Mo5541.mo5418(abstractC2898, type, obj, j3);
                            if (abstractC2761 != null) {
                                if (obj3 != null) {
                                    abstractC2761.mo5426(objMo5418, obj3);
                                    return objMo5418;
                                }
                                abstractC2761.mo5426(objMo5418, str);
                            }
                            return objMo5418;
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
                AbstractC2761 abstractC2761Mo54202 = mo5420(jMo6083);
                if (abstractC2761Mo54202 == null && abstractC2898.m6125(j4)) {
                    abstractC2761Mo54202 = mo5419(abstractC2898.mo6060());
                }
                Object objMo5454 = obj2 == null ? mo5454(c2942.f9318 | j) : obj2;
                if (abstractC2761Mo54202 == null) {
                    m5536(abstractC2898, objMo5454);
                } else if (objMo5454 == null) {
                    Object objMo5428 = abstractC2761Mo54202.mo5428(abstractC2898);
                    LinkedHashMap linkedHashMap3 = linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
                    linkedHashMap3.put(Long.valueOf(jMo6083), objMo5428);
                    objApply = objMo5454;
                    j3 = j4;
                    linkedHashMap2 = linkedHashMap3;
                    i = i2;
                    i2 = i + 1;
                    str2 = str3;
                    j5 = j2;
                    j4 = j3;
                } else {
                    abstractC2761Mo54202.mo5427(abstractC2898, objMo5454);
                }
                objApply = objMo5454;
                j3 = j4;
                linkedHashMap2 = linkedHashMap;
                i = i2;
                i2 = i + 1;
                str2 = str3;
                j5 = j2;
                j4 = j3;
            }
            if (objApply == null) {
                objApply = mo5454(c2942.f9318 | j);
            }
            if (linkedHashMap2 != null) {
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    mo5420(((Long) entry.getKey()).longValue()).mo5426(objApply, entry.getValue());
                }
            }
            abstractC2898.mo6099();
            Function function = this.f8446;
            if (function != null) {
                objApply = function.apply(objApply);
            }
            JSONSchema jSONSchema = this.f8463;
            if (jSONSchema != null) {
                jSONSchema.m5611(objApply);
            }
            return objApply;
        }
        long jMo6199 = abstractC2898.mo6199();
        while (true) {
            Class[] clsArr = this.f8453;
            if (i2 >= clsArr.length) {
                C0276.m849(abstractC2898.mo6124("not support input " + abstractC2898.mo6055()));
                return null;
            }
            Class cls3 = clsArr[i2];
            if (Enum.class.isAssignableFrom(cls3)) {
                InterfaceC2787 interfaceC2787M6056 = abstractC2898.m6056(cls3);
                Enum enumM5490 = interfaceC2787M6056 instanceof C2736 ? ((C2736) interfaceC2787M6056).m5490(jMo6199) : null;
                if (enumM5490 != null) {
                    return enumM5490;
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2771, com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        boolean zMo6087 = abstractC2898.mo6087();
        C2942 c2942 = abstractC2898.f9199;
        if (zMo6087) {
            return null;
        }
        long j2 = this.f8445 | j;
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(this.f8462, j2, this.f8448);
        Class cls = this.f8448;
        if (interfaceC2787Mo6118 != null && interfaceC2787Mo6118.mo5453() != cls) {
            return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
        }
        if (!this.f8466) {
            abstractC2898.m6112(cls);
        }
        if (abstractC2898.mo6123()) {
            if (abstractC2898.m6130()) {
                return mo5417(abstractC2898, type, obj, j);
            }
            C0276.m849(abstractC2898.mo6124("expect object, but " + InterfaceC2911.m6299(abstractC2898.mo6138())));
            return null;
        }
        C0966 c0966Mo6128 = abstractC2898.mo6128();
        abstractC2898.mo6102();
        int i = 0;
        Object objMo5454 = null;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == this.f8456) {
                InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, abstractC2898.mo6199());
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
                    if (i != 0) {
                        abstractC2898.mo6191(c0966Mo6128);
                    }
                    abstractC2898.f9178 = true;
                    return interfaceC2787Mo5541.mo5422(abstractC2898, type, obj, j);
                }
            } else if (jMo6083 != 0) {
                AbstractC2761 abstractC2761Mo5420 = mo5420(jMo6083);
                if (abstractC2761Mo5420 == null && abstractC2898.m6125(j2)) {
                    abstractC2761Mo5420 = mo5419(abstractC2898.mo6060());
                }
                if (abstractC2761Mo5420 == null) {
                    m5536(abstractC2898, objMo5454);
                } else {
                    if (objMo5454 == null) {
                        objMo5454 = mo5454(c2942.f9318 | j);
                    }
                    abstractC2761Mo5420.mo5427(abstractC2898, objMo5454);
                }
            }
            i++;
        }
        if (objMo5454 == null) {
            objMo5454 = mo5454(c2942.f9318 | j);
        }
        JSONSchema jSONSchema = this.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(objMo5454);
        }
        return objMo5454;
    }
}
