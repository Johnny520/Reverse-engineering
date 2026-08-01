package io.ktor.client.plugins.cache.storage;

import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import java.util.Iterator;
import java.util.List;
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
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", m556f = "FileCacheStorage.kt", m557l = {97, 99}, m558m = "invokeSuspend")
public final class FileCacheStorage$writeCache$2$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ List<AbstractC4722> $caches;
    final /* synthetic */ C5081 $channel;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2$1$1$1(C5081 c5081, List<AbstractC4722> list, AbstractC4720 abstractC4720, InterfaceC5189<? super FileCacheStorage$writeCache$2$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = c5081;
        this.$caches = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new FileCacheStorage$writeCache$2$1$1$1(this.$channel, this.$caches, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FileCacheStorage$writeCache$2$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator<AbstractC4722> it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5081 c5081 = this.$channel;
            int size = this.$caches.size();
            this.label = 1;
            if (AbstractC5078.m9247(c5081, size, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$0;
                AbstractC6017.m10769(obj);
                if (it.hasNext()) {
                    this.$channel.m9257();
                    return C6008.f15084;
                }
                it.next();
                this.L$0 = it;
                this.label = 2;
                throw null;
            }
            AbstractC6017.m10769(obj);
        }
        it = this.$caches.iterator();
        if (it.hasNext()) {
        }
    }
}
