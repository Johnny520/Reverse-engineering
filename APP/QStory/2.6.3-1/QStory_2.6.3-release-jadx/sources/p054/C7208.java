package p054;

import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.Stack;
import p042.AbstractC7145;
import p043.InterfaceC7146;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7208 extends AbstractC7145 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object f17880;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Object f17881;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Object f17882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Stack f17883 = new Stack();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17884;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17885;

    public C7208() {
        AbstractC9234.m14531(347);
        AbstractC9234.m14531(348);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC3888.m7256()) {
            XposedBridge.hookMethod(this.f17885, new C7202(6));
            return;
        }
        XposedBridge.hookMethod(this.f17884, new C7202(4));
        try {
            XposedHelpers.findAndHookMethod(AbstractC9234.m14531(349), classLoader, AbstractC9234.m14531(350), new Object[]{new C7202(5)});
        } catch (Exception unused) {
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        if (AbstractC3888.m7256()) {
            this.f17884 = c3902.m7449(AbstractC9234.m14531(348));
        } else {
            this.f17885 = c3902.m7449(AbstractC9234.m14531(347));
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        if (AbstractC3888.m7256()) {
            c3902.m7447(C3902.m7446(AbstractC9234.m14531(351))[0], AbstractC9234.m14531(348));
            return;
        }
        for (Method method : C3902.m7446(AbstractC9234.m14531(347))) {
            if (method.getDeclaringClass().getName().equals(AbstractC9234.m14531(175))) {
                c3902.m7447(method, AbstractC9234.m14531(347));
                return;
            }
        }
    }
}
