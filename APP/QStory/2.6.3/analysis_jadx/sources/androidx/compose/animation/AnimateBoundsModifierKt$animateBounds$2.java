package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6554;
import p205.AbstractC7897;
import p205.AbstractC7907;
import p205.C7898;
import p205.C7906;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;", "animatedSize", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "<unused var>", "invoke-2pbfIzA", "(JJ)J", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnimateBoundsModifierKt$animateBounds$2 extends Lambda implements InterfaceC6554 {
    public static final AnimateBoundsModifierKt$animateBounds$2 INSTANCE = new AnimateBoundsModifierKt$animateBounds$2();

    public AnimateBoundsModifierKt$animateBounds$2() {
        super(2);
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C7898(m889invoke2pbfIzA(((C7906) obj).f21879, ((C7898) obj2).f21865));
    }

    /* JADX INFO: renamed from: invoke-2pbfIzA, reason: not valid java name */
    public final long m889invoke2pbfIzA(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (!((i2 >= 0) & (i >= 0))) {
            AbstractC7907.m13360("width and height must be >= 0");
        }
        return AbstractC7897.m13326(i, i, i2, i2);
    }
}
