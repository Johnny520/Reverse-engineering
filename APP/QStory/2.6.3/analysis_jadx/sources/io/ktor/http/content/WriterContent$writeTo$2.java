package io.ktor.http.content;

import com.alibaba.fastjson2.AbstractC2905;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.jvm.javaio.C4223;
import java.io.Closeable;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.http.content.WriterContent$writeTo$2", f = "WriterContent.kt", l = {26}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class WriterContent$writeTo$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC4247 $channel;
    final /* synthetic */ Charset $charset;
    Object L$0;
    int label;
    final /* synthetic */ C3985 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriterContent$writeTo$2(InterfaceC4247 interfaceC4247, Charset charset, C3985 c3985, InterfaceC4357<? super WriterContent$writeTo$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.$channel = interfaceC4247;
        this.$charset = charset;
        this.this$0 = c3985;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new WriterContent$writeTo$2(this.$channel, this.$charset, this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WriterContent$writeTo$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC5185.m10210(obj);
                AbstractC2905.m6308(closeable, null);
                return C5176.f14739;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2905.m6308(closeable, th);
                    throw th2;
                }
            }
        }
        AbstractC5185.m10210(obj);
        InterfaceC4247 interfaceC4247 = this.$channel;
        Charset charset = this.$charset;
        interfaceC4247.getClass();
        charset.getClass();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C4223(interfaceC4247), charset);
        try {
            InterfaceC6554 interfaceC6554 = this.this$0.f12239;
            this.L$0 = outputStreamWriter;
            this.label = 1;
            if (interfaceC6554.invoke(outputStreamWriter, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            closeable = outputStreamWriter;
            AbstractC2905.m6308(closeable, null);
            return C5176.f14739;
        } catch (Throwable th3) {
            th = th3;
            closeable = outputStreamWriter;
            throw th;
        }
    }
}
