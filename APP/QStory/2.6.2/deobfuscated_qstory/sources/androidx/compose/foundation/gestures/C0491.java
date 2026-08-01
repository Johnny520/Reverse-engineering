package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0345;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0491 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f1468;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f1469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1470;

    public /* synthetic */ C0491(Serializable serializable, long j, int i) {
        this.f1470 = i;
        this.f1469 = serializable;
        this.f1468 = j;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f1470) {
            case 0:
                return TransformableStateKt$animateBy$4.invokeSuspend$lambda$0((Ref$ObjectRef) this.f1469, null, this.f1468, (C0345) obj);
            default:
                return TransformableStateKt$animatePanBy$3.invokeSuspend$lambda$0((Ref$LongRef) this.f1469, null, this.f1468, (C0345) obj);
        }
    }
}
