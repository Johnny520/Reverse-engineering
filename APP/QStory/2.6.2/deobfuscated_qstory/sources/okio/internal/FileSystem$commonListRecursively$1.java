package okio.internal;

import com.alibaba.fastjson2.C2941;
import java.util.Iterator;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.C4350;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5124;
import p005.AbstractC6115;
import p005.AbstractC6124;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "L飘花落叶言世兰哲苏楪子/飘花落叶言子楪哲兰世苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 2, 0})
final class FileSystem$commonListRecursively$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC6115 $dir;
    final /* synthetic */ boolean $followSymlinks;
    final /* synthetic */ AbstractC6124 $this_commonListRecursively;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(AbstractC6115 abstractC6115, AbstractC6124 abstractC6124, boolean z, InterfaceC4356<? super FileSystem$commonListRecursively$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$followSymlinks = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FileSystem$commonListRecursively$1 fileSystem$commonListRecursively$1 = new FileSystem$commonListRecursively$1(null, null, this.$followSymlinks, interfaceC4356);
        fileSystem$commonListRecursively$1.L$0 = obj;
        return fileSystem$commonListRecursively$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FileSystem$commonListRecursively$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC5124 abstractC5124 = (AbstractC5124) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            new C4350().addLast(null);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$3 != null) {
            C2941.m6336();
            return null;
        }
        Iterator it = (Iterator) this.L$2;
        C4350 c4350 = (C4350) this.L$1;
        AbstractC5184.m10206(obj);
        while (it.hasNext()) {
            if (it.next() != null) {
                C2941.m6336();
                return null;
            }
            boolean z = this.$followSymlinks;
            this.L$0 = abstractC5124;
            this.L$1 = c4350;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 1;
            if (AbstractC5570.m10880(abstractC5124, c4350, z, false, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C5175.f14739;
    }
}
