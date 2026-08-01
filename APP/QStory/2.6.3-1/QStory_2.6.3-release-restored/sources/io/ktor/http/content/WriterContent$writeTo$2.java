package io.ktor.http.content;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.jvm.javaio.C5055;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.http.content.WriterContent$writeTo$2", m556f = "WriterContent.kt", m557l = {26}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
final class WriterContent$writeTo$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC5079 $channel;
    final /* synthetic */ Charset $charset;
    Object L$0;
    int label;
    final /* synthetic */ C4817 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriterContent$writeTo$2(InterfaceC5079 interfaceC5079, Charset charset, C4817 c4817, InterfaceC5189<? super WriterContent$writeTo$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.$channel = interfaceC5079;
        this.$charset = charset;
        this.this$0 = c4817;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new WriterContent$writeTo$2(this.$channel, this.$charset, this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WriterContent$writeTo$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                AbstractC3738.m6868(closeable, null);
                return C6008.f15084;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3738.m6868(closeable, th);
                    throw th2;
                }
            }
        }
        AbstractC6017.m10769(obj);
        InterfaceC5079 interfaceC5079 = this.$channel;
        Charset charset = this.$charset;
        interfaceC5079.getClass();
        charset.getClass();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C5055(interfaceC5079), charset);
        try {
            InterfaceC7383 interfaceC7383 = this.this$0.f12584;
            this.L$0 = outputStreamWriter;
            this.label = 1;
            if (interfaceC7383.invoke(outputStreamWriter, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = outputStreamWriter;
            AbstractC3738.m6868(closeable, null);
            return C6008.f15084;
        } catch (Throwable th3) {
            th = th3;
            closeable = outputStreamWriter;
            throw th;
        }
    }
}
