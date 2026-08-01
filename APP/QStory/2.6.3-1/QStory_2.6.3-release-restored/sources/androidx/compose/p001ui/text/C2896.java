package androidx.compose.p001ui.text;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1903;
import androidx.compose.p001ui.graphics.AbstractC2409;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.C2406;
import androidx.compose.p001ui.graphics.C2432;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.runtime.internal.C2080;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import p050.AbstractC7176;
import p128.C8157;
import p209.AbstractC8659;
import p209.C8650;
import p211.AbstractC8663;
import p221.AbstractC8726;
import p221.C8727;
import p225.C8760;
import p228.AbstractC8778;
import p228.C8780;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2896 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f6446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f6447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6448;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2080 f6450;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f6451;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f6452;

    public C2896(C2080 c2080, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iM13897;
        int i5;
        this.f6450 = c2080;
        this.f6449 = i;
        if (C8727.m13900(j) != 0 || C8727.m13899(j) != 0) {
            AbstractC8663.m13757("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c2080.f3964;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            C2900 c2900 = (C2900) arrayList2.get(i6);
            C8650 c8650 = c2900.f6471;
            int iM13896 = C8727.m13896(j);
            if (C8727.m13893(j)) {
                i4 = i6;
                iM13897 = C8727.m13897(j) - ((int) Math.ceil(f));
                if (iM13897 < 0) {
                    iM13897 = 0;
                }
            } else {
                i4 = i6;
                iM13897 = C8727.m13897(j);
            }
            i3 = 0;
            C2888 c2888 = new C2888(c8650, this.f6449 - i7, i2, AbstractC8726.m13883(0, iM13896, 0, iM13897, 5));
            float fM4340 = c2888.m4340() + f;
            C8780 c8780 = c2888.f6431;
            int i8 = i7 + c8780.f22358;
            arrayList.add(new C2899(c2888, c2900.f6470, c2900.f6469, i7, i8, f, fM4340));
            if (!c8780.f22348) {
                if (i8 == this.f6449) {
                    i5 = i4;
                    if (i5 != AbstractC7176.m12460((ArrayList) this.f6450.f3964)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fM4340;
            }
            z = true;
            i7 = i8;
            f = fM4340;
            break;
        }
        i3 = 0;
        z = false;
        this.f6446 = f;
        this.f6445 = i7;
        this.f6448 = z;
        this.f6451 = arrayList;
        this.f6447 = C8727.m13896(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            C2899 c2899 = (C2899) arrayList.get(i9);
            List list = c2899.f6467.f6429;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                C8157 c8157 = (C8157) list.get(i10);
                arrayList4.add(c8157 != null ? c2899.m4361(c8157) : null);
            }
            AbstractC5176.m9363(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.f6450.f3966).size()) {
            int size4 = ((List) this.f6450.f3966).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = AbstractC5176.m9352(arrayList5, arrayList3);
        }
        this.f6452 = arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m4344(C2896 c2896, InterfaceC2436 interfaceC2436, long j, C2405 c2405, C8760 c8760, AbstractC2340 abstractC2340) {
        interfaceC2436.mo3237();
        ArrayList arrayList = c2896.f6451;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2899 c2899 = (C2899) arrayList.get(i);
            c2899.f6467.m4336(interfaceC2436, j, c2405, c8760, abstractC2340);
            interfaceC2436.mo3245(0.0f, c2899.f6467.m4340());
        }
        interfaceC2436.mo3249();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m4345(C2896 c2896, InterfaceC2436 interfaceC2436, AbstractC2433 abstractC2433, float f, C2405 c2405, C8760 c8760, AbstractC2340 abstractC2340) {
        interfaceC2436.mo3237();
        ArrayList arrayList = c2896.f6451;
        if (arrayList.size() <= 1 || (abstractC2433 instanceof C2406)) {
            AbstractC8659.m13753(c2896, interfaceC2436, abstractC2433, f, c2405, c8760, abstractC2340);
        } else {
            if (!(abstractC2433 instanceof AbstractC2409)) {
                C5043.m9170();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fM4340 = 0.0f;
            for (int i = 0; i < size; i++) {
                C2899 c2899 = (C2899) arrayList.get(i);
                fM4340 += c2899.f6467.m4340();
                fMax = Math.max(fMax, c2899.f6467.m4338());
            }
            Shader shaderMo3428 = ((AbstractC2409) abstractC2433).mo3428((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fM4340)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderMo3428.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C2888 c2888 = ((C2899) arrayList.get(i2)).f6467;
                c2888.m4342(interfaceC2436, new C2432(shaderMo3428), f, c2405, c8760, abstractC2340);
                interfaceC2436.mo3245(0.0f, c2888.m4340());
                matrix.setTranslate(0.0f, -c2888.m4340());
                shaderMo3428.setLocalMatrix(matrix);
            }
        }
        interfaceC2436.mo3249();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float m4346(int i) {
        m4352(i);
        ArrayList arrayList = this.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(i, arrayList));
        C2888 c2888 = c2899.f6467;
        return c2888.f6431.m14005(i - c2899.f6464) + c2899.f6462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m4347(float f) {
        ArrayList arrayList = this.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4326(arrayList, f));
        int i = c2899.f6465 - c2899.f6466;
        int i2 = c2899.f6464;
        if (i == 0) {
            return i2;
        }
        C2888 c2888 = c2899.f6467;
        float f2 = f - c2899.f6462;
        C8780 c8780 = c2888.f6431;
        return c8780.f22346.getLineForVertical(((int) f2) - c8780.f22357) + i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4348(int i) {
        int length = ((C2902) this.f6450.f3965).f6474.length();
        ArrayList arrayList = this.f6451;
        C2899 c2899 = (C2899) arrayList.get(i >= length ? AbstractC7176.m12460(arrayList) : i < 0 ? 0 : AbstractC2882.m4328(i, arrayList));
        return c2899.f6467.f6431.f22346.getLineForOffset(c2899.m4358(i)) + c2899.f6464;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m4349(int i, boolean z) {
        int iM13998;
        m4352(i);
        ArrayList arrayList = this.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(i, arrayList));
        C2888 c2888 = c2899.f6467;
        int i2 = i - c2899.f6464;
        C8780 c8780 = c2888.f6431;
        if (z) {
            Layout layout = c8780.f22346;
            ThreadLocal threadLocal = AbstractC8778.f22344;
            if (layout.getEllipsisCount(i2) <= 0 || c8780.f22350 != TextUtils.TruncateAt.END) {
                C2080 c2080M14001 = c8780.m14001();
                Layout layout2 = (Layout) c2080M14001.f3965;
                iM13998 = c2080M14001.m2720(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iM13998 = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iM13998 = c8780.m13998(i2);
        }
        return iM13998 + c2899.f6466;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m4350(int i) {
        m4352(i);
        ArrayList arrayList = this.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4327(i, arrayList));
        C2888 c2888 = c2899.f6467;
        return c2888.f6431.m13999(i - c2899.f6464) + c2899.f6462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4351(long j, float[] fArr) {
        m4355(C2869.m4317(j));
        m4356(C2869.m4310(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        AbstractC2882.m4333(this.f6451, j, new C1903(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m4352(int i) {
        boolean z = false;
        int i2 = this.f6445;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC8663.m13757("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long m4353(C8157 c8157, int i, C2878 c2878) {
        long jM4360;
        long j;
        float f = c8157.f19884;
        ArrayList arrayList = this.f6451;
        int iM4326 = AbstractC2882.m4326(arrayList, f);
        float f2 = ((C2899) arrayList.get(iM4326)).f6468;
        float f3 = c8157.f19882;
        if (f2 >= f3 || iM4326 == AbstractC7176.m12460(arrayList)) {
            C2899 c2899 = (C2899) arrayList.get(iM4326);
            return c2899.m4360(c2899.f6467.m4339(c2899.m4359(c8157), i, c2878), true);
        }
        int iM43262 = AbstractC2882.m4326(arrayList, f3);
        long jM43602 = C2869.f6348;
        while (true) {
            jM4360 = C2869.f6348;
            if (!C2869.m4313(jM43602, jM4360) || iM4326 > iM43262) {
                break;
            }
            C2899 c28992 = (C2899) arrayList.get(iM4326);
            jM43602 = c28992.m4360(c28992.f6467.m4339(c28992.m4359(c8157), i, c2878), true);
            iM4326++;
        }
        if (C2869.m4313(jM43602, jM4360)) {
            return jM4360;
        }
        while (true) {
            j = C2869.f6348;
            if (!C2869.m4313(jM4360, j) || iM4326 > iM43262) {
                break;
            }
            C2899 c28993 = (C2899) arrayList.get(iM43262);
            jM4360 = c28993.m4360(c28993.f6467.m4339(c28993.m4359(c8157), i, c2878), true);
            iM43262--;
        }
        return C2869.m4313(jM4360, j) ? jM43602 : AbstractC2882.m4330((int) (jM43602 >> 32), (int) (4294967295L & jM4360));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int m4354(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.f6451;
        C2899 c2899 = (C2899) arrayList.get(AbstractC2882.m4326(arrayList, fIntBitsToFloat));
        int i2 = c2899.f6465;
        int i3 = c2899.f6466;
        if (i2 - i3 == 0) {
            return i3;
        }
        C2888 c2888 = c2899.f6467;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - c2899.f6462;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        C8780 c8780 = c2888.f6431;
        int lineForVertical = c8780.f22346.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - c8780.f22357);
        return c8780.f22346.getOffsetForHorizontal(lineForVertical, (c8780.m14002(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4355(int i) {
        C2902 c2902 = (C2902) this.f6450.f3965;
        if (i < 0 || i >= c2902.f6474.length()) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "offset(", ") is out of bounds [0, ");
            sbM710.append(c2902.f6474.length());
            sbM710.append(')');
            AbstractC8663.m13757(sbM710.toString());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m4356(int i) {
        C2902 c2902 = (C2902) this.f6450.f3965;
        if (i < 0 || i > c2902.f6474.length()) {
            StringBuilder sbM710 = AbstractC0900.m710(i, "offset(", ") is out of bounds [0, ");
            sbM710.append(c2902.f6474.length());
            sbM710.append(']');
            AbstractC8663.m13757(sbM710.toString());
        }
    }
}
