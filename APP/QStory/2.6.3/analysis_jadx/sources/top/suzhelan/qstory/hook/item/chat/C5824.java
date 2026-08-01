package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import androidx.fragment.app.C2358;
import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p392.C9098;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰哲楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5824 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f15960;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f15961;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11234() {
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(2249));
        c9098.m14687(AbstractC8405.m13972(2250));
        return c9098.m14686();
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method declaredMethod;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            declaredMethod = classLoader.loadClass(AbstractC8405.m13972(2248)).getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜喵喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜喵"), View.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        this.f15960 = declaredMethod;
        Method methodM11234 = m11234();
        this.f15961 = methodM11234;
        if (this.f15960 == null || methodM11234 == null) {
            return;
        }
        Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(2247)).getDeclaredMethods();
        AbstractC8405.m13972(1555);
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC4395.m8907(method.getName(), AbstractC8405.m13972(314))) {
                arrayList.add(method);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m11831((Method) it.next(), new C5869(11));
        }
        Method method2 = this.f15960;
        method2.getClass();
        m11830(method2, new C2358(this, 10));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String mo11235() {
        return AbstractC8405.m13972(2246);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11234();
    }
}
