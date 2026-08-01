package androidx.compose.p001ui.modifier;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2603;
import androidx.compose.runtime.collection.C2059;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class ModifierLocalManager$invalidate$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ C2569 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalManager$invalidate$1(C2569 c2569) {
        super(0);
        this.this$0 = c2569;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3703invoke() {
        C2569 c2569 = this.this$0;
        C2059 c2059 = c2569.f5354;
        C2059 c20592 = c2569.f5355;
        C2059 c20593 = c2569.f5352;
        HashSet hashSet = new HashSet();
        C2059 c20594 = c2569.f5353;
        Object[] objArr = c20594.f3866;
        int i = c20594.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c2583 = (C2583) objArr[i2];
            C2567 c2567 = (C2567) c20593.f3866[i2];
            AbstractC2961 abstractC2961 = c2583.f5439.f5628;
            if (abstractC2961.f6624) {
                C2569.m3705(abstractC2961, c2567);
            }
        }
        c20594.m2612();
        c20593.m2612();
        Object[] objArr2 = c20592.f3866;
        int i3 = c20592.f3865;
        for (int i4 = 0; i4 < i3; i4++) {
            C2603 c2603 = (C2603) objArr2[i4];
            C2567 c25672 = (C2567) c2059.f3866[i4];
            if (c2603.f6624) {
                C2569.m3705(c2603, c25672);
            }
        }
        c20592.m2612();
        c2059.m2612();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C2603) it.next()).m3878();
        }
    }

    @Override // p068.InterfaceC7372
    public /* bridge */ /* synthetic */ Object invoke() {
        m3703invoke();
        return C6008.f15084;
    }
}
