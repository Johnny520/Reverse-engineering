package top.yukonga.miuix.kmp.utils;

import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2586;
import com.alibaba.fastjson2.C3775;
import kotlin.C6008;
import p068.InterfaceC7372;
import top.yukonga.miuix.kmp.basic.AbstractC6848;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6910 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6911 f16976;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16977;

    public /* synthetic */ C6910(C6911 c6911, int i) {
        this.f16977 = i;
        this.f16976 = c6911;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f16977;
        C6911 c6911 = this.f16976;
        switch (i) {
            case 0:
                if (AbstractC2620.m3916(c6911, AbstractC6848.f16785) == null) {
                    return null;
                }
                C3775.m6954();
                return null;
            case 1:
                return (C6903) AbstractC2620.m3916(c6911, AbstractC6894.f16928);
            default:
                C2583 c2583M3906 = AbstractC2620.m3906(c6911);
                C2586 c2586 = C2583.f5434;
                c2583M3906.m3785(false);
                return C6008.f15084;
        }
    }
}
