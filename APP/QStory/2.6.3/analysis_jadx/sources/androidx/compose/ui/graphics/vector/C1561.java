package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.AbstractC1603;
import androidx.compose.ui.graphics.C1612;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.InterfaceC1578;
import androidx.compose.ui.graphics.drawscope.C1509;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561 extends AbstractC1532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f4580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC1598 f4584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1614 f4585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1614 f4586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5184 f4587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1509 f4590;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1614 f4591;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4593;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC1598 f4595;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f4583 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f4582 = AbstractC1539.f4469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f4581 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f4594 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f4598 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f4599 = 4.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4597 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f4588 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f4592 = true;

    public C1561() {
        C1614 c1614M2957 = AbstractC1603.m2957();
        this.f4591 = c1614M2957;
        this.f4586 = c1614M2957;
        this.f4587 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new InterfaceC6543() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // p052.InterfaceC6543
            public final InterfaceC1578 invoke() {
                return new C1612(new PathMeasure());
            }
        });
    }

    public final String toString() {
        return this.f4591.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2835() {
        float f = this.f4596;
        C1614 c1614 = this.f4591;
        if (f == 0.0f && this.f4597 == 1.0f) {
            this.f4586 = c1614;
            return;
        }
        if (AbstractC4395.m8907(this.f4586, c1614)) {
            this.f4586 = AbstractC1603.m2957();
        } else {
            Path.FillType fillType = this.f4586.f4725.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f4586.f4725.rewind();
            Path path = this.f4586.f4725;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        InterfaceC5184 interfaceC5184 = this.f4587;
        ((C1612) ((InterfaceC1578) interfaceC5184.getValue())).f4720.setPath(c1614 != null ? c1614.f4725 : null, false);
        float length = ((C1612) ((InterfaceC1578) interfaceC5184.getValue())).f4720.getLength();
        float f2 = this.f4596;
        float f3 = this.f4589;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f4597 + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C1612) ((InterfaceC1578) interfaceC5184.getValue())).m2976(f4, f5, this.f4586);
            return;
        }
        C1614 c1614M2957 = this.f4585;
        if (c1614M2957 == null) {
            c1614M2957 = AbstractC1603.m2957();
            this.f4585 = c1614M2957;
        }
        c1614M2957.m2983();
        ((C1612) ((InterfaceC1578) interfaceC5184.getValue())).m2976(f4, length, c1614M2957);
        C1614.m2979(this.f4586, c1614M2957);
        c1614M2957.m2983();
        ((C1612) ((InterfaceC1578) interfaceC5184.getValue())).m2976(0.0f, f5, c1614M2957);
        C1614.m2979(this.f4586, c1614M2957);
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2818(InterfaceC1504 interfaceC1504) {
        C1509 c1509;
        if (this.f4588) {
            AbstractC1547.m2833(this.f4582, this.f4591);
            m2835();
        } else if (this.f4593) {
            m2835();
        }
        this.f4588 = false;
        this.f4593 = false;
        AbstractC1598 abstractC1598 = this.f4584;
        if (abstractC1598 != null) {
            InterfaceC1504.m2698(interfaceC1504, this.f4586, abstractC1598, this.f4583, null, 56);
        }
        AbstractC1598 abstractC15982 = this.f4595;
        if (abstractC15982 != null) {
            C1509 c15092 = this.f4590;
            if (this.f4592 || c15092 == null) {
                C1509 c15093 = new C1509(this.f4580, this.f4599, this.f4594, this.f4598, null, 16);
                this.f4590 = c15093;
                this.f4592 = false;
                c1509 = c15093;
            } else {
                c1509 = c15092;
            }
            InterfaceC1504.m2698(interfaceC1504, this.f4586, abstractC15982, this.f4581, c1509, 48);
        }
    }
}
