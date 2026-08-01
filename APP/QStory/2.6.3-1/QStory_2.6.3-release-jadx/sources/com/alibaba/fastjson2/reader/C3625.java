package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3625 extends C3605 {
    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo6059(long j) {
        return AbstractC3700.m6488(new JSONObject(), this.f8795);
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        String str;
        long j2;
        int i;
        String strMo6660;
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, j);
        }
        String str2 = null;
        if (abstractC3732.mo6693()) {
            abstractC3732.mo6705();
            return null;
        }
        boolean zMo6729 = abstractC3732.mo6729();
        long j3 = this.f8792;
        if (zMo6729 && abstractC3732.m6732(j3 | j)) {
            return mo6097(abstractC3732, type, obj, j);
        }
        JSONObject jSONObject = new JSONObject();
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
        int i2 = 0;
        while (true) {
            boolean zMo6712 = abstractC3732.mo6712();
            Class cls = this.f8795;
            if (zMo6712) {
                abstractC3732.mo6705();
                Object objM6488 = AbstractC3700.m6488(jSONObject, cls);
                Function function = this.f8793;
                if (function != null) {
                    objM6488 = function.apply(objM6488);
                }
                JSONSchema jSONSchema = this.f8810;
                if (jSONSchema != null) {
                    jSONSchema.m6216(objM6488);
                }
                return objM6488;
            }
            C3776 c3776 = abstractC3732.f9546;
            long jMo6689 = abstractC3732.mo6689();
            c3776.getClass();
            if (i2 == 0 && jMo6689 == this.f8803) {
                j2 = j3;
                long j4 = j | j2;
                long j5 = c3776.f9665 | j4;
                str = str2;
                if ((JSONReader$Feature.SupportAutoType.mask & j5) != 0) {
                    InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, abstractC3732.mo6799());
                    if (interfaceC3621Mo6146 == null) {
                        String strMo66602 = abstractC3732.mo6660();
                        i = i2;
                        InterfaceC3621 interfaceC3621M6189 = ((C3635) c3776.f9663).m6189(strMo66602, cls, c3776.f9665 | j5);
                        if (interfaceC3621M6189 == null) {
                            C1123.m1410(abstractC3732.mo6730("No suitable ObjectReader found for" + strMo66602));
                            return str;
                        }
                        strMo6660 = strMo66602;
                        interfaceC3621Mo6146 = interfaceC3621M6189;
                    } else {
                        i = i2;
                        strMo6660 = str;
                    }
                    if (interfaceC3621Mo6146 != this) {
                        AbstractC3595 abstractC3595Mo6025 = interfaceC3621Mo6146.mo6025(jMo6689);
                        if (abstractC3595Mo6025 != null && strMo6660 == null) {
                            strMo6660 = abstractC3732.mo6660();
                        }
                        String str3 = strMo6660;
                        Object objMo6023 = interfaceC3621Mo6146.mo6023(abstractC3732, null, null, j4);
                        if (abstractC3595Mo6025 != null) {
                            abstractC3595Mo6025.mo6031(objMo6023, str3);
                        }
                        return objMo6023;
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
            AbstractC3595 abstractC3595Mo60252 = mo6025(jMo6689);
            if (abstractC3595Mo60252 == null && abstractC3732.m6731(j | j2)) {
                abstractC3595Mo60252 = mo6024(abstractC3732.mo6666());
            }
            if (abstractC3595Mo60252 == null) {
                jSONObject.put(abstractC3732.mo6664(), abstractC3732.mo6684());
            } else {
                jSONObject.put(abstractC3595Mo60252.f8773, abstractC3595Mo60252.mo6033(abstractC3732));
            }
            i2 = i + 1;
            j3 = j2;
            str2 = str;
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6693()) {
            return null;
        }
        long j2 = this.f8792 | j;
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(this.f8809, j2, this.f8795);
        Class cls = this.f8795;
        if (interfaceC3621Mo6724 != null && interfaceC3621Mo6724.mo6058() != cls) {
            return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
        }
        if (abstractC3732.mo6729()) {
            if (abstractC3732.m6736()) {
                return mo6022(abstractC3732, type, obj, j);
            }
            C1123.m1410(abstractC3732.mo6730("expect object, but " + InterfaceC3745.m6917(abstractC3732.mo6743())));
            return null;
        }
        abstractC3732.mo6708();
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == this.f8803 && i == 0) {
                long jMo6804 = abstractC3732.mo6804();
                C3776 c3776 = abstractC3732.f9546;
                InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, jMo6804);
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
                    abstractC3732.f9525 = true;
                    return interfaceC3621Mo6146.mo6027(abstractC3732, type, obj, j);
                }
            } else if (jMo6689 != 0) {
                AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                if (abstractC3595Mo6025 == null && abstractC3732.m6731(j2)) {
                    abstractC3595Mo6025 = mo6024(abstractC3732.mo6666());
                }
                if (abstractC3595Mo6025 == null) {
                    jSONObject.put(abstractC3732.mo6664(), abstractC3732.mo6684());
                } else {
                    jSONObject.put(abstractC3595Mo6025.f8773, abstractC3595Mo6025.mo6033(abstractC3732));
                }
            }
            i++;
        }
        Object objM6488 = AbstractC3700.m6488(jSONObject, cls);
        JSONSchema jSONSchema = this.f8810;
        if (jSONSchema != null) {
            jSONSchema.m6216(objM6488);
        }
        return objM6488;
    }

    @Override // com.alibaba.fastjson2.reader.C3605, com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
        for (AbstractC3595 abstractC3595 : this.f8802) {
            Object obj = jSONObject.get(abstractC3595.f8773);
            if (obj instanceof Map) {
                InterfaceC3621 interfaceC3621M6134 = abstractC3595.m6134(AbstractC3766.m6947());
                if (interfaceC3621M6134 instanceof C3605) {
                    if (jSONObject == map) {
                        jSONObject = new JSONObject(map);
                    }
                    jSONObject.put(abstractC3595.f8773, interfaceC3621M6134.mo6067((Map) obj, j));
                }
            }
        }
        return AbstractC3700.m6488(jSONObject, this.f8795);
    }
}
