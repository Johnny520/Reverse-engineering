package okio.internal;

import com.alibaba.fastjson2.C3775;
import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.C5183;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5957;
import p020.AbstractC6935;
import p020.AbstractC6944;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "okio.internal.-FileSystem$commonListRecursively$1", m556f = "FileSystem.kt", m557l = {96}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲兰世苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FileSystem$commonListRecursively$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC6935 $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ AbstractC6944 $this_commonListRecursively;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(AbstractC6935 abstractC6935, AbstractC6944 abstractC6944, boolean z, InterfaceC5189<? super FileSystem$commonListRecursively$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$followSymlinks = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new FileSystem$commonListRecursively$1(null, null, this.$followSymlinks, interfaceC5189);
        fileSystem$commonListRecursively$1.L$0 = obj;
        return fileSystem$commonListRecursively$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FileSystem$commonListRecursively$1) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC5957 abstractC5957 = (AbstractC5957) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            new C5183().addLast(null);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$3 != null) {
            C3775.m6954();
            return null;
        }
        Iterator it = (Iterator) this.L$2;
        C5183 c5183 = (C5183) this.L$1;
        AbstractC6017.m10769(obj);
        while (it.hasNext()) {
            if (it.next() != null) {
                C3775.m6954();
                return null;
            }
            boolean z = this.$followSymlinks;
            this.L$0 = abstractC5957;
            this.L$1 = c5183;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 1;
            if (AbstractC6401.m11496(abstractC5957, c5183, z, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }
}
