package androidx.compose.foundation.gestures;

import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5175;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0510 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1510;

    public /* synthetic */ C0510(Object obj, int i) {
        this.f1510 = i;
        this.f1509 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f1510;
        Object obj2 = this.f1509;
        switch (i) {
            case 0:
                return Scrollable2DNode$drag$2$1.invokeSuspend$lambda$0((InterfaceC0557) obj2, (C0480) obj);
            case 1:
                ((InterfaceC6542) obj2).invoke();
                return C5175.f14739;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((InterfaceC6557) ((InterfaceC1395) obj2).getValue()).invoke(f)).floatValue());
            default:
                C0502 c0502 = (C0502) obj2;
                return new C7328(c0502.m1255(c0502.f1495, ((C7328) obj).f19546, c0502.f1498));
        }
    }
}
