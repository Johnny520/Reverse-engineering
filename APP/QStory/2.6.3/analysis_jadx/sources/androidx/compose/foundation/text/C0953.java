package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC1333;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0953 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2717;

    public /* synthetic */ C0953(Object obj, int i) {
        this.f2717 = i;
        this.f2716 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2717;
        Object obj = this.f2716;
        switch (i) {
            case 0:
                return Boolean.valueOf(CoreTextFieldKt$CoreTextField$5$1.invokeSuspend$lambda$0((InterfaceC1333) obj));
            case 1:
                return ((C0943) obj).m1865();
            default:
                return new C0998((Orientation) obj, 0.0f);
        }
    }
}
