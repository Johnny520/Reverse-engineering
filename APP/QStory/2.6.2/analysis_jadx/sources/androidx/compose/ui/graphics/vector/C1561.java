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
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1561 extends AbstractC1532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f4579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC1598 f4583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1614 f4584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1614 f4585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5183 f4586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1509 f4589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1614 f4590;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4592;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC1598 f4594;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f4582 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f4581 = AbstractC1539.f4468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f4580 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f4593 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f4597 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f4598 = 4.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4596 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f4587 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f4591 = true;

    public C1561() {
        C1614 c1614M2947 = AbstractC1603.m2947();
        this.f4590 = c1614M2947;
        this.f4585 = c1614M2947;
        this.f4586 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new InterfaceC6542() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // p052.InterfaceC6542
            public final InterfaceC1578 invoke() {
                return new C1612(new PathMeasure());
            }
        });
    }

    public final String toString() {
        return this.f4590.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m2825() {
        float f = this.f4595;
        C1614 c1614 = this.f4590;
        if (f == 0.0f && this.f4596 == 1.0f) {
            this.f4585 = c1614;
            return;
        }
        if (AbstractC4394.m8917(this.f4585, c1614)) {
            this.f4585 = AbstractC1603.m2947();
        } else {
            Path.FillType fillType = this.f4585.f4724.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f4585.f4724.rewind();
            Path path = this.f4585.f4724;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        InterfaceC5183 interfaceC5183 = this.f4586;
        ((C1612) ((InterfaceC1578) interfaceC5183.getValue())).f4719.setPath(c1614 != null ? c1614.f4724 : null, false);
        float length = ((C1612) ((InterfaceC1578) interfaceC5183.getValue())).f4719.getLength();
        float f2 = this.f4595;
        float f3 = this.f4588;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f4596 + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C1612) ((InterfaceC1578) interfaceC5183.getValue())).m2966(f4, f5, this.f4585);
            return;
        }
        C1614 c1614M2947 = this.f4584;
        if (c1614M2947 == null) {
            c1614M2947 = AbstractC1603.m2947();
            this.f4584 = c1614M2947;
        }
        c1614M2947.m2973();
        ((C1612) ((InterfaceC1578) interfaceC5183.getValue())).m2966(f4, length, c1614M2947);
        C1614.m2969(this.f4585, c1614M2947);
        c1614M2947.m2973();
        ((C1612) ((InterfaceC1578) interfaceC5183.getValue())).m2966(0.0f, f5, c1614M2947);
        C1614.m2969(this.f4585, c1614M2947);
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2808(InterfaceC1504 interfaceC1504) {
        C1509 c1509;
        if (this.f4587) {
            AbstractC1547.m2823(this.f4581, this.f4590);
            m2825();
        } else if (this.f4592) {
            m2825();
        }
        this.f4587 = false;
        this.f4592 = false;
        AbstractC1598 abstractC1598 = this.f4583;
        if (abstractC1598 != null) {
            InterfaceC1504.m2688(interfaceC1504, this.f4585, abstractC1598, this.f4582, null, 56);
        }
        AbstractC1598 abstractC15982 = this.f4594;
        if (abstractC15982 != null) {
            C1509 c15092 = this.f4589;
            if (this.f4591 || c15092 == null) {
                C1509 c15093 = new C1509(this.f4579, this.f4598, this.f4593, this.f4597, null, 16);
                this.f4589 = c15093;
                this.f4591 = false;
                c1509 = c15093;
            } else {
                c1509 = c15092;
            }
            InterfaceC1504.m2688(interfaceC1504, this.f4585, abstractC15982, this.f4580, c1509, 48);
        }
    }
}
