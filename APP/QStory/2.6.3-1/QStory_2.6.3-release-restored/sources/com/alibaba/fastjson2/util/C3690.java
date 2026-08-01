package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import p160.C8376;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3690 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final GenericDeclaration f9302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9303 = 1;

    public C3690(Class cls, Object obj) {
        this.f9302 = cls;
        this.f9301 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f9303;
        Object obj2 = this.f9301;
        GenericDeclaration genericDeclaration = this.f9302;
        switch (i) {
            case 0:
                Object obj3 = ((Supplier) obj2).get();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    try {
                        ((Method) genericDeclaration).invoke(obj3, entry.getKey(), (Iterable) entry.getValue());
                    } catch (Throwable th) {
                        C1123.m1403("putAll ArrayListMultimap error", th);
                        return null;
                    }
                }
                return obj3;
            default:
                Class cls = (Class) genericDeclaration;
                String str = (String) obj;
                if (str == null || "null".equals(str) || str.isEmpty()) {
                    return obj2;
                }
                if (cls == Byte.TYPE || cls == Byte.class) {
                    return Byte.valueOf(Byte.parseByte(str));
                }
                if (cls == Short.TYPE || cls == Short.class) {
                    return Short.valueOf(Short.parseShort(str));
                }
                if (cls == Integer.TYPE || cls == Integer.class) {
                    return Integer.valueOf(Integer.parseInt(str));
                }
                if (cls == Long.TYPE || cls == Long.class) {
                    return (AbstractC3682.m6248(str) || str.length() != 19) ? Long.valueOf(Long.parseLong(str)) : Long.valueOf(AbstractC3699.m6455(str, AbstractC3699.f9372));
                }
                if (cls == Float.TYPE || cls == Float.class) {
                    return Float.valueOf(Float.parseFloat(str));
                }
                if (cls == Double.TYPE || cls == Double.class) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                if (cls == Character.TYPE || cls == Character.class) {
                    return Character.valueOf(str.charAt(0));
                }
                if (cls == Boolean.TYPE || cls == Boolean.class) {
                    return Boolean.valueOf("true".equals(str));
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == Collections.class || cls == List.class || cls == JSONArray.class) {
                    if (str.charAt(0) == '[') {
                        return InterfaceC3749.m6929(str, cls);
                    }
                    if (str.indexOf(44) != -1) {
                        return Arrays.asList(str.split(","));
                    }
                }
                C8376.m13330("can not convert to ", cls, ", value : ", str);
                return null;
        }
    }

    public C3690(Supplier supplier, Method method) {
        this.f9301 = supplier;
        this.f9302 = method;
    }
}
