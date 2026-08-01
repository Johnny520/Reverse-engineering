package p052;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.javaplugin.JavaPluginLoad;
import lin.xposed.hook.view.main.itemview.Update;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7183 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f17847;

    public C7183(Context context) {
        this.f17847 = context;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("invoke")) {
            return null;
        }
        boolean zHasUpdate = Update.hasUpdate();
        Context context = this.f17847;
        if (zHasUpdate || Update.mandatoryUpdate()) {
            Update.showUpdateDialog((Activity) context, new ViewOnClickListenerC7184(this));
            return null;
        }
        JavaPluginLoad.showOnlinePluginDialog(context);
        return null;
    }
}
