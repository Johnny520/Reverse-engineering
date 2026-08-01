package top.yukonga.miuix.kmp.basic;

import androidx.compose.ui.semantics.AbstractC1946;
import androidx.compose.ui.semantics.InterfaceC1944;
import java.util.List;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6023 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16451;

    public /* synthetic */ C6023(int i) {
        this.f16451 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f16451;
        C5175 c5175 = C5175.f14739;
        switch (i) {
            case 0:
                InterfaceC1944 interfaceC1944 = (InterfaceC1944) obj;
                interfaceC1944.getClass();
                AbstractC1946.m3633(interfaceC1944);
                return c5175;
            case 1:
                InterfaceC1944 interfaceC19442 = (InterfaceC1944) obj;
                interfaceC19442.getClass();
                AbstractC1946.m3633(interfaceC19442);
                return c5175;
            case 2:
                return c5175;
            default:
                List list = (List) obj;
                list.getClass();
                return new C6028(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }
}
