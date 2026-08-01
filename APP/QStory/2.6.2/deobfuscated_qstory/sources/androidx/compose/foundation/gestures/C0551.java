package androidx.compose.foundation.gestures;

import java.io.Serializable;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6553;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0551 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Serializable f1585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1587;

    public /* synthetic */ C0551(Serializable serializable, Object obj, int i) {
        this.f1587 = i;
        this.f1585 = serializable;
        this.f1586 = obj;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1587) {
            case 0:
                return ScrollExtensionsKt$animateScrollBy$2.invokeSuspend$lambda$0((Ref$FloatRef) this.f1585, (InterfaceC0507) this.f1586, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            default:
                return Scrollable2DKt$semanticsScrollBy$2.invokeSuspend$lambda$0((Ref$LongRef) this.f1585, (InterfaceC0557) this.f1586, (C7328) obj, (C7328) obj2);
        }
    }
}
