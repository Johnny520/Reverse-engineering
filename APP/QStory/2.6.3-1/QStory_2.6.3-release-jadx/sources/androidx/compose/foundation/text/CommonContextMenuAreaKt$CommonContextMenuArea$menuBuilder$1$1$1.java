package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.AbstractC1681;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1", m556f = "CommonContextMenuArea.kt", m557l = {105, 106, 107}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ TextContextMenuItems $item;
    final /* synthetic */ AbstractC1681 $this_contextMenuBuilder;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(TextContextMenuItems textContextMenuItems, AbstractC1681 abstractC1681, InterfaceC5189<? super CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$item = textContextMenuItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(this.$item, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1 || i == 2 || i == 3) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        int i2 = AbstractC1817.f3169[this.$item.ordinal()];
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
        C5043.m9170();
        return null;
    }
}
