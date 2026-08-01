package top.suzhelan.qstory.hook.item.chat;

import bsh.C3466;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7162;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏兰世哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6697 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        Member member = null;
        if (!AbstractC3888.m7256()) {
            Method methodM12409 = AbstractC7162.m12409("com.tencent.mobileqq.activity.aio.panel.PanelIconLinearLayout", null, Void.TYPE, new Class[]{classLoader.loadClass("com.tencent.mobileqq.activity.aio.core.BaseChatPie")});
            methodM12409.setAccessible(true);
            m12389(methodM12409, new C6699(1));
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
            if (parameterTypes.length == 3 && AbstractC5227.m9466(parameterTypes[0], Integer.TYPE) && AbstractC5227.m9466(parameterTypes[1], String.class)) {
                member = method;
                break;
            }
            i++;
        }
        if (member != null) {
            m12389(member, new C6699(0));
        } else {
            C3466.m5899("No method found");
        }
    }
}
