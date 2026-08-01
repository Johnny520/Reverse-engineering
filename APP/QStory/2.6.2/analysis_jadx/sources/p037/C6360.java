package p037;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.android.AndroidClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodCall;
import net.bytebuddy.matcher.ElementMatchers;
import p009.InterfaceC6152;
import p026.AbstractC6298;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6360 extends AbstractC6298 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static Method f17485;

    public C6360() {
        AbstractC3056.m6668(-3937596235754767783L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static Object m11913(Object obj, String str, int i, Callable callable) {
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
        Class<?> declaringClass = f17485.getDeclaringClass();
        C6316 c6316M11826 = C6316.m11826(declaringClass);
        c6316M11826.f17409.f3616 = Void.TYPE;
        Method methodM11827 = c6316M11826.m11827();
        int i2 = AbstractC6340.f17461;
        try {
            return (i2 > 5028 ? i2 >= 6588 ? new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.named(AbstractC3056.m6668(-3937596167035291047L))).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC3056.m6668(-3937586589258220967L))).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC3056.m6668(-3937583359442814375L))).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11827)).intercept(MethodCall.call(callable)).method(ElementMatchers.named(AbstractC3056.m6668(-3937588311540106663L))).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6340.f17460.getDir(AbstractC3056.m6668(-3937596072546010535L), 0))).getLoaded() : i2 >= 5844 ? new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.named(AbstractC3056.m6668(-3937586589258220967L))).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC3056.m6668(-3937583359442814375L))).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11827)).intercept(MethodCall.call(callable)).method(ElementMatchers.named(AbstractC3056.m6668(-3937588311540106663L))).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6340.f17460.getDir(AbstractC3056.m6668(-3937596072546010535L), 0))).getLoaded() : new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.returns((Class<?>) String.class)).intercept(FixedValue.value(str)).method(ElementMatchers.named(AbstractC3056.m6668(-3937583359442814375L))).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11827)).intercept(MethodCall.call(callable)).method(ElementMatchers.named(AbstractC3056.m6668(-3937588616482784679L))).intercept(FixedValue.value(Integer.valueOf(i))).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6340.f17460.getDir(AbstractC3056.m6668(-3937596072546010535L), 0))).getLoaded() : new ByteBuddy().subclass((Class) declaringClass).method(ElementMatchers.returns((Class<?>) String.class)).intercept(FixedValue.value(str)).method(ElementMatchers.returns((Class<?>) Integer.TYPE)).intercept(FixedValue.value(Integer.valueOf(i))).method(ElementMatchers.is(methodM11827)).intercept(MethodCall.call(callable)).make().load(declaringClass.getClassLoader(), new AndroidClassLoadingStrategy.Wrapping(AbstractC6340.f17460.getDir(AbstractC3056.m6668(-3937596072546010535L), 0))).getLoaded()).getDeclaredConstructor(clsM11838).newInstance(obj);
        } catch (Exception e) {
            C5919.m11252(e);
            return null;
        }
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        f17485 = c3069.m6902(AbstractC3056.m6668(-3937596235754767783L));
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        for (Method method : C3069.m6899(AbstractC3056.m6668(-3937596115495683495L))) {
            if (method.getDeclaringClass().getName().startsWith(AbstractC3056.m6668(-3937595947991958951L))) {
                c3069.m6900(method, AbstractC3056.m6668(-3937596235754767783L));
                return;
            }
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
    }
}
