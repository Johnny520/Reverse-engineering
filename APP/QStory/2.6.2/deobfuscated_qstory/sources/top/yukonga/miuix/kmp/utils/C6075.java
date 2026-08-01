package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1751;
import com.alibaba.fastjson2.C2941;
import kotlin.C5175;
import p052.InterfaceC6542;
import top.yukonga.miuix.kmp.basic.AbstractC6012;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6075 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6076 f16622;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16623;

    public /* synthetic */ C6075(C6076 c6076, int i) {
        this.f16623 = i;
        this.f16622 = c6076;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f16623;
        C6076 c6076 = this.f16622;
        switch (i) {
            case 0:
                if (AbstractC1785.m3346(c6076, AbstractC6012.f16431) == null) {
                    return null;
                }
                C2941.m6336();
                return null;
            case 1:
                return (C6068) AbstractC1785.m3346(c6076, AbstractC6059.f16574);
            default:
                C1748 c1748M3336 = AbstractC1785.m3336(c6076);
                C1751 c1751 = C1748.f5088;
                c1748M3336.m3215(false);
                return C5175.f14739;
        }
    }
}
