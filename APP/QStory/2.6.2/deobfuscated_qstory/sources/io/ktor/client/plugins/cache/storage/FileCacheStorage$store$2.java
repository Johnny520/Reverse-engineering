package io.ktor.client.plugins.cache.storage;

import java.util.ArrayList;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p236.C8092;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", l = {72, 73}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class FileCacheStorage$store$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC3889 $data;
    final /* synthetic */ C8092 $url;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC3887 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$store$2(AbstractC3887 abstractC3887, C8092 c8092, AbstractC3889 abstractC3889, InterfaceC4356<? super FileCacheStorage$store$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$url = c8092;
        this.$data = abstractC3889;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new FileCacheStorage$store$2(null, this.$url, this.$data, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FileCacheStorage$store$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        AbstractC3889 abstractC3889 = this.$data;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            ((AbstractC3889) obj2).getClass();
            abstractC3889.getClass();
            if (!AbstractC4394.m8917(null, null)) {
                arrayList.add(obj2);
            }
        }
        AbstractC4343.m8821(arrayList, this.$data);
        this.L$0 = null;
        this.label = 2;
        throw null;
    }
}
