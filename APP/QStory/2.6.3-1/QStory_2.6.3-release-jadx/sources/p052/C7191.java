package p052;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.javaplugin.JavaPluginLoad;
import lin.xposed.hook.view.main.itemview.Update;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7191 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f17862;

    public C7191(Context context) {
        this.f17862 = context;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals(AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"))) {
            return null;
        }
        boolean zHasUpdate = Update.hasUpdate();
        Context context = this.f17862;
        if (zHasUpdate || Update.mandatoryUpdate()) {
            Update.showUpdateDialog((Activity) context, new ViewOnClickListenerC7192(this));
            return null;
        }
        JavaPluginLoad.showPluginDialog(context);
        return null;
    }
}
