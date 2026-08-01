package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p287.AbstractC8405;
import p392.C9098;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5900 extends AbstractC6311 implements InterfaceC6317 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m11294() {
        Object objM163;
        try {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(2098));
            c9098.m14687(AbstractC8405.m13972(2099));
            objM163 = Result.m8745constructorimpl(c9098.m14690());
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8748exceptionOrNullimpl(objM163) != null) {
            objM163 = EmptyList.INSTANCE;
        }
        return (List) objM163;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static List m11295() {
        Object objM163;
        try {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(2100));
            c9098.m14687(AbstractC8405.m13972(2101));
            ArrayList arrayListM14690 = c9098.m14690();
            AbstractC8405.m13972(1824);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM14690) {
                Method method = (Method) obj;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length >= 2 && AbstractC4395.m8907(parameterTypes[0], String.class) && Bitmap.class.isAssignableFrom(parameterTypes[1]) && AbstractC4395.m8907(method.getReturnType(), Boolean.TYPE)) {
                    arrayList.add(obj);
                }
            }
            objM163 = Result.m8745constructorimpl(arrayList);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8748exceptionOrNullimpl(objM163) != null) {
            objM163 = EmptyList.INSTANCE;
        }
        return (List) objM163;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Iterator it = m11294().iterator();
        while (it.hasNext()) {
            m11831((Method) it.next(), new C5925(this, 14));
        }
        Iterator it2 = m11295().iterator();
        while (it2.hasNext()) {
            m11831((Method) it2.next(), new C5925(15));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2097);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11294();
        m11295();
    }
}
