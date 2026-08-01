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
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$2$1;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6005 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16390;

    public /* synthetic */ C6005(Object obj, int i) {
        this.f16390 = i;
        this.f16389 = obj;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16390;
        Object obj3 = this.f16389;
        switch (i) {
            case 0:
                return ScrollBarKt$ScrollBar$2$1.AnonymousClass1.invokeSuspend$lambda$0((InterfaceC1397) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return ScrollBarKt$ScrollBar$3$1$2$1.invokeSuspend$lambda$0((InterfaceC1397) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 2:
                return ScrollBarKt$ScrollBar$6$1$1.invokeSuspend$lambda$0((InterfaceC1397) obj3, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                InterfaceC6551 interfaceC6551 = (InterfaceC6551) obj3;
                InterfaceC1373 interfaceC1373 = (InterfaceC1373) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C1324 c1324 = (C1324) interfaceC1373;
                if (c1324.m2343(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C0660 c0660M1460 = AbstractC0658.m1460(AbstractC0628.f1765, C2119.f6261, c1324, 54);
                    int iHashCode = Long.hashCode(c1324.f3837);
                    C1253 c1253M2381 = c1324.m2381();
                    InterfaceC2129 interfaceC2129M3861 = AbstractC2120.m3861(c1324, C2125.f6276);
                    InterfaceC1784.f5222.getClass();
                    InterfaceC6543 interfaceC6543 = C1765.f5185;
                    c1324.m2396();
                    if (c1324.f3838) {
                        c1324.m2380(interfaceC6543);
                    } else {
                        c1324.m2390();
                    }
                    AbstractC1367.m2472(c1324, c0660M1460, C1765.f5181);
                    AbstractC1367.m2472(c1324, c1253M2381, C1765.f5182);
                    AbstractC1367.m2493(c1324, Integer.valueOf(iHashCode), C1765.f5188);
                    AbstractC1367.m2481(c1324, C1765.f5187);
                    AbstractC1367.m2472(c1324, interfaceC2129M3861, C1765.f5183);
                    interfaceC6551.invoke(C0616.f1719, c1324, 6);
                    c1324.m2377(true);
                } else {
                    c1324.m2339();
                }
                return C5176.f14739;
        }
    }
}
