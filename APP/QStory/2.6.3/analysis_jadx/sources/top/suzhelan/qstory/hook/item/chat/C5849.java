package top.suzhelan.qstory.hook.item.chat;

import android.os.Bundle;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5918;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5849 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            Class clsM14669 = AbstractC9090.m14669(AbstractC8405.m13972(2138));
            if (clsM14669 != null) {
                C9092 c9092M14672 = C9092.m14672(clsM14669);
                c9092M14672.f25481 = AbstractC8405.m13972(1550);
                Method method = (Method) c9092M14672.m14605();
                if (method != null) {
                    XposedBridge.hookMethod(method, new C5918(this, 3, clsM14669));
                }
            }
            Class clsM146692 = AbstractC9090.m14669(AbstractC8405.m13972(2139));
            if (clsM146692 != null) {
                String strM13973 = AbstractC8405.m13973(AbstractC6358.f17508 >= 9898 ? "喵喵喵喵喵喵喵喵" : "喵喵喵喵喵喵呜喵");
                C9092 c9092M146722 = C9092.m14672(clsM146692);
                c9092M146722.f25481 = strM13973;
                c9092M146722.f25483 = Boolean.TYPE;
                Method method2 = (Method) c9092M146722.m14605();
                if (method2 != null) {
                    XposedBridge.hookMethod(method2, new C5850(this, 0));
                }
            }
            Class clsM146693 = AbstractC9090.m14669(AbstractC8405.m13972(2140));
            if (clsM146693 != null) {
                C9092 c9092M146723 = C9092.m14672(clsM146693);
                c9092M146723.f25481 = AbstractC8405.m13972(73);
                c9092M146723.m14675(Bundle.class);
                Method method3 = (Method) c9092M146723.m14605();
                if (method3 != null) {
                    XposedBridge.hookMethod(method3, new C5850(this, 1));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2137);
    }
}
