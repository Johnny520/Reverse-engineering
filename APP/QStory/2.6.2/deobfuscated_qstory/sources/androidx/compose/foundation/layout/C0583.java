package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0583 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0584 f1629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1630;

    public /* synthetic */ C0583(AbstractC0584 abstractC0584, int i) {
        this.f1630 = i;
        this.f1629 = abstractC0584;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1630;
        AbstractC0584 abstractC0584 = this.f1629;
        InterfaceC1764 interfaceC1764 = (InterfaceC1764) obj;
        switch (i) {
            case 0:
                interfaceC1764.getClass();
                AbstractC0584 abstractC05842 = (AbstractC0584) interfaceC1764;
                InterfaceC0608 interfaceC0608 = abstractC0584.f1632;
                if (!AbstractC4394.m8917(abstractC05842.f1631, interfaceC0608)) {
                    abstractC05842.f1631 = interfaceC0608;
                    abstractC05842.mo1348();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                interfaceC1764.getClass();
                abstractC0584.f1631 = ((AbstractC0584) interfaceC1764).f1632;
                return Boolean.FALSE;
        }
    }
}
