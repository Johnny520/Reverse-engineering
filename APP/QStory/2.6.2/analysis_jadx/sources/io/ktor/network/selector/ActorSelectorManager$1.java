package io.ktor.network.selector;

import com.bumptech.glide.AbstractC3065;
import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.spi.AbstractSelector;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.selector.ActorSelectorManager$1", f = "ActorSelectorManager.kt", l = {42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ActorSelectorManager$1 extends SuspendLambda implements InterfaceC6553 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C4002 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActorSelectorManager$1(C4002 c4002, InterfaceC4356<? super ActorSelectorManager$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4002;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ActorSelectorManager$1(this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ActorSelectorManager$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
        C4002 c4002;
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
                AbstractC5184.m10206(obj);
                AbstractSelector abstractSelectorOpenSelector = this.this$0.f12256.openSelector();
                if (abstractSelectorOpenSelector == null) {
                    C5919.m11250("openSelector() = null");
                    return null;
                }
                this.this$0.selectorRef = abstractSelectorOpenSelector;
                c4002 = this.this$0;
                try {
                    C3998 c3998 = c4002.f12252;
                    this.L$0 = abstractSelectorOpenSelector;
                    this.L$1 = c4002;
                    this.L$2 = abstractSelectorOpenSelector;
                    this.label = 1;
                    if (C4002.m8406(c4002, c3998, abstractSelectorOpenSelector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    AbstractSelector abstractSelector4 = abstractSelectorOpenSelector;
                    abstractSelector2 = abstractSelector4;
                    r52 = abstractSelector4;
                    c4002.closed = true;
                    c4002.f12252.m8396();
                    abstractSelector3 = abstractSelector2;
                    r5 = r52;
                } catch (Throwable th2) {
                    abstractSelector = abstractSelectorOpenSelector;
                    th = th2;
                    this = abstractSelector;
                    c4002.closed = true;
                    c4002.f12252.m8396();
                    C4002.m8408(abstractSelector, th);
                    c4002.closed = true;
                    c4002.f12252.m8396();
                    abstractSelector3 = abstractSelector;
                    r5 = this;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                abstractSelector = (AbstractSelector) this.L$2;
                c4002 = (C4002) this.L$1;
                this = (Closeable) this.L$0;
                try {
                    AbstractC5184.m10206(obj);
                    abstractSelector2 = abstractSelector;
                    r52 = this;
                    c4002.closed = true;
                    c4002.f12252.m8396();
                    abstractSelector3 = abstractSelector2;
                    r5 = r52;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        c4002.closed = true;
                        c4002.f12252.m8396();
                        C4002.m8408(abstractSelector, th);
                        c4002.closed = true;
                        c4002.f12252.m8396();
                        abstractSelector3 = abstractSelector;
                        r5 = this;
                    } catch (Throwable th4) {
                        c4002.closed = true;
                        c4002.f12252.m8396();
                        c4002.selectorRef = null;
                        C4002.m8408(abstractSelector, null);
                        throw th4;
                    }
                }
            }
            c4002.selectorRef = null;
            C4002.m8408(abstractSelector3, null);
            while (true) {
                InterfaceC4007 interfaceC4007 = (InterfaceC4007) c4002.f12252.m8394();
                if (interfaceC4007 == null) {
                    AbstractC3065.m6841(r5, null);
                    return C5175.f14739;
                }
                C4002.m8407(interfaceC4007, new ClosedSendChannelException("Failed to apply interest: selector closed"));
            }
        } finally {
        }
    }
}
