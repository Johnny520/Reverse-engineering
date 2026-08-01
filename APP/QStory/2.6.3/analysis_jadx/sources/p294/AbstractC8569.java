package p294;

import androidx.collection.C0276;
import com.alibaba.fastjson2.reader.C2795;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2867;
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
public abstract class AbstractC8569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Class f23914;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static Class f23915;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Class f23916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Class f23917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Class f23918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class f23919;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Method f23920;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Supplier f23921;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Function f23922;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C8570 f23923;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C8570 f23924;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static BiFunction f23925;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static BiFunction f23926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m14149(Object obj, Object obj2) {
        if (f23915 == null) {
            f23915 = AbstractC2867.m5929("javax.money.NumberValue");
        }
        if (f23914 == null) {
            f23914 = AbstractC2867.m5929("javax.money.CurrencyUnit");
        }
        if (f23919 == null) {
            f23919 = AbstractC2867.m5929("javax.money.Monetary");
        }
        if (f23918 == null) {
            f23918 = AbstractC2867.m5929("javax.money.MonetaryAmount");
        }
        if (f23917 == null) {
            f23917 = AbstractC2867.m5929("javax.money.MonetaryAmountFactory");
        }
        if (f23921 == null) {
            MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(f23919);
            try {
                f23921 = (Supplier) LambdaMetafactory.metafactory(lookupM5768, "get", AbstractC2867.f9065, AbstractC2867.f9063, lookupM5768.findStatic(f23919, "getDefaultAmountFactory", MethodType.methodType(f23917)), MethodType.methodType(f23917)).getTarget().invokeExact();
            } catch (Throwable th) {
                C0276.m843("method not found : javax.money.Monetary.getDefaultAmountFactory", th);
                return null;
            }
        }
        if (f23925 == null) {
            MethodHandles.Lookup lookupM57682 = AbstractC2854.m5768(f23917);
            try {
                Class<?> cls = f23917;
                MethodHandle methodHandleFindVirtual = lookupM57682.findVirtual(cls, "setCurrency", MethodType.methodType(cls, (Class<?>) f23914));
                MethodType methodType = AbstractC2867.f9059;
                MethodType methodType2 = AbstractC2867.f9057;
                Class cls2 = f23917;
                f23925 = (BiFunction) LambdaMetafactory.metafactory(lookupM57682, "apply", methodType, methodType2, methodHandleFindVirtual, MethodType.methodType(cls2, cls2, f23914)).getTarget().invokeExact();
            } catch (Throwable th2) {
                C0276.m843("method not found : javax.money.NumberValue.numberValue", th2);
                return null;
            }
        }
        if (f23926 == null) {
            MethodHandles.Lookup lookupM57683 = AbstractC2854.m5768(f23917);
            try {
                Class<?> cls3 = f23917;
                MethodHandle methodHandleFindVirtual2 = lookupM57683.findVirtual(cls3, "setNumber", MethodType.methodType(cls3, (Class<?>) Number.class));
                MethodType methodType3 = AbstractC2867.f9059;
                MethodType methodType4 = AbstractC2867.f9057;
                Class cls4 = f23917;
                f23926 = (BiFunction) LambdaMetafactory.metafactory(lookupM57683, "apply", methodType3, methodType4, methodHandleFindVirtual2, MethodType.methodType(cls4, cls4, Number.class)).getTarget().invokeExact();
            } catch (Throwable th3) {
                C0276.m843("method not found : javax.money.NumberValue.numberValue", th3);
                return null;
            }
        }
        if (f23922 == null) {
            MethodHandles.Lookup lookupM57684 = AbstractC2854.m5768(f23917);
            try {
                f23922 = (Function) LambdaMetafactory.metafactory(lookupM57684, "apply", AbstractC2867.f9064, AbstractC2867.f9060, lookupM57684.findVirtual(f23917, "create", MethodType.methodType(f23918)), MethodType.methodType((Class<?>) f23918, (Class<?>) f23917)).getTarget().invokeExact();
            } catch (Throwable th4) {
                C0276.m843("method not found : javax.money.NumberValue.numberValue", th4);
                return null;
            }
        }
        Object obj3 = f23921.get();
        if (obj != null) {
            f23925.apply(obj3, obj);
        }
        if (obj2 != null) {
            f23926.apply(obj3, obj2);
        }
        return f23922.apply(obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2795 m14150() {
        if (f23919 == null) {
            f23919 = AbstractC2867.m5929("javax.money.Monetary");
        }
        if (f23914 == null) {
            f23914 = AbstractC2867.m5929("javax.money.CurrencyUnit");
        }
        if (f23923 == null) {
            MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(f23919);
            try {
                f23923 = new C8570((BiFunction) LambdaMetafactory.metafactory(lookupM5768, "apply", AbstractC2867.f9059, AbstractC2867.f9057, lookupM5768.findStatic(f23919, "getCurrency", MethodType.methodType(f23914, String.class, String[].class)), MethodType.methodType(f23914, String.class, String[].class)).getTarget().invokeExact(), 1);
            } catch (Throwable th) {
                C0276.m843("method not found : javax.money.Monetary.getCurrency", th);
                return null;
            }
        }
        return new C2795(String.class, 0L, null, null, null, f23923);
    }
}
