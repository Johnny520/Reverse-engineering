package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$4 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC6558 $initialOffset;
    final /* synthetic */ C0419 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideIntoContainer$4(InterfaceC6558 interfaceC6558, C0419 c0419) {
        super(1);
        this.$initialOffset = interfaceC6558;
        this.this$0 = c0419;
    }

    public final Integer invoke(int i) {
        InterfaceC6558 interfaceC6558 = this.$initialOffset;
        C0419 c0419 = this.this$0;
        long j = i;
        return (Integer) interfaceC6558.invoke(Integer.valueOf((-((int) (C0419.m1118(c0419, (j & 4294967295L) | (j << 32), C0419.m1117(c0419)) & 4294967295L))) - i));
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
