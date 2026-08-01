package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import p291.AbstractC8494;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2692 extends AbstractC2762 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final BiConsumer f8163;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC2788 f8164;

    public C2692(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8163 = biConsumer;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m5493(final Map map, Collection collection, final String str, final PropertyNamingStrategy propertyNamingStrategy, final InterfaceC2788 interfaceC2788, final BiConsumer biConsumer) {
        collection.forEach(new Consumer() { // from class: com.alibaba.fastjson2.reader.飘花落叶言子世苏楪兰哲
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Object objMo13995;
                boolean z = obj instanceof Map;
                String str2 = str;
                if (z) {
                    objMo13995 = ((Map) obj).get(str2);
                } else {
                    if (obj == null) {
                        C0276.m850(AbstractC0053.m157("key not found ", str2));
                        return;
                    }
                    Class<?> cls = obj.getClass();
                    InterfaceC8523 interfaceC8523M14106 = AbstractC2933.f9294.m14106(cls, AbstractC2867.m5944(cls), JSONWriter$Feature.FieldBased.isEnabled(0L));
                    interfaceC8523M14106.getClass();
                    long jM5774 = AbstractC2860.m5774(str2);
                    AbstractC8494 abstractC8494Mo14091 = interfaceC8523M14106.mo14091(jM5774);
                    if (abstractC8494Mo14091 == null) {
                        long jM5773 = AbstractC2860.m5773(str2);
                        if (jM5773 != jM5774) {
                            abstractC8494Mo14091 = interfaceC8523M14106.mo14091(jM5773);
                        }
                    }
                    objMo13995 = abstractC8494Mo14091 == null ? null : abstractC8494Mo14091.mo13995(obj);
                }
                PropertyNamingStrategy propertyNamingStrategy2 = propertyNamingStrategy;
                if (propertyNamingStrategy2 != null && (objMo13995 instanceof String)) {
                    objMo13995 = propertyNamingStrategy2.fieldName((String) objMo13995);
                }
                InterfaceC2788 interfaceC27882 = interfaceC2788;
                if (!interfaceC27882.mo5498().isInstance(obj)) {
                    if (!z) {
                        C0276.m841(InterfaceC2916.m6372(obj, JSONWriter$Feature.ReferenceDetection), "can not accept ");
                        return;
                    }
                    obj = interfaceC27882.m5619((Map) obj, new JSONReader$Feature[0]);
                }
                Object objPutIfAbsent = map.putIfAbsent(objMo13995, obj);
                boolean z2 = objPutIfAbsent != null;
                BiConsumer biConsumer2 = biConsumer;
                if (z2 && (biConsumer2 != null)) {
                    biConsumer2.accept(objPutIfAbsent, obj);
                }
            }
        });
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5471(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(obj2);
        }
        if (obj2 != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8422) == 0) {
            Class cls = Character.TYPE;
            Class cls2 = this.f8429;
            if (cls2 == cls && (obj2 instanceof String)) {
                String str = (String) obj2;
                obj2 = str.length() > 0 ? Character.valueOf(str.charAt(0)) : (char) 0;
            }
            if (obj2 != null && !cls2.isInstance(obj2)) {
                obj2 = AbstractC2867.m5925(obj2, this.f8423);
            }
            BiConsumer biConsumer = this.f8163;
            try {
                if (biConsumer != null) {
                    biConsumer.accept(obj, obj2);
                    return;
                }
                Method method = this.f8427;
                if (method != null) {
                    method.invoke(obj, obj2);
                } else {
                    AbstractC2854.f8921.putObject(obj, this.f8425, obj2);
                }
            } catch (Exception e) {
                throw new JSONException(AbstractC0053.m151(new StringBuilder("set "), biConsumer != null ? toString() : this.f8428, " error"), e);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo5484(AbstractC2899 abstractC2899, Object obj) {
        Field field;
        if (this.f8164 == null) {
            this.f8164 = mo5495(abstractC2899);
        }
        if ((this.f8164 instanceof C2772) && (field = this.f8424) != null) {
            AbstractC2762 abstractC2762M5620 = this.f8164.m5620(abstractC2899.mo6104());
            if (abstractC2762M5620 != null) {
                try {
                    Object objMo5499 = field.get(obj);
                    if (objMo5499 == null) {
                        objMo5499 = this.f8164.mo5499(this.f8422);
                        mo5471(obj, objMo5499);
                    }
                    abstractC2762M5620.mo5472(abstractC2899, objMo5499);
                    return;
                } catch (Exception e) {
                    C0276.m843("read unwrapped field error", e);
                    return;
                }
            }
        }
        abstractC2899.mo6233();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5472(com.alibaba.fastjson2.AbstractC2899 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2692.mo5472(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.Object):void");
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo5481(AbstractC2899 abstractC2899, Object obj) {
        boolean z = this.f8412;
        Class cls = this.f8429;
        if (!z && abstractC2899.mo6183() != -110) {
            long j = abstractC2899.f9201.f9320;
            if ((JSONReader$Feature.IgnoreNoneSerializable.mask & j) != 0) {
                abstractC2899.mo6233();
                return;
            } else if ((j & JSONReader$Feature.ErrorOnNoneSerializable.mask) != 0 && (cls != Object.class || abstractC2899.mo6177() || abstractC2899.mo6183() == -110)) {
                C0276.m850("not support none-Serializable");
                return;
            }
        }
        if (this.f8164 == null) {
            this.f8164 = abstractC2899.f9201.m6411(this.f8423);
        }
        if (abstractC2899.mo6180()) {
            String strMo6189 = abstractC2899.mo6189();
            if ("..".equals(strMo6189)) {
                mo5471(obj, obj);
                return;
            } else {
                m5572(abstractC2899, obj, strMo6189);
                return;
            }
        }
        Object objMo5467 = this.f8164.mo5467(abstractC2899, this.f8423, this.f8428, this.f8422);
        if (objMo5467 == null && (abstractC2899.m6157(this.f8422) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0 && cls.isPrimitive()) {
            C0276.m850(abstractC2899.mo6170("primitive value not support input null"));
        } else {
            mo5471(obj, objMo5467);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo5473(AbstractC2899 abstractC2899) {
        if (this.f8164 == null) {
            this.f8164 = mo5495(abstractC2899);
        }
        boolean z = abstractC2899.f9199;
        InterfaceC2788 interfaceC2788 = this.f8164;
        Type type = this.f8423;
        Object objMo5467 = z ? interfaceC2788.mo5467(abstractC2899, type, this.f8428, this.f8422) : interfaceC2788.mo5463(abstractC2899, type, this.f8428, this.f8422);
        Function functionMo5503 = this.f8164.mo5503();
        return functionMo5503 != null ? functionMo5503.apply(objMo5467) : objMo5467;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2788 mo5494() {
        return this.f8164;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final BiConsumer mo5474() {
        return this.f8163;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2788 mo5495(AbstractC2899 abstractC2899) {
        InterfaceC2788 interfaceC2788 = this.f8164;
        if (interfaceC2788 != null) {
            return interfaceC2788;
        }
        if (this.f8421 != null) {
            return this.f8421;
        }
        InterfaceC2788 interfaceC2788M5571 = AbstractC2762.m5571(this.f8423, this.f8429, this.f8426, this.f8414);
        if (interfaceC2788M5571 != null) {
            this.f8421 = interfaceC2788M5571;
            return interfaceC2788M5571;
        }
        Class cls = this.f8429;
        if (cls != null && Map.class.isAssignableFrom(cls)) {
            InterfaceC2788 interfaceC2788M5508 = C2714.m5508(this.f8423, this.f8429, this.f8422);
            this.f8421 = interfaceC2788M5508;
            return interfaceC2788M5508;
        }
        Class cls2 = this.f8429;
        if (cls2 == null || !Collection.class.isAssignableFrom(cls2)) {
            InterfaceC2788 interfaceC2788M6102 = abstractC2899.m6102(this.f8423);
            this.f8421 = interfaceC2788M6102;
            return interfaceC2788M6102;
        }
        InterfaceC2788 interfaceC2788M5500 = C2698.m5500(this.f8429, this.f8423);
        this.f8421 = interfaceC2788M5500;
        return interfaceC2788M5500;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC2788 mo5496(C2943 c2943) {
        if (this.f8421 != null) {
            return this.f8421;
        }
        InterfaceC2788 interfaceC2788M5571 = AbstractC2762.m5571(this.f8423, this.f8429, this.f8426, this.f8414);
        if (interfaceC2788M5571 != null) {
            this.f8421 = interfaceC2788M5571;
            return interfaceC2788M5571;
        }
        if (Map.class.isAssignableFrom(this.f8429)) {
            InterfaceC2788 interfaceC2788M5508 = C2714.m5508(this.f8423, this.f8429, this.f8422);
            this.f8421 = interfaceC2788M5508;
            return interfaceC2788M5508;
        }
        boolean zIsAssignableFrom = Collection.class.isAssignableFrom(this.f8429);
        Type type = this.f8423;
        if (zIsAssignableFrom) {
            InterfaceC2788 interfaceC2788M5500 = C2698.m5500(this.f8429, type);
            this.f8421 = interfaceC2788M5500;
            return interfaceC2788M5500;
        }
        InterfaceC2788 interfaceC2788M6411 = c2943.m6411(type);
        this.f8421 = interfaceC2788M6411;
        return interfaceC2788M6411;
    }
}
