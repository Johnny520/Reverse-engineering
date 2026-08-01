package androidx.compose.foundation.layout;

import android.graphics.Matrix;
import android.graphics.Path;
import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.text.C2888;
import androidx.compose.p001ui.text.C2899;
import kotlin.C6008;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p211.AbstractC8663;
import p228.C8780;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1514 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f2215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ int f2217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2218;

    public /* synthetic */ C1514(int i, AbstractC2559 abstractC2559, int i2) {
        this.f2218 = 2;
        this.f2217 = i;
        this.f2216 = abstractC2559;
        this.f2215 = i2;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f2218;
        C6008 c6008 = C6008.f15084;
        int i2 = this.f2215;
        int i3 = this.f2217;
        Object obj2 = this.f2216;
        switch (i) {
            case 0:
                ((AbstractC2543) obj).m3695((AbstractC2559) obj2, i3, i2, 0.0f);
                break;
            case 1:
                ((AbstractC2543) obj).m3695((AbstractC2559) obj2, i3, i2, 0.0f);
                break;
            case 2:
                ((AbstractC2543) obj).m3695((AbstractC2559) obj2, AbstractC7390.m12617((i3 - r9.f5344) / 2.0f), AbstractC7390.m12617((i2 - r9.f5342) / 2.0f), 0.0f);
                break;
            default:
                C2449 c2449 = (C2449) obj2;
                C2899 c2899 = (C2899) obj;
                C2888 c2888 = c2899.f6467;
                int iM4358 = c2899.m4358(i3);
                int iM43582 = c2899.m4358(i2);
                CharSequence charSequence = c2888.f6430;
                if (iM4358 < 0 || iM4358 > iM43582 || iM43582 > charSequence.length()) {
                    StringBuilder sbM709 = AbstractC0900.m709(iM4358, iM43582, "start(", ") or end(", ") is out of range [0..");
                    sbM709.append(charSequence.length());
                    sbM709.append("], or start > end!");
                    AbstractC8663.m13757(sbM709.toString());
                }
                Path path = new Path();
                C8780 c8780 = c2888.f6431;
                c8780.f22346.getSelectionPath(iM4358, iM43582, path);
                int i4 = c8780.f22357;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c2899.f6462)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                c2449.f5070.addPath(path, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1514(Object obj, int i, int i2, int i3) {
        this.f2218 = i3;
        this.f2216 = obj;
        this.f2217 = i;
        this.f2215 = i2;
    }
}
