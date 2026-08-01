package androidx.compose.foundation.layout;

import androidx.compose.animation.core.C0331;
import androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$fling$3;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0621 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1730;

    public /* synthetic */ C0621(int i) {
        this.f1730 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f1730) {
            case 0:
                return WindowInsetsNestedScrollConnection$fling$3.AnonymousClass1.invokeSuspend$lambda$0(null, (C0331) obj);
            case 1:
                return ((C0625) obj).f1740;
            default:
                return ((C0625) obj).f1741;
        }
    }
}
