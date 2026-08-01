package p052;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lin.xposed.hook.view.main.itemview.Update;
import top.suzhelan.qstory.p015ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7196 implements InvocationHandler {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f17867;

    public C7196(Context context) {
        this.f17867 = context;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("invoke")) {
            return null;
        }
        boolean zHasUpdate = Update.hasUpdate();
        Context context = this.f17867;
        if (zHasUpdate) {
            Update.showUpdateDialog((Activity) context, new ViewOnClickListenerC7195(this));
            return null;
        }
        context.startActivity(new Intent(context, (Class<?>) SettingActivity.class));
        return null;
    }
}
