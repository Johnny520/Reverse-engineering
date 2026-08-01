package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1674;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1", m556f = "TextContextMenuGesturesModifier.kt", m557l = {107, 108}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1662 $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ InterfaceC1674 $provider;
    int label;
    final /* synthetic */ C1661 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextContextMenuGestureNode$tryShowContextMenu$1(C1661 c1661, long j, InterfaceC1674 interfaceC1674, C1662 c1662, InterfaceC5189<? super TextContextMenuGestureNode$tryShowContextMenu$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1661;
        this.$localClickOffset = j;
        this.$provider = interfaceC1674;
        this.$dataProvider = c1662;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7.mo2196(r1, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7383 interfaceC7383 = this.this$0.f2682;
            if (interfaceC7383 != null) {
                C8158 c8158 = new C8158(this.$localClickOffset);
                this.label = 1;
                if (interfaceC7383.invoke(c8158, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        InterfaceC1674 interfaceC1674 = this.$provider;
        C1662 c1662 = this.$dataProvider;
        this.label = 2;
    }
}
