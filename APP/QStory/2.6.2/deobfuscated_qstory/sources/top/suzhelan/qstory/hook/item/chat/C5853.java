package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5912;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5853 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f16009 = AbstractC8189.m13659("\u5373\u5c06\u5f7b\u5e95\u6d88\u5931", "\u52a0\u5165\u4e86\u7fa4\u804a", "\u6211\u4e5f\u8981\u6253\u5361", "\u4e00\u8d77\u6765\u73a9\u5427");

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        Method method2;
        "classLoader";
        classLoader.getClass();
        try {
            Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.graptips.common.CommonGrayTipsComponent");
            Method[] declaredMethods = clsM11838.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i2];
                if (Modifier.isPublic(method2.getModifiers()) && AbstractC4394.m8917(method2.getReturnType(), Void.TYPE) && method2.getParameterTypes().length == 3 && AbstractC4394.m8917(method2.getParameterTypes()[0], Integer.TYPE) && AbstractC4394.m8917(method2.getParameterTypes()[2], List.class)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 == null) {
                return;
            }
            Class clsM118382 = AbstractC6318.m11838("com.tencent.qqnt.aio.widget.AIOMsgTextView");
            Method[] declaredMethods2 = clsM11838.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i];
                if (Modifier.isPrivate(method3.getModifiers()) && AbstractC4394.m8917(method3.getReturnType(), clsM118382)) {
                    method = method3;
                    break;
                }
                i++;
            }
            if (method == null) {
                return;
            }
            method.setAccessible(true);
            XposedBridge.hookMethod(method2, new C5912(method, 4, this));
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u9690\u85cf\u804a\u5929\u754c\u9762\u4e2d\u7684\u7070\u8272\u63d0\u793a\u6587\u672c \u5982\u52a0\u5165\u7fa4\u804a \u6253\u5361";
    }
}
