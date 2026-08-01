package androidx.window.embedding;

import androidx.core.util.InterfaceC3021;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.window.embedding.OverlayController$overlayInfo$1", m556f = "OverlayController.kt", m557l = {136}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/window/embedding/飘花落叶言子楪世兰哲苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class OverlayController$overlayInfo$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $overlayTag;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC3406 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayController$overlayInfo$1(AbstractC3406 abstractC3406, String str, InterfaceC5189<? super OverlayController$overlayInfo$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$overlayTag = str;
    }

    private static final C6008 invokeSuspend$lambda$1(AbstractC3406 abstractC3406, InterfaceC3021 interfaceC3021) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        OverlayController$overlayInfo$1 overlayController$overlayInfo$1 = new OverlayController$overlayInfo$1(null, this.$overlayTag, interfaceC5189);
        overlayController$overlayInfo$1.L$0 = obj;
        return overlayController$overlayInfo$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((OverlayController$overlayInfo$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
