package io.ktor.http.content;

import com.bumptech.glide.AbstractC3065;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.jvm.javaio.C4222;
import java.io.Closeable;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.http.content.OutputStreamContent$writeTo$2", f = "OutputStreamContent.kt", l = {28}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
final class OutputStreamContent$writeTo$2 extends SuspendLambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC4246 $channel;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC3985 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputStreamContent$writeTo$2(InterfaceC4246 interfaceC4246, AbstractC3985 abstractC3985, InterfaceC4356<? super OutputStreamContent$writeTo$2> interfaceC4356) {
        super(1, interfaceC4356);
        this.$channel = interfaceC4246;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new OutputStreamContent$writeTo$2(this.$channel, null, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((OutputStreamContent$writeTo$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Closeable closeable;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4246 interfaceC4246 = this.$channel;
            interfaceC4246.getClass();
            C4222 c4222 = new C4222(interfaceC4246);
            try {
                throw null;
            } catch (Throwable th2) {
                th = th2;
                closeable = c4222;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            closeable = (Closeable) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                AbstractC3065.m6841(closeable, null);
                return C5175.f14739;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            throw th;
        } catch (Throwable th4) {
            AbstractC3065.m6841(closeable, th);
            throw th4;
        }
    }
}
