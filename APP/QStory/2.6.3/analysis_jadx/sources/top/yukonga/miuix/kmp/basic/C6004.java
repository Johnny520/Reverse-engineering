package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.C1358;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6004 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16388;

    public /* synthetic */ C6004(int i) {
        this.f16388 = i;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        switch (this.f16388) {
            case 0:
                return Double.valueOf(null.m11380());
            case 1:
                return NavigationBarDisplayMode.IconAndText;
            case 2:
                return FloatingNavigationBarDisplayMode.IconOnly;
            case 3:
                return NavigationRailDisplayMode.IconAndText;
            case 4:
                C1358 c1358 = AbstractC6018.f16440;
                return null;
            case 5:
                return Boolean.TRUE;
            default:
                return new C6034(-3.4028235E38f, 0.0f, 0.0f);
        }
    }
}
