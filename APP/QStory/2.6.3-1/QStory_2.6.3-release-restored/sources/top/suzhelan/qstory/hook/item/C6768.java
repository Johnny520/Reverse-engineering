package top.suzhelan.qstory.hook.item;

import android.view.View;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6768 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Method f16474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Class f16475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Class f16476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C6767 f16477;

    public C6768(C6767 c6767, Class cls, Class cls2, Method method) {
        this.f16477 = c6767;
        this.f16476 = cls;
        this.f16475 = cls2;
        this.f16474 = method;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Method method;
        "param";
        methodHookParam.getClass();
        C6767 c6767 = this.f16477;
        if (c6767.f17770.booleanValue()) {
            try {
                Object obj = methodHookParam.args[0];
                "null cannot be cast to non-null type android.view.View";
                obj.getClass();
                View view = (View) obj;
                Object tag = view.getTag();
                if (tag != null && this.f16476.isInstance(tag)) {
                    Object obj2 = methodHookParam.thisObject;
                    "thisObject";
                    obj2.getClass();
                    Object objM11878 = C6767.m11878(c6767, obj2, this.f16475);
                    if (objM11878 == null || (method = this.f16474) == null) {
                        return;
                    }
                    new Thread(new RunnableC6769(method, objM11878, tag, view, 0)).start();
                }
            } catch (Exception unused) {
            }
        }
    }
}
