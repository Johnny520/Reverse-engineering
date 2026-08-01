package top.suzhelan.qstory.ui.components;

import androidx.compose.animation.core.C0325;
import com.google.gson.C3252;
import com.google.gson.C3253;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.C5176;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.view.C5549;
import p052.InterfaceC6543;
import p257.C8208;
import p287.AbstractC8405;
import p335.AbstractC8789;
import p345.C8834;
import p348.InterfaceC8843;
import p355.RunnableC8889;
import p396.C9113;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5970 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f16185;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16186;

    public /* synthetic */ C5970(InterfaceC6543 interfaceC6543, int i) {
        this.f16186 = i;
        this.f16185 = interfaceC6543;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f16186;
        InterfaceC6543 interfaceC6543 = this.f16185;
        switch (i) {
            case 0:
                interfaceC6543.invoke();
                C8834 c8834 = C8834.f24936;
                C3252 c3252 = new C3252();
                c3252.m7334();
                C3253 c3253M7335 = c3252.m7335();
                C0325 c0325 = new C0325(19);
                c0325.m971(AbstractC8405.m13972(2860));
                C8834.f24936.getClass();
                c0325.f1095 = C8834.m14491(false);
                ((ArrayList) c0325.f1094).add(new C9113(c3253M7335));
                Object objM548 = c0325.m970().m548(InterfaceC8843.class);
                AbstractC8405.m13972(2861);
                objM548.getClass();
                C8208 c8208 = new C8208();
                c8208.f22614 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜呜喵呜喵~呜呜呜喵呜喵呜喵~呜喵喵喵呜呜呜呜~呜呜喵喵喵喵喵呜~呜呜喵呜喵呜呜喵");
                c8208.mo13721();
                c8208.mo13720(false);
                c8208.mo13722(AbstractC8405.m13972(3140));
                c8208.mo13719(AbstractC8405.m13972(3141), new C5549(4));
                c8208.m13731();
                AbstractC8789.f24756.execute(new RunnableC8889(c8208, 0));
                return C5176.f14739;
            default:
                try {
                    return (List) interfaceC6543.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.INSTANCE;
                }
        }
    }
}
