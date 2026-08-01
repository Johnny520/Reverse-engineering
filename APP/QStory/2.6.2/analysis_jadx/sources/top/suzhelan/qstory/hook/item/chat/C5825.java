package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5825 extends AbstractC6293 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int m11181(C5825 c5825, Object obj) {
        Field field;
        String strM6668;
        if (obj == null) {
            return 99;
        }
        try {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937796613158995367L));
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            AbstractC3056.m6668(-3937756103027459495L);
            declaredFields.getClass();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                if (AbstractC4394.m8917(field.getType(), clsM11838)) {
                    break;
                }
                i++;
            }
            if (field == null) {
                return 0;
            }
            field.setAccessible(true);
            Object obj2 = field.get(obj);
            if (obj2 == null) {
                return 0;
            }
            if (XposedHelpers.getBooleanField(obj2, AbstractC3056.m6668(-3937796419885467047L))) {
                return 3;
            }
            Object objectField = XposedHelpers.getObjectField(obj2, AbstractC3056.m6668(-3937796316806251943L));
            if (objectField == null || (strM6668 = objectField.toString()) == null) {
                strM6668 = AbstractC3056.m6668(-3937561979095614887L);
            }
            if (AbstractC5143.m10171(strM6668, AbstractC3056.m6668(-3937796338281088423L), false)) {
                return 1;
            }
            if (AbstractC5143.m10171(strM6668, AbstractC3056.m6668(-3937796260971677095L), false)) {
                return 2;
            }
            return AbstractC5143.m10171(strM6668, AbstractC3056.m6668(-3937796286741480871L), false) ? 4 : 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        try {
            XposedHelpers.findAndHookMethod(AbstractC6318.m11838(AbstractC3056.m6668(-3937796866562065831L)), AbstractC3056.m6668(-3937796595979126183L), new Object[]{new C5811(this, 18)});
        } catch (Exception unused) {
        }
    }
}
