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
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p052.InterfaceC6557;
import p193.C7820;
import p194.AbstractC7830;
import p194.C7831;
import p195.AbstractC7833;
import p205.C7898;
import p205.C7900;
import p205.InterfaceC7895;
import p207.AbstractC7913;
import p209.C7917;
import p209.C7921;
import p209.C7923;
import p209.C7925;
import p209.C7926;
import p209.C7927;
import p209.C7930;
import p209.C7932;
import p209.InterfaceC7922;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2048 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4870 f6067;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4870 f6068;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4870 f6069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4870 f6070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4870 f6071;

    static {
        int i = 13;
        f6071 = new C4870(new C2042(1), i, new C2058(3));
        f6070 = new C4870(new C2042(2), i, new C2058(4));
        f6069 = new C4870(new C2042(3), i, new C2058(5));
        f6068 = new C4870(new C2042(4), i, new C2058(6));
        f6067 = new C4870(new C2042(5), i, new C2058(7));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m3756(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C2065) AbstractC4343.m8811(arrayList)).f6122) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C2065 c2065 = (C2065) arrayList.get(i2);
            byte b = c2065.f6116 > f ? (byte) 1 : c2065.f6122 <= f ? (byte) -1 : (byte) 0;
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
    public static final int m3757(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C2065 c2065 = (C2065) list.get(i3);
            byte b = c2065.f6118 > i ? (byte) 1 : c2065.f6117 <= i ? (byte) -1 : (byte) 0;
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
    public static final int m3758(int i, List list) {
        int i2;
        int i3 = ((C2065) AbstractC4343.m8811(list)).f6119;
        if (i > ((C2065) AbstractC4343.m8811(list)).f6119) {
            AbstractC7833.m13170("Index " + i + " should be less or equal than last line's end " + i3);
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
            byte b = c2065.f6120 > i ? (byte) 1 : c2065.f6119 <= i ? (byte) -1 : (byte) 0;
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
        StringBuilder sbM148 = AbstractC0053.m148(i2, "Found paragraph index ", " should be in range [0, ");
        sbM148.append(list.size());
        sbM148.append(").\nDebug info: index=");
        sbM148.append(i);
        sbM148.append(", paragraphs=[");
        sbM148.append(AbstractC7913.m13383(list, null, new C2057(2), 31));
        sbM148.append(']');
        AbstractC7833.m13170(sbM148.toString());
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m3759(int i, long j) {
        int i2 = C2035.f6001;
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
        return (i4 == i3 && i == i5) ? j : m3760(i4, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m3760(int i, int i2) {
        if (i < 0 || i2 < 0) {
            AbstractC7833.m13170("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = C2035.f6001;
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2054 m3761(String str, C2031 c2031, long j, InterfaceC7895 interfaceC7895, InterfaceC1996 interfaceC1996, EmptyList emptyList, int i, int i2) {
        if ((i2 & 32) != 0) {
            emptyList = EmptyList.INSTANCE;
        }
        return new C2054(new C7820(str, c2031, emptyList, EmptyList.INSTANCE, interfaceC1996, interfaceC7895), i, 1, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2031 m3762(C2031 c2031, LayoutDirection layoutDirection) {
        C2047 c2047 = c2031.f5983;
        InterfaceC7922 interfaceC7922 = AbstractC2046.f6048;
        InterfaceC7922 interfaceC79222 = c2047.f6057;
        if (interfaceC79222.equals(C7923.f21948)) {
            interfaceC79222 = AbstractC2046.f6048;
        }
        InterfaceC7922 interfaceC79223 = interfaceC79222;
        long j = c2047.f6056;
        C7900[] c7900Arr = C7898.f21870;
        if ((j & 1095216660480L) == 0) {
            j = AbstractC2046.f6051;
        }
        long j2 = j;
        C1988 c1988 = c2047.f6055;
        if (c1988 == null) {
            c1988 = C1988.f5875;
        }
        C1988 c19882 = c1988;
        C1990 c1990 = c2047.f6054;
        C1990 c19902 = new C1990(c1990 != null ? c1990.f5879 : 0);
        C1987 c1987 = c2047.f6053;
        C1987 c19872 = new C1987(c1987 != null ? c1987.f5869 : Opcodes.MAX_VALUE);
        AbstractC1993 abstractC1993 = c2047.f6052;
        if (abstractC1993 == null) {
            abstractC1993 = AbstractC1993.f5881;
        }
        AbstractC1993 abstractC19932 = abstractC1993;
        String str = c2047.f6062;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = c2047.f6061;
        if ((j3 & 1095216660480L) == 0) {
            j3 = AbstractC2046.f6050;
        }
        long j4 = j3;
        C7921 c7921 = c2047.f6065;
        float f = c7921 != null ? c7921.f21947 : 0.0f;
        C7921 c79212 = new C7921(Float.isNaN(f) ? 0.0f : f);
        C7926 c7926 = c2047.f6066;
        if (c7926 == null) {
            c7926 = C7926.f21954;
        }
        C7926 c79262 = c7926;
        C7831 c7831M13164 = c2047.f6063;
        if (c7831M13164 == null) {
            C7831 c7831 = C7831.f21375;
            c7831M13164 = AbstractC7830.f21374.m13164();
        }
        C7831 c78312 = c7831M13164;
        long j5 = c2047.f6064;
        if (j5 == 16) {
            j5 = AbstractC2046.f6049;
        }
        long j6 = j5;
        C7930 c7930 = c2047.f6059;
        if (c7930 == null) {
            c7930 = C7930.f21964;
        }
        C7930 c79302 = c7930;
        C1570 c1570 = c2047.f6058;
        if (c1570 == null) {
            c1570 = C1570.f4615;
        }
        C1570 c15702 = c1570;
        AbstractC1505 abstractC1505 = c2047.f6060;
        if (abstractC1505 == null) {
            abstractC1505 = C1510.f4294;
        }
        C2047 c20472 = new C2047(interfaceC79223, j2, c19882, c19902, c19872, abstractC19932, str2, j4, c79212, c79262, c78312, j6, c79302, c15702, abstractC1505);
        C2064 c2064 = c2031.f5982;
        int i = AbstractC2056.f6091;
        int i2 = c2064.f6112;
        int i3 = 5;
        if (i2 == 0) {
            i2 = 5;
        }
        int i4 = c2064.f6111;
        if (i4 == 3) {
            int i5 = AbstractC2032.f5984[layoutDirection.ordinal()];
            if (i5 == 1) {
                i3 = 4;
            } else if (i5 != 2) {
                C4210.m8621();
                return null;
            }
            i4 = i3;
        } else if (i4 == 0) {
            int i6 = AbstractC2032.f5984[layoutDirection.ordinal()];
            if (i6 == 1) {
                i4 = 1;
            } else {
                if (i6 != 2) {
                    C4210.m8621();
                    return null;
                }
                i4 = 2;
            }
        }
        long j7 = c2064.f6110;
        if ((j7 & 1095216660480L) == 0) {
            j7 = AbstractC2056.f6092;
        }
        C7927 c7927 = c2064.f6109;
        if (c7927 == null) {
            c7927 = C7927.f21957;
        }
        C2055 c2055 = c2064.f6108;
        C7932 c7932 = c2064.f6107;
        int i7 = c2064.f6114;
        if (i7 == 0) {
            i7 = C7917.f21941;
        }
        int i8 = c2064.f6113;
        if (i8 == 0) {
            i8 = 1;
        }
        C7925 c7925 = c2064.f6115;
        if (c7925 == null) {
            c7925 = C7925.f21951;
        }
        return new C2031(c20472, new C2064(i2, i4, j7, c7927, c2055, c7932, i7, i8, c7925), c2031.f5981);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m3763(ArrayList arrayList, long j, InterfaceC6557 interfaceC6557) {
        int size = arrayList.size();
        for (int iM3758 = m3758(C2035.m3747(j), arrayList); iM3758 < size; iM3758++) {
            C2065 c2065 = (C2065) arrayList.get(iM3758);
            if (c2065.f6120 >= C2035.m3740(j)) {
                return;
            }
            if (c2065.f6120 != c2065.f6119) {
                interfaceC6557.invoke(c2065);
            }
        }
    }
}
