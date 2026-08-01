package top.suzhelan.qstory.hook.item;

import android.content.Context;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import p010.C6184;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p287.AbstractC8405;
import p392.C9098;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5926 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16115;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method method = this.f16115;
        if (method != null) {
            XposedBridge.hookMethod(method, new C6184(new C5554(27)));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1780);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(1778));
        c9098.m14687(AbstractC8405.m13972(1779));
        Method methodM14686 = c9098.m14686();
        Class<?> declaringClass = methodM14686 != null ? methodM14686.getDeclaringClass() : null;
        if (declaringClass != null) {
            C9098 c90982 = new C9098();
            c90982.f25495 = declaringClass;
            c90982.m14685(Context.class, String.class);
            c90982.f25493 = String.class;
            this.f16115 = c90982.m14686();
        }
    }
}
