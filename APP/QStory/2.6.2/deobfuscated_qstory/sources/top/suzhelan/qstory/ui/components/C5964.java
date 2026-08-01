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
                c0325.m971("https://qstory.suzhelan.top");
                C8865.f24976.getClass();
                c0325.f1095 = C8865.m14511(false);
                ((ArrayList) c0325.f1094).add(new C9152(c3252M7348));
                Object objM547 = c0325.m970().m547(InterfaceC8861.class);
                "create(...)";
                objM547.getClass();
                C8207 c8207 = new C8207();
                c8207.f22615 = "\u63d0\u793a";
                c8207.mo13704();
                c8207.mo13703(false);
                c8207.mo13705("\u53ef\u4ee5\u8d5e\u52a9\u4e00\u4e0b\u5417,\u8fd9\u4f1a\u5e2e\u52a9\u6a21\u5757\u5f00\u53d1\u66f4\u591a\u529f\u80fd\u8d70\u7684\u66f4\u8fdc,\u4e3a\u4f60\u63d0\u4f9b\u66f4\u591a\u670d\u52a1\n(\u4e0d\u8d5e\u52a9\u4e5f\u53ef\u4ee5\u6b63\u5e38\u4f7f\u7528\uff0c\u4f60\u7684\u652f\u6301\u662f\u6b64\u6a21\u5757\u7ef4\u62a4\u7684\u52a8\u529b\uff09\n\u8d5e\u52a9\u540e\u6b64\u5f39\u7a97\u5c06\u4e0d\u4f1a\u51fa\u73b0");
                c8207.mo13702("\u53bb\u8d5e\u52a9", new C5548(4));
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
