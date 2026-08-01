package androidx.compose.foundation.gestures;

import androidx.compose.runtime.InterfaceC1395;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0510 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1511;

    public /* synthetic */ C0510(Object obj, int i) {
        this.f1511 = i;
        this.f1510 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f1511;
        Object obj2 = this.f1510;
        switch (i) {
            case 0:
                return Scrollable2DNode$drag$2$1.invokeSuspend$lambda$0((InterfaceC0557) obj2, (C0480) obj);
            case 1:
                ((InterfaceC6543) obj2).invoke();
                return C5176.f14739;
            case 2:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((InterfaceC6558) ((InterfaceC1395) obj2).getValue()).invoke(f)).floatValue());
            default:
                C0502 c0502 = (C0502) obj2;
                return new C7329(c0502.m1265(c0502.f1496, ((C7329) obj).f19541, c0502.f1499));
        }
    }
}
