package androidx.compose.p001ui.graphics.vector;

import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.AbstractC2438;
import androidx.compose.p001ui.graphics.C2447;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.InterfaceC2413;
import androidx.compose.p001ui.graphics.drawscope.C2344;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2396 extends AbstractC2367 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f4925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC2433 f4929;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2449 f4930;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2449 f4931;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6016 f4932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4934;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2344 f4935;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2449 f4936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f4938;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public AbstractC2433 f4940;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public float f4928 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public List f4927 = AbstractC2374.f4814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f4926 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f4939 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f4943 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public float f4944 = 4.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4942 = 1.0f;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f4933 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f4937 = true;

    public C2396() {
        C2449 c2449M3517 = AbstractC2438.m3517();
        this.f4936 = c2449M3517;
        this.f4931 = c2449M3517;
        this.f4932 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new InterfaceC7372() { // from class: androidx.compose.ui.graphics.vector.PathComponent$pathMeasure$2
            @Override // p068.InterfaceC7372
            public final InterfaceC2413 invoke() {
                return new C2447(new PathMeasure());
            }
        });
    }

    public final String toString() {
        return this.f4936.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3395() {
        float f = this.f4941;
        C2449 c2449 = this.f4936;
        if (f == 0.0f && this.f4942 == 1.0f) {
            this.f4931 = c2449;
            return;
        }
        if (AbstractC5227.m9466(this.f4931, c2449)) {
            this.f4931 = AbstractC2438.m3517();
        } else {
            Path.FillType fillType = this.f4931.f5070.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z = fillType == fillType2;
            this.f4931.f5070.rewind();
            Path path = this.f4931.f5070;
            if (!z) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        InterfaceC6016 interfaceC6016 = this.f4932;
        ((C2447) ((InterfaceC2413) interfaceC6016.getValue())).f5065.setPath(c2449 != null ? c2449.f5070 : null, false);
        float length = ((C2447) ((InterfaceC2413) interfaceC6016.getValue())).f5065.getLength();
        float f2 = this.f4941;
        float f3 = this.f4934;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.f4942 + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((C2447) ((InterfaceC2413) interfaceC6016.getValue())).m3536(f4, f5, this.f4931);
            return;
        }
        C2449 c2449M3517 = this.f4930;
        if (c2449M3517 == null) {
            c2449M3517 = AbstractC2438.m3517();
            this.f4930 = c2449M3517;
        }
        c2449M3517.m3543();
        ((C2447) ((InterfaceC2413) interfaceC6016.getValue())).m3536(f4, length, c2449M3517);
        C2449.m3539(this.f4931, c2449M3517);
        c2449M3517.m3543();
        ((C2447) ((InterfaceC2413) interfaceC6016.getValue())).m3536(0.0f, f5, c2449M3517);
        C2449.m3539(this.f4931, c2449M3517);
    }

    @Override // androidx.compose.p001ui.graphics.vector.AbstractC2367
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3378(InterfaceC2339 interfaceC2339) {
        C2344 c2344;
        if (this.f4933) {
            AbstractC2382.m3393(this.f4927, this.f4936);
            m3395();
        } else if (this.f4938) {
            m3395();
        }
        this.f4933 = false;
        this.f4938 = false;
        AbstractC2433 abstractC2433 = this.f4929;
        if (abstractC2433 != null) {
            InterfaceC2339.m3258(interfaceC2339, this.f4931, abstractC2433, this.f4928, null, 56);
        }
        AbstractC2433 abstractC24332 = this.f4940;
        if (abstractC24332 != null) {
            C2344 c23442 = this.f4935;
            if (this.f4937 || c23442 == null) {
                C2344 c23443 = new C2344(this.f4925, this.f4944, this.f4939, this.f4943, null, 16);
                this.f4935 = c23443;
                this.f4937 = false;
                c2344 = c23443;
            } else {
                c2344 = c23442;
            }
            InterfaceC2339.m3258(interfaceC2339, this.f4931, abstractC24332, this.f4926, c2344, 48);
        }
    }
}
