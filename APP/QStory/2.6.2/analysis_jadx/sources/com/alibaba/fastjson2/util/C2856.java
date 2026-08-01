package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.InterfaceC2915;
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
import p144.C7546;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2856 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f8954;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final GenericDeclaration f8955;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8956 = 1;

    public C2856(Class cls, Object obj) {
        this.f8955 = cls;
        this.f8954 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f8956;
        Object obj2 = this.f8954;
        GenericDeclaration genericDeclaration = this.f8955;
        switch (i) {
            case 0:
                Object obj3 = ((Supplier) obj2).get();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    try {
                        ((Method) genericDeclaration).invoke(obj3, entry.getKey(), (Iterable) entry.getValue());
                    } catch (Throwable th) {
                        C0276.m842("putAll ArrayListMultimap error", th);
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
                    return (AbstractC2848.m5643(str) || str.length() != 19) ? Long.valueOf(Long.parseLong(str)) : Long.valueOf(AbstractC2865.m5850(str, AbstractC2865.f9025));
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
                        return InterfaceC2915.m6311(str, cls);
                    }
                    if (str.indexOf(44) != -1) {
                        return Arrays.asList(str.split(","));
                    }
                }
                C7546.m12742("can not convert to ", cls, ", value : ", str);
                return null;
        }
    }

    public C2856(Supplier supplier, Method method) {
        this.f8954 = supplier;
        this.f8955 = method;
    }
}
