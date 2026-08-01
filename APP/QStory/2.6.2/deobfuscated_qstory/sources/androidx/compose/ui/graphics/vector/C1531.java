package androidx.compose.ui.graphics.vector;

import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p112.C7325;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531 extends AbstractC1532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6542 f4443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1548 f4444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f4446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1546 f4447;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f4448;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1607 f4449;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f4450;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4451;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4452;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC1395 f4453;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f4454;

    public C1531(C1546 c1546) {
        this.f4447 = c1546;
        c1546.f4530 = new InterfaceC6557() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$1
            {
                super(1);
            }

            public final void invoke(AbstractC1532 abstractC1532) {
                C1531 c1531 = this.this$0;
                c1531.f4445 = true;
                c1531.f4443.invoke();
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1532) obj);
                return C5175.f14739;
            }
        };
        this.f4446 = "";
        this.f4445 = true;
        this.f4444 = new C1548();
        this.f4443 = new InterfaceC6542() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m2802invoke();
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2802invoke() {
            }
        };
        this.f4450 = AbstractC1367.m2465(null);
        this.f4453 = AbstractC1367.m2465(new C7325(0L));
        this.f4454 = 9205357640488583168L;
        this.f4451 = 1.0f;
        this.f4452 = 1.0f;
        this.f4448 = new InterfaceC6557() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            public final void invoke(InterfaceC1504 interfaceC1504) {
                C1531 c1531 = this.this$0;
                C1546 c15462 = c1531.f4447;
                float f = c1531.f4451;
                float f2 = c1531.f4452;
                C0108 c0108Mo2696 = interfaceC1504.mo2696();
                long jM367 = c0108Mo2696.m367();
                c0108Mo2696.m385().mo2667();
                try {
                    ((C0113) c0108Mo2696.f319).m432(f, f2, 0L);
                    c15462.mo2808(interfaceC1504);
                } finally {
                    c0108Mo2696.m385().mo2679();
                    c0108Mo2696.m360(jM367);
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1504) obj);
                return C5175.f14739;
            }
        };
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f4446);
        sb.append("\n\tviewportWidth: ");
        InterfaceC1395 interfaceC1395 = this.f4453;
        sb.append(Float.intBitsToFloat((int) (((C7325) ((AbstractC1347) interfaceC1395).getValue()).f19532 >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C7325) ((AbstractC1347) interfaceC1395).getValue()).f19532 & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2807(androidx.compose.ui.graphics.drawscope.InterfaceC1504 r32, float r33, androidx.compose.ui.graphics.C1607 r34) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.C1531.m2807(androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世兰苏哲, float, androidx.compose.ui.graphics.飘花落叶言子楪哲苏世兰):void");
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2808(InterfaceC1504 interfaceC1504) {
        m2807(interfaceC1504, 1.0f, null);
    }
}
