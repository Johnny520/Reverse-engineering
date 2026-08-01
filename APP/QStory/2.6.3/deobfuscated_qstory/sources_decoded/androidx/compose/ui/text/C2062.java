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
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import p034.AbstractC6347;
import p112.C7328;
import p193.AbstractC7830;
import p193.C7821;
import p195.AbstractC7834;
import p205.AbstractC7897;
import p205.C7898;
import p209.C7931;
import p212.AbstractC7949;
import p212.C7951;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f6101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f6102;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1245 f6105;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f6106;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f6107;

    public C2062(C1245 c1245, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iM13338;
        int i5;
        this.f6105 = c1245;
        this.f6104 = i;
        if (C7898.m13341(j) != 0 || C7898.m13340(j) != 0) {
            AbstractC7834.m13198("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c1245.f3619;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            C2066 c2066 = (C2066) arrayList2.get(i6);
            C7821 c7821 = c2066.f6126;
            int iM13337 = C7898.m13337(j);
            if (C7898.m13334(j)) {
                i4 = i6;
                iM13338 = C7898.m13338(j) - ((int) Math.ceil(f));
                if (iM13338 < 0) {
                    iM13338 = 0;
                }
            } else {
                i4 = i6;
                iM13338 = C7898.m13338(j);
            }
            i3 = 0;
            C2054 c2054 = new C2054(c7821, this.f6104 - i7, i2, AbstractC7897.m13324(0, iM13337, 0, iM13338, 5));
            float fM3780 = c2054.m3780() + f;
            C7951 c7951 = c2054.f6086;
            int i8 = i7 + c7951.f22013;
            arrayList.add(new C2065(c2054, c2066.f6125, c2066.f6124, i7, i8, f, fM3780));
            if (!c7951.f22003) {
                if (i8 == this.f6104) {
                    i5 = i4;
                    if (i5 != AbstractC6347.m11901((ArrayList) this.f6105.f3619)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fM3780;
            }
            z = true;
            i7 = i8;
            f = fM3780;
            break;
        }
        i3 = 0;
        z = false;
        this.f6101 = f;
        this.f6100 = i7;
        this.f6103 = z;
        this.f6106 = arrayList;
        this.f6102 = C7898.m13337(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            C2065 c2065 = (C2065) arrayList.get(i9);
            List list = c2065.f6122.f6084;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                C7328 c7328 = (C7328) list.get(i10);
                arrayList4.add(c7328 != null ? c2065.m3801(c7328) : null);
            }
            AbstractC4344.m8804(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f6105.f3621).size()) {
            int size4 = ((List) this.f6105.f3621).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC4344.m8793(arrayList5, arrayList3);
        }
        this.f6107 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m3784(C2062 c2062, InterfaceC1601 interfaceC1601, long j, C1570 c1570, C7931 c7931, AbstractC1505 abstractC1505) {
        interfaceC1601.mo2677();
        ArrayList arrayList = c2062.f6106;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2065 c2065 = (C2065) arrayList.get(i);
            c2065.f6122.m3776(interfaceC1601, j, c1570, c7931, abstractC1505);
            interfaceC1601.mo2685(0.0f, c2065.f6122.m3780());
        }
        interfaceC1601.mo2689();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m3785(C2062 c2062, InterfaceC1601 interfaceC1601, AbstractC1598 abstractC1598, float f, C1570 c1570, C7931 c7931, AbstractC1505 abstractC1505) {
        interfaceC1601.mo2677();
        ArrayList arrayList = c2062.f6106;
        if (arrayList.size() <= 1 || (abstractC1598 instanceof C1571)) {
            AbstractC7830.m13194(c2062, interfaceC1601, abstractC1598, f, c1570, c7931, abstractC1505);
        } else {
            if (!(abstractC1598 instanceof AbstractC1574)) {
                C4211.m8611();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM3780 = 0.0f;
            for (int i = 0; i < size; i++) {
                C2065 c2065 = (C2065) arrayList.get(i);
                fM3780 += c2065.f6122.m3780();
                fMax = Math.max(fMax, c2065.f6122.m3778());
            }
            Shader shaderMo2868 = ((AbstractC1574) abstractC1598).mo2868((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM3780)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo2868.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2054 c2054 = ((C2065) arrayList.get(i2)).f6122;
                c2054.m3782(interfaceC1601, new C1597(shaderMo2868), f, c1570, c7931, abstractC1505);
                interfaceC1601.mo2685(0.0f, c2054.m3780());
                matrix.setTranslate(0.0f, -c2054.m3780());
                shaderMo2868.setLocalMatrix(matrix);
            }
        }
        interfaceC1601.mo2689();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m3786(int i) {
        m3792(i);
        ArrayList arrayList = this.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3767(i, arrayList));
        C2054 c2054 = c2065.f6122;
        return c2054.f6086.m13446(i - c2065.f6119) + c2065.f6117;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m3787(float f) {
        ArrayList arrayList = this.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3766(arrayList, f));
        int i = c2065.f6120 - c2065.f6121;
        int i2 = c2065.f6119;
        if (i == 0) {
            return i2;
        }
        C2054 c2054 = c2065.f6122;
        float f2 = f - c2065.f6117;
        C7951 c7951 = c2054.f6086;
        return c7951.f22001.getLineForVertical(((int) f2) - c7951.f22012) + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m3788(int i) {
        int length = ((C2068) this.f6105.f3620).f6129.length();
        ArrayList arrayList = this.f6106;
        C2065 c2065 = (C2065) arrayList.get(i >= length ? AbstractC6347.m11901(arrayList) : i < 0 ? 0 : AbstractC2048.m3768(i, arrayList));
        return c2065.f6122.f6086.f22001.getLineForOffset(c2065.m3798(i)) + c2065.f6119;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m3789(int i, boolean z) {
        int iM13439;
        m3792(i);
        ArrayList arrayList = this.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3767(i, arrayList));
        C2054 c2054 = c2065.f6122;
        int i2 = i - c2065.f6119;
        C7951 c7951 = c2054.f6086;
        if (z) {
            Layout layout = c7951.f22001;
            ThreadLocal threadLocal = AbstractC7949.f21999;
            if (layout.getEllipsisCount(i2) <= 0 || c7951.f22005 != TextUtils.TruncateAt.END) {
                C1245 c1245M13442 = c7951.m13442();
                Layout layout2 = (Layout) c1245M13442.f3620;
                iM13439 = c1245M13442.m2160(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM13439 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM13439 = c7951.m13439(i2);
        }
        return iM13439 + c2065.f6121;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m3790(int i) {
        m3792(i);
        ArrayList arrayList = this.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3767(i, arrayList));
        C2054 c2054 = c2065.f6122;
        return c2054.f6086.m13440(i - c2065.f6119) + c2065.f6117;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3791(long j, float[] fArr) {
        m3795(C2035.m3757(j));
        m3796(C2035.m3750(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        AbstractC2048.m3773(this.f6106, j, new C1065(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3792(int i) {
        boolean z = false;
        int i2 = this.f6100;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC7834.m13198("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long m3793(C7328 c7328, int i, C2044 c2044) {
        long jM3800;
        long j;
        float f = c7328.f19539;
        ArrayList arrayList = this.f6106;
        int iM3766 = AbstractC2048.m3766(arrayList, f);
        float f2 = ((C2065) arrayList.get(iM3766)).f6123;
        float f3 = c7328.f19537;
        if (f2 >= f3 || iM3766 == AbstractC6347.m11901(arrayList)) {
            C2065 c2065 = (C2065) arrayList.get(iM3766);
            return c2065.m3800(c2065.f6122.m3779(c2065.m3799(c7328), i, c2044), true);
        }
        int iM37662 = AbstractC2048.m3766(arrayList, f3);
        long jM38002 = C2035.f6003;
        while (true) {
            jM3800 = C2035.f6003;
            if (!C2035.m3753(jM38002, jM3800) || iM3766 > iM37662) {
                break;
            }
            C2065 c20652 = (C2065) arrayList.get(iM3766);
            jM38002 = c20652.m3800(c20652.f6122.m3779(c20652.m3799(c7328), i, c2044), true);
            iM3766++;
        }
        if (C2035.m3753(jM38002, jM3800)) {
            return jM3800;
        }
        while (true) {
            j = C2035.f6003;
            if (!C2035.m3753(jM3800, j) || iM3766 > iM37662) {
                break;
            }
            C2065 c20653 = (C2065) arrayList.get(iM37662);
            jM3800 = c20653.m3800(c20653.f6122.m3779(c20653.m3799(c7328), i, c2044), true);
            iM37662--;
        }
        return C2035.m3753(jM3800, j) ? jM38002 : AbstractC2048.m3770((int) (jM38002 >> 32), (int) (4294967295L & jM3800));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m3794(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f6106;
        C2065 c2065 = (C2065) arrayList.get(AbstractC2048.m3766(arrayList, fIntBitsToFloat));
        int i2 = c2065.f6120;
        int i3 = c2065.f6121;
        if (i2 - i3 == 0) {
            return i3;
        }
        C2054 c2054 = c2065.f6122;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - c2065.f6117;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        C7951 c7951 = c2054.f6086;
        int lineForVertical = c7951.f22001.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c7951.f22012);
        return c7951.f22001.getOffsetForHorizontal(lineForVertical, (c7951.m13443(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3795(int i) {
        C2068 c2068 = (C2068) this.f6105.f3620;
        if (i < 0 || i >= c2068.f6129.length()) {
            StringBuilder sbM150 = AbstractC0053.m150(i, "offset(", ") is out of bounds [0, ");
            sbM150.append(c2068.f6129.length());
            sbM150.append(')');
            AbstractC7834.m13198(sbM150.toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3796(int i) {
        C2068 c2068 = (C2068) this.f6105.f3620;
        if (i < 0 || i > c2068.f6129.length()) {
            StringBuilder sbM150 = AbstractC0053.m150(i, "offset(", ") is out of bounds [0, ");
            sbM150.append(c2068.f6129.length());
            sbM150.append(']');
            AbstractC7834.m13198(sbM150.toString());
        }
    }
}
