package p310;

import androidx.collection.C1123;
import com.alibaba.fastjson2.reader.C3628;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Class f24259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Class f24260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Class f24261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Class f24262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class f24263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class f24264;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Method f24265;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Supplier f24266;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Function f24267;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C9399 f24268;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C9399 f24269;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BiFunction f24270;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static BiFunction f24271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14708(Object obj, Object obj2) {
        if (f24260 == null) {
            f24260 = AbstractC3700.m6489("javax.money.NumberValue");
        }
        if (f24259 == null) {
            f24259 = AbstractC3700.m6489("javax.money.CurrencyUnit");
        }
        if (f24264 == null) {
            f24264 = AbstractC3700.m6489("javax.money.Monetary");
        }
        if (f24263 == null) {
            f24263 = AbstractC3700.m6489("javax.money.MonetaryAmount");
        }
        if (f24262 == null) {
            f24262 = AbstractC3700.m6489("javax.money.MonetaryAmountFactory");
        }
        if (f24266 == null) {
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(f24264);
            try {
                f24266 = (Supplier) LambdaMetafactory.metafactory(lookupM6328, "get", AbstractC3700.f9410, AbstractC3700.f9408, lookupM6328.findStatic(f24264, "getDefaultAmountFactory", MethodType.methodType(f24262)), MethodType.methodType(f24262)).getTarget().invokeExact();
            } catch (Throwable th) {
                C1123.m1403("method not found : javax.money.Monetary.getDefaultAmountFactory", th);
                return null;
            }
        }
        if (f24270 == null) {
            MethodHandles.Lookup lookupM63282 = AbstractC3687.m6328(f24262);
            try {
                Class<?> cls = f24262;
                MethodHandle methodHandleFindVirtual = lookupM63282.findVirtual(cls, "setCurrency", MethodType.methodType(cls, (Class<?>) f24259));
                MethodType methodType = AbstractC3700.f9404;
                MethodType methodType2 = AbstractC3700.f9402;
                Class cls2 = f24262;
                f24270 = (BiFunction) LambdaMetafactory.metafactory(lookupM63282, "apply", methodType, methodType2, methodHandleFindVirtual, MethodType.methodType(cls2, cls2, f24259)).getTarget().invokeExact();
            } catch (Throwable th2) {
                C1123.m1403("method not found : javax.money.NumberValue.numberValue", th2);
                return null;
            }
        }
        if (f24271 == null) {
            MethodHandles.Lookup lookupM63283 = AbstractC3687.m6328(f24262);
            try {
                Class<?> cls3 = f24262;
                MethodHandle methodHandleFindVirtual2 = lookupM63283.findVirtual(cls3, "setNumber", MethodType.methodType(cls3, (Class<?>) Number.class));
                MethodType methodType3 = AbstractC3700.f9404;
                MethodType methodType4 = AbstractC3700.f9402;
                Class cls4 = f24262;
                f24271 = (BiFunction) LambdaMetafactory.metafactory(lookupM63283, "apply", methodType3, methodType4, methodHandleFindVirtual2, MethodType.methodType(cls4, cls4, Number.class)).getTarget().invokeExact();
            } catch (Throwable th3) {
                C1123.m1403("method not found : javax.money.NumberValue.numberValue", th3);
                return null;
            }
        }
        if (f24267 == null) {
            MethodHandles.Lookup lookupM63284 = AbstractC3687.m6328(f24262);
            try {
                f24267 = (Function) LambdaMetafactory.metafactory(lookupM63284, "apply", AbstractC3700.f9409, AbstractC3700.f9405, lookupM63284.findVirtual(f24262, "create", MethodType.methodType(f24263)), MethodType.methodType((Class<?>) f24263, (Class<?>) f24262)).getTarget().invokeExact();
            } catch (Throwable th4) {
                C1123.m1403("method not found : javax.money.NumberValue.numberValue", th4);
                return null;
            }
        }
        Object obj3 = f24266.get();
        if (obj != null) {
            f24270.apply(obj3, obj);
        }
        if (obj2 != null) {
            f24271.apply(obj3, obj2);
        }
        return f24267.apply(obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3628 m14709() {
        if (f24264 == null) {
            f24264 = AbstractC3700.m6489("javax.money.Monetary");
        }
        if (f24259 == null) {
            f24259 = AbstractC3700.m6489("javax.money.CurrencyUnit");
        }
        if (f24268 == null) {
            MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(f24264);
            try {
                f24268 = new C9399((BiFunction) LambdaMetafactory.metafactory(lookupM6328, "apply", AbstractC3700.f9404, AbstractC3700.f9402, lookupM6328.findStatic(f24264, "getCurrency", MethodType.methodType(f24259, String.class, String[].class)), MethodType.methodType(f24259, String.class, String[].class)).getTarget().invokeExact(), 1);
            } catch (Throwable th) {
                C1123.m1403("method not found : javax.money.Monetary.getCurrency", th);
                return null;
            }
        }
        return new C3628(String.class, 0L, null, null, null, f24268);
    }
}
