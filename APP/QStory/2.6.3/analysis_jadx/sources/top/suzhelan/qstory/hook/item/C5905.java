package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.view.View;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import p392.C9102;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世苏兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5905 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Class clsM14696;
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            try {
                C9102 c9102 = new C9102();
                c9102.m14695(AbstractC8405.m13972(2067));
                c9102.m14695(AbstractC8405.m13972(2068));
                c9102.m14695(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜"));
                clsM14696 = c9102.m14696();
            } catch (Exception e) {
                e.printStackTrace();
                clsM14696 = null;
            }
            if (clsM14696 != null) {
                Constructor<?>[] declaredConstructors = clsM14696.getDeclaredConstructors();
                declaredConstructors.getClass();
                for (Constructor<?> constructor : declaredConstructors) {
                    XposedBridge.hookMethod(constructor, new C5942(this, 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC8405.m13972(2065), classLoader);
            if (clsFindClassIfExists != null) {
                String strM13972 = AbstractC8405.m13972(2066);
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                XposedHelpers.findAndHookMethod(clsFindClassIfExists, strM13972, new Object[]{Context.class, String.class, CharSequence.class, String.class, String.class, cls, cls2, cls2, View.OnClickListener.class, View.OnClickListener.class, new C5942(this, 1)});
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
