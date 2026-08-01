package p177;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import kotlin.C5176;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6543;
import p052.InterfaceC6548;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7748 implements InterfaceC6548 {
    @Override // p052.InterfaceC6548
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C7746 c7746 = (C7746) obj4;
        InterfaceC6551 interfaceC6551 = (InterfaceC6551) obj5;
        InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj6;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        int i2 = iIntValue & 6;
        C2125 c2125 = C2125.f6276;
        if (i2 == 0) {
            i = (((C1324) interfaceC1373).m2360(c2125) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((C1324) interfaceC1373).m2360(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((C1324) interfaceC1373).m2379(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((C1324) interfaceC1373).m2360(c7746) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ((C1324) interfaceC1373).m2378(interfaceC6551) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ((C1324) interfaceC1373).m2378(interfaceC6543) ? 131072 : 65536;
        }
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2343(i & 1, (599187 & i) != 599186)) {
            AbstractC7749.m13106(str, zBooleanValue, c7746, c2125, interfaceC6551, interfaceC6543, c1324, (i & Opcodes.ASM7) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            c1324.m2339();
        }
        return C5176.f14739;
    }
}
