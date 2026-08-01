package androidx.compose.p001ui.node;

import androidx.appcompat.widget.C1038;
import androidx.compose.p001ui.layout.AbstractC2555;
import androidx.compose.p001ui.layout.InterfaceC2558;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2590 implements InterfaceC2558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2589 f5498;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f5499 = 9223372034707292159L;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f5500 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f5501;

    public C2590(AbstractC2589 abstractC2589) {
        this.f5498 = abstractC2589;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f5498.mo1816();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3855(AbstractC2555 abstractC2555, float f) {
        AbstractC2589 abstractC2589 = this.f5498;
        C1038 c1038 = abstractC2589.f5490;
        if (c1038 == null) {
            c1038 = new C1038();
            abstractC2589.f5490 = c1038;
        }
        int iM9411 = AbstractC5179.m9411(abstractC2555, (AbstractC2555[]) c1038.f1094);
        if (iM9411 >= 0) {
            float[] fArr = (float[]) c1038.f1093;
            if (fArr[iM9411] != f) {
                fArr[iM9411] = f;
                ((byte[]) c1038.f1092)[iM9411] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c1038.f1092;
                if (bArr[iM9411] == 2) {
                    bArr[iM9411] = 0;
                    return;
                }
                return;
            }
        }
        int i = c1038.f1095;
        AbstractC2555[] abstractC2555Arr = (AbstractC2555[]) c1038.f1094;
        if (i == abstractC2555Arr.length) {
            int i2 = i * 2;
            c1038.f1094 = (AbstractC2555[]) Arrays.copyOf(abstractC2555Arr, i2);
            c1038.f1093 = Arrays.copyOf((float[]) c1038.f1093, i2);
            c1038.f1092 = Arrays.copyOf((byte[]) c1038.f1092, i2);
        }
        ((AbstractC2555[]) c1038.f1094)[i] = abstractC2555;
        ((byte[]) c1038.f1092)[i] = 3;
        ((float[]) c1038.f1093)[i] = f;
        c1038.f1095++;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f5498.mo1817();
    }
}
