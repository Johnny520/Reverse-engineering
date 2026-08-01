package androidx.compose.p001ui.graphics.vector;

import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.AbstractC2438;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.EmptyList;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2381 extends AbstractC2367 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float[] f4864;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4866;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4869;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2449 f4872;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC7387 f4876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f4863 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4862 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4861 = C2434.f5042;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public List f4860 = AbstractC2374.f4814;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f4873 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC7387 f4877 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.vector.GroupComponent$wrappedListener$1
        {
            super(1);
        }

        public final void invoke(AbstractC2367 abstractC2367) {
            this.this$0.m3386(abstractC2367);
            InterfaceC7387 interfaceC7387 = this.this$0.f4876;
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(abstractC2367);
            }
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC2367) obj);
            return C6008.f15084;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public String f4874 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4870 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4871 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4865 = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.f4874);
        ArrayList arrayList = this.f4863;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC2367 abstractC2367 = (AbstractC2367) arrayList.get(i);
            sb.append("\t");
            sb.append(abstractC2367.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3384(long j) {
        if (this.f4862 && j != 16) {
            long j2 = this.f4861;
            if (j2 == 16) {
                this.f4861 = j;
                return;
            }
            EmptyList emptyList = AbstractC2374.f4814;
            if (C2434.m3512(j2) == C2434.m3512(j) && C2434.m3513(j2) == C2434.m3513(j) && C2434.m3507(j2) == C2434.m3507(j)) {
                return;
            }
            this.f4862 = false;
            this.f4861 = C2434.f5042;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3385(int i, AbstractC2367 abstractC2367) {
        ArrayList arrayList = this.f4863;
        if (i < arrayList.size()) {
            arrayList.set(i, abstractC2367);
        } else {
            arrayList.add(abstractC2367);
        }
        m3386(abstractC2367);
        abstractC2367.mo3379(this.f4877);
        m3380();
    }

    @Override // androidx.compose.p001ui.graphics.vector.AbstractC2367
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3379(InterfaceC7387 interfaceC7387) {
        this.f4876 = interfaceC7387;
    }

    @Override // androidx.compose.p001ui.graphics.vector.AbstractC2367
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC7387 mo3381() {
        return this.f4876;
    }

    @Override // androidx.compose.p001ui.graphics.vector.AbstractC2367
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3378(InterfaceC2339 interfaceC2339) {
        if (this.f4865) {
            float[] fArrM3467 = this.f4864;
            if (fArrM3467 == null) {
                fArrM3467 = C2422.m3467();
                this.f4864 = fArrM3467;
            } else {
                C2422.m3464(fArrM3467);
            }
            C2422.m3462(fArrM3467, this.f4868 + this.f4867, this.f4869 + this.f4866);
            float f = this.f4875;
            if (fArrM3467.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrM3467[0];
                float f3 = fArrM3467[4];
                float f4 = (fSin * f3) + (fCos * f2);
                float f5 = -fSin;
                float f6 = (f3 * fCos) + (f2 * f5);
                float f7 = fArrM3467[1];
                float f8 = fArrM3467[5];
                float f9 = (fSin * f8) + (fCos * f7);
                float f10 = (f8 * fCos) + (f7 * f5);
                float f11 = fArrM3467[2];
                float f12 = fArrM3467[6];
                float f13 = (fSin * f12) + (fCos * f11);
                float f14 = (f12 * fCos) + (f11 * f5);
                float f15 = fArrM3467[3];
                float f16 = fArrM3467[7];
                float f17 = (fSin * f16) + (fCos * f15);
                fArrM3467[0] = f4;
                fArrM3467[1] = f9;
                fArrM3467[2] = f13;
                fArrM3467[3] = f17;
                fArrM3467[4] = f6;
                fArrM3467[5] = f10;
                fArrM3467[6] = f14;
                fArrM3467[7] = (fCos * f16) + (f5 * f15);
            }
            float f18 = this.f4870;
            float f19 = this.f4871;
            if (fArrM3467.length >= 16) {
                fArrM3467[0] = fArrM3467[0] * f18;
                fArrM3467[1] = fArrM3467[1] * f18;
                fArrM3467[2] = fArrM3467[2] * f18;
                fArrM3467[3] = fArrM3467[3] * f18;
                fArrM3467[4] = fArrM3467[4] * f19;
                fArrM3467[5] = fArrM3467[5] * f19;
                fArrM3467[6] = fArrM3467[6] * f19;
                fArrM3467[7] = fArrM3467[7] * f19;
                fArrM3467[8] = fArrM3467[8] * 1.0f;
                fArrM3467[9] = fArrM3467[9] * 1.0f;
                fArrM3467[10] = fArrM3467[10] * 1.0f;
                fArrM3467[11] = fArrM3467[11] * 1.0f;
            }
            C2422.m3462(fArrM3467, -this.f4867, -this.f4866);
            this.f4865 = false;
        }
        if (this.f4873) {
            if (!this.f4860.isEmpty()) {
                C2449 c2449M3517 = this.f4872;
                if (c2449M3517 == null) {
                    c2449M3517 = AbstractC2438.m3517();
                    this.f4872 = c2449M3517;
                }
                AbstractC2382.m3393(this.f4860, c2449M3517);
            }
            this.f4873 = false;
        }
        C0955 c0955Mo3266 = interfaceC2339.mo3266();
        long jM928 = c0955Mo3266.m928();
        c0955Mo3266.m946().mo3237();
        try {
            C0955 c0955 = (C0955) ((C0960) c0955Mo3266.f664).f702;
            float[] fArr = this.f4864;
            if (fArr != null) {
                c0955.m946().mo3254(fArr);
            }
            C2449 c2449 = this.f4872;
            if (!this.f4860.isEmpty() && c2449 != null) {
                c0955.m946().mo3242(c2449);
            }
            ArrayList arrayList = this.f4863;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC2367) arrayList.get(i)).mo3378(interfaceC2339);
            }
        } finally {
            c0955Mo3266.m946().mo3249();
            c0955Mo3266.m921(jM928);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3386(AbstractC2367 abstractC2367) {
        if (!(abstractC2367 instanceof C2396)) {
            if (abstractC2367 instanceof C2381) {
                C2381 c2381 = (C2381) abstractC2367;
                if (c2381.f4862 && this.f4862) {
                    m3384(c2381.f4861);
                    return;
                } else {
                    this.f4862 = false;
                    this.f4861 = C2434.f5042;
                    return;
                }
            }
            return;
        }
        C2396 c2396 = (C2396) abstractC2367;
        AbstractC2433 abstractC2433 = c2396.f4929;
        if (this.f4862 && abstractC2433 != null) {
            if (abstractC2433 instanceof C2406) {
                m3384(((C2406) abstractC2433).f4965);
            } else {
                this.f4862 = false;
                this.f4861 = C2434.f5042;
            }
        }
        AbstractC2433 abstractC24332 = c2396.f4940;
        if (this.f4862 && abstractC24332 != null) {
            if (abstractC24332 instanceof C2406) {
                m3384(((C2406) abstractC24332).f4965);
            } else {
                this.f4862 = false;
                this.f4861 = C2434.f5042;
            }
        }
    }
}
