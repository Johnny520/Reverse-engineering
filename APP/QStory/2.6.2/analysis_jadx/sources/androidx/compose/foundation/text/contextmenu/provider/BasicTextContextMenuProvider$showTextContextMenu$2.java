package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.runtime.AbstractC1347;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C5189;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ C0831 $localSession;
    int label;
    final /* synthetic */ C0830 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(C0830 c0830, C0831 c0831, InterfaceC4356<? super BasicTextContextMenuProvider$showTextContextMenu$2> interfaceC4356) {
        super(1, interfaceC4356);
        this.this$0 = c0830;
        this.$localSession = c0831;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.this$0, this.$localSession, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.飘花落叶言子哲苏兰世楪] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0830 c0830 = this.this$0;
                ((AbstractC1347) c0830.f2359).setValue(this.$localSession);
                C0831 c0831 = this.$localSession;
                this.label = 1;
                C5189 c5189 = c0831.f2362;
                c5189.getClass();
                Object objM10218 = C5189.m10218(c5189, this);
                if (objM10218 != coroutineSingletons) {
                    objM10218 = c5175;
                }
                if (objM10218 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return c5175;
        } finally {
            ((AbstractC1347) this.this$0.f2359).setValue(null);
        }
    }
}
