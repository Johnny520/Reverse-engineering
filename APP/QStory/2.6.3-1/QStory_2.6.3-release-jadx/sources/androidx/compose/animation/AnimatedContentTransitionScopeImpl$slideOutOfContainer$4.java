package androidx.compose.animation;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2168;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;
import p221.C8735;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$4 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7387 $targetOffset;
    final /* synthetic */ C1265 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(C1265 c1265, InterfaceC7387 interfaceC7387) {
        super(1);
        this.this$0 = c1265;
        this.$targetOffset = interfaceC7387;
    }

    public final Integer invoke(int i) {
        C1265 c1265 = this.this$0;
        InterfaceC2168 interfaceC2168 = (InterfaceC2168) c1265.f1713.m1317(((AbstractC2182) c1265.f1716.f1586).getValue());
        long j = interfaceC2168 != null ? ((C8735) interfaceC2168.getValue()).f22224 : 0L;
        long j2 = i;
        return (Integer) this.$targetOffset.invoke(Integer.valueOf((-((int) (C1265.m1678(this.this$0, (j2 & 4294967295L) | (j2 << 32), j) & 4294967295L))) + ((int) (j & 4294967295L))));
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
