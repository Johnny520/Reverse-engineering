package top.suzhelan.qstory.hook.item.chat;

import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6314;
import p053.AbstractC6560;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏兰世哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5862 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        Member member = null;
        if (!AbstractC6560.m12011()) {
            Method methodM11822 = AbstractC6314.m11822("com.tencent.mobileqq.activity.aio.panel.PanelIconLinearLayout", null, Void.TYPE, new Class[]{classLoader.loadClass("com.tencent.mobileqq.activity.aio.core.BaseChatPie")});
            methodM11822.setAccessible(true);
            m11802(methodM11822, new C5864(1));
            return;
        }
        Method[] declaredMethods = classLoader.loadClass("com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout").getDeclaredMethods();
        "getDeclaredMethods(...)";
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && AbstractC4394.m8917(parameterTypes[0], Integer.TYPE) && AbstractC4394.m8917(parameterTypes[1], String.class)) {
                member = method;
                break;
            }
            i++;
        }
        if (member != null) {
            m11802(member, new C5864(0));
        } else {
            C2632.m5294("No method found");
        }
    }
}
