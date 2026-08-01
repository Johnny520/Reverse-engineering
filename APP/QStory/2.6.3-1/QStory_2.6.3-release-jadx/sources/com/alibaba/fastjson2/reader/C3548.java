package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3662;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p160.C8376;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3548 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f8615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8617;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Function f8618;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8619;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC3621 f8620;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC3621 f8621;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f8622;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Constructor f8623;

    public C3548(Class cls, Class cls2, Type type, Type type2, long j, Function function) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.f8617 = cls;
        this.f8616 = cls2;
        this.f8615 = type;
        this.f8614 = type2;
        this.f8613 = AbstractC3700.m6504(type2);
        this.f8619 = j;
        this.f8618 = function;
        int i = 0;
        this.f8622 = cls2 != null && "org.springframework.util.LinkedMultiValueMap".equals(cls2.getName());
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i];
            if (constructor2.getParameterCount() == 0 && !Modifier.isPublic(constructor2.getModifiers())) {
                constructor2.setAccessible(true);
                constructor = constructor2;
                break;
            }
            i++;
        }
        this.f8623 = constructor;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo6059(long j) {
        Class cls = this.f8616;
        if (cls == null || cls.isInterface()) {
            return new HashMap();
        }
        try {
            Constructor constructor = this.f8623;
            return constructor != null ? constructor.newInstance(null) : cls.newInstance();
        } catch (Exception e) {
            C1123.m1403("create map error", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0257  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        long j2;
        Class cls;
        long j3;
        AbstractC3732 abstractC37322;
        Object obj2;
        Object objMo6699;
        AbstractC3732 abstractC37323;
        Object objM6485;
        long j4;
        Object objMo6023;
        Object objPut;
        AbstractC3732 abstractC37324 = abstractC3732;
        boolean zMo6708 = abstractC37324.mo6708();
        C3776 c3776 = abstractC37324.f9546;
        Object obj3 = null;
        int i = 0;
        if (!zMo6708) {
            if (!abstractC37324.f9525) {
                if (abstractC37324.mo6711()) {
                    return null;
                }
                C1123.m1410(abstractC37324.mo6730("expect '{', but '" + abstractC37324.f9538 + "'"));
                return null;
            }
            abstractC37324.f9525 = false;
            i = 1;
        }
        long j5 = c3776.f9665 | j;
        Type type2 = this.f8615;
        Class cls2 = this.f8616;
        Map map = cls2 == HashMap.class ? new HashMap() : (cls2 == EnumMap.class && (type2 instanceof Class)) ? new EnumMap((Class) type2) : (Map) mo6059(j5);
        int i2 = i;
        while (!abstractC37324.mo6712() && !abstractC37324.mo6725()) {
            if (!abstractC37324.mo6693()) {
                if (type2 == String.class) {
                    objM6485 = abstractC37324.mo6686();
                    if (i2 == 0 && (JSONReader$Feature.SupportAutoType.mask & j5) != 0 && objM6485.equals("@type")) {
                        InterfaceC3621 interfaceC3621M6661 = abstractC37324.m6661(abstractC37324.mo6799(), j, this.f8617);
                        j4 = j;
                        if (interfaceC3621M6661 != null && (interfaceC3621M6661 instanceof C3547)) {
                            C3547 c3547 = (C3547) interfaceC3621M6661;
                            if (!map.getClass().equals(c3547.f8608)) {
                                map = (Map) c3547.mo6059(j4);
                            }
                        }
                    } else {
                        j2 = j;
                        if (objM6485 == null) {
                            objM6485 = abstractC37324.mo6744();
                            if (!abstractC37324.mo6704(':')) {
                                C1123.m1410(abstractC37324.mo6730("illegal json"));
                                return obj3;
                            }
                        }
                        abstractC37323 = abstractC37324;
                        obj3 = objM6485;
                        j3 = 0;
                    }
                } else {
                    j2 = j;
                    if (i2 == 0 && abstractC37324.m6726(JSONReader$Feature.SupportAutoType) && abstractC37324.f9538 == '\"' && (!(type2 instanceof Class) || !Enum.class.isAssignableFrom((Class) type2))) {
                        String strMo6686 = abstractC37324.mo6686();
                        if (strMo6686.equals("@type")) {
                            InterfaceC3621 interfaceC3621M66612 = abstractC37324.m6661(abstractC37324.mo6799(), j, this.f8617);
                            j4 = j;
                            if (interfaceC3621M66612 != null && (interfaceC3621M66612 instanceof C3547)) {
                                C3547 c35472 = (C3547) interfaceC3621M66612;
                                if (!map.getClass().equals(c35472.f8608)) {
                                    map = (Map) c35472.mo6059(j4);
                                }
                            }
                        } else {
                            objM6485 = AbstractC3700.m6485(strMo6686, type2);
                            abstractC37323 = abstractC3732;
                            obj3 = objM6485;
                            j3 = 0;
                        }
                    } else {
                        InterfaceC3621 interfaceC3621 = this.f8621;
                        if (interfaceC3621 != null) {
                            j3 = 0;
                            obj2 = "@type";
                            cls = Enum.class;
                            abstractC37322 = abstractC3732;
                            objMo6699 = interfaceC3621.mo6023(abstractC37322, null, null, 0L);
                        } else {
                            cls = Enum.class;
                            j3 = 0;
                            abstractC37322 = abstractC3732;
                            obj2 = "@type";
                            objMo6699 = abstractC37322.mo6699(type2);
                        }
                        if (objMo6699 == null && cls.isAssignableFrom((Class) type2)) {
                            objMo6699 = abstractC37322.mo6660();
                            abstractC37322.mo6704(':');
                        }
                        if (i2 == 0 && (JSONReader$Feature.SupportAutoType.mask & j5) != j3 && objMo6699.equals(obj2)) {
                            InterfaceC3621 interfaceC3621M66613 = abstractC3732.m6661(abstractC3732.mo6799(), j, this.f8617);
                            if (interfaceC3621M66613 != null && (interfaceC3621M66613 instanceof C3547)) {
                                C3547 c35473 = (C3547) interfaceC3621M66613;
                                if (!map.getClass().equals(c35473.f8608)) {
                                    map = (Map) c35473.mo6059(j);
                                }
                            }
                        } else {
                            abstractC37323 = abstractC37322;
                            abstractC37323.mo6704(':');
                            obj3 = objMo6699;
                        }
                    }
                }
                i2++;
                abstractC37324 = abstractC3732;
                obj3 = null;
            } else {
                if (!abstractC37324.mo6704(':')) {
                    C1123.m1410(abstractC37324.mo6730("illegal json"));
                    return obj3;
                }
                abstractC37323 = abstractC37324;
                j3 = 0;
            }
            if (this.f8620 == null) {
                this.f8620 = abstractC37323.m6662(this.f8614);
            }
            if (abstractC37323.mo6740()) {
                String strMo6749 = abstractC37323.mo6749();
                if ("..".equals(strMo6749)) {
                    objMo6023 = map;
                    if ((objMo6023 == null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j5) == j3) && (objPut = map.put(obj3, objMo6023)) != null && (JSONReader$Feature.DuplicateKeyValueAsArray.mask & j5) != j3) {
                        if (objPut instanceof Collection) {
                            ((Collection) objPut).add(objMo6023);
                            map.put(obj3, objPut);
                        } else {
                            map.put(obj3, JSONArray.m1of(objPut, objMo6023));
                        }
                    }
                } else {
                    abstractC37323.m6713(map, obj3, AbstractC3755.m6938(strMo6749));
                }
            } else if (this.f8622 && abstractC37323.mo6701()) {
                JSONArray jSONArray = new JSONArray();
                while (!abstractC37323.mo6702()) {
                    jSONArray.add(this.f8620.mo6023(abstractC3732, this.f8614, obj, 0L));
                    abstractC37323 = abstractC3732;
                }
                map.put(obj3, jSONArray);
            } else {
                objMo6023 = this.f8620.mo6023(abstractC3732, this.f8614, obj, 0L);
                if (objMo6023 == null) {
                    if (objPut instanceof Collection) {
                    }
                } else if (objPut instanceof Collection) {
                }
            }
            i2++;
            abstractC37324 = abstractC3732;
            obj3 = null;
        }
        abstractC3732.mo6705();
        Function function = this.f8618;
        return function != null ? function.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f8617;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        long j2;
        Function functionMo6063;
        InterfaceC3621 interfaceC3621Mo6724;
        Type type2;
        Object objMo6686;
        Object obj2;
        Object objMo6027;
        byte bMo6743 = abstractC3732.mo6743();
        Function function = this.f8618;
        if (bMo6743 == -110) {
            interfaceC3621Mo6724 = abstractC3732.mo6724(0L, this.f8619 | j, this.f8617);
            if (interfaceC3621Mo6724 == null || interfaceC3621Mo6724 == this) {
                j2 = j;
                functionMo6063 = function;
            } else {
                functionMo6063 = interfaceC3621Mo6724.mo6063();
                if (!(interfaceC3621Mo6724 instanceof C3547) && !(interfaceC3621Mo6724 instanceof C3548)) {
                    return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
                }
                j2 = j;
            }
        } else {
            j2 = j;
            functionMo6063 = function;
            interfaceC3621Mo6724 = null;
        }
        byte bMo67432 = abstractC3732.mo6743();
        if (bMo67432 == -81) {
            abstractC3732.mo6733();
            return null;
        }
        if (bMo67432 == -90) {
            abstractC3732.mo6733();
        }
        long j3 = j2 | abstractC3732.f9546.f9665;
        Map map = interfaceC3621Mo6724 != null ? (Map) interfaceC3621Mo6724.mo6059(j3) : this.f8616 == HashMap.class ? new HashMap() : (Map) mo6059(j2);
        while (true) {
            byte bMo67433 = abstractC3732.mo6743();
            type2 = this.f8615;
            if (bMo67433 == -91) {
                break;
            }
            if (type2 == String.class || abstractC3732.mo6739()) {
                objMo6686 = abstractC3732.mo6686();
            } else if (abstractC3732.mo6740()) {
                String strMo6749 = abstractC3732.mo6749();
                objMo6686 = new C3662();
                abstractC3732.m6713(map, objMo6686, AbstractC3755.m6938(strMo6749));
            } else {
                if (this.f8621 == null && type2 != null) {
                    this.f8621 = abstractC3732.m6662(type2);
                }
                InterfaceC3621 interfaceC3621 = this.f8621;
                objMo6686 = interfaceC3621 == null ? abstractC3732.mo6684() : interfaceC3621.mo6027(abstractC3732, null, null, j2);
            }
            Object obj3 = objMo6686;
            if (abstractC3732.mo6740()) {
                String strMo67492 = abstractC3732.mo6749();
                if ("..".equals(strMo67492)) {
                    map.put(obj3, map);
                } else {
                    abstractC3732.m6713(map, obj3, AbstractC3755.m6938(strMo67492));
                    if (!(map instanceof ConcurrentMap)) {
                        map.put(obj3, null);
                    }
                }
            } else if (abstractC3732.mo6693()) {
                map.put(obj3, null);
            } else {
                Type type3 = this.f8614;
                if (type3 == Object.class) {
                    objMo6027 = abstractC3732.mo6684();
                    obj2 = obj3;
                } else {
                    InterfaceC3621 interfaceC3621Mo67242 = abstractC3732.mo6724(0L, j, this.f8613);
                    if (interfaceC3621Mo67242 == null || interfaceC3621Mo67242 == this) {
                        obj2 = obj3;
                        if (this.f8620 == null) {
                            this.f8620 = abstractC3732.m6662(type3);
                        }
                        objMo6027 = this.f8620.mo6027(abstractC3732, this.f8614, obj2, j);
                    } else {
                        obj2 = obj3;
                        objMo6027 = interfaceC3621Mo67242.mo6027(abstractC3732, this.f8614, obj2, j);
                    }
                }
                if (objMo6027 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j3) == 0) {
                    map.put(obj2, objMo6027);
                }
            }
            j2 = j;
        }
        abstractC3732.mo6733();
        return functionMo6063 != null ? (functionMo6063 == C3547.f8604 && map.isEmpty()) ? new EnumMap((Class) type2) : functionMo6063.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        C3635 c3635M6947 = AbstractC3766.m6947();
        Class cls = this.f8616;
        Map map2 = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) mo6059(j);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.f8615;
            Object string = (type == null || type == String.class) ? key.toString() : AbstractC3700.m6485(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                Type type2 = this.f8614;
                if (type2 == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == AbstractC3700.f9396) {
                    if (this.f8620 == null) {
                        this.f8620 = c3635M6947.m6193(type2, false);
                    }
                    value = this.f8620.mo6067((Map) value, j);
                } else if ((cls2 == JSONArray.class || cls2 == AbstractC3700.f9395) && this.f8613 == List.class) {
                    if (this.f8620 == null) {
                        this.f8620 = c3635M6947.m6193(type2, false);
                    }
                    value = this.f8620.mo6029((List) value, j);
                } else {
                    Function functionM6191 = c3635M6947.m6191(cls2, type2);
                    if (functionM6191 != null) {
                        value = functionM6191.apply(value);
                    } else if (value instanceof Map) {
                        if (this.f8620 == null) {
                            this.f8620 = c3635M6947.m6193(type2, false);
                        }
                        value = this.f8620.mo6067((Map) value, j);
                    } else if ((value instanceof Collection) && !this.f8622) {
                        if (this.f8620 == null) {
                            this.f8620 = c3635M6947.m6193(type2, false);
                        }
                        value = this.f8620.mo6029((Collection) value, j);
                    } else if (!cls2.isInstance(value)) {
                        C8376.m13330("can not convert from ", cls2, " to ", type2);
                        return null;
                    }
                }
            }
            map2.put(string, value);
        }
        Function function = this.f8618;
        return function != null ? function.apply(map2) : map2;
    }
}
