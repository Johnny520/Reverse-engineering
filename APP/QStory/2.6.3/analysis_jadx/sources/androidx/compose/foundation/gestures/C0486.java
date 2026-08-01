package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0345;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0486 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1459;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f1460;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1461;

    public /* synthetic */ C0486(Ref$FloatRef ref$FloatRef, long j, int i) {
        this.f1461 = i;
        this.f1459 = ref$FloatRef;
        this.f1460 = j;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f1461) {
            case 0:
                return TransformableStateKt$animateRotateBy$3.invokeSuspend$lambda$0(this.f1459, null, this.f1460, (C0345) obj);
            default:
                return TransformableStateKt$animateZoomBy$4.invokeSuspend$lambda$0(this.f1459, null, this.f1460, (C0345) obj);
        }
    }
}
