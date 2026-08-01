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
import kotlin.C5175;
import kotlin.collections.AbstractC4335;
import kotlin.collections.AbstractC4338;
import kotlin.text.C5150;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0439 extends AbstractC2128 implements InterfaceC1773, InterfaceC1791, InterfaceC1781, InterfaceC1783 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0425 f1401;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public final void mo1125() {
        this.f1401.getClass();
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1100() {
        AbstractC1785.m3334(this, this.f1401.f1386);
        C0425 c0425 = this.f1401;
        new InterfaceC6542() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$onAttach$1
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m919invoke();
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m919invoke() {
                AbstractC1785.m3341(this.this$0);
            }
        };
        c0425.getClass();
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(final InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        return interfaceC1653.mo1485(abstractC1724Mo3045.f4998, abstractC1724Mo3045.f4996, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.animation.SharedTransitionScopeRootModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                if (abstractC1708.mo3082() != null) {
                    boolean zMo1487 = interfaceC1653.mo1487();
                    C0439 c0439 = this;
                    if (zMo1487) {
                        c0439.f1401.getClass();
                    } else {
                        c0439.f1401.getClass();
                    }
                }
                abstractC1708.m3125(abstractC1724Mo3045, 0, 0, 0.0f);
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void mo1126() {
        C0425 c0425 = this.f1401;
        C5150 c5150 = (C5150) c0425.f1383.m2242().f3703.values();
        Iterator it = c5150.iterator();
        if (it.hasNext()) {
            ((AbstractC0442) it.next()).getClass();
            throw null;
        }
        if (c0425.m1122()) {
            ((AbstractC1347) c0425.f1385).setValue(Boolean.FALSE);
            Iterator it2 = c5150.iterator();
            if (it2.hasNext()) {
                ((AbstractC0442) it2.next()).getClass();
                throw null;
            }
        }
        AbstractC1785.m3334(this, this.f1401.f1386);
    }

    @Override // androidx.compose.ui.node.InterfaceC1781
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final void mo1127(InterfaceC1506 interfaceC1506) {
        ((C1758) interfaceC1506).m3301();
        SnapshotStateList snapshotStateList = this.f1401.f1384;
        int i = 0;
        if (snapshotStateList.size() > 1) {
            AbstractC4335.m8776(snapshotStateList, new C0426(i));
        }
        if (snapshotStateList.size() <= 0) {
            return;
        }
        ((AbstractC0441) snapshotStateList.get(0)).getClass();
        throw null;
    }
}
