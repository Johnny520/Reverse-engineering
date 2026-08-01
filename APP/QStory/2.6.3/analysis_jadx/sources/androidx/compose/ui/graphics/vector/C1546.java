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
import kotlin.C5176;
import kotlin.collections.EmptyList;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1546 extends AbstractC1532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float[] f4519;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4523;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4524;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1614 f4527;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4530;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC6558 f4531;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f4518 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4517 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4516 = C1599.f4697;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List f4515 = AbstractC1539.f4469;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f4528 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6558 f4532 = new InterfaceC6558() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
        {
            super(1);
        }

        public final void invoke(AbstractC1532 abstractC1532) {
            this.this$0.m2826(abstractC1532);
            InterfaceC6558 interfaceC6558 = this.this$0.f4531;
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(abstractC1532);
            }
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC1532) obj);
            return C5176.f14739;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f4529 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4525 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4526 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4520 = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4529);
        ArrayList arrayList = this.f4518;
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
    public final void m2824(long j) {
        if (this.f4517 && j != 16) {
            long j2 = this.f4516;
            if (j2 == 16) {
                this.f4516 = j;
                return;
            }
            EmptyList emptyList = AbstractC1539.f4469;
            if (C1599.m2952(j2) == C1599.m2952(j) && C1599.m2953(j2) == C1599.m2953(j) && C1599.m2947(j2) == C1599.m2947(j)) {
                return;
            }
            this.f4517 = false;
            this.f4516 = C1599.f4697;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2825(int i, AbstractC1532 abstractC1532) {
        ArrayList arrayList = this.f4518;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC1532);
        } else {
            arrayList.add(abstractC1532);
        }
        m2826(abstractC1532);
        abstractC1532.mo2819(this.f4532);
        m2820();
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2819(InterfaceC6558 interfaceC6558) {
        this.f4531 = interfaceC6558;
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC6558 mo2821() {
        return this.f4531;
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2818(InterfaceC1504 interfaceC1504) {
        if (this.f4520) {
            float[] fArrM2907 = this.f4519;
            if (fArrM2907 == null) {
                fArrM2907 = C1587.m2907();
                this.f4519 = fArrM2907;
            } else {
                C1587.m2904(fArrM2907);
            }
            C1587.m2902(fArrM2907, this.f4523 + this.f4522, this.f4524 + this.f4521);
            float f = this.f4530;
            if (fArrM2907.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrM2907[0];
                float f3 = fArrM2907[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrM2907[1];
                float f8 = fArrM2907[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrM2907[2];
                float f12 = fArrM2907[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrM2907[3];
                float f16 = fArrM2907[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrM2907[0] = f4;
                fArrM2907[1] = f9;
                fArrM2907[2] = f13;
                fArrM2907[3] = f17;
                fArrM2907[4] = f6;
                fArrM2907[5] = f10;
                fArrM2907[6] = f14;
                fArrM2907[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f4525;
            float f19 = this.f4526;
            if (fArrM2907.length >= 16) {
                fArrM2907[0] = fArrM2907[0] * f18;
                fArrM2907[1] = fArrM2907[1] * f18;
                fArrM2907[2] = fArrM2907[2] * f18;
                fArrM2907[3] = fArrM2907[3] * f18;
                fArrM2907[4] = fArrM2907[4] * f19;
                fArrM2907[5] = fArrM2907[5] * f19;
                fArrM2907[6] = fArrM2907[6] * f19;
                fArrM2907[7] = fArrM2907[7] * f19;
                fArrM2907[8] = fArrM2907[8] * 1.0f;
                fArrM2907[9] = fArrM2907[9] * 1.0f;
                fArrM2907[10] = fArrM2907[10] * 1.0f;
                fArrM2907[11] = fArrM2907[11] * 1.0f;
            }
            C1587.m2902(fArrM2907, -this.f4522, -this.f4521);
            this.f4520 = false;
        }
        if (this.f4528) {
            if (!this.f4515.isEmpty()) {
                C1614 c1614M2957 = this.f4527;
                if (c1614M2957 == null) {
                    c1614M2957 = AbstractC1603.m2957();
                    this.f4527 = c1614M2957;
                }
                AbstractC1547.m2833(this.f4515, c1614M2957);
            }
            this.f4528 = false;
        }
        C0108 c0108Mo2706 = interfaceC1504.mo2706();
        long jM368 = c0108Mo2706.m368();
        c0108Mo2706.m386().mo2677();
        try {
            C0108 c0108 = (C0108) ((C0113) c0108Mo2706.f319).f357;
            float[] fArr = this.f4519;
            if (fArr != null) {
                c0108.m386().mo2694(fArr);
            }
            C1614 c1614 = this.f4527;
            if (!this.f4515.isEmpty() && c1614 != null) {
                c0108.m386().mo2682(c1614);
            }
            ArrayList arrayList = this.f4518;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1532) arrayList.get(i)).mo2818(interfaceC1504);
            }
        } finally {
            c0108Mo2706.m386().mo2689();
            c0108Mo2706.m361(jM368);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2826(AbstractC1532 abstractC1532) {
        if (!(abstractC1532 instanceof C1561)) {
            if (abstractC1532 instanceof C1546) {
                C1546 c1546 = (C1546) abstractC1532;
                if (c1546.f4517 && this.f4517) {
                    m2824(c1546.f4516);
                    return;
                } else {
                    this.f4517 = false;
                    this.f4516 = C1599.f4697;
                    return;
                }
            }
            return;
        }
        C1561 c1561 = (C1561) abstractC1532;
        AbstractC1598 abstractC1598 = c1561.f4584;
        if (this.f4517 && abstractC1598 != null) {
            if (abstractC1598 instanceof C1571) {
                m2824(((C1571) abstractC1598).f4620);
            } else {
                this.f4517 = false;
                this.f4516 = C1599.f4697;
            }
        }
        AbstractC1598 abstractC15982 = c1561.f4595;
        if (this.f4517 && abstractC15982 != null) {
            if (abstractC15982 instanceof C1571) {
                m2824(((C1571) abstractC15982).f4620);
            } else {
                this.f4517 = false;
                this.f4516 = C1599.f4697;
            }
        }
    }
}
