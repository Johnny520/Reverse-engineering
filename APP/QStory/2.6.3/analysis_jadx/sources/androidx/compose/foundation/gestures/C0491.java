package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C0345;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0491 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f1469;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Serializable f1470;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1471;

    public /* synthetic */ C0491(Serializable serializable, long j, int i) {
        this.f1471 = i;
        this.f1470 = serializable;
        this.f1469 = j;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        switch (this.f1471) {
            case 0:
                return TransformableStateKt$animateBy$4.invokeSuspend$lambda$0((Ref$ObjectRef) this.f1470, null, this.f1469, (C0345) obj);
            default:
                return TransformableStateKt$animatePanBy$3.invokeSuspend$lambda$0((Ref$LongRef) this.f1470, null, this.f1469, (C0345) obj);
        }
    }
}
