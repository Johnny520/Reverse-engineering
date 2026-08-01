package androidx.compose.p001ui;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2956 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public float f6620;

    public final String toString() {
        return AbstractC0900.m715(new StringBuilder("ZIndexModifier(zIndex="), this.f6620, ')');
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        final AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
        return interfaceC2488.mo2055(abstractC2559Mo3615.f5344, abstractC2559Mo3615.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.ZIndexNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                abstractC2543.m3695(abstractC2559Mo3615, 0, 0, this.f6620);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }
}
