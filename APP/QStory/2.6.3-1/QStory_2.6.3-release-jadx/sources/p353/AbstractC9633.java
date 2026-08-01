package p353;

import com.bumptech.glide.AbstractC3897;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p303.AbstractC9234;
import p408.C9931;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public abstract class AbstractC9633 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f25121 = AbstractC3897.m7362(AbstractC9234.m14531(2115));

    @Override // p042.AbstractC7143
    public final void startLoadHook() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (AbstractC3897.m7362(AbstractC9234.m14531(2116)).invoke(null, null) == null) {
            C9931 c9931 = new C9931();
            c9931.f25866.addAll(Arrays.asList(AbstractC9234.m14531(2119)));
            c9931.f25867.addAll(Arrays.asList(AbstractC9234.m14531(2120)));
            Constructor<?>[] declaredConstructors = c9931.m15255().getDeclaredConstructors();
            AbstractC9234.m14531(1801);
            declaredConstructors.getClass();
            AbstractC3897.m7362(AbstractC9234.m14531(2117)).invoke(null, ((Constructor) AbstractC5179.m9384(declaredConstructors)).newInstance(null));
        }
        Object objInvoke = this.f25121.invoke(null, AbstractC7187.f17852, mo11845());
        AbstractC9234.m14531(2118);
        objInvoke.getClass();
        loadHook((ClassLoader) objInvoke);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract String mo11845();
}
