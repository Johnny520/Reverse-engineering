package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.view.View;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p303.AbstractC9234;
import p408.C9931;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世苏兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6735 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class clsM15255;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            try {
                C9931 c9931 = new C9931();
                c9931.m15254(AbstractC9234.m14531(2067));
                c9931.m15254(AbstractC9234.m14531(2068));
                c9931.m15254(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜"));
                clsM15255 = c9931.m15255();
            } catch (Exception e) {
                e.printStackTrace();
                clsM15255 = null;
            }
            if (clsM15255 != null) {
                Constructor<?>[] declaredConstructors = clsM15255.getDeclaredConstructors();
                declaredConstructors.getClass();
                for (Constructor<?> constructor : declaredConstructors) {
                    XposedBridge.hookMethod(constructor, new C6772(this, 0));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2065), classLoader);
            if (clsFindClassIfExists != null) {
                String strM14531 = AbstractC9234.m14531(2066);
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                XposedHelpers.findAndHookMethod(clsFindClassIfExists, strM14531, new Object[]{Context.class, String.class, CharSequence.class, String.class, String.class, cls, cls2, cls2, View.OnClickListener.class, View.OnClickListener.class, new C6772(this, 1)});
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }
}
