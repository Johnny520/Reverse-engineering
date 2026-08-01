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
        "loader";
        classLoader.getClass();
        try {
            C9125 c9125M14680 = C9125.m14680(classLoader.loadClass("com.tencent.mobileqq.managers.TempMsgManager"));
            c9125M14680.f25504 = "v";
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
        return "\u5728\u6ca1\u6709\u5f00\u542f\u4e34\u65f6\u4f1a\u8bdd\u7684\u60c5\u51b5\u4e0b\u67e5\u770b\u5df2\u5220\u9664\u597d\u53cb\u7684\u804a\u5929\u8bb0\u5f55 \u5219\u4e0d\u4f1a\u6709\u5f00\u542f\u4e34\u65f6\u4f1a\u8bdd\u5f39\u7a97";
    }
}
