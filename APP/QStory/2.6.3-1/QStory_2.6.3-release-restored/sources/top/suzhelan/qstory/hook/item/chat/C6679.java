package top.suzhelan.qstory.hook.item.chat;

import android.os.Bundle;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p405.AbstractC9919;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6748;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6679 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        try {
            Class clsM15228 = AbstractC9919.m15228("com.tencent.mobileqq.aio.panel.photo.PhotoPanelVB");
            if (clsM15228 != null) {
                C9921 c9921M15231 = C9921.m15231(clsM15228);
                c9921M15231.f25826 = "handleUIState";
                Method method = (Method) c9921M15231.m15164();
                if (method != null) {
                    XposedBridge.hookMethod(method, new C6748(this, 3, clsM15228));
                }
            }
            Class clsM152282 = AbstractC9919.m15228("com.tencent.qqnt.qbasealbum.model.Config");
            if (clsM152282 != null) {
                String strM14532 = (AbstractC7187.f17853 >= 9898 ? "s" : "q");
                C9921 c9921M152312 = C9921.m15231(clsM152282);
                c9921M152312.f25826 = strM14532;
                c9921M152312.f25828 = Boolean.TYPE;
                Method method2 = (Method) c9921M152312.m15164();
                if (method2 != null) {
                    XposedBridge.hookMethod(method2, new C6680(this, 0));
                }
            }
            Class clsM152283 = AbstractC9919.m15228("com.tencent.qqnt.qbasealbum.WinkHomeActivity");
            if (clsM152283 != null) {
                C9921 c9921M152313 = C9921.m15231(clsM152283);
                c9921M152313.f25826 = "onCreate";
                c9921M152313.m15234(Bundle.class);
                Method method3 = (Method) c9921M152313.m15164();
                if (method3 != null) {
                    XposedBridge.hookMethod(method3, new C6680(this, 1));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "适配QQNT 不支持频道";
    }
}
