package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.layout.AbstractC0628;
import androidx.compose.foundation.layout.AbstractC0658;
import androidx.compose.foundation.layout.C0616;
import androidx.compose.foundation.layout.C0660;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.AbstractC2120;
import androidx.compose.ui.C2119;
import androidx.compose.ui.C2125;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5999 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16381;

    public /* synthetic */ C5999(Object obj, int i) {
        this.f16381 = i;
        this.f16380 = obj;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16381;
        Object obj3 = this.f16380;
        switch (i) {
            case 0:
                return ScrollBarKt$ScrollBar$2$1.AnonymousClass1.invokeSuspend$lambda$0((InterfaceC1397) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return ScrollBarKt$ScrollBar$3$1$2$1.invokeSuspend$lambda$0((InterfaceC1397) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 2:
                return ScrollBarKt$ScrollBar$6$1$1.invokeSuspend$lambda$0((InterfaceC1397) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                InterfaceC6550 interfaceC6550 = (InterfaceC6550) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2333(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0660 c0660M1450 = AbstractC0658.m1450(AbstractC0628.f1764, C2119.f6260, c1324, 54);
                    int iHashCode = Long.hashCode(c1324.f3836);
                    C1253 c1253M2371 = c1324.m2371();
                    InterfaceC2129 interfaceC2129M3851 = AbstractC2120.m3851(c1324, C2125.f6275);
                    InterfaceC1784.f5221.getClass();
                    InterfaceC6542 interfaceC6542 = C1765.f5184;
                    c1324.m2386();
                    if (c1324.f3837) {
                        c1324.m2370(interfaceC6542);
                    } else {
                        c1324.m2380();
                    }
                    AbstractC1367.m2464(c1324, c0660M1450, C1765.f5180);
                    AbstractC1367.m2464(c1324, c1253M2371, C1765.f5181);
                    AbstractC1367.m2483(c1324, Integer.valueOf(iHashCode), C1765.f5187);
                    AbstractC1367.m2472(c1324, C1765.f5186);
                    AbstractC1367.m2464(c1324, interfaceC2129M3851, C1765.f5182);
                    interfaceC6550.invoke(C0616.f1718, c1324, 6);
                    c1324.m2367(true);
                } else {
                    c1324.m2329();
                }
                return C5175.f14739;
        }
    }
}
