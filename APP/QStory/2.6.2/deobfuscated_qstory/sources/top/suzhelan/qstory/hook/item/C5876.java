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
        "classLoader";
        classLoader.getClass();
        Method declaredMethod = classLoader.loadClass("com.tencent.qqnt.kernel.nativeinterface.XmlElement").getDeclaredMethod("getMembers", null);
        "getDeclaredMethod(...)";
        declaredMethod.getClass();
        m11802(declaredMethod, new C5919(6));
        Constructor constructorM11403 = AbstractC6087.m11403(AbstractC6318.m11838("com.tencent.qqnt.kernelpublic.nativeinterface.JsonGrayElement"), new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC6318.m11838("com.tencent.qqnt.kernelpublic.nativeinterface.XmlToJsonParam")});
        "findConstructor(...)";
        m11803(constructorM11403, new C5919(7));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u6bd4\u5982\u6253\u5361,\u64a4\u56de,\u6233\u4e00\u6233";
    }
}
