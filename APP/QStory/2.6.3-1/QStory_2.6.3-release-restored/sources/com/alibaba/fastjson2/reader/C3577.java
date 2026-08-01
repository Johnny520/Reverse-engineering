package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3577 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long[] f8726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String[] f8727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f8728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BiFunction f8729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Method f8730;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3577(Method method, String... strArr) {
        BiFunction biFunctionM14700;
        this.f8730 = method;
        Parameter[] parameters = method.getParameters();
        this.f8727 = new String[parameters.length];
        this.f8726 = new long[parameters.length];
        int i = 0;
        while (i < parameters.length) {
            String name = i < strArr.length ? strArr[i] : parameters[i].getName();
            strArr[i] = name;
            this.f8726[i] = AbstractC3693.m6334(name);
            i++;
        }
        Function functionM14698 = null;
        if (C3609.f8822) {
            int parameterCount = method.getParameterCount();
            if (parameterCount == 1) {
                functionM14698 = AbstractC9396.m14698(method);
                biFunctionM14700 = null;
            } else if (parameterCount == 2) {
                biFunctionM14700 = AbstractC9396.m14700(method);
            }
        } else {
            biFunctionM14700 = null;
        }
        this.f8728 = functionM14698;
        this.f8729 = biFunctionM14700;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        long[] jArr = this.f8726;
        Function function = this.f8728;
        if (function != null) {
            return function.apply(map.get(Long.valueOf(jArr[0])));
        }
        BiFunction biFunction = this.f8729;
        if (biFunction != null) {
            return biFunction.apply(map.get(Long.valueOf(jArr[0])), map.get(Long.valueOf(jArr[1])));
        }
        int length = jArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(Long.valueOf(jArr[i]));
        }
        try {
            return this.f8730.invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C1123.m1403("invoke factoryMethod error", e);
            return null;
        }
    }
}
