package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.AbstractC0843;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1", f = "CommonContextMenuArea.kt", l = {105, 106, 107}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ TextContextMenuItems $item;
    final /* synthetic */ AbstractC0843 $this_contextMenuBuilder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(TextContextMenuItems textContextMenuItems, AbstractC0843 abstractC0843, InterfaceC4356<? super CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$item = textContextMenuItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(this.$item, null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1 || i == 2 || i == 3) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        int i2 = AbstractC0979.f2823[this.$item.ordinal()];
        if (i2 == 1) {
            this.label = 1;
            throw null;
        }
        if (i2 == 2) {
            this.label = 2;
            throw null;
        }
        if (i2 == 3) {
            this.label = 3;
            throw null;
        }
        if (i2 == 4 || i2 == 5) {
            throw null;
        }
        C4210.m8621();
        return null;
    }
}
