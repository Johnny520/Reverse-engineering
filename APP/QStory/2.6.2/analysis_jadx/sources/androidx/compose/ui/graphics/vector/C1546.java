package androidx.compose.ui.graphics.vector;

import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.AbstractC1603;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.EmptyList;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1546 extends AbstractC1532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float[] f4518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4520;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4523;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1614 f4526;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4529;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC6557 f4530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f4517 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4516 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4515 = C1599.f4696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List f4514 = AbstractC1539.f4468;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f4527 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6557 f4531 = new InterfaceC6557() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
        {
            super(1);
        }

        public final void invoke(AbstractC1532 abstractC1532) {
            this.this$0.m2816(abstractC1532);
            InterfaceC6557 interfaceC6557 = this.this$0.f4530;
            if (interfaceC6557 != null) {
                interfaceC6557.invoke(abstractC1532);
            }
        }

        @Override // p052.InterfaceC6557
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC1532) obj);
            return C5175.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f4528 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4524 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4525 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4519 = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4528);
        ArrayList arrayList = this.f4517;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1532 abstractC1532 = (AbstractC1532) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC1532.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m2814(long j) {
        if (this.f4516 && j != 16) {
            long j2 = this.f4515;
            if (j2 == 16) {
                this.f4515 = j;
                return;
            }
            EmptyList emptyList = AbstractC1539.f4468;
            if (C1599.m2942(j2) == C1599.m2942(j) && C1599.m2943(j2) == C1599.m2943(j) && C1599.m2937(j2) == C1599.m2937(j)) {
                return;
            }
            this.f4516 = false;
            this.f4515 = C1599.f4696;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2815(int i, AbstractC1532 abstractC1532) {
        ArrayList arrayList = this.f4517;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC1532);
        } else {
            arrayList.add(abstractC1532);
        }
        m2816(abstractC1532);
        abstractC1532.mo2809(this.f4531);
        m2810();
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2809(InterfaceC6557 interfaceC6557) {
        this.f4530 = interfaceC6557;
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6557 mo2811() {
        return this.f4530;
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2808(InterfaceC1504 interfaceC1504) {
        if (this.f4519) {
            float[] fArrM2897 = this.f4518;
            if (fArrM2897 == null) {
                fArrM2897 = C1587.m2897();
                this.f4518 = fArrM2897;
            } else {
                C1587.m2894(fArrM2897);
            }
            C1587.m2892(fArrM2897, this.f4522 + this.f4521, this.f4523 + this.f4520);
            float f = this.f4529;
            if (fArrM2897.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrM2897[0];
                float f3 = fArrM2897[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrM2897[1];
                float f8 = fArrM2897[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrM2897[2];
                float f12 = fArrM2897[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrM2897[3];
                float f16 = fArrM2897[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrM2897[0] = f4;
                fArrM2897[1] = f9;
                fArrM2897[2] = f13;
                fArrM2897[3] = f17;
                fArrM2897[4] = f6;
                fArrM2897[5] = f10;
                fArrM2897[6] = f14;
                fArrM2897[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f4524;
            float f19 = this.f4525;
            if (fArrM2897.length >= 16) {
                fArrM2897[0] = fArrM2897[0] * f18;
                fArrM2897[1] = fArrM2897[1] * f18;
                fArrM2897[2] = fArrM2897[2] * f18;
                fArrM2897[3] = fArrM2897[3] * f18;
                fArrM2897[4] = fArrM2897[4] * f19;
                fArrM2897[5] = fArrM2897[5] * f19;
                fArrM2897[6] = fArrM2897[6] * f19;
                fArrM2897[7] = fArrM2897[7] * f19;
                fArrM2897[8] = fArrM2897[8] * 1.0f;
                fArrM2897[9] = fArrM2897[9] * 1.0f;
                fArrM2897[10] = fArrM2897[10] * 1.0f;
                fArrM2897[11] = fArrM2897[11] * 1.0f;
            }
            C1587.m2892(fArrM2897, -this.f4521, -this.f4520);
            this.f4519 = false;
        }
        if (this.f4527) {
            if (!this.f4514.isEmpty()) {
                C1614 c1614M2947 = this.f4526;
                if (c1614M2947 == null) {
                    c1614M2947 = AbstractC1603.m2947();
                    this.f4526 = c1614M2947;
                }
                AbstractC1547.m2823(this.f4514, c1614M2947);
            }
            this.f4527 = false;
        }
        C0108 c0108Mo2696 = interfaceC1504.mo2696();
        long jM367 = c0108Mo2696.m367();
        c0108Mo2696.m385().mo2667();
        try {
            C0108 c0108 = (C0108) ((C0113) c0108Mo2696.f319).f357;
            float[] fArr = this.f4518;
            if (fArr != null) {
                c0108.m385().mo2684(fArr);
            }
            C1614 c1614 = this.f4526;
            if (!this.f4514.isEmpty() && c1614 != null) {
                c0108.m385().mo2672(c1614);
            }
            ArrayList arrayList = this.f4517;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1532) arrayList.get(i)).mo2808(interfaceC1504);
            }
        } finally {
            c0108Mo2696.m385().mo2679();
            c0108Mo2696.m360(jM367);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2816(AbstractC1532 abstractC1532) {
        if (!(abstractC1532 instanceof C1561)) {
            if (abstractC1532 instanceof C1546) {
                C1546 c1546 = (C1546) abstractC1532;
                if (c1546.f4516 && this.f4516) {
                    m2814(c1546.f4515);
                    return;
                } else {
                    this.f4516 = false;
                    this.f4515 = C1599.f4696;
                    return;
                }
            }
            return;
        }
        C1561 c1561 = (C1561) abstractC1532;
        AbstractC1598 abstractC1598 = c1561.f4583;
        if (this.f4516 && abstractC1598 != null) {
            if (abstractC1598 instanceof C1571) {
                m2814(((C1571) abstractC1598).f4619);
            } else {
                this.f4516 = false;
                this.f4515 = C1599.f4696;
            }
        }
        AbstractC1598 abstractC15982 = c1561.f4594;
        if (this.f4516 && abstractC15982 != null) {
            if (abstractC15982 instanceof C1571) {
                m2814(((C1571) abstractC15982).f4619);
            } else {
                this.f4516 = false;
                this.f4515 = C1599.f4696;
            }
        }
    }
}
