package androidx.compose.ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1065;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.graphics.AbstractC1574;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.C1597;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import p112.C7327;
import p193.AbstractC7829;
import p193.C7820;
import p195.AbstractC7833;
import p205.AbstractC7896;
import p205.C7897;
import p209.C7930;
import p212.AbstractC7948;
import p212.C7950;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f6100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f6101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1245 f6104;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f6105;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f6106;

    public C2062(C1245 c1245, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iM13310;
        int i5;
        this.f6104 = c1245;
        this.f6103 = i;
        if (C7897.m13313(j) != 0 || C7897.m13312(j) != 0) {
            AbstractC7833.m13170("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c1245.f3618;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            C2066 c2066 = (C2066) arrayList2.get(i6);
            C7820 c7820 = c2066.f6125;
            int iM13309 = C7897.m13309(j);
            if (C7897.m13306(j)) {
                i4 = i6;
                iM13310 = C7897.m13310(j) - ((int) Math.ceil(f));
                if (iM13310 < 0) {
                    iM13310 = 0;
                }
            } else {
                i4 = i6;
                iM13310 = C7897.m13310(j);
            }
            i3 = 0;
            C2054 c2054 = new C2054(c7820, this.f6103 - i7, i2, AbstractC7896.m13296(0, iM13309, 0, iM13310, 5));
            float fM3770 = c2054.m3770() + f;
            C7950 c7950 = c2054.f6085;
            int i8 = i7 + c7950.f22016;
            arrayList.add(new C2065(c2054, c2066.f6124, c2066.f6123, i7, i8, f, fM3770));
            if (!c7950.f22006) {
                if (i8 == this.f6103) {
                    i5 = i4;
                    if (i5 != AbstractC8189.m13673((ArrayList) this.f6104.f3618)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fM3770;
            }
            z = true;
            i7 = i8;
            f = fM3770;
            break;
        }
        i3 = 0;
        z = false;
        this.f6100 = f;
        this.f6099 = i7;
        this.f6102 = z;
        this.f6105 = arrayList;
        this.f6101 = C7897.m13309(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            C2065 c2065 = (C2065) arrayList.get(i9);
            List list = c2065.f6121.f6083;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                C7327 c7327 = (C7327) list.get(i10);
                arrayList4.add(c7327 != null ? c2065.m3791(c7327) : null);
            }
            AbstractC4343.m8794(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f6104.f3620).size()) {
            int size4 = ((List) this.f6104.f3620).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC4343.m8825(arrayList5, arrayList3);
        }
        this.f6106 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m3774(C2062 c2062, InterfaceC1601 interfaceC1601, long j, C1570 c1570, C7930 c7930, AbstractC1505 abstractC1505) {
        interfaceC1601.mo2667();
        ArrayList arrayList = c2062.f6105;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2065 c2065 = (C2065) arrayList.get(i);
            c2065.f6121.m3766(interfaceC1601, j, c1570, c7930, abstractC1505);
            interfaceC1601.mo2675(0.0f, c2065.f6121.m3770());
        }
        interfaceC1601.mo2679();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m3775(C2062 c2062, InterfaceC1601 interfaceC1601, AbstractC1598 abstractC1598, float f, C1570 c1570, C7930 c7930, AbstractC1505 abstractC1505) {
        interfaceC1601.mo2667();
        ArrayList arrayList = c2062.f6105;
        if (arrayList.size() <= 1 || (abstractC1598 instanceof C1571)) {
            AbstractC7829.m13166(c2062, interfaceC1601, abstractC1598, f, c1570, c7930, abstractC1505);
        } else {
            if (!(abstractC1598 instanceof AbstractC1574)) {
                C4210.m8621();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM3770 = 0.0f;
            for (int i = 0; i < size; i++) {
                C2065 c2065 = (C2065) arrayList.get(i);
                fM3770 += c2065.f6121.m3770();
                fMax = Math.max(fMax, c2065.f6121.m3768());
            }
            Shader shaderMo2858 = ((AbstractC1574) abstractC1598).mo2858((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM3770)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo2858.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2054 c2054 = ((C2065) arrayList.get(i2)).f6121;
                c2054.m3772(interfaceC1601, new C1597(shaderMo2858), f, c1570, c7930, abstractC1505);
                interfaceC1601.mo2675(0.0f, c2054.m3770());
                matrix.setTranslate(0.0f, -c2054.m3770());
                shaderMo2858.setLocalMatrix(matrix);
            }
        }
        interfaceC1601.mo2679();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m3776(int i) {
        m3782(i);
        ArrayList arrayList = this.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3757(i, arrayList));
        C2054 c2054 = c2065.f6121;
        return c2054.f6085.m13418(i - c2065.f6118) + c2065.f6116;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m3777(float f) {
        ArrayList arrayList = this.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3756(arrayList, f));
        int i = c2065.f6119 - c2065.f6120;
        int i2 = c2065.f6118;
        if (i == 0) {
            return i2;
        }
        C2054 c2054 = c2065.f6121;
        float f2 = f - c2065.f6116;
        C7950 c7950 = c2054.f6085;
        return c7950.f22004.getLineForVertical(((int) f2) - c7950.f22015) + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m3778(int i) {
        int length = ((C2068) this.f6104.f3619).f6128.length();
        ArrayList arrayList = this.f6105;
        C2065 c2065 = (C2065) arrayList.get(i >= length ? AbstractC8189.m13673(arrayList) : i < 0 ? 0 : AbstractC2048.m3758(i, arrayList));
        return c2065.f6121.f6085.f22004.getLineForOffset(c2065.m3788(i)) + c2065.f6118;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m3779(int i, boolean z) {
        int iM13411;
        m3782(i);
        ArrayList arrayList = this.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3757(i, arrayList));
        C2054 c2054 = c2065.f6121;
        int i2 = i - c2065.f6118;
        C7950 c7950 = c2054.f6085;
        if (z) {
            Layout layout = c7950.f22004;
            ThreadLocal threadLocal = AbstractC7948.f22002;
            if (layout.getEllipsisCount(i2) <= 0 || c7950.f22008 != TextUtils.TruncateAt.END) {
                C1245 c1245M13414 = c7950.m13414();
                Layout layout2 = (Layout) c1245M13414.f3619;
                iM13411 = c1245M13414.m2150(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM13411 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM13411 = c7950.m13411(i2);
        }
        return iM13411 + c2065.f6120;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m3780(int i) {
        m3782(i);
        ArrayList arrayList = this.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3757(i, arrayList));
        C2054 c2054 = c2065.f6121;
        return c2054.f6085.m13412(i - c2065.f6118) + c2065.f6116;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3781(long j, float[] fArr) {
        m3785(C2035.m3747(j));
        m3786(C2035.m3740(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        AbstractC2048.m3763(this.f6105, j, new C1065(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3782(int i) {
        boolean z = false;
        int i2 = this.f6099;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC7833.m13170("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long m3783(C7327 c7327, int i, C2044 c2044) {
        long jM3790;
        long j;
        float f = c7327.f19544;
        ArrayList arrayList = this.f6105;
        int iM3756 = AbstractC2048.m3756(arrayList, f);
        float f2 = ((C2065) arrayList.get(iM3756)).f6122;
        float f3 = c7327.f19542;
        if (f2 >= f3 || iM3756 == AbstractC8189.m13673(arrayList)) {
            C2065 c2065 = (C2065) arrayList.get(iM3756);
            return c2065.m3790(c2065.f6121.m3769(c2065.m3789(c7327), i, c2044), true);
        }
        int iM37562 = AbstractC2048.m3756(arrayList, f3);
        long jM37902 = C2035.f6002;
        while (true) {
            jM3790 = C2035.f6002;
            if (!C2035.m3743(jM37902, jM3790) || iM3756 > iM37562) {
                break;
            }
            C2065 c20652 = (C2065) arrayList.get(iM3756);
            jM37902 = c20652.m3790(c20652.f6121.m3769(c20652.m3789(c7327), i, c2044), true);
            iM3756++;
        }
        if (C2035.m3743(jM37902, jM3790)) {
            return jM3790;
        }
        while (true) {
            j = C2035.f6002;
            if (!C2035.m3743(jM3790, j) || iM3756 > iM37562) {
                break;
            }
            C2065 c20653 = (C2065) arrayList.get(iM37562);
            jM3790 = c20653.m3790(c20653.f6121.m3769(c20653.m3789(c7327), i, c2044), true);
            iM37562--;
        }
        return C2035.m3743(jM3790, j) ? jM37902 : AbstractC2048.m3760((int) (jM37902 >> 32), (int) (4294967295L & jM3790));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m3784(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f6105;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3756(arrayList, fIntBitsToFloat));
        int i2 = c2065.f6119;
        int i3 = c2065.f6120;
        if (i2 - i3 == 0) {
            return i3;
        }
        C2054 c2054 = c2065.f6121;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - c2065.f6116;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        C7950 c7950 = c2054.f6085;
        int lineForVertical = c7950.f22004.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c7950.f22015);
        return c7950.f22004.getOffsetForHorizontal(lineForVertical, (c7950.m13415(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3785(int i) {
        C2068 c2068 = (C2068) this.f6104.f3619;
        if (i < 0 || i >= c2068.f6128.length()) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "offset(", ") is out of bounds [0, ");
            sbM148.append(c2068.f6128.length());
            sbM148.append(')');
            AbstractC7833.m13170(sbM148.toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3786(int i) {
        C2068 c2068 = (C2068) this.f6104.f3619;
        if (i < 0 || i > c2068.f6128.length()) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "offset(", ") is out of bounds [0, ");
            sbM148.append(c2068.f6128.length());
            sbM148.append(']');
            AbstractC7833.m13170(sbM148.toString());
        }
    }
}
