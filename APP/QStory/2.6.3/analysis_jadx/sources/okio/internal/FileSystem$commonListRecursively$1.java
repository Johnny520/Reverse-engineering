package okio.internal;

import com.alibaba.fastjson2.C2942;
import java.util.Iterator;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.C4351;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p004.AbstractC6106;
import p004.AbstractC6115;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰世苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 2, 0})
final class FileSystem$commonListRecursively$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC6106 $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ AbstractC6115 $this_commonListRecursively;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(AbstractC6106 abstractC6106, AbstractC6115 abstractC6115, boolean z, InterfaceC4357<? super FileSystem$commonListRecursively$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$followSymlinks = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new FileSystem$commonListRecursively$1(null, null, this.$followSymlinks, interfaceC4357);
        fileSystem$commonListRecursively$1.L$0 = obj;
        return fileSystem$commonListRecursively$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FileSystem$commonListRecursively$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC5125 abstractC5125 = (AbstractC5125) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            new C4351().addLast(null);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$3 != null) {
            C2942.m6394();
            return null;
        }
        Iterator it = (Iterator) this.L$2;
        C4351 c4351 = (C4351) this.L$1;
        AbstractC5185.m10210(obj);
        while (it.hasNext()) {
            if (it.next() != null) {
                C2942.m6394();
                return null;
            }
            boolean z = this.$followSymlinks;
            this.L$0 = abstractC5125;
            this.L$1 = c4351;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 1;
            if (AbstractC5571.m10937(abstractC5125, c4351, z, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5176.f14739;
    }
}
