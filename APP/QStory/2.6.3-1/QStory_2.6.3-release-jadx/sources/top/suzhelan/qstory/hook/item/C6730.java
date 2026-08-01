package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import androidx.activity.AbstractC0900;
import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p303.AbstractC9234;
import p408.C9927;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6730 extends AbstractC7140 implements InterfaceC7146 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m11853() {
        Object objM723;
        try {
            C9927 c9927 = new C9927();
            c9927.m15247(AbstractC9234.m14531(2098));
            c9927.m15246(AbstractC9234.m14531(2099));
            objM723 = Result.m9304constructorimpl(c9927.m15249());
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9307exceptionOrNullimpl(objM723) != null) {
            objM723 = EmptyList.INSTANCE;
        }
        return (List) objM723;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static List m11854() {
        Object objM723;
        try {
            C9927 c9927 = new C9927();
            c9927.m15247(AbstractC9234.m14531(2100));
            c9927.m15246(AbstractC9234.m14531(2101));
            ArrayList arrayListM15249 = c9927.m15249();
            AbstractC9234.m14531(1824);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM15249) {
                Method method = (Method) obj;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length >= 2 && AbstractC5227.m9466(parameterTypes[0], String.class) && Bitmap.class.isAssignableFrom(parameterTypes[1]) && AbstractC5227.m9466(method.getReturnType(), Boolean.TYPE)) {
                    arrayList.add(obj);
                }
            }
            objM723 = Result.m9304constructorimpl(arrayList);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9307exceptionOrNullimpl(objM723) != null) {
            objM723 = EmptyList.INSTANCE;
        }
        return (List) objM723;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Iterator it = m11853().iterator();
        while (it.hasNext()) {
            m12390((Method) it.next(), new C6755(this, 14));
        }
        Iterator it2 = m11854().iterator();
        while (it2.hasNext()) {
            m12390((Method) it2.next(), new C6755(15));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2097);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11853();
        m11854();
    }
}
