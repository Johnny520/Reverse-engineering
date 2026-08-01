package p036;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.view.main.itemview.Update;
import p287.AbstractC8405;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6367 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f17522;

    public C6367(Context context) {
        this.f17522 = context;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals(AbstractC8405.m13973("喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜"))) {
            return null;
        }
        boolean zHasUpdate = Update.hasUpdate();
        Context context = this.f17522;
        if (zHasUpdate) {
            Update.showUpdateDialog((Activity) context, new ViewOnClickListenerC6366(this));
            return null;
        }
        context.startActivity(new Intent(context, (Class<?>) SettingActivity.class));
        return null;
    }
}
