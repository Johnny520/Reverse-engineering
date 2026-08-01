package top.suzhelan.qstory.hook.item.chat;

import android.view.ViewGroup;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏世哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5852 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        "classLoader";
        classLoader.getClass();
        try {
            Method[] declaredMethods = AbstractC6318.m11838("com.tencent.mobileqq.activity.editservice.EditTroopMemberNickService").getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (method.getParameterTypes().length == 3 && AbstractC4394.m8917(method.getParameterTypes()[0], ViewGroup.class) && AbstractC4394.m8917(method.getParameterTypes()[1], EditText.class) && AbstractC4394.m8917(method.getParameterTypes()[2], ViewGroup.class)) {
                    break;
                } else {
                    i++;
                }
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5811(this, 15));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5bf9\u7f16\u8f91\u7fa4\u6635\u79f0\u754c\u9762\u7684\u88c5\u626e\u5e03\u5c40\u8fdb\u884c\u9690\u85cf";
    }
}
