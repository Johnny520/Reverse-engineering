package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.node.AbstractC2589;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2608;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2793;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1884 extends AbstractC2961 implements InterfaceC2608, InterfaceC2596 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C1878 f3432;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public boolean f3433;

    @Override // androidx.compose.p001ui.node.InterfaceC2596
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰 */
    public final void mo1854(InterfaceC2779 interfaceC2779) {
        AbstractC2781.m4203(interfaceC2779);
        final int i = 0;
        final int i2 = 1;
        C2793 c2793 = new C2793(new InterfaceC7372(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪苏兰世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1884 f3440;

            {
                this.f3440 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int iM2505;
                int i3 = i;
                C1884 c1884 = this.f3440;
                switch (i3) {
                    case 0:
                        iM2505 = c1884.f3432.m2505();
                        break;
                    default:
                        iM2505 = ((AbstractC2181) c1884.f3432.f3402).m2992();
                        break;
                }
                return Float.valueOf(iM2505);
            }
        }, new InterfaceC7372(this) { // from class: androidx.compose.foundation.飘花落叶言子哲楪苏兰世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C1884 f3440;

            {
                this.f3440 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int iM2505;
                int i3 = i2;
                C1884 c1884 = this.f3440;
                switch (i3) {
                    case 0:
                        iM2505 = c1884.f3432.m2505();
                        break;
                    default:
                        iM2505 = ((AbstractC2181) c1884.f3432.f3402).m2992();
                        break;
                }
                return Float.valueOf(iM2505);
            }
        });
        if (this.f3433) {
            C2782 c2782 = AbstractC2778.f6082;
            InterfaceC5920 interfaceC5920 = AbstractC2781.f6100[13];
            c2782.getClass();
            interfaceC2779.mo4150(c2782, c2793);
            return;
        }
        C2782 c27822 = AbstractC2778.f6085;
        InterfaceC5920 interfaceC59202 = AbstractC2781.f6100[12];
        c27822.getClass();
        interfaceC2779.mo4150(c27822, c2793);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final int mo1634(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (!this.f3433) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC2533.mo3617(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1635(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (this.f3433) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC2533.mo3618(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1636(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (!this.f3433) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC2533.mo3614(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1637(AbstractC2589 abstractC2589, InterfaceC2533 interfaceC2533, int i) {
        if (this.f3433) {
            i = Integer.MAX_VALUE;
        }
        return interfaceC2533.mo3619(i);
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        AbstractC1910.m2539(j, this.f3433 ? Orientation.Vertical : Orientation.Horizontal);
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(C8727.m13895(0, this.f3433 ? C8727.m13896(j) : Integer.MAX_VALUE, 0, this.f3433 ? Integer.MAX_VALUE : C8727.m13897(j), 5, j));
        int i = abstractC2559Mo3615.f5344;
        int iM13896 = C8727.m13896(j);
        if (i > iM13896) {
            i = iM13896;
        }
        int i2 = abstractC2559Mo3615.f5342;
        int iM13897 = C8727.m13897(j);
        if (i2 > iM13897) {
            i2 = iM13897;
        }
        int i3 = abstractC2559Mo3615.f5342 - i2;
        int i4 = abstractC2559Mo3615.f5344 - i;
        if (!this.f3433) {
            i3 = i4;
        }
        C1878 c1878 = this.f3432;
        ((AbstractC2181) c1878.f3402).m2993(i3);
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            if (c1878.m2505() > i3) {
                ((AbstractC2181) c1878.f3406).m2993(i3);
            }
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            ((AbstractC2181) this.f3432.f3405).m2993(this.f3433 ? i2 : i);
            ((AbstractC2181) this.f3432.f3404).m2993(this.f3433 ? abstractC2559Mo3615.f5342 : abstractC2559Mo3615.f5344);
            return interfaceC2488.mo2055(i, i2, AbstractC5171.m9335(), new C1886(i3, 0, this, abstractC2559Mo3615));
        } catch (Throwable th) {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
            throw th;
        }
    }
}
