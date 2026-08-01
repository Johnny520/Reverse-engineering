package androidx.compose.foundation.layout;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.text.C2054;
import androidx.compose.ui.text.C2065;
import kotlin.C5175;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p195.AbstractC7833;
import p212.C7950;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0673 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f1869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f1871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1872;

    public /* synthetic */ C0673(int i, AbstractC1724 abstractC1724, int i2) {
        this.f1872 = 2;
        this.f1871 = i;
        this.f1870 = abstractC1724;
        this.f1869 = i2;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1872;
        C5175 c5175 = C5175.f14739;
        int i2 = this.f1869;
        int i3 = this.f1871;
        Object obj2 = this.f1870;
        switch (i) {
            case 0:
                ((AbstractC1708) obj).m3125((AbstractC1724) obj2, i3, i2, 0.0f);
                break;
            case 1:
                ((AbstractC1708) obj).m3125((AbstractC1724) obj2, i3, i2, 0.0f);
                break;
            case 2:
                ((AbstractC1708) obj).m3125((AbstractC1724) obj2, AbstractC6560.m12006((i3 - r9.f4998) / 2.0f), AbstractC6560.m12006((i2 - r9.f4996) / 2.0f), 0.0f);
                break;
            default:
                C1614 c1614 = (C1614) obj2;
                C2065 c2065 = (C2065) obj;
                C2054 c2054 = c2065.f6121;
                int iM3788 = c2065.m3788(i3);
                int iM37882 = c2065.m3788(i2);
                CharSequence charSequence = c2054.f6084;
                if (iM3788 < 0 || iM3788 > iM37882 || iM37882 > charSequence.length()) {
                    StringBuilder sbM151 = AbstractC0053.m151(iM3788, iM37882, "start(", ") or end(", ") is out of range [0..");
                    sbM151.append(charSequence.length());
                    sbM151.append("], or start > end!");
                    AbstractC7833.m13170(sbM151.toString());
                }
                Path path = new Path();
                C7950 c7950 = c2054.f6085;
                c7950.f22004.getSelectionPath(iM3788, iM37882, path);
                int i4 = c7950.f22015;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c2065.f6116)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                c1614.f4724.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0673(Object obj, int i, int i2, int i3) {
        this.f1872 = i3;
        this.f1870 = obj;
        this.f1871 = i;
        this.f1869 = i2;
    }
}
