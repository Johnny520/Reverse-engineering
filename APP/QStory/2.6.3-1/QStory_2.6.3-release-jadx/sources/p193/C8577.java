package p193;

import androidx.compose.p001ui.C2958;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7372;
import p068.InterfaceC7377;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8577 implements InterfaceC7377 {
    @Override // p068.InterfaceC7377
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C8575 c8575 = (C8575) obj4;
        InterfaceC7380 interfaceC7380 = (InterfaceC7380) obj5;
        InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj6;
        InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        int i2 = iIntValue & 6;
        C2958 c2958 = C2958.f6621;
        if (i2 == 0) {
            i = (((C2159) interfaceC2208).m2920(c2958) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((C2159) interfaceC2208).m2920(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((C2159) interfaceC2208).m2939(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((C2159) interfaceC2208).m2920(c8575) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ((C2159) interfaceC2208).m2938(interfaceC7380) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ((C2159) interfaceC2208).m2938(interfaceC7372) ? 131072 : 65536;
        }
        C2159 c2159 = (C2159) interfaceC2208;
        if (c2159.m2903(i & 1, (599187 & i) != 599186)) {
            AbstractC8578.m13665(str, zBooleanValue, c8575, c2958, interfaceC7380, interfaceC7372, c2159, (i & Opcodes.ASM7) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            c2159.m2899();
        }
        return C6008.f15084;
    }
}
