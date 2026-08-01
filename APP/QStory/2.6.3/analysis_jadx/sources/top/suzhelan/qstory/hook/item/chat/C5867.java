package top.suzhelan.qstory.hook.item.chat;

import bsh.C2633;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6333;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏兰世哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5867 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Member member = null;
        if (!AbstractC3056.m6696()) {
            Method methodM11850 = AbstractC6333.m11850(AbstractC8405.m13972(174), null, Void.TYPE, new Class[]{classLoader.loadClass(AbstractC8405.m13972(175))});
            methodM11850.setAccessible(true);
            m11830(methodM11850, new C5869(1));
            return;
        }
        Method[] declaredMethods = classLoader.loadClass(AbstractC8405.m13972(176)).getDeclaredMethods();
        AbstractC8405.m13972(1555);
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && AbstractC4395.m8907(parameterTypes[0], Integer.TYPE) && AbstractC4395.m8907(parameterTypes[1], String.class)) {
                member = method;
                break;
            }
            i++;
        }
        if (member != null) {
            m11830(member, new C5869(0));
        } else {
            C2633.m5339(AbstractC8405.m13972(177));
        }
    }
}
