package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.runtime.AbstractC2182;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", m556f = "BasicTextContextMenuProvider.kt", m557l = {130}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 1, 0})
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ C1671 $localSession;
    int label;
    final /* synthetic */ C1670 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(C1670 c1670, C1671 c1671, InterfaceC5189<? super BasicTextContextMenuProvider$showTextContextMenu$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.this$0 = c1670;
        this.$localSession = c1671;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.this$0, this.$localSession, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.飘花落叶言子哲苏兰世楪] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1670 c1670 = this.this$0;
                ((AbstractC2182) c1670.f2705).setValue(this.$localSession);
                C1671 c1671 = this.$localSession;
                this.label = 1;
                C6022 c6022 = c1671.f2708;
                c6022.getClass();
                Object objM10781 = C6022.m10781(c6022, this);
                if (objM10781 != coroutineSingletons) {
                    objM10781 = c6008;
                }
                if (objM10781 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return c6008;
        } finally {
            ((AbstractC2182) this.this$0.f2705).setValue(null);
        }
    }
}
