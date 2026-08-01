package p294;

import androidx.collection.C0276;
import com.alibaba.fastjson2.reader.C2794;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8577 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Class f23923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Class f23924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Class f23925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Class f23926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class f23927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class f23928;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Method f23929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Supplier f23930;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Function f23931;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C8578 f23932;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C8578 f23933;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BiFunction f23934;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static BiFunction f23935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14130(Object obj, Object obj2) {
        if (f23924 == null) {
            f23924 = AbstractC2866.m5884("javax.money.NumberValue");
        }
        if (f23923 == null) {
            f23923 = AbstractC2866.m5884("javax.money.CurrencyUnit");
        }
        if (f23928 == null) {
            f23928 = AbstractC2866.m5884("javax.money.Monetary");
        }
        if (f23927 == null) {
            f23927 = AbstractC2866.m5884("javax.money.MonetaryAmount");
        }
        if (f23926 == null) {
            f23926 = AbstractC2866.m5884("javax.money.MonetaryAmountFactory");
        }
        if (f23930 == null) {
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(f23928);
            try {
                f23930 = (Supplier) LambdaMetafactory.metafactory(lookupM5723, "get", AbstractC2866.f9063, AbstractC2866.f9061, lookupM5723.findStatic(f23928, "getDefaultAmountFactory", MethodType.methodType(f23926)), MethodType.methodType(f23926)).getTarget().invokeExact();
            } catch (Throwable th) {
                C0276.m842("method not found : javax.money.Monetary.getDefaultAmountFactory", th);
                return null;
            }
        }
        if (f23934 == null) {
            MethodHandles.Lookup lookupM57232 = AbstractC2853.m5723(f23926);
            try {
                Class<?> cls = f23926;
                MethodHandle methodHandleFindVirtual = lookupM57232.findVirtual(cls, "setCurrency", MethodType.methodType(cls, (Class<?>) f23923));
                MethodType methodType = AbstractC2866.f9057;
                MethodType methodType2 = AbstractC2866.f9055;
                Class cls2 = f23926;
                f23934 = (BiFunction) LambdaMetafactory.metafactory(lookupM57232, "apply", methodType, methodType2, methodHandleFindVirtual, MethodType.methodType(cls2, cls2, f23923)).getTarget().invokeExact();
            } catch (Throwable th2) {
                C0276.m842("method not found : javax.money.NumberValue.numberValue", th2);
                return null;
            }
        }
        if (f23935 == null) {
            MethodHandles.Lookup lookupM57233 = AbstractC2853.m5723(f23926);
            try {
                Class<?> cls3 = f23926;
                MethodHandle methodHandleFindVirtual2 = lookupM57233.findVirtual(cls3, "setNumber", MethodType.methodType(cls3, (Class<?>) Number.class));
                MethodType methodType3 = AbstractC2866.f9057;
                MethodType methodType4 = AbstractC2866.f9055;
                Class cls4 = f23926;
                f23935 = (BiFunction) LambdaMetafactory.metafactory(lookupM57233, "apply", methodType3, methodType4, methodHandleFindVirtual2, MethodType.methodType(cls4, cls4, Number.class)).getTarget().invokeExact();
            } catch (Throwable th3) {
                C0276.m842("method not found : javax.money.NumberValue.numberValue", th3);
                return null;
            }
        }
        if (f23931 == null) {
            MethodHandles.Lookup lookupM57234 = AbstractC2853.m5723(f23926);
            try {
                f23931 = (Function) LambdaMetafactory.metafactory(lookupM57234, "apply", AbstractC2866.f9062, AbstractC2866.f9058, lookupM57234.findVirtual(f23926, "create", MethodType.methodType(f23927)), MethodType.methodType((Class<?>) f23927, (Class<?>) f23926)).getTarget().invokeExact();
            } catch (Throwable th4) {
                C0276.m842("method not found : javax.money.NumberValue.numberValue", th4);
                return null;
            }
        }
        Object obj3 = f23930.get();
        if (obj != null) {
            f23934.apply(obj3, obj);
        }
        if (obj2 != null) {
            f23935.apply(obj3, obj2);
        }
        return f23931.apply(obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2794 m14131() {
        if (f23928 == null) {
            f23928 = AbstractC2866.m5884("javax.money.Monetary");
        }
        if (f23923 == null) {
            f23923 = AbstractC2866.m5884("javax.money.CurrencyUnit");
        }
        if (f23932 == null) {
            MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(f23928);
            try {
                f23932 = new C8578((BiFunction) LambdaMetafactory.metafactory(lookupM5723, "apply", AbstractC2866.f9057, AbstractC2866.f9055, lookupM5723.findStatic(f23928, "getCurrency", MethodType.methodType(f23923, String.class, String[].class)), MethodType.methodType(f23923, String.class, String[].class)).getTarget().invokeExact(), 1);
            } catch (Throwable th) {
                C0276.m842("method not found : javax.money.Monetary.getCurrency", th);
                return null;
            }
        }
        return new C2794(String.class, 0L, null, null, null, f23932);
    }
}
