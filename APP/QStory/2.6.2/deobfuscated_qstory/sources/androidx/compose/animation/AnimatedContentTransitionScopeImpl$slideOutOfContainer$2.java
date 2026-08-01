package androidx.compose.animation;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1333;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;
import p205.C7905;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$2 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $targetOffset;
    final /* synthetic */ C0419 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(C0419 c0419, InterfaceC6557 interfaceC6557) {
        super(1);
        this.this$0 = c0419;
        this.$targetOffset = interfaceC6557;
    }

    public final Integer invoke(int i) {
        C0419 c0419 = this.this$0;
        InterfaceC1333 interfaceC1333 = (InterfaceC1333) c0419.f1368.m756(((AbstractC1347) c0419.f1371.f1241).getValue());
        long j = interfaceC1333 != null ? ((C7905) interfaceC1333.getValue()).f21882 : 0L;
        long j2 = i;
        return (Integer) this.$targetOffset.invoke(Integer.valueOf((-((int) (C0419.m1117(this.this$0, (j2 & 4294967295L) | (j2 << 32), j) >> 32))) + ((int) (j >> 32))));
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
