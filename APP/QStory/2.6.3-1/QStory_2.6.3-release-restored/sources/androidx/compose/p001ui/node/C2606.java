package androidx.compose.p001ui.node;

import androidx.appcompat.app.C0923;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.runtime.collection.C2059;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2606 extends AbstractC2629 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static final C2444 f5546;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public C2607 f5547;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final C2595 f5548;

    static {
        C2444 c2444M3456 = AbstractC2416.m3456();
        int i = C2434.f5044;
        c2444M3456.m3529(C2434.f5038);
        c2444M3456.m3527(1.0f);
        c2444M3456.m3528(1);
        f5546 = c2444M3456;
    }

    public C2606(C2583 c2583) {
        super(c2583);
        C2595 c2595 = new C2595();
        c2595.f6630 = 0;
        this.f5548 = c2595;
        c2595.f6631 = this;
        this.f5547 = c2583.f5465 != null ? new C2607(this) : null;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final int mo3614(int i) {
        C0923 c0923M3811 = this.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1664(c2583.f5439.f5630, c2583.m3818(), i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final AbstractC2559 mo3615(long j) {
        m3700(j);
        C2583 c2583 = this.f5604;
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            ((C2583) objArr[i2]).f5477.f5512.f5372 = LayoutNode$UsageByParent.NotUsed;
        }
        m3946(c2583.f5449.mo1666(this, c2583.m3818(), j));
        m3940();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3886(InterfaceC2645 interfaceC2645, long j, C2615 c2615, int i, boolean z) {
        int i2;
        boolean z2;
        C2583 c2583 = this.f5604;
        boolean z3 = false;
        if (interfaceC2645.mo3977(c2583)) {
            if (m3969(j)) {
                i2 = i;
                z2 = z;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(m3967(j, m3963())) & Integer.MAX_VALUE) < 2139095040) {
                    z2 = false;
                }
            }
            z3 = true;
            if (z3) {
                return;
            }
            int i3 = c2615.f5565;
            C2059 c2059M3800 = c2583.m3800();
            Object[] objArr = c2059M3800.f3866;
            int i4 = c2059M3800.f3865 - 1;
            while (i4 >= 0) {
                C2583 c25832 = (C2583) objArr[i4];
                if (c25832.m3802()) {
                    interfaceC2645.mo3979(c25832, j, c2615, i2, z2);
                    long jM3892 = c2615.m3892();
                    if (AbstractC2620.m3919(jM3892) < 0.0f && AbstractC2620.m3912(jM3892) && !AbstractC2620.m3915(jM3892) && !interfaceC2645.mo3981(c2615, c25832)) {
                        break;
                    }
                }
                i4--;
                i2 = i;
            }
            c2615.f5565 = i3;
            return;
        }
        i2 = i;
        z2 = z;
        if (z3) {
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final AbstractC2961 mo3842() {
        return this.f5548;
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲 */
    public final void mo3843(InterfaceC2436 interfaceC2436, C2351 c2351) throws Throwable {
        C2583 c2583 = this.f5604;
        InterfaceC2636 interfaceC2636M3866 = AbstractC2592.m3866(c2583);
        C2059 c2059M3800 = c2583.m3800();
        Object[] objArr = c2059M3800.f3866;
        int i = c2059M3800.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            C2583 c25832 = (C2583) objArr[i2];
            if (c25832.m3802()) {
                c25832.m3827(interfaceC2436, c2351);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636M3866).getShowLayoutBounds()) {
            long j = this.f5343;
            interfaceC2436.mo3252(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f5546);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世 */
    public final void mo3844() {
        if (this.f5547 == null) {
            this.f5547 = new C2607(this);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2629
    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世 */
    public final AbstractC2580 mo3845() {
        return this.f5547;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo3617(int i) {
        C0923 c0923M3811 = this.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1668(c2583.f5439.f5630, c2583.m3818(), i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo3618(int i) {
        C0923 c0923M3811 = this.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1665(c2583.f5439.f5630, c2583.m3818(), i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo3619(int i) {
        C0923 c0923M3811 = this.f5604.m3811();
        InterfaceC2493 interfaceC2493M820 = c0923M3811.m820();
        C2583 c2583 = (C2583) c0923M3811.f572;
        return interfaceC2493M820.mo1667(c2583.f5439.f5630, c2583.m3818(), i);
    }

    @Override // androidx.compose.p001ui.node.AbstractC2589
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final int mo3846(AbstractC2524 abstractC2524) {
        C2607 c2607 = this.f5547;
        if (c2607 != null) {
            return c2607.mo3846(abstractC2524);
        }
        C2573 c2573 = this.f5604.f5477.f5512;
        LayoutNode$LayoutState layoutNode$LayoutState = c2573.f5383.f5504;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        C2594 c2594 = c2573.f5365;
        if (layoutNode$LayoutState == layoutNode$LayoutState2) {
            c2594.f5541 = true;
            if (c2594.f5543) {
                c2573.f5375 = true;
                c2573.f5366 = true;
            }
        } else {
            c2594.f5540 = true;
        }
        C2606 c2606Mo3732 = c2573.mo3732();
        boolean z = c2606Mo3732.f5492;
        c2606Mo3732.f5492 = true;
        c2573.mo3727();
        c2606Mo3732.f5492 = z;
        Integer num = (Integer) c2594.f5545.get(abstractC2524);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.p001ui.layout.AbstractC2559
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo3688(long j, float f, InterfaceC7387 interfaceC7387) {
        if (this.f5603) {
            AbstractC2580 abstractC2580Mo3845 = mo3845();
            abstractC2580Mo3845.getClass();
            m3955(abstractC2580Mo3845.f5407, f, interfaceC7387);
        } else {
            m3955(j, f, interfaceC7387);
        }
        if (this.f5493) {
            return;
        }
        this.f5604.f5477.f5512.m3729();
    }
}
