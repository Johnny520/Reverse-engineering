package p038;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3070;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p026.AbstractC6316;
import p027.InterfaceC6317;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6381 extends AbstractC6316 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayList f17542 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17544;

    public C6381() {
        AbstractC8405.m13972(319);
        AbstractC8405.m13972(320);
    }

    public static void addOnChatShowListener(InterfaceC6372 interfaceC6372) {
        if (interfaceC6372 != null) {
            f17542.add(interfaceC6372);
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC3056.m6696()) {
            XposedBridge.hookMethod(this.f17544, new C6373(1));
            XposedBridge.hookMethod(this.f17543, new C6373(2));
            return;
        }
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(321));
        String strM13973 = AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜喵喵");
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3618 = strM13973;
        c1245.f3617 = Void.TYPE;
        Method methodM11855 = c6335M11853.m11855();
        XposedBridge.hookMethod(this.f17544, new C6374());
        XposedBridge.hookMethod(methodM11855, new C6373(0));
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        if (AbstractC3056.m6696()) {
            this.f17544 = c3070.m6889(AbstractC8405.m13972(319));
        } else {
            if (AbstractC3056.m6696()) {
                return;
            }
            this.f17544 = c3070.m6889(AbstractC8405.m13972(319));
            this.f17543 = c3070.m6889(AbstractC8405.m13972(320));
        }
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        String strM13972;
        String strM139722;
        if (AbstractC3056.m6696()) {
            strM13972 = AbstractC8405.m13972(322);
            strM139722 = AbstractC8405.m13972(323);
        } else {
            strM13972 = AbstractC8405.m13972(324);
            strM139722 = AbstractC8405.m13972(325);
        }
        c3070.m6887(C3070.m6886(strM13972)[0], AbstractC8405.m13972(319));
        Method[] methodArrM6886 = C3070.m6886(strM139722);
        if (AbstractC3056.m6696()) {
            c3070.m6887(methodArrM6886[0], AbstractC8405.m13972(320));
            return;
        }
        for (Method method : methodArrM6886) {
            if (method.getDeclaringClass().getName().equals(AbstractC8405.m13972(175))) {
                c3070.m6887(method, AbstractC8405.m13972(320));
                return;
            }
        }
    }
}
