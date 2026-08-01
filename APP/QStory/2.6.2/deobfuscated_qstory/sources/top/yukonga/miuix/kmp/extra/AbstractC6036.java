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
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p345.AbstractC8838;
import p345.C8839;
import top.suzhelan.qstory.ui.components.C5971;
import top.yukonga.miuix.kmp.basic.AbstractC6008;
import top.yukonga.miuix.kmp.basic.AbstractC6026;
import top.yukonga.miuix.kmp.basic.C6009;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1242 f16514 = new C1242(-265524605, false, new C0984(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11344(InterfaceC0659 interfaceC0659, InterfaceC1373 interfaceC1373, int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-977806500);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (c1324.m2350(interfaceC0659) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c1324.m2369(true) ? 32 : 16;
        }
        if (c1324.m2333(i2 & 1, (i2 & 19) != 18)) {
            C1334 c1334 = AbstractC8838.f24849;
            long j = ((C1599) ((AbstractC1347) ((C8839) c1324.m2373(c1334)).f24861).getValue()).f4699;
            long j2 = ((C1599) ((AbstractC1347) ((C8839) c1324.m2373(c1334)).f24882).getValue()).f4699;
            boolean zM2351 = c1324.m2351(j) | c1324.m2351(j2);
            Object objM2335 = c1324.m2335();
            C1353 c1353 = C1369.f3973;
            if (zM2351 || objM2335 == c1353) {
                objM2335 = new C6035(j, j2);
                c1324.m2376(objM2335);
            }
            C6035 c6035 = (C6035) objM2335;
            boolean zM2350 = c1324.m2350(c6035) | ((i2 & 112) == 32);
            Object objM23352 = c1324.m2335();
            if (zM2350 || objM23352 == c1353) {
                C1607 c1607 = new C1607(c6035.f16513, 5);
                c1324.m2376(c1607);
                objM23352 = c1607;
            }
            C1607 c16072 = (C1607) objM23352;
            LayoutDirection layoutDirection = (LayoutDirection) c1324.m2373(AbstractC1902.f5581);
            InterfaceC2129 interfaceC2129M1376 = AbstractC0619.m1376(C2125.f6275, 10.0f, 16.0f);
            boolean zM2352 = c1324.m2352(layoutDirection.ordinal());
            Object objM23353 = c1324.m2335();
            if (zM2352 || objM23353 == c1353) {
                objM23353 = new C6038(layoutDirection, 2);
                c1324.m2376(objM23353);
            }
            InterfaceC2129 interfaceC2129Mo1357 = interfaceC0659.mo1357(AbstractC1581.m2885(interfaceC2129M1376, (InterfaceC6557) objM23353));
            C1543 c1543M2813 = AbstractC6325.f17428;
            if (c1543M2813 == null) {
                C1544 c1544 = new C1544("ArrowRight", 10.0f, 16.0f, 10.0f, 16.0f, 0L, 0, false, Opcodes.SHL_INT_LIT8);
                C1571 c1571 = new C1571(C1599.f4695);
                EmptyList emptyList = AbstractC1539.f4468;
                C1562 c1562 = new C1562(0, false);
                c1562.m2833(1.65f, 1.469f);
                c1562.m2826(1.929f, 1.19f, 2.381f, 1.19f, 2.66f, 1.469f);
                c1562.m2837(8.721f, 7.53f);
                c1562.m2826(9.0f, 7.809f, 9.0f, 8.261f, 8.721f, 8.54f);
                c1562.m2837(2.66f, 14.601f);
                c1562.m2826(2.381f, 14.88f, 1.929f, 14.88f, 1.65f, 14.601f);
                c1562.m2826(1.371f, 14.322f, 1.371f, 13.87f, 1.65f, 13.591f);
                c1562.m2837(7.205f, 8.035f);
                c1562.m2837(1.65f, 2.479f);
                c1562.m2826(1.371f, 2.2f, 1.371f, 1.748f, 1.65f, 1.469f);
                c1562.m2827();
                C1544.m2812(c1544, c1562.f4599, 1, c1571, 0.0f, 0, 4.0f);
                c1543M2813 = c1544.m2813();
                AbstractC6325.f17428 = c1543M2813;
            }
            AbstractC1072.m1973(AbstractC1547.m2824(c1543M2813, c1324), interfaceC2129Mo1357, C2119.f6263, C1704.f4974, 1.0f, c16072, c1324, 56, 0);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0764(interfaceC0659, i, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m11345(String str, InterfaceC6542 interfaceC6542, C1324 c1324, int i) {
        C0666 c0666 = AbstractC6008.f16426;
        C1334 c1334 = AbstractC8838.f24849;
        long j = ((C1599) ((AbstractC1347) ((C8839) c1324.m2373(c1334)).f24872).getValue()).f4699;
        long j2 = ((C1599) ((AbstractC1347) ((C8839) c1324.m2373(c1334)).f24882).getValue()).f4699;
        boolean zM2351 = c1324.m2351(j) | c1324.m2351(j2);
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (zM2351 || objM2335 == c1353) {
            objM2335 = new C6009(j, j2);
            c1324.m2376(objM2335);
        }
        C6009 c6009 = (C6009) objM2335;
        long j3 = ((C1599) ((AbstractC1347) ((C8839) c1324.m2373(c1334)).f24858).getValue()).f4699;
        long j4 = ((C1599) ((AbstractC1347) ((C8839) c1324.m2373(c1334)).f24882).getValue()).f4699;
        boolean zM23512 = c1324.m2351(j3) | c1324.m2351(j4);
        Object objM23352 = c1324.m2335();
        if (zM23512 || objM23352 == c1353) {
            objM23352 = new C6009(j3, j4);
            c1324.m2376(objM23352);
        }
        C0666 c06662 = AbstractC6008.f16426;
        AbstractC6026.m11327(C2125.f6275, AbstractC1254.m2179(564428325, new C0984(7), c1324), c06662, interfaceC6542, AbstractC1254.m2179(-682683637, new C5971(str, c6009, (C6009) objM23352), c1324), c1324, 805306752 | ((((1879048192 & i) | 1572912) >> 12) & net.bytebuddy.jar.asm.Opcodes.ASM7));
    }
}
