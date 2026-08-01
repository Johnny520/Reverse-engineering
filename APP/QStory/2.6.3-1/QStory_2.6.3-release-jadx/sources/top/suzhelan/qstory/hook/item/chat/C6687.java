package top.suzhelan.qstory.hook.item.chat;

import android.view.ViewGroup;
import android.widget.EditText;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏世哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6687 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            Method[] declaredMethods = AbstractC7166.m12425(AbstractC9234.m14531(2173)).getDeclaredMethods();
            AbstractC9234.m14531(1555);
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (method.getParameterTypes().length == 3 && AbstractC5227.m9466(method.getParameterTypes()[0], ViewGroup.class) && AbstractC5227.m9466(method.getParameterTypes()[1], EditText.class) && AbstractC5227.m9466(method.getParameterTypes()[2], ViewGroup.class)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6642(this, 15));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2172);
    }
}
