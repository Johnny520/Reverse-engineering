package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Result;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6188;
import p033.C6335;
import p034.AbstractC6344;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import top.suzhelan.qstory.hook.api.C5818;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5836 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f15979;

    static {
        AbstractC8405.m13972(160);
        AbstractC8405.m13972(2132);
        f15979 = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Long m11248(Object obj, String str) {
        Object objM11249 = m11249(obj, str);
        if (objM11249 == null) {
            return null;
        }
        if (objM11249 instanceof Long) {
            return (Long) objM11249;
        }
        if (objM11249 instanceof Integer) {
            return Long.valueOf(((Number) objM11249).intValue());
        }
        if (objM11249 instanceof Number) {
            return Long.valueOf(((Number) objM11249).longValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Object m11249(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
            }
        }
        return null;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Object objM163;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        if (AbstractC3056.m6696()) {
            try {
                m11250();
                objM163 = Result.m8745constructorimpl(C5176.f14739);
            } catch (Throwable th) {
                objM163 = AbstractC0053.m163(th);
            }
            Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(objM163);
            if (thM8748exceptionOrNullimpl != null) {
                AbstractC6188.m11605(AbstractC8405.m13972(2188), AbstractC8405.m13972(2189), thM8748exceptionOrNullimpl, true);
            }
            HashMap map = C5818.f15949;
            AbstractC6344.m11874(this, new C5837(this, 0));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2187);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m11250() {
        Method methodM11855;
        if (AbstractC6358.f17508 >= 5028) {
            C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(158));
            String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C1245 c1245 = c6335M11853.f17458;
            c1245.f3618 = strM13973;
            c1245.f3619 = new Class[]{Object.class, View.class};
            methodM11855 = c6335M11853.m11855();
        } else {
            C6335 c6335M118532 = C6335.m11853(AbstractC8405.m13972(159));
            String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C1245 c12452 = c6335M118532.f17458;
            c12452.f3618 = strM139732;
            c12452.f3619 = new Class[]{Object.class};
            methodM11855 = c6335M118532.m11855();
        }
        m11831(methodM11855, new C2358(this, 8));
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
