package androidx.compose.ui.graphics.vector;

import androidx.appcompat.app.C0108;
import androidx.appcompat.app.C0113;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p112.C7326;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531 extends AbstractC1532 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6543 f4444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1548 f4445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f4447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1546 f4448;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f4449;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C1607 f4450;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f4451;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4452;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4453;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC1395 f4454;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f4455;

    public C1531(C1546 c1546) {
        this.f4448 = c1546;
        c1546.f4531 = new InterfaceC6558() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$1
            {
                super(1);
            }

            public final void invoke(AbstractC1532 abstractC1532) {
                C1531 c1531 = this.this$0;
                c1531.f4446 = true;
                c1531.f4444.invoke();
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1532) obj);
                return C5176.f14739;
            }
        };
        this.f4447 = "";
        this.f4446 = true;
        this.f4445 = new C1548();
        this.f4444 = new InterfaceC6543() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m2812invoke();
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2812invoke() {
            }
        };
        this.f4451 = AbstractC1367.m2474(null);
        this.f4454 = AbstractC1367.m2474(new C7326(0L));
        this.f4455 = 9205357640488583168L;
        this.f4452 = 1.0f;
        this.f4453 = 1.0f;
        this.f4449 = new InterfaceC6558() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            public final void invoke(InterfaceC1504 interfaceC1504) {
                C1531 c1531 = this.this$0;
                C1546 c15462 = c1531.f4448;
                float f = c1531.f4452;
                float f2 = c1531.f4453;
                C0108 c0108Mo2706 = interfaceC1504.mo2706();
                long jM368 = c0108Mo2706.m368();
                c0108Mo2706.m386().mo2677();
                try {
                    ((C0113) c0108Mo2706.f319).m433(f, f2, 0L);
                    c15462.mo2818(interfaceC1504);
                } finally {
                    c0108Mo2706.m386().mo2689();
                    c0108Mo2706.m361(jM368);
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1504) obj);
                return C5176.f14739;
            }
        };
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f4447);
        sb.append("\n\tviewportWidth: ");
        InterfaceC1395 interfaceC1395 = this.f4454;
        sb.append(Float.intBitsToFloat((int) (((C7326) ((AbstractC1347) interfaceC1395).getValue()).f19527 >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C7326) ((AbstractC1347) interfaceC1395).getValue()).f19527 & 4294967295L)));
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
    public final void m2817(androidx.compose.ui.graphics.drawscope.InterfaceC1504 r32, float r33, androidx.compose.ui.graphics.C1607 r34) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.C1531.m2817(androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世兰苏哲, float, androidx.compose.ui.graphics.飘花落叶言子楪哲苏世兰):void");
    }

    @Override // androidx.compose.ui.graphics.vector.AbstractC1532
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2818(InterfaceC1504 interfaceC1504) {
        m2817(interfaceC1504, 1.0f, null);
    }
}
