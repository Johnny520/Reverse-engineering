package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1191;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1327 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Ref$FloatRef f1804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ long f1805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1806;

    public /* synthetic */ C1327(Ref$FloatRef ref$FloatRef, long j, int i) {
        this.f1806 = i;
        this.f1804 = ref$FloatRef;
        this.f1805 = j;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f1806) {
            case 0:
                return TransformableStateKt$animateRotateBy$3.invokeSuspend$lambda$0(this.f1804, null, this.f1805, (C1191) obj);
            default:
                return TransformableStateKt$animateZoomBy$4.invokeSuspend$lambda$0(this.f1804, null, this.f1805, (C1191) obj);
        }
    }
}
