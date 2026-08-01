package androidx.compose.foundation.layout;

import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1424 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1425 f1975;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1976;

    public /* synthetic */ C1424(AbstractC1425 abstractC1425, int i) {
        this.f1976 = i;
        this.f1975 = abstractC1425;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f1976;
        AbstractC1425 abstractC1425 = this.f1975;
        InterfaceC2599 interfaceC2599 = (InterfaceC2599) obj;
        switch (i) {
            case 0:
                interfaceC2599.getClass();
                AbstractC1425 abstractC14252 = (AbstractC1425) interfaceC2599;
                InterfaceC1449 interfaceC1449 = abstractC1425.f1978;
                if (!AbstractC5227.m9466(abstractC14252.f1977, interfaceC1449)) {
                    abstractC14252.f1977 = interfaceC1449;
                    abstractC14252.mo1918();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                interfaceC2599.getClass();
                abstractC1425.f1977 = ((AbstractC1425) interfaceC2599).f1978;
                return Boolean.FALSE;
        }
    }
}
