package p035;

import android.app.Activity;
import android.content.Context;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.javaplugin.JavaPluginLoad;
import lin.xposed.hook.view.main.itemview.Update;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6346 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f17473;

    public C6346(Context context) {
        this.f17473 = context;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals(AbstractC3056.m6668(-3937570435886220711L))) {
            return null;
        }
        boolean zHasUpdate = Update.hasUpdate();
        Context context = this.f17473;
        if (zHasUpdate || Update.mandatoryUpdate()) {
            Update.showUpdateDialog((Activity) context, new ViewOnClickListenerC6336(this));
            return null;
        }
        JavaPluginLoad.showOnlinePluginDialog(context);
        return null;
    }
}
