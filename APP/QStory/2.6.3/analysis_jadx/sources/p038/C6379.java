package p038;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.util.Stack;
import p026.AbstractC6316;
import p027.InterfaceC6317;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6379 extends AbstractC6316 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object f17535;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Object f17536;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static Object f17537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Stack f17538 = new Stack();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17539;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17540;

    public C6379() {
        AbstractC8405.m13972(347);
        AbstractC8405.m13972(348);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC3056.m6696()) {
            XposedBridge.hookMethod(this.f17540, new C6373(6));
            return;
        }
        XposedBridge.hookMethod(this.f17539, new C6373(4));
        try {
            XposedHelpers.findAndHookMethod(AbstractC8405.m13972(349), classLoader, AbstractC8405.m13972(350), new Object[]{new C6373(5)});
        } catch (Exception unused) {
        }
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        if (AbstractC3056.m6696()) {
            this.f17539 = c3070.m6889(AbstractC8405.m13972(348));
        } else {
            this.f17540 = c3070.m6889(AbstractC8405.m13972(347));
        }
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        if (AbstractC3056.m6696()) {
            c3070.m6887(C3070.m6886(AbstractC8405.m13972(351))[0], AbstractC8405.m13972(348));
            return;
        }
        for (Method method : C3070.m6886(AbstractC8405.m13972(347))) {
            if (method.getDeclaringClass().getName().equals(AbstractC8405.m13972(175))) {
                c3070.m6887(method, AbstractC8405.m13972(347));
                return;
            }
        }
    }
}
