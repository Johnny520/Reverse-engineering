package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.compose.foundation.text.C1804;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3633 extends C3605 {
    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo6059(long j) {
        Supplier supplier = this.f8794;
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        long j2;
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object obj3;
        String strMo6660;
        long j3;
        int i;
        String str;
        boolean z = abstractC3732.f9544;
        C3776 c3776 = abstractC3732.f9546;
        if (z) {
            return mo6027(abstractC3732, type, obj, j);
        }
        boolean z2 = this.f8813;
        Class cls = this.f8795;
        if (!z2) {
            abstractC3732.m6716(cls);
        }
        if (abstractC3732.mo6693()) {
            abstractC3732.mo6705();
            return null;
        }
        int i2 = 0;
        if (!abstractC3732.mo6739()) {
            C1804 c1804Mo6734 = abstractC3732.mo6734();
            long j4 = this.f8792 | j;
            String str2 = null;
            long jM6717 = abstractC3732.m6717(j4);
            long j5 = 0;
            if (abstractC3732.mo6729()) {
                return (JSONReader$Feature.SupportArrayToBean.mask & jM6717) != 0 ? mo6097(abstractC3732, type, obj, j) : m6145(abstractC3732, type, obj, jM6717);
            }
            if (!abstractC3732.mo6708()) {
                char c = abstractC3732.f9538;
                if (c == 't' || c == 'f') {
                    abstractC3732.mo6668();
                    return null;
                }
                if (c != '\"' && c != '\'' && c != '}') {
                    C1123.m1410(abstractC3732.mo6730(null));
                    return null;
                }
            }
            Object objApply = null;
            LinkedHashMap linkedHashMap2 = null;
            while (!abstractC3732.mo6712()) {
                long jMo6689 = abstractC3732.mo6689();
                c3776.getClass();
                String str3 = str2;
                long j6 = this.f8803;
                Class cls2 = this.f8798;
                if (jMo6689 == j6 || !(cls2 == null || cls2 == Void.class)) {
                    j2 = j5;
                    long j7 = c3776.f9665 | j4;
                    obj2 = objApply;
                    linkedHashMap = linkedHashMap2;
                    if ((JSONReader$Feature.SupportAutoType.mask & j7) != j2) {
                        long jMo6799 = abstractC3732.mo6799();
                        if (jMo6799 == -1 && abstractC3732.mo6738()) {
                            Number numberMo6752 = abstractC3732.mo6752();
                            String string = numberMo6752.toString();
                            obj3 = numberMo6752;
                            strMo6660 = string;
                            jMo6799 = AbstractC3693.m6334(string);
                        } else {
                            obj3 = str3;
                            strMo6660 = obj3;
                        }
                        InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, jMo6799);
                        long j8 = InterfaceC3621.f8931;
                        String strMo66602 = (interfaceC3621Mo6146 == null || jMo6689 == j8) ? str3 : abstractC3732.mo6660();
                        if (interfaceC3621Mo6146 == null) {
                            strMo66602 = abstractC3732.mo6660();
                            j3 = j4;
                            i = i2;
                            interfaceC3621Mo6146 = ((C3635) c3776.f9663).m6189(strMo66602, cls, c3776.f9665 | j7);
                            if (interfaceC3621Mo6146 == null && cls2 != null) {
                                interfaceC3621Mo6146 = c3776.m6971(cls2);
                            }
                            if (interfaceC3621Mo6146 == null) {
                                C1123.m1410(abstractC3732.mo6730("No suitable ObjectReader found for" + strMo66602));
                                return str3;
                            }
                        } else {
                            j3 = j4;
                            i = i2;
                        }
                        if (interfaceC3621Mo6146 != this) {
                            AbstractC3595 abstractC3595Mo6025 = interfaceC3621Mo6146.mo6025(jMo6689);
                            if (abstractC3595Mo6025 == null && jMo6689 != j8) {
                                abstractC3595Mo6025 = interfaceC3621Mo6146.m6180(this.f8811);
                            }
                            AbstractC3595 abstractC3595 = abstractC3595Mo6025;
                            if (abstractC3595 == null || strMo66602 != null) {
                                str = strMo66602;
                            } else {
                                if (strMo6660 == null) {
                                    strMo6660 = abstractC3732.mo6660();
                                }
                                str = strMo6660;
                            }
                            if (i != 0 || abstractC3595 != null) {
                                abstractC3732.mo6796(c1804Mo6734);
                            }
                            Object objMo6023 = interfaceC3621Mo6146.mo6023(abstractC3732, type, obj, j3);
                            if (abstractC3595 != null) {
                                if (obj3 != null) {
                                    abstractC3595.mo6031(objMo6023, obj3);
                                    return objMo6023;
                                }
                                abstractC3595.mo6031(objMo6023, str);
                            }
                            return objMo6023;
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
                AbstractC3595 abstractC3595Mo60252 = mo6025(jMo6689);
                if (abstractC3595Mo60252 == null && abstractC3732.m6731(j4)) {
                    abstractC3595Mo60252 = mo6024(abstractC3732.mo6666());
                }
                Object objMo6059 = obj2 == null ? mo6059(c3776.f9665 | j) : obj2;
                if (abstractC3595Mo60252 == null) {
                    m6141(abstractC3732, objMo6059);
                } else if (objMo6059 == null) {
                    Object objMo6033 = abstractC3595Mo60252.mo6033(abstractC3732);
                    LinkedHashMap linkedHashMap3 = linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
                    linkedHashMap3.put(Long.valueOf(jMo6689), objMo6033);
                    objApply = objMo6059;
                    j3 = j4;
                    linkedHashMap2 = linkedHashMap3;
                    i = i2;
                    i2 = i + 1;
                    str2 = str3;
                    j5 = j2;
                    j4 = j3;
                } else {
                    abstractC3595Mo60252.mo6032(abstractC3732, objMo6059);
                }
                objApply = objMo6059;
                j3 = j4;
                linkedHashMap2 = linkedHashMap;
                i = i2;
                i2 = i + 1;
                str2 = str3;
                j5 = j2;
                j4 = j3;
            }
            if (objApply == null) {
                objApply = mo6059(c3776.f9665 | j);
            }
            if (linkedHashMap2 != null) {
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    mo6025(((Long) entry.getKey()).longValue()).mo6031(objApply, entry.getValue());
                }
            }
            abstractC3732.mo6705();
            Function function = this.f8793;
            if (function != null) {
                objApply = function.apply(objApply);
            }
            JSONSchema jSONSchema = this.f8810;
            if (jSONSchema != null) {
                jSONSchema.m6216(objApply);
            }
            return objApply;
        }
        long jMo6804 = abstractC3732.mo6804();
        while (true) {
            Class[] clsArr = this.f8800;
            if (i2 >= clsArr.length) {
                C1123.m1410(abstractC3732.mo6730("not support input " + abstractC3732.mo6660()));
                return null;
            }
            Class cls3 = clsArr[i2];
            if (Enum.class.isAssignableFrom(cls3)) {
                InterfaceC3621 interfaceC3621M6662 = abstractC3732.m6662(cls3);
                Enum enumM6095 = interfaceC3621M6662 instanceof C3570 ? ((C3570) interfaceC3621M6662).m6095(jMo6804) : null;
                if (enumM6095 != null) {
                    return enumM6095;
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        boolean zMo6693 = abstractC3732.mo6693();
        C3776 c3776 = abstractC3732.f9546;
        if (zMo6693) {
            return null;
        }
        long j2 = this.f8792 | j;
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(this.f8809, j2, this.f8795);
        Class cls = this.f8795;
        if (interfaceC3621Mo6724 != null && interfaceC3621Mo6724.mo6058() != cls) {
            return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
        }
        if (!this.f8813) {
            abstractC3732.m6716(cls);
        }
        if (abstractC3732.mo6729()) {
            if (abstractC3732.m6736()) {
                return mo6022(abstractC3732, type, obj, j);
            }
            C1123.m1410(abstractC3732.mo6730("expect object, but " + InterfaceC3745.m6917(abstractC3732.mo6743())));
            return null;
        }
        C1804 c1804Mo6734 = abstractC3732.mo6734();
        abstractC3732.mo6708();
        int i = 0;
        Object objMo6059 = null;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == this.f8803) {
                InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, abstractC3732.mo6804());
                if (interfaceC3621Mo6146 == null) {
                    String strMo6660 = abstractC3732.mo6660();
                    InterfaceC3621 interfaceC3621M6970 = c3776.m6970(null, strMo6660);
                    if (interfaceC3621M6970 == null) {
                        C1123.m1410(abstractC3732.mo6730("autoType not support : " + strMo6660));
                        return null;
                    }
                    interfaceC3621Mo6146 = interfaceC3621M6970;
                }
                if (interfaceC3621Mo6146 != this) {
                    if (i != 0) {
                        abstractC3732.mo6796(c1804Mo6734);
                    }
                    abstractC3732.f9525 = true;
                    return interfaceC3621Mo6146.mo6027(abstractC3732, type, obj, j);
                }
            } else if (jMo6689 != 0) {
                AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                if (abstractC3595Mo6025 == null && abstractC3732.m6731(j2)) {
                    abstractC3595Mo6025 = mo6024(abstractC3732.mo6666());
                }
                if (abstractC3595Mo6025 == null) {
                    m6141(abstractC3732, objMo6059);
                } else {
                    if (objMo6059 == null) {
                        objMo6059 = mo6059(c3776.f9665 | j);
                    }
                    abstractC3595Mo6025.mo6032(abstractC3732, objMo6059);
                }
            }
            i++;
        }
        if (objMo6059 == null) {
            objMo6059 = mo6059(c3776.f9665 | j);
        }
        JSONSchema jSONSchema = this.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objMo6059);
        }
        return objMo6059;
    }
}
