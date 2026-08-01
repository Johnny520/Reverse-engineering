package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C5564;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p026.AbstractC6293;
import p026.C6295;
import p032.AbstractC6318;
import p032.C6316;
import p253.AbstractC8189;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5931 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object f16124;

    static {
        AbstractC3056.m6668(-3937772913529456039L);
        AbstractC3056.m6668(-3937772896349586855L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11261(String str, int i, Object obj, Object obj2, Class cls, Class cls2) {
        try {
            Object objNewInstance = cls.newInstance();
            XposedHelpers.setIntField(objNewInstance, AbstractC3056.m6668(-3937563452269397415L), 4);
            XposedHelpers.setIntField(obj, AbstractC3056.m6668(-3937625149474604455L), 2);
            XposedHelpers.setIntField(obj, AbstractC3056.m6668(-3937771358751294887L), 0);
            XposedHelpers.setObjectField(objNewInstance, AbstractC3056.m6668(-3937772758910633383L), obj);
            XposedHelpers.callMethod(obj2, AbstractC3056.m6668(-3937579786030024103L), new Object[]{cls2.getConstructor(Integer.TYPE, String.class, String.class).newInstance(Integer.valueOf(i == 0 ? 1 : 2), str, AbstractC3056.m6668(-3937561979095614887L)), AbstractC8189.m13670(objNewInstance), null});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            AbstractC6136.m11544(-3937771290031818151L, sb, str);
            sb.append(AbstractC3056.m6668(-3937771225607308711L));
            sb.append(e.getMessage());
            XposedBridge.log(sb.toString());
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
        String[] strArr = {AbstractC3056.m6668(-3937571526807913895L)};
        Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937563963370505639L));
        C6316 c6316M11826 = C6316.m11826(clsM118382);
        c6316M11826.f17409.f3616 = clsM11838;
        Method methodM11827 = c6316M11826.m11827();
        C6316 c6316M118262 = C6316.m11826(clsM118382);
        c6316M118262.f17409.f3616 = List.class;
        Method methodM118272 = c6316M118262.m11827();
        C6316 c6316M11825 = C6316.m11825(strArr[0]);
        String name = methodM118272.getName();
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3617 = name;
        c1245.f3616 = List.class;
        XposedBridge.hookMethod(c6316M11825.m11827(), new C6295(this, new C5564(methodM11827, clsM11838, this, 3)));
        try {
            Class clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937771887032272295L));
            Field declaredField = clsM118383.getDeclaredField(AbstractC3056.m6668(-3937771676578874791L));
            declaredField.setAccessible(true);
            String strM6668 = AbstractC3056.m6668(-3937771620744299943L);
            Class cls = Integer.TYPE;
            Method declaredMethod = clsM118383.getDeclaredMethod(strM6668, cls, String.class, cls);
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C5912(declaredField, this, classLoader));
        } catch (Exception e) {
            XposedBridge.log(AbstractC3056.m6668(-3937771552024823207L) + e.getMessage());
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937772806155273639L);
    }
}
