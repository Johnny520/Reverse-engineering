package top.yukonga.miuix.kmp.extra;

import androidx.compose.foundation.AbstractC1072;
import androidx.compose.foundation.layout.AbstractC0619;
import androidx.compose.foundation.layout.C0666;
import androidx.compose.foundation.layout.InterfaceC0659;
import androidx.compose.foundation.lazy.C0764;
import androidx.compose.foundation.text.C0984;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1571;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.vector.AbstractC1539;
import androidx.compose.ui.graphics.vector.AbstractC1547;
import androidx.compose.ui.graphics.vector.C1543;
import androidx.compose.ui.graphics.vector.C1544;
import androidx.compose.ui.graphics.vector.C1562;
import androidx.compose.ui.layout.C1704;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.unit.LayoutDirection;
import com.android.dx.io.Opcodes;
import kotlin.collections.EmptyList;
import p034.AbstractC6344;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p344.AbstractC8824;
import p344.C8825;
import top.suzhelan.qstory.ui.components.C5977;
import top.yukonga.miuix.kmp.basic.AbstractC6014;
import top.yukonga.miuix.kmp.basic.AbstractC6032;
import top.yukonga.miuix.kmp.basic.C6015;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6042 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f16523 = new C1242(-265524605, false, new C0984(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11404(InterfaceC0659 interfaceC0659, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-977806500);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c1324.m2360(interfaceC0659) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2379(true) ? 32 : 16;
        }
        if (c1324.m2343(i2 & 1, (i2 & 19) != 18)) {
            C1334 c1334 = AbstractC8824.f24832;
            long j = ((C1599) ((AbstractC1347) ((C8825) c1324.m2383(c1334)).f24844).getValue()).f4700;
            long j2 = ((C1599) ((AbstractC1347) ((C8825) c1324.m2383(c1334)).f24865).getValue()).f4700;
            boolean zM2361 = c1324.m2361(j) | c1324.m2361(j2);
            Object objM2345 = c1324.m2345();
            C1353 c1353 = C1369.f3974;
            if (zM2361 || objM2345 == c1353) {
                objM2345 = new C6041(j, j2);
                c1324.m2386(objM2345);
            }
            C6041 c6041 = (C6041) objM2345;
            boolean zM2360 = c1324.m2360(c6041) | ((i2 & 112) == 32);
            Object objM23452 = c1324.m2345();
            if (zM2360 || objM23452 == c1353) {
                C1607 c1607 = new C1607(c6041.f16522, 5);
                c1324.m2386(c1607);
                objM23452 = c1607;
            }
            C1607 c16072 = (C1607) objM23452;
            LayoutDirection layoutDirection = (LayoutDirection) c1324.m2383(AbstractC1902.f5582);
            InterfaceC2129 interfaceC2129M1386 = AbstractC0619.m1386(C2125.f6276, 10.0f, 16.0f);
            boolean zM2362 = c1324.m2362(layoutDirection.ordinal());
            Object objM23453 = c1324.m2345();
            if (zM2362 || objM23453 == c1353) {
                objM23453 = new C6044(layoutDirection, 2);
                c1324.m2386(objM23453);
            }
            InterfaceC2129 interfaceC2129Mo1367 = interfaceC0659.mo1367(AbstractC1581.m2895(interfaceC2129M1386, (InterfaceC6558) objM23453));
            C1543 c1543M2823 = AbstractC6344.f17477;
            if (c1543M2823 == null) {
                C1544 c1544 = new C1544("ArrowRight", 10.0f, 16.0f, 10.0f, 16.0f, 0L, 0, false, Opcodes.SHL_INT_LIT8);
                C1571 c1571 = new C1571(C1599.f4696);
                EmptyList emptyList = AbstractC1539.f4469;
                C1562 c1562 = new C1562(0, false);
                c1562.m2843(1.65f, 1.469f);
                c1562.m2836(1.929f, 1.19f, 2.381f, 1.19f, 2.66f, 1.469f);
                c1562.m2847(8.721f, 7.53f);
                c1562.m2836(9.0f, 7.809f, 9.0f, 8.261f, 8.721f, 8.54f);
                c1562.m2847(2.66f, 14.601f);
                c1562.m2836(2.381f, 14.88f, 1.929f, 14.88f, 1.65f, 14.601f);
                c1562.m2836(1.371f, 14.322f, 1.371f, 13.87f, 1.65f, 13.591f);
                c1562.m2847(7.205f, 8.035f);
                c1562.m2847(1.65f, 2.479f);
                c1562.m2836(1.371f, 2.2f, 1.371f, 1.748f, 1.65f, 1.469f);
                c1562.m2837();
                C1544.m2822(c1544, c1562.f4600, 1, c1571, 0.0f, 0, 4.0f);
                c1543M2823 = c1544.m2823();
                AbstractC6344.f17477 = c1543M2823;
            }
            AbstractC1072.m1983(AbstractC1547.m2834(c1543M2823, c1324), interfaceC2129Mo1367, C2119.f6264, C1704.f4975, 1.0f, c16072, c1324, 56, 0);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0764(interfaceC0659, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11405(String str, InterfaceC6543 interfaceC6543, C1324 c1324, int i) {
        C0666 c0666 = AbstractC6014.f16435;
        C1334 c1334 = AbstractC8824.f24832;
        long j = ((C1599) ((AbstractC1347) ((C8825) c1324.m2383(c1334)).f24855).getValue()).f4700;
        long j2 = ((C1599) ((AbstractC1347) ((C8825) c1324.m2383(c1334)).f24865).getValue()).f4700;
        boolean zM2361 = c1324.m2361(j) | c1324.m2361(j2);
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (zM2361 || objM2345 == c1353) {
            objM2345 = new C6015(j, j2);
            c1324.m2386(objM2345);
        }
        C6015 c6015 = (C6015) objM2345;
        long j3 = ((C1599) ((AbstractC1347) ((C8825) c1324.m2383(c1334)).f24841).getValue()).f4700;
        long j4 = ((C1599) ((AbstractC1347) ((C8825) c1324.m2383(c1334)).f24865).getValue()).f4700;
        boolean zM23612 = c1324.m2361(j3) | c1324.m2361(j4);
        Object objM23452 = c1324.m2345();
        if (zM23612 || objM23452 == c1353) {
            objM23452 = new C6015(j3, j4);
            c1324.m2386(objM23452);
        }
        C0666 c06662 = AbstractC6014.f16435;
        AbstractC6032.m11387(C2125.f6276, AbstractC1254.m2189(564428325, new C0984(7), c1324), c06662, interfaceC6543, AbstractC1254.m2189(-682683637, new C5977(str, c6015, (C6015) objM23452), c1324), c1324, 805306752 | ((((1879048192 & i) | 1572912) >> 12) & net.bytebuddy.jar.asm.Opcodes.ASM7));
    }
}
