package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0345;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0486 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1458;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f1459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1460;

    public /* synthetic */ C0486(Ref$FloatRef ref$FloatRef, long j, int i) {
        this.f1460 = i;
        this.f1458 = ref$FloatRef;
        this.f1459 = j;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        switch (this.f1460) {
            case 0:
                return TransformableStateKt$animateRotateBy$3.invokeSuspend$lambda$0(this.f1458, null, this.f1459, (C0345) obj);
            default:
                return TransformableStateKt$animateZoomBy$4.invokeSuspend$lambda$0(this.f1458, null, this.f1459, (C0345) obj);
        }
    }
}
