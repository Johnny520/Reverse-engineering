package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.runtime.AbstractC1347;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C5190;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$showTextContextMenu$2", f = "BasicTextContextMenuProvider.kt", l = {130}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
final class BasicTextContextMenuProvider$showTextContextMenu$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ C0831 $localSession;
    int label;
    final /* synthetic */ C0830 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextContextMenuProvider$showTextContextMenu$2(C0830 c0830, C0831 c0831, InterfaceC4357<? super BasicTextContextMenuProvider$showTextContextMenu$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.this$0 = c0830;
        this.$localSession = c0831;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new BasicTextContextMenuProvider$showTextContextMenu$2(this.this$0, this.$localSession, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((BasicTextContextMenuProvider$showTextContextMenu$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.compose.runtime.飘花落叶言子哲苏兰世楪] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0830 c0830 = this.this$0;
                ((AbstractC1347) c0830.f2360).setValue(this.$localSession);
                C0831 c0831 = this.$localSession;
                this.label = 1;
                C5190 c5190 = c0831.f2363;
                c5190.getClass();
                Object objM10222 = C5190.m10222(c5190, this);
                if (objM10222 != coroutineSingletons) {
                    objM10222 = c5176;
                }
                if (objM10222 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return c5176;
        } finally {
            ((AbstractC1347) this.this$0.f2360).setValue(null);
        }
    }
}
