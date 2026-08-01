package androidx.compose.animation;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.snapshots.C1277;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.InterfaceC1659;
import androidx.compose.ui.layout.InterfaceC1695;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C5176;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0425 implements InterfaceC0427, InterfaceC1659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1659 f1387;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1395 f1385 = AbstractC1367.m2474(Boolean.FALSE);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6543 f1386 = new InterfaceC6543() { // from class: androidx.compose.animation.SharedTransitionScopeImpl$observeAnimatingBlock$1
        {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m919invoke() {
            Collection collectionValues = this.this$0.f1383.m2252().f3704.values();
            if (collectionValues.isEmpty()) {
                return;
            }
            Iterator it = collectionValues.iterator();
            if (it.hasNext()) {
                ((AbstractC0442) it.next()).getClass();
                throw null;
            }
        }

        @Override // p052.InterfaceC6543
        public /* bridge */ /* synthetic */ Object invoke() {
            m919invoke();
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final SnapshotStateList f1384 = new SnapshotStateList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1277 f1383 = new C1277();

    public C0425(InterfaceC1659 interfaceC1659, InterfaceC5401 interfaceC5401) {
        this.f1387 = interfaceC1659;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1695 mo1121(AbstractC1708 abstractC1708) {
        return this.f1387.mo1121(abstractC1708);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC1695 mo1122(InterfaceC1695 interfaceC1695) {
        return this.f1387.mo1122(interfaceC1695);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m1123() {
        return ((Boolean) ((AbstractC1347) this.f1385).getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1659
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long mo1124(InterfaceC1695 interfaceC1695, InterfaceC1695 interfaceC16952) {
        return this.f1387.mo1124(interfaceC1695, interfaceC16952);
    }
}
