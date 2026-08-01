package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C1191;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1332 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f1814;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f1815;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1816;

    public /* synthetic */ C1332(Serializable serializable, long j, int i) {
        this.f1816 = i;
        this.f1815 = serializable;
        this.f1814 = j;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        switch (this.f1816) {
            case 0:
                return TransformableStateKt$animateBy$4.invokeSuspend$lambda$0((Ref$ObjectRef) this.f1815, null, this.f1814, (C1191) obj);
            default:
                return TransformableStateKt$animatePanBy$3.invokeSuspend$lambda$0((Ref$LongRef) this.f1815, null, this.f1814, (C1191) obj);
        }
    }
}
