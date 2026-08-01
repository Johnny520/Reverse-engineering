package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.C2405;
import androidx.compose.p001ui.graphics.drawscope.AbstractC2340;
import androidx.compose.p001ui.graphics.drawscope.C2345;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p068.InterfaceC7387;
import p209.C8650;
import p210.AbstractC8660;
import p210.C8661;
import p211.AbstractC8663;
import p221.C8728;
import p221.C8730;
import p221.InterfaceC8725;
import p223.AbstractC8743;
import p225.C8747;
import p225.C8751;
import p225.C8753;
import p225.C8755;
import p225.C8756;
import p225.C8757;
import p225.C8760;
import p225.C8762;
import p225.InterfaceC8752;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2882 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5703 f6413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5703 f6414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5703 f6415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5703 f6416;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5703 f6417;

    static {
        int i = 13;
        f6417 = new C5703(new C2876(1), i, new C2892(3));
        f6416 = new C5703(new C2876(2), i, new C2892(4));
        f6415 = new C5703(new C2876(3), i, new C2892(5));
        f6414 = new C5703(new C2876(4), i, new C2892(6));
        f6413 = new C5703(new C2876(5), i, new C2892(7));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final int m4326(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C2899) AbstractC5176.m9367(arrayList)).f6468) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C2899 c2899 = (C2899) arrayList.get(i2);
            byte b = c2899.f6462 > f ? (byte) 1 : c2899.f6468 <= f ? (byte) -1 : (byte) 0;
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
    public static final int m4327(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C2899 c2899 = (C2899) list.get(i3);
            byte b = c2899.f6464 > i ? (byte) 1 : c2899.f6463 <= i ? (byte) -1 : (byte) 0;
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
    public static final int m4328(int i, List list) {
        int i2;
        int i3 = ((C2899) AbstractC5176.m9367(list)).f6465;
        if (i > ((C2899) AbstractC5176.m9367(list)).f6465) {
            AbstractC8663.m13757("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            C2899 c2899 = (C2899) list.get(i2);
            byte b = c2899.f6466 > i ? (byte) 1 : c2899.f6465 <= i ? (byte) -1 : (byte) 0;
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
        StringBuilder sbM710 = AbstractC0900.m710(i2, "Found paragraph index ", " should be in range [0, ");
        sbM710.append(list.size());
        sbM710.append(").\nDebug info: index=");
        sbM710.append(i);
        sbM710.append(", paragraphs=[");
        sbM710.append(AbstractC8743.m13970(list, null, new C2891(2), 31));
        sbM710.append(']');
        AbstractC8663.m13757(sbM710.toString());
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long m4329(int i, long j) {
        int i2 = C2869.f6347;
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
        return (i4 == i3 && i == i5) ? j : m4330(i4, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m4330(int i, int i2) {
        if (i < 0 || i2 < 0) {
            AbstractC8663.m13757("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = C2869.f6347;
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2888 m4331(String str, C2865 c2865, long j, InterfaceC8725 interfaceC8725, InterfaceC2830 interfaceC2830, EmptyList emptyList, int i, int i2) {
        if ((i2 & 32) != 0) {
            emptyList = EmptyList.INSTANCE;
        }
        return new C2888(new C8650(str, c2865, emptyList, EmptyList.INSTANCE, interfaceC2830, interfaceC8725), i, 1, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2865 m4332(C2865 c2865, LayoutDirection layoutDirection) {
        C2881 c2881 = c2865.f6329;
        InterfaceC8752 interfaceC8752 = AbstractC2880.f6394;
        InterfaceC8752 interfaceC87522 = c2881.f6403;
        if (interfaceC87522.equals(C8753.f22290)) {
            interfaceC87522 = AbstractC2880.f6394;
        }
        InterfaceC8752 interfaceC87523 = interfaceC87522;
        long j = c2881.f6402;
        C8730[] c8730Arr = C8728.f22212;
        if ((j & 1095216660480L) == 0) {
            j = AbstractC2880.f6397;
        }
        long j2 = j;
        C2822 c2822 = c2881.f6401;
        if (c2822 == null) {
            c2822 = C2822.f6221;
        }
        C2822 c28222 = c2822;
        C2824 c2824 = c2881.f6400;
        C2824 c28242 = new C2824(c2824 != null ? c2824.f6225 : 0);
        C2821 c2821 = c2881.f6399;
        C2821 c28212 = new C2821(c2821 != null ? c2821.f6215 : Opcodes.MAX_VALUE);
        AbstractC2827 abstractC2827 = c2881.f6398;
        if (abstractC2827 == null) {
            abstractC2827 = AbstractC2827.f6227;
        }
        AbstractC2827 abstractC28272 = abstractC2827;
        String str = c2881.f6408;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j3 = c2881.f6407;
        if ((j3 & 1095216660480L) == 0) {
            j3 = AbstractC2880.f6396;
        }
        long j4 = j3;
        C8751 c8751 = c2881.f6411;
        float f = c8751 != null ? c8751.f22289 : 0.0f;
        C8751 c87512 = new C8751(Float.isNaN(f) ? 0.0f : f);
        C8756 c8756 = c2881.f6412;
        if (c8756 == null) {
            c8756 = C8756.f22296;
        }
        C8756 c87562 = c8756;
        C8661 c8661M13751 = c2881.f6409;
        if (c8661M13751 == null) {
            C8661 c8661 = C8661.f21717;
            c8661M13751 = AbstractC8660.f21716.m13751();
        }
        C8661 c86612 = c8661M13751;
        long j5 = c2881.f6410;
        if (j5 == 16) {
            j5 = AbstractC2880.f6395;
        }
        long j6 = j5;
        C8760 c8760 = c2881.f6405;
        if (c8760 == null) {
            c8760 = C8760.f22306;
        }
        C8760 c87602 = c8760;
        C2405 c2405 = c2881.f6404;
        if (c2405 == null) {
            c2405 = C2405.f4961;
        }
        C2405 c24052 = c2405;
        AbstractC2340 abstractC2340 = c2881.f6406;
        if (abstractC2340 == null) {
            abstractC2340 = C2345.f4640;
        }
        C2881 c28812 = new C2881(interfaceC87523, j2, c28222, c28242, c28212, abstractC28272, str2, j4, c87512, c87562, c86612, j6, c87602, c24052, abstractC2340);
        C2898 c2898 = c2865.f6328;
        int i = AbstractC2890.f6437;
        int i2 = c2898.f6458;
        int i3 = 5;
        if (i2 == 0) {
            i2 = 5;
        }
        int i4 = c2898.f6457;
        if (i4 == 3) {
            int i5 = AbstractC2866.f6330[layoutDirection.ordinal()];
            if (i5 == 1) {
                i3 = 4;
            } else if (i5 != 2) {
                C5043.m9170();
                return null;
            }
            i4 = i3;
        } else if (i4 == 0) {
            int i6 = AbstractC2866.f6330[layoutDirection.ordinal()];
            if (i6 == 1) {
                i4 = 1;
            } else {
                if (i6 != 2) {
                    C5043.m9170();
                    return null;
                }
                i4 = 2;
            }
        }
        long j7 = c2898.f6456;
        if ((j7 & 1095216660480L) == 0) {
            j7 = AbstractC2890.f6438;
        }
        C8757 c8757 = c2898.f6455;
        if (c8757 == null) {
            c8757 = C8757.f22299;
        }
        C2889 c2889 = c2898.f6454;
        C8762 c8762 = c2898.f6453;
        int i7 = c2898.f6460;
        if (i7 == 0) {
            i7 = C8747.f22283;
        }
        int i8 = c2898.f6459;
        if (i8 == 0) {
            i8 = 1;
        }
        C8755 c8755 = c2898.f6461;
        if (c8755 == null) {
            c8755 = C8755.f22293;
        }
        return new C2865(c28812, new C2898(i2, i4, j7, c8757, c2889, c8762, i7, i8, c8755), c2865.f6327);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m4333(ArrayList arrayList, long j, InterfaceC7387 interfaceC7387) {
        int size = arrayList.size();
        for (int iM4328 = m4328(C2869.m4317(j), arrayList); iM4328 < size; iM4328++) {
            C2899 c2899 = (C2899) arrayList.get(iM4328);
            if (c2899.f6466 >= C2869.m4310(j)) {
                return;
            }
            if (c2899.f6466 != c2899.f6465) {
                interfaceC7387.invoke(c2899);
            }
        }
    }
}
