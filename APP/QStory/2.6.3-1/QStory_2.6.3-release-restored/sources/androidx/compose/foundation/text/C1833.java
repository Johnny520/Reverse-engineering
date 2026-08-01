package androidx.compose.foundation.text;

import androidx.compose.animation.core.C1158;
import androidx.compose.animation.core.C1194;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.selection.AbstractC1738;
import androidx.compose.foundation.text.selection.C1726;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2841;
import androidx.compose.runtime.C2215;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.window.layout.InterfaceC3425;
import com.materialkolor.dynamiccolor.AbstractC4636;
import com.materialkolor.dynamiccolor.C4628;
import com.materialkolor.dynamiccolor.C4635;
import com.materialkolor.dynamiccolor.C4644;
import com.materialkolor.dynamiccolor.C4649;
import com.materialkolor.scheme.Variant;
import java.util.List;
import kotlin.C6008;
import kotlin.reflect.InterfaceC5920;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p128.C8158;
import p134.AbstractC8183;
import p281.C9089;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1833 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3260;

    public /* synthetic */ C1833(int i) {
        this.f3260 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        double dM8691 = 30.0d;
        switch (this.f3260) {
            case 0:
                C1726 c1726 = (C1726) obj;
                String str = c1726.f2870.f6474;
                long j = c1726.f2863;
                int i = C2869.f6347;
                int iM2461 = AbstractC1821.m2461((int) (j & 4294967295L), str);
                if (iM2461 != -1) {
                    return new C2841(0, iM2461 - ((int) (c1726.f2863 & 4294967295L)));
                }
                return null;
            case 1:
                C1726 c17262 = (C1726) obj;
                Integer numM2343 = c17262.m2343();
                if (numM2343 == null) {
                    return null;
                }
                int iIntValue = numM2343.intValue();
                long j2 = c17262.f2863;
                int i2 = C2869.f6347;
                return new C2841(((int) (j2 & 4294967295L)) - iIntValue, 0);
            case 2:
                C1726 c17263 = (C1726) obj;
                Integer numM2344 = c17263.m2344();
                if (numM2344 == null) {
                    return null;
                }
                int iIntValue2 = numM2344.intValue();
                long j3 = c17263.f2863;
                int i3 = C2869.f6347;
                return new C2841(0, iIntValue2 - ((int) (j3 & 4294967295L)));
            case 3:
                C1726 c17264 = (C1726) obj;
                Integer numM2345 = c17264.m2345();
                if (numM2345 == null) {
                    return null;
                }
                int iIntValue3 = numM2345.intValue();
                long j4 = c17264.f2863;
                int i4 = C2869.f6347;
                return new C2841(((int) (j4 & 4294967295L)) - iIntValue3, 0);
            case 4:
                C1726 c17265 = (C1726) obj;
                Integer numM2346 = c17265.m2346();
                if (numM2346 == null) {
                    return null;
                }
                int iIntValue4 = numM2346.intValue();
                long j5 = c17265.f2863;
                int i5 = C2869.f6347;
                return new C2841(0, iIntValue4 - ((int) (j5 & 4294967295L)));
            case 5:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                Orientation orientation = ((Boolean) obj2).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new C1836(orientation, ((Float) obj3).floatValue());
            case 6:
                C8158 c8158 = (C8158) obj;
                long j6 = c8158.f19886;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new C1194(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (c8158.f19886 & 4294967295L))) : AbstractC1738.f2896;
            case 7:
                C1194 c1194 = (C1194) obj;
                return new C8158((((long) Float.floatToRawIntBits(c1194.f1539)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1194.f1540)) << 32));
            case 8:
                C1158 c1158 = (C1158) obj;
                c1158.f1395 = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                c1158.m1498(fValueOf, 300).f1396 = AbstractC8183.f19927;
                c1158.m1498(fValueOf, 1500);
                Float fValueOf2 = Float.valueOf(180.0f);
                c1158.m1498(fValueOf2, 1800);
                c1158.m1498(fValueOf2, 3000);
                Float fValueOf3 = Float.valueOf(270.0f);
                c1158.m1498(fValueOf3, 3300);
                c1158.m1498(fValueOf3, 4500);
                Float fValueOf4 = Float.valueOf(360.0f);
                c1158.m1498(fValueOf4, 4800);
                c1158.m1498(fValueOf4, 6000);
                return C6008.f15084;
            case 9:
                InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
                C2782 c2782 = AbstractC2778.f6087;
                InterfaceC5920 interfaceC5920 = AbstractC2781.f6100[5];
                Boolean bool = Boolean.TRUE;
                c2782.getClass();
                ((InterfaceC2779) obj).mo4150(c2782, bool);
                return C6008.f15084;
            case 10:
                InterfaceC7372 interfaceC7372 = ((C2215) obj).f4330;
                if (interfaceC7372 != null) {
                    interfaceC7372.invoke();
                }
                return C6008.f15084;
            case 11:
                synchronized (AbstractC2115.f4090) {
                    List list2 = AbstractC2115.f4096;
                    int size = list2.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        ((InterfaceC7387) list2.get(i6)).invoke(obj);
                    }
                }
                return C6008.f15084;
            case 12:
                C1833 c1833 = AbstractC2115.f4092;
                return C6008.f15084;
            case 13:
                InterfaceC3425 interfaceC3425 = (InterfaceC3425) obj;
                interfaceC3425.getClass();
                return interfaceC3425;
            case 14:
                C9089 c9089 = (C9089) obj;
                c9089.getClass();
                return c9089.f23215;
            case 15:
                ((C9089) obj).getClass();
                return new C4635(4.5d, 7.0d, 11.0d, 21.0d);
            case 16:
                C9089 c90892 = (C9089) obj;
                c90892.getClass();
                return c90892.f23215;
            case 17:
                C9089 c90893 = (C9089) obj;
                c90893.getClass();
                return Double.valueOf(c90893.f23211 ? 12.0d : 94.0d);
            case 18:
                C9089 c90894 = (C9089) obj;
                c90894.getClass();
                return c90894.f23214;
            case 19:
                C9089 c90895 = (C9089) obj;
                c90895.getClass();
                return Double.valueOf(c90895.f23211 ? 60.0d : 50.0d);
            case 20:
                ((C9089) obj).getClass();
                return new C4635(1.5d, 3.0d, 4.5d, 7.0d);
            case 21:
                C9089 c90896 = (C9089) obj;
                c90896.getClass();
                return c90896.f23210;
            case 22:
                C9089 c90897 = (C9089) obj;
                c90897.getClass();
                return Double.valueOf(c90897.f23212 == Variant.MONOCHROME ? 30.0d : 80.0d);
            case 23:
                ((C9089) obj).getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 24:
                C9089 c90898 = (C9089) obj;
                c90898.getClass();
                return Double.valueOf(c90898.f23209.f23221.f23199);
            case 25:
                C9089 c90899 = (C9089) obj;
                c90899.getClass();
                return c90899.f23209;
            case 26:
                C9089 c908910 = (C9089) obj;
                c908910.getClass();
                return Double.valueOf(c908910.f23212 == Variant.MONOCHROME ? 70.0d : 80.0d);
            case 27:
                ((C9089) obj).getClass();
                return new C4635(1.0d, 1.0d, 3.0d, 4.5d);
            case 28:
                C9089 c908911 = (C9089) obj;
                c908911.getClass();
                return c908911.f23209;
            default:
                C4644 c4644 = C4628.f12307;
                C9089 c908912 = (C9089) obj;
                c908912.getClass();
                boolean z = c908912.f23211;
                if (c908912.f23212 == Variant.MONOCHROME) {
                    dM8691 = z ? 90.0d : 10.0d;
                } else if (C4649.m8732(c908912)) {
                    dM8691 = AbstractC4636.m8691(((Number) c4644.mo8716().f12333.invoke(c908912)).doubleValue(), 4.5d);
                } else if (z) {
                }
                return Double.valueOf(dM8691);
        }
    }
}
