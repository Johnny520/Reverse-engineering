package top.suzhelan.qstory.hook.api;

import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p026.AbstractC6298;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p035.AbstractC6340;
import p392.AbstractC9124;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰", "top/suzhelan/qstory/hook/api/飘花落叶言子楪世兰哲苏", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5817 extends AbstractC6298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final HashMap f15949 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11175(C5817 c5817, XC_MethodHook.MethodHookParam methodHookParam) {
        try {
            Object obj = methodHookParam.thisObject;
            C6316 c6316M11826 = C6316.m11826(obj.getClass());
            c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937593186327987623L);
            View view = (View) c6316M11826.m11828(obj, new Object[0]);
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937564551781025191L));
            HashMap map = AbstractC6317.f17410;
            Object obj2 = AbstractC6317.m11833(obj.getClass(), clsM11838).get(obj);
            if (obj2 != null && view != null) {
                C6316 c6316M118262 = C6316.m11826(obj2.getClass());
                c6316M118262.f17409.f3617 = AbstractC3056.m6668(-3937563495219070375L);
                Object objM11828 = c6316M118262.m11828(obj2, new Object[0]);
                for (Object obj3 : f15949.entrySet()) {
                    AbstractC3056.m6668(-3937693873246307751L);
                    obj3.getClass();
                    Map.Entry entry = (Map.Entry) obj3;
                    Object key = entry.getKey();
                    AbstractC3056.m6668(-3937712766807442855L);
                    key.getClass();
                    AbstractC6293 abstractC6293 = (AbstractC6293) key;
                    if (abstractC6293.f17376.booleanValue()) {
                        try {
                            Object value = entry.getValue();
                            AbstractC3056.m6668(-3937712693792998823L);
                            value.getClass();
                            objM11828.getClass();
                            ((InterfaceC5808) value).mo11172(objM11828, view);
                        } catch (Throwable th) {
                            abstractC6293.getExceptionCollectionToolInstance().m11804(th);
                        }
                    }
                }
            }
        } catch (Exception e) {
            c5817.getExceptionCollectionToolInstance().m11804(e);
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        int i = AbstractC6340.f17461;
        Class cls = Void.TYPE;
        if (i >= 12290) {
            C9125 c9125M14681 = C9125.m14681(AbstractC3056.m6668(-3937594028141577639L));
            c9125M14681.f25504 = AbstractC3056.m6668(-3937714871341417895L);
            c9125M14681.m14683(AbstractC6318.m11838(AbstractC3056.m6668(-3937714828391744935L)));
            c9125M14681.f25506 = cls;
            XposedBridge.hookMethod((Method) c9125M14681.m14686(), new C5818(this, 1));
            return;
        }
        C9125 c9125M14680 = C9125.m14680(AbstractC6318.m11838(AbstractC3056.m6668(-3937594028141577639L)));
        c9125M14680.m14683(Integer.TYPE, AbstractC9124.class, List.class, Bundle.class);
        c9125M14680.f25506 = cls;
        Member memberM14686 = c9125M14680.m14686();
        AbstractC3056.m6668(-3937714995895469479L);
        memberM14686.getClass();
        XposedBridge.hookMethod((Method) memberM14686, new C5818(this, 0));
    }
}
