package p037;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p009.InterfaceC6152;
import p026.AbstractC6298;
import p032.C6316;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6364 extends AbstractC6298 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final ArrayList f17496 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17497;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Method f17498;

    public C6364() {
        AbstractC3056.m6668(-3937594827005494695L);
        AbstractC3056.m6668(-3937594762580985255L);
    }

    public static void addOnChatShowListener(InterfaceC6355 interfaceC6355) {
        if (interfaceC6355 != null) {
            f17496.add(interfaceC6355);
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (!AbstractC6560.m12011()) {
            XposedBridge.hookMethod(this.f17498, new C6356(1));
            XposedBridge.hookMethod(this.f17497, new C6356(2));
            return;
        }
        C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937594732516214183L));
        String strM6668 = AbstractC3056.m6668(-3937594431868503463L);
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3617 = strM6668;
        c1245.f3616 = Void.TYPE;
        Method methodM11827 = c6316M11825.m11827();
        XposedBridge.hookMethod(this.f17498, new C6357());
        XposedBridge.hookMethod(methodM11827, new C6356(0));
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        if (AbstractC6560.m12011()) {
            this.f17498 = c3069.m6902(AbstractC3056.m6668(-3937594827005494695L));
        } else {
            if (AbstractC6560.m12011()) {
                return;
            }
            this.f17498 = c3069.m6902(AbstractC3056.m6668(-3937594827005494695L));
            this.f17497 = c3069.m6902(AbstractC3056.m6668(-3937594762580985255L));
        }
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        String strM6668;
        String strM66682;
        if (AbstractC6560.m12011()) {
            strM6668 = AbstractC3056.m6668(-3937594461933274535L);
            strM66682 = AbstractC3056.m6668(-3937594281544648103L);
        } else {
            strM6668 = AbstractC3056.m6668(-3937594251479877031L);
            strM66682 = AbstractC3056.m6668(-3937594023846610343L);
        }
        c3069.m6900(C3069.m6899(strM6668)[0], AbstractC3056.m6668(-3937594827005494695L));
        Method[] methodArrM6899 = C3069.m6899(strM66682);
        if (AbstractC6560.m12011()) {
            c3069.m6900(methodArrM6899[0], AbstractC3056.m6668(-3937594762580985255L));
            return;
        }
        for (Method method : methodArrM6899) {
            if (method.getDeclaringClass().getName().equals(AbstractC3056.m6668(-3937576311401481639L))) {
                c3069.m6900(method, AbstractC3056.m6668(-3937594762580985255L));
                return;
            }
        }
    }
}
