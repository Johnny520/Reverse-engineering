package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p394.C9131;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲世楪;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5936 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Class clsM14701;
        "loader";
        classLoader.getClass();
        try {
            try {
                C9131 c9131 = new C9131();
                c9131.m14699("com.tencent.biz.qrcode.activity.QRLoginAuthActivity");
                c9131.m14699("onFinish");
                c9131.m14699("onTick");
                clsM14701 = c9131.m14701();
            } catch (Exception e) {
                e.printStackTrace();
                clsM14701 = null;
            }
            if (clsM14701 != null) {
                Constructor<?>[] declaredConstructors = clsM14701.getDeclaredConstructors();
                declaredConstructors.getClass();
                for (Constructor<?> constructor : declaredConstructors) {
                    XposedBridge.hookMethod(constructor, new C5937(this, 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.utils.DialogUtil", classLoader);
            if (clsFindClassIfExists != null) {
                String strM6668 = "createCountdownDialog";
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                XposedHelpers.findAndHookMethod(clsFindClassIfExists, strM6668, new Object[]{Context.class, String.class, CharSequence.class, String.class, String.class, cls, cls2, cls2, View.OnClickListener.class, View.OnClickListener.class, new C5937(this, 1)});
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
