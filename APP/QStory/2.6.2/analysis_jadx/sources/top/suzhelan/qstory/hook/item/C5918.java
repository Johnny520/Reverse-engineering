package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6314;
import p035.AbstractC6340;
import p053.AbstractC6560;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰世苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5918 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        boolean zM12011 = AbstractC6560.m12011();
        Class cls = Integer.TYPE;
        if (zM12011 && AbstractC6340.f17461 < 5626) {
            Method method = classLoader.loadClass(AbstractC3056.m6668(-3937745335544448423L)).getMethod(AbstractC3056.m6668(-3937745142270920103L), cls);
            AbstractC3056.m6668(-3937744974767195559L);
            method.getClass();
            m11803(method, new C5553(28));
            return;
        }
        Method methodM11822 = AbstractC6314.m11822(AbstractC3056.m6668(-3937744901752751527L), AbstractC3056.m6668(-3937744682709419431L), Void.TYPE, new Class[]{cls, Boolean.TYPE});
        AbstractC3056.m6668(-3937744498025825703L);
        methodM11822.getClass();
        m11803(methodM11822, new C5553(29));
    }
}
