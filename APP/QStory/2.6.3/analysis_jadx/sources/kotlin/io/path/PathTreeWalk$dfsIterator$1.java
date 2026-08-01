package kotlin.io.path;

import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.C4351;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197, Opcodes.MUL_INT_LIT16, Opcodes.ADD_INT_LIT8}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Ljava/nio/file/Path;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 3, 0})
final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ AbstractC4367 this$0;

    public PathTreeWalk$dfsIterator$1(AbstractC4367 abstractC4367, InterfaceC4357<? super PathTreeWalk$dfsIterator$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(null, interfaceC4357);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PathTreeWalk$dfsIterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            new C4351();
            throw null;
        }
        if (i == 1) {
            if (this.L$4 != null) {
                C2942.m6394();
                return null;
            }
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 2) {
            if (this.L$4 != null) {
                C2942.m6394();
                return null;
            }
        } else {
            if (i == 3) {
                if (this.L$7 != null) {
                    C2942.m6394();
                    return null;
                }
                AbstractC5185.m10210(obj);
                throw null;
            }
            if (i != 4) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (this.L$7 != null) {
                C2942.m6394();
                return null;
            }
        }
        C4351 c4351 = (C4351) this.L$1;
        AbstractC5185.m10210(obj);
        if (c4351.isEmpty()) {
            return C5176.f14739;
        }
        ((AbstractC4369) c4351.last()).getClass();
        throw null;
    }
}
