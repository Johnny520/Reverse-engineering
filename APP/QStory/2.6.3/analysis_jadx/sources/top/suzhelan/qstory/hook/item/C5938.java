package top.suzhelan.qstory.hook.item;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5938 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Method f16129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Class f16130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Class f16131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5937 f16132;

    public C5938(C5937 c5937, Class cls, Class cls2, Method method) {
        this.f16132 = c5937;
        this.f16131 = cls;
        this.f16130 = cls2;
        this.f16129 = method;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Method method;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        C5937 c5937 = this.f16132;
        if (c5937.f17425.booleanValue()) {
            try {
                Object obj = methodHookParam.args[0];
                AbstractC8405.m13972(1543);
                obj.getClass();
                View view = (View) obj;
                Object tag = view.getTag();
                if (tag != null && this.f16131.isInstance(tag)) {
                    Object obj2 = methodHookParam.thisObject;
                    AbstractC8405.m13972(1891);
                    obj2.getClass();
                    Object objM11319 = C5937.m11319(c5937, obj2, this.f16130);
                    if (objM11319 == null || (method = this.f16129) == null) {
                        return;
                    }
                    new Thread(new RunnableC5939(method, objM11319, tag, view, 0)).start();
                }
            } catch (Exception unused) {
            }
        }
    }
}
