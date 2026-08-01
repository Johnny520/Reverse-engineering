package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6333;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰世苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5924 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        boolean zM6696 = AbstractC3056.m6696();
        Class cls = Integer.TYPE;
        if (zM6696 && AbstractC6358.f17508 < 5626) {
            Method method = classLoader.loadClass(AbstractC8405.m13972(1790)).getMethod(AbstractC8405.m13972(1791), cls);
            AbstractC8405.m13972(1792);
            method.getClass();
            m11831(method, new C5554(28));
            return;
        }
        Method methodM11850 = AbstractC6333.m11850(AbstractC8405.m13972(1793), AbstractC8405.m13972(1794), Void.TYPE, new Class[]{cls, Boolean.TYPE});
        AbstractC8405.m13972(1795);
        methodM11850.getClass();
        m11831(methodM11850, new C5554(29));
    }
}
