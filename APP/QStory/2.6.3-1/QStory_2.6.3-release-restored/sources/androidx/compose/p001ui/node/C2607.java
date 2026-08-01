package androidx.compose.p001ui.node;

import androidx.appcompat.app.C0923;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.runtime.collection.C2059;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2607 extends AbstractC2580 {
    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3614(int i) {
        C0923 c0923M3811 = this.f5408.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1664(c2583.f5439.f5630, c2583.m3826(), i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC2559 mo3615(long j) {
        m3700(j);
        AbstractC2629 abstractC2629 = this.f5408;
        C2059 c2059M3799 = abstractC2629.f5604.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2582 c2582 = ((C2583) objArr[i2]).f5477.f5510;
            c2582.getClass();
            c2582.f5423 = LayoutNode$UsageByParent.NotUsed;
        }
        C2583 c2583 = abstractC2629.f5604;
        AbstractC2580.m3759(this, c2583.f5449.mo1666(this, c2583.m3826(), j));
        return this;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2580
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo3767() {
        C2582 c2582 = this.f5408.f5604.f5477.f5510;
        c2582.getClass();
        c2582.m3772();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3617(int i) {
        C0923 c0923M3811 = this.f5408.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1668(c2583.f5439.f5630, c2583.m3826(), i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3618(int i) {
        C0923 c0923M3811 = this.f5408.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1665(c2583.f5439.f5630, c2583.m3826(), i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3619(int i) {
        C0923 c0923M3811 = this.f5408.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1667(c2583.f5439.f5630, c2583.m3826(), i);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final int mo3846(AbstractC2524 abstractC2524) {
        C2582 c2582 = this.f5408.f5604.f5477.f5510;
        c2582.getClass();
        C2591 c2591 = c2582.f5432;
        LayoutNode$LayoutState layoutNode$LayoutState = c2591.f5504;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.LookaheadMeasuring;
        C2594 c2594 = c2582.f5428;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            c2594.f5541 = true;
            if (c2594.f5543) {
                c2591.f5502 = true;
                c2591.f5514 = true;
            }
        } else {
            c2594.f5540 = true;
        }
        C2607 c2607 = c2582.mo3732().f5547;
        if (c2607 != null) {
            c2607.f5492 = true;
        }
        c2582.mo3727();
        C2607 c26072 = c2582.mo3732().f5547;
        if (c26072 != null) {
            c26072.f5492 = false;
        }
        Integer num = (Integer) c2594.f5545.get(abstractC2524);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f5403.m1368(iIntValue, abstractC2524);
        return iIntValue;
    }
}
