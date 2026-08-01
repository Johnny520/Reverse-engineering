package androidx.compose.foundation.layout;

import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0583 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0584 f1630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1631;

    public /* synthetic */ C0583(AbstractC0584 abstractC0584, int i) {
        this.f1631 = i;
        this.f1630 = abstractC0584;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1631;
        AbstractC0584 abstractC0584 = this.f1630;
        InterfaceC1764 interfaceC1764 = (InterfaceC1764) obj;
        switch (i) {
            case 0:
                interfaceC1764.getClass();
                AbstractC0584 abstractC05842 = (AbstractC0584) interfaceC1764;
                InterfaceC0608 interfaceC0608 = abstractC0584.f1633;
                if (!AbstractC4395.m8907(abstractC05842.f1632, interfaceC0608)) {
                    abstractC05842.f1632 = interfaceC0608;
                    abstractC05842.mo1358();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                interfaceC1764.getClass();
                abstractC0584.f1632 = ((AbstractC0584) interfaceC1764).f1633;
                return Boolean.FALSE;
        }
    }
}
