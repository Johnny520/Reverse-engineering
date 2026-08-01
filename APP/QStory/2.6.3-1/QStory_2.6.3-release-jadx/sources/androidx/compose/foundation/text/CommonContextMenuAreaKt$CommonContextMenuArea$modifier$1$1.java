package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.AbstractC1681;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1", m556f = "CommonContextMenuArea.kt", m557l = {82, 83}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "clickLocation", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC1681 $selectionState;
    /* synthetic */ long J$0;
    int label;

    public CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(AbstractC1681 abstractC1681, InterfaceC5189<? super CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(null, interfaceC5189);
        commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1.J$0 = ((C8158) obj).f19886;
        return commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m2141invoke3MmeM6k(((C8158) obj).f19886, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m2141invoke3MmeM6k(long j, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1) create(new C8158(j), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.J$0 = this.J$0;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 2) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
