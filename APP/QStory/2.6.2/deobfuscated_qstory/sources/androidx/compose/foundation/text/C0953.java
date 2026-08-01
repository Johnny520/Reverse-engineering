package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC1333;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0953 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2715;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2716;

    public /* synthetic */ C0953(Object obj, int i) {
        this.f2716 = i;
        this.f2715 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2716;
        Object obj = this.f2715;
        switch (i) {
            case 0:
                return Boolean.valueOf(CoreTextFieldKt$CoreTextField$5$1.invokeSuspend$lambda$0((InterfaceC1333) obj));
            case 1:
                return ((C0943) obj).m1855();
            default:
                return new C0998((Orientation) obj, 0.0f);
        }
    }
}
