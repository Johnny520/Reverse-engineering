package top.suzhelan.qstory.ui.components;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.C3251;
import com.google.gson.C3252;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.C5175;
import kotlin.collections.EmptyList;
import lin.xposed.hook.javaplugin.view.C5548;
import p052.InterfaceC6542;
import p257.C8207;
import p335.AbstractC8804;
import p348.InterfaceC8861;
import p349.C8865;
import p352.RunnableC8872;
import p398.C9152;

/* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5964 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f16176;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16177;

    public /* synthetic */ C5964(InterfaceC6542 interfaceC6542, int i) {
        this.f16177 = i;
        this.f16176 = interfaceC6542;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f16177;
        InterfaceC6542 interfaceC6542 = this.f16176;
        switch (i) {
            case 0:
                interfaceC6542.invoke();
                C8865 c8865 = C8865.f24976;
                C3251 c3251 = new C3251();
                c3251.m7347();
                C3252 c3252M7348 = c3251.m7348();
                C0325 c0325 = new C0325(19);
                c0325.m971(AbstractC3056.m6668(-3937274572769068455L));
                C8865.f24976.getClass();
                c0325.f1095 = C8865.m14511(false);
                ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
                Object objM547 = c0325.m970().m547(InterfaceC8861.class);
                AbstractC3056.m6668(-3937274383790507431L);
                objM547.getClass();
                C8207 c8207 = new C8207();
                c8207.f22615 = AbstractC3056.m6668(-3937326790981453223L);
                c8207.mo13704();
                c8207.mo13703(false);
                c8207.mo13705(AbstractC3056.m6668(-3937326700787140007L));
                c8207.mo13702(AbstractC3056.m6668(-3937326464563938727L), new C5548(4));
                c8207.m13714();
                AbstractC8804.f24777.execute(new RunnableC8872(c8207, 0));
                return C5175.f14739;
            default:
                try {
                    return (List) interfaceC6542.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.INSTANCE;
                }
        }
    }
}
