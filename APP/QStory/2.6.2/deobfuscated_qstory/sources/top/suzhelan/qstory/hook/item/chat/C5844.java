package top.suzhelan.qstory.hook.item.chat;

import android.os.Bundle;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p392.AbstractC9121;
import p392.C9125;
import top.suzhelan.qstory.hook.item.C5912;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5844 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        try {
            Class clsM14657 = AbstractC9121.m14657("com.tencent.mobileqq.aio.panel.photo.PhotoPanelVB");
            if (clsM14657 != null) {
                C9125 c9125M14680 = C9125.m14680(clsM14657);
                c9125M14680.f25504 = "handleUIState";
                Method method = (Method) c9125M14680.m14686();
                if (method != null) {
                    XposedBridge.hookMethod(method, new C5912(this, 3, clsM14657));
                }
            }
            Class clsM146572 = AbstractC9121.m14657("com.tencent.qqnt.qbasealbum.model.Config");
            if (clsM146572 != null) {
                String strM6668 = AbstractC6340.f17461 >= 9898 ? "s" : "q";
                C9125 c9125M146802 = C9125.m14680(clsM146572);
                c9125M146802.f25504 = strM6668;
                c9125M146802.f25506 = Boolean.TYPE;
                Method method2 = (Method) c9125M146802.m14686();
                if (method2 != null) {
                    XposedBridge.hookMethod(method2, new C5845(this, 0));
                }
            }
            Class clsM146573 = AbstractC9121.m14657("com.tencent.qqnt.qbasealbum.WinkHomeActivity");
            if (clsM146573 != null) {
                C9125 c9125M146803 = C9125.m14680(clsM146573);
                c9125M146803.f25504 = "onCreate";
                c9125M146803.m14683(Bundle.class);
                Method method3 = (Method) c9125M146803.m14686();
                if (method3 != null) {
                    XposedBridge.hookMethod(method3, new C5845(this, 1));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u9002\u914dQQNT \u4e0d\u652f\u6301\u9891\u9053";
    }
}
