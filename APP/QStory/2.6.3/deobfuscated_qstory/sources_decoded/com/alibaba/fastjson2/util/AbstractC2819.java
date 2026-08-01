package com.alibaba.fastjson2.util;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2819 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Function f8780;

    static {
        Function functionInvokeExact;
        if (AbstractC2854.f8918 > 9) {
            try {
                Class<?> cls = Class.forName("java.lang.StringLatin1");
                MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(cls);
                functionInvokeExact = (Function) LambdaMetafactory.metafactory(lookupM5768, "apply", MethodType.methodType(Function.class), MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class), lookupM5768.findStatic(cls, "toChars", MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)), MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)).getTarget().invokeExact();
            } catch (Throwable unused) {
                functionInvokeExact = null;
            }
        } else {
            functionInvokeExact = null;
        }
        if (functionInvokeExact == null) {
            functionInvokeExact = new C2823();
        }
        f8780 = functionInvokeExact;
    }
}
