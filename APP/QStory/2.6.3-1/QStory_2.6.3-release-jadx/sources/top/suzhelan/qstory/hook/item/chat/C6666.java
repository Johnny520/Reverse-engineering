package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import com.bumptech.glide.AbstractC3888;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7017;
import p049.C7164;
import p050.AbstractC7173;
import p052.AbstractC7187;
import p303.AbstractC9234;
import p348.C9614;
import p353.AbstractC9632;
import top.suzhelan.qstory.hook.api.C6648;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6666 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ConcurrentHashMap f16324;

    static {
        AbstractC9234.m14531(160);
        AbstractC9234.m14531(2132);
        f16324 = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static Long m11807(Object obj, String str) {
        Object objM11808 = m11808(obj, str);
        if (objM11808 == null) {
            return null;
        }
        if (objM11808 instanceof Long) {
            return (Long) objM11808;
        }
        if (objM11808 instanceof Integer) {
            return Long.valueOf(((Number) objM11808).intValue());
        }
        if (objM11808 instanceof Number) {
            return Long.valueOf(((Number) objM11808).longValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Object m11808(Object obj, String str) {
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

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Object objM723;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        if (AbstractC3888.m7256()) {
            try {
                m11809();
                objM723 = Result.m9304constructorimpl(C6008.f15084);
            } catch (Throwable th) {
                objM723 = AbstractC0900.m723(th);
            }
            Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(objM723);
            if (thM9307exceptionOrNullimpl != null) {
                AbstractC7017.m12164(AbstractC9234.m14531(2188), AbstractC9234.m14531(2189), thM9307exceptionOrNullimpl, true);
            }
            HashMap map = C6648.f16294;
            AbstractC7173.m12433(this, new C6667(this, 0));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2187);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m11809() {
        Method methodM12414;
        if (AbstractC7187.f17853 >= 5028) {
            C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(158));
            String strM14532 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C2080 c2080 = c7164M12412.f17803;
            c2080.f3963 = strM14532;
            c2080.f3964 = new Class[]{Object.class, View.class};
            methodM12414 = c7164M12412.m12414();
        } else {
            C7164 c7164M124122 = C7164.m12412(AbstractC9234.m14531(159));
            String strM145322 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
            C2080 c20802 = c7164M124122.f17803;
            c20802.f3963 = strM145322;
            c20802.f3964 = new Class[]{Object.class};
            methodM12414 = c7164M124122.m12414();
        }
        m12390(methodM12414, new C3191(this, 8));
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
