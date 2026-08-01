package androidx.compose.animation;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.node.InterfaceC2616;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2626;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import kotlin.C6008;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5171;
import kotlin.text.C5983;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1285 extends AbstractC2961 implements InterfaceC2608, InterfaceC2626, InterfaceC2616, InterfaceC2618 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1271 f1746;

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void mo1686() {
        this.f1746.getClass();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        AbstractC2620.m3904(this, this.f1746.f1731);
        C1271 c1271 = this.f1746;
        new InterfaceC7372() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m1480invoke();
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1480invoke() {
                AbstractC2620.m3911(this.this$0);
            }
        };
        c1271.getClass();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(final InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                if (abstractC2543.mo3652() != null) {
                    boolean zMo2057 = interfaceC2488.mo2057();
                    C1285 c1285 = this;
                    if (zMo2057) {
                        c1285.f1746.getClass();
                    } else {
                        c1285.f1746.getClass();
                    }
                }
                abstractC2543.m3695(abstractC2559Mo3615, 0, 0, 0.0f);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void mo1687() {
        C1271 c1271 = this.f1746;
        C5983 c5983 = (C5983) c1271.f1728.m2812().f4049.values();
        Iterator it = c5983.iterator();
        if (it.hasNext()) {
            ((AbstractC1288) it.next()).getClass();
            throw null;
        }
        if (c1271.m1683()) {
            ((AbstractC2182) c1271.f1730).setValue(Boolean.FALSE);
            Iterator it2 = c5983.iterator();
            if (it2.hasNext()) {
                ((AbstractC1288) it2.next()).getClass();
                throw null;
            }
        }
        AbstractC2620.m3904(this, this.f1746.f1731);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2616
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo1688(InterfaceC2341 interfaceC2341) {
        ((C2593) interfaceC2341).m3871();
        SnapshotStateList snapshotStateList = this.f1746.f1729;
        int i = 0;
        if (snapshotStateList.size() > 1) {
            AbstractC5168.m9325(snapshotStateList, new C1272(i));
        }
        if (snapshotStateList.size() <= 0) {
            return;
        }
        ((AbstractC1287) snapshotStateList.get(0)).getClass();
        throw null;
    }
}
