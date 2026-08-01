package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0345;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.C2033;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6013 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16432;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16433;

    public /* synthetic */ C6013(Object obj, int i) {
        this.f16433 = i;
        this.f16432 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f16433;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f16432;
        switch (i) {
            case 0:
                break;
            case 1:
                C2033 c2033 = (C2033) obj;
                c2033.getClass();
                ((InterfaceC1395) obj2).setValue(Integer.valueOf((int) (c2033.f5988 & 4294967295L)));
                break;
            default:
                C0345 c0345 = (C0345) obj;
                c0345.getClass();
                ((C6028) obj2).m11334(((Number) ((AbstractC1347) c0345.f1183).getValue()).floatValue());
                break;
        }
        return c5175;
    }
}
