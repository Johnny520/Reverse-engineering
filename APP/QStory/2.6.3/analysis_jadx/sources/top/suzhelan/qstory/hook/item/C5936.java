package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C1245;
import com.android.dx.io.Opcodes;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C5565;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p026.C6313;
import p033.AbstractC6337;
import p033.C6335;
import p034.AbstractC6347;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5936 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object f16128;

    static {
        AbstractC8405.m13973(AbstractC8405.m13972(2019));
        AbstractC8405.m13972(1990);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11318(String str, int i, Object obj, Object obj2, Class cls, Class cls2) {
        try {
            Object objNewInstance = cls.newInstance();
            XposedHelpers.setIntField(objNewInstance, AbstractC8405.m13972(338), 4);
            XposedHelpers.setIntField(obj, AbstractC8405.m13972(722), 2);
            XposedHelpers.setIntField(obj, AbstractC8405.m13972(2010), 0);
            XposedHelpers.setObjectField(objNewInstance, AbstractC8405.m13972(1992), obj);
            XposedHelpers.callMethod(obj2, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵"), new Object[]{cls2.getConstructor(Integer.TYPE, String.class, String.class).newInstance(Integer.valueOf(i == 0 ? 1 : 2), str, ""), AbstractC6347.m11912(objNewInstance), null});
        } catch (Exception e) {
            XposedBridge.log(AbstractC8405.m13972(2011) + str + AbstractC8405.m13972(2012) + e.getMessage());
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
        String[] strArr = {AbstractC8405.m13972(Opcodes.REM_INT_LIT16)};
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(163));
        C6335 c6335M11854 = C6335.m11854(clsM118662);
        c6335M11854.f17458.f3617 = clsM11866;
        Method methodM11855 = c6335M11854.m11855();
        C6335 c6335M118542 = C6335.m11854(clsM118662);
        c6335M118542.f17458.f3617 = List.class;
        Method methodM118552 = c6335M118542.m11855();
        C6335 c6335M11853 = C6335.m11853(strArr[0]);
        String name = methodM118552.getName();
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3618 = name;
        c1245.f3617 = List.class;
        XposedBridge.hookMethod(c6335M11853.m11855(), new C6313(this, new C5565(methodM11855, clsM11866, this, 3)));
        try {
            Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(2006));
            Field declaredField = clsM118663.getDeclaredField(AbstractC8405.m13972(2007));
            declaredField.setAccessible(true);
            String strM13972 = AbstractC8405.m13972(2008);
            Class cls = Integer.TYPE;
            Method declaredMethod = clsM118663.getDeclaredMethod(strM13972, cls, String.class, cls);
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C5918(declaredField, this, classLoader));
        } catch (Exception e) {
            XposedBridge.log(AbstractC8405.m13972(2009) + e.getMessage());
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1991);
    }
}
