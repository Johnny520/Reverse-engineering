package io.ktor.network.selector;

import com.alibaba.fastjson2.AbstractC2905;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.spi.AbstractSelector;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", l = {42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ActorSelectorManager$1 extends SuspendLambda implements InterfaceC6554 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C4003 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActorSelectorManager$1(C4003 c4003, InterfaceC4357<? super ActorSelectorManager$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4003;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ActorSelectorManager$1(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ActorSelectorManager$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.ktor.network.selector.ActorSelectorManager$1, kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        C4003 c4003;
        AbstractSelector abstractSelector;
        Throwable th;
        AbstractSelector abstractSelector2;
        ?? r5;
        AbstractSelector abstractSelector3;
        ?? r52;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                AbstractSelector abstractSelectorOpenSelector = this.this$0.f12260.openSelector();
                if (abstractSelectorOpenSelector == null) {
                    C5925.m11311("openSelector() = null");
                    return null;
                }
                this.this$0.selectorRef = abstractSelectorOpenSelector;
                c4003 = this.this$0;
                try {
                    C3999 c3999 = c4003.f12256;
                    this.L$0 = abstractSelectorOpenSelector;
                    this.L$1 = c4003;
                    this.L$2 = abstractSelectorOpenSelector;
                    this.label = 1;
                    if (C4003.m8396(c4003, c3999, abstractSelectorOpenSelector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    AbstractSelector abstractSelector4 = abstractSelectorOpenSelector;
                    abstractSelector2 = abstractSelector4;
                    r52 = abstractSelector4;
                    c4003.closed = true;
                    c4003.f12256.m8386();
                    abstractSelector3 = abstractSelector2;
                    r5 = r52;
                } catch (Throwable th2) {
                    abstractSelector = abstractSelectorOpenSelector;
                    th = th2;
                    this = abstractSelector;
                    c4003.closed = true;
                    c4003.f12256.m8386();
                    C4003.m8397(abstractSelector, th);
                    c4003.closed = true;
                    c4003.f12256.m8386();
                    abstractSelector3 = abstractSelector;
                    r5 = this;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                abstractSelector = (AbstractSelector) this.L$2;
                c4003 = (C4003) this.L$1;
                this = (Closeable) this.L$0;
                try {
                    AbstractC5185.m10210(obj);
                    abstractSelector2 = abstractSelector;
                    r52 = this;
                    c4003.closed = true;
                    c4003.f12256.m8386();
                    abstractSelector3 = abstractSelector2;
                    r5 = r52;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c4003.closed = true;
                        c4003.f12256.m8386();
                        C4003.m8397(abstractSelector, th);
                        c4003.closed = true;
                        c4003.f12256.m8386();
                        abstractSelector3 = abstractSelector;
                        r5 = this;
                    } catch (Throwable th4) {
                        c4003.closed = true;
                        c4003.f12256.m8386();
                        c4003.selectorRef = null;
                        C4003.m8397(abstractSelector, null);
                        throw th4;
                    }
                }
            }
            c4003.selectorRef = null;
            C4003.m8397(abstractSelector3, null);
            while (true) {
                InterfaceC4008 interfaceC4008 = (InterfaceC4008) c4003.f12256.m8384();
                if (interfaceC4008 == null) {
                    AbstractC2905.m6308(r5, null);
                    return C5176.f14739;
                }
                C4003.m8398(interfaceC4008, new ClosedSendChannelException("Failed to apply interest: selector closed"));
            }
        } finally {
        }
    }
}
