package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.C1358;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5998 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16379;

    public /* synthetic */ C5998(int i) {
        this.f16379 = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        switch (this.f16379) {
            case 0:
                return Double.valueOf(null.m11320());
            case 1:
                return NavigationBarDisplayMode.IconAndText;
            case 2:
                return FloatingNavigationBarDisplayMode.IconOnly;
            case 3:
                return NavigationRailDisplayMode.IconAndText;
            case 4:
                C1358 c1358 = AbstractC6012.f16431;
                return null;
            case 5:
                return Boolean.TRUE;
            default:
                return new C6028(-3.4028235E38f, 0.0f, 0.0f);
        }
    }
}
