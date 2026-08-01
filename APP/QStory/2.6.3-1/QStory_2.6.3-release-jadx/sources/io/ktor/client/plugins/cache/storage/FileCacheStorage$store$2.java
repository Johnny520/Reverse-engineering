package io.ktor.client.plugins.cache.storage;

import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p252.C8922;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", m556f = "FileCacheStorage.kt", m557l = {72, 73}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FileCacheStorage$store$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC4722 $data;
    final /* synthetic */ C8922 $url;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$store$2(AbstractC4720 abstractC4720, C8922 c8922, AbstractC4722 abstractC4722, InterfaceC5189<? super FileCacheStorage$store$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$url = c8922;
        this.$data = abstractC4722;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new FileCacheStorage$store$2(null, this.$url, this.$data, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FileCacheStorage$store$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC4722 abstractC4722 = this.$data;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            ((AbstractC4722) obj2).getClass();
            abstractC4722.getClass();
            if (!AbstractC5227.m9466(null, null)) {
                arrayList.add(obj2);
            }
        }
        AbstractC5176.m9353(arrayList, this.$data);
        this.L$0 = null;
        this.label = 2;
        throw null;
    }
}
