package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.node.InterfaceC1764;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import p116.InterfaceC7344;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0723 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2031;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2032;

    public /* synthetic */ C0723(Object obj, int i) {
        this.f2032 = i;
        this.f2031 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        T tM13657;
        int i = this.f2032;
        int i2 = 0;
        Object obj2 = this.f2031;
        switch (i) {
            case 0:
                ((AbstractC1708) obj).m3125((AbstractC1724) obj2, 0, 0, 0.0f);
                return C5175.f14739;
            case 1:
                return new C0713((C0710) obj2, i2);
            case 2:
                return new C0713((C0701) obj2, 2);
            case 3:
                InterfaceC7344 interfaceC7344 = (InterfaceC7344) obj2;
                return Boolean.valueOf(interfaceC7344 != null ? interfaceC7344.mo1475(obj) : true);
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                InterfaceC1764 interfaceC1764 = (InterfaceC1764) obj;
                interfaceC1764.getClass();
                C0696 c0696 = ((C0726) interfaceC1764).f2038;
                List list = (List) ref$ObjectRef.element;
                if (list != null) {
                    list.add(c0696);
                    tM13657 = list;
                } else {
                    tM13657 = AbstractC8189.m13657(c0696);
                }
                ref$ObjectRef.element = tM13657;
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
        }
    }
}
