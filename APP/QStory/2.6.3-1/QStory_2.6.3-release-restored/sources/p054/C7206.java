package p054;

import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.android.AndroidClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.matcher.ElementMatchers;
import p042.AbstractC7145;
import p043.InterfaceC7146;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7206 extends AbstractC7145 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Method f17876;

    public C7206() {
        "Menu_Item_Class";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m12520(Object obj, String str, int i, Callable callable) {
        Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem");
        Class<?> declaringClass = f17876.getDeclaringClass();
        C7164 c7164M12413 = C7164.m12413(declaringClass);
        c7164M12413.f17803.f3962 = Void.TYPE;
        Method methodM12414 = c7164M12413.m12414();
        int i2 = AbstractC7187.f17853;
        try {
            return (i2 > 5028 ? i2 >= 6588 ? new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.named("f")).intercept(FixedValue.value(str)).method(ElementMatchers.named("e")).intercept(FixedValue.value(str)).method(ElementMatchers.named("b")).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.m456is(methodM12414)).intercept(MethodCall.call(callable)).method(ElementMatchers.named("c")).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC7187.f17852.getDir("generated", 0))).getLoaded() : i2 >= 5844 ? new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.named("e")).intercept(FixedValue.value(str)).method(ElementMatchers.named("b")).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.m456is(methodM12414)).intercept(MethodCall.call(callable)).method(ElementMatchers.named("c")).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC7187.f17852.getDir("generated", 0))).getLoaded() : new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.returns((Class<?>) String.class)).intercept(FixedValue.value(str)).method(ElementMatchers.named("b")).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.m456is(methodM12414)).intercept(MethodCall.call(callable)).method(ElementMatchers.named("a")).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC7187.f17852.getDir("generated", 0))).getLoaded() : new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.returns((Class<?>) String.class)).intercept(FixedValue.value(str)).method(ElementMatchers.returns((Class<?>) Integer.TYPE)).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.m456is(methodM12414)).intercept(MethodCall.call(callable)).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC7187.f17852.getDir("generated", 0))).getLoaded()).getDeclaredConstructor(clsM12425).newInstance(obj);
        } catch (Exception e) {
            C6755.m11872(e);
            return null;
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        f17876 = c3902.m7449("Menu_Item_Class");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        for (Method method : C3902.m7446("QQCustomMenuItem{title='")) {
            if (method.getDeclaringClass().getName().startsWith("com.tencent.qqnt.aio.menu.ui")) {
                c3902.m7447(method, "Menu_Item_Class");
                return;
            }
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
    }
}
