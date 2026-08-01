package kotlin.io.path;

import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.C4350;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5124;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Ljava/nio/file/Path;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
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
    final /* synthetic */ AbstractC4366 this$0;

    public PathTreeWalk$bfsIterator$1(AbstractC4366 abstractC4366, InterfaceC4356<? super PathTreeWalk$bfsIterator$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(null, interfaceC4356);
        pathTreeWalk$bfsIterator$1.L$0 = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PathTreeWalk$bfsIterator$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            new C4350();
            throw null;
        }
        if (i == 1) {
            if (this.L$4 != null) {
                C2941.m6336();
                return null;
            }
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 2) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$4 != null) {
            C2941.m6336();
            return null;
        }
        C4350 c4350 = (C4350) this.L$1;
        AbstractC5184.m10206(obj);
        if (c4350.isEmpty()) {
            return C5175.f14739;
        }
        ((AbstractC4368) c4350.removeFirst()).getClass();
        throw null;
    }
}
