package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.C1570;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1510;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p052.InterfaceC6558;
import p193.C7821;
import p194.AbstractC7831;
import p194.C7832;
import p195.AbstractC7834;
import p205.C7899;
import p205.C7901;
import p205.InterfaceC7896;
import p207.AbstractC7914;
import p209.C7918;
import p209.C7922;
import p209.C7924;
import p209.C7926;
import p209.C7927;
import p209.C7928;
import p209.C7931;
import p209.C7933;
import p209.InterfaceC7923;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2048 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4871 f6068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4871 f6069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4871 f6070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4871 f6071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4871 f6072;

    static {
        int i = 13;
        f6072 = new C4871(new C2042(1), i, new C2058(3));
        f6071 = new C4871(new C2042(2), i, new C2058(4));
        f6070 = new C4871(new C2042(3), i, new C2058(5));
        f6069 = new C4871(new C2042(4), i, new C2058(6));
        f6068 = new C4871(new C2042(5), i, new C2058(7));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3766(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C2065) AbstractC4344.m8808(arrayList)).f6123) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C2065 c2065 = (C2065) arrayList.get(i2);
            byte b = c2065.f6117 > f ? (byte) 1 : c2065.f6123 <= f ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m3767(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C2065 c2065 = (C2065) list.get(i3);
            byte b = c2065.f6119 > i ? (byte) 1 : c2065.f6118 <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final int m3768(int i, List list) {
        int i2;
        int i3 = ((C2065) AbstractC4344.m8808(list)).f6120;
        if (i > ((C2065) AbstractC4344.m8808(list)).f6120) {
            AbstractC7834.m13198("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            C2065 c2065 = (C2065) list.get(i2);
            byte b = c2065.f6121 > i ? (byte) 1 : c2065.f6120 <= i ? (byte) -1 : (byte) 0;
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbM150 = AbstractC0053.m150(i2, "Found paragraph index ", " should be in range [0, ");
        sbM150.append(list.size());
        sbM150.append(").\nDebug info: index=");
        sbM150.append(i);
        sbM150.append(", paragraphs=[");
        sbM150.append(AbstractC7914.m13411(list, null, new C2057(2), 31));
        sbM150.append(']');
        AbstractC7834.m13198(sbM150.toString());
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m3769(int i, long j) {
        int i2 = C2035.f6002;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m3770(i4, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m3770(int i, int i2) {
        if (i < 0 || i2 < 0) {
            AbstractC7834.m13198("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = C2035.f6002;
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2054 m3771(String str, C2031 c2031, long j, InterfaceC7896 interfaceC7896, InterfaceC1996 interfaceC1996, EmptyList emptyList, int i, int i2) {
        if ((i2 & 32) != 0) {
            emptyList = EmptyList.INSTANCE;
        }
        return new C2054(new C7821(str, c2031, emptyList, EmptyList.INSTANCE, interfaceC1996, interfaceC7896), i, 1, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2031 m3772(C2031 c2031, LayoutDirection layoutDirection) {
        C2047 c2047 = c2031.f5984;
        InterfaceC7923 interfaceC7923 = AbstractC2046.f6049;
        InterfaceC7923 interfaceC79232 = c2047.f6058;
        if (interfaceC79232.equals(C7924.f21945)) {
            interfaceC79232 = AbstractC2046.f6049;
        }
        InterfaceC7923 interfaceC79233 = interfaceC79232;
        long j = c2047.f6057;
        C7901[] c7901Arr = C7899.f21867;
        if ((j & 1095216660480L) == 0) {
            j = AbstractC2046.f6052;
        }
        long j2 = j;
        C1988 c1988 = c2047.f6056;
        if (c1988 == null) {
            c1988 = C1988.f5876;
        }
        C1988 c19882 = c1988;
        C1990 c1990 = c2047.f6055;
        C1990 c19902 = new C1990(c1990 != null ? c1990.f5880 : 0);
        C1987 c1987 = c2047.f6054;
        C1987 c19872 = new C1987(c1987 != null ? c1987.f5870 : Opcodes.MAX_VALUE);
        AbstractC1993 abstractC1993 = c2047.f6053;
        if (abstractC1993 == null) {
            abstractC1993 = AbstractC1993.f5882;
        }
        AbstractC1993 abstractC19932 = abstractC1993;
        String str = c2047.f6063;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = c2047.f6062;
        if ((j3 & 1095216660480L) == 0) {
            j3 = AbstractC2046.f6051;
        }
        long j4 = j3;
        C7922 c7922 = c2047.f6066;
        float f = c7922 != null ? c7922.f21944 : 0.0f;
        C7922 c79222 = new C7922(Float.isNaN(f) ? 0.0f : f);
        C7927 c7927 = c2047.f6067;
        if (c7927 == null) {
            c7927 = C7927.f21951;
        }
        C7927 c79272 = c7927;
        C7832 c7832M13192 = c2047.f6064;
        if (c7832M13192 == null) {
            C7832 c7832 = C7832.f21372;
            c7832M13192 = AbstractC7831.f21371.m13192();
        }
        C7832 c78322 = c7832M13192;
        long j5 = c2047.f6065;
        if (j5 == 16) {
            j5 = AbstractC2046.f6050;
        }
        long j6 = j5;
        C7931 c7931 = c2047.f6060;
        if (c7931 == null) {
            c7931 = C7931.f21961;
        }
        C7931 c79312 = c7931;
        C1570 c1570 = c2047.f6059;
        if (c1570 == null) {
            c1570 = C1570.f4616;
        }
        C1570 c15702 = c1570;
        AbstractC1505 abstractC1505 = c2047.f6061;
        if (abstractC1505 == null) {
            abstractC1505 = C1510.f4295;
        }
        C2047 c20472 = new C2047(interfaceC79233, j2, c19882, c19902, c19872, abstractC19932, str2, j4, c79222, c79272, c78322, j6, c79312, c15702, abstractC1505);
        C2064 c2064 = c2031.f5983;
        int i = AbstractC2056.f6092;
        int i2 = c2064.f6113;
        int i3 = 5;
        if (i2 == 0) {
            i2 = 5;
        }
        int i4 = c2064.f6112;
        if (i4 == 3) {
            int i5 = AbstractC2032.f5985[layoutDirection.ordinal()];
            if (i5 == 1) {
                i3 = 4;
            } else if (i5 != 2) {
                C4211.m8611();
                return null;
            }
            i4 = i3;
        } else if (i4 == 0) {
            int i6 = AbstractC2032.f5985[layoutDirection.ordinal()];
            if (i6 == 1) {
                i4 = 1;
            } else {
                if (i6 != 2) {
                    C4211.m8611();
                    return null;
                }
                i4 = 2;
            }
        }
        long j7 = c2064.f6111;
        if ((j7 & 1095216660480L) == 0) {
            j7 = AbstractC2056.f6093;
        }
        C7928 c7928 = c2064.f6110;
        if (c7928 == null) {
            c7928 = C7928.f21954;
        }
        C2055 c2055 = c2064.f6109;
        C7933 c7933 = c2064.f6108;
        int i7 = c2064.f6115;
        if (i7 == 0) {
            i7 = C7918.f21938;
        }
        int i8 = c2064.f6114;
        if (i8 == 0) {
            i8 = 1;
        }
        C7926 c7926 = c2064.f6116;
        if (c7926 == null) {
            c7926 = C7926.f21948;
        }
        return new C2031(c20472, new C2064(i2, i4, j7, c7928, c2055, c7933, i7, i8, c7926), c2031.f5982);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m3773(ArrayList arrayList, long j, InterfaceC6558 interfaceC6558) {
        int size = arrayList.size();
        for (int iM3768 = m3768(C2035.m3757(j), arrayList); iM3768 < size; iM3768++) {
            C2065 c2065 = (C2065) arrayList.get(iM3768);
            if (c2065.f6121 >= C2035.m3750(j)) {
                return;
            }
            if (c2065.f6121 != c2065.f6120) {
                interfaceC6558.invoke(c2065);
            }
        }
    }
}
