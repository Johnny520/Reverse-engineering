package androidx.compose.foundation.lazy.layout;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.p001ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$ObjectRef;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p132.InterfaceC8174;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1564 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2377;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2378;

    public /* synthetic */ C1564(Object obj, int i) {
        this.f2378 = i;
        this.f2377 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        T tM12475;
        int i = this.f2378;
        int i2 = 0;
        Object obj2 = this.f2377;
        switch (i) {
            case 0:
                ((AbstractC2543) obj).m3695((AbstractC2559) obj2, 0, 0, 0.0f);
                return C6008.f15084;
            case 1:
                return new C1554((C1551) obj2, i2);
            case 2:
                return new C1554((C1542) obj2, 2);
            case 3:
                InterfaceC8174 interfaceC8174 = (InterfaceC8174) obj2;
                return Boolean.valueOf(interfaceC8174 != null ? interfaceC8174.mo2045(obj) : true);
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                InterfaceC2599 interfaceC2599 = (InterfaceC2599) obj;
                interfaceC2599.getClass();
                C1537 c1537 = ((C1567) interfaceC2599).f2384;
                List list = (List) ref$ObjectRef.element;
                if (list != null) {
                    list.add(c1537);
                    tM12475 = list;
                } else {
                    tM12475 = AbstractC7176.m12475(c1537);
                }
                ref$ObjectRef.element = tM12475;
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
    }
}
