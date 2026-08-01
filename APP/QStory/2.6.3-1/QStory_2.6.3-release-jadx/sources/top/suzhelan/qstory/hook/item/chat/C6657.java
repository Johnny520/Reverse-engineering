package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏哲楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6657 extends AbstractC7140 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m11797(C6657 c6657, Object obj) {
        Field field;
        String string;
        if (obj == null) {
            return 99;
        }
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(2245));
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC9234.m14531(1985);
            declaredFields.getClass();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (AbstractC5227.m9466(field.getType(), clsM12425)) {
                    break;
                }
                i++;
            }
            if (field != null) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    if (XposedHelpers.getBooleanField(obj2, AbstractC9234.m14532("喵喵喵呜呜喵呜喵~喵喵喵喵喵呜呜喵~喵喵呜喵呜喵喵喵~喵喵喵喵喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵呜"))) {
                        return 3;
                    }
                    Object objectField = XposedHelpers.getObjectField(obj2, AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵呜"));
                    if (objectField == null || (string = objectField.toString()) == null) {
                        string = "";
                    }
                    if (AbstractC5976.m10735(string, AbstractC9234.m14532("喵喵呜呜呜呜喵喵~喵喵呜喵喵喵呜喵~喵喵呜呜喵呜喵喵~喵喵呜喵呜呜喵呜~喵喵呜呜喵呜呜呜"), false)) {
                        return 1;
                    }
                    if (AbstractC5976.m10735(string, AbstractC9234.m14532("喵喵呜呜喵喵呜喵~喵喵呜呜喵喵喵呜~喵喵呜呜喵呜呜呜~喵喵呜喵喵喵喵呜~喵喵呜喵呜喵呜呜"), false)) {
                        return 2;
                    }
                    return AbstractC5976.m10735(string, AbstractC9234.m14532("喵喵呜呜呜呜呜喵~喵喵呜呜喵喵喵喵~喵喵呜呜喵呜呜呜~喵喵呜喵呜喵呜喵~喵喵呜喵喵喵喵喵~喵喵呜呜呜呜呜喵"), false) ? 4 : 5;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            XposedHelpers.findAndHookMethod(AbstractC7166.m12425(AbstractC9234.m14531(2243)), AbstractC9234.m14531(2244), new Object[]{new C6642(this, 18)});
        } catch (Exception unused) {
        }
    }
}
