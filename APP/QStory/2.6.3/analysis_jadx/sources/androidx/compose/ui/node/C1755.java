package androidx.compose.ui.node;

import androidx.appcompat.widget.C0191;
import androidx.compose.ui.layout.AbstractC1720;
import androidx.compose.ui.layout.InterfaceC1723;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1755 implements InterfaceC1723 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1754 f5153;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f5154 = 9223372034707292159L;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f5155 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f5156;

    public C1755(AbstractC1754 abstractC1754) {
        this.f5153 = abstractC1754;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f5153.mo1256();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3295(AbstractC1720 abstractC1720, float f) {
        AbstractC1754 abstractC1754 = this.f5153;
        C0191 c0191 = abstractC1754.f5145;
        if (c0191 == null) {
            c0191 = new C0191();
            abstractC1754.f5145 = c0191;
        }
        int iM8852 = AbstractC4347.m8852(abstractC1720, (AbstractC1720[]) c0191.f749);
        if (iM8852 >= 0) {
            float[] fArr = (float[]) c0191.f748;
            if (fArr[iM8852] != f) {
                fArr[iM8852] = f;
                ((byte[]) c0191.f747)[iM8852] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c0191.f747;
                if (bArr[iM8852] == 2) {
                    bArr[iM8852] = 0;
                    return;
                }
                return;
            }
        }
        int i = c0191.f750;
        AbstractC1720[] abstractC1720Arr = (AbstractC1720[]) c0191.f749;
        if (i == abstractC1720Arr.length) {
            int i2 = i * 2;
            c0191.f749 = (AbstractC1720[]) Arrays.copyOf(abstractC1720Arr, i2);
            c0191.f748 = Arrays.copyOf((float[]) c0191.f748, i2);
            c0191.f747 = Arrays.copyOf((byte[]) c0191.f747, i2);
        }
        ((AbstractC1720[]) c0191.f749)[i] = abstractC1720;
        ((byte[]) c0191.f747)[i] = 3;
        ((float[]) c0191.f748)[i] = f;
        c0191.f750++;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f5153.mo1257();
    }
}
