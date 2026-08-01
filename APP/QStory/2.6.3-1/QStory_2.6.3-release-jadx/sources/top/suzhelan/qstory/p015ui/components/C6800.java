package top.suzhelan.qstory.p015ui.components;

import androidx.compose.animation.core.C1171;
import com.google.gson.C4084;
import com.google.gson.C4085;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.C6008;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.view.C6380;
import p068.InterfaceC7372;
import p273.C9037;
import p303.AbstractC9234;
import p351.AbstractC9618;
import p361.C9663;
import p364.InterfaceC9672;
import p371.RunnableC9718;
import p412.C9942;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6800 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7372 f16530;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16531;

    public /* synthetic */ C6800(InterfaceC7372 interfaceC7372, int i) {
        this.f16531 = i;
        this.f16530 = interfaceC7372;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f16531;
        InterfaceC7372 interfaceC7372 = this.f16530;
        switch (i) {
            case 0:
                interfaceC7372.invoke();
                C9663 c9663 = C9663.f25281;
                C4084 c4084 = new C4084();
                c4084.m7893();
                C4085 c4085M7894 = c4084.m7894();
                C1171 c1171 = new C1171(19);
                c1171.m1531(AbstractC9234.m14531(2860));
                C9663.f25281.getClass();
                c1171.f1440 = C9663.m15050(false);
                ((ArrayList) c1171.f1439).add(new C9942(c4085M7894));
                Object objM1108 = c1171.m1530().m1108(InterfaceC9672.class);
                AbstractC9234.m14531(2861);
                objM1108.getClass();
                C9037 c9037 = new C9037();
                c9037.f22959 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
                c9037.mo14280();
                c9037.mo14279(false);
                c9037.mo14281(AbstractC9234.m14531(3140));
                c9037.mo14278(AbstractC9234.m14531(3141), new C6380(4));
                c9037.m14290();
                AbstractC9618.f25101.execute(new RunnableC9718(c9037, 0));
                return C6008.f15084;
            default:
                try {
                    return (List) interfaceC7372.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.INSTANCE;
                }
        }
    }
}
