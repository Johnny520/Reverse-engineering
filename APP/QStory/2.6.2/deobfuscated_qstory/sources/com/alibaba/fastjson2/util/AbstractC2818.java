package com.alibaba.fastjson2.util;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2818 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Function f8778;

    static {
        Function functionInvokeExact;
        if (AbstractC2853.f8916 > 9) {
            try {
                Class<?> cls = Class.forName("java.lang.StringLatin1");
                MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(cls);
                functionInvokeExact = (Function) LambdaMetafactory.metafactory(lookupM5723, "apply", MethodType.methodType(Function.class), MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class), lookupM5723.findStatic(cls, "toChars", MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)), MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)).getTarget().invokeExact();
            } catch (Throwable unused) {
                functionInvokeExact = null;
            }
        } else {
            functionInvokeExact = null;
        }
        if (functionInvokeExact == null) {
            functionInvokeExact = new C2822();
        }
        f8778 = functionInvokeExact;
    }
}
