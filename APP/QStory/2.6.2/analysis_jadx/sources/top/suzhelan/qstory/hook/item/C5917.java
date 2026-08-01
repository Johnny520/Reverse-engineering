package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲世苏兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5917 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        try {
            C9125 c9125M14680 = C9125.m14680(classLoader.loadClass(AbstractC3056.m6668(-3937730204374664615L)));
            c9125M14680.f25504 = AbstractC3056.m6668(-3937602712565450151L);
            c9125M14680.m14683(String.class);
            Method method = (Method) c9125M14680.m14685();
            if (method == null) {
                return;
            }
            m11803(method, new C5553(26));
        } catch (ClassNotFoundException unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937730449187800487L);
    }
}
