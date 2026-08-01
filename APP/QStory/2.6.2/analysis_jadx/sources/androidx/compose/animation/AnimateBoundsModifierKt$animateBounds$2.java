package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6553;
import p205.AbstractC7896;
import p205.AbstractC7906;
import p205.C7897;
import p205.C7905;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言子苏哲世楪兰/飘花落叶言子楪苏兰哲世;", "animatedSize", "L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;", "<unused var>", "invoke-2pbfIzA", "(JJ)J", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AnimateBoundsModifierKt$animateBounds$2 extends Lambda implements InterfaceC6553 {
    public static final AnimateBoundsModifierKt$animateBounds$2 INSTANCE = new AnimateBoundsModifierKt$animateBounds$2();

    public AnimateBoundsModifierKt$animateBounds$2() {
        super(2);
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new C7897(m888invoke2pbfIzA(((C7905) obj).f21882, ((C7897) obj2).f21868));
    }

    /* JADX INFO: renamed from: invoke-2pbfIzA, reason: not valid java name */
    public final long m888invoke2pbfIzA(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (!((i2 >= 0) & (i >= 0))) {
            AbstractC7906.m13332("width and height must be >= 0");
        }
        return AbstractC7896.m13298(i, i, i2, i2);
    }
}
