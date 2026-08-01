package top.suzhelan.qstory.hook.item;

import android.widget.TextView;
import com.bumptech.glide.AbstractC3888;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p050.AbstractC7176;
import p052.AbstractC7187;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲苏世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6749 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            int i = AbstractC7187.f17853;
            boolean zM7256 = AbstractC3888.m7256();
            if (i >= 5626) {
                try {
                    Class<?> clsLoadClass = classLoader.loadClass("com.tencent.qqnt.kernel.nativeinterface.VASMsgFont");
                    XposedBridge.hookAllConstructors(clsLoadClass, new C6748(this, 0, clsLoadClass));
                    return;
                } catch (ClassNotFoundException unused) {
                    m11858(classLoader);
                    return;
                }
            }
            if (!zM7256) {
                m11858(classLoader);
                return;
            }
            try {
                Class<?> clsLoadClass2 = classLoader.loadClass("com.tencent.qqnt.kernel.nativeinterface.VASMsgFont");
                try {
                    XposedBridge.hookMethod(clsLoadClass2.getDeclaredMethod("getFontId", null), new C6751(this, 2));
                } catch (NoSuchMethodException unused2) {
                }
                XposedBridge.hookMethod(clsLoadClass2.getDeclaredMethod("getMagicFontType", null), new C6751(this, 3));
            } catch (ClassNotFoundException unused3) {
                m11858(classLoader);
            }
        } catch (NoSuchMethodException | Exception unused4) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "重启生效";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11858(ClassLoader classLoader) {
        try {
            XposedBridge.hookMethod(classLoader.loadClass("com.tencent.mobileqq.vas.font.api.impl.FontManagerServiceImpl").getDeclaredMethod("enlargeTextMsg", TextView.class), new C6751(this, 0));
        } catch (Exception unused) {
        }
        try {
            Iterator it = AbstractC7176.m12490("com.tencent.mobileqq.activity.aio.item.TextItemBuilder", "com.tencent.mobileqq.aio.item.TextItemBuilder").iterator();
            while (it.hasNext()) {
                try {
                    Method[] declaredMethods = classLoader.loadClass((String) it.next()).getDeclaredMethods();
                    declaredMethods.getClass();
                    int length = declaredMethods.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Method method = declaredMethods[i];
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 2) {
                                Class<?> cls = parameterTypes[0];
                                Class<?> cls2 = parameterTypes[1];
                                String name = cls.getName();
                                "getName(...)";
                                if (AbstractC5976.m10735(name, "ViewHolder", false)) {
                                    String name2 = cls2.getName();
                                    "getName(...)";
                                    if (AbstractC5976.m10735(name2, "ChatMessage", false)) {
                                        XposedBridge.hookMethod(method, new C6751(this, 1));
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                        }
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        } catch (Exception unused3) {
        }
    }
}
