package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONSchemaValidException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import p307.AbstractC9323;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3525 extends AbstractC3595 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final BiConsumer f8508;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public InterfaceC3621 f8509;

    public C3525(int i, long j, JSONSchema jSONSchema, Class cls, Object obj, String str, String str2, Field field, Method method, Type type, Locale locale, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field);
        this.f8508 = biConsumer;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m6053(final Map map, Collection collection, final String str, final PropertyNamingStrategy propertyNamingStrategy, final InterfaceC3621 interfaceC3621, final BiConsumer biConsumer) {
        collection.forEach(new Consumer() { // from class: com.alibaba.fastjson2.reader.飘花落叶言子世苏楪兰哲
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Object objMo14554;
                boolean z = obj instanceof Map;
                String str2 = str;
                if (z) {
                    objMo14554 = ((Map) obj).get(str2);
                } else {
                    if (obj == null) {
                        C1123.m1410(AbstractC0900.m717("key not found ", str2));
                        return;
                    }
                    Class<?> cls = obj.getClass();
                    InterfaceC9352 interfaceC9352M14665 = AbstractC3766.f9639.m14665(cls, AbstractC3700.m6504(cls), JSONWriter$Feature.FieldBased.isEnabled(0L));
                    interfaceC9352M14665.getClass();
                    long jM6334 = AbstractC3693.m6334(str2);
                    AbstractC9323 abstractC9323Mo14650 = interfaceC9352M14665.mo14650(jM6334);
                    if (abstractC9323Mo14650 == null) {
                        long jM6333 = AbstractC3693.m6333(str2);
                        if (jM6333 != jM6334) {
                            abstractC9323Mo14650 = interfaceC9352M14665.mo14650(jM6333);
                        }
                    }
                    objMo14554 = abstractC9323Mo14650 == null ? null : abstractC9323Mo14650.mo14554(obj);
                }
                PropertyNamingStrategy propertyNamingStrategy2 = propertyNamingStrategy;
                if (propertyNamingStrategy2 != null && (objMo14554 instanceof String)) {
                    objMo14554 = propertyNamingStrategy2.fieldName((String) objMo14554);
                }
                InterfaceC3621 interfaceC36212 = interfaceC3621;
                if (!interfaceC36212.mo6058().isInstance(obj)) {
                    if (!z) {
                        C1123.m1401(InterfaceC3749.m6932(obj, JSONWriter$Feature.ReferenceDetection), "can not accept ");
                        return;
                    }
                    obj = interfaceC36212.m6179((Map) obj, new JSONReader$Feature[0]);
                }
                Object objPutIfAbsent = map.putIfAbsent(objMo14554, obj);
                boolean z2 = objPutIfAbsent != null;
                BiConsumer biConsumer2 = biConsumer;
                if (z2 && (biConsumer2 != null)) {
                    biConsumer2.accept(objPutIfAbsent, obj);
                }
            }
        });
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6031(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(obj2);
        }
        if (obj2 != null || (JSONReader$Feature.IgnoreSetNullValue.mask & this.f8767) == 0) {
            Class cls = Character.TYPE;
            Class cls2 = this.f8774;
            if (cls2 == cls && (obj2 instanceof String)) {
                String str = (String) obj2;
                obj2 = str.length() > 0 ? Character.valueOf(str.charAt(0)) : (char) 0;
            }
            if (obj2 != null && !cls2.isInstance(obj2)) {
                obj2 = AbstractC3700.m6485(obj2, this.f8768);
            }
            BiConsumer biConsumer = this.f8508;
            try {
                if (biConsumer != null) {
                    biConsumer.accept(obj, obj2);
                    return;
                }
                Method method = this.f8772;
                if (method != null) {
                    method.invoke(obj, obj2);
                } else {
                    AbstractC3687.f9266.putObject(obj, this.f8770, obj2);
                }
            } catch (Exception e) {
                throw new JSONException(AbstractC0900.m711(new StringBuilder("set "), biConsumer != null ? toString() : this.f8773, " error"), e);
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public void mo6044(AbstractC3732 abstractC3732, Object obj) {
        Field field;
        if (this.f8509 == null) {
            this.f8509 = mo6055(abstractC3732);
        }
        if ((this.f8509 instanceof C3605) && (field = this.f8769) != null) {
            AbstractC3595 abstractC3595M6180 = this.f8509.m6180(abstractC3732.mo6664());
            if (abstractC3595M6180 != null) {
                try {
                    Object objMo6059 = field.get(obj);
                    if (objMo6059 == null) {
                        objMo6059 = this.f8509.mo6059(this.f8767);
                        mo6031(obj, objMo6059);
                    }
                    abstractC3595M6180.mo6032(abstractC3732, objMo6059);
                    return;
                } catch (Exception e) {
                    C1123.m1403("read unwrapped field error", e);
                    return;
                }
            }
        }
        abstractC3732.mo6793();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0137  */
    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6032(AbstractC3732 abstractC3732, Object obj) {
        String strMo6023;
        if (!this.f8757) {
            long j = abstractC3732.f9546.f9665;
            if ((JSONReader$Feature.IgnoreNoneSerializable.mask & j) != 0) {
                abstractC3732.mo6793();
                return;
            } else if ((j & JSONReader$Feature.ErrorOnNoneSerializable.mask) != 0) {
                C1123.m1410("not support none-Serializable");
                return;
            }
        }
        InterfaceC3621 interfaceC3621M6131 = this.f8509;
        Class cls = this.f8774;
        if (interfaceC3621M6131 == null) {
            String str = this.f8771;
            Locale locale = this.f8759;
            Type type = this.f8768;
            interfaceC3621M6131 = AbstractC3595.m6131(type, cls, str, locale);
            if (interfaceC3621M6131 != null) {
                this.f8509 = interfaceC3621M6131;
            } else {
                interfaceC3621M6131 = abstractC3732.f9546.m6971(type);
                this.f8509 = interfaceC3621M6131;
            }
        }
        if (abstractC3732.mo6740()) {
            String strMo6749 = abstractC3732.mo6749();
            if ("..".equals(strMo6749)) {
                mo6031(obj, obj);
                return;
            } else {
                m6132(abstractC3732, obj, strMo6749);
                return;
            }
        }
        Field field = null;
        try {
            char c = abstractC3732.f9538;
            if (abstractC3732.mo6711()) {
                strMo6023 = this.f8760;
                if (strMo6023 == null) {
                    strMo6023 = cls == OptionalInt.class ? OptionalInt.empty() : cls == OptionalLong.class ? OptionalLong.empty() : cls == OptionalDouble.class ? OptionalDouble.empty() : cls == Optional.class ? Optional.empty() : c == 'n' ? null : "";
                }
            } else if (!abstractC3732.f9544) {
                strMo6023 = interfaceC3621M6131.mo6023(abstractC3732, this.f8768, this.f8773, this.f8767);
            } else if (cls == Object.class) {
                InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(0L, this.f8767, Object.class);
                strMo6023 = interfaceC3621Mo6724 != null ? interfaceC3621Mo6724.mo6027(abstractC3732, this.f8768, this.f8773, this.f8767) : abstractC3732.mo6684();
            } else {
                strMo6023 = interfaceC3621M6131.mo6027(abstractC3732, this.f8768, this.f8773, this.f8767);
            }
        } catch (JSONSchemaValidException e) {
            throw e;
        } catch (Exception e2) {
            e = e2;
            if ((JSONReader$Feature.NullOnError.mask & this.f8767) != 0) {
                Member member = this.f8769;
                if (member == null) {
                    member = this.f8772;
                }
                C1123.m1403(abstractC3732.mo6730(member != null ? "read field '" + member.getDeclaringClass().getName() + "." + member.getName() : AbstractC0900.m711(new StringBuilder("read field "), this.f8773, " error")), e);
                return;
            }
            strMo6023 = null;
        } catch (IllegalAccessError e3) {
            e = e3;
            if ((JSONReader$Feature.NullOnError.mask & this.f8767) != 0) {
            }
        }
        mo6031(obj, strMo6023);
        if (!this.f8764 || strMo6023 == null) {
            return;
        }
        Type[] typeArr = AbstractC3698.f9362;
        Class<?> cls2 = strMo6023.getClass();
        Field[] declaredFields = (Field[]) AbstractC3698.f9359.get(cls2);
        if (declaredFields == null) {
            declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (Modifier.isStatic(declaredFields[i].getModifiers())) {
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field2 : declaredFields) {
                        if (!Modifier.isStatic(field2.getModifiers())) {
                            arrayList.add(field2);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                } else {
                    i++;
                }
            }
            AbstractC3698.f9361.putIfAbsent(cls2, declaredFields);
        }
        for (Field field3 : declaredFields) {
            if ("this$0".equals(field3.getName())) {
                field = field3;
            }
        }
        if (field != null) {
            field.setAccessible(true);
            try {
                field.set(strMo6023, obj);
            } catch (IllegalAccessException unused) {
                C1123.m1410(AbstractC0900.m714(cls2, "setNoneStaticMemberClassParent error, class "));
            }
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public void mo6041(AbstractC3732 abstractC3732, Object obj) {
        boolean z = this.f8757;
        Class cls = this.f8774;
        if (!z && abstractC3732.mo6743() != -110) {
            long j = abstractC3732.f9546.f9665;
            if ((JSONReader$Feature.IgnoreNoneSerializable.mask & j) != 0) {
                abstractC3732.mo6793();
                return;
            } else if ((j & JSONReader$Feature.ErrorOnNoneSerializable.mask) != 0 && (cls != Object.class || abstractC3732.mo6737() || abstractC3732.mo6743() == -110)) {
                C1123.m1410("not support none-Serializable");
                return;
            }
        }
        if (this.f8509 == null) {
            this.f8509 = abstractC3732.f9546.m6971(this.f8768);
        }
        if (abstractC3732.mo6740()) {
            String strMo6749 = abstractC3732.mo6749();
            if ("..".equals(strMo6749)) {
                mo6031(obj, obj);
                return;
            } else {
                m6132(abstractC3732, obj, strMo6749);
                return;
            }
        }
        Object objMo6027 = this.f8509.mo6027(abstractC3732, this.f8768, this.f8773, this.f8767);
        if (objMo6027 == null && (abstractC3732.m6717(this.f8767) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0 && cls.isPrimitive()) {
            C1123.m1410(abstractC3732.mo6730("primitive value not support input null"));
        } else {
            mo6031(obj, objMo6027);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public Object mo6033(AbstractC3732 abstractC3732) {
        if (this.f8509 == null) {
            this.f8509 = mo6055(abstractC3732);
        }
        boolean z = abstractC3732.f9544;
        InterfaceC3621 interfaceC3621 = this.f8509;
        Type type = this.f8768;
        Object objMo6027 = z ? interfaceC3621.mo6027(abstractC3732, type, this.f8773, this.f8767) : interfaceC3621.mo6023(abstractC3732, type, this.f8773, this.f8767);
        Function functionMo6063 = this.f8509.mo6063();
        return functionMo6063 != null ? functionMo6063.apply(objMo6027) : objMo6027;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC3621 mo6054() {
        return this.f8509;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final BiConsumer mo6034() {
        return this.f8508;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC3621 mo6055(AbstractC3732 abstractC3732) {
        InterfaceC3621 interfaceC3621 = this.f8509;
        if (interfaceC3621 != null) {
            return interfaceC3621;
        }
        if (this.f8766 != null) {
            return this.f8766;
        }
        InterfaceC3621 interfaceC3621M6131 = AbstractC3595.m6131(this.f8768, this.f8774, this.f8771, this.f8759);
        if (interfaceC3621M6131 != null) {
            this.f8766 = interfaceC3621M6131;
            return interfaceC3621M6131;
        }
        Class cls = this.f8774;
        if (cls != null && Map.class.isAssignableFrom(cls)) {
            InterfaceC3621 interfaceC3621M6068 = C3547.m6068(this.f8768, this.f8774, this.f8767);
            this.f8766 = interfaceC3621M6068;
            return interfaceC3621M6068;
        }
        Class cls2 = this.f8774;
        if (cls2 == null || !Collection.class.isAssignableFrom(cls2)) {
            InterfaceC3621 interfaceC3621M6662 = abstractC3732.m6662(this.f8768);
            this.f8766 = interfaceC3621M6662;
            return interfaceC3621M6662;
        }
        InterfaceC3621 interfaceC3621M6060 = C3531.m6060(this.f8774, this.f8768);
        this.f8766 = interfaceC3621M6060;
        return interfaceC3621M6060;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC3621 mo6056(C3776 c3776) {
        if (this.f8766 != null) {
            return this.f8766;
        }
        InterfaceC3621 interfaceC3621M6131 = AbstractC3595.m6131(this.f8768, this.f8774, this.f8771, this.f8759);
        if (interfaceC3621M6131 != null) {
            this.f8766 = interfaceC3621M6131;
            return interfaceC3621M6131;
        }
        if (Map.class.isAssignableFrom(this.f8774)) {
            InterfaceC3621 interfaceC3621M6068 = C3547.m6068(this.f8768, this.f8774, this.f8767);
            this.f8766 = interfaceC3621M6068;
            return interfaceC3621M6068;
        }
        boolean zIsAssignableFrom = Collection.class.isAssignableFrom(this.f8774);
        Type type = this.f8768;
        if (zIsAssignableFrom) {
            InterfaceC3621 interfaceC3621M6060 = C3531.m6060(this.f8774, type);
            this.f8766 = interfaceC3621M6060;
            return interfaceC3621M6060;
        }
        InterfaceC3621 interfaceC3621M6971 = c3776.m6971(type);
        this.f8766 = interfaceC3621M6971;
        return interfaceC3621M6971;
    }
}
