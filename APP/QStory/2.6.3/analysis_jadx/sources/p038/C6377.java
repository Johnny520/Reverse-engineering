package p038;

import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.android.AndroidClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.matcher.ElementMatchers;
import p026.AbstractC6316;
import p027.InterfaceC6317;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6377 extends AbstractC6316 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Method f17531;

    public C6377() {
        AbstractC8405.m13972(306);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m11961(Object obj, String str, int i, Callable callable) {
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
        Class<?> declaringClass = f17531.getDeclaringClass();
        C6335 c6335M11854 = C6335.m11854(declaringClass);
        c6335M11854.f17458.f3617 = Void.TYPE;
        Method methodM11855 = c6335M11854.m11855();
        int i2 = AbstractC6358.f17508;
        try {
            return (i2 > 5028 ? i2 >= 6588 ? new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵呜喵呜"))).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵呜呜喵"))).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵喵喵呜"))).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11855)).intercept(MethodCall.call(callable)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵喵喵喵"))).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6358.f17507.getDir(AbstractC8405.m13972(307), 0))).getLoaded() : i2 >= 5844 ? new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵呜呜喵"))).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵喵喵呜"))).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11855)).intercept(MethodCall.call(callable)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵喵喵喵"))).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6358.f17507.getDir(AbstractC8405.m13972(307), 0))).getLoaded() : new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.returns((Class<?>) String.class)).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵喵喵呜"))).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11855)).intercept(MethodCall.call(callable)).method(ElementMatchers.named(AbstractC8405.m13973("喵喵喵呜喵喵呜喵"))).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6358.f17507.getDir(AbstractC8405.m13972(307), 0))).getLoaded() : new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.returns((Class<?>) String.class)).intercept(FixedValue.value(str)).method(ElementMatchers.returns((Class<?>) Integer.TYPE)).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11855)).intercept(MethodCall.call(callable)).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6358.f17507.getDir(AbstractC8405.m13972(307), 0))).getLoaded()).getDeclaredConstructor(clsM11866).newInstance(obj);
        } catch (Exception e) {
            C5925.m11313(e);
            return null;
        }
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        f17531 = c3070.m6889(AbstractC8405.m13972(306));
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        for (Method method : C3070.m6886(AbstractC8405.m13972(308))) {
            if (method.getDeclaringClass().getName().startsWith(AbstractC8405.m13972(309))) {
                c3070.m6887(method, AbstractC8405.m13972(306));
                return;
            }
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
    }
}
