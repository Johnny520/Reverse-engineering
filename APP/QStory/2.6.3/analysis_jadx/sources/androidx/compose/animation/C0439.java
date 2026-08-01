package androidx.compose.animation;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.InterfaceC1773;
import androidx.compose.ui.node.InterfaceC1781;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1791;
import java.util.Iterator;
import kotlin.C5176;
import kotlin.collections.AbstractC4336;
import kotlin.collections.AbstractC4339;
import kotlin.text.C5151;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439 extends AbstractC2128 implements InterfaceC1773, InterfaceC1791, InterfaceC1781, InterfaceC1783 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0425 f1401;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void mo1126() {
        this.f1401.getClass();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1101() {
        AbstractC1785.m3344(this, this.f1401.f1386);
        C0425 c0425 = this.f1401;
        new InterfaceC6543() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m920invoke();
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m920invoke() {
                AbstractC1785.m3351(this.this$0);
            }
        };
        c0425.getClass();
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(final InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        return interfaceC1653.mo1495(abstractC1724Mo3055.f4999, abstractC1724Mo3055.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                if (abstractC1708.mo3092() != null) {
                    boolean zMo1497 = interfaceC1653.mo1497();
                    C0439 c0439 = this;
                    if (zMo1497) {
                        c0439.f1401.getClass();
                    } else {
                        c0439.f1401.getClass();
                    }
                }
                abstractC1708.m3135(abstractC1724Mo3055, 0, 0, 0.0f);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void mo1127() {
        C0425 c0425 = this.f1401;
        C5151 c5151 = (C5151) c0425.f1383.m2252().f3704.values();
        Iterator it = c5151.iterator();
        if (it.hasNext()) {
            ((AbstractC0442) it.next()).getClass();
            throw null;
        }
        if (c0425.m1123()) {
            ((AbstractC1347) c0425.f1385).setValue(Boolean.FALSE);
            Iterator it2 = c5151.iterator();
            if (it2.hasNext()) {
                ((AbstractC0442) it2.next()).getClass();
                throw null;
            }
        }
        AbstractC1785.m3344(this, this.f1401.f1386);
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo1128(InterfaceC1506 interfaceC1506) {
        ((C1758) interfaceC1506).m3311();
        SnapshotStateList snapshotStateList = this.f1401.f1384;
        int i = 0;
        if (snapshotStateList.size() > 1) {
            AbstractC4336.m8766(snapshotStateList, new C0426(i));
        }
        if (snapshotStateList.size() <= 0) {
            return;
        }
        ((AbstractC0441) snapshotStateList.get(0)).getClass();
        throw null;
    }
}
