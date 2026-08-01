package androidx.compose.animation;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.InterfaceC2494;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.C2112;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C6008;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1271 implements InterfaceC1273, InterfaceC2494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2494 f1732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2230 f1730 = AbstractC2202.m3034(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7372 f1731 = new InterfaceC7372() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1479invoke() {
            Collection collectionValues = this.this$0.f1728.m2812().f4049.values();
            if (collectionValues.isEmpty()) {
                return;
            }
            Iterator it = collectionValues.iterator();
            if (it.hasNext()) {
                ((AbstractC1288) it.next()).getClass();
                throw null;
            }
        }

        @Override // p068.InterfaceC7372
        public /* bridge */ /* synthetic */ Object invoke() {
            m1479invoke();
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final SnapshotStateList f1729 = new SnapshotStateList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2112 f1728 = new C2112();

    public C1271(InterfaceC2494 interfaceC2494, InterfaceC6233 interfaceC6233) {
        this.f1732 = interfaceC2494;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2530 mo1681(AbstractC2543 abstractC2543) {
        return this.f1732.mo1681(abstractC2543);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC2530 mo1682(InterfaceC2530 interfaceC2530) {
        return this.f1732.mo1682(interfaceC2530);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1683() {
        return ((Boolean) ((AbstractC2182) this.f1730).getValue()).booleanValue();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo1684(InterfaceC2530 interfaceC2530, InterfaceC2530 interfaceC25302) {
        return this.f1732.mo1684(interfaceC2530, interfaceC25302);
    }
}
