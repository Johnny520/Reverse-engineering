package kotlin.p008io.path;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.C5183;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", m556f = "PathTreeWalk.kt", m557l = {191, 197}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Ljava/nio/file/Path;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ AbstractC5199 this$0;

    public PathTreeWalk$bfsIterator$1(AbstractC5199 abstractC5199, InterfaceC5189<? super PathTreeWalk$bfsIterator$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(null, interfaceC5189);
        pathTreeWalk$bfsIterator$1.L$0 = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PathTreeWalk$bfsIterator$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            new C5183();
            throw null;
        }
        if (i == 1) {
            if (this.L$4 != null) {
                C3775.m6954();
                return null;
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$4 != null) {
            C3775.m6954();
            return null;
        }
        C5183 c5183 = (C5183) this.L$1;
        AbstractC6017.m10769(obj);
        if (c5183.isEmpty()) {
            return C6008.f15084;
        }
        ((AbstractC5201) c5183.removeFirst()).getClass();
        throw null;
    }
}
