package top.suzhelan.qstory.hook.item;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5933 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Method f16125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Class f16126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Class f16127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5932 f16128;

    public C5933(C5932 c5932, Class cls, Class cls2, Method method) {
        this.f16128 = c5932;
        this.f16127 = cls;
        this.f16126 = cls2;
        this.f16125 = method;
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Method method;
        "param";
        methodHookParam.getClass();
        C5932 c5932 = this.f16128;
        if (c5932.f17376.booleanValue()) {
            try {
                Object obj = methodHookParam.args[0];
                "null cannot be cast to non-null type android.view.View";
                obj.getClass();
                View view = (View) obj;
                Object tag = view.getTag();
                if (tag != null && this.f16127.isInstance(tag)) {
                    Object obj2 = methodHookParam.thisObject;
                    "thisObject";
                    obj2.getClass();
                    Object objM11262 = C5932.m11262(c5932, obj2, this.f16126);
                    if (objM11262 == null || (method = this.f16125) == null) {
                        return;
                    }
                    new Thread(new RunnableC5949(method, objM11262, tag, view, 0)).start();
                }
            } catch (Exception unused) {
            }
        }
    }
}
