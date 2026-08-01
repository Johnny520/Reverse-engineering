package io.ktor.http.cio;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5081;
import java.io.EOFException;
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
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartEvent$MultipartPart$release$2", m556f = "Multipart.kt", m557l = {61}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)J"}, m152k = 3, m153mv = {2, 0, 0})
final class MultipartEvent$MultipartPart$release$2 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C4796 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartEvent$MultipartPart$release$2(C4796 c4796, InterfaceC5189<? super MultipartEvent$MultipartPart$release$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4796;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MultipartEvent$MultipartPart$release$2(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super Long> interfaceC5189) {
        return ((MultipartEvent$MultipartPart$release$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
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
        C5081 c5081 = this.this$0.f12543;
        this.label = 1;
        Object objM9240 = AbstractC5076.m9240(c5081, Long.MAX_VALUE, this);
        return objM9240 == coroutineSingletons ? coroutineSingletons : objM9240;
    }
}
