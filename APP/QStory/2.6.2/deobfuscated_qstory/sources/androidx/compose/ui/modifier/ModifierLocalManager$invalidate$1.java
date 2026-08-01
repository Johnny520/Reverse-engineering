package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1768;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class ModifierLocalManager$invalidate$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ C1734 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalManager$invalidate$1(C1734 c1734) {
        super(0);
        this.this$0 = c1734;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3133invoke() {
        C1734 c1734 = this.this$0;
        C1224 c1224 = c1734.f5008;
        C1224 c12242 = c1734.f5009;
        C1224 c12243 = c1734.f5006;
        HashSet hashSet = new HashSet();
        C1224 c12244 = c1734.f5007;
        Object[] objArr = c12244.f3520;
        int i = c12244.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            C1748 c1748 = (C1748) objArr[i2];
            C1732 c1732 = (C1732) c12243.f3520[i2];
            AbstractC2128 abstractC2128 = c1748.f5093.f5282;
            if (abstractC2128.f6278) {
                C1734.m3135(abstractC2128, c1732);
            }
        }
        c12244.m2042();
        c12243.m2042();
        Object[] objArr2 = c12242.f3520;
        int i3 = c12242.f3519;
        for (int i4 = 0; i4 < i3; i4++) {
            C1768 c1768 = (C1768) objArr2[i4];
            C1732 c17322 = (C1732) c1224.f3520[i4];
            if (c1768.f6278) {
                C1734.m3135(c1768, c17322);
            }
        }
        c12242.m2042();
        c1224.m2042();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C1768) it.next()).m3308();
        }
    }

    @Override // p052.InterfaceC6542
    public /* bridge */ /* synthetic */ Object invoke() {
        m3133invoke();
        return C5175.f14739;
    }
}
