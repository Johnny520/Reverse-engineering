package io.ktor.http.content;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.jvm.javaio.C5055;
import java.io.Closeable;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.http.content.OutputStreamContent$writeTo$2", m556f = "OutputStreamContent.kt", m557l = {28}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
final class OutputStreamContent$writeTo$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC5079 $channel;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC4818 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputStreamContent$writeTo$2(InterfaceC5079 interfaceC5079, AbstractC4818 abstractC4818, InterfaceC5189<? super OutputStreamContent$writeTo$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.$channel = interfaceC5079;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new OutputStreamContent$writeTo$2(this.$channel, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((OutputStreamContent$writeTo$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5079 interfaceC5079 = this.$channel;
            interfaceC5079.getClass();
            C5055 c5055 = new C5055(interfaceC5079);
            try {
                throw null;
            } catch (Throwable th2) {
                th = th2;
                closeable = c5055;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                AbstractC3738.m6868(closeable, null);
                return C6008.f15084;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            throw th;
        } catch (Throwable th4) {
            AbstractC3738.m6868(closeable, th);
            throw th4;
        }
    }
}
