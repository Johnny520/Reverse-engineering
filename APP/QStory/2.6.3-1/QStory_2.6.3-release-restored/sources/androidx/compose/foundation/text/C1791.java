package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.InterfaceC2168;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1791 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3062;

    public /* synthetic */ C1791(Object obj, int i) {
        this.f3062 = i;
        this.f3061 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f3062;
        Object obj = this.f3061;
        switch (i) {
            case 0:
                return Boolean.valueOf(CoreTextFieldKt$CoreTextField$5$1.invokeSuspend$lambda$0((InterfaceC2168) obj));
            case 1:
                return ((C1781) obj).m2425();
            default:
                return new C1836((Orientation) obj, 0.0f);
        }
    }
}
