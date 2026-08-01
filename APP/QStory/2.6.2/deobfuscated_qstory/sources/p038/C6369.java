package p038;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p037.C6356;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C6369 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass;
        Class<?> clsLoadClass2;
        int i = AbstractC6340.f17461;
        if (i >= 5282) {
            clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.QQSettingMe");
            clsLoadClass2 = classLoader.loadClass("com.tencent.mobileqq.QQSettingMeView").getSuperclass();
        } else if (i >= 4938) {
            clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.QQSettingMe");
            clsLoadClass2 = classLoader.loadClass("com.tencent.mobileqq.BaseQQSettingMeView");
        } else {
            clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.activity.QQSettingMe");
            clsLoadClass2 = classLoader.loadClass("com.tencent.mobileqq.activity.BaseQQSettingMeView");
        }
        while (clsLoadClass != null) {
            for (Method method : clsLoadClass.getDeclaredMethods()) {
                method.setAccessible(true);
                if (method.getReturnType() == clsLoadClass2) {
                    XposedBridge.hookMethod(method, new C6356(10));
                    return;
                }
            }
            clsLoadClass = clsLoadClass.getSuperclass();
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u91cd\u542f\u751f\u6548,\u8be5\u9879\u4ec5\u5728\u65e7\u7248\u4fa7\u6ed1\u680f\u751f\u6548";
    }
}
