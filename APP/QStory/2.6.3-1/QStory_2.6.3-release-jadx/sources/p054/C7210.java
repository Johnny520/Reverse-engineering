package p054;

import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3902;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p042.AbstractC7145;
import p043.InterfaceC7146;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7210 extends AbstractC7145 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayList f17887 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17889;

    public C7210() {
        AbstractC9234.m14531(319);
        AbstractC9234.m14531(320);
    }

    public static void addOnChatShowListener(InterfaceC7201 interfaceC7201) {
        if (interfaceC7201 != null) {
            f17887.add(interfaceC7201);
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC3888.m7256()) {
            XposedBridge.hookMethod(this.f17889, new C7202(1));
            XposedBridge.hookMethod(this.f17888, new C7202(2));
            return;
        }
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(321));
        String strM14532 = AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵呜呜呜喵喵");
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3963 = strM14532;
        c2080.f3962 = Void.TYPE;
        Method methodM12414 = c7164M12412.m12414();
        XposedBridge.hookMethod(this.f17889, new C7203());
        XposedBridge.hookMethod(methodM12414, new C7202(0));
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        if (AbstractC3888.m7256()) {
            this.f17889 = c3902.m7449(AbstractC9234.m14531(319));
        } else {
            if (AbstractC3888.m7256()) {
                return;
            }
            this.f17889 = c3902.m7449(AbstractC9234.m14531(319));
            this.f17888 = c3902.m7449(AbstractC9234.m14531(320));
        }
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        String strM14531;
        String strM145312;
        if (AbstractC3888.m7256()) {
            strM14531 = AbstractC9234.m14531(322);
            strM145312 = AbstractC9234.m14531(323);
        } else {
            strM14531 = AbstractC9234.m14531(324);
            strM145312 = AbstractC9234.m14531(325);
        }
        c3902.m7447(C3902.m7446(strM14531)[0], AbstractC9234.m14531(319));
        Method[] methodArrM7446 = C3902.m7446(strM145312);
        if (AbstractC3888.m7256()) {
            c3902.m7447(methodArrM7446[0], AbstractC9234.m14531(320));
            return;
        }
        for (Method method : methodArrM7446) {
            if (method.getDeclaringClass().getName().equals(AbstractC9234.m14531(175))) {
                c3902.m7447(method, AbstractC9234.m14531(320));
                return;
            }
        }
    }
}
