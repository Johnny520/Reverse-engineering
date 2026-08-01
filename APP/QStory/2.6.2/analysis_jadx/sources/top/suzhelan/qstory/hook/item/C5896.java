package top.suzhelan.qstory.hook.item;

import android.graphics.Bitmap;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p394.C9127;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5896 extends AbstractC6293 implements InterfaceC6152 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static List m11233() {
        Object objM162;
        try {
            C9127 c9127 = new C9127();
            c9127.m14689(AbstractC3056.m6668(-3937778518461777319L));
            c9127.m14688(AbstractC3056.m6668(-3937778389612758439L));
            objM162 = Result.m8755constructorimpl(c9127.m14695());
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8758exceptionOrNullimpl(objM162) != null) {
            objM162 = EmptyList.INSTANCE;
        }
        return (List) objM162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static List m11234() {
        Object objM162;
        try {
            C9127 c9127 = new C9127();
            c9127.m14689(AbstractC3056.m6668(-3937778234993935783L));
            c9127.m14688(AbstractC3056.m6668(-3937778106144916903L));
            ArrayList arrayListM14695 = c9127.m14695();
            AbstractC3056.m6668(-3937741495843685799L);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM14695) {
                Method method = (Method) obj;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length >= 2 && AbstractC4394.m8917(parameterTypes[0], String.class) && Bitmap.class.isAssignableFrom(parameterTypes[1]) && AbstractC4394.m8917(method.getReturnType(), Boolean.TYPE)) {
                    arrayList.add(obj);
                }
            }
            objM162 = Result.m8755constructorimpl(arrayList);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8758exceptionOrNullimpl(objM162) != null) {
            objM162 = EmptyList.INSTANCE;
        }
        return (List) objM162;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Iterator it = m11233().iterator();
        while (it.hasNext()) {
            m11803((Method) it.next(), new C5919(this, 14));
        }
        Iterator it2 = m11234().iterator();
        while (it2.hasNext()) {
            m11803((Method) it2.next(), new C5919(15));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937778604361123239L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
        m11233();
        m11234();
    }
}
