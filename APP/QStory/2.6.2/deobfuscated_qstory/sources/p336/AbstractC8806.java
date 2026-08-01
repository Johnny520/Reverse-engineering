package p336;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.AbstractC5061;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p394.C9131;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public abstract class AbstractC8806 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f24778 = AbstractC5061.m10016("Lcom/tencent/mobileqq/pluginsdk/PluginStatic;->getOrCreateClassLoader(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/ClassLoader;");

    @Override // p026.AbstractC6296
    public final void startLoadHook() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (AbstractC5061.m10016("Lcom/tencent/mobileqq/pluginsdk/IPluginAdapterProxy;->getProxy()Lcom/tencent/mobileqq/pluginsdk/IPluginAdapterProxy;").invoke(null, null) == null) {
            C9131 c9131 = new C9131();
            c9131.f25544.addAll(Arrays.asList("cooperation.plugin"));
            c9131.f25545.addAll(Arrays.asList("com.tencent.mobileqq.pluginsdk.IPluginAdapter"));
            Constructor<?>[] declaredConstructors = c9131.m14701().getDeclaredConstructors();
            "getDeclaredConstructors(...)";
            declaredConstructors.getClass();
            AbstractC5061.m10016("Lcom/tencent/mobileqq/pluginsdk/IPluginAdapterProxy;->setProxy(Lcom/tencent/mobileqq/pluginsdk/IPluginAdapter;)V").invoke(null, ((Constructor) AbstractC4346.m8849(declaredConstructors)).newInstance(null));
        }
        Object objInvoke = this.f24778.invoke(null, AbstractC6340.f17460, mo11225());
        "null cannot be cast to non-null type java.lang.ClassLoader";
        objInvoke.getClass();
        loadHook((ClassLoader) objInvoke);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract String mo11225();
}
