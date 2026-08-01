package p177;

import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import kotlin.C5175;
import net.bytebuddy.jar.asm.Opcodes;
import p052.InterfaceC6542;
import p052.InterfaceC6547;
import p052.InterfaceC6550;

/* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7747 implements InterfaceC6547 {
    @Override // p052.InterfaceC6547
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C7745 c7745 = (C7745) obj4;
        InterfaceC6550 interfaceC6550 = (InterfaceC6550) obj5;
        InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj6;
        InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        int i2 = iIntValue & 6;
        C2125 c2125 = C2125.f6275;
        if (i2 == 0) {
            i = (((C1324) interfaceC1373).m2350(c2125) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ((C1324) interfaceC1373).m2350(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ((C1324) interfaceC1373).m2369(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((C1324) interfaceC1373).m2350(c7745) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ((C1324) interfaceC1373).m2368(interfaceC6550) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ((C1324) interfaceC1373).m2368(interfaceC6542) ? 131072 : 65536;
        }
        C1324 c1324 = (C1324) interfaceC1373;
        if (c1324.m2333(i & 1, (599187 & i) != 599186)) {
            AbstractC7748.m13078(str, zBooleanValue, c7745, c2125, interfaceC6550, interfaceC6542, c1324, (i & Opcodes.ASM7) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            c1324.m2329();
        }
        return C5175.f14739;
    }
}
