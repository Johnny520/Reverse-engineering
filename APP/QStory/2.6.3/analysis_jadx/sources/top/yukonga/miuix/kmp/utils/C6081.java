package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import com.alibaba.fastjson2.C2942;
import kotlin.C5176;
import p052.InterfaceC6543;
import top.yukonga.miuix.kmp.basic.AbstractC6018;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6081 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6082 f16631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16632;

    public /* synthetic */ C6081(C6082 c6082, int i) {
        this.f16632 = i;
        this.f16631 = c6082;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f16632;
        C6082 c6082 = this.f16631;
        switch (i) {
            case 0:
                if (AbstractC1785.m3356(c6082, AbstractC6018.f16440) == null) {
                    return null;
                }
                C2942.m6394();
                return null;
            case 1:
                return (C6074) AbstractC1785.m3356(c6082, AbstractC6065.f16583);
            default:
                C1748 c1748M3346 = AbstractC1785.m3346(c6082);
                C1751 c1751 = C1748.f5089;
                c1748M3346.m3225(false);
                return C5176.f14739;
        }
    }
}
