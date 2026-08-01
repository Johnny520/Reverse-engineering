package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import p291.AbstractC8502;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2691 extends AbstractC2761 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final BiConsumer f8161;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC2787 f8162;

    public C2691(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8161 = biConsumer;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m5448(final Map map, Collection collection, final String str, final PropertyNamingStrategy propertyNamingStrategy, final InterfaceC2787 interfaceC2787, final BiConsumer biConsumer) {
        collection.forEach(new Consumer() { // from class: com.alibaba.fastjson2.reader.飘花落叶言子世苏楪兰哲
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Object objMo13976;
                boolean z = obj instanceof Map;
                String str2 = str;
                if (z) {
                    objMo13976 = ((Map) obj).get(str2);
                } else {
                    if (obj == null) {
                        C0276.m849(AbstractC0053.m152("key not found ", str2));
                        return;
                    }
                    Class<?> cls = obj.getClass();
                    InterfaceC8531 interfaceC8531M14087 = AbstractC2932.f9292.m14087(cls, AbstractC2866.m5899(cls), JSONWriter$Feature.FieldBased.isEnabled(0L));
                    interfaceC8531M14087.getClass();
                    long jM5729 = AbstractC2859.m5729(str2);
                    AbstractC8502 abstractC8502Mo14072 = interfaceC8531M14087.mo14072(jM5729);
                    if (abstractC8502Mo14072 == null) {
                        long jM5728 = AbstractC2859.m5728(str2);
                        if (jM5728 != jM5729) {
                            abstractC8502Mo14072 = interfaceC8531M14087.mo14072(jM5728);
                        }
                    }
                    objMo13976 = abstractC8502Mo14072 == null ? null : abstractC8502Mo14072.mo13976(obj);
                }
                PropertyNamingStrategy propertyNamingStrategy2 = propertyNamingStrategy;
                if (propertyNamingStrategy2 != null && (objMo13976 instanceof String)) {
                    objMo13976 = propertyNamingStrategy2.fieldName((String) objMo13976);
                }
                InterfaceC2787 interfaceC27872 = interfaceC2787;
                if (!interfaceC27872.mo5453().isInstance(obj)) {
                    if (!z) {
                        C0276.m840(InterfaceC2915.m6314(obj, JSONWriter$Feature.ReferenceDetection), "can not accept ");
                        return;
                    }
                    obj = interfaceC27872.m5574((Map) obj, new JSONReader$Feature[0]);
                }
                Object objPutIfAbsent = map.putIfAbsent(objMo13976, obj);
                boolean z2 = objPutIfAbsent != null;
                BiConsumer biConsumer2 = biConsumer;
                if (z2 && (biConsumer2 != null)) {
                    biConsumer2.accept(objPutIfAbsent, obj);
                }
            }
        });
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5426(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(obj2);
        }
        if (obj2 != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8420) == 0) {
            Class cls = Character.TYPE;
            Class cls2 = this.f8427;
            if (cls2 == cls && (obj2 instanceof String)) {
                String str = (String) obj2;
                obj2 = str.length() > 0 ? Character.valueOf(str.charAt(0)) : (char) 0;
            }
            if (obj2 != null && !cls2.isInstance(obj2)) {
                obj2 = AbstractC2866.m5880(obj2, this.f8421);
            }
            BiConsumer biConsumer = this.f8161;
            try {
                if (biConsumer != null) {
                    biConsumer.accept(obj, obj2);
                    return;
                }
                Method method = this.f8425;
                if (method != null) {
                    method.invoke(obj, obj2);
                } else {
                    AbstractC2853.f8919.putObject(obj, this.f8423, obj2);
                }
            } catch (Exception e) {
                throw new JSONException(AbstractC0053.m146(new StringBuilder("set "), biConsumer != null ? toString() : this.f8426, " error"), e);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo5439(AbstractC2898 abstractC2898, Object obj) {
        Field field;
        if (this.f8162 == null) {
            this.f8162 = mo5450(abstractC2898);
        }
        if ((this.f8162 instanceof C2771) && (field = this.f8422) != null) {
            AbstractC2761 abstractC2761M5575 = this.f8162.m5575(abstractC2898.mo6058());
            if (abstractC2761M5575 != null) {
                try {
                    Object objMo5454 = field.get(obj);
                    if (objMo5454 == null) {
                        objMo5454 = this.f8162.mo5454(this.f8420);
                        mo5426(obj, objMo5454);
                    }
                    abstractC2761M5575.mo5427(abstractC2898, objMo5454);
                    return;
                } catch (Exception e) {
                    C0276.m842("read unwrapped field error", e);
                    return;
                }
            }
        }
        abstractC2898.mo6188();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo5427(com.alibaba.fastjson2.AbstractC2898 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2691.mo5427(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.Object):void");
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo5436(AbstractC2898 abstractC2898, Object obj) {
        boolean z = this.f8410;
        Class cls = this.f8427;
        if (!z && abstractC2898.mo6138() != -110) {
            long j = abstractC2898.f9199.f9318;
            if ((JSONReader$Feature.IgnoreNoneSerializable.mask & j) != 0) {
                abstractC2898.mo6188();
                return;
            } else if ((j & JSONReader$Feature.ErrorOnNoneSerializable.mask) != 0 && (cls != Object.class || abstractC2898.mo6131() || abstractC2898.mo6138() == -110)) {
                C0276.m849("not support none-Serializable");
                return;
            }
        }
        if (this.f8162 == null) {
            this.f8162 = abstractC2898.f9199.m6353(this.f8421);
        }
        if (abstractC2898.mo6134()) {
            String strMo6144 = abstractC2898.mo6144();
            if ("..".equals(strMo6144)) {
                mo5426(obj, obj);
                return;
            } else {
                m5527(abstractC2898, obj, strMo6144);
                return;
            }
        }
        Object objMo5422 = this.f8162.mo5422(abstractC2898, this.f8421, this.f8426, this.f8420);
        if (objMo5422 == null && (abstractC2898.m6110(this.f8420) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0 && cls.isPrimitive()) {
            C0276.m849(abstractC2898.mo6124("primitive value not support input null"));
        } else {
            mo5426(obj, objMo5422);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo5428(AbstractC2898 abstractC2898) {
        if (this.f8162 == null) {
            this.f8162 = mo5450(abstractC2898);
        }
        boolean z = abstractC2898.f9197;
        InterfaceC2787 interfaceC2787 = this.f8162;
        Type type = this.f8421;
        Object objMo5422 = z ? interfaceC2787.mo5422(abstractC2898, type, this.f8426, this.f8420) : interfaceC2787.mo5418(abstractC2898, type, this.f8426, this.f8420);
        Function functionMo5458 = this.f8162.mo5458();
        return functionMo5458 != null ? functionMo5458.apply(objMo5422) : objMo5422;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC2787 mo5449() {
        return this.f8162;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final BiConsumer mo5429() {
        return this.f8161;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC2787 mo5450(AbstractC2898 abstractC2898) {
        InterfaceC2787 interfaceC2787 = this.f8162;
        if (interfaceC2787 != null) {
            return interfaceC2787;
        }
        if (this.f8419 != null) {
            return this.f8419;
        }
        InterfaceC2787 interfaceC2787M5526 = AbstractC2761.m5526(this.f8421, this.f8427, this.f8424, this.f8412);
        if (interfaceC2787M5526 != null) {
            this.f8419 = interfaceC2787M5526;
            return interfaceC2787M5526;
        }
        Class cls = this.f8427;
        if (cls != null && Map.class.isAssignableFrom(cls)) {
            InterfaceC2787 interfaceC2787M5463 = C2713.m5463(this.f8421, this.f8427, this.f8420);
            this.f8419 = interfaceC2787M5463;
            return interfaceC2787M5463;
        }
        Class cls2 = this.f8427;
        if (cls2 == null || !Collection.class.isAssignableFrom(cls2)) {
            InterfaceC2787 interfaceC2787M6056 = abstractC2898.m6056(this.f8421);
            this.f8419 = interfaceC2787M6056;
            return interfaceC2787M6056;
        }
        InterfaceC2787 interfaceC2787M5455 = C2697.m5455(this.f8427, this.f8421);
        this.f8419 = interfaceC2787M5455;
        return interfaceC2787M5455;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC2787 mo5451(C2942 c2942) {
        if (this.f8419 != null) {
            return this.f8419;
        }
        InterfaceC2787 interfaceC2787M5526 = AbstractC2761.m5526(this.f8421, this.f8427, this.f8424, this.f8412);
        if (interfaceC2787M5526 != null) {
            this.f8419 = interfaceC2787M5526;
            return interfaceC2787M5526;
        }
        if (Map.class.isAssignableFrom(this.f8427)) {
            InterfaceC2787 interfaceC2787M5463 = C2713.m5463(this.f8421, this.f8427, this.f8420);
            this.f8419 = interfaceC2787M5463;
            return interfaceC2787M5463;
        }
        boolean zIsAssignableFrom = Collection.class.isAssignableFrom(this.f8427);
        Type type = this.f8421;
        if (zIsAssignableFrom) {
            InterfaceC2787 interfaceC2787M5455 = C2697.m5455(this.f8427, type);
            this.f8419 = interfaceC2787M5455;
            return interfaceC2787M5455;
        }
        InterfaceC2787 interfaceC2787M6353 = c2942.m6353(type);
        this.f8419 = interfaceC2787M6353;
        return interfaceC2787M6353;
    }
}
