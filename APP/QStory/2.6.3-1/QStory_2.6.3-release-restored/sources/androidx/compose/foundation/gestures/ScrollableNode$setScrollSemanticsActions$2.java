package androidx.compose.foundation.gestures;

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
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", m556f = "Scrollable.kt", m557l = {610}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements InterfaceC7383 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C1358 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(C1358 c1358, InterfaceC5189<? super ScrollableNode$setScrollSemanticsActions$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1358;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, interfaceC5189);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((C8158) obj).f19886;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1768invoke3MmeM6k(((C8158) obj).f19886, (InterfaceC5189) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1768invoke3MmeM6k(long j, InterfaceC5189<? super C8158> interfaceC5189) {
        return ((ScrollableNode$setScrollSemanticsActions$2) create(new C8158(j), interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        long j = this.J$0;
        C1343 c1343 = this.this$0.f1868;
        this.label = 1;
        Object objM1819 = AbstractC1339.m1819(c1343, j, this);
        return objM1819 == coroutineSingletons ? coroutineSingletons : objM1819;
    }
}
