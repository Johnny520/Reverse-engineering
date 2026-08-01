package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import androidx.fragment.app.C3191;
import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p049.AbstractC7166;
import p303.AbstractC9234;
import p408.C9927;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰哲楪苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6654 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f16306;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m11793() {
        C9927 c9927 = new C9927();
        c9927.m15247(AbstractC9234.m14531(2249));
        c9927.m15246(AbstractC9234.m14531(2250));
        return c9927.m15245();
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method declaredMethod;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            declaredMethod = classLoader.loadClass(AbstractC9234.m14531(2248)).getDeclaredMethod(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜喵喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜喵"), View.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        this.f16305 = declaredMethod;
        Method methodM11793 = m11793();
        this.f16306 = methodM11793;
        if (this.f16305 == null || methodM11793 == null) {
            return;
        }
        Method[] declaredMethods = AbstractC7166.m12425(AbstractC9234.m14531(2247)).getDeclaredMethods();
        AbstractC9234.m14531(1555);
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (AbstractC5227.m9466(method.getName(), AbstractC9234.m14531(314))) {
                arrayList.add(method);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m12390((Method) it.next(), new C6699(11));
        }
        Method method2 = this.f16305;
        method2.getClass();
        m12389(method2, new C3191(this, 10));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String mo11794() {
        return AbstractC9234.m14531(2246);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo11796(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m11793();
    }
}
