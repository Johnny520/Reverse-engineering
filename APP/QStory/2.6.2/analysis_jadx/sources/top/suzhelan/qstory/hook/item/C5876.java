package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p000.AbstractC6087;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏楪哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5876 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Method declaredMethod = classLoader.loadClass(AbstractC3056.m6668(-3937762558363305383L)).getDeclaredMethod(AbstractC3056.m6668(-3937762330730038695L), null);
        AbstractC3056.m6668(-3937762274895463847L);
        declaredMethod.getClass();
        m11802(declaredMethod, new C5919(6));
        Constructor constructorM11403 = AbstractC6087.m11403(AbstractC6318.m11838(AbstractC3056.m6668(-3937762098801804711L)), new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC6318.m11838(AbstractC3056.m6668(-3937761918413178279L))});
        AbstractC3056.m6668(-3937761665010107815L);
        m11803(constructorM11403, new C5919(7));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937762609902912935L);
    }
}
