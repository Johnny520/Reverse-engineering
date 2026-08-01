package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.InterfaceC2916;
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
import p144.C7547;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2857 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f8956;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final GenericDeclaration f8957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8958 = 1;

    public C2857(Class cls, Object obj) {
        this.f8957 = cls;
        this.f8956 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f8958;
        Object obj2 = this.f8956;
        GenericDeclaration genericDeclaration = this.f8957;
        switch (i) {
            case 0:
                Object obj3 = ((Supplier) obj2).get();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    try {
                        ((Method) genericDeclaration).invoke(obj3, entry.getKey(), (Iterable) entry.getValue());
                    } catch (Throwable th) {
                        C0276.m843("putAll ArrayListMultimap error", th);
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
                    return (AbstractC2849.m5688(str) || str.length() != 19) ? Long.valueOf(Long.parseLong(str)) : Long.valueOf(AbstractC2866.m5895(str, AbstractC2866.f9027));
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
                        return InterfaceC2916.m6369(str, cls);
                    }
                    if (str.indexOf(44) != -1) {
                        return Arrays.asList(str.split(","));
                    }
                }
                C7547.m12771("can not convert to ", cls, ", value : ", str);
                return null;
        }
    }

    public C2857(Supplier supplier, Method method) {
        this.f8956 = supplier;
        this.f8957 = method;
    }
}
