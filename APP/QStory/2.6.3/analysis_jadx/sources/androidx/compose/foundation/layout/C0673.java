package androidx.compose.foundation.layout;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.text.C2054;
import androidx.compose.ui.text.C2065;
import kotlin.C5176;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p195.AbstractC7834;
import p212.C7951;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0673 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f1870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f1872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1873;

    public /* synthetic */ C0673(int i, AbstractC1724 abstractC1724, int i2) {
        this.f1873 = 2;
        this.f1872 = i;
        this.f1871 = abstractC1724;
        this.f1870 = i2;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1873;
        C5176 c5176 = C5176.f14739;
        int i2 = this.f1870;
        int i3 = this.f1872;
        Object obj2 = this.f1871;
        switch (i) {
            case 0:
                ((AbstractC1708) obj).m3135((AbstractC1724) obj2, i3, i2, 0.0f);
                break;
            case 1:
                ((AbstractC1708) obj).m3135((AbstractC1724) obj2, i3, i2, 0.0f);
                break;
            case 2:
                ((AbstractC1708) obj).m3135((AbstractC1724) obj2, AbstractC6561.m12058((i3 - r9.f4999) / 2.0f), AbstractC6561.m12058((i2 - r9.f4997) / 2.0f), 0.0f);
                break;
            default:
                C1614 c1614 = (C1614) obj2;
                C2065 c2065 = (C2065) obj;
                C2054 c2054 = c2065.f6122;
                int iM3798 = c2065.m3798(i3);
                int iM37982 = c2065.m3798(i2);
                CharSequence charSequence = c2054.f6085;
                if (iM3798 < 0 || iM3798 > iM37982 || iM37982 > charSequence.length()) {
                    StringBuilder sbM149 = AbstractC0053.m149(iM3798, iM37982, "start(", ") or end(", ") is out of range [0..");
                    sbM149.append(charSequence.length());
                    sbM149.append("], or start > end!");
                    AbstractC7834.m13198(sbM149.toString());
                }
                Path path = new Path();
                C7951 c7951 = c2054.f6086;
                c7951.f22001.getSelectionPath(iM3798, iM37982, path);
                int i4 = c7951.f22012;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c2065.f6117)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                c1614.f4725.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0673(Object obj, int i, int i2, int i3) {
        this.f1873 = i3;
        this.f1871 = obj;
        this.f1872 = i;
        this.f1870 = i2;
    }
}
