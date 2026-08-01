package p337;

import com.bumptech.glide.AbstractC3065;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC4347;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p392.C9102;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public abstract class AbstractC8804 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Method f24776 = AbstractC3065.m6802(AbstractC8405.m13972(2115));

    @Override // p026.AbstractC6314
    public final void startLoadHook() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        if (AbstractC3065.m6802(AbstractC8405.m13972(2116)).invoke(null, null) == null) {
            C9102 c9102 = new C9102();
            c9102.f25521.addAll(Arrays.asList(AbstractC8405.m13972(2119)));
            c9102.f25522.addAll(Arrays.asList(AbstractC8405.m13972(2120)));
            Constructor<?>[] declaredConstructors = c9102.m14696().getDeclaredConstructors();
            AbstractC8405.m13972(1801);
            declaredConstructors.getClass();
            AbstractC3065.m6802(AbstractC8405.m13972(2117)).invoke(null, ((Constructor) AbstractC4347.m8825(declaredConstructors)).newInstance(null));
        }
        Object objInvoke = this.f24776.invoke(null, AbstractC6358.f17507, mo11286());
        AbstractC8405.m13972(2118);
        objInvoke.getClass();
        loadHook((ClassLoader) objInvoke);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract String mo11286();
}
